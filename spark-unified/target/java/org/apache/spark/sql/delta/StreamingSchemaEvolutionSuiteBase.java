package org.apache.spark.sql.delta;
public  interface StreamingSchemaEvolutionSuiteBase extends org.apache.spark.sql.delta.ColumnMappingStreamingTestUtils, org.apache.spark.sql.delta.DeltaSourceSuiteBase, org.apache.spark.sql.delta.test.DeltaColumnMappingSelectedTestMixin, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery AwaitTermination ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery AwaitTerminationIgnoreError ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.ExpectFailure<org.apache.spark.sql.delta.DeltaRuntimeException> ExpectMetadataEvolutionException ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.ExpectFailure<org.apache.spark.sql.delta.DeltaRuntimeException> ExpectMetadataEvolutionExceptionFromInitialization ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.ExpectFailure<org.apache.spark.sql.delta.DeltaRuntimeException> ExpectSchemaLogInitializationFailedException ()  ;
  public  void addColumn (java.lang.String column, java.lang.String dt, org.apache.spark.sql.delta.DeltaLog log)  ;
  public  void addData (scala.collection.immutable.Seq<java.lang.Object> data, scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema, org.apache.spark.sql.delta.DeltaLog log)  ;
  public  void allowSchemaLocationOutsideCheckpoint (scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void dropColumn (java.lang.String column, org.apache.spark.sql.delta.DeltaLog log)  ;
  public  org.apache.spark.sql.streaming.StreamTest.ExpectFailure<org.apache.spark.sql.delta.DeltaRuntimeException> expectSqlConfException (java.lang.String opType, long ver, java.lang.String columnChangeDetails, int checkpointHash)  ;
  public  org.apache.hadoop.fs.Path getDefaultCheckpoint (org.apache.spark.sql.delta.DeltaLog log)  ;
  public  org.apache.hadoop.fs.Path getDefaultSchemaLocation (org.apache.spark.sql.delta.DeltaLog log)  ;
  public  org.apache.spark.sql.delta.sources.DeltaSourceMetadataTrackingLog getDefaultSchemaLog (scala.Option<java.lang.String> sourceTrackingId, boolean initializeEagerly, org.apache.spark.sql.delta.DeltaLog log)  ;
  public  long indexWhenSchemaLogIsUpdated ()  ;
  public  org.apache.spark.sql.delta.actions.Metadata makeMetadata (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.types.StructType partitionSchema, org.apache.spark.sql.delta.DeltaLog log)  ;
  /**
   * Manually create a new offset with targeted reservoirVersion by copying it from the previous
   * offset.
   * @param checkpoint Checkpoint location
   * @param version Target version
   * @param index Target index fle.
   * @return The raw content for the updated offset file
   */
  public  java.lang.String manuallyCreateLatestStreamingOffsetUntilReservoirVersion (java.lang.String checkpoint, long version, long index)  ;
  /**
   * Write serialized offset content as a batch id for a particular checkpoint.
   * @param checkpoint Checkpoint location
   * @param batchId Target batch ID to write to
   * @param offsetContent Offset content
   */
  public  void manuallyCreateStreamingOffsetAtBatchId (java.lang.String checkpoint, long batchId, java.lang.String offsetContent)  ;
  /**
   * Manually delete the latest offset
   * @param checkpoint Checkpoint location
   */
  public  void manuallyDeleteLatestBatchId (java.lang.String checkpoint)  ;
  public  void overwriteSchema (org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Seq<java.lang.String> partitionColumns, org.apache.spark.sql.delta.DeltaLog log)  ;
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> readStream (scala.Option<java.lang.String> schemaLocation, scala.Option<java.lang.String> sourceTrackingId, scala.Option<java.lang.Object> startingVersion, scala.Option<java.lang.Object> maxFilesPerTrigger, scala.Option<java.lang.Object> ignoreDeletes, org.apache.spark.sql.delta.DeltaLog log)  ;
  public  void renameColumn (java.lang.String oldColumn, java.lang.String newColumn, org.apache.spark.sql.delta.DeltaLog log)  ;
  public  scala.collection.immutable.Seq<java.lang.String> runOnlyTests ()  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  /**
   * This test manually generates Delta source offsets that crosses non-additive schema change
   * boundaries to test if the schema log initialization check logic can detect those changes and
   * error out.
   * @param invalidAction (undocumented)
   * @param readStreamWithSchemaLocation (undocumented)
   * @param expectedLogInitException (undocumented)
   * @param log (undocumented)
   */
  public  void testDetectingInvalidOffsetDuringLogInit (java.lang.String invalidAction, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> readStreamWithSchemaLocation, org.apache.spark.sql.streaming.StreamTest.StreamAction expectedLogInitException, org.apache.spark.sql.delta.DeltaLog log)  ;
  /**
   * This test checks a corner case on the initialization of the schema log.
   * When a log is initialized, we would check over ALL pending batches and their delta versions
   * to ensure we have a safe schema to read all of them (i.e. no non-additive schema changes)
   * within the range.
   * This test checks the case when the last version of the range is a non-additive schema change,
   * but it does not need to be blocked because there's no data to be read during initialization.
   * @param readStreamWithSchemaLocation (undocumented)
   * @param expectLogInitException (undocumented)
   * @param log (undocumented)
   */
  public  void testLogInitializationWithoutBlockingOnSchemaChangeInTheEnd (scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> readStreamWithSchemaLocation, org.apache.spark.sql.streaming.StreamTest.StreamAction expectLogInitException, org.apache.spark.sql.delta.DeltaLog log)  ;
  public  void testSchemaEvolution (java.lang.String testName, boolean columnMapping, scala.collection.immutable.Seq<org.scalatest.Tag> tags, scala.Function1<org.apache.spark.sql.delta.DeltaLog, scala.runtime.BoxedUnit> f)  ;
  public  void testSchemasLocationMustBeUnderCheckpoint (java.lang.String checkpointLocation, java.lang.String schemaLocation, boolean expectValid, scala.Function1<org.apache.spark.sql.delta.DeltaAnalysisException, java.lang.Object> verify, org.apache.spark.sql.delta.DeltaLog log)  ;
  public  void testWithoutAllowStreamRestart (java.lang.String testName, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void upgradeToNameMode (org.apache.spark.sql.delta.DeltaLog log)  ;
  /**
   * Initialize a simple streaming DF for a simple table with just one (0, 0) entry for schema <a,b>
   * We also prepare an initialized schema log to skip the initialization phase.
   * @param f (undocumented)
   */
  public  void withSimpleStreamingDf (scala.Function2<scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>>, org.apache.spark.sql.delta.DeltaLog, scala.runtime.BoxedUnit> f)  ;
  /**
   * Initialize a starter table with 6 rows and schema STRUCT<a STRING, b STRING>
   * @param f (undocumented)
   */
  public  void withStarterTable (scala.Function1<org.apache.spark.sql.delta.DeltaLog, scala.runtime.BoxedUnit> f)  ;
  public  void withoutAllowStreamRestart (scala.Function0<scala.runtime.BoxedUnit> f)  ;
}
