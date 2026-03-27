package org.apache.spark.sql.delta;
/**
 * A custom log store that allows to provide custom listing results. This is useful to test
 * <code>DeltaLog.findLastCompleteCheckpointBefore</code> method.
 */
public  class CustomListingLogStore extends org.apache.spark.sql.delta.storage.LocalLogStore {
  // not preceding
  public   CustomListingLogStore (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Seq<org.apache.hadoop.fs.FileStatus>> customListingResult ()  { throw new RuntimeException(); }
  public  int elementsConsumedFromListFromIter ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.hadoop.fs.FileStatus> listFrom (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  int listFromCount ()  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
}
