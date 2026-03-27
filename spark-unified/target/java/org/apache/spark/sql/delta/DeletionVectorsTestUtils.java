package org.apache.spark.sql.delta;
/** Collection of test utilities related with persistent Deletion Vectors. */
public  interface DeletionVectorsTestUtils extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLTestUtils {
  /** Name of the partition column used by {@link createTestDF()}. */
  public  java.lang.String PARTITION_COL ()  ;
  /** Helper to check that the Deletion Vectors of the provided file actions exist on disk. */
  public  void assertDeletionVectorsExist (org.apache.spark.sql.delta.DeltaLog log, scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.AddFile> filesWithDVs)  ;
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createTestDF (long start, long end, int numFiles, scala.Option<java.lang.Object> partitionColumn)  ;
  /** Delete the DV file in the given {@link AddFile}. Assumes the {@link AddFile} has a valid DV. */
  public  void deleteDVFile (java.lang.String tablePath, org.apache.spark.sql.delta.actions.AddFile addFile)  ;
  /** Utility method to remove a ratio of rows from the given file */
  public  void deleteRows (org.apache.spark.sql.delta.DeltaLog log, org.apache.spark.sql.delta.actions.AddFile file, long approxPhyRows, double ratioOfRowsToDelete)  ;
  public  boolean deletionVectorsEnabledInCommand (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.delta.DeltaLog deltaLog, org.apache.spark.internal.config.ConfigEntry<java.lang.Object> dmlConfig)  ;
  /** Whether persistent Deletion Vectors are enabled in DELETE command. */
  public  boolean deletionVectorsEnabledInDelete (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  /** Whether persistent Deletion Vectors are enabled in MERGE command. */
  public  boolean deletionVectorsEnabledInMerge (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  /** Whether persistent Deletion Vectors are enabled in UPDATE command. */
  public  boolean deletionVectorsEnabledInUpdate (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  /** Disable persistent deletion vectors in new tables and all supported DML commands. */
  public  void disableDeletionVectors (org.apache.spark.sql.RuntimeConfig conf)  ;
  public  void dropDVTableFeature (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.DeltaLog log, boolean truncateHistory)  ;
  public  void enableDeletionVectors (org.apache.spark.sql.SparkSession spark, boolean delete, boolean update, boolean merge)  ;
  /** Enable persistent deletion vectors in new tables and DELETE DML commands. */
  public  void enableDeletionVectors (org.apache.spark.sql.RuntimeConfig conf)  ;
  public  void enableDeletionVectorsForAllSupportedOperations (org.apache.spark.sql.SparkSession spark)  ;
  /** Enable persistent deletion vectors in new Delta tables. */
  public  void enableDeletionVectorsInNewTables (org.apache.spark.sql.RuntimeConfig conf)  ;
  /** Enable persistent Deletion Vectors in a Delta table with table path. */
  public  void enableDeletionVectorsInTable (org.apache.hadoop.fs.Path tablePath, boolean enable)  ;
  /** Enable persistent Deletion Vectors in a Delta table with table name. */
  public  void enableDeletionVectorsInTable (java.lang.String tableName, boolean enable)  ;
  /** Enable persistent Deletion Vectors in a Delta table. */
  public  void enableDeletionVectorsInTable (org.apache.spark.sql.delta.DeltaLog deltaLog, boolean enable)  ;
  public  scala.Tuple2<scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.AddFile>, scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.RemoveFile>> getFileActionsInLastVersion (org.apache.spark.sql.delta.DeltaLog log)  ;
  /** Returns all {@link AddFile} actions of a Delta table that contain Deletion Vectors. */
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.AddFile> getFilesWithDeletionVectors (org.apache.spark.sql.delta.DeltaLog log)  ;
  /** Lists the Deletion Vectors files of a table. */
  public  scala.collection.immutable.Seq<java.io.File> listDeletionVectors (org.apache.spark.sql.delta.DeltaLog log)  ;
  public  org.apache.spark.sql.delta.storage.dv.DeletionVectorStore newDVStore ()  ;
  /**
   * Removes the <code>numRowsToRemovePerFile</code> from each file via DV.
   * Returns the total number of rows removed.
   * @param log (undocumented)
   * @param numRowsToRemovePerFile (undocumented)
   * @return (undocumented)
   */
  public  long removeRowsFromAllFilesInLog (org.apache.spark.sql.delta.DeltaLog log, long numRowsToRemovePerFile)  ;
  /** Utility method to remove the given rows from the given file using DVs */
  public  void removeRowsFromFile (org.apache.spark.sql.delta.DeltaLog log, org.apache.spark.sql.delta.actions.AddFile addFile, scala.collection.immutable.Seq<java.lang.Object> rowIndexesToRemove)  ;
  /** Helper method to remove the specified rows in the given file using DVs */
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.Action> removeRowsFromFileUsingDV (org.apache.spark.sql.delta.DeltaLog log, org.apache.spark.sql.delta.actions.AddFile addFile, scala.collection.immutable.Seq<java.lang.Object> rowIds)  ;
  public  byte[] serializeRoaringBitmapArrayWithDefaultFormat (org.apache.spark.sql.delta.deletionvectors.RoaringBitmapArray dv)  ;
  public  void testWithDVs (java.lang.String testName, scala.collection.immutable.Seq<org.scalatest.Tag> testTags, scala.Function0<scala.runtime.BoxedUnit> thunk)  ;
  /**
   * Updates an {@link AddFile} with a {@link DeletionVectorDescriptor}.
   * @param addFile (undocumented)
   * @param dvDescriptor (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<org.apache.spark.sql.delta.actions.AddFile, org.apache.spark.sql.delta.actions.RemoveFile> updateFileDV (org.apache.spark.sql.delta.actions.AddFile addFile, org.apache.spark.sql.delta.actions.DeletionVectorDescriptor dvDescriptor)  ;
  /** Helper that verifies whether a defined number of DVs exist */
  public  void verifyDVsExist (org.apache.spark.sql.delta.DeltaLog targetLog, int filesWithDVsSize)  ;
  public <T extends java.lang.Object> T withDVWriter (org.apache.spark.sql.delta.DeltaLog log, java.util.UUID dvFileID, scala.Function1<org.apache.spark.sql.delta.storage.dv.DeletionVectorStoreUtils.Writer, T> fn)  ;
  /** Run a thunk with Deletion Vectors enabled/disabled. */
  public  void withDeletionVectorsEnabled (boolean enabled, scala.Function0<scala.runtime.BoxedUnit> thunk)  ;
  /** Helper to run 'fn' with a temporary Delta table. */
  public  void withTempDeltaTable (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataDF, scala.collection.immutable.Seq<java.lang.String> partitionBy, boolean enableDVs, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> conf, boolean createNameBasedTable, scala.Function2<scala.Function0<io.delta.tables.DeltaTable>, org.apache.spark.sql.delta.DeltaLog, scala.runtime.BoxedUnit> fn)  ;
  /** Create a temp path which contains special characters. */
  public  void withTempDir (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  ;
  /** Create a temp path which contains special characters. */
  public  void withTempPath (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  ;
  /**
   * Creates a {@link DeletionVectorDescriptor} from an {@link RoaringBitmapArray}
   * @param log (undocumented)
   * @param bitmapArray (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.delta.actions.DeletionVectorDescriptor writeDV (org.apache.spark.sql.delta.DeltaLog log, org.apache.spark.sql.delta.deletionvectors.RoaringBitmapArray bitmapArray)  ;
  /**
   * Produce a new {@link AddFile} that will store <code>dv</code> in the log using default settings for choosing
   * inline or on-disk storage.
   * <p>
   * Also returns the corresponding {@link RemoveFile} action for <code>currentFile</code>.
   * <p>
   * TODO: Always on-disk for now. Inline support comes later.
   * @param log (undocumented)
   * @param currentFile (undocumented)
   * @param dv (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.Action> writeFileWithDV (org.apache.spark.sql.delta.DeltaLog log, org.apache.spark.sql.delta.actions.AddFile currentFile, org.apache.spark.sql.delta.deletionvectors.RoaringBitmapArray dv)  ;
  /**
   * Produce a new {@link AddFile} that will reference the <code>dv</code> in the log while storing it on-disk.
   * <p>
   * Also returns the corresponding {@link RemoveFile} action for <code>currentFile</code>.
   * @param log (undocumented)
   * @param currentFile (undocumented)
   * @param dv (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.Action> writeFileWithDVOnDisk (org.apache.spark.sql.delta.DeltaLog log, org.apache.spark.sql.delta.actions.AddFile currentFile, org.apache.spark.sql.delta.deletionvectors.RoaringBitmapArray dv)  ;
  /**
   * Produce new {@link AddFile} actions that will reference associated DVs in the log while storing
   * all DVs in the same file on-disk.
   * <p>
   * Also returns the corresponding {@link RemoveFile} actions for the original file entries.
   * @param log (undocumented)
   * @param filesWithDVs (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.Action> writeFilesWithDVsOnDisk (org.apache.spark.sql.delta.DeltaLog log, scala.collection.immutable.Seq<scala.Tuple2<org.apache.spark.sql.delta.actions.AddFile, org.apache.spark.sql.delta.deletionvectors.RoaringBitmapArray>> filesWithDVs)  ;
}
