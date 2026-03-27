package org.apache.spark.sql.delta;
public  class FeatureEnablementConcurrencySuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.ConflictResolutionTestUtils {
  /** Represents a transaction that alters a table property. */
  public  class AlterTableProperty extends org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String property ()  { throw new RuntimeException(); }
    public  java.lang.String value ()  { throw new RuntimeException(); }
    // not preceding
    public   AlterTableProperty (java.lang.String property, java.lang.String value)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  boolean dataChange ()  { throw new RuntimeException(); }
    public  java.lang.String toSQL (java.lang.String tableName)  { throw new RuntimeException(); }
  }
  public  class AlterTableProperty$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.spark.sql.delta.FeatureEnablementConcurrencySuite.AlterTableProperty> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AlterTableProperty$ MODULE$ = null;
    public   AlterTableProperty$ ()  { throw new RuntimeException(); }
  }
  /** Represents a transaction that unsets a table property. */
  public  class UnsetTableProperty extends org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String property ()  { throw new RuntimeException(); }
    // not preceding
    public   UnsetTableProperty (java.lang.String property)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  boolean dataChange ()  { throw new RuntimeException(); }
    public  java.lang.String toSQL (java.lang.String tableName)  { throw new RuntimeException(); }
  }
  public  class UnsetTableProperty$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.delta.FeatureEnablementConcurrencySuite.UnsetTableProperty> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final UnsetTableProperty$ MODULE$ = null;
    public   UnsetTableProperty$ ()  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.delta.ConflictResolutionTestUtils.Delete$ Delete ()  { throw new RuntimeException(); }
  public   FeatureEnablementConcurrencySuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.ConflictResolutionTestUtils.Insert$ Insert ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.ConflictResolutionTestUtils.Merge$ Merge ()  { throw new RuntimeException(); }
  public  java.lang.String PARTITION_COL ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public  java.lang.String QUALIFIED_BASE_ROW_ID_COLUMN_NAME ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction$ TestTransaction ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.ConflictResolutionTestUtils.Update$ Update ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
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
  public  void testFeatureDisablement (java.lang.String property, boolean withUnset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  public  java.lang.String testTableName ()  { throw new RuntimeException(); }
  public  scala.concurrent.duration.FiniteDuration timeout ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  java.lang.String vectorizedReaderEnabledKey ()  { throw new RuntimeException(); }
  protected  java.lang.String vectorizedReaderNestedEnabledKey ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
