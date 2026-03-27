package org.apache.spark.sql.delta;
public  interface DeltaArbitraryColumnNameSuiteBase extends org.apache.spark.sql.delta.DeltaColumnMappingSuiteUtils {
  public  void assertException (java.lang.String message, scala.Function0<scala.runtime.BoxedUnit> block)  ;
  public  void assertExceptionOneOf (scala.collection.immutable.Seq<java.lang.String> messages, scala.Function0<scala.runtime.BoxedUnit> block)  ;
  public  void createTableWithCTAS (java.lang.String tableName, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, scala.collection.immutable.Map<java.lang.String, java.lang.String> props, scala.collection.immutable.Seq<java.lang.String> partCols)  ;
  public  void createTableWithDataFrameAPI (java.lang.String tableName, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, scala.collection.immutable.Map<java.lang.String, java.lang.String> props, scala.collection.immutable.Seq<java.lang.String> partCols)  ;
  public  void createTableWithDataFrameWriterV2API (java.lang.String tableName, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, scala.collection.immutable.Map<java.lang.String, java.lang.String> props, scala.collection.immutable.Seq<java.lang.String> partCols)  ;
  public  void createTableWithSQLAPI (java.lang.String tableName, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, scala.collection.immutable.Map<java.lang.String, java.lang.String> props, scala.collection.immutable.Seq<java.lang.String> partCols)  ;
  public  void createTableWithSQLCreateOrReplaceAPI (java.lang.String tableName, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, scala.collection.immutable.Map<java.lang.String, java.lang.String> props, scala.collection.immutable.Seq<java.lang.String> partCols)  ;
  public  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> nestedData ()  ;
  public  org.apache.spark.sql.types.StructType nestedSchema ()  ;
  public  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> simpleNestedData ()  ;
  public  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> simpleNestedDataWithDuplicatedNestedColumnName ()  ;
  public  org.apache.spark.sql.types.StructType simpleNestedSchema ()  ;
  public  org.apache.spark.sql.types.StructType simpleNestedSchemaWithDuplicatedNestedColumnName ()  ;
}
