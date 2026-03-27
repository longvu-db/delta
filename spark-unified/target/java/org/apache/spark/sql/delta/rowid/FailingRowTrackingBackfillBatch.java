package org.apache.spark.sql.delta.rowid;
/** Test-only object that overrides a method to force a failure. */
public  class FailingRowTrackingBackfillBatch implements org.apache.spark.sql.delta.commands.backfill.BackfillBatch, scala.Product, java.io.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.AddFile> filesInBatch ()  { throw new RuntimeException(); }
  // not preceding
  public   FailingRowTrackingBackfillBatch (scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.AddFile> filesInBatch)  { throw new RuntimeException(); }
  public  java.lang.String backfillBatchStatsOpType ()  { throw new RuntimeException(); }
  public  long prepareFilesAndCommit (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.OptimisticTransaction txn, int batchId)  { throw new RuntimeException(); }
}
