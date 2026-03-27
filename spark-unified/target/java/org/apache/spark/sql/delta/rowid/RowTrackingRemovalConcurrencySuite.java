package org.apache.spark.sql.delta.rowid;
public  class RowTrackingRemovalConcurrencySuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.delta.rowid.RowTrackingRemovalSuiteBase, org.apache.spark.sql.delta.ConflictResolutionTestUtils, org.apache.spark.sql.delta.concurrency.TransactionExecutionTestMixin, org.apache.spark.sql.delta.concurrency.PhaseLockingTestMixin {
  /**
   * Represents a delete transaction by a third party writer that does not respect
   * property <code>delta.rowTrackingSuspended</code>.
   */
  public  class ThirdPartyDelete extends org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String condition ()  { throw new RuntimeException(); }
    // not preceding
    public   ThirdPartyDelete (java.lang.String condition)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  boolean dataChange ()  { throw new RuntimeException(); }
    public  java.lang.String toSQL (java.lang.String tableName)  { throw new RuntimeException(); }
  }
  public  class ThirdPartyDelete$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.delta.rowid.RowTrackingRemovalConcurrencySuite.ThirdPartyDelete> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ThirdPartyDelete$ MODULE$ = null;
    public   ThirdPartyDelete$ ()  { throw new RuntimeException(); }
  }
  /**
   * Represents an update transaction by a third party writer that does not respect
   * property <code>delta.rowTrackingSuspended</code>.
   */
  public  class ThirdPartyUpdate extends org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String set ()  { throw new RuntimeException(); }
    public  java.lang.String condition ()  { throw new RuntimeException(); }
    // not preceding
    public   ThirdPartyUpdate (java.lang.String set, java.lang.String condition)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  boolean dataChange ()  { throw new RuntimeException(); }
    public  java.lang.String toSQL (java.lang.String tableName)  { throw new RuntimeException(); }
  }
  public  class ThirdPartyUpdate$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.spark.sql.delta.rowid.RowTrackingRemovalConcurrencySuite.ThirdPartyUpdate> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ThirdPartyUpdate$ MODULE$ = null;
    public   ThirdPartyUpdate$ ()  { throw new RuntimeException(); }
  }
  /**
   * Represents an insert transaction by a third party writer that does not respect
   * property <code>delta.rowTrackingSuspended</code>.
   */
  public  class ThirdPartyInsert extends org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  long start ()  { throw new RuntimeException(); }
    public  long end ()  { throw new RuntimeException(); }
    public  int numPartitions ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, java.lang.String> sqlConf ()  { throw new RuntimeException(); }
    // not preceding
    public   ThirdPartyInsert (long start, long end, int numPartitions, scala.collection.immutable.Map<java.lang.String, java.lang.String> sqlConf)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  boolean dataChange ()  { throw new RuntimeException(); }
    public  java.lang.String toSQL (java.lang.String tableName)  { throw new RuntimeException(); }
    public  void executeImpl (org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestContext ctx)  { throw new RuntimeException(); }
  }
  public  class ThirdPartyInsert$ extends scala.runtime.AbstractFunction4<java.lang.Object, java.lang.Object, java.lang.Object, scala.collection.immutable.Map<java.lang.String, java.lang.String>, org.apache.spark.sql.delta.rowid.RowTrackingRemovalConcurrencySuite.ThirdPartyInsert> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ThirdPartyInsert$ MODULE$ = null;
    public   ThirdPartyInsert$ ()  { throw new RuntimeException(); }
  }
  /**
   * Test transaction that performs a protocol downgrade for a given feature.
   * Note, it does not add the checkpointProtection feature.
   */
  public  class DowngradeProtocol extends org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.TableFeature feature ()  { throw new RuntimeException(); }
    // not preceding
    public   DowngradeProtocol (org.apache.spark.sql.delta.TableFeature feature)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  boolean dataChange ()  { throw new RuntimeException(); }
    public  java.lang.String toSQL (java.lang.String tableName)  { throw new RuntimeException(); }
    public  void executeImpl (org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestContext ctx)  { throw new RuntimeException(); }
  }
  public  class DowngradeProtocol$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.delta.TableFeature, org.apache.spark.sql.delta.rowid.RowTrackingRemovalConcurrencySuite.DowngradeProtocol> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DowngradeProtocol$ MODULE$ = null;
    public   DowngradeProtocol$ ()  { throw new RuntimeException(); }
  }
  /**
   * Test transaction that unbackfill baseRowIDs. It assumes all files can be
   * unbackfilled in a single commit.
   */
  public  class UnbackfillBatch extends org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction implements scala.Product, java.io.Serializable {
    static public abstract  R apply ()  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public   UnbackfillBatch ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  boolean dataChange ()  { throw new RuntimeException(); }
    public  java.lang.String toSQL (java.lang.String tableName)  { throw new RuntimeException(); }
    public  void executeImpl (org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestContext ctx)  { throw new RuntimeException(); }
  }
  public  class UnbackfillBatch$ extends scala.runtime.AbstractFunction0<org.apache.spark.sql.delta.rowid.RowTrackingRemovalConcurrencySuite.UnbackfillBatch> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final UnbackfillBatch$ MODULE$ = null;
    public   UnbackfillBatch$ ()  { throw new RuntimeException(); }
  }
  /**
   * Test transaction that backfills baseRowIDs. It ignores
   * <code>rowTrackingSuspended</code> property. However,it assumes the third party
   * client uses ROW_TRACKING_BACKFILL_OPERATION_NAME. Finally, it assumes all files can be
   * backfilled in a single commit.
   */
  public  class ThirdPartyBackfillBatch extends org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction implements scala.Product, java.io.Serializable {
    static public abstract  R apply ()  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public   ThirdPartyBackfillBatch ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  boolean dataChange ()  { throw new RuntimeException(); }
    public  java.lang.String toSQL (java.lang.String tableName)  { throw new RuntimeException(); }
    public  void executeImpl (org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestContext ctx)  { throw new RuntimeException(); }
  }
  public  class ThirdPartyBackfillBatch$ extends scala.runtime.AbstractFunction0<org.apache.spark.sql.delta.rowid.RowTrackingRemovalConcurrencySuite.ThirdPartyBackfillBatch> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ThirdPartyBackfillBatch$ MODULE$ = null;
    public   ThirdPartyBackfillBatch$ ()  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.delta.ConflictResolutionTestUtils.Delete$ Delete ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.ConflictResolutionTestUtils.Insert$ Insert ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.ConflictResolutionTestUtils.Merge$ Merge ()  { throw new RuntimeException(); }
  public  java.lang.String PARTITION_COL ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public  java.lang.String QUALIFIED_BASE_ROW_ID_COLUMN_NAME ()  { throw new RuntimeException(); }
  public   RowTrackingRemovalConcurrencySuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction$ TestTransaction ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.ConflictResolutionTestUtils.Update$ Update ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  boolean areDVsEnabled ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Seq<org.apache.spark.sql.Row> backfillTransaction (org.apache.spark.sql.delta.DeltaLog deltaLog)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  java.lang.String dataSourceName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  public  java.lang.String defaultRowTrackingFeatureProperty ()  { throw new RuntimeException(); }
  protected  java.lang.String defaultTempDirPrefix ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Row[] dropRowTrackingTransaction (java.lang.String tableName)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Row[] enableRowTrackingTransaction (java.lang.String tableName)  { throw new RuntimeException(); }
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
  protected  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  public  scala.concurrent.duration.FiniteDuration timeout ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Seq<org.apache.spark.sql.Row> unBackfillTransaction (org.apache.spark.sql.delta.DeltaLog deltaLog)  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  java.lang.String vectorizedReaderEnabledKey ()  { throw new RuntimeException(); }
  protected  java.lang.String vectorizedReaderNestedEnabledKey ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
