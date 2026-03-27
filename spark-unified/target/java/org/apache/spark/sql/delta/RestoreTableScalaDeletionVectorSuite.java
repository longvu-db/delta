package org.apache.spark.sql.delta;
public  class RestoreTableScalaDeletionVectorSuite extends org.apache.spark.sql.delta.RestoreTableScalaSuite implements org.apache.spark.sql.delta.DeletionVectorsTestUtils, org.apache.spark.sql.delta.test.DeltaExcludedTestMixin {
  public  class RestoreAndCheckArgs implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  int versionToRestore ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedResult ()  { throw new RuntimeException(); }
    // not preceding
    public   RestoreAndCheckArgs (int versionToRestore, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedResult)  { throw new RuntimeException(); }
  }
  public  class RestoreAndCheckArgs$ extends scala.runtime.AbstractFunction2<java.lang.Object, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, org.apache.spark.sql.delta.RestoreTableScalaDeletionVectorSuite.RestoreAndCheckArgs> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RestoreAndCheckArgs$ MODULE$ = null;
    public   RestoreAndCheckArgs$ ()  { throw new RuntimeException(); }
  }
  public  java.lang.String PARTITION_COL ()  { throw new RuntimeException(); }
  public   RestoreTableScalaDeletionVectorSuite ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Seq<java.lang.String> excluded ()  { throw new RuntimeException(); }
  /**
   * Tests <code>testFun</code> once by restoring to version and once to timestamp.
   * <p>
   * <code>testFun</code> is expected to perform setup before executing the <code>RestoreAndTestFunction</code> and
   * cleanup afterwards.
   * @param testName (undocumented)
   * @param testFun (undocumented)
   */
  protected  void testRestoreByTimestampAndVersion (java.lang.String testName, scala.Function2<java.lang.String, scala.Function1<org.apache.spark.sql.delta.RestoreTableScalaDeletionVectorSuite.RestoreAndCheckArgs, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> testFun)  { throw new RuntimeException(); }
}
