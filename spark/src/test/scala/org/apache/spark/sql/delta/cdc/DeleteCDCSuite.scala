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

package org.apache.spark.sql.delta.cdc

// scalastyle:off import.ordering.noEmptyLine
import org.apache.spark.sql.delta._
import org.apache.spark.sql.delta.catalog.DeltaTableV2
import org.apache.spark.sql.delta.commands.cdc.CDCReader
import org.apache.spark.sql.delta.commands.cdc.CDCReader._
import org.apache.spark.sql.delta.sources.DeltaSQLConf._
import org.apache.spark.sql.delta.test.DeltaTestImplicits._

import org.apache.spark.sql.Dataset
import org.apache.spark.sql.catalyst.TableIdentifier
import org.apache.spark.sql.functions.lit

trait DeleteCDCMixin extends DeleteSQLMixin with CDCEnabled {
  protected def testCDCDelete(
      name: String)(
      initialData: => Dataset[_],
      partitionColumns: Seq[String] = Seq.empty,
      deleteCondition: String,
      expectedData: => Dataset[_],
      expectedChangeDataWithoutVersion: => Dataset[_]
    ): Unit = {
    test(s"CDC - $name") {
      withSQLConf(
          (DeltaConfigs.CHANGE_DATA_FEED.defaultTablePropertyKey, "true")) {
        append(initialData.toDF(), partitionColumns)

        executeDelete(tableSQLIdentifier, deleteCondition)

        checkAnswer(
          readDeltaTableByIdentifier(),
          expectedData.toDF())

        checkAnswer(
          getCDCForLatestOperation(deltaLog, operation = "DELETE"),
          expectedChangeDataWithoutVersion.toDF())
        spark.sql(s"DROP TABLE IF EXISTS $deleteSourceTableName")
      }
    }
  }

  protected val deleteSourceTableName = "__delete_cdc_source_table"
}

trait DeleteCDCTests extends DeleteCDCMixin
  with CDCTestMixin {
  import testImplicits._

  testCDCDelete("unconditional")(
    initialData = spark.range(0, 10, step = 1, numPartitions = 3),
    deleteCondition = "",
    expectedData = spark.range(0),
    expectedChangeDataWithoutVersion = spark.range(10)
      .withColumn(CDC_TYPE_COLUMN_NAME, lit("delete"))
  )

  testCDCDelete("conditional covering all rows")(
    initialData = spark.range(0, 10, step = 1, numPartitions = 3),
    deleteCondition = "id < 100",
    expectedData = spark.range(0),
    expectedChangeDataWithoutVersion = spark.range(10)
      .withColumn(CDC_TYPE_COLUMN_NAME, lit("delete"))
  )

  testCDCDelete("two random rows")(
    initialData = spark.range(0, 10, step = 1, numPartitions = 3),
    deleteCondition = "id = 2 OR id = 8",
    expectedData = Seq(0, 1, 3, 4, 5, 6, 7, 9).toDF(),
    expectedChangeDataWithoutVersion = Seq(2, 8).toDF()
      .withColumn(CDC_TYPE_COLUMN_NAME, lit("delete"))
  )

  testCDCDelete("delete unconditionally - partitioned table")(
    initialData = spark.range(0, 100, step = 1, numPartitions = 10)
      .selectExpr("id % 10 as part", "id"),
    partitionColumns = Seq("part"),
    deleteCondition = "",
    expectedData = Seq.empty[(Long, Long)].toDF("part", "id"),
    expectedChangeDataWithoutVersion =
      spark.range(100)
        .selectExpr("id % 10 as part", "id", "'delete' as _change_type")
  )

  testCDCDelete("delete all rows by condition - partitioned table")(
    initialData = spark.range(0, 100, step = 1, numPartitions = 10)
      .selectExpr("id % 10 as part", "id"),
    partitionColumns = Seq("part"),
    deleteCondition = "id < 1000",
    expectedData = Seq.empty[(Long, Long)].toDF("part", "id"),
    expectedChangeDataWithoutVersion =
      spark.range(100)
        .selectExpr("id % 10 as part", "id", "'delete' as _change_type")
  )


  testCDCDelete("partition-optimized delete")(
    initialData = spark.range(0, 100, step = 1, numPartitions = 10)
      .selectExpr("id % 10 as part", "id"),
    partitionColumns = Seq("part"),
    deleteCondition = "part = 3",
    expectedData =
      spark.range(100).selectExpr("id % 10 as part", "id").where("part != 3"),
    expectedChangeDataWithoutVersion =
      Range(0, 10).map(x => x * 10 + 3).toDF("id")
        .selectExpr("3 as part", "id", "'delete' as _change_type"))

  test("Read multiple CDC versions") {
    // Step 0: insert some data
    append(spark.range(10).coalesce(2).toDF())

    val newCdf0 = spark.range(10)
      .withColumn(CDC_TYPE_COLUMN_NAME, lit(CDC_TYPE_INSERT))
      .withColumn(CDC_COMMIT_VERSION, lit(0))
    checkAnswer(
      computeCDC(spark, deltaLog, 0, 0).drop(CDC_COMMIT_TIMESTAMP),
      newCdf0
    )

    // Step 1: delete half rows
    executeDelete(tableSQLIdentifier, "id % 2 = 0")
    val newCdf1 = spark.createDataset(Seq(0, 2, 4, 6, 8))
      .withColumn(CDC_TYPE_COLUMN_NAME, lit(CDC_TYPE_DELETE_STRING))
      .withColumn(CDC_COMMIT_VERSION, lit(1))
    checkAnswer(
      computeCDC(spark, deltaLog, 0, 1).drop(CDC_COMMIT_TIMESTAMP),
      newCdf0.union(newCdf1)
    )

    // Step 2: delete one whole partition
    executeDelete(tableSQLIdentifier, "id < 5")
    val newCdf2 = spark.createDataset(Seq(1, 3))
      .withColumn(CDC_TYPE_COLUMN_NAME, lit(CDC_TYPE_DELETE_STRING))
      .withColumn(CDC_COMMIT_VERSION, lit(2))
    checkAnswer(
      computeCDC(spark, deltaLog, 0, 2).drop(CDC_COMMIT_TIMESTAMP),
      newCdf0.union(newCdf1).union(newCdf2)
    )

    // Step 3: delete one row from remaining rows
    executeDelete(tableSQLIdentifier, "id = 7")
    val newCdf3 = spark.createDataset(Seq(7))
      .withColumn(CDC_TYPE_COLUMN_NAME, lit(CDC_TYPE_DELETE_STRING))
      .withColumn(CDC_COMMIT_VERSION, lit(3))
    checkAnswer(
      computeCDC(spark, deltaLog, 0, 3).drop(CDC_COMMIT_TIMESTAMP),
      newCdf0.union(newCdf1).union(newCdf2).union(newCdf3)
    )
  }

  testCDCDelete(s"one file and one row - subquery = false")(
    initialData = spark.range(0, 4, step = 1, numPartitions = 2),
    deleteCondition = "id >= 1",
    expectedData = Seq(0).toDF("id"),
    expectedChangeDataWithoutVersion =
      spark.range(1, 4).toDF("id").withColumn("_change_type", lit("delete")))

}

// Delete from table with existing DVs.
trait DeleteTableWithDVsMixin
  extends DeleteSQLMixin
  with DeletionVectorsTestUtils {

  override protected def executeDelete(target: String, where: String = null): Unit = {
    val (tgtTableName, _) = DeltaTestUtils.parseTableAndAlias(target)
    // Add deletion vectors to all files.
    addDeletionVectorsToTable(tgtTableName)
    super.executeDelete(target, where)
  }

  override def excluded: Seq[String] =
    super.excluded ++ Seq(
      // Requires continuous version numbers. Run "Read multiple CDC versions with DV off" instead.
      "Read multiple CDC versions"
    )
}

// Delete from table with existing DVs without writing persistent DVs.
trait DeleteTableWithDVsDVsOffMixin extends DeleteSQLMixin with DeleteTableWithDVsMixin {
  override def beforeAll(): Unit = {
    super.beforeAll()
    enableDeletionVectorsInNewTables(spark.conf)
    spark.conf.set(DELETE_USE_PERSISTENT_DELETION_VECTORS.key, "false")
  }
}

trait DeleteCDCTableWithDVsTests extends DeleteCDCMixin
  with CDCTestMixin
  with DeletionVectorsTestUtils {
  import testImplicits._

  private def executeDeleteWithoutAddingDVs(target: String, where: String = null): Unit = {
    super[DeleteCDCMixin].executeDelete(target, where)
  }

  testCDCDelete("delete from file with DV without subquery")(
    initialData = spark.range(0, 10, step = 1, numPartitions = 2),
    deleteCondition = "id IN (0, 3)",
    expectedData = Seq(1, 2, 4, 5, 6, 7, 8, 9).toDF(),
    expectedChangeDataWithoutVersion = Seq(0, 3).toDF()
      .withColumn(CDC_TYPE_COLUMN_NAME, lit("delete"))
  )

  test("Read multiple CDC versions from table with DVs") {
    // Step 0: insert some data.
    append(spark.range(10).coalesce(2).toDF())

    // Step 1: add DVs.
    addDeletionVectorsToTable(tableSQLIdentifier)

    // Step 2: delete half rows. Calling [[executeDelete]] of the super class to avoid adding
    // DVs again.
    executeDeleteWithoutAddingDVs(tableSQLIdentifier, "id % 2 = 0")
    val newCdf1 = spark.createDataset(Seq(0, 2, 4, 6, 8))
      .withColumn(CDC_TYPE_COLUMN_NAME, lit(CDC_TYPE_DELETE_STRING))
      .withColumn(CDC_COMMIT_VERSION, lit(2))
    checkAnswer(
      computeCDC(spark, deltaLog, 2, 2).drop(CDC_COMMIT_TIMESTAMP),
      newCdf1
    )

    // Step 3: delete one whole file.
    executeDeleteWithoutAddingDVs(tableSQLIdentifier, "id < 5")
    val newCdf2 = spark.createDataset(Seq(1, 3))
      .withColumn(CDC_TYPE_COLUMN_NAME, lit(CDC_TYPE_DELETE_STRING))
      .withColumn(CDC_COMMIT_VERSION, lit(3))
    checkAnswer(
      computeCDC(spark, deltaLog, 2, 3).drop(CDC_COMMIT_TIMESTAMP),
      newCdf1.union(newCdf2)
    )

    // Step 4: delete one row from remaining rows.
    executeDeleteWithoutAddingDVs(tableSQLIdentifier, "id = 7")
    val newCdf3 = spark.createDataset(Seq(7))
      .withColumn(CDC_TYPE_COLUMN_NAME, lit(CDC_TYPE_DELETE_STRING))
      .withColumn(CDC_COMMIT_VERSION, lit(4))
    checkAnswer(
      computeCDC(spark, deltaLog, 2, 4).drop(CDC_COMMIT_TIMESTAMP),
      newCdf1.union(newCdf2).union(newCdf3)
    )
  }
}

trait DeleteCDCTableWithDVsDVsOffTests extends DeleteCDCMixin
  with DeletionVectorsTestUtils {
  test("copied rows metric is correct") {
    append(spark.range(0, 10, 1, numPartitions = 2).toDF())
    addDeletionVectorsToTable(tableSQLIdentifier)
    super[DeleteCDCMixin].executeDelete(tableSQLIdentifier, "id IN (0, 1, 2, 8, 9)")
    val metrics = DeltaMetricsUtils.getLastOperationMetrics(tableSQLIdentifier)
    assert(metrics("numCopiedRows") === 5)
    assert(metrics("numDeletedRows") === 5)
    assert(metrics("numDeletionVectorsAdded") === 0)
  }
}
