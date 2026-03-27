package org.apache.spark.sql.delta.optimize;
/**
 * Base class containing tests for Delta table Optimize (file compaction)
 */
public  interface OptimizeCompactionSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.DeletionVectorsTestUtils, org.apache.spark.sql.delta.DeltaColumnMappingTestUtils {
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.AddFile> addedFiles (scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.Action> actions)  ;
  public  void appendRowsToDeltaTable (java.lang.String path, int numFiles, int numRowsPerFiles, scala.Option<scala.collection.immutable.Seq<java.lang.String>> partitionColumns, scala.collection.immutable.Seq<java.lang.Object> partitionValues)  ;
  /**
   * Utility method to append the given data to the Delta table located at the given path.
   * Optionally partitions the data.
   * @param data (undocumented)
   * @param tablePath (undocumented)
   * @param partitionColumns (undocumented)
   */
  public <T extends java.lang.Object> void appendToDeltaTable (org.apache.spark.sql.Dataset<T> data, java.lang.String tablePath, scala.Option<scala.collection.immutable.Seq<java.lang.String>> partitionColumns)  ;
  public  void executeOptimizePath (java.lang.String path, scala.Option<java.lang.String> condition)  ;
  public  void executeOptimizeTable (java.lang.String table, scala.Option<java.lang.String> condition)  ;
  public  void optimizeWithBatching (java.lang.String batchSize, int expectedCommits, scala.Option<java.lang.String> condition, scala.collection.immutable.Map<java.lang.String, java.lang.Object> partitionFileCount)  ;
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.RemoveFile> removedFiles (scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.Action> actions)  ;
  public  void testOptimizeCompactWithLargeFile (java.lang.String name, scala.collection.immutable.Seq<java.lang.Object> unCompactablePartitions, scala.collection.immutable.Seq<java.lang.Object> compactablePartitions)  ;
}
