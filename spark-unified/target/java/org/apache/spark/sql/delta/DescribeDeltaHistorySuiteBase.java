package org.apache.spark.sql.delta;
public  interface DescribeDeltaHistorySuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.DeltaTestUtilsForTempViews, org.apache.spark.sql.delta.MergeIntoMetricsBase, org.apache.spark.sql.delta.coordinatedcommits.CatalogOwnedTestBaseSuite, org.apache.spark.sql.delta.WriteOptionsTestBase {
  public  void assertInHistory (scala.collection.immutable.Map<java.lang.String, java.lang.String> opParams, scala.collection.immutable.Map<java.lang.String, java.lang.String> expected)  ;
  public  void assertNotInHistory (scala.collection.immutable.Map<java.lang.String, java.lang.String> opParams, scala.collection.immutable.Seq<java.lang.String> keys)  ;
  public  void assertWriteOptions (java.lang.String path, org.apache.spark.sql.delta.WriteOptionsAssertion assertions)  ;
  public  void assertWriteOptionsFromParams (scala.collection.immutable.Map<java.lang.String, java.lang.String> opParams, org.apache.spark.sql.delta.WriteOptionsAssertion asserts)  ;
  public  void checkLastOperation (java.lang.String basePath, scala.collection.immutable.Seq<java.lang.String> expectedOperationParameters, scala.collection.immutable.Seq<java.lang.String> expectedColVals, scala.collection.immutable.Seq<org.apache.spark.sql.Column> columns, boolean removeExpressionId)  ;
  /**
   * a separate check on properties is needed because order inside properties
   * is determined by order in Map and can differ between scala versions
   * Thus, we want to make sure check on properties can ignore orders and
   * check if all (key, value) property-pairs are expected
   * @param basePath (undocumented)
   * @param expectedProperties (undocumented)
   */
  public  void checkLastOperationProperties (java.lang.String basePath, scala.collection.immutable.Map<java.lang.String, java.lang.String> expectedProperties)  ;
  public  void checkOperationMetrics (scala.collection.immutable.Map<java.lang.String, java.lang.String> expectedMetrics, scala.collection.immutable.Map<java.lang.String, java.lang.String> operationMetrics, scala.collection.immutable.Set<java.lang.String> metricsSchema)  ;
  /**
   * Check all expected metrics exist and executime time (if expected to exist) is the largest time
   * metric.
   * @param expectedMetrics (undocumented)
   * @param operationMetrics (undocumented)
   */
  public  void checkOperationTimeMetricsInvariant (scala.collection.immutable.Set<java.lang.String> expectedMetrics, scala.collection.immutable.Map<java.lang.String, java.lang.String> operationMetrics)  ;
  public  scala.collection.immutable.Set<java.lang.String> deleteMetricsSchema (boolean partitioned)  ;
  public  scala.collection.immutable.Seq<java.lang.String> evolvabilityLastOp ()  ;
  public  java.lang.String evolvabilityResource ()  ;
  public  void executePathWriteTest (scala.Function1<java.lang.String, scala.runtime.BoxedUnit> write, org.apache.spark.sql.delta.WriteOptionsAssertion assertions)  ;
  /**
   * Execute a write operation and run assertions on a name-based table.
   * @param write (undocumented)
   * @param assertions (undocumented)
   */
  public  void executeTableWriteTest (scala.Function1<java.lang.String, scala.runtime.BoxedUnit> write, org.apache.spark.sql.delta.WriteOptionsAssertion assertions)  ;
  public  scala.collection.immutable.Seq<java.lang.String> expectedInsertOperationParameters ()  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getCommitOpParams (java.lang.String tablePath)  ;
  public  scala.Tuple2<java.lang.Object, java.lang.Object> getLastCommitNumAddedAndRemovedBytes (org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getOperationMetrics (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> history)  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getProperties (scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> extraProperty)  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getTableCommitInfo (java.lang.String tableName)  ;
  public  scala.collection.immutable.Set<java.lang.String> mergeMetricsSchema ()  ;
  public  void metricsUpdatePartitionedColumnTest ()  ;
  public  void metricsUpdateTest ()  ;
  public  scala.collection.immutable.Set<java.lang.String> replaceWhereMetricsSchema ()  ;
  public  void testReplaceWhere (java.lang.String testName, scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f)  ;
  public  void testWithFlag (java.lang.String name, scala.collection.immutable.Seq<org.scalatest.Tag> tags, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  scala.collection.immutable.Set<java.lang.String> updateMetricsSchema ()  ;
}
