package org.apache.spark.sql.delta.rowid;
public  interface RowTrackingDeleteTestDimension extends org.apache.spark.sql.delta.rowid.RowIdTestUtils {
  /**
   * Create a table and validate that it has Row IDs and the expected number of files.
   * @param tableName (undocumented)
   * @param isPartitioned (undocumented)
   * @param multipleFilesPerPartition (undocumented)
   */
  public  void createTestTable (java.lang.String tableName, boolean isPartitioned, boolean multipleFilesPerPartition)  ;
  /**
   * Read the stable row IDs before and after the DELETE operation.
   * Validate the row IDs are the same.
   * @param whereCondition (undocumented)
   */
  public  void deleteAndValidateStableRowId (scala.Option<java.lang.String> whereCondition)  ;
  public  void executeDelete (scala.Option<java.lang.String> whereCondition)  ;
  public  int initialNumRows ()  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  public  java.lang.String testTableName ()  ;
  public  void withRowIdTestTable (boolean isPartitioned, scala.Function0<scala.runtime.BoxedUnit> f)  ;
}
