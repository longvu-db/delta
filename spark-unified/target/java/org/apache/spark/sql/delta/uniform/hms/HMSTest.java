package org.apache.spark.sql.delta.uniform.hms;
/**
 * Provide support to testcases that need to use HMS.
 */
public  interface HMSTest extends org.scalatest.Suite, org.scalatest.BeforeAndAfterAll {
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
  public  org.apache.spark.sql.SparkSession createDeltaSparkSession ()  ;
  public  org.apache.spark.sql.SparkSession createIcebergSparkSession ()  ;
  public  void releaseHMS ()  ;
  public  org.apache.spark.SparkConf setupSparkConfWithHMS (org.apache.spark.SparkConf in)  ;
  public  void withMetaStore (scala.Function1<org.apache.hadoop.conf.Configuration, scala.runtime.BoxedUnit> thunk)  ;
}
