package org.apache.spark.sql.delta;
public  interface DeltaCDCStreamSuiteBase extends org.apache.spark.sql.streaming.StreamTest, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.DeltaSourceSuiteBase, org.apache.spark.sql.delta.DeltaColumnMappingTestUtils {
  /**
   * Returns the appropriate DeltaConfig
   * @return (undocumented)
   */
  public  org.apache.spark.sql.delta.DeltaConfig<java.lang.Object> cdcConfig ()  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  /**
   * Create two tests for maxFilesPerTrigger and maxBytesPerTrigger
   * @param name (undocumented)
   * @param maxFilesPerTrigger (undocumented)
   * @param maxBytesPerTrigger (undocumented)
   * @param f (undocumented)
   */
  public  void testRateLimit (java.lang.String name, java.lang.String maxFilesPerTrigger, java.lang.String maxBytesPerTrigger, scala.Function2<java.lang.String, java.lang.String, scala.runtime.BoxedUnit> f)  ;
}
