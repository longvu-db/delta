package org.apache.spark.sql.delta;
/**
 * Tests for metrics of Delta UPDATE command.
 */
public  class UpdateMetricsSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSparkSession, com.databricks.spark.util.DatabricksLogging, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  /**
   * Case class to parameterize tests.
   */
  public  class TestConfiguration implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  boolean partitioned ()  { throw new RuntimeException(); }
    public  boolean cdfEnabled ()  { throw new RuntimeException(); }
    // not preceding
    public   TestConfiguration (boolean partitioned, boolean cdfEnabled)  { throw new RuntimeException(); }
  }
  public  class TestConfiguration$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.sql.delta.UpdateMetricsSuite.TestConfiguration> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TestConfiguration$ MODULE$ = null;
    public   TestConfiguration$ ()  { throw new RuntimeException(); }
  }
  /**
   * Case class to parameterize metric results.
   */
  public  class TestMetricResults implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> operationMetrics ()  { throw new RuntimeException(); }
    // not preceding
    public   TestMetricResults (scala.collection.immutable.Map<java.lang.String, java.lang.Object> operationMetrics)  { throw new RuntimeException(); }
  }
  public  class TestMetricResults$ extends scala.runtime.AbstractFunction1<scala.collection.immutable.Map<java.lang.String, java.lang.Object>, org.apache.spark.sql.delta.UpdateMetricsSuite.TestMetricResults> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TestMetricResults$ MODULE$ = null;
    public   TestMetricResults$ ()  { throw new RuntimeException(); }
  }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public   UpdateMetricsSuite ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  /**
   * Create a table from the provided dataset.
   * <p>
   * If an partitioned table is needed, then we create one data partition per Spark partition,
   * i.e. every data partition will contain one file.
   * <p>
   * Also an extra column is added to be used in non-partition filters.
   * @param table (undocumented)
   * @param tableName (undocumented)
   * @param testConfig (undocumented)
   */
  protected  void createTempTable (org.apache.spark.sql.Dataset<?> table, java.lang.String tableName, org.apache.spark.sql.delta.UpdateMetricsSuite.TestConfiguration testConfig)  { throw new RuntimeException(); }
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
  /**
   * Helper to generate tests for all configuration parameters.
   * @param name (undocumented)
   * @param testFn (undocumented)
   */
  protected  void testUpdateMetrics (java.lang.String name, scala.Function1<org.apache.spark.sql.delta.UpdateMetricsSuite.TestConfiguration, scala.runtime.BoxedUnit> testFn)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
