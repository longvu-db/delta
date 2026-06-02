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

package io.delta.tables.shared

import org.scalatest.funsuite.AnyFunSuite

import org.apache.spark.sql.Row

/**
 * CACHE TABLE behavior across session and external mutations, mirroring the DSv2 CACHE scenarios in
 * apache/spark. An external write (committed straight into `_delta_log`) bypasses the CacheManager,
 * while REFRESH TABLE makes it visible. Shared across classic and Connect.
 */
trait DeltaCacheTableTests
  extends DeltaTableRefreshSharedBase { self: AnyFunSuite =>

  /** Runs `body` against an external catalog table `t` holding `(1, 100)` that has been cached. */
  private def withCachedTable(body: String => Unit): Unit =
    withExternalTable { path =>
      writerSql("CACHE TABLE t")
      try body(path)
      finally writerSql("UNCACHE TABLE IF EXISTS t")
    }

  test("cache scenario 1: external data write stays invisible until REFRESH") {
    withCachedTable { path =>
      externalDataWrite(path, Seq((2, 200)))
      assertFinalTableState("t", Seq(Row(1, 100)))
      writerSql("REFRESH TABLE t")
      assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
    }
  }

  test("cache scenario 2: session write invalidates cache, then external stays invisible") {
    withCachedTable { path =>
      writerSql("INSERT INTO t VALUES (2, 200)")
      assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
      externalDataWrite(path, Seq((3, 300)))
      assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
      writerSql("REFRESH TABLE t")
      assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200), Row(3, 300)))
    }
  }

  test("cache scenario 3: external schema change") {
    withCachedTable { path =>
      externalAddColumnAndWrite(path, Seq((2, 200, -1)))
      if (v2EnableMode == "STRICT") {
        // The V2 connector pins the cached snapshot, so the external schema change is invisible.
        assertFinalTableState("t", Seq(Row(1, 100)))
      } else {
        // In classic Delta a schema change breaks Spark's plan-shape cache pinning, so the external
        // change is visible even before REFRESH.
        assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
      }
      writerSql("REFRESH TABLE t")
      assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
    }
  }

  test("cache scenario 4: session schema change then external write") {
    withCachedTable { path =>
      writerSql("ALTER TABLE t ADD COLUMN new_column INT")
      externalDataWrite3(path, Seq((2, 200, -1)))
      if (v2EnableMode == "STRICT") {
        // TODO: under STRICT the V2 connector does not pick up the ADD COLUMN (schema is cached at
        // table lookup), so the new column never surfaces. The cached read stays at the original 2
        // column schema, and even after REFRESH the external row is read back as 2 columns.
        assertFinalTableState("t", Seq(Row(1, 100)))
        writerSql("REFRESH TABLE t")
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
      } else {
        // In classic Delta the schema change breaks cache pinning, so the session ADD COLUMN and
        // the external write are both visible.
        assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
        writerSql("REFRESH TABLE t")
        assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
      }
    }
  }

  test("cache scenario 5: external drop and recreate sees the new empty table") {
    withCachedTable { path =>
      externalDropAndRecreate(path)
      writerSql("REFRESH TABLE t")
      assertFinalTableState("t", Seq.empty)
    }
  }
}
