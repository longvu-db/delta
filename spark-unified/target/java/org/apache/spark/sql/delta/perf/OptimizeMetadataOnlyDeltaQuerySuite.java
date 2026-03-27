package org.apache.spark.sql.delta.perf;
public  class OptimizeMetadataOnlyDeltaQuerySuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSparkSession, org.scalatest.BeforeAndAfterAll, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.DeletionVectorsTestUtils {
  /** Class to hold test parameters */
  public  class ScalaTestParams implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> queryScala ()  { throw new RuntimeException(); }
    public  java.lang.String expectedPlan ()  { throw new RuntimeException(); }
    // not preceding
    public   ScalaTestParams (java.lang.String name, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> queryScala, java.lang.String expectedPlan)  { throw new RuntimeException(); }
  }
  public  class ScalaTestParams$ extends scala.runtime.AbstractFunction3<java.lang.String, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>>, java.lang.String, org.apache.spark.sql.delta.perf.OptimizeMetadataOnlyDeltaQuerySuite.ScalaTestParams> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ScalaTestParams$ MODULE$ = null;
    public   ScalaTestParams$ ()  { throw new RuntimeException(); }
  }
  /** Class to hold test parameters */
  public  class SqlTestParams implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  java.lang.String querySql ()  { throw new RuntimeException(); }
    public  java.lang.String expectedPlan ()  { throw new RuntimeException(); }
    public  scala.Option<scala.collection.immutable.Seq<java.lang.String>> querySetup ()  { throw new RuntimeException(); }
    // not preceding
    public   SqlTestParams (java.lang.String name, java.lang.String querySql, java.lang.String expectedPlan, scala.Option<scala.collection.immutable.Seq<java.lang.String>> querySetup)  { throw new RuntimeException(); }
  }
  public  class SqlTestParams$ extends scala.runtime.AbstractFunction4<java.lang.String, java.lang.String, java.lang.String, scala.Option<scala.collection.immutable.Seq<java.lang.String>>, org.apache.spark.sql.delta.perf.OptimizeMetadataOnlyDeltaQuerySuite.SqlTestParams> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SqlTestParams$ MODULE$ = null;
    public   SqlTestParams$ ()  { throw new RuntimeException(); }
  }
  public   OptimizeMetadataOnlyDeltaQuerySuite ()  { throw new RuntimeException(); }
  public  java.lang.String PARTITION_COL ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  protected  java.lang.String defaultTempDirPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dfPart1 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dfPart2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> intervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> lowerCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> lowerCaseDataWithDuplicates ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.MapData> mapData ()  { throw new RuntimeException(); }
  public  long maxId ()  { throw new RuntimeException(); }
  public  long minId ()  { throw new RuntimeException(); }
  public  java.lang.String mixedStatsTableName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> negativeData ()  { throw new RuntimeException(); }
  public  java.lang.String noStatsTableName ()  { throw new RuntimeException(); }
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
  public  java.lang.String testTableName ()  { throw new RuntimeException(); }
  public  long totalRows ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
