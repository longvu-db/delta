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

package org.apache.spark.sql.delta.rowid

import org.apache.spark.sql.delta.{DeltaConfigs, DeltaIllegalStateException, DeltaLog, RowId, RowTrackingFeature, Serializable, SnapshotIsolation, WriteSerializable}
import org.apache.spark.sql.delta.DeltaOperations.ManualUpdate
import org.apache.spark.sql.delta.DeltaTestUtils.BOOLEAN_DOMAIN
import org.apache.spark.sql.delta.RowId.RowTrackingMetadataDomain
import org.apache.spark.sql.delta.actions.{CommitInfo, Protocol}
import org.apache.spark.sql.delta.actions.TableFeatureProtocolUtils.TABLE_FEATURES_MIN_WRITER_VERSION
import org.apache.spark.sql.delta.sources.DeltaSQLConf
import org.apache.spark.sql.delta.test.DeltaTestImplicits._
import org.apache.spark.sql.delta.util.FileNames

import org.apache.spark.sql.{QueryTest, Row}
import org.apache.spark.sql.catalyst.TableIdentifier
import org.apache.spark.sql.functions.col
import org.apache.spark.sql.test.SharedSparkSession
import org.apache.spark.sql.types.{LongType, MetadataBuilder, StructField, StructType}

class RowIdSuite extends QueryTest
    with SharedSparkSession
    with RowIdTestUtils {
  test("Enabling row IDs on existing table does not set row IDs as readable") {
    withRowTrackingEnabled(enabled = false) {
      withTable("tbl") {
        spark.range(10).write.format("delta")
          .saveAsTable("tbl")

        sql(
          s"""
             |ALTER TABLE tbl
             |SET TBLPROPERTIES (
             |'$rowTrackingFeatureName' = 'supported',
             |'delta.minWriterVersion' = $TABLE_FEATURES_MIN_WRITER_VERSION)""".stripMargin)

        val (log, snapshot) = DeltaLog.forTableWithSnapshot(spark, TableIdentifier("tbl"))
        assert(RowId.isSupported(snapshot.protocol))
        assert(!RowId.isEnabled(snapshot.protocol, snapshot.metadata))
      }
    }
  }

  test("row ids are assigned when they are enabled") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { dir =>
        spark.range(start = 0, end = 1000, step = 1, numPartitions = 10)
          .write.format("delta").save(dir.getAbsolutePath)
        val log = DeltaLog.forTable(spark, dir)
        assertRowIdsAreValid(log)

        spark.range(start = 1000, end = 1500, step = 1, numPartitions = 3)
          .write.format("delta").mode("append").save(dir.getAbsolutePath)
        assertRowIdsAreValid(log)
      }
    }
  }

  test("row ids are not assigned when they are disabled") {
    withRowTrackingEnabled(enabled = false) {
      withTempDir { dir =>
        spark.range(start = 0, end = 1000, step = 1, numPartitions = 10)
          .write.format("delta").save(dir.getAbsolutePath)
        val log = DeltaLog.forTable(spark, dir)
        assertRowIdsAreNotSet(log)

        spark.range(start = 1000, end = 1500, step = 1, numPartitions = 3)
          .write.format("delta").mode("append").save(dir.getAbsolutePath)
        assertRowIdsAreNotSet(log)
      }
    }
  }

  test("row ids can be disabled") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { dir =>
        spark.range(start = 0, end = 1000, step = 1, numPartitions = 10)
          .write.format("delta").save(dir.getAbsolutePath)
        val log = DeltaLog.forTable(spark, dir)
        assertRowIdsAreValid(log)

        sql(s"ALTER TABLE delta.`${dir.getAbsolutePath}` " +
          s"SET TBLPROPERTIES ('${DeltaConfigs.ROW_TRACKING_ENABLED.key}' = false)")
        checkAnswer(
          spark.read.load(dir.getAbsolutePath),
          (0 until 1000).map(Row(_)))
      }
    }
  }

  test("high watermark survives checkpointing") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { dir =>
        spark.range(start = 0, end = 1000, step = 1, numPartitions = 10)
          .write.format("delta").save(dir.getAbsolutePath)
        val log1 = DeltaLog.forTable(spark, dir)
        assertRowIdsAreValid(log1)

        // Force a checkpoint and add an empty commit, so that we can delete the first commit
        log1.checkpoint(log1.update())
        log1.startTransaction().commit(Nil, ManualUpdate)
        DeltaLog.clearCache()

        // Delete the first commit and all checksum files to force the next read to read the high
        // watermark from the checkpoint.
        val fs = log1.logPath.getFileSystem(log1.newDeltaHadoopConf())
        fs.delete(FileNames.deltaFile(log1.logPath, version = 0), true)
        fs.delete(FileNames.checksumFile(log1.logPath, version = 0), true)
        fs.delete(FileNames.checksumFile(log1.logPath, version = 1), true)

        spark.range(start = 1000, end = 1500, step = 1, numPartitions = 3)
          .write.format("delta").mode("append").save(dir.getAbsolutePath)
        val log2 = DeltaLog.forTable(spark, dir)
        assertRowIdsAreValid(log2)
      }
    }
  }

  test("re-added files keep their row ids") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { dir =>
        spark.range(start = 0, end = 1000, step = 1, numPartitions = 10)
          .write.format("delta").save(dir.getAbsolutePath)
        val log = DeltaLog.forTable(spark, dir)
        assertRowIdsAreValid(log)

        val filesBefore = log.update().allFiles.collect()
        val baseRowIdsBefore = filesBefore.map(f => f.path -> f.baseRowId.get).toMap

        log.startTransaction().commit(filesBefore, ManualUpdate)
        assertRowIdsAreValid(log)

        val filesAfter = log.update().allFiles.collect()
        val baseRowIdsAfter = filesAfter.map(f => f.path -> f.baseRowId.get).toMap

        assert(baseRowIdsBefore == baseRowIdsAfter)
      }
    }
  }

  test("RESTORE retains high watermark") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { dir =>
        // version 0: high watermark = 9
        spark.range(start = 0, end = 10)
          .write.format("delta").save(dir.getAbsolutePath)
        val log = DeltaLog.forTable(spark, dir)
        val deltaTable = io.delta.tables.DeltaTable.forPath(spark, dir.getAbsolutePath)

        // version 1: high watermark = 19
        spark.range(start = 10, end = 20)
          .write.mode("append").format("delta").save(dir.getAbsolutePath)
        val highWatermarkBeforeRestore = RowId.extractHighWatermark(log.update())

        // back to version 0: high watermark should be still equal to before the restore.
        deltaTable.restoreToVersion(0)

        val highWatermarkAfterRestore = RowId.extractHighWatermark(log.update())
        assert(highWatermarkBeforeRestore == highWatermarkAfterRestore)
        assertRowIdsDoNotOverlap(log)

        // version 1 (overridden): high watermark = 29
        spark.range(start = 10, end = 20)
          .write.mode("append").format("delta").save(dir.getAbsolutePath)
        assertHighWatermarkIsCorrectAfterUpdate(
          log,
          highWatermarkBeforeUpdate = highWatermarkAfterRestore.get,
          expectedNumRecordsWritten = 10)
        assertRowIdsDoNotOverlap(log)
        val highWatermarkWithNewData = RowId.extractHighWatermark(log.update())

        // back to version 0: high watermark should still be 29.
        deltaTable.restoreToVersion(0)

        val highWatermarkWithNewDataAfterRestore =
          RowId.extractHighWatermark(log.update())
        assert(highWatermarkWithNewData == highWatermarkWithNewDataAfterRestore)
        assertRowIdsDoNotOverlap(log)

      }
    }
  }

  for (downgradeAllowed <- BOOLEAN_DOMAIN) {
    test(s"RESTORE with potential row tracking downgrade, downgradeAllowed=$downgradeAllowed") {
      withTempDir { dir =>
        withRowTrackingEnabled(enabled = false) {
          spark.range(5).write.format("delta").save(dir.toString)
        }
        val log = DeltaLog.forTable(spark, dir)
        val oldProtocolVersion = log.update().protocol
        assert(!oldProtocolVersion.isFeatureSupported(RowTrackingFeature))
        val protocolWithRowTracking = Protocol(minWriterVersion = TABLE_FEATURES_MIN_WRITER_VERSION)
          .withFeature(RowTrackingFeature)
        val newProtocolVersion = oldProtocolVersion.merge(protocolWithRowTracking)
        log.upgradeProtocol(newProtocolVersion)
        withSQLConf(
          DeltaSQLConf.RESTORE_TABLE_PROTOCOL_DOWNGRADE_ALLOWED.key -> downgradeAllowed.toString) {
          sql(s"RESTORE TABLE delta.`$dir` VERSION AS OF 0")
        }
        val restoredProtocolVersion = log.update().protocol
        if (downgradeAllowed) {
          assert(restoredProtocolVersion === oldProtocolVersion)
        } else {
          assert(restoredProtocolVersion === newProtocolVersion)
        }
      }
    }
  }

  test("Check missing High Watermark for newly created empty table") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { dir =>
        spark.range(start = 0, end = 0)
          .write.format("delta").save(dir.getAbsolutePath)
        val log = DeltaLog.forTable(spark, dir)
        assert(RowId.extractHighWatermark(log.update()) === None)
        assertRowIdsAreNotSet(log)

        spark.range(start = 0, end = 10)
          .write.mode("append").format("delta").save(dir.getAbsolutePath)
        assert(RowId.extractHighWatermark(log.update()) === Some(9))
        assertRowIdsAreValid(log)
      }
    }
  }

  test("row_id column with row ids disabled") {
    withRowTrackingEnabled(enabled = false) {
      withTempDir { dir =>
        spark.range(start = 0, end = 1000, step = 1, numPartitions = 5)
          .select((col("id") + 10000L).as("row_id"))
          .write.format("delta").save(dir.getAbsolutePath)

        checkAnswer(
          spark.read.load(dir.getAbsolutePath),
          (0 until 1000).map(i => Row(i + 10000L))
        )
      }
    }
  }

  test("Throws error when assigning row IDs without stats") {
    withSQLConf(
      DeltaConfigs.ROW_TRACKING_ENABLED.defaultTablePropertyKey -> "true",
      DeltaSQLConf.DELTA_COLLECT_STATS.key -> "false") {
      withTable("target") {
        val err = intercept[DeltaIllegalStateException] {
          spark.range(end = 10).write.format("delta").saveAsTable("target")
        }
        checkError(err, "DELTA_ROW_ID_ASSIGNMENT_WITHOUT_STATS")
      }
    }
  }

  test("manually setting row ID high watermark is not allowed") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { dir =>
        spark.range(start = 0, end = 1000, step = 1, numPartitions = 10)
          .write.format("delta").save(dir.getAbsolutePath)

        val log = DeltaLog.forTable(spark, dir)

        val exception = intercept[IllegalStateException] {
          log.startTransaction().commit(
            Seq(RowTrackingMetadataDomain(rowIdHighWaterMark = 9001).toDomainMetadata),
            ManualUpdate)
        }
        assert(exception.getMessage.contains(
          "Manually setting the Row ID high water mark is not allowed"))
      }
    }
  }

  for (prevIsolationLevel <- Seq(
    Serializable))
  test(s"Maintenance operations can downgrade to snapshot isolation, " +
    s"previousIsolationLevel = $prevIsolationLevel") {
    withTable("table") {
      withSQLConf(
        DeltaConfigs.ROW_TRACKING_ENABLED.defaultTablePropertyKey -> "true",
        DeltaConfigs.ISOLATION_LEVEL.defaultTablePropertyKey -> prevIsolationLevel.toString) {
        // Create two files that will be picked up by OPTIMIZE
        spark.range(10).repartition(2).write.format("delta").saveAsTable("table")
        val (log, snapshot) = DeltaLog.forTableWithSnapshot(spark, TableIdentifier("table"))
        val versionBeforeOptimize = snapshot.version

        spark.sql("OPTIMIZE table").collect()

        val commitInfos = log.getChanges(versionBeforeOptimize + 1).flatMap(_._2).flatMap {
          case commitInfo: CommitInfo => Some(commitInfo)
          case _ => None
        }.toList
        assert(commitInfos.size == 1)
        assert(commitInfos.forall(_.isolationLevel.get == SnapshotIsolation.toString))
      }
    }
  }

  test("ALTER TABLE cannot enable Row IDs on existing table") {
    withRowTrackingEnabled(enabled = false) {
      withTable("tbl") {
        spark.range(10).write.format("delta").saveAsTable("tbl")

        val (log, snapshot) = DeltaLog.forTableWithSnapshot(spark, TableIdentifier("tbl"))
        assert(!RowId.isEnabled(snapshot.protocol, snapshot.metadata))

        val err = intercept[UnsupportedOperationException] {
          sql(s"ALTER TABLE tbl " +
            s"SET TBLPROPERTIES ('${DeltaConfigs.ROW_TRACKING_ENABLED.key}' = true)")
        }
        assert(err.getMessage === "Cannot enable Row IDs on an existing table.")
      }
    }
  }

  test(s"CONVERT TO DELTA assigns row ids") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { dir =>
        spark.range(10).repartition(1)
          .write.format("parquet").mode("overwrite").save(dir.getAbsolutePath)

        sql(s"CONVERT TO DELTA parquet.`$dir`")

        val log = DeltaLog.forTable(spark, dir)
        assertRowIdsAreValid(log)
        assert(extractMaterializedRowIdColumnName(log).isDefined)
      }
    }
  }

  test(s"CONVERT TO DELTA NO STATISTICS throws error") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { dir =>
        spark.range(10)
          .write.format("parquet").mode("overwrite").save(dir.getAbsolutePath)

        val err = intercept[DeltaIllegalStateException] {
          sql(s"CONVERT TO DELTA parquet.`$dir` NO STATISTICS")
        }
        checkError(err, "DELTA_CONVERT_TO_DELTA_ROW_TRACKING_WITHOUT_STATS",
          parameters = Map(
            "statisticsCollectionPropertyKey" -> DeltaSQLConf.DELTA_COLLECT_STATS.key,
            "rowTrackingTableFeatureDefaultKey" -> defaultRowTrackingFeatureProperty,
            "rowTrackingDefaultPropertyKey" ->
              DeltaConfigs.ROW_TRACKING_ENABLED.defaultTablePropertyKey))
      }
    }
  }

  test(s"CONVERT TO DELTA without stats collection enabled throws error") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { dir =>
        spark.range(10)
          .write.format("parquet").mode("overwrite").save(dir.getAbsolutePath)
        withSQLConf(DeltaSQLConf.DELTA_COLLECT_STATS.key -> "false") {
          val err = intercept[DeltaIllegalStateException] {
            sql(s"CONVERT TO DELTA parquet.`$dir`")
          }
          checkError(err, "DELTA_CONVERT_TO_DELTA_ROW_TRACKING_WITHOUT_STATS",
            parameters = Map(
              "statisticsCollectionPropertyKey" -> DeltaSQLConf.DELTA_COLLECT_STATS.key,
              "rowTrackingTableFeatureDefaultKey" -> defaultRowTrackingFeatureProperty,
              "rowTrackingDefaultPropertyKey" ->
                DeltaConfigs.ROW_TRACKING_ENABLED.defaultTablePropertyKey))
        }
      }
    }
  }

  test("Base Row ID metadata field has the expected type") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { tempDir =>
        spark.range(start = 0, end = 20).toDF("id")
          .write.format("delta").save(tempDir.getAbsolutePath)

        val df = spark.read.load(tempDir.getAbsolutePath)
          .select(QUALIFIED_BASE_ROW_ID_COLUMN_NAME)

        val expectedBaseRowIdMetadata = new MetadataBuilder()
          .putBoolean("__base_row_id_metadata_col", value = true)
          .build()
        val expectedBaseRowIdField = StructField(
          RowId.BASE_ROW_ID,
          LongType,
          nullable = false,
          metadata = expectedBaseRowIdMetadata)

        Seq(df.schema, df.queryExecution.analyzed.schema, df.queryExecution.optimizedPlan.schema)
          .foreach { schema =>
            assert(schema === new StructType()
              .add(expectedBaseRowIdField))
          }
      }
    }
  }

  test("Row IDs can be read with conflicting metadata column name") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { tempDir =>
        // Generate 2 files with base Row ID 0 and 20 resp.
        spark.range(start = 0, end = 20).toDF("_metadata").repartition(1)
          .write.format("delta").save(tempDir.getAbsolutePath)
        spark.range(start = 20, end = 30).toDF("_metadata").repartition(1)
          .write.format("delta").mode("append").save(tempDir.getAbsolutePath)

        val df = spark.read.load(tempDir.getAbsolutePath).select("_metadata")
        val dfWithConflict = df
          .select(
            col("_metadata"),
            df.metadataColumn("_metadata")
              .getField({RowId.BASE_ROW_ID})
              .as("real_base_row_id"))
          .where("real_base_row_id % 5 = 0")

        checkAnswer(dfWithConflict,
          (0 until 20).map(Row(_, 0)) ++
            (20 until 30).map(Row(_, 20)))
      }
    }
  }

  test("Base Row IDs can be read") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { tempDir =>
        // Generate 2 files with base Row ID 0 and 20 resp.
        spark.range(start = 0, end = 20).toDF("id").repartition(1)
          .write.format("delta").save(tempDir.getAbsolutePath)
        spark.range(start = 20, end = 30).toDF("id").repartition(1)
          .write.format("delta").mode("append").save(tempDir.getAbsolutePath)

        val df = spark.read.load(tempDir.getAbsolutePath)
          .select("id", QUALIFIED_BASE_ROW_ID_COLUMN_NAME)
        checkAnswer(df,
          (0 until 20).map(id => Row(id, 0)) ++
            (20 until 30).map(id => Row(id, 20)))
      }
    }
  }

  test("Filter by base Row IDs") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { tempDir =>
        // Generate 3 files with base Row ID 0, 10 and 20 resp.
        spark.range(start = 0, end = 10).toDF("id").repartition(1)
          .write.format("delta").save(tempDir.getAbsolutePath)
        spark.range(start = 10, end = 20).toDF("id").repartition(1)
          .write.format("delta").mode("append").save(tempDir.getAbsolutePath)
        spark.range(start = 20, end = 30).toDF("id").repartition(1)
          .write.format("delta").mode("append").save(tempDir.getAbsolutePath)

        val df = spark.read.load(tempDir.getAbsolutePath)
          .where(col(QUALIFIED_BASE_ROW_ID_COLUMN_NAME) === 10)
        checkAnswer(df, (10 until 20).map(Row(_)))
      }
    }
  }

  test("Base Row IDs can be read in subquery") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { tempDir =>
        // Generate 2 files with base Row ID 0 and 20 resp.
        spark.range(start = 0, end = 20).toDF("id").repartition(1)
          .write.format("delta").save(tempDir.getAbsolutePath)
        spark.range(start = 20, end = 30).toDF("id").repartition(1)
          .write.format("delta").mode("append").save(tempDir.getAbsolutePath)
        val rows = sql(
          s"""
             |SELECT * FROM delta.`${tempDir.getAbsolutePath}`
             |WHERE id IN (
             |  SELECT $QUALIFIED_BASE_ROW_ID_COLUMN_NAME
             |  FROM delta.`${tempDir.getAbsolutePath}`)
           """.stripMargin)
        checkAnswer(rows, Seq(Row(0), Row(20)))
      }
    }
  }

  test("Filter by base Row IDs in subquery") {
    withRowTrackingEnabled(enabled = true) {
      withTempDir { tempDir =>
        // Generate 2 files with base Row ID 0 and 20 resp.
        spark.range(start = 0, end = 20).toDF("id").repartition(1)
          .write.format("delta").save(tempDir.getAbsolutePath)
        spark.range(start = 20, end = 30).toDF("id").repartition(1)
          .write.format("delta").mode("append").save(tempDir.getAbsolutePath)

        val rows = sql(
          s"""
             |SELECT * FROM delta.`${tempDir.getAbsolutePath}`
             |WHERE id IN (
             |  SELECT id
             |  FROM delta.`${tempDir.getAbsolutePath}`
             |  WHERE $QUALIFIED_BASE_ROW_ID_COLUMN_NAME = 20)
          """.stripMargin)
        checkAnswer(rows, (20 until 30).map(Row(_)))
      }
    }
  }
}
