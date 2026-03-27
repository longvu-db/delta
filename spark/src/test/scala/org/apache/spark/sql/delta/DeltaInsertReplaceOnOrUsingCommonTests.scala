/*
 * Copyright (2021) The Delta Lake Project Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.sql.delta

import java.util.regex.Pattern

import scala.collection.mutable
import scala.reflect.ClassTag
import scala.util.control.NonFatal

import com.databricks.spark.util.{Log4jUsageLogger, MetricDefinitions, UsageRecord}
import com.databricks.sql.logging.SQLUsageLogging
import org.apache.spark.sql.delta.DeltaTestUtils.BOOLEAN_DOMAIN
import org.apache.spark.sql.delta.actions.{AddFile, RemoveFile}
import org.apache.spark.sql.delta.commands.{InsertReplaceOnOrUsingMaterializeSourceError, InsertReplaceOnOrUsingStats}
import org.apache.spark.sql.delta.commands.cdc.CDCReader
import org.apache.spark.sql.delta.commands.merge.{MergeIntoMaterializeSourceError, MergeIntoMaterializeSourceErrorType, MergeIntoMaterializeSourceReason}
import org.apache.spark.sql.delta.sources.DeltaSQLConf
import org.apache.spark.sql.delta.util.JsonUtils
import org.apache.spark.sql.util.QueryTag

import org.apache.spark.{SparkException, SparkNumberFormatException}
import org.apache.spark.sql.{AnalysisException, QueryTest, Row}
import org.apache.spark.sql.catalyst.TableIdentifier
import org.apache.spark.sql.functions.{lit, rand, udf}
import org.apache.spark.sql.internal.SQLConf
import org.apache.spark.sql.test.SharedSparkSession
import org.apache.spark.sql.types.{IntegerType, StringType}
import org.apache.spark.storage.StorageLevel
import org.apache.spark.util.Utils

trait DeltaInsertReplaceOnOrUsingTestUtils
  extends QueryTest
  with SharedSparkSession {

  protected def createTable(
     tableName: String,
     tableCols: Seq[String],
     partCols: Seq[String] = Seq.empty,
     clusterCols: Seq[String] = Seq.empty): Unit = {
    assert(partCols.isEmpty || clusterCols.isEmpty,
      "Cannot specify both partitioning and clustering for a table.")
    sql(
      s"""
         |CREATE TABLE $tableName ${tableCols.mkString("(", ",", ")")}
         |USING delta
         |${if (partCols.nonEmpty) s"PARTITIONED BY ${partCols.mkString("(", ",", ")")}" else ""}
         |${if (clusterCols.nonEmpty) s"CLUSTER BY ${clusterCols.mkString("(", ",", ")")}" else ""}
         |""".stripMargin)
  }

  protected def insertValues(tableName: String, rows: Seq[String]): Unit = {
    sql(
      s"""
         |INSERT INTO $tableName
         |VALUES ${rows.mkString(", ")}
         |""".stripMargin)
  }

  protected def executeInsertReplaceOn(
      tableName: String,
      matchingCond: String,
      sourceQuery: String,
      byName: Boolean = false): Unit = {
    val byNameClause = if (byName) "BY NAME" else ""
    sql(
      s"""
         |INSERT INTO $tableName $byNameClause
         |REPLACE ON $matchingCond
         |$sourceQuery
         |""".stripMargin)
  }

  protected def verifyUsageLogWhenExceptionOccurs(
      stats: InsertReplaceOnOrUsingStats,
      expectedReplaceCriteria: String,
      expectedExCondition: String,
      expectedExParams: String,
      expectedIsDeleteInsertParallelizedOpt: Option[Boolean] = None): Unit = {
    assert(stats.materializeSourceReason.isDefined)
    assert(stats.materializeSourceAttempts.isEmpty)
    assert(stats.materializeSourceTimeMs > 0)
    assert(stats.isDeleteInsertParallelized === expectedIsDeleteInsertParallelizedOpt)
    assert(stats.deleteStepTimeMs === 0)
    assert(stats.insertStepTimeMs === 0)
    assert(stats.replaceCriteria === expectedReplaceCriteria)
    assert(stats.numFiles.isEmpty)
    assert(stats.numOutputRows.isEmpty)
    assert(stats.numCopiedRows.isEmpty)
    assert(stats.numAddedChangeFiles.isEmpty)
    assert(stats.numDeletedRows.isEmpty)
    assert(stats.numOutputBytes.isEmpty)
    assert(stats.numRemovedBytes.isEmpty)
    assert(stats.numRemovedFiles.isEmpty)
    assert(stats.exceptionMsg.get.contains(expectedExCondition) &&
      stats.exceptionMsg.get.contains(expectedExParams))
  }

  protected def getInsertReplaceOnOrUsingStats(
      events: Seq[UsageRecord]): InsertReplaceOnOrUsingStats = {
    val insertReplaceOnOrUsingStats = events.filter { e =>
      e.metric == MetricDefinitions.EVENT_TAHOE.name &&
        e.tags.get("opType").contains("delta.insertReplaceOnOrUsing.stats")
    }
    assert(insertReplaceOnOrUsingStats.size === 1)
    val stats = JsonUtils.fromJson[InsertReplaceOnOrUsingStats](
      insertReplaceOnOrUsingStats.head.blob)
    stats
  }

  protected def getLastCommitNumAddedAndRemovedBytes(deltaLog: DeltaLog): (Long, Long) = {
    val changes = deltaLog.getChanges(deltaLog.update().version).flatMap(_._2).toSeq
    val addedBytes = changes.collect { case a: AddFile => a.size }.sum
    val removedBytes = changes.collect { case r: RemoveFile => r.getFileSize }.sum

    (addedBytes, removedBytes)
  }

  object DataLayoutType extends Enumeration {
    type DataLayoutType = Value
    val PARTITIONED, CLUSTERED, NORMAL = Value
  }

  // TODO(LC-9059): All the materialization logic that has the word "Merge" should be
  // refactored to something more general when we fully refactor the materialization source
  // framework.
  protected def replaceOnOrUsingSourceMaterializationReason(events: Seq[UsageRecord]): String = {
    val stats = getInsertReplaceOnOrUsingStats(events)
    assert(stats.materializeSourceReason.isDefined)
    stats.materializeSourceReason.get
  }

  protected def getTahoeEvents(events: Seq[UsageRecord], opType: String): Seq[UsageRecord] = {
    events.filter { e =>
      e.metric == MetricDefinitions.EVENT_TAHOE.name &&
        e.tags.get("opType").contains(opType)
    }
  }
}

trait DeltaInsertReplaceOnOrUsingCommonTests extends DeltaInsertReplaceOnOrUsingTestUtils {

  import testImplicits._

  protected def executeInsertAtomicReplace(
     tableName: String,
     matchingCols: Seq[String],
     sourceQuery: String,
     byName: Boolean = false,
     withSchemaEvolution: Boolean = false): Unit

  /**
   * The expected error parameter value for the replace criteria given a set of matching columns.
   * This is the matching condition for REPLACE ON or a list of column names for REPLACE USING.
   */
  protected def expectedReplaceCriteriaValue(matchingCols: Seq[String]): String

  for (colDataType <- Seq(IntegerType, StringType)) {
    test(s"Basic INSERT REPLACE ON/USING with a non-partitioned and non-clustered table, " +
        s"$colDataType column") {
      withTable("target", "source") {
        createTable(
          tableName = "target",
          tableCols = Seq(s"col1 ${colDataType.sql}", "row_origin string"))
        insertValues("target", rows = Seq(
          s"(cast(1 as ${colDataType.typeName}), 'target1')",
          s"(cast(1 as ${colDataType.typeName}), 'target2')",
          s"(cast(3 as ${colDataType.typeName}), 'target')"))

        createTable(
          tableName = "source",
          tableCols = Seq(s"col1 ${colDataType.sql}", "row_origin string"))
        insertValues("source", rows = Seq(
          "(null, 'source1')",
          "(null, 'source2')",
          s"(cast(1 as ${colDataType.typeName}), 'source')",
          s"(cast(2 as ${colDataType.typeName}), 'source1')",
          s"(cast(2 as ${colDataType.typeName}), 'source2')",
          s"(cast(2 as ${colDataType.typeName}), 'source3')"))

        executeInsertAtomicReplace(
          tableName = "target AS t",
          matchingCols = Seq("col1"),
          sourceQuery = "(SELECT * FROM source) AS s")

        val resultRows = if (colDataType == IntegerType) {
          Seq(
            Row(null, "source1"),
            Row(null, "source2"),
            Row(1, "source"),
            Row(2, "source1"),
            Row(2, "source2"),
            Row(2, "source3"),
            Row(3, "target")
          )
        } else {
          Seq(
            Row(null, "source1"),
            Row(null, "source2"),
            Row("1", "source"),
            Row("2", "source1"),
            Row("2", "source2"),
            Row("2", "source3"),
            Row("3", "target")
          )
        }
        checkAnswer(sql("SELECT * FROM target"), resultRows)
      }
    }
  }

  for (dataLayoutType <- DataLayoutType.values) {
    test(s"INSERT REPLACE ON/USING with a ${dataLayoutType.toString} table") {
      withTable("target", "source") {
        dataLayoutType match {
          case DataLayoutType.PARTITIONED =>
            createTable(
              tableName = "target",
              tableCols = Seq("col1 int", "col2 int", "col3 int", "row_origin string"),
              partCols = Seq("col1", "col2"))
          case DataLayoutType.CLUSTERED =>
            createTable(
              tableName = "target",
              tableCols = Seq("col1 int", "col2 int", "col3 int", "row_origin string"),
              clusterCols = Seq("col1", "col2"))
          case DataLayoutType.NORMAL =>
            createTable(
              tableName = "target",
              tableCols = Seq("col1 int", "col2 int", "col3 int", "row_origin string"))
        }

        createTable(
          tableName = "source",
          tableCols = Seq("col1 int", "col2 int", "col3 int", "row_origin string"))

        insertValues("target", rows = Seq(
          "(0, 0, 0, 'target')",
          "(2, 2, 2, 'target')",
          "(2, 2, 2, 'target')",
          "(3, 3, 3, 'target')",
          "(3, 3, 3, 'target')",
          "(3, 3, 3, 'target')"))

        insertValues("source", rows = Seq(
          "(1, 1, 1, 'source')",
          "(2, 2, 2, 'source')",
          "(3, 3, 3, 'source')"))

        for (matchingCols <- Seq(
          // Full set of partitioned/clustered columns.
          Seq("col1", "col2"),
          // Partial set of partitioned/clustered columns.
          Seq("col1"),
          // Mixed set of partitioned/clustered columns and normal columns.
          Seq("col1", "col3"),
          // Only normal columns and no partitioned/clustered columns.
          Seq("col3"))) {

          executeInsertAtomicReplace(
            tableName = "target AS t",
            matchingCols = matchingCols,
            sourceQuery = "(SELECT * FROM source) AS s")

          checkAnswer(
            sql("SELECT * FROM target"),
            Row(0, 0, 0, "target") ::
              Row(1, 1, 1, "source") ::
              Row(2, 2, 2, "source") ::
              Row(3, 3, 3, "source") ::
              Nil
          )

          // Restore the table to the version before the INSERT REPLACE ON/USING operation.
          sql("RESTORE TABLE target TO VERSION AS OF 1")
        }
      }
    }
  }

  test("INSERT REPLACE ON/USING with an empty table") {
    withTable("target", "source") {
      createTable(
        tableName = "target",
        tableCols = Seq("col int", "row_origin string"))

      createTable(
        tableName = "source",
        tableCols = Seq("col int", "row_origin string"))
      insertValues("source", rows = Seq(
        "(1, 'source')",
        "(2, 'source')"))

      executeInsertAtomicReplace(
        tableName = "target AS t",
        matchingCols = Seq("col"),
        sourceQuery = "(SELECT * FROM source) AS s")

      checkAnswer(
        sql("SELECT * FROM target"),
        Row(1, "source") ::
          Row(2, "source") ::
          Nil
      )
    }
  }

  test("INSERT REPLACE ON/USING with a query that has a filter") {
    withTable("target", "source") {
      createTable(
        tableName = "target",
        tableCols = Seq("col int", "row_origin string"))
      insertValues("target", rows = Seq(
        "(1, 'target')",
        "(2, 'target')",
        "(2, 'target')",
        "(3, 'target')",
        "(3, 'target')",
        "(3, 'target')"))

      createTable(
        tableName = "source",
        tableCols = Seq("col int", "row_origin string"))
      insertValues("source", rows = Seq(
        "(1, 'source')",
        "(2, 'source')",
        "(3, 'source')"))

      executeInsertAtomicReplace(
        tableName = "target AS t",
        matchingCols = Seq("col"),
        sourceQuery = "(SELECT * FROM source WHERE col <= 2) AS s")

      checkAnswer(
        sql("SELECT * FROM target"),
        Row(1, "source") ::
          Row(2, "source") ::
          Row(3, "target") ::
          Row(3, "target") ::
          Row(3, "target") ::
          Nil
      )
    }
  }

  test("INSERT REPLACE ON/USING with empty source query") {
    withTable("target", "source") {
      createTable(
        tableName = "target",
        tableCols = Seq("col int", "row_origin string"))
      insertValues("target", rows = Seq(
        "(1, 'target')",
        "(2, 'target')",
        "(2, 'target')"))

      createTable(
        tableName = "source",
        tableCols = Seq("col int", "row_origin string"))

      executeInsertAtomicReplace(
        tableName = "target AS t",
        matchingCols = Seq("col"),
        sourceQuery = "(SELECT * FROM source) AS s")

      checkAnswer(
        sql("SELECT * FROM target"),
        Row(1, "target") ::
          Row(2, "target") ::
          Row(2, "target") ::
          Nil
      )
    }
  }

  test("INSERT REPLACE ON/USING with source having wider data type than target") {
    withSQLConf(
        DeltaConfigs.ENABLE_TYPE_WIDENING.defaultTablePropertyKey -> "true",
        DeltaSQLConf.DELTA_SCHEMA_AUTO_MIGRATE.key -> "true") {
      withTable("target", "source") {
        createTable(
          tableName = "target",
          tableCols = Seq("col byte", "row_origin string"))
        insertValues("target", rows = Seq(
          "(125, 'target')",
          "(126, 'target')",
          "(127, 'target')"))

        createTable(
          tableName = "source",
          tableCols = Seq("col short", "row_origin string"))
        insertValues("source", rows = Seq(
          "(126, 'source')",
          "(127, 'source')",
          "(10000, 'source')"))

        executeInsertAtomicReplace(
          tableName = "target AS t",
          matchingCols = Seq("col"),
          sourceQuery = "(SELECT * FROM source) AS s")

        checkAnswer(
          sql("SELECT * FROM target"),
          Row(125, "target") ::
            Row(126, "source") ::
            Row(127, "source") ::
            Row(10000, "source") ::
            Nil
        )
      }
    }
  }

  test("INSERT REPLACE ON/USING with target having wider data type than source") {
    withTable("target", "source") {
      createTable(
        tableName = "target",
        tableCols = Seq("col short", "row_origin string"))
      insertValues("target", rows = Seq(
        "(126, 'target')",
        "(127, 'target')",
        "(10000, 'target')"))

      createTable(
        tableName = "source",
        tableCols = Seq("col byte", "row_origin string"))
      insertValues("source", rows = Seq(
        "(125, 'source')",
        "(126, 'source')",
        "(127, 'source')"))

      executeInsertAtomicReplace(
        tableName = "target AS t",
        matchingCols = Seq("col"),
        sourceQuery = "(SELECT * FROM source) AS s")

      checkAnswer(
        sql("SELECT * FROM target"),
        Row(125, "source") ::
          Row(126, "source") ::
          Row(127, "source") ::
          Row(10000, "target") ::
          Nil
      )
    }
  }

  test("invalid INSERT REPLACE ON/USING query with not enough columns to insert") {
    withTable("target", "source") {
      createTable(
        tableName = "target",
        tableCols = Seq("col int", "row_origin string"))
      insertValues("target", rows = Seq(
        "(1, 'target')",
        "(2, 'target')",
        "(2, 'target')",
        "(3, 'target')",
        "(3, 'target')",
        "(3, 'target')"))

      createTable(
        tableName = "source",
        tableCols = Seq("col int"))
      insertValues("source", rows = Seq("(1)", "(2)", "(3)"))

      val events: Seq[UsageRecord] = Log4jUsageLogger.track {
        checkError(
          exception = intercept[AnalysisException] {
            executeInsertAtomicReplace(
              tableName = "target AS t",
              matchingCols = Seq("col"),
              sourceQuery = "(SELECT * FROM source) AS s")
          },
          condition = "DELTA_INSERT_COLUMN_ARITY_MISMATCH",
          sqlState = Some("42802"),
          parameters = Map(
            "tableName" -> "spark_catalog.default.target",
            "columnName" -> "not enough data columns",
            "numColumns" -> "2",
            "insertColumns" -> "1"
          )
        )
      }
      assert(!events.exists { e =>
        e.metric == MetricDefinitions.EVENT_TAHOE.name &&
          e.tags.get("opType").contains("delta.insertReplaceOnOrUsing.stats")
      })
    }
  }

  for {
    cdcReuseDataFiles <- BOOLEAN_DOMAIN
    dvsEnabled <- BOOLEAN_DOMAIN
  } {
    val testParamsMsg = s" cdcReuseDataFiles=$cdcReuseDataFiles, dvsEnabled=$dvsEnabled"
    test("INSERT REPLACE ON/USING with CDF enabled -" + testParamsMsg) {
      withSQLConf(DeltaSQLConf.
          INSERT_ATOMIC_REPLACE_CDC_REUSE_DATA_FILES.key -> cdcReuseDataFiles.toString) {
        withTable("target", "source") {
          val numRowsPerFile = 10
          val numFiles = 10
          spark.range(0, numFiles * numRowsPerFile, 1, numFiles).toDF("id")
            .write
            .format("delta")
            .option(DeltaConfigs.CHANGE_DATA_FEED.key, true)
            .option(DeltaConfigs.ENABLE_DELETION_VECTORS_CREATION.key, dvsEnabled)
            .saveAsTable("target")

          spark.range(0, numFiles * numRowsPerFile, 1, numFiles).toDF("id")
            .write
            .format("delta")
            .saveAsTable("source")

          // Replacing the first 15 rows of the target table with the first 15 rows
          // of the source table.
          executeInsertAtomicReplace(
            tableName = "target AS t",
            matchingCols = Seq("id"),
            sourceQuery = "(SELECT * FROM source WHERE id < 15) AS s")

          val replaceRowIds = Seq.range(0, 15, 1).toSet
          val insertRowIds = Seq.range(0, 15, 1).toSet
          val preRowIds = Seq.range(0, numFiles * numRowsPerFile).toSet
          val postRowIDs = (preRowIds -- replaceRowIds).toSeq ++ insertRowIds.toSeq
          checkAnswer(spark.table("target").select("id"), postRowIDs.toDF("id"))

          val deltaLog = DeltaLog.forTable(spark, TableIdentifier("target"))
          val version = deltaLog.update().version
          val changesDF = CDCReader.changesToBatchDF(deltaLog, version, version, spark)
            .select("id", CDCReader.CDC_TYPE_COLUMN_NAME)
          val expectedAnswerDF =
            replaceRowIds.toSeq.toDF("id")
              .withColumn(CDCReader.CDC_TYPE_COLUMN_NAME, lit(CDCReader.CDC_TYPE_DELETE))
              .union(
                insertRowIds.toSeq.toDF("id")
                  .withColumn(CDCReader.CDC_TYPE_COLUMN_NAME, lit(CDCReader.CDC_TYPE_INSERT))
              )
          checkAnswer(changesDF, expectedAnswerDF)
        }
      }
    }
  }

  for {
    enableDynamicPartitionOverwrite <- BOOLEAN_DOMAIN
    partitionOverwriteMode <- SQLConf.PartitionOverwriteMode.values
  } {
    val testParamsMsg =
      s"enableDynamicPartitionOverwrite=$enableDynamicPartitionOverwrite, " +
        s"partitionOverwriteMode=$partitionOverwriteMode"
    test("dynamicPartitionOverwrite configs should not affect INSERT REPLACE ON/USING, " +
        testParamsMsg) {
      withSQLConf(
        DeltaSQLConf.DYNAMIC_PARTITION_OVERWRITE_ENABLED.key ->
          enableDynamicPartitionOverwrite.toString,
        SQLConf.PARTITION_OVERWRITE_MODE.key -> partitionOverwriteMode.toString) {
        withTable("target", "source") {
          createTable(
            tableName = "target",
            tableCols = Seq("col int", "row_origin string"))
          insertValues("target", rows = Seq(
            "(0, 'target')",
            "(1, 'target')"))

          createTable(
            tableName = "source",
            tableCols = Seq("col int", "row_origin string"))
          insertValues("source", rows = Seq(
            "(1, 'source')",
            "(2, 'source')"))

          executeInsertAtomicReplace(
            tableName = "target AS t",
            matchingCols = Seq("col"),
            sourceQuery = "(SELECT * FROM source) AS s")

          checkAnswer(
            sql("SELECT * FROM target"),
            Row(0, "target") ::
              Row(1, "source") ::
              Row(2, "source") ::
              Nil
          )
        }
      }
    }
  }

  // TODO(LC-9149): Consider when to not materialize in INSERT REPLACE ON/USING. INSERT
  //  uses DataSourceV2Relation(deltaTableV2) instead of RelationFileIndex(TahoeFileIndex),
  //  for full SELECT * FROM delta_table query, which is something that we need to carefully
  //  investigate.
  for {
    materializationMode <- DeltaSQLConf.MergeMaterializeSource.list
    (queryType, sourceQuery) <- Seq(
      ("typical SELECT *", "SELECT * FROM source"),
      ("SELECT * with deterministic filter",
        "SELECT * FROM source WHERE col1 BETWEEN 0 AND 3 AND col1 % 2 = 1")
    )
  } {
    val testParamMsg = s"queryType=$queryType, materializationMode=$materializationMode"
    test("At the moment, REPLACE ON/USING always materialize, " + testParamMsg) {
      withSQLConf(
          DeltaSQLConf.INSERT_REPLACE_ON_OR_USING_MATERIALIZE_SOURCE.key -> materializationMode) {
        withTable("target", "source") {
          createTable(
            tableName = "target",
            tableCols = Seq("col1 int", "row_origin string"))
          insertValues("target", rows = Seq(
            "(-1, 'target')",
            "(1, 'target')",
            "(2, 'target')"))

          createTable(
            tableName = "source",
            tableCols = Seq("col1 int", "row_origin string"))
          insertValues("source", rows = Seq(
            "(1, 'source')",
            "(3, 'source')"))

          val events: Seq[UsageRecord] = Log4jUsageLogger.track {
            executeInsertAtomicReplace(
              tableName = "target AS t",
              matchingCols = Seq("col1"),
              sourceQuery = s"($sourceQuery) AS s")
          }

          checkAnswer(
            sql("SELECT * FROM target"),
            Row(-1, "target") ::
              Row(1, "source") ::
              Row(2, "target") ::
              Row(3, "source") ::
              Nil
          )

          val materializeReason = replaceOnOrUsingSourceMaterializationReason(events)
          materializationMode match {
            case DeltaSQLConf.MergeMaterializeSource.ALL =>
              assert(materializeReason ===
                MergeIntoMaterializeSourceReason.MATERIALIZE_ALL.toString)
            case DeltaSQLConf.MergeMaterializeSource.AUTO =>
              // TODO(LC-9149): Unlike SELECT * from a Delta table, in the case of
              //  deterministic filter on SELECT * from a Delta table,
              //  the source uses RelationFileIndex(TahoeFileIndex),
              //  so materialization is not needed.
              val expectedMaterializeReason =
                if (queryType == "SELECT * with deterministic filter") {
                  MergeIntoMaterializeSourceReason.NOT_MATERIALIZED_AUTO.toString
                } else {
                  MergeIntoMaterializeSourceReason.NON_DETERMINISTIC_SOURCE_NON_DELTA.toString
                }
              assert(materializeReason === expectedMaterializeReason)
            case DeltaSQLConf.MergeMaterializeSource.NONE =>
              assert(materializeReason ===
                MergeIntoMaterializeSourceReason.NOT_MATERIALIZED_NONE.toString)
          }
        }
      }
    }
  }

  for (materializationMode <- DeltaSQLConf.MergeMaterializeSource.list) {
    val testParamMsg = s"materializationMode=$materializationMode"
    test("INSERT REPLACE ON/USING with source query being a non-Delta table, " + testParamMsg) {
      withSQLConf(
        DeltaSQLConf.INSERT_REPLACE_ON_OR_USING_MATERIALIZE_SOURCE.key -> materializationMode) {
        withTable("target", "source") {
          createTable(
            tableName = "target",
            tableCols = Seq("col int", "row_origin string"))
          insertValues("target", rows = Seq(
            "(-1, 'target')",
            "(1, 'target')",
            "(2, 'target')",
            "(2, 'target')",
            "(3, 'target')",
            "(3, 'target')",
            "(3, 'target')"))

          sql(
            s"""
               |CREATE TABLE source (col int, row_origin string)
               |USING csv
               |""".stripMargin)

          insertValues("source", rows = Seq(
            "(0, 'source')",
            "(1, 'source')",
            "(2, 'source')",
            "(3, 'source')"))

          val events: Seq[UsageRecord] = Log4jUsageLogger.track {
            executeInsertAtomicReplace(
              tableName = "target AS t",
              matchingCols = Seq("col"),
              sourceQuery = "(SELECT * FROM source) AS s")
          }

          checkAnswer(
            sql("SELECT * FROM target"),
            Row(-1, "target") ::
              Row(0, "source") ::
              Row(1, "source") ::
              Row(2, "source") ::
              Row(3, "source") ::
              Nil
          )

          val materializeReason = replaceOnOrUsingSourceMaterializationReason(events)
          materializationMode match {
            case DeltaSQLConf.MergeMaterializeSource.ALL =>
              assert(materializeReason ===
                MergeIntoMaterializeSourceReason.MATERIALIZE_ALL.toString)
            case DeltaSQLConf.MergeMaterializeSource.AUTO =>
              assert(materializeReason ===
                MergeIntoMaterializeSourceReason.NON_DETERMINISTIC_SOURCE_NON_DELTA.toString)
            case DeltaSQLConf.MergeMaterializeSource.NONE =>
              assert(materializeReason ===
                MergeIntoMaterializeSourceReason.NOT_MATERIALIZED_NONE.toString)
          }
        }
      }
    }
  }

  test("INSERT REPLACE ON/USING with source query being a Delta table with a " +
      "non-deterministic filter") {
    withTable("target", "source") {
      createTable(
        tableName = "target",
        tableCols = Seq("col int", "row_origin string"))
      sql(
        s"""
           |INSERT INTO target
           |SELECT id, 'target'
           |FROM range(1, 100001) as r(id)
           |""".stripMargin)

      createTable(
        tableName = "source",
        tableCols = Seq("col int", "row_origin string"))

      sql(
        s"""
           |INSERT INTO source
           |SELECT col, 'source'
           |FROM range(1, 100001) as r(col)
           |""".stripMargin)

      // For the spark sql random() function the seed is fixed for both invocations
      val trueRandom = () => Math.random()
      val trueRandomUdf = udf(trueRandom)
      spark.udf.register("trueRandom", trueRandomUdf.asNondeterministic())

      val selectStarFromSourceWithRandFilterSql =
        "(SELECT * FROM source WHERE col < trueRandom() * 100000) AS s"

      val events: Seq[UsageRecord] = Log4jUsageLogger.track {
        executeInsertAtomicReplace(
          tableName = "target AS t",
          matchingCols = Seq("col"),
          sourceQuery = selectStarFromSourceWithRandFilterSql)
      }

      val materializeReason = replaceOnOrUsingSourceMaterializationReason(events)
      assert(materializeReason ===
        MergeIntoMaterializeSourceReason.NON_DETERMINISTIC_SOURCE_OPERATORS.toString)
    }
  }

  test("enabling 'disableSourceMaterializationNotAllowed' will error out if " +
      "'materializeSource' set to 'none'") {
    def runInsertReplaceOnOrUsingWithNonDeltaSource(): Unit = {
      withTable("target", "source") {
        createTable(
          tableName = "target",
          tableCols = Seq("col int", "row_origin string"))
        insertValues("target", rows = Seq("(1, 'target')"))

        sql(
          s"""
             |CREATE TABLE source (col int, row_origin string)
             |USING csv
             |""".stripMargin)

        insertValues("source", rows = Seq("(1, 'source')"))

        executeInsertAtomicReplace(
          tableName = "target AS t",
          matchingCols = Seq("col"),
          sourceQuery = "(SELECT * FROM source) AS s")
      }
    }

    for (materializationMode <- DeltaSQLConf.MergeMaterializeSource.list) {
      withSQLConf(
        DeltaSQLConf.INSERT_REPLACE_ON_OR_USING_MATERIALIZE_SOURCE.key -> materializationMode,
        DeltaSQLConf.MERGE_DISABLE_SOURCE_MATERIALIZATION_NOT_ALLOWED.key -> "false") {
        runInsertReplaceOnOrUsingWithNonDeltaSource()
      }
    }

    withSQLConf(
      DeltaSQLConf.INSERT_REPLACE_ON_OR_USING_MATERIALIZE_SOURCE.key -> "none",
      DeltaSQLConf.MERGE_DISABLE_SOURCE_MATERIALIZATION_NOT_ALLOWED.key -> "true"
    ) {
      checkError(
        exception = intercept[DeltaUnsupportedOperationException] {
          runInsertReplaceOnOrUsingWithNonDeltaSource()
        },
        condition =
          "DELTA_DISABLE_SOURCE_MATERIALIZATION_IN_INSERT_REPLACE_ON_OR_USING_NOT_ALLOWED",
        sqlState = Some("0AKDC"),
      )
    }
  }

  // TODO(LC-9059): Refactor with the Merge's custom error injection test, when we fully refactor
  //  the materialization source framework.
  private def testWithCustomErrorInjected[Intercept >: Null <: Exception with AnyRef : ClassTag](
      inject: Exception)(
      handle: (Intercept, Option[MergeIntoMaterializeSourceError]) => Unit): Unit = {
    {
      val tblName = "target"
      val sourceViewName = "source"
      withTable(tblName) {
        withView(sourceViewName) {
          val targetDF = spark.range(10).toDF("id").withColumn("value", rand())
          targetDF.write.format("delta").saveAsTable(tblName)
          spark
            .range(10)
            .mapPartitions { x =>
              throw inject
              x
            }
            .toDF("id")
            .withColumn("value", rand())
            .createOrReplaceTempView(sourceViewName)
          var thrownException: Intercept = null
          val events = Log4jUsageLogger
            .track {
              thrownException = intercept[Intercept] {
                executeInsertAtomicReplace(
                  tableName = s"$tblName AS t",
                  matchingCols = Seq("id"),
                  sourceQuery = s"(SELECT * FROM $sourceViewName) AS s")
              }
            }
            .filter { e =>
              e.metric == MetricDefinitions.EVENT_TAHOE.name &&
                e.tags.get("opType").contains(
                  InsertReplaceOnOrUsingMaterializeSourceError.OP_TYPE)
            }
          val error = events.headOption
            .map(e => JsonUtils.fromJson[MergeIntoMaterializeSourceError](e.blob))
          handle(thrownException, error)
        }
      }
    }
  }

  test("INSERT REPLACE ON/USING records its error op type when logs out of disk errors") {
    val injectEx = new java.io.IOException("No space left on device")
    testWithCustomErrorInjected[SparkException](injectEx) { (thrownEx, errorOpt) =>
      // Compare messages instead of instances, since the equals method for these exceptions
      // takes more into account.
      assert(thrownEx.getCause.getMessage === injectEx.getMessage)
      assert(errorOpt.isDefined)
      val error = errorOpt.get
      assert(error.errorType === MergeIntoMaterializeSourceErrorType.OUT_OF_DISK.toString)
      assert(error.attempt === 1)
      val storageLevel = StorageLevel.fromString(
        spark.conf.get(DeltaSQLConf.MERGE_MATERIALIZE_SOURCE_RDD_STORAGE_LEVEL))
      assert(error.materializedSourceRDDStorageLevel === storageLevel.toString)
    }
  }

  // TODO(LC-9059): Refactor with the Merge's multiple retries test, when we fully refactor
  //  the materialization source framework.
  // Runs an INSERT REPLACE ON/USING with source materialization, while a killer thread tries to
  // unpersist it.
  private def testInsertReplaceOnOrUsingMaterializedSourceUnpersist(
      tblName: String, sourceViewName: String, numKills: Int): Seq[UsageRecord] = {
    val maxAttempts = spark.conf.get(DeltaSQLConf.MERGE_MATERIALIZE_SOURCE_MAX_ATTEMPTS)

    // when we ask to join the killer thread, it should exit in the next iteration.
    val killerThreadJoinTimeoutMs = 10000
    // sleep between attempts to unpersist
    val killerIntervalMs = 1

    // Data does not need to be big; there is enough latency to unpersist even with small data.
    val targetDF = spark.range(100).toDF("id")
    targetDF.write.format("delta").saveAsTable(tblName)
    spark.range(100, 120).toDF("id").createOrReplaceTempView(sourceViewName)

    // Killer thread tries to unpersist any persisted mergeMaterializedSource RDDs,
    // until it has seen more than numKills distinct ones
    // (from distinct INSERT REPLACE ON/USING retries)
    @volatile var finished = false
    @volatile var invalidStorageLevel: Option[String] = None
    val killerThread = new Thread() {
      override def run(): Unit = {
        val seenSources = mutable.Set[Int]()
        while (!finished) {
          sparkContext.getPersistentRDDs.foreach { case (rddId, rdd) =>
            if (rdd.name == "mergeMaterializedSource") {
              if (!seenSources.contains(rddId)) {
                logInfo(s"First time seeing mergeMaterializedSource with id=$rddId")
                seenSources.add(rddId)
              }
              if (seenSources.size > numKills) {
                // already unpersisted numKills different source materialization attempts,
                // the killer can retire
                logInfo(s"seenSources.size=${seenSources.size}. Proceeding to finish.")
                finished = true
              } else {
                // Need to wait until it is actually checkpointed, otherwise if we try to unpersist
                // before it starts to actually persist it fails with
                // java.lang.AssertionError: assumption failed:
                // Storage level StorageLevel(1 replicas) is not appropriate for local checkpointing
                // (this wouldn't happen in real world scenario of losing the block because executor
                // was lost; there nobody manipulates with StorageLevel; if failure happens during
                // computation of the materialized rdd, the task would be reattempted using the
                // regular task retry mechanism)
                if (rdd.isCheckpointed) {
                  // Use this opportunity to test if the source has the correct StorageLevel.
                  val expectedStorageLevel = StorageLevel.fromString(
                    if (seenSources.size == 1) {
                      spark.conf.get(DeltaSQLConf.MERGE_MATERIALIZE_SOURCE_RDD_STORAGE_LEVEL)
                    } else if (seenSources.size == 2) {
                      spark.conf.get(
                        DeltaSQLConf.MERGE_MATERIALIZE_SOURCE_RDD_STORAGE_LEVEL_FIRST_RETRY)
                    } else {
                      spark.conf.get(DeltaSQLConf.MERGE_MATERIALIZE_SOURCE_RDD_STORAGE_LEVEL_RETRY)
                    }
                  )
                  val rddStorageLevel = rdd.getStorageLevel
                  if (rddStorageLevel != expectedStorageLevel) {
                    invalidStorageLevel =
                      Some(s"For attempt ${seenSources.size} of materialized source expected " +
                        s"$expectedStorageLevel but got ${rddStorageLevel}")
                    finished = true
                  }
                  logInfo(s"Unpersisting mergeMaterializedSource with id=$rddId")
                  // don't make it blocking, so that the killer turns around quickly and is ready
                  // for the next kill when Merge retries
                  rdd.unpersist(blocking = false)
                }
              }
            }
          }
          Thread.sleep(killerIntervalMs)
        }
        logInfo(s"seenSources.size=${seenSources.size}. Proceeding to finish.")
      }
    }
    killerThread.start()

    val events = Log4jUsageLogger.track {
      try {
        executeInsertAtomicReplace(
          tableName = s"$tblName AS t",
          matchingCols = Seq("id"),
          sourceQuery = s"(SELECT * FROM $sourceViewName) AS s")
      } catch {
        case NonFatal(ex) =>
          if (numKills < maxAttempts) {
            // The merge should succeed with retries
            throw ex
          }
      } finally {
        finished = true // put the killer to rest, if it didn't retire already
        killerThread.join(killerThreadJoinTimeoutMs)
        assert(!killerThread.isAlive)
      }
    }.filter(_.metric == MetricDefinitions.EVENT_TAHOE.name)

    // If killer thread recorded an invalid StorageLevel, throw it here
    assert(invalidStorageLevel.isEmpty, invalidStorageLevel.toString)

    events
  }

  private def testInsertReplaceOnOrUsingMaterializeSourceUnpersistRetries = {
    val maxAttempts = DeltaSQLConf.MERGE_MATERIALIZE_SOURCE_MAX_ATTEMPTS.defaultValue.get
    val tblName = "target"
    val sourceViewName = "source"

    // For 1 to maxAttempts - 1 RDD block lost failures, insert replace on/using should
    // retry and succeed.
    for (kills <- 1 to maxAttempts - 1) {
      test(s"materialize source unpersist with $kills kill attempts succeeds") {
        withTable(tblName) {
          withView(sourceViewName) {
            val allDeltaEvents = testInsertReplaceOnOrUsingMaterializedSourceUnpersist(
              tblName, sourceViewName, kills)
            val events = allDeltaEvents.filter(
              _.tags.get("opType").contains("delta.insertReplaceOnOrUsing.stats"))
            assert(events.length === 1, s"allDeltaEvents:\n$allDeltaEvents")
            val insertReplaceOnOrUsingStats =
              JsonUtils.fromJson[InsertReplaceOnOrUsingStats](events(0).blob)
            assert(insertReplaceOnOrUsingStats.materializeSourceAttempts.isDefined,
              s"insertReplaceOnOrUsingStats:\n$insertReplaceOnOrUsingStats")
            assert(insertReplaceOnOrUsingStats.materializeSourceAttempts.get ===
              kills + 1, s"insertReplaceOnOrUsingStats:\n$insertReplaceOnOrUsingStats")

            // Check query result after INSERT REPLACE ON/USING.
            val tab = sql(s"select * from $tblName order by id")
              .collect()
              .map(row => row.getLong(0))
              .toSeq
            assert(tab === (0L until 120L))
          }
        }
      }
    }

    // Eventually it should fail after exceeding maximum number of attempts.
    test(s"materialize source unpersist with $maxAttempts kill attempts fails") {
      withTable(tblName) {
        withView(sourceViewName) {
          val allDeltaEvents = testInsertReplaceOnOrUsingMaterializedSourceUnpersist(
            tblName, sourceViewName, maxAttempts)
          val events = allDeltaEvents.filter(_.tags.get("opType").
            contains(InsertReplaceOnOrUsingMaterializeSourceError.OP_TYPE))
          assert(events.length === 1, s"allDeltaEvents:\n$allDeltaEvents")
          val error = JsonUtils.fromJson[MergeIntoMaterializeSourceError](events(0).blob)
          assert(error.errorType ===
            MergeIntoMaterializeSourceErrorType.RDD_BLOCK_LOST.toString)
          assert(error.attempt === maxAttempts)
        }
      }
    }
  }

  testInsertReplaceOnOrUsingMaterializeSourceUnpersistRetries

  test("REPLACE ON/USING supports schema evolution") {
    withTable("target", "source") {
      createTable(
        tableName = "target",
        tableCols = Seq("col1 int", "col2 int", "row_origin string"))
      insertValues("target", rows = Seq(
        "(-1, -1, 'target')",
        "(1, 1, 'target')",
        "(2, 2, 'target')",
        "(2, 2, 'target')",
        "(4, 4, 'target')",
        "(4, 4, 'target')",
        "(4, 4, 'target')",
        "(4, 4, 'target')"))

      createTable(
        tableName = "source",
        tableCols = Seq("col1 int", "col2 int", "row_origin string", "col3 int", "col4 int"))
      insertValues("source", rows = Seq(
        "(0, 0, 'source', 0, 0)",
        "(1, 1, 'source', 1, 1)",
        "(2, 2, 'source', 2, 2)",
        "(3, 3, 'source', 3, 3)"))

      executeInsertAtomicReplace(
        tableName = "target AS t",
        matchingCols = Seq("col1", "col2"),
        sourceQuery = "(SELECT * FROM source) AS s",
        withSchemaEvolution = true)

      checkAnswer(
        sql("SELECT * FROM target"),
        Row(-1, -1, "target", null, null) ::
          Row(0, 0, "source", 0, 0) ::
          Row(1, 1, "source", 1, 1) ::
          Row(2, 2, "source", 2, 2) ::
          Row(3, 3, "source", 3, 3) ::
          Row(4, 4, "target", null, null) ::
          Row(4, 4, "target", null, null) ::
          Row(4, 4, "target", null, null) ::
          Row(4, 4, "target", null, null) ::
          Nil
      )
    }
  }

  test("invalid REPLACE ON/USING query with not enough columns to insert") {
    withTable("target", "source") {
      createTable(
        tableName = "target",
        tableCols = Seq("col int", "row_origin string"))
      insertValues("target", rows = Seq(
        "(1, 'target')",
        "(2, 'target')",
        "(2, 'target')",
        "(3, 'target')",
        "(3, 'target')",
        "(3, 'target')"))

      createTable(
        tableName = "source",
        tableCols = Seq("col int"))
      insertValues("source", rows = Seq("(1)", "(2)", "(3)"))

      val events: Seq[UsageRecord] = Log4jUsageLogger.track {
        checkError(
          exception = intercept[AnalysisException] {
            executeInsertAtomicReplace(
              tableName = "target",
              matchingCols = Seq("col"),
              sourceQuery = "SELECT * FROM source")
          },
          condition = "DELTA_INSERT_COLUMN_ARITY_MISMATCH",
          sqlState = Some("42802"),
          parameters = Map(
            "tableName" -> "spark_catalog.default.target",
            "columnName" -> "not enough data columns",
            "numColumns" -> "2",
            "insertColumns" -> "1"
          )
        )
      }
      assert(!events.exists { e => e.metric == MetricDefinitions.EVENT_TAHOE.name &&
        e.tags.get("opType").contains("delta.insertReplaceOnOrUsing.stats") })
    }
  }

  test("invalid REPLACE ON/USING query with more columns to insert when schema evolution is off") {
    withSQLConf(DeltaSQLConf.DELTA_SCHEMA_AUTO_MIGRATE.key -> "false",
                DeltaSQLConf.WORKLOAD_BASED_COLUMNS_CONFLICT_RESOLUTION_ENABLED.key -> "false") {
      withTable("target", "source") {
        createTable(
          tableName = "target",
          tableCols = Seq("col int", "row_origin string"))
        insertValues("target", rows = Seq(
          "(1, 'target')",
          "(2, 'target')",
          "(2, 'target')",
          "(3, 'target')",
          "(3, 'target')",
          "(3, 'target')"))

        createTable(
          tableName = "source",
          tableCols = Seq("col int", "row_origin string", "extra_col int"))
        insertValues("source", rows = Seq(
          "(1, 'source', 2)"))

        checkError(
          exception = intercept[AnalysisException] {
            executeInsertAtomicReplace(
              tableName = "target",
              matchingCols = Seq("col"),
              sourceQuery = "SELECT * FROM source")
          },
          condition = "DELTA_METADATA_MISMATCH",
          sqlState = Some("42KDG"),
          parameters = Map.empty[String, String]
        )
      }
    }
  }

  test("REPLACE ON/USING BY NAME clause should resolve columns by name and not by position") {
    withTable("target") {
      createTable(
        tableName = "target",
        tableCols = Seq("country STRING", "name STRING"))
      insertValues("target", rows = Seq(
        "('US', 'Dylan')",
        "('UK', 'Jennie')",
        "('IT', 'Julia')"))

      executeInsertAtomicReplace(
        tableName = "target AS t",
        matchingCols = Seq("country"),
        sourceQuery = """SELECT * FROM (VALUES
          |  ('Sophie', 'US'),
          |  ('Oliver', 'UK'),
          |  ('Yuki', 'JP')
          |) AS s(name, country)""",
        byName = true)

      checkAnswer(
        sql("SELECT * FROM target ORDER BY country"),
        Row("IT", "Julia") ::
          Row("JP", "Yuki") ::
          Row("UK", "Oliver") ::
          Row("US", "Sophie") ::
          Nil
      )
    }
  }

  test("REPLACE ON/USING BY NAME clause should resolve multiple columns with different orderings") {
    withTable("target") {
      createTable(
        tableName = "target",
        tableCols = Seq("id INT", "country STRING", "city STRING", "name STRING"))
      insertValues("target", rows = Seq(
        "(1, 'US', 'NYC', 'Dylan')",
        "(2, 'US', 'LA', 'Sophie')",
        "(3, 'UK', 'London', 'Bob')"))

      executeInsertAtomicReplace(
        tableName = "target AS t",
        matchingCols = Seq("country", "city"),
        sourceQuery = """SELECT * FROM (VALUES
          |  ('Alice', 'SF', 'US', 10),
          |  ('Charlie', 'London', 'UK', 30)
          |) AS s(name, city, country, id)""",
        byName = true)

      checkAnswer(
        sql("SELECT id, country, city, name FROM target ORDER BY id"),
        Row(1, "US", "NYC", "Dylan") ::
          Row(2, "US", "LA", "Sophie") ::
          Row(10, "US", "SF", "Alice") ::
          Row(30, "UK", "London", "Charlie") ::
          Nil
      )
    }
  }

  test("REPLACE ON/USING BY NAME clause with null values in the replace column " +
      "should be resolved by name") {
    withTable("target", "source") {
      createTable(
        tableName = "target",
        tableCols = Seq("id INT", "row_origin STRING"))
      insertValues("target", rows = Seq(
        "(1, 'target')",
        "(2, 'target')",
        "(null, 'target')"))

      createTable(
        tableName = "source",
        tableCols = Seq("row_origin STRING", "id INT"))
      insertValues("source", rows = Seq(
        "('source', 1)",
        "('source', null)",
        "('source', 3)"))

      executeInsertAtomicReplace(
        tableName = "target AS t",
        matchingCols = Seq("id"),
        sourceQuery = "SELECT * FROM source AS s",
        byName = true)

      checkAnswer(
        sql("SELECT * FROM target ORDER BY id NULLS LAST, row_origin"),
        Row(1, "source") ::
          Row(2, "target") ::
          Row(3, "source") ::
          Row(null, "source") ::
          Row(null, "target") ::
          Nil
      )
    }
  }

  test("REPLACE ON/USING BY NAME with a struct column in a different column position " +
      "should be resolved by name") {
    withSQLConf(
        DeltaSQLConf.DELTA_SCHEMA_MISMATCH_LOGGING_ENABLED.key -> "true",
        SQLConf.ANSI_ENABLED.key -> "true") {
      withTable("target") {
        createTable(
          tableName = "target",
          tableCols = Seq("id INT", "data STRUCT<a: INT, b: STRING>"))
        insertValues("target", rows = Seq(
          "(1, named_struct('a', 10, 'b', 'target'))",
          "(2, named_struct('a', 20, 'b', 'target'))"))

        val events: Seq[UsageRecord] = Log4jUsageLogger.track {
          executeInsertAtomicReplace(
            tableName = "target AS t",
            matchingCols = Seq("id"),
            sourceQuery = """SELECT * FROM (VALUES
              |  (named_struct('a', 100, 'b', 'source'), 1),
              |  (named_struct('a', 300, 'b', 'source'), 3)
              |) AS s(data, id)""",
            byName = true)
        }

        checkAnswer(
          sql("SELECT id, data.a, data.b FROM target ORDER BY id"),
          Row(1, 100, "source") ::
            Row(2, 20, "target") ::
            Row(3, 300, "source") ::
            Nil
        )

        // In this case, struct fields match so no logging event expected
        val writeEvents = getTahoeEvents(events, "delta.schema.inverted.nested.behavior")
        assert(writeEvents.isEmpty, "Expected NO logging event when struct fields are aligned")
      }
    }
  }

  test("REPLACE ON/USING BY NAME should resolve struct fields by position") {
    withSQLConf(
      DeltaSQLConf.DELTA_SCHEMA_MISMATCH_LOGGING_ENABLED.key -> "true",
      SQLConf.ANSI_ENABLED.key -> "true") {
      withTable("target") {
        createTable(
          tableName = "target",
          tableCols = Seq("id INT", "data STRUCT<a: INT, b: STRING>"))
        insertValues("target", rows = Seq(
          "(1, named_struct('a', 10, 'b', 'target'))",
          "(2, named_struct('a', 20, 'b', 'target'))"))

        // Insert into target with a swapped order of the struct members: STRUCT<b: STRING, a: INT>
        // BY NAME resolves columns by name, but struct members are resolved by position.
        val events: Seq[UsageRecord] = Log4jUsageLogger.track {
          val ex = intercept[SparkNumberFormatException] {
            executeInsertAtomicReplace(
              tableName = "target AS t",
              matchingCols = Seq("id"),
              sourceQuery = """SELECT * FROM (VALUES
                |  (named_struct('b', 'source', 'a', 100), 1),
                |  (named_struct('b', 'source', 'a', 300), 3)
                |) AS s(data, id)""",
              byName = true)
          }

          assert(ex.getCondition == "CAST_INVALID_INPUT")
          val params = ex.getMessageParameters
          assert(params.get("expression") == "'source'")
          assert(params.get("sourceType") == "\"STRING\"")
          assert(params.get("targetType") == "\"INT\"")
        }

        // Should log event because BY NAME uses position-based resolution for struct fields
        val writeEvents = getTahoeEvents(events, "delta.schema.inverted.nested.behavior")
        assert(writeEvents.nonEmpty, "Expected logging event for BY NAME with struct reordering")
      }
    }
  }

  test("REPLACE ON/USING BY NAME with an empty source should not change the target table") {
    withTable("target", "source") {
      createTable(
        tableName = "target",
        tableCols = Seq("id INT", "row_origin STRING"))
      insertValues("target", rows = Seq("(1, 'target')", "(2, 'target')"))

      // Create an empty source table
      createTable(
        tableName = "source",
        tableCols = Seq("id INT", "row_origin STRING"))

      executeInsertAtomicReplace(
        tableName = "target AS t",
        matchingCols = Seq("id"),
        sourceQuery = "SELECT * FROM source AS s",
        byName = true)

      checkAnswer(
        sql("SELECT * FROM target ORDER BY id"),
        Row(1, "target") ::
          Row(2, "target") ::
          Nil
      )
    }
  }

  for (dataLayoutType <- DataLayoutType.values) {
    test("REPLACE ON/USING BY NAME clause should resolve columns with the " +
        s"${dataLayoutType.toString} table layout") {
      withTable("target") {
        dataLayoutType match {
          case DataLayoutType.PARTITIONED =>
            createTable(
              tableName = "target",
              tableCols = Seq("id INT", "row_origin STRING"),
              partCols = Seq("id"))
          case DataLayoutType.CLUSTERED =>
            createTable(
              tableName = "target",
              tableCols = Seq("id INT", "row_origin STRING"),
              clusterCols = Seq("id"))
          case DataLayoutType.NORMAL =>
            createTable(
              tableName = "target",
              tableCols = Seq("id INT", "row_origin STRING"))
        }

        insertValues("target", rows = Seq(
          "(1, 'target')",
          "(2, 'target')"))

        executeInsertAtomicReplace(
          tableName = "target AS t",
          matchingCols = Seq("id"),
          sourceQuery = """SELECT * FROM (VALUES
            |  ('source', 1),
            |  ('source', 3)
            |) AS s(row_origin, id)""",
          byName = true)

        checkAnswer(
          sql("SELECT * FROM target ORDER BY id"),
          Row(1, "source") ::
            Row(2, "target") ::
            Row(3, "source") ::
            Nil
        )
      }
    }
  }

  test("REPLACE ON/USING BY NAME should fail when source column names don't match target table") {
    withTable("target") {
      createTable("target", Seq("id INT", "row_origin STRING"))
      insertValues("target", Seq("(1, 'target')"))

      checkError(
        exception = intercept[AnalysisException] {
          executeInsertAtomicReplace(
            tableName = "target AS t",
            matchingCols = Seq("id"),
            sourceQuery = "SELECT 1 as id, 'source' as wrong_column",
            byName = true)
        },
        condition = "DELTA_MISSING_COLUMN",
        parameters = Map("columnName" -> "wrong_column", "columnList" -> "id, row_origin")
      )
    }
  }

  test("REPLACE ON/USING BY NAME should fail when matching columns have non compatible types") {
    withTable("target") {
      createTable("target", Seq("id INT", "row_origin STRING"))
      insertValues("target", Seq("(1, 'target')"))

      val ex = intercept[Exception] {
        executeInsertAtomicReplace(
          tableName = "target AS t",
          matchingCols = Seq("id"),
          sourceQuery = "SELECT 'a' as id, 'source' as row_origin",
          byName = true)
      }

      ex match {
        // REPLACE USING throws a SparkNumberFormatException since it gets caught during execution.
        case ex: SparkNumberFormatException =>
          assert(ex.getCondition == "CAST_INVALID_INPUT")
          val params = ex.getMessageParameters
          assert(params.get("expression") == "'a'")
          assert(params.get("sourceType") == "\"STRING\"")
          assert(params.get("targetType") == "\"BIGINT\"")
        // REPLACE ON throws an AnalysisException since it gets caught during analysis.
        case ex: AnalysisException =>
          assert(ex.getCondition == "DELTA_INSERT_REPLACE_ON_UNRESOLVED_COLUMNS_IN_CONDITION")
          val params = ex.getMessageParameters
          assert(params.get("columnNames") == "`s`.`id`")
        case _ =>
          fail(s"Unexpected exception type: ${ex.getClass.getName}")
      }
    }
  }

  test("REPLACE ON/USING BY NAME with generated columns should auto-compute the generated column") {
    withTable("target", "source") {
      createTable(
        tableName = "target",
        tableCols = Seq("id INT", "value STRING", "id_plus_one INT GENERATED ALWAYS AS (id + 1)"))
      createTable(
        tableName = "source",
        tableCols = Seq("id INT", "value STRING"))
      sql("INSERT INTO target (id, value) VALUES (1, 'original')")

      insertValues("source", rows = Seq(
        "(1, 'source1')",
        "(2, 'source2')"))
      executeInsertAtomicReplace(
        tableName = "target AS t",
        matchingCols = Seq("id"),
        sourceQuery = "(SELECT * FROM source) s",
        byName = true)

      checkAnswer(
        sql("SELECT id, value, id_plus_one FROM target ORDER BY id"),
        Row(1, "source1", 2) ::
          Row(2, "source2", 3) ::
          Nil
      )
    }
  }

  test("REPLACE ON/USING BY NAME omitting a nullable column should succeed") {
    withTable("target") {
      createTable(
        tableName = "target",
        tableCols = Seq("nullable_col INT", "not_nullable_col INT NOT NULL"))
      sql("INSERT INTO target (not_nullable_col) VALUES (1), (2)")

      executeInsertAtomicReplace(
        tableName = "target AS t",
        matchingCols = Seq("not_nullable_col"),
        sourceQuery = "SELECT not_nullable_col FROM VALUES (2), (3) AS s(not_nullable_col)",
        byName = true)

      checkAnswer(
        sql("SELECT nullable_col, not_nullable_col FROM target ORDER BY not_nullable_col"),
        Row(null, 1) :: Row(null, 2) :: Row(null, 3) :: Nil
      )
    }
  }

  test("REPLACE ON/USING BY NAME omitting a not nullable column should fail") {
    withTable("target") {
      createTable(
        tableName = "target",
        tableCols = Seq("nullable_col INT", "not_nullable_col INT NOT NULL"))

      checkError(
        exception = intercept[AnalysisException] {
          executeInsertAtomicReplace(
            tableName = "target AS t",
            matchingCols = Seq("nullable_col"),
            sourceQuery = "SELECT 2 as nullable_col",
            byName = true)
        },
        condition = "DELTA_INSERT_COLUMN_MISMATCH",
        parameters = Map("columnName" -> "not_nullable_col")
      )
    }
  }

  for (schemaEvolution <- BOOLEAN_DOMAIN) {
    test(s"REPLACE ON/USING BY NAME should fail when source contains duplicate column names," +
        s" schemaEvolution=$schemaEvolution") {
      withSQLConf(DeltaSQLConf.DELTA_SCHEMA_AUTO_MIGRATE.key -> schemaEvolution.toString) {
        withTable("target") {
          createTable("target", Seq("id INT", "value STRING"))
          insertValues("target", Seq("(1, 'target')"))

          val ex = intercept[AnalysisException] {
            executeInsertAtomicReplace(
              tableName = "target AS t",
              matchingCols = Seq("id"),
              sourceQuery = "SELECT 1 as id, 'a' as value, 'b' as value",
              byName = true)
          }
          if (schemaEvolution) {
            checkError(ex, "DELTA_DUPLICATE_COLUMNS_FOUND",
              parameters = Map("coltype" -> "in the data to save", "duplicateCols" -> "value"))
          } else {
            checkError(ex, "INSERT_COLUMN_ARITY_MISMATCH.TOO_MANY_DATA_COLUMNS",
              parameters = Map(
                "tableName" -> s"`${spark.catalog.currentCatalog()}`.`default`.`target`",
                "tableColumns" -> "`id`, `value`",
                "dataColumns" -> "`id`, `value`, `value`"))
          }
        }
      }
    }
  }

  test("REPLACE ON/USING should fail when NOT NULL constraint is violated") {
    withTable("target") {
      createTable("target", Seq("id INT NOT NULL", "value STRING"))
      insertValues("target", Seq("(1, 'a')", "(2, 'b')"))

      checkError(
        exception = intercept[AnalysisException] {
          executeInsertAtomicReplace(
            tableName = "target AS t",
            matchingCols = Seq("id"),
            sourceQuery = "SELECT * FROM (VALUES (null, 'source')) AS s(id, value)")
        },
        condition = "DELTA_REPLACE_ON_OR_USING_TABLE_CONSTRAINT_VIOLATION",
        sqlState = Some("44000"),
        parameters = Map(
          "replaceExpression" -> Pattern.quote(expectedReplaceCriteriaValue(Seq("id"))),
          "invariantViolationMessage" ->
            "(?s)\\[DELTA_NOT_NULL_CONSTRAINT_VIOLATED\\] .*"),
        matchPVals = true
      )
    }
  }

  test("REPLACE ON/USING should fail when CHECK constraint is violated") {
    withTable("target") {
      createTable("target", Seq("id INT", "value INT"))
      sql("ALTER TABLE target ADD CONSTRAINT positive_value CHECK (value > 0)")
      insertValues("target", Seq("(1, 10)", "(2, 20)"))

      checkError(
        exception = intercept[AnalysisException] {
          executeInsertAtomicReplace(
            tableName = "target AS t",
            matchingCols = Seq("id"),
            sourceQuery = "SELECT * FROM (VALUES (1, -5)) AS s(id, value)")
        },
        condition = "DELTA_REPLACE_ON_OR_USING_TABLE_CONSTRAINT_VIOLATION",
        sqlState = Some("44000"),
        parameters = Map(
          "replaceExpression" -> Pattern.quote(expectedReplaceCriteriaValue(Seq("id"))),
          "invariantViolationMessage" ->
            "(?s)\\[DELTA_VIOLATE_CONSTRAINT_WITH_VALUES\\] .*"),
        matchPVals = true
      )
    }
  }

  test("REPLACE ON/USING should fail when GENERATED ALWAYS AS constraint is violated") {
    withTable("target") {
      createTable("target", Seq(
        "id INT", "value INT",
        "value_incremented INT GENERATED ALWAYS AS (value + 1)"))
      sql("INSERT INTO target (id, value) VALUES (1, 10), (2, 20)")

      checkError(
        exception = intercept[AnalysisException] {
          executeInsertAtomicReplace(
            tableName = "target AS t",
            matchingCols = Seq("id"),
            sourceQuery =
              "SELECT * FROM (VALUES (1, 10, 999)) AS s(id, value, value_incremented)")
        },
        condition = "DELTA_REPLACE_ON_OR_USING_TABLE_CONSTRAINT_VIOLATION",
        sqlState = Some("44000"),
        parameters = Map(
          "replaceExpression" -> Pattern.quote(expectedReplaceCriteriaValue(Seq("id"))),
          "invariantViolationMessage" ->
            "(?s)\\[DELTA_VIOLATE_CONSTRAINT_WITH_VALUES\\] .*"),
        matchPVals = true
      )
    }
  }

  test("apiOrigin is 'sql' for SQL INSERT") {
    import com.databricks.spark.util.{Log4jUsageLogger, UsageRecord}
    withTable("target") {
      sql("CREATE TABLE target (id INT, value INT) USING delta")
      sql("INSERT INTO target (id, value) VALUES (1, 10), (2, 20)")
      val events: Seq[UsageRecord] = Log4jUsageLogger.track {
        executeInsertAtomicReplace(
          tableName = "target AS t",
          matchingCols = Seq("id"),
          sourceQuery = "SELECT * FROM (VALUES (1, 100), (3, 300)) AS s(id, value)")
      }
      val stats = getInsertReplaceOnOrUsingStats(events)
      assert(stats.apiOrigin === "sql")
    }
  }

  test("apiOrigin is recorded even when SQL INSERT fails") {
    import com.databricks.spark.util.{Log4jUsageLogger, UsageRecord}
    withTable("target") {
      sql("CREATE TABLE target (id INT, value INT) USING delta")
      sql("INSERT INTO target (id, value) VALUES (1, 10)")
      val events: Seq[UsageRecord] = Log4jUsageLogger.track {
        intercept[Exception] {
          executeInsertAtomicReplace(
            tableName = "target AS t",
            matchingCols = Seq("nonexistent_col"),
            sourceQuery = "SELECT * FROM (VALUES (1, 100)) AS s(id, value)")
        }
      }
      val stats = getInsertReplaceOnOrUsingStats(events)
      assert(stats.apiOrigin === "sql")
      assert(stats.exceptionMsg.isDefined)
    }
  }
}
