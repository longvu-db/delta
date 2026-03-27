package org.apache.spark.sql.delta;
public  interface MergeIntoDVsTests extends org.apache.spark.sql.delta.MergeIntoDVsMixin {
  public  void assertOperationalDVMetrics (java.lang.String tablePath, long numDeletedRows, long numUpdatedRows, long numCopiedRows, long numTargetFilesRemoved, long numDeletionVectorsAdded, long numDeletionVectorsRemoved, long numDeletionVectorsUpdated)  ;
}
