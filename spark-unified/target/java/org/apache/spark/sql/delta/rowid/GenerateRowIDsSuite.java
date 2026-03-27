package org.apache.spark.sql.delta.rowid;
/**
 * This test suite checks the optimized logical plans produced after applying the {@link GenerateRowIDs}
 * rule. It ensures that the rule is correctly applied to all Delta scans in different scenarios and
 * that the optimizer is able to remove redundant expressions or nodes when possible.
 */
public  class GenerateRowIDsSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.delta.rowid.RowIdTestUtils {
  public   GenerateRowIDsSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public  java.lang.String QUALIFIED_BASE_ROW_ID_COLUMN_NAME ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  /**
   * Checks that a metadata column is present in <code>output</code> and that it contains the given fields and
   * only these.
   * @param output (undocumented)
   * @param expectedFieldNames (undocumented)
   */
  protected  void checkMetadataFieldsPresent (scala.collection.immutable.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> output, scala.collection.immutable.Seq<java.lang.String> expectedFieldNames)  { throw new RuntimeException(); }
  /**
   * Checks that the given expression corresponds to the an expression used to generate Row commit
   * versions:
   *   coalesce(_metadata.row_commit_version, _metadata.default_row_commit_version).
   * @param expr (undocumented)
   */
  protected  void checkRowCommitVersionExpr (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  /**
   * Checks that the given expression corresponds to the expression used to generate Row IDs:
   *   coalesce(_metadata.row_id, _metadata.base_row_id + _metadata.row_index).
   * @param expr (undocumented)
   */
  protected  void checkRowIdExpr (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  java.lang.String dataSourceName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  public  java.lang.String defaultRowTrackingFeatureProperty ()  { throw new RuntimeException(); }
  protected  java.lang.String defaultTempDirPrefix ()  { throw new RuntimeException(); }
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
  public  java.lang.String rowTrackingFeatureName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  /**
   * Test runner checking that the optimized plan for the given dataframe matches the expected plan.
   * The expected plan is defined as a partial function <code>check</code>, e.g.:
   * check = {
   *   case Project(_, LogicalRelation) =&gt; // Do additional checks
   * }
   * <p>
   * Note: Pass <code>df</code> by name to avoid evaluating anything before test setup.
   * @param testName (undocumented)
   * @param df (undocumented)
   * @param rowTrackingEnabled (undocumented)
   * @param check (undocumented)
   */
  protected  void testRowIdPlan (java.lang.String testName, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> df, boolean rowTrackingEnabled, scala.PartialFunction<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.runtime.BoxedUnit> check)  { throw new RuntimeException(); }
  protected  java.lang.String testTable ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  java.lang.String vectorizedReaderEnabledKey ()  { throw new RuntimeException(); }
  protected  java.lang.String vectorizedReaderNestedEnabledKey ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
