package org.apache.spark.sql.delta;
public  interface ColumnMappingStreamingTestUtils extends org.apache.spark.sql.streaming.StreamTest, org.apache.spark.sql.delta.DeltaColumnMappingTestUtils {
  public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery ExistingRetryableInStreamSchemaChangeFailure ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.ExpectFailure<org.apache.spark.sql.delta.DeltaStreamingNonAdditiveSchemaIncompatibleException> ExpectGenericSchemaIncompatibleFailure ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.ExpectFailure<org.apache.spark.sql.delta.DeltaStreamingNonAdditiveSchemaIncompatibleException> ExpectInStreamSchemaChangeFailure ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.ExpectFailure<org.apache.spark.sql.delta.DeltaStreamingNonAdditiveSchemaIncompatibleException> ExpectStreamStartInCompatibleSchemaFailure ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery ProcessAllAvailableIgnoreError ()  ;
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dropCDCFields (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  ;
  public  long getLatestCommittedDeltaVersion (org.apache.spark.sql.execution.streaming.StreamExecution q)  ;
  public  boolean isCdcTest ()  ;
  public  boolean isColumnMappingSchemaIncompatibleFailure (java.lang.Throwable t, boolean detectedDuringStreaming)  ;
}
