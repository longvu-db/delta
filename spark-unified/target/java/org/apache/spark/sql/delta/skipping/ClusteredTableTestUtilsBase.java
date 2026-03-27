package org.apache.spark.sql.delta.skipping;
public  interface ClusteredTableTestUtilsBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.coordinatedcommits.CatalogOwnedTestBaseSuite {
  public  void createOrReplaceAsSelectClusteredTable (java.lang.String clause, java.lang.String table, java.lang.String srcTable, java.lang.String clusterBy, scala.Option<java.lang.String> location)  ;
  /**
   * Helper for creating or replacing table with different APIs.
   * @param clause clause for SQL API ('CREATE', 'REPLACE', 'CREATE OR REPLACE')
   * @param table the name of table
   * @param schema comma separated list of "colName dataType"
   * @param clusterBy comma separated list of clustering columns
   * @param tableProperties (undocumented)
   * @param location (undocumented)
   */
  public  void createOrReplaceClusteredTable (java.lang.String clause, java.lang.String table, java.lang.String schema, java.lang.String clusterBy, scala.collection.immutable.Map<java.lang.String, java.lang.String> tableProperties, scala.Option<java.lang.String> location)  ;
  public  void deleteTableFromCommitCoordinatorIfNeeded (java.lang.String table)  ;
  /**
   * Helper for running optimize on the table with different APIs.
   * @param table the name of table
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> optimizeTable (java.lang.String table)  ;
  /**
   * Runs optimize on the table and calls postHook on the metrics.
   * @param table the name of table
   * @param postHook callback triggered with OptimizeMetrics returned by the OPTIMIZE command
   */
  public  void runOptimize (java.lang.String table, scala.Function1<org.apache.spark.sql.delta.commands.optimize.OptimizeMetrics, scala.runtime.BoxedUnit> postHook)  ;
  /**
   * Runs optimize full on the table and calls postHook on the metrics.
   * <p>
   * @param table    the name of table
   * @param postHook callback triggered with OptimizeMetrics returned by the OPTIMIZE command
   */
  public  void runOptimizeFull (java.lang.String table, scala.Function1<org.apache.spark.sql.delta.commands.optimize.OptimizeMetrics, scala.runtime.BoxedUnit> postHook)  ;
  public  void verifyClusteringColumns (org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier, scala.collection.immutable.Seq<java.lang.String> expectedLogicalClusteringColumns, boolean skipCatalogCheck)  ;
  public  void verifyClusteringColumns (java.lang.String dataPath, scala.collection.immutable.Seq<java.lang.String> expectedLogicalClusteringColumns)  ;
  public  void verifyClusteringColumnsInDomainMetadata (org.apache.spark.sql.delta.Snapshot snapshot, scala.collection.immutable.Seq<java.lang.String> logicalColumnNames)  ;
  public  void verifyClusteringColumnsInternal (org.apache.spark.sql.delta.Snapshot snapshot, java.lang.String tableNameOrPath, scala.collection.immutable.Seq<java.lang.String> expectedLogicalClusteringColumns)  ;
  public  void verifyDescribeHistoryOperationParameters (java.lang.String table, scala.collection.immutable.Map<java.lang.String, java.lang.Object> expectedOperationParameters)  ;
  public <T extends java.lang.Object> T withClusteredTable (java.lang.String table, java.lang.String schema, java.lang.String clusterBy, scala.collection.immutable.Map<java.lang.String, java.lang.String> tableProperties, scala.Option<java.lang.String> location, scala.Function0<T> f)  ;
  public  void withTable (scala.collection.immutable.Seq<java.lang.String> tableNames, scala.Function0<scala.runtime.BoxedUnit> f)  ;
}
