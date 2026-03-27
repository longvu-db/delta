package org.apache.spark.sql.delta;
/**
 * Include this trait to enable Name column mapping mode for a suite
 */
public  interface DeltaColumnMappingEnableNameMode extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.DeltaColumnMappingTestUtils, org.apache.spark.sql.delta.test.DeltaColumnMappingSelectedTestMixin {
  public  java.lang.String columnMappingMode ()  ;
  /**
   * CONVERT TO DELTA can be possible under name mode in tests
   * @param tableOrPath (undocumented)
   */
  public  void convertToDelta (java.lang.String tableOrPath)  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
}
