package org.apache.spark.sql.delta.commands.backfill;
public  interface RowTrackingBackfillConflictsTestBase extends org.apache.spark.sql.delta.rowid.RowIdTestUtils, org.apache.spark.sql.delta.concurrency.TransactionExecutionTestMixin, org.apache.spark.sql.delta.concurrency.PhaseLockingTestMixin, org.apache.spark.sql.test.SharedSparkSession {
  public  class BackgroundErrorSink {
    static public  void recordError (java.lang.Throwable t)  { throw new RuntimeException(); }
    static public  boolean isEmpty ()  { throw new RuntimeException(); }
    static public  boolean hasErrors ()  { throw new RuntimeException(); }
    static public  void clear ()  { throw new RuntimeException(); }
    static public  void checkAndThrow ()  { throw new RuntimeException(); }
  }
  public  class BackgroundErrorSink$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BackgroundErrorSink$ MODULE$ = null;
    public   BackgroundErrorSink$ ()  { throw new RuntimeException(); }
    public  void recordError (java.lang.Throwable t)  { throw new RuntimeException(); }
    public  boolean isEmpty ()  { throw new RuntimeException(); }
    public  boolean hasErrors ()  { throw new RuntimeException(); }
    public  void clear ()  { throw new RuntimeException(); }
    public  void checkAndThrow ()  { throw new RuntimeException(); }
  }
  public  class TrackingBackfillExecutionObserver {
    static protected  scala.Option<org.apache.spark.sql.delta.commands.backfill.BackfillExecutionObserver> nextObserver ()  { throw new RuntimeException(); }
    static public <T extends java.lang.Object> T executeBatch (scala.Function0<T> f)  { throw new RuntimeException(); }
    static protected  void nextObserver_$eq (scala.Option<O> x$1)  { throw new RuntimeException(); }
    static public  void setNextObserver (O nextTxnObserver)  { throw new RuntimeException(); }
    static public  void advanceToNextThreadObserver ()  { throw new RuntimeException(); }
  }
  public  class TrackingBackfillExecutionObserver$ implements org.apache.spark.sql.delta.commands.backfill.BackfillExecutionObserver {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TrackingBackfillExecutionObserver$ MODULE$ = null;
    protected  scala.Option<org.apache.spark.sql.delta.commands.backfill.BackfillExecutionObserver> nextObserver ()  { throw new RuntimeException(); }
    public   TrackingBackfillExecutionObserver$ ()  { throw new RuntimeException(); }
    public <T extends java.lang.Object> T executeBatch (scala.Function0<T> f)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.delta.commands.backfill.RowTrackingBackfillConflictsTestBase.BackgroundErrorSink$ BackgroundErrorSink ()  ;
  public  org.apache.spark.sql.delta.commands.backfill.RowTrackingBackfillConflictsTestBase.TrackingBackfillExecutionObserver$ TrackingBackfillExecutionObserver ()  ;
  public  void assertAbortedBecauseOfConcurrentWrite (org.apache.spark.SparkException exception)  ;
  public  void assertAbortedBecauseOfMetadataChange (java.util.concurrent.ExecutionException exception)  ;
  public  void assertAbortedBecauseOfMetadataChange (org.apache.spark.SparkException exception)  ;
  public  java.util.concurrent.ConcurrentLinkedDeque<org.apache.spark.sql.delta.fuzzer.PhaseLockingTransactionExecutionObserver> backfillObservers ()  ;
  public  org.apache.spark.sql.Row[] backfillTransaction ()  ;
  public  void busyWaitForPreparePhase (org.apache.spark.sql.delta.fuzzer.PhaseLockingTransactionExecutionObserver observer)  ;
  public  boolean causedByMetadataUpdate (java.lang.Throwable exception)  ;
  public  java.lang.String colName ()  ;
  public  void commitPreparedBackfillBatchCommit ()  ;
  public  void commitSingleBackfillBatch ()  ;
  public  org.apache.spark.sql.delta.DeltaLog deltaLog ()  ;
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> insertedRowDF ()  ;
  public  org.apache.spark.sql.delta.Snapshot latestSnapshot ()  ;
  public  java.util.concurrent.Future<?> launchBackFillAndBlockAfterFeatureIsCommitted ()  ;
  public  java.util.concurrent.Future<?> launchBackfillInBackgroundThread ()  ;
  public  int numFiles ()  ;
  public  int numPartitions ()  ;
  public  int numRows ()  ;
  public  java.lang.String partitionColumnName ()  ;
  public  void prepareSingleBackfillBatchCommit ()  ;
  /**
   * Sets explicit insertion times on files to guarantee deterministic ordering for backfill.
   * Files in partitions 0-1 get early insertion time (batch 1).
   * Files in partitions 2-3 get later insertion time (batch 2).
   */
  public  void setDeterministicInsertionTimes ()  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> tableCreationAfterInsert ()  ;
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> tableCreationDF ()  ;
  /**
   * This is a modification of scenario 5 in {@link RowTrackingBackfillConflictsSuite} with an
   * extra insert and failure expectations for commitLarge test.
   * @param concurrentTransaction (undocumented)
   * @param expectedResult (undocumented)
   */
  public  void testScenario5WithCommitLarge (scala.Function0<org.apache.spark.sql.Row[]> concurrentTransaction, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedResult)  ;
  /**
   * This is a modification of scenario 6 in {@link RowTrackingBackfillConflictsSuite} with an extra
   * insert and failure expectations for commitLarge test.
   * @param concurrentTransaction (undocumented)
   */
  public  void testScenario6WithCommitLarge (scala.Function0<org.apache.spark.sql.Row[]> concurrentTransaction)  ;
  public  java.lang.String testTableName ()  ;
  public  boolean usePersistentDeletionVectors ()  ;
  public  void validateResult (scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> expectedResult)  ;
  public  void withEmptyTestTable (scala.Function0<scala.runtime.BoxedUnit> testBlock)  ;
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> withPartitionColumn (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataFrame)  ;
  public  void withTestTable (scala.Function0<scala.runtime.BoxedUnit> testBlock)  ;
  public  void withTrackedBackfillCommits (scala.Function0<scala.runtime.BoxedUnit> testBlock)  ;
}
