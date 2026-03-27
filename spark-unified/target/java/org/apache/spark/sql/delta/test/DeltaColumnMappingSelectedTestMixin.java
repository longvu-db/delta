package org.apache.spark.sql.delta.test;
/**
 * A trait for selective enabling certain tests to run for column mapping modes
 */
public  interface DeltaColumnMappingSelectedTestMixin extends org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.DeltaColumnMappingTestUtils {
  public  void afterAll ()  ;
  /**
   * If true, will run all tests.
   * Requires that <code>runOnlyTests</code> is empty.
   * @return (undocumented)
   */
  public  boolean runAllTests ()  ;
  public  scala.collection.immutable.Seq<java.lang.String> runOnlyTests ()  ;
  public  scala.collection.immutable.Seq<java.lang.String> skipTests ()  ;
  public  void test (java.lang.String testName, scala.collection.immutable.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  ;
}
