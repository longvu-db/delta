package org.apache.spark.sql.delta.optimize;
/** Tests for Optimize Z-Order by */
public  interface OptimizeZOrderSuiteBase extends org.apache.spark.sql.delta.optimize.OptimizePartitionTableHelper, org.apache.spark.sql.delta.test.TestsStatistics, org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.DeltaColumnMappingTestUtils {
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> executeOptimizePath (java.lang.String path, scala.collection.immutable.Seq<java.lang.String> zOrderBy, scala.Option<java.lang.String> condition)  ;
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> executeOptimizeTable (java.lang.String table, scala.collection.immutable.Seq<java.lang.String> zOrderBy, scala.Option<java.lang.String> condition)  ;
  public  void optimizeWithBatching (java.lang.String batchSize, int expectedCommits, scala.Option<java.lang.String> condition, scala.collection.immutable.Map<java.lang.String, java.lang.Object> partitionFileCount)  ;
}
