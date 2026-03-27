package org.apache.spark.sql.delta.deletionvectors;
public  class DeletionVectorsSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.DeletionVectorsTestUtils, org.apache.spark.sql.delta.DeltaTestUtilsForTempViews, org.apache.spark.sql.delta.test.DeltaExceptionTestUtils {
  static public  java.lang.String table1Path ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Seq<java.lang.Object> expectedTable1DataV0 ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<java.lang.Object> v1Removed ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Seq<java.lang.Object> expectedTable1DataV1 ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<java.lang.Object> v2Added ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Seq<java.lang.Object> expectedTable1DataV2 ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<java.lang.Object> v3Removed ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Seq<java.lang.Object> expectedTable1DataV3 ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<java.lang.Object> v4Added ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Seq<java.lang.Object> expectedTable1DataV4 ()  { throw new RuntimeException(); }
  static public  java.lang.String table2Path ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Seq<java.lang.Object> expectedTable2DataV0 ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Seq<java.lang.Object> expectedTable2DataV1 ()  { throw new RuntimeException(); }
  static public  java.lang.String table3Path ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Seq<java.lang.Object> expectedTable3DataV0 ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<java.lang.Object> table3V1Removed ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Seq<java.lang.Object> expectedTable3DataV1 ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<java.lang.Object> table3V2Added ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Seq<java.lang.Object> expectedTable3DataV2 ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<java.lang.Object> table3V3Removed ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Seq<java.lang.Object> expectedTable3DataV3 ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<java.lang.Object> table3V4Added ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Seq<java.lang.Object> expectedTable3DataV4 ()  { throw new RuntimeException(); }
  static public  java.lang.String table4Path ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Seq<java.lang.Object> expectedTable4DataV0 ()  { throw new RuntimeException(); }
  static public  java.lang.String table5Path ()  { throw new RuntimeException(); }
  static public  long table5Count ()  { throw new RuntimeException(); }
  static public  long table5Sum ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> table5CountByValues ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> table5SumByValues ()  { throw new RuntimeException(); }
  static public  void writeTableHavingSpecialCharInDVPath (java.io.File path, boolean pathIsEncoded)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.DeltaTestUtilsBase.ExpectedResult$ ExpectedResult ()  { throw new RuntimeException(); }
  public  java.lang.String PARTITION_COL ()  { throw new RuntimeException(); }
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
  public   DeletionVectorsSuite ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
}
