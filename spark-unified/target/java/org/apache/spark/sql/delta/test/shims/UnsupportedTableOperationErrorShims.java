package org.apache.spark.sql.delta.test.shims;
/**
 * Test shim for UNSUPPORTED_FEATURE.TABLE_OPERATION error codes that changed between Spark
 * versions. In Spark 4.0, the error code is _LEGACY_ERROR_TEMP_2096
 */
public  class UnsupportedTableOperationErrorShims {
  static public  java.lang.String UNSUPPORTED_TABLE_OPERATION_ERROR_CODE ()  { throw new RuntimeException(); }
  /**
   * Returns the parameters map for UPDATE TABLE error in Spark 4.0
   * @param tableSQLIdentifier Ignored in Spark 4.0, kept for API compatibility
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> updateTableErrorParameters (java.lang.String tableSQLIdentifier)  { throw new RuntimeException(); }
}
