package org.apache.spark.sql.delta;
public  class DeltaCreateTableLikeSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public   DeltaCreateTableLikeSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  /**
   * This method checks if certain properties and fields of a table are the
   * same between two tables. Boolean values can be passed in to check
   * or not to check (assert) the specific property. Note that for checkLocation
   * a boolean value is not passed in. If checkLocation argument is None, location
   * of target table will not be checked.
   * @param srcTbl (undocumented)
   * @param targetTbl (undocumented)
   * @param checkDesc (undocumented)
   * @param checkSchemaString (undocumented)
   * @param checkPartitionColumns (undocumented)
   * @param checkConfiguration (undocumented)
   * @param checkProvider (undocumented)
   * @param checkLocation (undocumented)
   */
  public  void checkTableCopy (java.lang.String srcTbl, java.lang.String targetTbl, boolean checkDesc, boolean checkSchemaString, boolean checkPartitionColumns, boolean checkConfiguration, boolean checkProvider, scala.Option<java.lang.String> checkLocation)  { throw new RuntimeException(); }
  /**
   * This method checks if certain properties and fields of delta tables are the
   * same between the two delta tables. Boolean values can be passed in to check
   * or not to check (assert) the specific property. Note that for checkLocation
   * a boolean value is not passed in. If checkLocation argument is None, location
   * of target table will not be checked.
   * <p>
   * @param checkTargetTableByPath when true, targetTbl must be a path not table name
   * @param checkSourceTableByPath when true, srcTbl must be a path not table name
   * @param srcTbl (undocumented)
   * @param targetTbl (undocumented)
   * @param checkDesc (undocumented)
   * @param checkSchemaString (undocumented)
   * @param checkPartitionColumns (undocumented)
   * @param checkConfiguration (undocumented)
   * @param checkLocation (undocumented)
   */
  public  void checkTableCopyDelta (java.lang.String srcTbl, java.lang.String targetTbl, boolean checkDesc, boolean checkSchemaString, boolean checkPartitionColumns, boolean checkConfiguration, boolean checkTargetTableByPath, boolean checkSourceTableByPath, scala.Option<java.lang.String> checkLocation)  { throw new RuntimeException(); }
  public  boolean checkTableEmpty (java.lang.String tblName)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  public  void createTable (java.lang.String srcTbl, java.lang.String format, boolean addTblProperties, boolean addComment)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> intervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> lowerCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> lowerCaseDataWithDuplicates ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.MapData> mapData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> negativeData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> nullInts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> nullStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> nullableRepeatedData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> person ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> repeatedData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
