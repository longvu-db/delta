package org.apache.spark.sql.delta.test;
/**
 * Additional method definitions for Delta classes that are intended for use only in testing.
 */
public  class DeltaTestImplicits {
  static public  class OptimisticTxnTestHelper {
    public   OptimisticTxnTestHelper (org.apache.spark.sql.delta.OptimisticTransaction txn)  { throw new RuntimeException(); }
    /** Ensure that the initial commit of a Delta table always contains a Metadata action */
    public  long commitActions (org.apache.spark.sql.delta.DeltaOperations.Operation op, scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.Action> actions)  { throw new RuntimeException(); }
    public  long commitManually (scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.Action> actions)  { throw new RuntimeException(); }
    public  long commitWriteAppend (scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.Action> actions)  { throw new RuntimeException(); }
  }
  /** Add test-only File overloads for DeltaTable.forPath */
  static public  class DeltaLogObjectTestHelper {
    public   DeltaLogObjectTestHelper (org.apache.spark.sql.delta.DeltaLog$ deltaLog)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.DeltaLog forTable (org.apache.spark.sql.SparkSession spark, java.io.File dataPath)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.DeltaLog forTable (org.apache.spark.sql.SparkSession spark, java.io.File dataPath, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  }
  static public  class DeltaHistoryManagerTestHelper {
    public   DeltaHistoryManagerTestHelper (org.apache.spark.sql.delta.DeltaHistoryManager history)  { throw new RuntimeException(); }
    public  void checkVersionExists (long version)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.DeltaHistoryManager.Commit getActiveCommitAtTime (long timestamp, boolean canReturnLastCommit)  { throw new RuntimeException(); }
  }
  /** Helper class for working with {@link TableCommitCoordinatorClient} */
  static public  class TableCommitCoordinatorClientTestHelper {
    public   TableCommitCoordinatorClientTestHelper (org.apache.spark.sql.delta.coordinatedcommits.TableCommitCoordinatorClient tableCommitCoordinatorClient)  { throw new RuntimeException(); }
    public  void backfillToVersion (long version, scala.Option<java.lang.Object> lastKnownBackfilledVersion)  { throw new RuntimeException(); }
    public  io.delta.storage.commit.CommitResponse commit (long commitVersion, scala.collection.Iterator<java.lang.String> actions, io.delta.storage.commit.UpdatedActions updatedActions)  { throw new RuntimeException(); }
    public  io.delta.storage.commit.GetCommitsResponse getCommits (scala.Option<java.lang.Object> startVersion, scala.Option<java.lang.Object> endVersion)  { throw new RuntimeException(); }
  }
  /** Helper class for working with {@link Snapshot} */
  static public  class SnapshotTestHelper {
    public   SnapshotTestHelper (org.apache.spark.sql.delta.Snapshot snapshot)  { throw new RuntimeException(); }
    public  void ensureCommitFilesBackfilled ()  { throw new RuntimeException(); }
  }
  /**
   * Helper class for working with the most recent snapshot in the deltaLog
   */
  static public  class DeltaLogTestHelper {
    public   DeltaLogTestHelper (org.apache.spark.sql.delta.DeltaLog deltaLog)  { throw new RuntimeException(); }
    public  void checkpoint ()  { throw new RuntimeException(); }
    public  int checkpointInterval ()  { throw new RuntimeException(); }
    public  long deltaRetentionMillis ()  { throw new RuntimeException(); }
    public  boolean enableExpiredLogCleanup ()  { throw new RuntimeException(); }
    /**
     * Test helper method for getChangeLogFiles that provides catalogTableOpt = None
     * for backward compatibility with existing unit tests.
     * @param startVersion (undocumented)
     * @return (undocumented)
     */
    public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, org.apache.hadoop.fs.FileStatus>> getChangeLogFiles (long startVersion)  { throw new RuntimeException(); }
    /**
     * Test helper method for getChanges that provides catalogTableOpt = None for backward
     * compatibility with existing unit tests.
     * @param startVersion (undocumented)
     * @param failOnDataLoss (undocumented)
     * @return (undocumented)
     */
    public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.Action>>> getChanges (long startVersion, boolean failOnDataLoss)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.Snapshot snapshot ()  { throw new RuntimeException(); }
    public  void upgradeProtocol (org.apache.spark.sql.delta.actions.Protocol newVersion)  { throw new RuntimeException(); }
    public  void upgradeProtocol (org.apache.spark.sql.delta.Snapshot snapshot, org.apache.spark.sql.delta.actions.Protocol newVersion)  { throw new RuntimeException(); }
  }
  static public  class DeltaTableV2ObjectTestHelper {
    public   DeltaTableV2ObjectTestHelper (org.apache.spark.sql.delta.catalog.DeltaTableV2$ dt)  { throw new RuntimeException(); }
    /** Convenience overload that omits the cmd arg (which is not helpful in tests). */
    public  org.apache.spark.sql.delta.catalog.DeltaTableV2 apply (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.catalyst.TableIdentifier id)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.catalog.DeltaTableV2 apply (org.apache.spark.sql.SparkSession spark, java.io.File tableDir)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.catalog.DeltaTableV2 apply (org.apache.spark.sql.SparkSession spark, java.io.File tableDir, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  }
  static public  class DeltaTableV2TestHelper {
    public   DeltaTableV2TestHelper (org.apache.spark.sql.delta.catalog.DeltaTableV2 deltaTable)  { throw new RuntimeException(); }
    /** For backward compatibility with existing unit tests */
    public  org.apache.spark.sql.delta.Snapshot snapshot ()  { throw new RuntimeException(); }
  }
  static public  class TahoeLogFileIndexObjectTestHelper {
    public   TahoeLogFileIndexObjectTestHelper (org.apache.spark.sql.delta.files.TahoeLogFileIndex$ index)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.files.TahoeLogFileIndex apply (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.DeltaLog deltaLog)  { throw new RuntimeException(); }
  }
  static public  class AutoCompactObjectTestHelper {
    public   AutoCompactObjectTestHelper (org.apache.spark.sql.delta.hooks.AutoCompact$ ac)  { throw new RuntimeException(); }
      scala.collection.immutable.Seq<org.apache.spark.sql.delta.commands.optimize.OptimizeMetrics> compact (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.DeltaLog deltaLog, scala.collection.immutable.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionPredicates, java.lang.String opType)  { throw new RuntimeException(); }
  }
  static public  class StatisticsCollectionObjectTestHelper {
    public   StatisticsCollectionObjectTestHelper (org.apache.spark.sql.delta.stats.StatisticsCollection$ sc)  { throw new RuntimeException(); }
    /**
     * This is an implicit helper required for backward compatibility with existing
     * unit tests. It allows to call {@link StatisticsCollection.recompute} without a
     * catalog table and in the actual call, sets it to {@link None}.
     * @param spark (undocumented)
     * @param deltaLog (undocumented)
     * @param predicates (undocumented)
     * @param fileFilter (undocumented)
     */
    public  void recompute (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.DeltaLog deltaLog, scala.collection.immutable.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates, scala.Function1<org.apache.spark.sql.delta.actions.AddFile, java.lang.Object> fileFilter)  { throw new RuntimeException(); }
  }
  static public  class CDCReaderObjectTestHelper {
    public   CDCReaderObjectTestHelper (org.apache.spark.sql.delta.commands.cdc.CDCReader$ cdcReader)  { throw new RuntimeException(); }
    /**
     * Test helper method for changesToBatchDF that provides catalogTableOpt = None
     * for backward compatibility with existing unit tests.
     * @param deltaLog (undocumented)
     * @param start (undocumented)
     * @param end (undocumented)
     * @param spark (undocumented)
     * @param readSchemaSnapshot (undocumented)
     * @param useCoarseGrainedCDC (undocumented)
     * @param startVersionSnapshot (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> changesToBatchDF (org.apache.spark.sql.delta.DeltaLog deltaLog, long start, long end, org.apache.spark.sql.SparkSession spark, scala.Option<org.apache.spark.sql.delta.Snapshot> readSchemaSnapshot, boolean useCoarseGrainedCDC, scala.Option<org.apache.spark.sql.delta.SnapshotDescriptor> startVersionSnapshot)  { throw new RuntimeException(); }
  }
}
