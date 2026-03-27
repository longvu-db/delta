package org.apache.spark.sql.delta.test;
public  interface DeltaSQLTestUtils extends org.apache.spark.sql.test.SQLTestUtils {
  /** Changes `columnName` to `newType` */
  public  void alterColumnType (java.lang.String tableName, java.lang.String columnName, java.lang.String newType)  ;
  /** Verifies column is of expected data type. */
  public  void assertColumnDataType (java.lang.String tableName, java.lang.String columnName, org.apache.spark.sql.types.DataType expectedDataType)  ;
  /** Verifies `columnName` does not exist in `tableName`. */
  public  void assertColumnNotExist (java.lang.String tableName, java.lang.String columnName)  ;
  /** Verifies min/max stats values of `columnName` in `stats`. */
  public  void assertMinMaxStats (java.lang.String tableName, com.fasterxml.jackson.databind.JsonNode stats, java.lang.String columnName, java.lang.String expectedMin, java.lang.String expectedMax)  ;
  /** Verifies whether there are min/max stats of `columnName` in `stats`. */
  public  void assertMinMaxStatsPresence (java.lang.String tableName, com.fasterxml.jackson.databind.JsonNode stats, java.lang.String columnName, boolean expectStats)  ;
  /** Verifies minReaderVersion and minWriterVersion of the protocol. */
  public  void assertProtocolVersion (org.apache.spark.sql.delta.actions.Protocol protocol, int minReaderVersion, int minWriterVersion)  ;
  /**
   * Runs <code>select</code> query on <code>tableName</code> with <code>predicate</code> and verifies the number of rows returned
   * and files read.
   * @param tableName (undocumented)
   * @param predicate (undocumented)
   * @param numRows (undocumented)
   * @param numFilesRead (undocumented)
   */
  public  void assertSelectQueryResults (java.lang.String tableName, java.lang.String predicate, int numRows, int numFilesRead)  ;
  /**
   * Runs <code>query</code> and verifies the number of rows returned
   * and files read.
   * @param query (undocumented)
   * @param numRows (undocumented)
   * @param numFilesRead (undocumented)
   */
  public  void assertSelectQueryResults (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> query, int numRows, int numFilesRead)  ;
  /**
   * Override the temp dir/path creation methods from {@link SQLTestUtils} to:
   * 1. Drop the call to <code>waitForTasksToFinish</code> which is a source of flakiness due to timeouts
   *    without clear benefits.
   * 2. Allow creating paths with special characters for better test coverage.
   * @return (undocumented)
   */
  public  java.lang.String defaultTempDirPrefix ()  ;
  /** Drops `columnName` from `tableName`. */
  public  void dropColumn (java.lang.String tableName, java.lang.String columnName)  ;
  /** Drops table feature for `tableName` and `featureName`. */
  public  void dropTableFeature (java.lang.String tableName, java.lang.String featureName)  ;
  /** Enables table feature for `tableName` and given `featureName`. */
  public  void enableTableFeature (java.lang.String tableName, java.lang.String featureName)  ;
  /** Gets the `StructField` of `columnPath`. */
  public  org.apache.spark.sql.types.StructField getColumnField (org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Seq<java.lang.String> columnPath)  ;
  /** Gets the `StructField` of `columnName`. */
  public  org.apache.spark.sql.types.StructField getColumnField (java.lang.String tableName, java.lang.String columnName)  ;
  /** Gets the `DataType` of `columnPath`. */
  public  org.apache.spark.sql.types.DataType getColumnType (org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Seq<java.lang.String> columnPath)  ;
  /** Gets the `DataType` of `columnName`. */
  public  org.apache.spark.sql.types.DataType getColumnType (java.lang.String tableName, java.lang.String columnName)  ;
  /** Gets the min/max stats of `columnName` from `stats`. */
  public  scala.Tuple2<java.lang.String, java.lang.String> getMinMaxStats (java.lang.String tableName, com.fasterxml.jackson.databind.JsonNode stats, java.lang.String columnName)  ;
  /** Gets the min/max stats of `columnName` from `stats` if they exist. */
  public  scala.Tuple2<scala.Option<java.lang.String>, scala.Option<java.lang.String>> getMinMaxStatsOpt (java.lang.String tableName, com.fasterxml.jackson.databind.JsonNode stats, java.lang.String columnName)  ;
  /** Returns the number of read files by the query with given query text. */
  public  int getNumReadFiles (java.lang.String queryText)  ;
  /** Returns the number of read files by the given data frame query. */
  public  int getNumReadFiles (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  ;
  /** Gets the physical column path if there is column mapping metadata in the schema. */
  public  scala.collection.immutable.Seq<java.lang.String> getPhysicalColumnPath (org.apache.spark.sql.types.StructType tableSchema, java.lang.String columnName)  ;
  /** Gets the table protocol of the latest snapshot. */
  public  org.apache.spark.sql.delta.actions.Protocol getProtocolForTable (java.lang.String tableName)  ;
  /** Gets the latest snapshot of the table. */
  public  org.apache.spark.sql.delta.Snapshot getSnapshot (java.lang.String tableName)  ;
  /** Gets the value of a specified field from `stats` JSON node if it exists. */
  public  scala.Option<com.fasterxml.jackson.databind.JsonNode> getStatFieldOpt (com.fasterxml.jackson.databind.JsonNode stats, scala.collection.immutable.Seq<java.lang.String> path)  ;
  /**
   * Gets the stats fields from the AddFiles of <code>snapshot</code>. The stats are ordered by the
   * modification time of the files they are associated with.
   * @param snapshot (undocumented)
   * @return (undocumented)
   */
  public  com.fasterxml.jackson.databind.JsonNode[] getUnvalidatedStatsOrderByFileModTime (org.apache.spark.sql.delta.Snapshot snapshot)  ;
  /**
   * Gets the stats fields from the AddFiles of <code>tableName</code>. The stats are ordered by the
   * modification time of the files they are associated with.
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public  com.fasterxml.jackson.databind.JsonNode[] getUnvalidatedStatsOrderByFileModTime (java.lang.String tableName)  ;
  /** Whether the table protocol supports the given table feature. */
  public  boolean isFeatureSupported (java.lang.String tableName, org.apache.spark.sql.delta.TableFeature tableFeature)  ;
  /** Whether the table protocol supports the given table feature. */
  public  boolean isFeatureSupported (java.lang.String tableName, java.lang.String featureName)  ;
  /** Returns random alphanumberic string to be used as a unique table name. */
  public  java.lang.String uniqueTableName ()  ;
  /**
   * Creates a Catalog-Managed Delta table for tests.
   * <p>
   * @param createTable Whether to create the table with CatalogOwnedTableFeature enabled.
   * @param f The function to execute with the generated table name.
   */
  public  void withCatalogManagedTable (boolean createTable, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f)  ;
  public  void withTempDir (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  ;
  /**
   * Creates a temporary directory, which is then passed to <code>f</code> and will be deleted after <code>f</code>
   * returns.
   * @param prefix (undocumented)
   * @param f (undocumented)
   */
  public  void withTempDir (java.lang.String prefix, scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  ;
  public  void withTempPath (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  ;
  /**
   * Generates a temporary directory path without creating the actual directory, which is then
   * passed to <code>f</code> and will be deleted after <code>f</code> returns.
   * @param prefix (undocumented)
   * @param f (undocumented)
   */
  public  void withTempPath (java.lang.String prefix, scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  ;
  public  void withTempPaths (int numPaths, scala.Function1<scala.collection.immutable.Seq<java.io.File>, scala.runtime.BoxedUnit> f)  ;
  /**
   * Generates the specified number of temporary directory paths without creating the actual
   * directories, which are then passed to <code>f</code> and will be deleted after <code>f</code> returns.
   * @param numPaths (undocumented)
   * @param prefix (undocumented)
   * @param f (undocumented)
   */
  public  void withTempPaths (int numPaths, java.lang.String prefix, scala.Function1<scala.collection.immutable.Seq<java.io.File>, scala.runtime.BoxedUnit> f)  ;
  /**
   * Creates a temporary table with a unique name for testing and executes a function with it.
   * The table is automatically cleaned up after the function completes.
   * <p>
   * @param createTable Whether to create an empty table.
   * @param f The function to execute with the generated table name.
   */
  public  void withTempTable (boolean createTable, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f)  ;
}
