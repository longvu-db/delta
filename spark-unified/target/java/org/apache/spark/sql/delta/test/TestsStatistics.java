package org.apache.spark.sql.delta.test;
/**
 * Provides utilities for testing StatisticsCollection.
 */
public  interface TestsStatistics {
  /**
   * A util to match a physical file scan node.
   */
  public  class FileScanExecNode {
    static public  scala.Option<org.apache.spark.sql.execution.FileSourceScanExec> unapply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * A util to match a physical file scan node.
   */
  public  class FileScanExecNode$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FileScanExecNode$ MODULE$ = null;
    public   FileScanExecNode$ ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.execution.FileSourceScanExec> unapply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.delta.test.TestsStatistics.FileScanExecNode$ FileScanExecNode ()  ;
  /** A function to get the reconciled statistics DataFrame from the DeltaLog */
  public  scala.Function2<org.apache.spark.sql.delta.DeltaLog, scala.collection.immutable.Seq<org.apache.spark.sql.Column>, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> getStatsDf ()  ;
  /**
   * Creates the correct <code>getStatsDf</code> to be used by the <code>testFun</code> and executes the <code>testFun</code>.
   * @param testName (undocumented)
   * @param testTags (undocumented)
   * @param testFun (undocumented)
   */
  public  void statsTest (java.lang.String testName, scala.collection.immutable.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun)  ;
  /**
   * Creates the correct <code>getStatsDf</code> to be used by the <code>testFun</code> and executes the <code>testFun</code>.
   * Runs only against Spark master.
   * @param testName (undocumented)
   * @param testTags (undocumented)
   * @param testFun (undocumented)
   */
  public  void statsTestSparkMasterOnly (java.lang.String testName, scala.collection.immutable.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun)  ;
}
