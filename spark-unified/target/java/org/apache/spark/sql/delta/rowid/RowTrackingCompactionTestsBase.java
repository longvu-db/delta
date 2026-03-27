package org.apache.spark.sql.delta.rowid;
public  interface RowTrackingCompactionTestsBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.rowid.RowIdTestUtils {
  public  void checkCompactionRowTrackingPreservation (java.io.File dir, boolean applyFilter)  ;
  public  java.lang.String commandName ()  ;
  public  void createTable (java.io.File dir, boolean rowTrackingEnabled, boolean partitioned, boolean withMaterializedRowTrackingColumns)  ;
  public  int numSoftDeletedRows ()  ;
  public  org.apache.spark.sql.delta.commands.optimize.OptimizeMetrics runCompaction (java.io.File dir, boolean applyFilter)  ;
  public  org.apache.spark.sql.delta.commands.optimize.OptimizeMetrics runStatement (java.lang.String statement)  ;
  public  void runTest (boolean partitioned, boolean withMaterializedRowTrackingColumns, boolean applyFilter)  ;
  public  void writeDf (java.io.File dir, boolean partitioned, boolean withMaterializedRowTrackingColumns, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> _df)  ;
}
