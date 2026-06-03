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
 * apache/spark. An external write (committed straight into `_delta_log`) bypasses the CacheManager.
 * Shared across classic and Connect.
 *
 * apache/spark#52764 (Spark 4.1) fixed DSv2 table state pinning for cached tables, so the asserted
 * behavior is version dependent (see [[pinningFixed]]). On Spark 4.1+ the cache pins and REFRESH
 * TABLE surfaces external changes. On Spark 4.0 the behavior differs by mode: under AUTO the cache
 * pins but REFRESH TABLE does not surface a direct `_delta_log` write (a drop and recreate is not
 * seen either), while under STRICT there is no pinning at all and external changes are visible
 * immediately. These tests assert each version's actual behavior.
 */
trait DeltaCacheTableTests
  extends DeltaTableRefreshSharedBase { self: AnyFunSuite =>

  /** True once apache/spark#52764 (Spark 4.1) made cached DSv2 tables pin their state. */
  private def pinningFixed: Boolean = spark.version >= "4.1"

  /** Runs `body` against an external catalog table `t` holding `(1, 100)` that has been cached. */
  private def withCachedTable(body: String => Unit): Unit =
    withExternalTable { path =>
      writerSql("CACHE TABLE t")
      try body(path)
      finally writerSql("UNCACHE TABLE IF EXISTS t")
    }

  test("cache scenario 1: external data write while cached") {
    withCachedTable { path =>
      externalDataWrite(path, Seq((2, 200)))
      if (pinningFixed) {
        // The cache pins, so the external write is invisible until REFRESH TABLE.
        assertFinalTableState("t", Seq(Row(1, 100)))
        writerSql("REFRESH TABLE t")
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
      } else if (v2EnableMode == "STRICT") {
        // Spark 4.0 STRICT: no pinning, the external write is visible immediately.
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
        writerSql("REFRESH TABLE t")
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
      } else {
        // Spark 4.0 AUTO: the cache pins and REFRESH TABLE does not surface a direct _delta_log
        // write.
        assertFinalTableState("t", Seq(Row(1, 100)))
        writerSql("REFRESH TABLE t")
        assertFinalTableState("t", Seq(Row(1, 100)))
      }
    }
  }

  test("cache scenario 2: session write then external write while cached") {
    withCachedTable { path =>
      writerSql("INSERT INTO t VALUES (2, 200)")
      assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
      externalDataWrite(path, Seq((3, 300)))
      if (!pinningFixed && v2EnableMode == "STRICT") {
        // Spark 4.0 STRICT: no pinning, the external write is visible immediately.
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200), Row(3, 300)))
        writerSql("REFRESH TABLE t")
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200), Row(3, 300)))
      } else {
        // The external write is pinned out of the cache.
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
        writerSql("REFRESH TABLE t")
        if (pinningFixed) {
          // 4.1+: REFRESH surfaces the external write.
          assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200), Row(3, 300)))
        } else {
          // Spark 4.0 AUTO: REFRESH does not surface a direct _delta_log write.
          assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
        }
      }
    }
  }

  test("cache scenario 3: external schema change while cached") {
    withCachedTable { path =>
      externalAddColumnAndWrite(path, Seq((2, 200, -1)))
      if (pinningFixed && v2EnableMode == "STRICT") {
        // 4.1+ STRICT: the V2 connector pins the cached snapshot, so the change is invisible.
        assertFinalTableState("t", Seq(Row(1, 100)))
      } else {
        // Classic (any version) and Spark 4.0 STRICT: a schema change breaks cache pinning, so the
        // external change is visible even before REFRESH.
        assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
      }
      writerSql("REFRESH TABLE t")
      assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
    }
  }

  test("cache scenario 4: session schema change then external write while cached") {
    withCachedTable { path =>
      writerSql("ALTER TABLE t ADD COLUMN new_column INT")
      externalDataWrite3(path, Seq((2, 200, -1)))
      if (v2EnableMode == "STRICT") {
        // TODO: under STRICT the V2 connector does not pick up the ADD COLUMN (schema is cached at
        // table lookup), so the new column never surfaces and the external row is read as 2
        // columns. On 4.0 there is no pinning so that external row is visible immediately; on 4.1+
        // the cache pins it out until REFRESH.
        if (pinningFixed) {
          assertFinalTableState("t", Seq(Row(1, 100)))
        } else {
          assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
        }
        writerSql("REFRESH TABLE t")
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
      } else {
        // Classic: the schema change breaks cache pinning, so the session ADD COLUMN and the
        // external write are both visible.
        assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
        writerSql("REFRESH TABLE t")
        assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
      }
    }
  }

  test("cache scenario 5: external drop and recreate while cached") {
    withCachedTable { path =>
      externalDropAndRecreate(path)
      writerSql("REFRESH TABLE t")
      if (!pinningFixed && v2EnableMode != "STRICT") {
        // Spark 4.0 AUTO: the cache pins and REFRESH TABLE does not surface the drop and recreate.
        assertFinalTableState("t", Seq(Row(1, 100)))
      } else {
        assertFinalTableState("t", Seq.empty)
      }
    }
  }
}
