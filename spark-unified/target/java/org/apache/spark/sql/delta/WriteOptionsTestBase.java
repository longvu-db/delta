package org.apache.spark.sql.delta;
/**
 * Shared test utilities for validating write options in DESCRIBE HISTORY / commit stats.
 */
public  interface WriteOptionsTestBase {
  public  java.lang.String createPartitionedTable (java.io.File tempDir)  ;
  public  void executePathWriteTest (scala.Function1<java.lang.String, scala.runtime.BoxedUnit> write, org.apache.spark.sql.delta.WriteOptionsAssertion assertions)  ;
  public  void executeTableWriteTest (scala.Function1<java.lang.String, scala.runtime.BoxedUnit> write, org.apache.spark.sql.delta.WriteOptionsAssertion assertions)  ;
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData (scala.collection.immutable.Seq<java.lang.Object> ids, scala.collection.immutable.Seq<java.lang.Object> parts)  ;
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testDataWithCols (int id, int part, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> extraCols)  ;
  public  void testPathWrite (java.lang.String testName, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> testBody, org.apache.spark.sql.delta.WriteOptionsAssertion assertions)  ;
  public  void testTableWrite (java.lang.String testName, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> testBody, org.apache.spark.sql.delta.WriteOptionsAssertion assertions)  ;
  public  void testWriteVariants (java.lang.String testName, scala.collection.immutable.Seq<scala.Tuple3<java.lang.String, java.lang.Object, scala.Function1<java.lang.String, scala.runtime.BoxedUnit>>> writeVariants, org.apache.spark.sql.delta.WriteOptionsAssertion assertions)  ;
}
