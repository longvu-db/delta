package org.apache.spark.sql.delta;
public  class DeltaColumnMappingSuite extends org.apache.spark.sql.QueryTest implements org.scalatest.GivenWhenThen, org.apache.spark.sql.delta.DeltaColumnMappingSuiteUtils {
  public   DeltaColumnMappingSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  void assertEqual (org.apache.spark.sql.types.StructType actual, org.apache.spark.sql.types.StructType expected, boolean ignorePhysicalName)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  protected  void checkProperties (java.lang.String tableName, scala.Option<java.lang.String> mode, int readerVersion, int writerVersion, long curMaxId)  { throw new RuntimeException(); }
  protected  void checkSchema (java.lang.String tableName, org.apache.spark.sql.types.StructType expectedSchema, boolean ignorePhysicalName)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  void createStrictSchemaTableWithDeltaTableApi (java.lang.String tableName, org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> props, boolean isPartitioned)  { throw new RuntimeException(); }
  protected  void createTableWithDataFrameAPI (java.lang.String tableName, scala.collection.immutable.Map<java.lang.String, java.lang.String> props, boolean withColumnIds, boolean isPartitioned, boolean nested, boolean randomIds)  { throw new RuntimeException(); }
  protected  void createTableWithDataFrameWriterV2API (java.lang.String tableName, scala.collection.immutable.Map<java.lang.String, java.lang.String> props, boolean withColumnIds, boolean isPartitioned, boolean nested, boolean randomIds)  { throw new RuntimeException(); }
  protected  void createTableWithDeltaTableAPI (java.lang.String tableName, scala.collection.immutable.Map<java.lang.String, java.lang.String> props, boolean withColumnIds, boolean isPartitioned)  { throw new RuntimeException(); }
  protected  void createTableWithSQLAPI (java.lang.String tableName, scala.collection.immutable.Map<java.lang.String, java.lang.String> props, boolean withColumnIds, boolean isPartitioned, boolean nested, boolean randomIds)  { throw new RuntimeException(); }
  protected  void createTableWithSQLCreateOrReplaceAPI (java.lang.String tableName, scala.collection.immutable.Map<java.lang.String, java.lang.String> props, boolean withColumnIds, boolean isPartitioned, boolean nested, boolean randomIds)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  protected  java.lang.String defaultTempDirPrefix ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dfWithIds (org.apache.spark.sql.SparkSession spark, boolean randomIds)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dfWithIdsNested (org.apache.spark.sql.SparkSession spark, boolean randomIds)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dfWithoutIds (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dfWithoutIdsNested (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
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
  protected  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.StructType schemaNested ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.StructType schemaWithDottedColumnNames ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.StructType schemaWithDuplicatingIds ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.StructType schemaWithDuplicatingPhysicalNames ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.StructType schemaWithDuplicatingPhysicalNamesNested ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.StructType schemaWithId ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.StructType schemaWithIdAndDuplicatingPhysicalNames ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.StructType schemaWithIdAndPhysicalNameRandom ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.StructType schemaWithIdNested ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.StructType schemaWithIdNestedRandom ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.StructType schemaWithIdRandom ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.StructType schemaWithPhysicalNamesNested ()  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  protected  void testCreateTableColumnMappingMode (java.lang.String tableName, org.apache.spark.sql.types.StructType expectedSchema, boolean ignorePhysicalName, java.lang.String mode, boolean createNewTable, boolean tableFeaturesProtocolExpected, scala.Function0<scala.runtime.BoxedUnit> fn)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  protected  void testPartitionPath (java.lang.String tableName, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> createFunc)  { throw new RuntimeException(); }
  protected  void testReplaceWhere ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  void verifyUpgradeAndTestSchemaEvolution (java.lang.String tableName)  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.Metadata withId (long id)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.Metadata withIdAndPhysicalName (long id, java.lang.String pname)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.Metadata withPhysicalName (java.lang.String pname)  { throw new RuntimeException(); }
}
