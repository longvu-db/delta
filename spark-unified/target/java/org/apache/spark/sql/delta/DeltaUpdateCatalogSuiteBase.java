package org.apache.spark.sql.delta;
public abstract class DeltaUpdateCatalogSuiteBase extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.scalatest.time.SpanSugar {
  public   DeltaUpdateCatalogSuiteBase ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  protected  void cleanupDefaultTable ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  protected  java.lang.String defaultTempDirPrefix ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.delta.DeltaLog deltaLog ()  { throw new RuntimeException(); }
  /** Turns off the storing of metadata (schema + properties) in the catalog. */
  protected  void disableUpdates (scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  protected abstract  scala.collection.immutable.Map<java.lang.String, java.lang.String> filterProperties (scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  ;
  protected  scala.collection.immutable.Map<java.lang.String, java.lang.String> getBaseProperties (org.apache.spark.sql.delta.Snapshot snapshot)  { throw new RuntimeException(); }
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
  public  scala.languageFeature.postfixOps postfixOps ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> repeatedData ()  { throw new RuntimeException(); }
  protected  void runAlterTableTests (scala.Function2<java.lang.String, org.apache.spark.sql.types.StructType, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.delta.Snapshot snapshot ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.delta.Snapshot snapshotAt (long v)  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  protected  java.lang.String tbl ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  /** Verifies that the table metadata in the catalog are up-to-date. */
  protected  void verifyTableMetadata (org.apache.spark.sql.types.StructType expectedSchema, scala.collection.immutable.Map<java.lang.String, java.lang.String> expectedProperties, java.lang.String table, scala.collection.immutable.Seq<java.lang.String> partitioningCols)  { throw new RuntimeException(); }
  /**
   * Verifies that the table metadata in the catalog are eventually up-to-date. Updates to the
   * catalog are generally asynchronous, except explicit DDL operations, e.g. CREATE/REPLACE.
   * @param expectedSchema (undocumented)
   * @param expectedProperties (undocumented)
   * @param table (undocumented)
   * @param partitioningCols (undocumented)
   */
  protected  void verifyTableMetadataAsync (org.apache.spark.sql.types.StructType expectedSchema, scala.collection.immutable.Map<java.lang.String, java.lang.String> expectedProperties, java.lang.String table, scala.collection.immutable.Seq<java.lang.String> partitioningCols)  { throw new RuntimeException(); }
  /**
   * Creates a table with the name <code>tbl</code> and executes a function that takes a representative
   * DataFrame with the schema of the table. Performs cleanup of the table afterwards.
   * @param f (undocumented)
   */
  protected  void withDeltaTable (scala.Function1<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
