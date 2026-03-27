package org.apache.spark.sql.delta.test.shims;
/**
 * Test shim for UNSUPPORTED_FEATURE.TABLE_OPERATION error codes that changed between
 * Spark versions. In Spark 4.1, the error code is UNSUPPORTED_FEATURE.TABLE_OPERATION
 */
public  class UnsupportedTableOperationErrorShims$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final UnsupportedTableOperationErrorShims$ MODULE$ = null;
  public   UnsupportedTableOperationErrorShims$ ()  { throw new RuntimeException(); }
  public  java.lang.String UNSUPPORTED_TABLE_OPERATION_ERROR_CODE ()  { throw new RuntimeException(); }
  /**
   * Returns the parameters map for UPDATE TABLE error in Spark 4.1
   * @param tableSQLIdentifier The table identifier (e.g., "test_delta_table")
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> updateTableErrorParameters (java.lang.String tableSQLIdentifier)  { throw new RuntimeException(); }
}
