package org.apache.spark.sql.delta;
/**
 * Include this trait to enable Id column mapping mode for a suite
 */
public  interface DeltaColumnMappingEnableIdMode extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.DeltaColumnMappingTestUtils, org.apache.spark.sql.delta.test.DeltaColumnMappingSelectedTestMixin {
  public  java.lang.String columnMappingMode ()  ;
  /**
   * CONVERT TO DELTA blocked in id mode
   * @param tableOrPath (undocumented)
   */
  public  void convertToDelta (java.lang.String tableOrPath)  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
}
