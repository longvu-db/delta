package org.apache.spark.sql.delta;
public  interface DeltaDMLTestUtilsNameBased extends org.apache.spark.sql.delta.DeltaDMLTestUtils {
  public  void append (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.immutable.Seq<java.lang.String> partitionBy)  ;
  public  void dropTable ()  ;
  public  org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier ()  ;
  public  java.lang.String tableSQLIdentifier ()  ;
  public  void test (java.lang.String testName, scala.collection.immutable.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  ;
}
