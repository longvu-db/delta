package org.apache.spark.sql.delta.test.shims;
/**
 * Test shim for INVALID_DEFAULT_VALUE error codes that changed between Spark versions.
 * In Spark 4.0, the error code is INVALID_DEFAULT_VALUE.NOT_CONSTANT
 */
public  class InvalidDefaultValueErrorShims {
  static public  java.lang.String INVALID_DEFAULT_VALUE_ERROR_CODE ()  { throw new RuntimeException(); }
}
