package org.apache.spark.sql.delta.test.shims;
/**
 * Shim for SparkFunSuite as gridTest doesn't exist in Spark 4.0 but we rely on it
 * in tests.
 */
public  interface GridTestShim {
  public <A extends java.lang.Object> void gridTest (java.lang.String testNamePrefix, scala.collection.immutable.Seq<org.scalatest.Tag> testTags, scala.collection.immutable.Seq<A> params, scala.Function1<A, scala.runtime.BoxedUnit> testFun)  ;
}
