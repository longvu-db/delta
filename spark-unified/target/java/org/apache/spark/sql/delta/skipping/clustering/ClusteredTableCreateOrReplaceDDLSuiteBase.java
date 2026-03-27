package org.apache.spark.sql.delta.skipping.clustering;
public  interface ClusteredTableCreateOrReplaceDDLSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.skipping.ClusteredTableTestUtils {
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
  public  void createTableWithStatsColumns (java.lang.String clause, java.lang.String table, scala.collection.immutable.Seq<java.lang.String> clusterColumns, int numIndexedColumns, scala.Option<java.lang.String> tableSchema, scala.collection.immutable.Seq<java.lang.String> statsColumns, scala.Option<java.lang.String> location)  ;
  public  boolean isPathBased ()  ;
  public  java.lang.String sourceTable ()  ;
  public  scala.collection.immutable.Seq<java.lang.String> supportedClauses ()  ;
  public  java.lang.String targetTable ()  ;
  public  void testClusteringColumnsPartOfStatsColumn (scala.collection.immutable.Seq<java.lang.String> clauses)  ;
  public  void testColTypeValidation (java.lang.String clause)  ;
  public  void testCtasRtasHelper (scala.collection.immutable.Seq<java.lang.String> clauses)  ;
  public  void testStatsCollectionHelper (java.lang.String tableSchema, int numberOfIndexedCols, scala.Function0<scala.runtime.BoxedUnit> cb)  ;
  public  java.lang.String testTable ()  ;
  public  void verifyClusteringColumns (java.lang.String table, scala.collection.immutable.Seq<java.lang.String> expectedLogicalClusteringColumns, scala.Option<java.lang.String> locationOpt)  ;
  public  void verifyPartitionColumns (org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier, scala.collection.immutable.Seq<java.lang.String> expectedPartitionColumns)  ;
  public  void withTempDirIfNecessary (scala.Function1<scala.Option<java.lang.String>, scala.runtime.BoxedUnit> f)  ;
}
