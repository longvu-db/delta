package org.apache.spark.sql.delta;
public  interface UpdateBaseMixin extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.DeltaDMLTestUtils, org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.DeltaTestUtilsForTempViews {
  public  void checkUpdate (scala.Option<java.lang.String> condition, java.lang.String setClauses, scala.collection.immutable.Seq<org.apache.spark.sql.Row> expectedResults, scala.Option<java.lang.String> tableName, java.lang.String prefix)  ;
  public  void checkUpdateJson (scala.collection.immutable.Seq<java.lang.String> target, scala.collection.immutable.Seq<java.lang.String> source, java.lang.String updateWhere, scala.collection.immutable.Seq<java.lang.String> set, scala.collection.immutable.Seq<java.lang.String> expected)  ;
  public  void executeUpdate (java.lang.String target, scala.collection.immutable.Seq<java.lang.String> set, java.lang.String where)  ;
  public  void executeUpdate (java.lang.String target, java.lang.String set, java.lang.String where)  ;
  public  scala.collection.immutable.Seq<java.lang.String> jsonStringToSeq (java.lang.String json)  ;
  public  void testAnalysisException (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> targetDF, scala.collection.immutable.Seq<java.lang.String> set, java.lang.String where, scala.collection.immutable.Seq<java.lang.String> errMsgs)  ;
}
