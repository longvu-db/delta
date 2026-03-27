package org.apache.spark.sql.delta.stats;
public  interface PartitionLikeDataSkippingSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.scalatest.BeforeAndAfter, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.skipping.ClusteredTableTestUtils {
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
  public  long longToTimestampMillis (long i)  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  public  java.lang.String testTableName ()  ;
  public  void validateExpectedScanMetrics (java.lang.String tableName, java.lang.String query, int expectedNumFiles, int expectedNumPartitionLikeDataFilters, boolean allPredicatesUsed, long minNumFilesToApply)  ;
}
