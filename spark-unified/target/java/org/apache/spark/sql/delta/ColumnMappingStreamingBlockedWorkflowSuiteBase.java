package org.apache.spark.sql.delta;
public  interface ColumnMappingStreamingBlockedWorkflowSuiteBase extends org.apache.spark.sql.delta.ColumnMappingStreamingTestUtils {
  public  void checkStreamStartBlocked (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.io.File ckpt, org.apache.spark.sql.streaming.StreamTest.StreamAction expectedFailure)  ;
  public  org.apache.spark.sql.streaming.DataStreamReader dsr ()  ;
  /**
   * Setup the test table for testing blocked workflow, this will create a id or name mode table
   * based on which tests it is run.
   * @param deltaLog (undocumented)
   */
  public  void setupTestTable (org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  public  void writeDeltaData (scala.collection.immutable.Seq<java.lang.Object> data, org.apache.spark.sql.delta.DeltaLog deltaLog, scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema)  ;
}
