package org.apache.spark.sql.delta.rowid;
public  interface RowTrackingPurgeTests extends org.apache.spark.sql.delta.rowid.RowTrackingCompactionTests, org.apache.spark.sql.delta.PersistentDVEnabled {
  public  java.lang.String commandName ()  ;
  public  void createTable (java.io.File dir, boolean rowTrackingEnabled, boolean partitioned, boolean withMaterializedRowTrackingColumns)  ;
  public  int numSoftDeletedRows ()  ;
  public  org.apache.spark.sql.delta.commands.optimize.OptimizeMetrics runCompaction (java.io.File dir, boolean applyFilter)  ;
}
