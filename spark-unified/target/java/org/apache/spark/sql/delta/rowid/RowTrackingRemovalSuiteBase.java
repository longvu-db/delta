package org.apache.spark.sql.delta.rowid;
public  interface RowTrackingRemovalSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public  void addData (java.lang.String path, long start, long end)  ;
  public  void dropRowTracking (org.apache.spark.sql.delta.DeltaLog deltaLog, boolean truncateHistory)  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  public  void validateRowTrackingState (org.apache.spark.sql.delta.DeltaLog deltaLog, boolean isPresent)  ;
}
