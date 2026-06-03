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
 * The asserted behavior is version and mode dependent, so each scenario branches explicitly on
 * `spark.version` (4.2, 4.1, 4.0) and on [[v2EnableMode]] (STRICT vs AUTO):
 *   - 4.1 and 4.2: apache/spark#52764 made cached DSv2 tables pin their state, so the cache pins
 *     and REFRESH TABLE surfaces external changes. A STRICT schema change additionally stays pinned
 *     out until REFRESH.
 *   - 4.0 STRICT: there is no pinning, so external changes are visible immediately.
 *   - 4.0 AUTO: the cache pins but REFRESH TABLE does not surface a direct `_delta_log` write (a
 *     drop and recreate is not seen either).
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

  test("cache scenario 1: external data write while cached") {
    withCachedTable { path =>
      externalDataWrite(path, Seq((2, 200)))
      if (spark.version >= "4.2") {
        // 4.2: the cache pins, so the external write is invisible until REFRESH TABLE.
        assertFinalTableState("t", Seq(Row(1, 100)))
        writerSql("REFRESH TABLE t")
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
      } else if (spark.version >= "4.1") {
        // 4.1: same as 4.2, the cache pins until REFRESH TABLE.
        assertFinalTableState("t", Seq(Row(1, 100)))
        writerSql("REFRESH TABLE t")
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
      } else if (v2EnableMode == "STRICT") {
        // 4.0 STRICT: no pinning, the external write is visible immediately.
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
        writerSql("REFRESH TABLE t")
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
      } else {
        // 4.0 AUTO: the cache pins and REFRESH TABLE does not surface a direct _delta_log write.
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
      if (spark.version >= "4.2") {
        // 4.2: the external write is pinned out of the cache, surfaced by REFRESH TABLE.
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
        writerSql("REFRESH TABLE t")
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200), Row(3, 300)))
      } else if (spark.version >= "4.1") {
        // 4.1: same as 4.2.
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
        writerSql("REFRESH TABLE t")
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200), Row(3, 300)))
      } else if (v2EnableMode == "STRICT") {
        // 4.0 STRICT: no pinning, the external write is visible immediately.
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200), Row(3, 300)))
        writerSql("REFRESH TABLE t")
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200), Row(3, 300)))
      } else {
        // 4.0 AUTO: the external write is pinned out and REFRESH does not surface a direct
        // _delta_log write.
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
        writerSql("REFRESH TABLE t")
        assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
      }
    }
  }

  test("cache scenario 3: external schema change while cached") {
    withCachedTable { path =>
      externalAddColumnAndWrite(path, Seq((2, 200, -1)))
      if (spark.version >= "4.2") {
        if (v2EnableMode == "STRICT") {
          // 4.2 STRICT: the V2 connector pins the cached snapshot, so the change is invisible.
          assertFinalTableState("t", Seq(Row(1, 100)))
        } else {
          // 4.2 AUTO: a schema change breaks cache pinning, so the change is visible immediately.
          assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
        }
      } else if (spark.version >= "4.1") {
        if (v2EnableMode == "STRICT") {
          // 4.1 STRICT: same as 4.2 STRICT, the cached snapshot is pinned.
          assertFinalTableState("t", Seq(Row(1, 100)))
        } else {
          // 4.1 AUTO: same as 4.2 AUTO, the change is visible immediately.
          assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
        }
      } else {
        // 4.0 STRICT and 4.0 AUTO: a schema change breaks cache pinning, so the external change is
        // visible even before REFRESH.
        assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
      }
      writerSql("REFRESH TABLE t")
      assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
    }
  }

  test("cache scenario 4: session schema change then external write while cached") {
    withCachedTable { path =>
      writerSql("ALTER TABLE t ADD COLUMN new_column INT")
      externalThreeColumnDataWrite(path, Seq((2, 200, -1)))
      // TODO: ADD COLUMN is not properly supported in the STRICT V2 connector yet. The connector
      // caches the schema at table lookup, so the session ADD COLUMN never surfaces and rows read
      // back as 2 columns. Once STRICT V2 supports ADD COLUMN, new_column should surface (NULL for
      // the existing row) and these STRICT assertions should expect 3 columns. Under AUTO the
      // schema change breaks cache pinning, so the ADD COLUMN and external row are both visible.
      if (spark.version >= "4.2") {
        if (v2EnableMode == "STRICT") {
          // 4.2 STRICT: the external write is pinned out of the cache until REFRESH.
          assertFinalTableState("t", Seq(Row(1, 100)))
          writerSql("REFRESH TABLE t")
          assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
        } else {
          assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
          writerSql("REFRESH TABLE t")
          assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
        }
      } else if (spark.version >= "4.1") {
        if (v2EnableMode == "STRICT") {
          // 4.1 STRICT: same as 4.2 STRICT, the external write is pinned out until REFRESH.
          assertFinalTableState("t", Seq(Row(1, 100)))
          writerSql("REFRESH TABLE t")
          assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
        } else {
          assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
          writerSql("REFRESH TABLE t")
          assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
        }
      } else {
        if (v2EnableMode == "STRICT") {
          // 4.0 STRICT: no pinning, the external write is visible immediately (read as 2 columns).
          assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
          writerSql("REFRESH TABLE t")
          assertFinalTableState("t", Seq(Row(1, 100), Row(2, 200)))
        } else {
          assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
          writerSql("REFRESH TABLE t")
          assertFinalTableState("t", Seq(Row(1, 100, null), Row(2, 200, -1)))
        }
      }
    }
  }

  test("cache scenario 5: external drop and recreate while cached") {
    withCachedTable { path =>
      externalDropAndRecreate(path)
      writerSql("REFRESH TABLE t")
      if (spark.version >= "4.2") {
        // 4.2: REFRESH surfaces the drop and recreate, so the table reads empty.
        assertFinalTableState("t", Seq.empty)
      } else if (spark.version >= "4.1") {
        // 4.1: same as 4.2.
        assertFinalTableState("t", Seq.empty)
      } else if (v2EnableMode == "STRICT") {
        // 4.0 STRICT: no pinning, the drop and recreate is seen, so the table reads empty.
        assertFinalTableState("t", Seq.empty)
      } else {
        // 4.0 AUTO: the cache pins and REFRESH does not surface the drop and recreate.
        assertFinalTableState("t", Seq(Row(1, 100)))
      }
    }
  }
}
