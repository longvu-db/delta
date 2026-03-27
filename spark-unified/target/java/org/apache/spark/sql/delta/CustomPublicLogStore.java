package org.apache.spark.sql.delta;
public  class CustomPublicLogStore extends io.delta.storage.LogStore {
  public   CustomPublicLogStore (org.apache.hadoop.conf.Configuration initHadoopConf)  { throw new RuntimeException(); }
  public  java.lang.Boolean isPartialWriteVisible (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  java.util.Iterator<org.apache.hadoop.fs.FileStatus> listFrom (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  io.delta.storage.CloseableIterator<java.lang.String> read (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.Path resolvePathOnPhysicalStorage (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  void write (org.apache.hadoop.fs.Path path, java.util.Iterator<java.lang.String> actions, java.lang.Boolean overwrite, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
}
