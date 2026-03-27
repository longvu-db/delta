package org.apache.spark.sql.delta;
public  class StatsSchema implements scala.Product, java.io.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long numDeletedRecords ()  { throw new RuntimeException(); }
  public  long numDeletionVectors ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.delta.stats.DeletedRecordCountsHistogram> deletedRecordCountsHistogramOpt ()  { throw new RuntimeException(); }
  // not preceding
  public   StatsSchema (long numDeletedRecords, long numDeletionVectors, scala.Option<org.apache.spark.sql.delta.stats.DeletedRecordCountsHistogram> deletedRecordCountsHistogramOpt)  { throw new RuntimeException(); }
}
