package org.apache.spark.sql.delta.coordinatedcommits;
/**
 * A helper class which enables coordinated-commits for the test suite based on the given
 * <code>coordinatedCommitsBackfillBatchSize</code> conf.
 */
public  interface CoordinatedCommitsBaseSuite extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.coordinatedcommits.CoordinatedCommitsTestUtils {
  public  void beforeEach ()  ;
  public  scala.Option<java.lang.Object> coordinatedCommitsBackfillBatchSize ()  ;
  public  boolean coordinatedCommitsEnabledInTests ()  ;
  public  void deleteTableFromCommitCoordinator (java.lang.String tableName)  ;
  public  void deleteTableFromCommitCoordinator (org.apache.hadoop.fs.Path path)  ;
  public  boolean isICTEnabledForNewTables ()  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
}
