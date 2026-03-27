package org.apache.spark.sql.delta;
public  interface DeltaTestUtilsForTempViews extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.DeltaTestUtilsBase {
  public  void createTempViewFromSelect (java.lang.String text, boolean isSQLTempView)  ;
  public  void createTempViewFromTable (java.lang.String tableName, boolean isSQLTempView, scala.Option<java.lang.String> format)  ;
  public  void testErrorMessageAndClass (boolean isSQLTempView, org.apache.spark.sql.AnalysisException ex, java.lang.String expectedErrorMsgForSQLTempView, java.lang.String expectedErrorMsgForDataSetTempView, java.lang.String expectedErrorClassForSQLTempView, java.lang.String expectedErrorClassForDataSetTempView)  ;
  public  void testQuietlyWithTempView (java.lang.String testName, scala.Function1<java.lang.Object, java.lang.Object> testFun)  ;
  public  void testWithTempView (java.lang.String testName, scala.Function1<java.lang.Object, java.lang.Object> testFun)  ;
}
