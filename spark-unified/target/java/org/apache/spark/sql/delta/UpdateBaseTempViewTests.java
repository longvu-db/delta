package org.apache.spark.sql.delta;
public  interface UpdateBaseTempViewTests extends org.apache.spark.sql.delta.UpdateBaseMixin {
  public  void testComplexTempViews (java.lang.String name, java.lang.String text, scala.collection.immutable.Seq<org.apache.spark.sql.Row> expectedResult)  ;
  public  void testInvalidTempViews (java.lang.String name, java.lang.String text, java.lang.String expectedErrorMsgForSQLTempView, java.lang.String expectedErrorMsgForDataSetTempView, java.lang.String expectedErrorClassForSQLTempView, java.lang.String expectedErrorClassForDataSetTempView)  ;
}
