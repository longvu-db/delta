package org.apache.spark.sql.delta;
public  interface DeltaRetentionSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.coordinatedcommits.CatalogOwnedTestBaseSuite {
  /** Compares the given versions with expected and generates a nice error message. */
  public  void compareVersions (scala.collection.immutable.Set<java.lang.Object> versions, java.lang.String logType, scala.collection.Iterable<java.lang.Object> expected)  ;
  /**
   * Creates a sidecar file with the given AddFiles.
   * <p>
   * @param log The DeltaLog to which the sidecar file will be added.
   * @param files A sequence of integers representing the AddFile indices.
   * @return The name of the created sidecar file.
   */
  public  java.lang.String createSidecarFile (org.apache.spark.sql.delta.DeltaLog log, scala.collection.immutable.Seq<java.lang.Object> files)  ;
  public  void createV2CheckpointWithSidecarFile (org.apache.spark.sql.delta.DeltaLog log, long version, scala.collection.immutable.Seq<java.lang.String> sidecarFileNames)  ;
  public  long day (long startTime, int day)  ;
  public  scala.collection.immutable.Seq<java.io.File> getCheckpointFiles (java.io.File dir)  ;
  public  scala.collection.immutable.Set<java.lang.Object> getCheckpointVersions (java.io.File dir)  ;
  public  scala.collection.immutable.Seq<java.io.File> getCrcFiles (java.io.File dir)  ;
  public  scala.collection.immutable.Set<java.lang.Object> getCrcVersions (java.io.File dir)  ;
  public  scala.collection.immutable.Seq<java.io.File> getDeltaAndCrcFiles (java.io.File dir)  ;
  public  scala.collection.immutable.Seq<java.io.File> getDeltaFiles (java.io.File dir)  ;
  public  scala.collection.immutable.Set<java.lang.Object> getDeltaVersions (java.io.File dir)  ;
  public  scala.collection.immutable.Set<java.lang.Object> getFileVersions (scala.collection.immutable.Seq<java.io.File> files)  ;
  public  scala.collection.immutable.Seq<java.io.File> getLogFiles (java.io.File dir)  ;
  public  scala.collection.immutable.Set<java.lang.String> getSidecarFiles (org.apache.spark.sql.delta.DeltaLog log)  ;
  /**
   * Returns milliseconds since epoch at 1:00am UTC of current day.
   * <p>
   * Context:
   * Most DeltaRetentionSuite tests rely on ManualClock to time travel and
   * trigger metadata cleanup. Cleanup boundaries are determined by
   * finding files that were modified before 00:00 of the day on which
   * currentTime-LOG_RETENTION_PERIOD falls. This means that for a long running
   * test started at 23:59, the number of expired files would jump suddenly
   * in 1 minute (the expiration boundary would move by a day as soon as
   * system clock hits 00:00 of the next day). By fixing the start time of the
   * test to 01:00, we avoid these scenarios.
   * <p>
   * This would still break if the test runs for more than 23 hours.
   * @return (undocumented)
   */
  public  long getStartTimeForRetentionTest ()  ;
  public  scala.collection.immutable.Seq<java.io.File> getUnbackfilledDeltaFiles (java.io.File dir)  ;
  public  scala.collection.immutable.Set<java.lang.Object> getUnbackfilledDeltaVersions (java.io.File dir)  ;
  public  long intervalStringToMillis (java.lang.String str)  ;
  public  void setModificationTime (org.apache.spark.sql.delta.DeltaLog log, long startTime, int version, int dayNum, org.apache.hadoop.fs.FileSystem fs, boolean checkpointOnly)  ;
  public  void setModificationTimeOfNewFiles (org.apache.spark.sql.delta.DeltaLog log, org.apache.spark.util.ManualClock clock, scala.collection.mutable.Set<java.lang.String> visitedFiled)  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  /**
   * Start a txn that disables automatic log cleanup. Some tests may need to manually clean up logs
   * to get deterministic behaviors.
   * @param log (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.delta.OptimisticTransaction startTxnWithManualLogCleanup (org.apache.spark.sql.delta.DeltaLog log)  ;
  public  org.apache.spark.sql.delta.DeltaOperations.Truncate testOp ()  ;
}
