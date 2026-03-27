package org.apache.spark.sql.delta;
public  interface DeltaCDCColumnMappingSuiteBase extends org.apache.spark.sql.delta.DeltaColumnMappingTestUtils, org.apache.spark.sql.delta.test.DeltaColumnMappingSelectedTestMixin {
  public  class DataFrameDropCDCFields {
    public   DataFrameDropCDCFields (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dropCDCFields ()  { throw new RuntimeException(); }
  }
  public  void assertBlocked (long expectedIncompatSchemaVersion, long expectedReadSchemaVersion, org.apache.spark.sql.delta.DeltaBatchCDFSchemaMode schemaMode, boolean timeTravel, boolean bySchemaChange, scala.Function0<scala.runtime.BoxedUnit> f, org.apache.spark.sql.delta.DeltaLog log)  ;
  public  scala.collection.immutable.Seq<java.lang.String> runOnlyTests ()  ;
  /**
   * Set up initial table data, considering current column mapping mode
   * <p>
   * The table contains 10 rows, with schema <id, value> both are string
   * @param dir (undocumented)
   * @param upgradeInNameMode (undocumented)
   */
  public  void setupInitialDeltaTable (java.io.File dir, boolean upgradeInNameMode)  ;
  /**
   * Write test delta data to test blocking column mapping for CDC batch queries, it takes a
   * sequence and write out as a row of strings, assuming the delta log's schema are all strings.
   * @param data (undocumented)
   * @param userSpecifiedSchema (undocumented)
   * @param log (undocumented)
   */
  public  void writeDeltaData (scala.collection.immutable.Seq<java.lang.Object> data, scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema, org.apache.spark.sql.delta.DeltaLog log)  ;
}
