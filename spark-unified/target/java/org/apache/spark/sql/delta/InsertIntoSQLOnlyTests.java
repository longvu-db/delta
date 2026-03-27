package org.apache.spark.sql.delta;
public  interface InsertIntoSQLOnlyTests extends org.apache.spark.sql.test.SharedSparkSession, org.scalatest.BeforeAndAfter {
  public  void dynamicOverwriteTest (java.lang.String testName, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /** Whether to include the SQL specific tests in this trait within the extending test suite. */
  public  boolean includeSQLOnlyTests ()  ;
  /**
   * Whether dynamic partition overwrites are supported by the <code>Table</code> definitions used in the
   * test suites. Tables that leverage the V1 Write interface do not support dynamic partition
   * overwrites.
   * @return (undocumented)
   */
  public  boolean supportsDynamicOverwrite ()  ;
  public  java.lang.String v2Format ()  ;
  /** Check that the results in `tableName` match the `expected` DataFrame. */
  public  void verifyTable (java.lang.String tableName, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expected)  ;
  public  void withTableAndData (java.lang.String tableName, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> testFn)  ;
}
