package org.apache.spark.sql.delta;
public  class ConcurrentBackfillCommitCoordinatorClient extends org.apache.spark.sql.delta.coordinatedcommits.InMemoryCommitCoordinator implements scala.Product, java.io.Serializable {
  static public  boolean deferBackfills ()  { throw new RuntimeException(); }
  static public  boolean beginConcurrentBackfills ()  { throw new RuntimeException(); }
  // not preceding
  public  long synchronousBackfillThreshold ()  { throw new RuntimeException(); }
  public  long batchSize ()  { throw new RuntimeException(); }
  // not preceding
  public   ConcurrentBackfillCommitCoordinatorClient (long synchronousBackfillThreshold, long batchSize)  { throw new RuntimeException(); }
  public  io.delta.storage.commit.GetCommitsResponse getCommits (io.delta.storage.commit.TableDescriptor tableDesc, java.lang.Long startVersion, java.lang.Long endVersion)  { throw new RuntimeException(); }
  public  void backfill (io.delta.storage.LogStore logStore, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.hadoop.fs.Path logPath, long version, org.apache.hadoop.fs.FileStatus fileStatus)  { throw new RuntimeException(); }
}
