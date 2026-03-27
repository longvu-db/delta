package org.apache.spark.sql.delta;
public  interface DeltaTestUtilsBase {
  /**
   * Helper types to define the expected result of a test case.
   * Either:
   * - Success: include an expected value to check, e.g. expected schema or result as a DF or rows.
   * - Failure: an exception is thrown and the caller passes a function to check that it matches an
   *     expected error, typ. <code>checkError()</code> or <code>checkErrorMatchPVals()</code>.
   */
  public  interface ExpectedResult<T extends java.lang.Object> {
  }
  public  class ExpectedResult$ {
    public  class Success<T extends java.lang.Object> implements org.apache.spark.sql.delta.DeltaTestUtilsBase.ExpectedResult<T>, scala.Product, java.io.Serializable {
      public  T expected ()  { throw new RuntimeException(); }
      // not preceding
      public   Success (T expected)  { throw new RuntimeException(); }
    }
    public  class Success$ implements java.io.Serializable {
      public   Success$ ()  { throw new RuntimeException(); }
    }
    public  class Failure<T extends java.lang.Object> implements org.apache.spark.sql.delta.DeltaTestUtilsBase.ExpectedResult<T>, scala.Product, java.io.Serializable {
      public  scala.Function1<org.apache.spark.SparkThrowable, scala.runtime.BoxedUnit> checkError ()  { throw new RuntimeException(); }
      // not preceding
      public   Failure (scala.Function1<org.apache.spark.SparkThrowable, scala.runtime.BoxedUnit> checkError)  { throw new RuntimeException(); }
    }
    public  class Failure$ implements java.io.Serializable {
      public   Failure$ ()  { throw new RuntimeException(); }
    }
    public   ExpectedResult$ ()  { throw new RuntimeException(); }
  }
  public  class PlanCapturingListener implements org.apache.spark.sql.util.QueryExecutionListener {
    public   PlanCapturingListener ()  { throw new RuntimeException(); }
    public  void onFailure (java.lang.String funcName, org.apache.spark.sql.execution.QueryExecution qe, java.lang.Exception error)  { throw new RuntimeException(); }
    public  void onSuccess (java.lang.String funcName, org.apache.spark.sql.execution.QueryExecution qe, long durationNs)  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.DeltaTestUtils.Plans> plans ()  { throw new RuntimeException(); }
  }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.delta.DeltaTestUtilsBase.ExpectedResult$ ExpectedResult ()  ;
  public  scala.collection.immutable.Seq<java.lang.Object> BOOLEAN_DOMAIN ()  ;
  /**
   * Run a thunk with physical plans for all queries captured and passed into a provided buffer.
   * @param spark (undocumented)
   * @param optimizedPlan (undocumented)
   * @param thunk (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.collection.immutable.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> withLogicalPlansCaptured (org.apache.spark.sql.SparkSession spark, boolean optimizedPlan, scala.Function0<scala.runtime.BoxedUnit> thunk)  ;
  /**
   * Run a thunk with physical plans for all queries captured and passed into a provided buffer.
   * @param spark (undocumented)
   * @param thunk (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.collection.immutable.Seq<org.apache.spark.sql.execution.SparkPlan> withPhysicalPlansCaptured (org.apache.spark.sql.SparkSession spark, scala.Function0<scala.runtime.BoxedUnit> thunk)  ;
  /**
   * Run a thunk with logical and physical plans for all queries captured and passed
   * into a provided buffer.
   * @param spark (undocumented)
   * @param thunk (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.collection.immutable.Seq<org.apache.spark.sql.delta.DeltaTestUtils.Plans> withAllPlansCaptured (org.apache.spark.sql.SparkSession spark, scala.Function0<scala.runtime.BoxedUnit> thunk)  ;
  public  int countSparkJobs (org.apache.spark.SparkContext sc, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /** Filter `usageRecords` by the `opType` tag or field. */
  public  scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> filterUsageRecords (scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> usageRecords, java.lang.String opType)  ;
  public  scala.collection.Seq<com.databricks.spark.util.UsageRecord> collectUsageLogs (java.lang.String opType, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Remove protocol and metadata fields from checksum file of json format
   * @param checksumFilePath (undocumented)
   */
  public  void removeProtocolAndMetadataFromChecksumFile (org.apache.hadoop.fs.Path checksumFilePath)  ;
  public  org.apache.spark.sql.execution.SparkPlan getfindTouchedFilesJobPlans (scala.collection.immutable.Seq<org.apache.spark.sql.delta.DeltaTestUtils.Plans> plans)  ;
  /**
   * Separate name- from path-based SQL table identifiers.
   * @param sqlIdentifier (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.delta.DeltaTestUtils.TableIdentifierOrPath getTableIdentifierOrPath (java.lang.String sqlIdentifier)  ;
  /**
   * Produce a DeltaTable instance given a <code>TableIdentifierOrPath</code> instance.
   * @param spark (undocumented)
   * @param identifierOrPath (undocumented)
   * @return (undocumented)
   */
  public  io.delta.tables.DeltaTable getDeltaTableForIdentifierOrPath (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.DeltaTestUtils.TableIdentifierOrPath identifierOrPath)  ;
  /**
   * @deprecated Use checkError() instead.
  */
  public  void errorContains (java.lang.String errMsg, java.lang.String str)  ;
  /** Utility method to check exception `e` is of type `E` or a cause of it is of type `E` */
  public <E extends java.lang.Throwable> scala.Option<E> findIfResponsible (java.lang.Throwable e, scala.reflect.ClassTag<E> evidence$1)  ;
  public  void verifyBackfilled (org.apache.hadoop.fs.FileStatus file)  ;
  public  void verifyUnbackfilled (org.apache.hadoop.fs.FileStatus file)  ;
}
