package org.apache.spark.sql.delta;
public  interface DeltaErrorsSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.scalatest.GivenWhenThen, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.errors.QueryErrorsBase {
  public  int MAX_URL_ACCESS_RETRIES ()  ;
  public  boolean checkIfValidResponse (java.lang.String url, java.lang.String response)  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> errorMessagesToTest ()  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Throwable> errorsToTest ()  ;
  public  java.lang.String generateDocsLink (java.lang.String relativePath)  ;
  public  scala.collection.immutable.List<java.lang.String> getUrlsFromMessage (java.lang.String message)  ;
  public  java.lang.String multipleSourceRowMatchingTargetRowInMergeUrl ()  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> otherMessagesToTest ()  ;
  public  java.lang.String path ()  ;
  public  void setCustomContext (org.apache.spark.sql.SparkSession session, org.apache.spark.SparkContext context)  ;
  public  void testUrl (java.lang.String errName, java.lang.String url)  ;
  public  void testUrls ()  ;
}
