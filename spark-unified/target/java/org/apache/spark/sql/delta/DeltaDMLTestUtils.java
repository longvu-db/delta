package org.apache.spark.sql.delta;
/**
 * Trait collecting helper methods for DML tests e.p. creating a test table for each test and
 * cleaning it up after each test.
 */
public  interface DeltaDMLTestUtils extends org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.DeltaTestUtilsBase, org.scalatest.BeforeAndAfterEach, org.apache.spark.sql.delta.CDCTestMixin {
  /**
   * Use this to artificially move the current time to after the table retention period.
   */
  public  void advancePastRetentionPeriod ()  ;
  public  void afterEach ()  ;
  public  void append (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.immutable.Seq<java.lang.String> partitionBy)  ;
  /**
   * Clock used for {@link deltaLog}. {@link SystemClock} is used if not set via {@link setupManualClock}.
   * @return (undocumented)
   */
  public  org.apache.spark.util.ManualClock clock ()  ;
  public  org.apache.spark.sql.delta.DeltaLog deltaLog ()  ;
  public  void dropTable ()  ;
  /**
   * Finds the latest operation of the given type that ran on the test table and returns the
   * dataframe with the changes of the corresponding table version.
   * <p>
   * @param operation Delta operation name, see {@link DeltaOperations}.
   * @param deltaLog (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getCDCForLatestOperation (org.apache.spark.sql.delta.DeltaLog deltaLog, java.lang.String operation)  ;
  /**
   * Reads a delta table by its identifier. The identifier can either be the table name or table
   * path that is in the form of delta.<code>tablePath</code>.
   * @param tableIdentifier (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> readDeltaTableByIdentifier (java.lang.String tableIdentifier)  ;
  /**
   * Parse the input JSON data into a dataframe, one row per input element.
   * Throws an exception on malformed inputs or records that don't comply with the provided schema.
   * @param data (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> readFromJSON (scala.collection.immutable.Seq<java.lang.String> data, org.apache.spark.sql.types.StructType schema)  ;
  public  void setupManualClock ()  ;
  public  org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier ()  ;
  public  java.lang.String tableSQLIdentifier ()  ;
  public  void withKeyValueData (scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> source, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> target, boolean isKeyPartitioned, scala.Tuple2<java.lang.String, java.lang.String> sourceKeyValueNames, scala.Tuple2<java.lang.String, java.lang.String> targetKeyValueNames, scala.Function2<java.lang.String, java.lang.String, scala.runtime.BoxedUnit> thunk)  ;
  public <T extends java.lang.Object> void writeTable (org.apache.spark.sql.DataFrameWriter<T> dfw, java.lang.String tableName)  ;
}
