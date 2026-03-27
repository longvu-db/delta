package org.apache.spark.sql.delta.test.shims;
/**
 * Test shims for streaming classes that were relocated in Spark 4.1.
 * In Spark 4.0, these classes are in their original locations.
 */
public  class StreamingTestShims$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StreamingTestShims$ MODULE$ = null;
  public   StreamingTestShims$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.MemoryStream$ MemoryStream ()  { throw new RuntimeException(); }
}
