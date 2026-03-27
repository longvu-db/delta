package org.apache.spark.sql.delta.test.shims;
/**
 * Test shim for INVALID_DEFAULT_VALUE error codes that changed between Spark versions.
 * In Spark 4.1, the error code is INVALID_DEFAULT_VALUE.UNRESOLVED_EXPRESSION
 */
public  class InvalidDefaultValueErrorShims$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final InvalidDefaultValueErrorShims$ MODULE$ = null;
  public   InvalidDefaultValueErrorShims$ ()  { throw new RuntimeException(); }
  public  java.lang.String INVALID_DEFAULT_VALUE_ERROR_CODE ()  { throw new RuntimeException(); }
}
