package org.apache.spark.sql.delta;
public  interface DescribeDeltaDetailSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.coordinatedcommits.CatalogOwnedTestBaseSuite, org.apache.spark.sql.delta.DeltaTestUtilsForTempViews {
  public  java.lang.String catalogAndSchema ()  ;
  public  void checkResult (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> result, scala.collection.immutable.Seq<java.lang.Object> expected, scala.collection.immutable.Seq<java.lang.String> columns)  ;
  public  void checkResultForClusteredTable (java.lang.String table, java.lang.String[] clusteringColumns)  ;
  public  void describeDeltaDetailTest (scala.Function1<java.io.File, java.lang.String> f)  ;
  public  void withTempTableOrDir (boolean useTable, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f)  ;
}
