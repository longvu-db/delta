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

import org.apache.spark.sql.delta.sources.DeltaSQLConf
import org.apache.spark.sql.delta.test.DeltaSQLCommandTest

import org.apache.spark.sql.{QueryTest, Row}
import org.apache.spark.sql.execution.columnar.InMemoryRelation
import org.apache.spark.sql.test.SharedSparkSession

/**
 * Tests for CACHE TABLE behavior with Delta tables, verifying how the Spark
 * CacheManager interacts with Delta's snapshot versioning.
 *
 * Key code pointers verified by these tests:
 *
 * 1. TahoeLogFileIndex.equals() (TahoeFileIndex.scala:347) compares versionToUse,
 *    which is None for non-time-travel queries (TahoeFileIndex.scala:302).
 *    Two TahoeLogFileIndex instances for the same table always match in CacheManager
 *    regardless of the actual snapshot version.
 *
 * 2. CacheManager operates on the analyzed plan (before PrepareDeltaScan).
 *    When a cache hit occurs, the scan subtree is replaced by InMemoryRelation
 *    and PrepareDeltaScan never runs on that subtree.
 *
 * 3. WriteIntoDelta (used by .write.format("delta").save(path)) does NOT call
 *    cacheManager.recacheByPlan (WriteIntoDelta.scala has no cacheManager reference).
 *    Path-based writes do not invalidate the cache.
 *
 * 4. WriteIntoDeltaBuilder (DeltaTableV2.scala:684), used for SQL INSERT INTO,
 *    DOES call cacheManager.recacheByPlan. Session writes invalidate the cache.
 *
 * 5. DELETE/UPDATE/MERGE commands also call cacheManager.recacheByPlan
 *    (DeleteCommand.scala:152, UpdateCommand.scala:109, MergeIntoCommand.scala:181).
 */
class DeltaCacheTableSuite
  extends QueryTest
  with SharedSparkSession
  with DeltaSQLCommandTest {

  private def createSimpleTable(name: String): Unit = {
    sql(s"CREATE TABLE $name (id INT, salary INT) USING delta")
  }

  private def insertInitialData(name: String): Unit = {
    sql(s"INSERT INTO $name VALUES (1, 100)")
  }

  private def getTablePath(name: String): String = {
    spark.sessionState.catalog
      .getTableMetadata(spark.sessionState.sqlParser.parseTableIdentifier(name))
      .location.toString
  }

  /** Check whether InMemoryRelation is present in the query plan for a table. */
  private def planContainsInMemoryRelation(tableName: String): Boolean = {
    val plan = sql(s"SELECT * FROM $tableName").queryExecution.withCachedData
    val hasIMR = plan.collect { case _: InMemoryRelation => true }.nonEmpty
    hasIMR
  }

  /** Get the Delta log version for a table by path. */
  private def currentDeltaVersion(path: String): Long = {
    DeltaLog.forTable(spark, path).unsafeVolatileSnapshot.version
  }

  // ---------------------------------------------------------------------------
  // Section [5]: CACHE TABLE impact on reads
  // ---------------------------------------------------------------------------

  test("[5] diagnostic: verify TahoeLogFileIndex.equals ignores snapshot version") {
    // This test verifies code pointer #1: TahoeLogFileIndex.equals() uses versionToUse
    // which is None for non-time-travel queries, so two instances for the same table
    // are always equal regardless of snapshot version.
    withTable("t") {
      createSimpleTable("t")
      insertInitialData("t")

      val path = getTablePath("t")

      // Get the TahoeLogFileIndex from the analyzed plan at version 1
      val plan1 = sql("SELECT * FROM t").queryExecution.analyzed
      val fileIndex1 = plan1.collect {
        case l: org.apache.spark.sql.execution.datasources.LogicalRelation =>
          l.relation.asInstanceOf[
            org.apache.spark.sql.execution.datasources.HadoopFsRelation
          ].location
      }.head

      // Write external data to bump version
      Seq((2, 200)).toDF("id", "salary")
        .write.format("delta").mode("append").save(path)

      // Get the TahoeLogFileIndex from the analyzed plan at version 2
      val plan2 = sql("SELECT * FROM t").queryExecution.analyzed
      val fileIndex2 = plan2.collect {
        case l: org.apache.spark.sql.execution.datasources.LogicalRelation =>
          l.relation.asInstanceOf[
            org.apache.spark.sql.execution.datasources.HadoopFsRelation
          ].location
      }.head

      // Print diagnostic info
      // scalastyle:off println
      println(s"[diag] fileIndex1 class: ${fileIndex1.getClass.getSimpleName}")
      println(s"[diag] fileIndex2 class: ${fileIndex2.getClass.getSimpleName}")
      println(s"[diag] fileIndex1 == fileIndex2: ${fileIndex1 == fileIndex2}")
      println(s"[diag] fileIndex1.hashCode: ${fileIndex1.hashCode}")
      println(s"[diag] fileIndex2.hashCode: ${fileIndex2.hashCode}")

      val idx1 = fileIndex1.asInstanceOf[
        org.apache.spark.sql.delta.files.TahoeLogFileIndex]
      val idx2 = fileIndex2.asInstanceOf[
        org.apache.spark.sql.delta.files.TahoeLogFileIndex]
      println(s"[diag] idx1.versionToUse: ${idx1.versionToUse}")
      println(s"[diag] idx2.versionToUse: ${idx2.versionToUse}")
      println(s"[diag] idx1.snapshotAtAnalysis.version: " +
        s"${idx1.snapshotAtAnalysis.version}")
      println(s"[diag] idx2.snapshotAtAnalysis.version: " +
        s"${idx2.snapshotAtAnalysis.version}")
      // scalastyle:on println

      // Key assertion: despite different snapshot versions, equals returns true
      // because versionToUse is None for both (non-time-travel queries).
      // This is WHY CacheManager matches the old cached plan with the new query.
      assert(idx1.versionToUse.isEmpty, "versionToUse should be None for non-TT query")
      assert(idx2.versionToUse.isEmpty, "versionToUse should be None for non-TT query")
      assert(idx1.snapshotAtAnalysis.version != idx2.snapshotAtAnalysis.version,
        "snapshot versions should differ after external write")
      assert(fileIndex1 == fileIndex2,
        "TahoeLogFileIndex.equals should return true despite different snapshot versions")
    }
  }

  test("[5] diagnostic: verify InMemoryRelation is in plan after CACHE TABLE") {
    // This test verifies code pointer #2: after CACHE TABLE, the query plan
    // contains InMemoryRelation (the cached data).
    withTable("t") {
      createSimpleTable("t")
      insertInitialData("t")

      assert(!planContainsInMemoryRelation("t"),
        "Before CACHE TABLE, plan should NOT contain InMemoryRelation")

      sql("CACHE TABLE t")

      // scalastyle:off println
      val plan = sql("SELECT * FROM t").queryExecution.withCachedData
      println(s"[diag] Plan after CACHE TABLE:\n${plan.treeString}")
      // scalastyle:on println

      assert(planContainsInMemoryRelation("t"),
        "After CACHE TABLE, plan SHOULD contain InMemoryRelation")

      checkAnswer(sql("SELECT * FROM t"), Row(1, 100))
      sql("UNCACHE TABLE t")
    }
  }

  test("[5] diagnostic: path-based write does NOT call recacheByPlan") {
    // This test verifies code pointer #3: WriteIntoDelta (path-based write) does
    // not call cacheManager.recacheByPlan, so the cache entry survives.
    withTable("t") {
      createSimpleTable("t")
      insertInitialData("t")
      sql("CACHE TABLE t")

      val path = getTablePath("t")
      val versionBefore = currentDeltaVersion(path)

      // Path-based write (goes through WriteIntoDelta, not WriteIntoDeltaBuilder)
      Seq((2, 200)).toDF("id", "salary")
        .write.format("delta").mode("append").save(path)

      val versionAfter = currentDeltaVersion(path)

      // scalastyle:off println
      println(s"[diag] Delta version before path write: $versionBefore")
      println(s"[diag] Delta version after path write: $versionAfter")
      println(s"[diag] InMemoryRelation still in plan: " +
        s"${planContainsInMemoryRelation("t")}")
      // scalastyle:on println

      assert(versionAfter > versionBefore,
        "Delta version should have incremented after path-based write")
      assert(planContainsInMemoryRelation("t"),
        "Path-based write should NOT invalidate the cache (no recacheByPlan call)")

      sql("UNCACHE TABLE t")
    }
  }

  test("[5] diagnostic: SQL INSERT INTO DOES call recacheByPlan") {
    // This test verifies code pointer #4: SQL INSERT INTO goes through
    // WriteIntoDeltaBuilder which calls cacheManager.recacheByPlan.
    // The cache is invalidated and re-built with fresh data.
    withTable("t") {
      createSimpleTable("t")
      insertInitialData("t")
      sql("CACHE TABLE t")

      assert(planContainsInMemoryRelation("t"),
        "Cache should be active after CACHE TABLE")

      // Session write via SQL (goes through WriteIntoDeltaBuilder.write())
      sql("INSERT INTO t VALUES (2, 200)")

      // scalastyle:off println
      println(s"[diag] InMemoryRelation after SQL INSERT: " +
        s"${planContainsInMemoryRelation("t")}")
      val data = sql("SELECT * FROM t ORDER BY id").collect()
      println(s"[diag] Data after SQL INSERT: ${data.mkString(", ")}")
      // scalastyle:on println

      // After recacheByPlan, the cache is rebuilt with fresh data
      checkAnswer(
        sql("SELECT * FROM t ORDER BY id"),
        Seq(Row(1, 100), Row(2, 200)))

      sql("UNCACHE TABLE t")
    }
  }

  // ---------------------------------------------------------------------------
  // The actual behavioral tests matching the design doc
  // ---------------------------------------------------------------------------

  test("[5] scenario 1: CACHE TABLE with external writes (path-based)") {
    // Design doc "OSS Delta (classic)" column: external writes are invisible
    // because CacheManager serves stale InMemoryRelation data.
    //
    // Mechanism:
    // 1. CACHE TABLE stores analyzed plan with TahoeLogFileIndex(versionToUse=None)
    // 2. External path-write bumps Delta version but does NOT call recacheByPlan
    // 3. Next SELECT creates new TahoeLogFileIndex(versionToUse=None) which
    //    equals() the cached plan's index (same path, both None)
    // 4. CacheManager substitutes InMemoryRelation -> stale data returned
    withTable("t") {
      createSimpleTable("t")
      insertInitialData("t")
      sql("CACHE TABLE t")
      checkAnswer(sql("SELECT * FROM t"), Row(1, 100))

      // External write via path (bypasses catalog cache invalidation)
      val path = getTablePath("t")
      Seq((2, 200)).toDF("id", "salary")
        .write.format("delta").mode("append").save(path)

      // scalastyle:off println
      val hasIMR = planContainsInMemoryRelation("t")
      val result = sql("SELECT * FROM t ORDER BY id").collect()
      println(s"[scenario 1] InMemoryRelation present: $hasIMR")
      println(s"[scenario 1] Query result: ${result.mkString(", ")}")
      println(s"[scenario 1] Delta log version: ${currentDeltaVersion(path)}")
      // scalastyle:on println

      // Cache pins the data: external write is invisible
      checkAnswer(
        sql("SELECT * FROM t ORDER BY id"),
        Seq(Row(1, 100)))

      sql("UNCACHE TABLE t")
    }
  }

  test("[5] scenario 1 addendum: UNCACHE reveals external writes") {
    withTable("t") {
      createSimpleTable("t")
      insertInitialData("t")
      sql("CACHE TABLE t")

      val path = getTablePath("t")
      Seq((2, 200)).toDF("id", "salary")
        .write.format("delta").mode("append").save(path)

      // Stale data from cache
      checkAnswer(sql("SELECT * FROM t ORDER BY id"), Seq(Row(1, 100)))

      // After uncaching, PrepareDeltaScan runs and picks up latest snapshot
      sql("UNCACHE TABLE t")
      checkAnswer(
        sql("SELECT * FROM t ORDER BY id"),
        Seq(Row(1, 100), Row(2, 200)))
    }
  }

  test("[5] scenario 2: session write invalidates cache then external write") {
    // Design doc "OSS Delta (classic)" column:
    // Session write → cache invalidated and rebuilt → external write invisible
    //
    // Mechanism:
    // 1. SQL INSERT INTO calls recacheByPlan → cache rebuilt with (1,100),(2,200)
    // 2. External path-write adds (3,300) but does NOT call recacheByPlan
    // 3. Next SELECT matches the rebuilt cache → returns (1,100),(2,200) only
    withTable("t") {
      createSimpleTable("t")
      insertInitialData("t")
      sql("CACHE TABLE t")
      checkAnswer(sql("SELECT * FROM t"), Row(1, 100))

      // Session write invalidates and rebuilds the cache
      sql("INSERT INTO t VALUES (2, 200)")

      // External write via path (no cache invalidation)
      val path = getTablePath("t")
      Seq((3, 300)).toDF("id", "salary")
        .write.format("delta").mode("append").save(path)

      // scalastyle:off println
      val hasIMR = planContainsInMemoryRelation("t")
      val result = sql("SELECT * FROM t ORDER BY id").collect()
      println(s"[scenario 2] InMemoryRelation present: $hasIMR")
      println(s"[scenario 2] Query result: ${result.mkString(", ")}")
      println(s"[scenario 2] Delta log version: ${currentDeltaVersion(path)}")
      // scalastyle:on println

      // Session write (1,100 + 2,200) is visible, external write (3,300) is not
      checkAnswer(
        sql("SELECT * FROM t ORDER BY id"),
        Seq(Row(1, 100), Row(2, 200)))

      sql("UNCACHE TABLE t")
    }
  }

  test("[5] scenario 2 addendum: UNCACHE after session+external write reveals all") {
    withTable("t") {
      createSimpleTable("t")
      insertInitialData("t")
      sql("CACHE TABLE t")

      sql("INSERT INTO t VALUES (2, 200)")

      val path = getTablePath("t")
      Seq((3, 300)).toDF("id", "salary")
        .write.format("delta").mode("append").save(path)

      // Only session write visible while cached
      checkAnswer(
        sql("SELECT * FROM t ORDER BY id"),
        Seq(Row(1, 100), Row(2, 200)))

      // After uncaching, all data is visible
      sql("UNCACHE TABLE t")
      checkAnswer(
        sql("SELECT * FROM t ORDER BY id"),
        Seq(Row(1, 100), Row(2, 200), Row(3, 300)))
    }
  }
}
