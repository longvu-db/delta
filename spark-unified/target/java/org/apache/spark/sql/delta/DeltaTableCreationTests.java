package org.apache.spark.sql.delta;
public  interface DeltaTableCreationTests extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.DeltaColumnMappingTestUtils {
  public  void checkResult (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> result, scala.collection.immutable.Seq<java.lang.Object> expected, scala.collection.immutable.Seq<java.lang.String> columns)  ;
  public  void createDeltaTableByPath (java.io.File path, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String tableName, scala.collection.immutable.Seq<java.lang.String> partitionedBy)  ;
  public  java.lang.String createTableWithEmptySchemaQuery (java.lang.String tableName, java.lang.String provider, scala.Option<java.lang.String> location)  ;
  public  java.lang.String format ()  ;
  public  java.lang.String getDefaultTablePath (java.lang.String tableName)  ;
  public  org.apache.spark.sql.delta.DeltaLog getDeltaLog (org.apache.spark.sql.catalyst.catalog.CatalogTable table)  ;
  public  org.apache.spark.sql.delta.DeltaLog getDeltaLog (java.lang.String tableName)  ;
  public  org.apache.spark.sql.delta.DeltaLog getDeltaLog (org.apache.hadoop.fs.Path path)  ;
  public  scala.collection.immutable.Seq<java.lang.String> getPartitioningColumns (java.lang.String tableName)  ;
  public  org.apache.spark.sql.types.StructType getSchema (java.lang.String tableName)  ;
  public  java.lang.String getTablePath (java.lang.String tableName)  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getTableProperties (java.lang.String tableName)  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  public  org.apache.spark.sql.catalyst.TableIdentifier toTableIdentifier (java.lang.String tableName)  ;
  public  void verifyTableInCatalog (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog, java.lang.String table)  ;
}
