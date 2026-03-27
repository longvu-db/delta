package org.apache.spark.sql.delta.coordinatedcommits;
public  interface CommitCoordinatorClientImplSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.storage.LogStoreProvider, org.apache.spark.sql.delta.coordinatedcommits.CoordinatedCommitsTestUtils, org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public  void assertBackfilled (long version, org.apache.hadoop.fs.Path logPath, scala.Option<java.lang.Object> timestampOpt)  ;
  public  void assertCommitFail (long currentVersion, long expectedVersion, boolean retryable, scala.Function0<io.delta.storage.commit.Commit> commitFunc)  ;
  /**
   * Checks that the commit coordinator state is correct in terms of
   *  - The latest table version in the commit coordinator is correct
   *  - All supposedly backfilled commits are indeed backfilled
   *  - The contents of the backfilled commits are correct (verified
   *     if commitTimestampOpt is provided)
   * <p>
   * This can be overridden by implementing classes to implement
   * more specific invariants.
   * @param logPath (undocumented)
   * @param tableCommitCoordinatorClient (undocumented)
   * @param commitTimestampsOpt (undocumented)
   */
  public  void assertInvariants (org.apache.hadoop.fs.Path logPath, org.apache.spark.sql.delta.coordinatedcommits.TableCommitCoordinatorClient tableCommitCoordinatorClient, scala.Option<long[]> commitTimestampsOpt)  ;
  public  void assertResponseEquals (io.delta.storage.commit.GetCommitsResponse resp1, io.delta.storage.commit.GetCommitsResponse resp2)  ;
  public  io.delta.storage.commit.Commit commit (long version, long timestamp, org.apache.spark.sql.delta.coordinatedcommits.TableCommitCoordinatorClient tableCommitCoordinatorClient, scala.Option<org.apache.spark.sql.catalyst.TableIdentifier> tableIdentifier)  ;
  /**
   * Needs to be overwritten by implementing classes to provide a {@link TableCommitCoordinatorClient}
   * wrapping the commit coordinator client that should be tested.
   * @param deltaLog (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.delta.coordinatedcommits.TableCommitCoordinatorClient createTableCommitCoordinatorClient (org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  /**
   * The metadata that should be passed to the registerTable call. By default, this
   * is empty but implementing classes can overwrite this method to provide custom
   * metadata.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.delta.actions.Metadata initMetadata ()  ;
  /**
   * Needs to be overwritten by implementing classes to provide an implementation
   * of backfill registration.
   * @param tableCommitCoordinatorClient (undocumented)
   * @param deltaLog (undocumented)
   * @param version (undocumented)
   */
  public  void registerBackfillOp (org.apache.spark.sql.delta.coordinatedcommits.TableCommitCoordinatorClient tableCommitCoordinatorClient, org.apache.spark.sql.delta.DeltaLog deltaLog, long version)  ;
  public  org.apache.hadoop.conf.Configuration sessionHadoopConf ()  ;
  public  org.apache.spark.sql.delta.storage.LogStore store ()  ;
  /**
   * Needs to be overwritten by implementing classes to provide a way of validating
   * that the commit coordinator client under test performs backfilling as expected at
   * the specified version.
   * @param tableCommitCoordinatorClient (undocumented)
   * @param logPath (undocumented)
   * @param version (undocumented)
   */
  public  void validateBackfillStrategy (org.apache.spark.sql.delta.coordinatedcommits.TableCommitCoordinatorClient tableCommitCoordinatorClient, org.apache.hadoop.fs.Path logPath, long version)  ;
  /**
   * Needs to be overwritten by implementing classes to provide a way of validating
   * the results of a getCommits call with the specified start and end versions,
   * where maxVersion is the current latest version of the table.
   * @param response (undocumented)
   * @param startVersion (undocumented)
   * @param endVersion (undocumented)
   * @param maxVersion (undocumented)
   */
  public  void validateGetCommitsResult (io.delta.storage.commit.GetCommitsResponse response, scala.Option<java.lang.Object> startVersion, scala.Option<java.lang.Object> endVersion, long maxVersion)  ;
  public  void withTempTableDir (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  ;
  public  void writeCommitZero (org.apache.hadoop.fs.Path logPath)  ;
}
