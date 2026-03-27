package org.apache.spark.sql.delta.rowid;
public  interface RowTrackingMergeSuiteBase extends org.apache.spark.sql.delta.rowid.RowIdTestUtils, org.apache.spark.sql.delta.DeltaDMLTestUtils, org.apache.spark.sql.delta.MergeHelpers {
  public  java.lang.String SOURCE_TABLE_NAME ()  ;
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
  public  void createSourceTable (java.lang.String tableName, long lastModifiedVersion)  ;
  public  void executeMerge (java.lang.String targetReference, java.lang.String sourceReference, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses)  ;
  /**
   * This method retrieves the mapping of stored_id to row_id from the target table
   * before the merge operation.
   * It groups the collected data by stored_id and ensures that each stored_id
   * is associated with only row_id.
   * <p>
   * @return A Map of stored_id to row_id before the merge operation.
   */
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> getPreMergeRowIdMapping ()  ;
  public  int numRows ()  ;
  public  int numUnmatchedRows ()  ;
  /**
   * Create a test validating stable Row IDs and Row Commit Versions in MERGE. The test uses a fixed
   * source table and a modifiable target table. By default the source and the target table have
   * rows not matched in a join on 'key'.
   * <p>
   *                  source table                                   target table
   * <p>
   *                                                  |  key  | stored_id | last_modified_version |
   *                                                  |  0    |   0       |           0           |
   *                                                  |  1    |   1       |           0           |
   *                                                  |  ...  |   ...     |          ...          |
   *   |  key  | stored_id | last_modified_version |  |  1999 |   1999    |           0           |
   *   |  2000 |   2000    |           1           |  |  2000 |   2000    |           0           |
   *   |  2001 |   2001    |           1           |  |  2001 |   2001    |           0           |
   *   |  ...  |   ...     |          ...          |  |  ...  |   ...     |          ...          |
   *   |  3999 |   3999    |           1           |  |  3999 |   3999    |           0           |
   *   |  4000 |   4000    |           1           |
   *   |  ...  |   ...     |          ...          |
   *   |  5999 |   5999    |           1           |
   * <p>
   * Tests also include CDF validation, which only works if 'key' is not changed in update clauses.
   * @param name (undocumented)
   * @param partitionedTarget (undocumented)
   * @param targetAsView (undocumented)
   * @param source (undocumented)
   * @param targetTablePostSetupAction (undocumented)
   * @param sqlConfs (undocumented)
   * @param clauses (undocumented)
   * @param expected (undocumented)
   * @param numFilesAfterMerge (undocumented)
   */
  public  void rowTrackingMergeTests (java.lang.String name, boolean partitionedTarget, boolean targetAsView, scala.Function0<scala.Option<java.lang.String>> source, scala.Option<scala.Function0<scala.runtime.BoxedUnit>> targetTablePostSetupAction, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> sqlConfs, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses, scala.collection.immutable.Seq<org.apache.spark.sql.Row> expected, scala.Option<java.lang.Object> numFilesAfterMerge)  ;
  /**
   * This method validates the row commit versions after the merge operation.
   * It ensures that the row commit version for each row in the target table
   * matches its last_modified_version.
   * This is to ensure that the row commit version is updated correctly during
   * the merge operation.
   */
  public  void validateRowCommitVersionsPostMerge ()  ;
  /**
   * This method validates the row ids after the merge operation.
   * It ensures that the rows that existed before the merge
   * operation have kept their original row ids.
   * For the newly inserted rows, it checks that they have been assigned fresh row ids
   * that are greater than any row id before the merge operation.
   * <p>
   * @param preMergeRowIdMapping The mapping of stored_id to row_id before the merge operation.
   */
  public  void validateRowIdsPostMerge (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> preMergeRowIdMapping)  ;
  public  void withTestTable (boolean partitionedTarget, long lastModifiedVersion, scala.Function0<scala.runtime.BoxedUnit> f)  ;
}
