package org.apache.spark.sql.delta;
public  interface IdentityColumnTestUtils extends org.apache.spark.sql.delta.DDLTestUtils {
  /**
   * Helper function to validate generated identity values in sortedRows.
   * <p>
   * @param sortedRows rows of the table sorted by id
   * @param start start value of the identity column
   * @param step step value of the identity column
   * @param expectedLowerBound expected lower bound of the generated values
   * @param expectedUpperBound expected upper bound of the generated values
   * @param expectedDistinctCount expected distinct count of the generated values
   */
  public  void checkGeneratedIdentityValues (scala.collection.immutable.Seq<org.apache.spark.sql.delta.IdentityColumnTestTableRow> sortedRows, long start, long step, long expectedLowerBound, long expectedUpperBound, long expectedDistinctCount)  ;
  public  void createTableWithIdColAndIntValueCol (java.lang.String tableName, scala.Enumeration.Value generatedAsIdentityType, scala.Option<java.lang.Object> startsWith, scala.Option<java.lang.Object> incrementBy, scala.collection.immutable.Map<java.lang.String, java.lang.String> tblProperties)  ;
  /** Force a bad high water mark on all identity columns in the table with a manual commit. */
  public  void forceBadWaterMark (org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  public  void generateTableWithIdentityColumn (java.lang.String tableName, long step)  ;
  /**
   * Retrieves the high watermark information for the given <code>colName</code> in the metadata of
   * given <code>snapshot</code>, if it's present. Returns None if the high watermark has not been set yet.
   * @param snapshot (undocumented)
   * @param colName (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> getHighWaterMark (org.apache.spark.sql.delta.Snapshot snapshot, java.lang.String colName)  ;
  public  java.lang.String getRandomTableName ()  ;
  /**
   * Retrieves the high watermark information for the given <code>colName</code> in the metadata of
   * given <code>snapshot</code>
   * @param snapshot (undocumented)
   * @param colName (undocumented)
   * @return (undocumented)
   */
  public  long highWaterMark (org.apache.spark.sql.delta.Snapshot snapshot, java.lang.String colName)  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  public  scala.collection.immutable.Seq<org.apache.spark.sql.types.DataType> unsupportedDataTypes ()  ;
  /**
   * Helper function to validate values of IDENTITY column <code>id</code> in table <code>tableName</code>. Returns the
   * new high water mark. We use minValue and maxValue to filter column <code>value</code> to get the set of
   * values we are checking in this batch.
   * @param tableName (undocumented)
   * @param expectedRowCount (undocumented)
   * @param start (undocumented)
   * @param step (undocumented)
   * @param minValue (undocumented)
   * @param maxValue (undocumented)
   * @param oldHighWaterMark (undocumented)
   * @return (undocumented)
   */
  public  long validateIdentity (java.lang.String tableName, long expectedRowCount, long start, long step, long minValue, long maxValue, long oldHighWaterMark)  ;
  /**
   * Creates and manages a simple identity column table with one other column "value" of type int
   * @param generatedAsIdentityType (undocumented)
   * @param tableName (undocumented)
   * @param f (undocumented)
   */
  public  void withIdentityColumnTable (scala.Enumeration.Value generatedAsIdentityType, java.lang.String tableName, scala.Function0<scala.runtime.BoxedUnit> f)  ;
}
