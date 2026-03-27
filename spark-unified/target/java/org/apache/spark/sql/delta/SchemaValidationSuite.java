package org.apache.spark.sql.delta;
/**
 * This Suite tests the behavior of Delta commands when a schema altering commit is run after the
 * command completes analysis but before the command starts the transaction. We want to make sure
 * That we do not corrupt tables.
 */
public  class SchemaValidationSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public  class BlockingRule extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   BlockingRule (java.util.concurrent.CountDownLatch blockActionLatch, java.util.concurrent.CountDownLatch startConcurrentUpdateLatch)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public   SchemaValidationSuite ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession cloneSession (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  /**
   * Creates a method to remove a column from the table by taking column as an argument.
   * @param col (undocumented)
   * @return (undocumented)
   */
  public  scala.Function2<org.apache.spark.sql.SparkSession, java.lang.String, scala.runtime.BoxedUnit> dropColFromSampleTable (java.lang.String col)  { throw new RuntimeException(); }
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
  /**
   * tests the behavior of concurrent changes to schema on a blocked command.
   * @param testName - name of the test
   * @param createTable - method that creates a table given an identifier and spark session.
   * @param actionToTest - the method we want to test.
   * @param concurrentChange - the concurrent query that updates the schema of the table
   * <p>
   * All the above methods take SparkSession and the table path as parameters
   * @param testTags (undocumented)
   */
  public  void testConcurrentChange (java.lang.String testName, scala.collection.immutable.Seq<org.scalatest.Tag> testTags, scala.Function2<org.apache.spark.sql.SparkSession, java.lang.String, scala.runtime.BoxedUnit> createTable, scala.Function2<org.apache.spark.sql.SparkSession, java.lang.String, scala.runtime.BoxedUnit> actionToTest, scala.Function2<org.apache.spark.sql.SparkSession, java.lang.String, scala.runtime.BoxedUnit> concurrentChange)  { throw new RuntimeException(); }
  /**
   * tests the behavior of concurrent changes pf schema on a blocked command with metastore tables.
   * @param testName - name of the test
   * @param createTable - method that creates a table given an identifier and spark session.
   * @param actionToTest - the method we want to test.
   * @param concurrentChange - the concurrent query that updates the schema of the table
   * <p>
   * All the above methods take SparkSession and the table name as parameters
   */
  public  void testConcurrentChangeWithTable (java.lang.String testName, scala.Function2<org.apache.spark.sql.SparkSession, java.lang.String, scala.runtime.BoxedUnit> createTable, scala.Function2<org.apache.spark.sql.SparkSession, java.lang.String, scala.runtime.BoxedUnit> actionToTest, scala.Function2<org.apache.spark.sql.SparkSession, java.lang.String, scala.runtime.BoxedUnit> concurrentChange)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
