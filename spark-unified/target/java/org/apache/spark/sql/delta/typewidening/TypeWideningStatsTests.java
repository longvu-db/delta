package org.apache.spark.sql.delta.typewidening;
public  interface TypeWideningStatsTests {
  /**
   * Checks that stats and parsed partition values are stored in the checkpoint when enabled and
   * that their type matches the expected type.
   * @param checkpoint (undocumented)
   * @param colName (undocumented)
   * @param colType (undocumented)
   * @param partitioned (undocumented)
   * @param jsonStatsEnabled (undocumented)
   * @param structStatsEnabled (undocumented)
   */
  public  void checkCheckpointStats (org.apache.spark.sql.delta.LastCheckpointInfo checkpoint, java.lang.String colName, org.apache.spark.sql.types.DataType colType, boolean partitioned, boolean jsonStatsEnabled, boolean structStatsEnabled)  ;
  /**
   * Reads the test table filtered by the given value and checks that files are skipped as expected.
   * @param filterValue (undocumented)
   * @param expectedFilesRead (undocumented)
   */
  public  void checkFileSkipping (Object filterValue, long expectedFilesRead)  ;
  /** Returns the type used to store JSON stats in the checkpoint if JSON stats are present. */
  public  scala.Option<org.apache.spark.sql.types.DataType> getJsonStatsType (org.apache.spark.sql.delta.LastCheckpointInfo checkpoint)  ;
  /** Returns the latest checkpoint for the test table. */
  public  org.apache.spark.sql.delta.LastCheckpointInfo getLatestCheckpoint ()  ;
  /**
   * Returns the type used to store parsed partition values for the given column in the checkpoint
   * if these are present.
   * @param checkpoint (undocumented)
   * @param colName (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.types.DataType> getPartitionValuesType (org.apache.spark.sql.delta.LastCheckpointInfo checkpoint, java.lang.String colName)  ;
  /**
   * Returns the type used to store parsed stat values for the given column in the checkpoint if
   * these are present.
   * @param checkpoint (undocumented)
   * @param colName (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.types.DataType> getStructStatsType (org.apache.spark.sql.delta.LastCheckpointInfo checkpoint, java.lang.String colName)  ;
  /**
   * Helper to create a table and run tests while enabling/disabling storing stats as JSON string or
   * strongly-typed structs in checkpoint files. Creates a
   * @param name (undocumented)
   * @param partitioned (undocumented)
   * @param jsonStatsEnabled (undocumented)
   * @param structStatsEnabled (undocumented)
   * @param body (undocumented)
   */
  public  void testStats (java.lang.String name, boolean partitioned, boolean jsonStatsEnabled, boolean structStatsEnabled, scala.Function0<scala.runtime.BoxedUnit> body)  ;
}
