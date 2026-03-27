package org.apache.spark.sql.delta.rowid;
public  interface RowIdTestUtils extends org.apache.spark.sql.delta.rowtracking.RowTrackingTestUtils, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public  class DataFrameRowIdColumn {
    public   DataFrameRowIdColumn (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> withMaterializedRowCommitVersionColumn (java.lang.String materializedColumnName, org.apache.spark.sql.Column rowCommitVersionColumn)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> withMaterializedRowIdColumn (java.lang.String materializedColumnName, org.apache.spark.sql.Column rowIdColumn)  { throw new RuntimeException(); }
  }
  public  java.lang.String QUALIFIED_BASE_ROW_ID_COLUMN_NAME ()  ;
  public  void assertHighWatermarkIsCorrect (org.apache.spark.sql.delta.DeltaLog log)  ;
  public  void assertHighWatermarkIsCorrectAfterUpdate (org.apache.spark.sql.delta.DeltaLog log, long highWatermarkBeforeUpdate, long expectedNumRecordsWritten)  ;
  public  void assertRowIdsAreLargerThanValue (org.apache.spark.sql.delta.DeltaLog log, long value)  ;
  public  void assertRowIdsAreNotSet (org.apache.spark.sql.delta.DeltaLog log)  ;
  public  void assertRowIdsAreValid (org.apache.spark.sql.delta.DeltaLog log)  ;
  public  void assertRowIdsDoNotOverlap (org.apache.spark.sql.delta.DeltaLog log)  ;
  /**
   * Check that file actions do not violate Row ID invariants after an operation.
   * More specifically:
   *  - We do not reassign the base row ID to the same AddFile.
   *  - RemoveFiles have the same base row ID as the corresponding AddFile
   *    with the same file path.
   * @param log (undocumented)
   * @param operation (undocumented)
   */
  public  void checkFileActionInvariantBeforeAndAfterOperation (org.apache.spark.sql.delta.DeltaLog log, scala.Function0<scala.runtime.BoxedUnit> operation)  ;
  public  void checkFileLayout (java.io.File dir, int numFiles, int numRowGroupsPerFile, int rowCountPerRowGroup)  ;
  /** Check that the high watermark does not get updated if there aren't any new files */
  public  void checkHighWatermarkBeforeAndAfterOperation (org.apache.spark.sql.delta.DeltaLog log, scala.Function0<scala.runtime.BoxedUnit> operation)  ;
  public  void checkRowTrackingMarkedAsPreservedForCommit (org.apache.spark.sql.delta.DeltaLog log, scala.Function0<scala.runtime.BoxedUnit> operation)  ;
  public  scala.Option<java.lang.String> extractMaterializedRowCommitVersionColumnName (org.apache.spark.sql.delta.DeltaLog log)  ;
  public  scala.Option<java.lang.String> extractMaterializedRowIdColumnName (org.apache.spark.sql.delta.DeltaLog log)  ;
  /** Returns a Map of file path to base row ID from the AddFiles in a Snapshot. */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> getAddFilePathToBaseRowIdMap (org.apache.spark.sql.delta.Snapshot snapshot)  ;
  /** Returns a Map of file path to base row ID from the RemoveFiles in a Snapshot. */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> getRemoveFilePathToBaseRowIdMap (org.apache.spark.sql.delta.Snapshot snapshot)  ;
  public  scala.Tuple2<java.lang.Object, java.lang.Object> getRowIdRangeInclusive (org.apache.spark.sql.delta.actions.AddFile f)  ;
  /**
   * Returns a Boolean indicating whether the last commit on a Delta table has the tag
   * {@link DeltaCommitTag.RowTrackingEnablementOnlyTag.key}.
   * @param log (undocumented)
   * @return (undocumented)
   */
  public  boolean lastCommitHasRowTrackingEnablementOnlyTag (org.apache.spark.sql.delta.DeltaLog log)  ;
  public  scala.collection.immutable.Seq<scala.collection.immutable.Seq<org.apache.parquet.hadoop.metadata.BlockMetaData>> readRowGroupsPerFile (java.io.File dir)  ;
  /**
   * Checks whether Row tracking is marked as preserved on the {@link CommitInfo} action
   * committed during <code>operation</code>.
   * @param log (undocumented)
   * @param operation (undocumented)
   * @return (undocumented)
   */
  public  boolean rowTrackingMarkedAsPreservedForCommit (org.apache.spark.sql.delta.DeltaLog log, scala.Function0<scala.runtime.BoxedUnit> operation)  ;
  /**
   * This triggers backfill on the test table in this suite by calling the user-facing syntax
   * <code>ALTER TABLE t SET TBLPROPERTIES()</code>. We check for proper protocol upgrade (if any) and
   * that the table has valid row IDs afterwards.
   * @param targetTableName (undocumented)
   * @param numRowsInTable (undocumented)
   * @param log (undocumented)
   */
  public  void triggerBackfillOnTestTableUsingAlterTable (java.lang.String targetTableName, int numRowsInTable, org.apache.spark.sql.delta.DeltaLog log)  ;
  /**
   * Capture backfill related metrics for basic validation.
   * @param expectedNumSuccessfulBatches (undocumented)
   * @param nameOfTriggeringOperation (undocumented)
   * @param testBlock (undocumented)
   */
  public  void validateSuccessfulBackfillMetrics (int expectedNumSuccessfulBatches, java.lang.String nameOfTriggeringOperation, scala.Function0<scala.runtime.BoxedUnit> testBlock)  ;
}
