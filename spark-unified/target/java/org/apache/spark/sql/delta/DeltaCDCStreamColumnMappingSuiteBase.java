package org.apache.spark.sql.delta;
public abstract class DeltaCDCStreamColumnMappingSuiteBase extends org.apache.spark.sql.delta.DeltaCDCStreamSuite implements org.apache.spark.sql.delta.ColumnMappingStreamingBlockedWorkflowSuiteBase, org.apache.spark.sql.delta.test.DeltaColumnMappingSelectedTestMixin {
  public   DeltaCDCStreamColumnMappingSuiteBase ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery ExistingRetryableInStreamSchemaChangeFailure ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.StreamTest.ExpectFailure<org.apache.spark.sql.delta.DeltaStreamingNonAdditiveSchemaIncompatibleException> ExpectGenericSchemaIncompatibleFailure ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.StreamTest.ExpectFailure<org.apache.spark.sql.delta.DeltaStreamingNonAdditiveSchemaIncompatibleException> ExpectInStreamSchemaChangeFailure ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.StreamTest.ExpectFailure<org.apache.spark.sql.delta.DeltaStreamingNonAdditiveSchemaIncompatibleException> ExpectStreamStartInCompatibleSchemaFailure ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery ProcessAllAvailableIgnoreError ()  { throw new RuntimeException(); }
  protected  boolean isCdcTest ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Seq<java.lang.String> runOnlyTests ()  { throw new RuntimeException(); }
}
