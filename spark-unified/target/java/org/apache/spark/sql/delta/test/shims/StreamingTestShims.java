package org.apache.spark.sql.delta.test.shims;
/**
 * Test shims for streaming classes that were relocated in Spark 4.1.
 * In Spark 4.1, these classes moved to new package locations.
 */
public  class StreamingTestShims {
  static public  org.apache.spark.sql.execution.streaming.runtime.MemoryStream$ MemoryStream ()  { throw new RuntimeException(); }
}
