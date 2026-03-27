package org.apache.spark.sql.delta.coordinatedcommits;
public  class TrackingCommitCoordinatorClient implements io.delta.storage.commit.CommitCoordinatorClient {
  public  io.delta.storage.commit.CommitCoordinatorClient delegatingCommitCoordinatorClient ()  { throw new RuntimeException(); }
  // not preceding
  public   TrackingCommitCoordinatorClient (io.delta.storage.commit.CommitCoordinatorClient delegatingCommitCoordinatorClient)  { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicInteger numCommitsCalled ()  { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicInteger numGetCommitsCalled ()  { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicInteger numBackfillToVersionCalled ()  { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicInteger numRegisterTableCalled ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T recordOperation (java.lang.String op, scala.Function0<T> f)  { throw new RuntimeException(); }
  public  io.delta.storage.commit.CommitResponse commit (io.delta.storage.LogStore logStore, org.apache.hadoop.conf.Configuration hadoopConf, io.delta.storage.commit.TableDescriptor tableDesc, long commitVersion, java.util.Iterator<java.lang.String> actions, io.delta.storage.commit.UpdatedActions updatedActions)  { throw new RuntimeException(); }
  public  io.delta.storage.commit.GetCommitsResponse getCommits (io.delta.storage.commit.TableDescriptor tableDesc, java.lang.Long startVersion, java.lang.Long endVersion)  { throw new RuntimeException(); }
  public  void backfillToVersion (io.delta.storage.LogStore logStore, org.apache.hadoop.conf.Configuration hadoopConf, io.delta.storage.commit.TableDescriptor tableDesc, long version, java.lang.Long lastKnownBackfilledVersion)  { throw new RuntimeException(); }
  public  boolean semanticEquals (io.delta.storage.commit.CommitCoordinatorClient other)  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.String> registerTable (org.apache.hadoop.fs.Path logPath, java.util.Optional<io.delta.storage.commit.TableIdentifier> tableIdentifier, long currentVersion, io.delta.storage.commit.actions.AbstractMetadata currentMetadata, io.delta.storage.commit.actions.AbstractProtocol currentProtocol)  { throw new RuntimeException(); }
}
