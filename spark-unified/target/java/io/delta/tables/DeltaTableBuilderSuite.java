package io.delta.tables;
public  class DeltaTableBuilderSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.skipping.ClusteredTableTestUtils {
  public   DeltaTableBuilderSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.DeltaTestUtilsBase.ExpectedResult$ ExpectedResult ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  public  java.lang.String defaultCatalogOwnedFeatureEnabledKey ()  { throw new RuntimeException(); }
  public  io.delta.tables.DeltaTableBuilder defaultCreateTableBuilder (boolean ifNotExists, scala.Option<java.lang.String> tableName, scala.Option<java.lang.String> location)  { throw new RuntimeException(); }
  public  io.delta.tables.DeltaTableBuilder defaultReplaceTableBuilder (boolean orCreate, scala.Option<java.lang.String> tableName, scala.Option<java.lang.String> location)  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Map<java.lang.String, java.lang.String> defaultTestTableColumnComments ()  { throw new RuntimeException(); }
  protected  java.lang.String defaultTestTableComment ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Map<java.lang.String, java.lang.String> defaultTestTableGeneratedColumns ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Set<java.lang.String> defaultTestTableNullableCols ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Seq<java.lang.String> defaultTestTablePartitionColumns ()  { throw new RuntimeException(); }
  protected  scala.Tuple2<java.lang.String, java.lang.String> defaultTestTableProperty ()  { throw new RuntimeException(); }
  protected  java.lang.String defaultTestTableSchema ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> intervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.Map<java.lang.String, java.lang.Object> locRefCount ()  { throw new RuntimeException(); }
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
  protected  void testCreateTable (java.lang.String testName, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> createFunc)  { throw new RuntimeException(); }
  protected  void testCreateTableWithLocationOnly (java.lang.String testName, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> createFunc)  { throw new RuntimeException(); }
  protected  void testCreateTableWithNameAndLocation (java.lang.String testName, scala.Function2<java.lang.String, java.lang.String, scala.runtime.BoxedUnit> createFunc)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  /**
   * Verify if the table metadata matches the test table. We use this to verify DDLs
   * write correct table metadata into the transaction logs.
   * @param table (undocumented)
   * @param schemaString (undocumented)
   * @param generatedColumns (undocumented)
   * @param colComments (undocumented)
   * @param colNullables (undocumented)
   * @param tableComment (undocumented)
   * @param partitionCols (undocumented)
   * @param tableProperty (undocumented)
   */
  protected  void verifyTestTableMetadata (java.lang.String table, java.lang.String schemaString, scala.collection.immutable.Map<java.lang.String, java.lang.String> generatedColumns, scala.collection.immutable.Map<java.lang.String, java.lang.String> colComments, scala.collection.immutable.Set<java.lang.String> colNullables, scala.Option<java.lang.String> tableComment, scala.collection.immutable.Seq<java.lang.String> partitionCols, scala.Option<scala.Tuple2<java.lang.String, java.lang.String>> tableProperty)  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
