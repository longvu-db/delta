package org.apache.spark.sql.delta;
public  interface GeneratedColumnSuiteBase extends org.apache.spark.sql.delta.GeneratedColumnTest {
  public  void createDefaultTestTable (java.lang.String tableName, scala.Option<java.lang.String> path)  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> defaultTestTableGeneratedColumns ()  ;
  public  scala.collection.immutable.List<java.lang.String> defaultTestTablePartitionColumns ()  ;
  public  java.lang.String defaultTestTableSchema ()  ;
  public  void errorContains (java.lang.String errMsg, java.lang.String str)  ;
  public  void replaceTable (java.lang.String tableName, scala.Option<java.lang.String> path, java.lang.String schemaString, scala.collection.immutable.Map<java.lang.String, java.lang.String> generatedColumns, scala.collection.immutable.Seq<java.lang.String> partitionColumns, scala.collection.immutable.Set<java.lang.String> notNullColumns, scala.collection.immutable.Map<java.lang.String, java.lang.String> comments, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties, scala.Option<java.lang.Object> orCreate)  ;
  public  void testCreateTable (java.lang.String testName, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> createFunc)  ;
  public  void testCreateTableWithLocation (java.lang.String testName, scala.Function2<java.lang.String, java.lang.String, scala.runtime.BoxedUnit> createFunc)  ;
  /**
   * @param updateFunc A function that's called with the table information (tableName, path). It
   *                   should execute update operations, and return the expected data after
   *                   updating.
   * @param testName (undocumented)
   * @param isStreaming (undocumented)
   */
  public  void testTableUpdate (java.lang.String testName, boolean isStreaming, scala.Function2<java.lang.String, java.lang.String, scala.collection.immutable.Seq<org.apache.spark.sql.Row>> updateFunc)  ;
  public  void testTableUpdateDPO (java.lang.String testName, scala.Function2<java.lang.String, java.lang.String, scala.collection.immutable.Seq<org.apache.spark.sql.Row>> updateFunc)  ;
  public  void testTypeMismatch (org.apache.spark.sql.types.DataType generatedColumnType, boolean generatedColumnNullable, org.apache.spark.sql.Column generateAsExpression, boolean expectSuccess)  ;
  /**
   * Verify if the table metadata matches the default test table. We use this to verify DDLs
   * write correct table metadata into the transaction logs.
   * @param table (undocumented)
   */
  public  void verifyDefaultTestTableMetadata (java.lang.String table)  ;
}
