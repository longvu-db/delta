package org.apache.spark.sql.delta.rowid;
public  interface RowTrackingAutoCompactionTests extends org.apache.spark.sql.delta.rowid.RowTrackingCompactionTests {
  public  java.lang.String commandName ()  ;
  public  org.apache.spark.sql.delta.commands.optimize.OptimizeMetrics runCompaction (java.io.File dir, boolean applyFilter)  ;
}
