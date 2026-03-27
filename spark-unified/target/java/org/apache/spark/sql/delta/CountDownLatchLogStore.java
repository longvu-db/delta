package org.apache.spark.sql.delta;
public  class CountDownLatchLogStore extends org.apache.spark.sql.delta.storage.LocalLogStore {
  static public  java.util.concurrent.CountDownLatch listFromCalled ()  { throw new RuntimeException(); }
  public   CountDownLatchLogStore (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.hadoop.fs.FileStatus> listFrom (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
}
