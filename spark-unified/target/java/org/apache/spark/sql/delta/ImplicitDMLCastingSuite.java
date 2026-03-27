package org.apache.spark.sql.delta;
/**
 * Tests for casts that are implicitly added in DML commands modifying Delta tables.
 * These casts are added to convert values to the schema of a table.
 * INSERT operations are excluded as they are covered by InsertSuite and InsertSuiteEdge.
 */
public abstract class ImplicitDMLCastingSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.delta.test.DeltaExceptionTestUtils, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  protected  class TestConfiguration implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
    public  java.lang.String sourceType ()  { throw new RuntimeException(); }
    public  java.lang.String sourceTypeInErrorMessage ()  { throw new RuntimeException(); }
    public  java.lang.String targetType ()  { throw new RuntimeException(); }
    public  java.lang.String targetTypeInErrorMessage ()  { throw new RuntimeException(); }
    public  java.lang.String validValue ()  { throw new RuntimeException(); }
    public  java.lang.String overflowValue ()  { throw new RuntimeException(); }
    public  java.lang.String exceptionAnsiCast ()  { throw new RuntimeException(); }
    // not preceding
    public   TestConfiguration (java.lang.String sourceType, java.lang.String sourceTypeInErrorMessage, java.lang.String targetType, java.lang.String targetTypeInErrorMessage, java.lang.String validValue, java.lang.String overflowValue, java.lang.String exceptionAnsiCast)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  protected  class TestConfiguration$ extends scala.runtime.AbstractFunction7<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.apache.spark.sql.delta.ImplicitDMLCastingSuite.TestConfiguration> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TestConfiguration$ MODULE$ = null;
    public   TestConfiguration$ ()  { throw new RuntimeException(); }
  }
  protected  class SqlConfiguration implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    public  boolean followAnsiEnabled ()  { throw new RuntimeException(); }
    public  boolean ansiEnabled ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value storeAssignmentPolicy ()  { throw new RuntimeException(); }
    // not preceding
    public   SqlConfiguration (boolean followAnsiEnabled, boolean ansiEnabled, scala.Enumeration.Value storeAssignmentPolicy)  { throw new RuntimeException(); }
    public  void withSqlSettings (scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  protected  class SqlConfiguration$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, scala.Enumeration.Value, org.apache.spark.sql.delta.ImplicitDMLCastingSuite.SqlConfiguration> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SqlConfiguration$ MODULE$ = null;
    public   SqlConfiguration$ ()  { throw new RuntimeException(); }
  }
  public   ImplicitDMLCastingSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  /** Implement the actual test for a specific DML command in subclasses. */
  protected abstract  void commandTest (org.apache.spark.sql.delta.ImplicitDMLCastingSuite.SqlConfiguration sqlConfig, org.apache.spark.sql.delta.ImplicitDMLCastingSuite.TestConfiguration testConfig)  ;
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  protected  boolean expectLegacyCastingBehaviour (org.apache.spark.sql.delta.ImplicitDMLCastingSuite.SqlConfiguration sqlConfig)  { throw new RuntimeException(); }
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
  /**
   * Validate that a custom error is throws in case ansi.enabled is false, or a different
   * overflow error is case ansi.enabled is true.
   * @param exception (undocumented)
   * @param sqlConfig (undocumented)
   * @param testConfig (undocumented)
   */
  protected  void validateException (java.lang.Throwable exception, org.apache.spark.sql.delta.ImplicitDMLCastingSuite.SqlConfiguration sqlConfig, org.apache.spark.sql.delta.ImplicitDMLCastingSuite.TestConfiguration testConfig)  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
