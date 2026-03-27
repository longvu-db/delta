package org.apache.spark.sql.delta.test;
public  interface DeltaExcludedTestMixin {
  /** Tests to be ignored by the runner. */
  public  scala.collection.immutable.Seq<java.lang.String> excluded ()  ;
  public  void test (java.lang.String testName, scala.collection.immutable.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  ;
}
