package org.apache.spark.sql.delta.rowid;
public  interface RowTrackingUpdateSuiteBase extends org.apache.spark.sql.delta.rowid.RowIdTestUtils, org.apache.spark.sql.delta.rowtracking.RowTrackingEnabled {
  public  void checkAndExecuteUpdate (java.lang.String tableName, scala.Option<java.lang.String> condition, long newVersion)  ;
  public  boolean dvsEnabled ()  ;
  public  void executeUpdate (java.lang.String tableName, scala.Option<java.lang.String> where, long newVersion)  ;
  public  int numFiles ()  ;
  public  int numRowsPerFile ()  ;
  public  int numRowsTarget ()  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  public  java.lang.String targetTableName ()  ;
  public  void withRowIdTestTable (boolean isPartitioned, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void writeTestTable (java.lang.String tableName, boolean isPartitioned, long lastModifiedVersion)  ;
}
