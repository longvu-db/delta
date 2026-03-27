package org.apache.spark.sql.delta;
public  interface DeleteBaseMixin extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.DeltaDMLTestUtils, org.apache.spark.sql.delta.DeltaTestUtilsForTempViews {
  public  void checkDelete (scala.Option<java.lang.String> condition, scala.collection.immutable.Seq<org.apache.spark.sql.Row> expectedResults, scala.Option<java.lang.String> tableName)  ;
  public  void executeDelete (java.lang.String target, java.lang.String where)  ;
  public  void testComplexTempViews (java.lang.String name, java.lang.String text, scala.collection.immutable.Seq<org.apache.spark.sql.Row> expectResult)  ;
  public  void testInvalidTempViews (java.lang.String name, java.lang.String text, java.lang.String expectedErrorMsgForSQLTempView, java.lang.String expectedErrorMsgForDataSetTempView, java.lang.String expectedErrorClassForSQLTempView, java.lang.String expectedErrorClassForDataSetTempView)  ;
  public  void testSuperSetColsTempView ()  ;
}
