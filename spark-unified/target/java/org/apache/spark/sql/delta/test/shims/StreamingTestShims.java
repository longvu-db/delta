package org.apache.spark.sql.delta.test.shims;
/**
 * Test shims for streaming classes that were relocated in Spark 4.1.
 * In Spark 4.0, these classes are in their original locations.
 */
public  class StreamingTestShims {
  static public  org.apache.spark.sql.execution.streaming.MemoryStream$ MemoryStream ()  { throw new RuntimeException(); }
}
