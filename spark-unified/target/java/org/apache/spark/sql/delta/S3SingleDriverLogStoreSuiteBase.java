package org.apache.spark.sql.delta;
public  interface S3SingleDriverLogStoreSuiteBase {
  /**
   * S3SingleDriverLogStore.scala can invalidate cache
   * S3SingleDriverLogStore.java cannot invalidate cache
   * @return (undocumented)
   */
  public  boolean canInvalidateCache ()  ;
  public  void checkFileSystemList (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path, scala.collection.immutable.Seq<java.lang.Object> expectedVersions)  ;
  public  void checkLogStoreList (org.apache.spark.sql.delta.storage.LogStore store, org.apache.hadoop.fs.Path path, scala.collection.immutable.Seq<java.lang.Object> expectedVersions, org.apache.hadoop.conf.Configuration hadoopConf)  ;
  public  boolean shouldUseRenameToWriteCheckpoint ()  ;
}
