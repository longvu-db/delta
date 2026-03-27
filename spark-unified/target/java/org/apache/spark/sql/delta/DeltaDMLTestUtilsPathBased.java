package org.apache.spark.sql.delta;
public  interface DeltaDMLTestUtilsPathBased extends org.apache.spark.sql.delta.DeltaDMLTestUtils {
  public  void beforeEach ()  ;
  public  void dropTable ()  ;
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> readDeltaTable (java.lang.String path)  ;
  public  org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier ()  ;
  public  java.lang.String tableSQLIdentifier ()  ;
  public  java.io.File tempDir ()  ;
  public  java.lang.String tempPath ()  ;
}
