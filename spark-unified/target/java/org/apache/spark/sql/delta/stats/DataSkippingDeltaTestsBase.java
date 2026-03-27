package org.apache.spark.sql.delta.stats;
public  interface DataSkippingDeltaTestsBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.stats.DataSkippingDeltaTestsUtils, org.scalatest.GivenWhenThen, org.apache.spark.sql.delta.test.ScanReportHelper, org.apache.spark.sql.delta.coordinatedcommits.CatalogOwnedTestBaseSuite, org.apache.spark.sql.delta.test.DeltaSQLTestUtils {
  public  void checkResultsWithPartitions (java.lang.String tableDir, java.lang.String predicate, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> expResults, int expNumPartitions, long expNumFiles)  ;
  public  void checkSkipping (org.apache.spark.sql.delta.DeltaLog log, scala.collection.immutable.Seq<java.lang.String> hits, scala.collection.immutable.Seq<java.lang.String> misses, java.lang.String data, boolean checkEmptyUnusedFiltersForHits)  ;
  public  org.apache.spark.sql.delta.DeltaLog checkpointAndCreateNewLogIfNecessary (org.apache.spark.sql.delta.DeltaLog log)  ;
  public  int defaultNumIndexedCols ()  ;
  public  java.lang.String expectedStatsForFile (int index, java.lang.String colName, org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  public  scala.runtime.Nothing$ failPretty (java.lang.String error, java.lang.String predicate, java.lang.String data)  ;
  public  int filesRead (org.apache.spark.sql.delta.DeltaLog deltaLog, java.lang.String predicate, boolean checkEmptyUnusedFilters)  ;
  public  java.lang.String generateJsonData (int numCols)  ;
  public  scala.collection.IterableOnce<scala.Tuple2<java.lang.String, java.lang.String>> getDataSkippingConfs (int indexedCols, scala.Option<java.lang.String> deltaStatsColNamesOpt)  ;
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.AddFile> getFilesRead (org.apache.spark.sql.delta.DeltaLog deltaLog, java.lang.String predicate, boolean checkEmptyUnusedFilters)  ;
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getStatsDf (org.apache.spark.sql.delta.DeltaLog deltaLog, scala.collection.immutable.Seq<org.apache.spark.sql.Column> columns)  ;
  public  boolean isFullScan (org.apache.spark.sql.delta.metering.ScanReport report)  ;
  public  java.lang.String longString (java.lang.String str)  ;
  public  scala.collection.immutable.Seq<org.apache.spark.sql.catalyst.expressions.Expression> parse (org.apache.spark.sql.delta.DeltaLog deltaLog, java.lang.String predicate)  ;
  public  void setDeltaStatsColumns (java.lang.String path, java.lang.String deltaStatsColumns)  ;
  public  void setNumIndexedColumns (java.lang.String path, int numIndexedCols)  ;
  public  org.scalatest.Tag tableSchemaOnlyTag ()  ;
  /**
   * Test stats collection using both the table schema and DataFrame schema (if applicable)
   * TODO(lin): remove this after we remove the DELTA_COLLECT_STATS_USING_TABLE_SCHEMA flag
   * @param testName (undocumented)
   * @param testTags (undocumented)
   * @param testFun (undocumented)
   * @param pos (undocumented)
   */
  public  void test (java.lang.String testName, scala.collection.immutable.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  ;
  public  void testSkipping (java.lang.String name, java.lang.String data, org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Seq<java.lang.String> hits, scala.collection.immutable.Seq<java.lang.String> misses, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> sqlConfs, int indexedCols, scala.Option<java.lang.String> deltaStatsColNamesOpt, boolean checkEmptyUnusedFiltersForHits, scala.Option<java.lang.Throwable> exceptionOpt)  ;
}
