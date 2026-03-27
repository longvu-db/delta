package org.apache.spark.sql.delta.optimize;
public  interface CompactionTestHelperForAutoCompaction extends org.apache.spark.sql.delta.optimize.CompactionTestHelper {
  public  org.apache.spark.sql.delta.commands.optimize.OptimizeMetrics compactAndGetMetrics (java.lang.String tablePath, java.lang.String where)  ;
  public  java.lang.String maxFileSizeConf ()  ;
  public  java.lang.String minFileSizeConf ()  ;
}
