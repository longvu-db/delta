package org.apache.spark.sql.delta;
public  interface DeltaProtocolVersionSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.DeletionVectorsTestUtils {
  public  void assertPropertiesAndShowTblProperties (org.apache.spark.sql.delta.DeltaLog deltaLog, boolean tableHasFeatures)  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> captureProtocolChangeEventBlob (scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void createTableWithFeature (org.apache.spark.sql.delta.DeltaLog deltaLog, org.apache.spark.sql.delta.TableFeature feature, java.lang.String featureProperty)  ;
  public  org.apache.spark.sql.delta.DeltaLog createTableWithProtocol (org.apache.spark.sql.delta.actions.Protocol protocol, java.io.File path, org.apache.spark.sql.types.StructType schema)  ;
  public  void dropV2CheckpointsTableFeature (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.DeltaLog log)  ;
  public  org.apache.spark.sql.delta.actions.Protocol emptyProtocolWithReaderFeatures ()  ;
  public  org.apache.spark.sql.delta.actions.Protocol emptyProtocolWithWriterFeatures ()  ;
  /** Assumes there is at least 1 commit. */
  public  long getEarliestCommitVersion (org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  public  org.apache.spark.sql.delta.actions.Protocol protocolWithFeatures (scala.collection.immutable.Seq<org.apache.spark.sql.delta.TableFeature> readerFeatures, scala.collection.immutable.Seq<org.apache.spark.sql.delta.TableFeature> writerFeatures)  ;
  public  org.apache.spark.sql.delta.actions.Protocol protocolWithReaderFeature (org.apache.spark.sql.delta.TableFeature readerFeature)  ;
  public  org.apache.spark.sql.delta.actions.Protocol protocolWithWriterFeature (org.apache.spark.sql.delta.TableFeature writerFeature)  ;
  public  void replaceTableAs (java.io.File path)  ;
  public  void setUpCoordinatedCommitsTable (java.io.File dir, org.apache.spark.sql.delta.coordinatedcommits.CommitCoordinatorBuilder mcBuilder)  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  public  void testAlterTable (java.lang.String name, scala.collection.immutable.Map<java.lang.String, java.lang.String> props, scala.Option<java.lang.String> expectedExceptionClass, scala.Option<org.apache.spark.sql.delta.actions.Protocol> expectedFinalProtocol, org.apache.spark.sql.delta.actions.Protocol tableProtocol)  ;
  public  void testCreateTable (java.lang.String name, scala.collection.immutable.Map<java.lang.String, java.lang.String> props, scala.Option<java.lang.String> expectedExceptionClass, scala.Option<org.apache.spark.sql.delta.actions.Protocol> expectedFinalProtocol)  ;
  /** Creates a Delta table and checks the expected protocol version */
  public  void testCreation (java.lang.String tableName, int writerVersion, boolean tableInitialized, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> fn)  ;
  public  void testInvalidProtocolErrorMessageWithTableName (boolean warm)  ;
  public  void testProtocolVersionDowngrade (int initialMinReaderVersion, int initialMinWriterVersion, scala.collection.immutable.Seq<org.apache.spark.sql.delta.TableFeature> featuresToAdd, scala.collection.immutable.Seq<org.apache.spark.sql.delta.TableFeature> featuresToRemove, org.apache.spark.sql.delta.actions.Protocol expectedDowngradedProtocol, boolean truncateHistory)  ;
  public  void testReaderFeatureRemoval (org.apache.spark.sql.delta.TableFeature feature, java.lang.String featurePropertyKey, boolean advanceClockPastRetentionPeriod, boolean truncateHistory, scala.Option<java.lang.String> truncateHistoryRetentionOpt)  ;
  public  void testRedirectFeature (org.apache.spark.sql.delta.TableFeature redirectFeature, org.apache.spark.sql.delta.redirect.TableRedirect tableRedirect, boolean enableFastDrop, boolean unsetTableProperty)  ;
  public  void testRemoveVacuumProtocolCheckTableFeature (boolean enableFeatureInitially, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> additionalTableProperties, scala.Option<java.lang.String> downgradeFailsWithException, boolean featureExpectedAtTheEnd)  ;
  public  void testTableFeatureErrorMessageWithTableName (boolean warm)  ;
  public  void testUnsupportedFeature (java.lang.String commandName, boolean emptyTable, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> command)  ;
  public  void testV2CheckpointTableFeatureDrop (org.apache.spark.sql.delta.V2Checkpoint.Format v2CheckpointFormat, boolean withInitialV2Checkpoint, boolean forceMultiPartCheckpoint)  ;
  public  void testWriterFeatureRemoval (org.apache.spark.sql.delta.TableFeature feature, java.lang.String featurePropertyKey)  ;
  public  org.apache.spark.unsafe.types.CalendarInterval truncateHistoryDefaultLogRetention ()  ;
  public  void untrackedChangeProtocolVersion (org.apache.spark.sql.delta.DeltaLog log, long version, int tableProtocolReaderVersion, int tableProtocolWriterVersion)  ;
  public  void untrackedChangeProtocolVersion (org.apache.spark.sql.delta.DeltaLog log, long version, org.apache.spark.sql.delta.actions.Protocol protocol)  ;
  public  void validateCoordinatedCommitsDropLogs (scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> usageLogs, boolean expectTablePropertiesPresent, boolean expectUnbackfilledCommitsPresent, scala.Option<java.lang.String> exceptionMessageOpt)  ;
  public  void validateICTRemovalMetrics (scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> usageLogs, boolean expectEnablementProperty, boolean expectProvenanceTimestampProperty, boolean expectProvenanceVersionProperty)  ;
  public  void validateInvalidProtocolVersionException (org.apache.spark.sql.delta.InvalidProtocolVersionException exception, java.lang.String tableNameOrPath, int readerRequiredVersion, int writerRequiredVersion)  ;
  public  void validateUnsupportedTableFeatureException (org.apache.spark.sql.delta.DeltaUnsupportedTableFeatureException exception, java.lang.String errorClass, java.lang.String tableNameOrPath, scala.collection.Iterable<java.lang.String> unsupportedFeatures)  ;
  public  void validateUnsupportedTableReadFeatureException (org.apache.spark.sql.delta.DeltaUnsupportedTableFeatureException exception, java.lang.String tableNameOrPath, scala.collection.Iterable<java.lang.String> unsupportedFeatures)  ;
  public  void validateUnsupportedTableWriteFeatureException (org.apache.spark.sql.delta.DeltaUnsupportedTableFeatureException exception, java.lang.String tableNameOrPath, scala.collection.Iterable<java.lang.String> unsupportedFeatures)  ;
  public  void withTestTableWithUnsupportedWriterFeature (boolean emptyTable, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> testCode)  ;
}
