package org.apache.spark.sql.delta.optimize;
/** Tests that run optimize and verify the returned output (metrics) is expected. */
public  interface OptimizeMetricsSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.DeletionVectorsTestUtils {
  public  scala.collection.immutable.Seq<java.lang.String> optimizeCommands ()  ;
}
