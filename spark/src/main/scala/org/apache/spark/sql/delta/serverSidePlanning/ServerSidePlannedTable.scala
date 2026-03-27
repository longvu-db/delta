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

package org.apache.spark.sql.delta.serverSidePlanning

import java.util

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.connector.catalog.{Identifier, Table, TableCapability}
import org.apache.spark.sql.types.StructType

/**
 * Dummy placeholder class for ServerSidePlannedTable.
 * This is a no-op implementation to satisfy compilation requirements when server-side planning
 * code is excluded from OSS sync.
 */
class ServerSidePlannedTable extends Table {
  override def name(): String = "server_side_planned_table_dummy"

  override def schema(): StructType = new StructType()

  override def capabilities(): util.Set[TableCapability] = {
    new util.HashSet[TableCapability]()
  }
}

object ServerSidePlannedTable {
  /**
   * Dummy tryCreate method that always returns None.
   * This ensures compilation succeeds without changing runtime behavior.
   */
  def tryCreate(
      spark: SparkSession,
      ident: Identifier,
      table: Table,
      isUnityCatalog: Boolean): Option[ServerSidePlannedTable] = {
    None
  }
}
