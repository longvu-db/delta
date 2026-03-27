package org.apache.spark.sql.delta;
public abstract class PublicLogStoreSuite extends org.apache.spark.sql.delta.LogStoreSuiteBase {
  public   PublicLogStoreSuite ()  { throw new RuntimeException(); }
  public  java.lang.String logStoreClassName ()  { throw new RuntimeException(); }
  protected abstract  java.lang.String publicLogStoreClassName ()  ;
  protected  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  protected  void testInitFromSparkConf ()  { throw new RuntimeException(); }
}
