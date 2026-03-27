package org.apache.spark.sql.delta.coordinatedcommits;
public  interface UCCommitCoordinatorClientSuiteBase extends org.apache.spark.sql.delta.coordinatedcommits.CommitCoordinatorClientImplSuiteBase {
  public  void beforeAll ()  ;
  public  void beforeEach ()  ;
  public  org.apache.spark.sql.delta.coordinatedcommits.TableCommitCoordinatorClient createTableCommitCoordinatorClient (org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  public  org.apache.spark.sql.delta.actions.Metadata initMetadata ()  ;
  /**
   * A unique metastore ID for each test.
   * @return (undocumented)
   */
  public  java.util.UUID metastoreId ()  ;
  public  org.apache.spark.sql.delta.coordinatedcommits.UCClientFactory mockFactory ()  ;
  public  void registerBackfillOp (org.apache.spark.sql.delta.coordinatedcommits.TableCommitCoordinatorClient tableCommitCoordinatorClient, org.apache.spark.sql.delta.DeltaLog deltaLog, long version)  ;
  /**
   * A unique table ID for each test.
   * @return (undocumented)
   */
  public  java.util.UUID tableUUID ()  ;
  public  io.delta.storage.commit.uccommitcoordinator.UCClient ucClient ()  ;
  public  org.apache.spark.sql.delta.coordinatedcommits.InMemoryUCCommitCoordinator ucCommitCoordinator ()  ;
  public  void validateBackfillStrategy (org.apache.spark.sql.delta.coordinatedcommits.TableCommitCoordinatorClient tableCommitCoordinatorClient, org.apache.hadoop.fs.Path logPath, long version)  ;
  public  void validateGetCommitsResult (io.delta.storage.commit.GetCommitsResponse response, scala.Option<java.lang.Object> startVersion, scala.Option<java.lang.Object> endVersion, long maxVersion)  ;
  public  void waitForBackfill (long version, org.apache.spark.sql.delta.coordinatedcommits.TableCommitCoordinatorClient tableCommitCoordinatorClient)  ;
}
