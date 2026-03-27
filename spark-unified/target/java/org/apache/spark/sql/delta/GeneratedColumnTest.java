package org.apache.spark.sql.delta;
public  interface GeneratedColumnTest extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.test.DeltaSQLTestUtils {
  public  io.delta.tables.DeltaTableBuilder buildTable (io.delta.tables.DeltaTableBuilder builder, java.lang.String tableName, scala.Option<java.lang.String> path, java.lang.String schemaString, scala.collection.immutable.Map<java.lang.String, java.lang.String> generatedColumns, scala.collection.immutable.Seq<java.lang.String> partitionColumns, scala.collection.immutable.Set<java.lang.String> notNullColumns, scala.collection.immutable.Map<java.lang.String, java.lang.String> comments, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  ;
  public  void createTable (java.lang.String tableName, scala.Option<java.lang.String> path, java.lang.String schemaString, scala.collection.immutable.Map<java.lang.String, java.lang.String> generatedColumns, scala.collection.immutable.Seq<java.lang.String> partitionColumns, scala.collection.immutable.Set<java.lang.String> notNullColumns, scala.collection.immutable.Map<java.lang.String, java.lang.String> comments, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  ;
  public  java.sql.Date sqlDate (java.lang.String date)  ;
  public  java.sql.Timestamp sqlTimestamp (java.lang.String timestamp)  ;
  /** Create a new field with the given generation expression. */
  public  org.apache.spark.sql.types.StructField withGenerationExpression (org.apache.spark.sql.types.StructField field, java.lang.String expr)  ;
  public <T extends java.lang.Object> void withTableName (java.lang.String tableName, scala.Function1<java.lang.String, T> func)  ;
}
