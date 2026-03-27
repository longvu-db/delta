package org.apache.spark.sql.delta.test;
/**
 * Test suite that runs DeltaSourceSuite using the V2 connector (V2_ENABLE_MODE=STRICT).
 */
public  class DeltaV2SourceSuite extends org.apache.spark.sql.delta.DeltaSourceSuite implements org.apache.spark.sql.delta.test.V2ForceTest {
  public   DeltaV2SourceSuite ()  { throw new RuntimeException(); }
  /**
   * Override disableLogCleanup to use DeltaLog API instead of SQL ALTER TABLE.
   * Path-based ALTER TABLE doesn't work properly with V2_ENABLE_MODE=STRICT.
   * TODO(#5731): pending kernel v2 connector support.
   * @param tablePath (undocumented)
   */
  protected  void disableLogCleanup (java.lang.String tablePath)  { throw new RuntimeException(); }
  protected  boolean shouldFail (java.lang.String testName)  { throw new RuntimeException(); }
  protected  boolean useDsv2 ()  { throw new RuntimeException(); }
}
