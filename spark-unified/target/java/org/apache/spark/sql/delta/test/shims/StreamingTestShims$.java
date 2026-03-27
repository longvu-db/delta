package org.apache.spark.sql.delta.test.shims;
/**
 * Test shims for streaming classes that were relocated in Spark 4.1.
 * In Spark 4.1, these classes moved to new package locations.
 */
public  class StreamingTestShims$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StreamingTestShims$ MODULE$ = null;
  public   StreamingTestShims$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.runtime.MemoryStream$ MemoryStream ()  { throw new RuntimeException(); }
}
