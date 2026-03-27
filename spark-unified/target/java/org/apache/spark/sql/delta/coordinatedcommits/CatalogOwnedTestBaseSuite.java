package org.apache.spark.sql.delta.coordinatedcommits;
public  interface CatalogOwnedTestBaseSuite extends org.apache.spark.sql.delta.DeltaTestUtilsBase, org.apache.spark.sql.delta.coordinatedcommits.CommitCoordinatorUtilBase, org.apache.spark.sql.test.SharedSparkSession {
  public  void beforeEach ()  ;
  public  scala.Option<java.lang.Object> catalogOwnedCoordinatorBackfillBatchSize ()  ;
  public  boolean catalogOwnedDefaultCreationEnabledInTests ()  ;
  public  void clearBuilders ()  ;
  /**
   * Constructs the specific table properties for Catalog Owned tables.
   * <p>
   * @param spark The Spark session.
   * @param metadata The metadata of the CC table.
   * @return A map of CC specific table properties.
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> constructCatalogOwnedSpecificTableProperties (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.actions.Metadata metadata)  ;
  public  java.lang.String defaultCatalogOwnedFeatureEnabledKey ()  ;
  public  void deleteCatalogOwnedTableFromCommitCoordinator (java.lang.String tableName)  ;
  public  void deleteCatalogOwnedTableFromCommitCoordinator (org.apache.hadoop.fs.Path path)  ;
  /**
   * Returns the properties that are expected to show up in the table properties of a Delta table
   * when catalog owned is enabled in tests.
   * @param metadata (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterable<scala.Tuple2<java.lang.String, java.lang.String>> extractCatalogOwnedSpecificPropertiesIfEnabled (org.apache.spark.sql.delta.actions.Metadata metadata)  ;
  /**
   * Returns the commit coordinator client for the specified catalog.
   * <p>
   * @param catalogName The name of the catalog to get the commit coordinator client for.
   * @return The commit coordinator client for the specified catalog.
   */
  public  io.delta.storage.commit.CommitCoordinatorClient getCatalogOwnedCommitCoordinatorClient (java.lang.String catalogName)  ;
  public  scala.Tuple2<org.apache.spark.sql.delta.DeltaLog, org.apache.spark.sql.delta.Snapshot> getDeltaLogWithSnapshot (org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier)  ;
  public  boolean isCatalogOwnedTest ()  ;
  public  boolean isICTEnabledForNewTablesCatalogOwned ()  ;
  public  java.lang.String propertiesString ()  ;
  public  void registerBuilder (org.apache.spark.sql.delta.coordinatedcommits.CommitCoordinatorBuilder builder)  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  /**
   * Run the test against a {@link TrackingCommitCoordinatorClient} with backfill batch size =
   * <code>batchBackfillSize</code>
   * @param backfillBatchSize (undocumented)
   * @param testName (undocumented)
   * @param f (undocumented)
   */
  public  void testWithCatalogOwned (int backfillBatchSize, java.lang.String testName, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void testWithDefaultCommitCoordinatorUnset (java.lang.String testName, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void testWithDifferentBackfillInterval (java.lang.String testName, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> f)  ;
  public  void validateOnlySpecifiedQoLTableFeaturesAndMetadataPresent (java.lang.String tableName, scala.collection.immutable.Set<org.apache.spark.sql.delta.TableFeature> supportedTableFeatures)  ;
  public  void validateQoLFeaturesEnablement (java.lang.String tableName, boolean expected)  ;
  public  void validateRowTrackingEnablement (java.lang.String tableName, boolean expected)  ;
  public  void validateTableFeatureAndMetadata (java.lang.String tableName, org.apache.spark.sql.delta.TableFeature tableFeature, boolean tableFeatureShouldPresent, boolean metadataShouldPresent, org.apache.spark.sql.delta.DeltaConfig<?> config, java.lang.String targetValue)  ;
  public  void withClassicCheckpointPolicyForCatalogOwned (scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void withDefaultCCTableFeature (scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void withoutDefaultCCTableFeature (scala.Function0<scala.runtime.BoxedUnit> f)  ;
}
