package org.apache.spark.sql.delta;
public  interface DeltaDDLUsingPathTests extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.DeltaColumnMappingTestUtils {
  public  java.lang.String catalogName ()  ;
  public  void checkDescribe (java.lang.String describe, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> keyvalues)  ;
  public  void errorContains (java.lang.String errMsg, java.lang.String str)  ;
  public  void testUsingPath (java.lang.String command, scala.collection.immutable.Seq<org.scalatest.Tag> tags, scala.Function2<java.lang.String, java.lang.String, scala.runtime.BoxedUnit> f)  ;
  public  java.lang.String toQualifiedPath (java.lang.String path)  ;
}
