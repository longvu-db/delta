package org.apache.spark.sql.delta;
public  class OverwriteTrackingLogStore extends org.apache.spark.sql.delta.storage.LocalLogStore {
  public   OverwriteTrackingLogStore (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  void clearCounts ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.hadoop.fs.Path, java.lang.Object> fileToOverwriteCount ()  { throw new RuntimeException(); }
  public  boolean isPartialWriteVisible (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  void setPartialWriteVisible (boolean isPartialWriteVisibleBool)  { throw new RuntimeException(); }
  public  void write (org.apache.hadoop.fs.Path path, scala.collection.Iterator<java.lang.String> actions, boolean overwrite, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
}
