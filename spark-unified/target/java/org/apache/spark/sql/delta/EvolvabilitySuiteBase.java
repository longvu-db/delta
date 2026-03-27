package org.apache.spark.sql.delta;
public abstract class EvolvabilitySuiteBase extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLTestUtils {
  static public  void generateData (org.apache.spark.sql.SparkSession spark, java.lang.String path, scala.collection.immutable.Map<org.apache.spark.sql.delta.DeltaConfig<?>, java.lang.String> tblProps)  { throw new RuntimeException(); }
  /** Validate the generated data contains all {@link Action} types */
  static public  void validateData (org.apache.spark.sql.SparkSession spark, java.lang.String path)  { throw new RuntimeException(); }
  /** Generate the transaction log with extra column in checkpoint and json. */
  static public  void generateTransactionLogWithExtraColumn (org.apache.spark.sql.SparkSession spark, java.lang.String path)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  protected  java.lang.String defaultTempDirPrefix ()  { throw new RuntimeException(); }
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> negativeData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> lowerCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> lowerCaseDataWithDuplicates ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.MapData> mapData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> repeatedData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> nullableRepeatedData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> nullInts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> nullStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> person ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> intervalData ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public   EvolvabilitySuiteBase ()  { throw new RuntimeException(); }
  protected  void testEvolvability (java.lang.String tablePath)  { throw new RuntimeException(); }
  /**
   * This tests the evolution of the schema at delta file and checkpoint file.
   * Operations on the Delta table shouldn't fail when there is an unknown column
   * in delta file and checkpoint file.
   * <p>
   * Table Schema: StructType(StructField("key", StringType), StructField("value", StringType))
   * Overwritten Delta file: {"some_new_feature":{"a":1}}
   * Overwritten checkpoint file with a new column called <code>unknown</code> with boolean type.
   * <p>
   * The delta file and checkpoint file with an unknown column are generated by
   * <code>EvolvabilitySuiteBase.generateTransactionLogWithExtraColumn()</code>.
   * @param operation (undocumented)
   */
  protected  void testLogSchemaEvolvability (scala.Function1<java.lang.String, scala.runtime.BoxedUnit> operation)  { throw new RuntimeException(); }
  /**
   * Read from a table's CDF and check for the expected preimage/postimage after applying an update
   * @param tablePath (undocumented)
   * @param commitVersion (undocumented)
   * @param expectedPreimage (undocumented)
   * @param expectedPostimage (undocumented)
   * @param streaming (undocumented)
   */
  protected  void testCdfUpdate (java.lang.String tablePath, long commitVersion, scala.collection.immutable.Seq<java.lang.Object> expectedPreimage, scala.collection.immutable.Seq<java.lang.Object> expectedPostimage, boolean streaming)  { throw new RuntimeException(); }
}
