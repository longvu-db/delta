package org.apache.spark.sql.delta.test;
/**
 * Test suite that runs DeltaSourceDeletionVectorsSuite using the V2 connector
 * (V2_ENABLE_MODE=STRICT).
 */
public  class DeltaV2SourceDeletionVectorsSuite extends org.apache.spark.sql.delta.DeltaSourceDeletionVectorsSuite implements org.apache.spark.sql.delta.test.V2ForceTest {
  public   DeltaV2SourceDeletionVectorsSuite ()  { throw new RuntimeException(); }
  /**
   * Override executeDml to temporarily use V1 connector for DML operations.
   * SparkTable (V2) is read-only and does not support writes, so DML must
   * go through the V1 path. Only streaming reads use the V2 connector.
   * @param sqlText (undocumented)
   */
  protected  void executeDml (java.lang.String sqlText)  { throw new RuntimeException(); }
  protected  boolean shouldFail (java.lang.String testName)  { throw new RuntimeException(); }
  protected  boolean useDsv2 ()  { throw new RuntimeException(); }
}
