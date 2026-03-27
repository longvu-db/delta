package org.apache.spark.sql.delta.uniform;
public  interface IcebergCompatV2EnableUniformByAlterTableSuiteBase {
  /**
   * The basic test case for enable uniform by ALTER TABLE,
   * this could be used as a prior setup for subsequent tests.
   * <p>
   * @param id the table id.
   * @param loc the table location.
   */
  public  void alterTableToEnableIcebergCompatV2BaseCase (java.lang.String id, java.lang.String loc)  ;
  /**
   * Assert the invariance between old and new parquet footers,
   * this will check if the number of overlapped parquet footers
   * is the same as expected and extract the newer portion of footers,
   * i.e., the portion of parquet files present in <code>newParquetFooters</code>
   * but not in <code>oldParquetFooters</code>; or the overlapped portion of footers,
   * as specified by the flag <code>newerOrOverlapped</code>.
   * <p>
   * This function is useful when, e.g.,
   * - checking the invariance of parquet footers before and after
   *   ALTER TABLE to enable UniForm, a portion of parquet footers
   *   will stay the same, and the new portion of parquet footers
   *   should be <code>IcebergCompatV2</code>.
   * - after running REORG UPGRADE UNIFORM, there may be a portion of
   *   parquet files that do not need to be rewritten, and the number
   *   should be the same as expected.
   * <p>
   * @param oldParquetFooters the old version of parquet footers.
   * @param newParquetFooters the new version of parquet footers.
   * @param expectedNumOfOverlappedParquetFiles the expected number of overlapped parquet footers.
   * @param expectedNumOfAddedParquetFiles the expected number of added portion of parquet footers.
   * @return a pair consists of (overlapped parquet footers, added parquet footers).
   */
  public  scala.Tuple2<scala.collection.immutable.Seq<org.apache.parquet.hadoop.metadata.ParquetMetadata>, scala.collection.immutable.Seq<org.apache.parquet.hadoop.metadata.ParquetMetadata>> assertInvarianceAndExtractParquetFooters (scala.collection.immutable.Seq<org.apache.parquet.hadoop.metadata.ParquetMetadata> oldParquetFooters, scala.collection.immutable.Seq<org.apache.parquet.hadoop.metadata.ParquetMetadata> newParquetFooters, int expectedNumOfOverlappedParquetFiles, int expectedNumOfAddedParquetFiles)  ;
  /**
   * Assert the properties for old and new parquet footers.
   * Specifically, first check the number of overlapped and added parquet footers
   * to match with the expected numbers;
   * then extract and assert whether each should be considered <code>IcebergCompatV2</code>
   * by the expected values.
   * <p>
   * @param oldParquetFooters the old version of parquet footers.
   * @param newParquetFooters the new version of parquet footers.
   * @param expectedNumOfOverlappedParquetFiles the expected number of overlapped parquet footers.
   * @param expectedNumOfAddedParquetFiles the expected number of added parquet footers.
   * @param isOverlappedIcebergCompatV2 whether the overlapped parquet footers is expected
   *                                    to be <code>IcebergCompatV2</code>.
   * @param isAddedIcebergCompatV2 whether the added parquet footers is expected to be
   *                               <code>IcebergCompatV2</code>.
   */
  public  void assertParquetFootersProperties (scala.collection.immutable.Seq<org.apache.parquet.hadoop.metadata.ParquetMetadata> oldParquetFooters, scala.collection.immutable.Seq<org.apache.parquet.hadoop.metadata.ParquetMetadata> newParquetFooters, int expectedNumOfOverlappedParquetFiles, int expectedNumOfAddedParquetFiles, boolean isOverlappedIcebergCompatV2, boolean isAddedIcebergCompatV2)  ;
  /** The wrapper function to assert the protocol and properties for UniForm Iceberg */
  public  void assertUniFormIcebergProtocolAndProperties (java.lang.String id)  ;
  /**
   * Create a delta table with nested types and column-mapping enabled.
   * <p>
   * @param id the table id used for creation.
   * @param loc the table location.
   */
  public  void createDeltaTableWithNestedTypesAndColumnMapping (java.lang.String id, java.lang.String loc)  ;
  /**
   * Create an <code>IcebergCompatV1</code> uniform table with a single partition column.
   * <p>
   * @param id the table id used for creation.
   * @param loc the table location.
   */
  public  void createIcebergCompatV1Table (java.lang.String id, java.lang.String loc)  ;
  /**
   * Create a delta table with liquid clustering enabled for a single column.
   * <p>
   * @param id the table id used for creation.
   * @param loc the table location.
   */
  public  void createLiquidDeltaTable (java.lang.String id, java.lang.String loc)  ;
  /**
   * Create a vanilla delta table with a single partition column.
   * <p>
   * @param id the table id used for creation.
   * @param loc the table location.
   */
  public  void createVanillaDeltaTableWithDV (java.lang.String id, java.lang.String loc)  ;
  /**
   * Create a vanilla delta table with DV disabled and a single partition column.
   * <p>
   * @param id the table id used for creation.
   * @param loc the table location.
   */
  public  void createVanillaDeltaTableWithoutDV (java.lang.String id, java.lang.String loc)  ;
  /**
   * Enable <code>IcebergCompatV2</code> by ALTER TABLE command for the table.
   * <p>
   * @param id the table id used for ALTER TABLE to enable <code>IcebergCompatV2</code>.
   */
  public  void enableIcebergCompatV2ByAlterTable (java.lang.String id)  ;
  /**
   * Helper function to enforce the properties that an <code>IcebergCompatV2</code>
   * Delta Uniform requires.
   * e.g., disable DV, ensure reader/writer versions, enable column-mapping.
   * <p>
   * @param id the table to be altered.
   */
  public  void enforceDeltaUniformRequireProperties (java.lang.String id)  ;
  /** The wrapper function to execute sql */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> executeSql (java.lang.String sqlStr)  ;
  /**
   * Get all parquet footers of data files for the specified table.
   * <p>
   * @param spark the spark session used to get the footers.
   * @param id the table id from which to get all the parquet footers.
   * @return all parquet metadata/footers of the parquet (data) files for this table.
   */
  public  scala.collection.immutable.Seq<org.apache.parquet.hadoop.metadata.ParquetMetadata> getParquetFooters (org.apache.spark.sql.SparkSession spark, java.lang.String id)  ;
  /**
   * Insert two additional rows to the specified table.
   * <p>
   * @param id the table id used for insertion.
   */
  public  void insertAdditionalRowsIntoTable (java.lang.String id)  ;
  /**
   * Insert three initial rows to the specified table.
   * <p>
   * @param id the table id used for insertion.
   */
  public  void insertInitialRowsIntoTable (java.lang.String id)  ;
  /**
   * Insert a single row to the delta table with nested types and column-mapping enabled.
   * <p>
   * @param id the table used for insertion.
   */
  public  void insertRowToDeltaTableWithNestedTypesAndColumnMapping (java.lang.String id)  ;
  /** Check if `IcebergCompatV1` is enabled based on the provided snapshot */
  public  boolean isIcebergCompatV1Enabled (org.apache.spark.sql.delta.Snapshot snapshot)  ;
  /** Check if `IcebergCompatV2` is enabled based on the provided snapshot */
  public  boolean isIcebergCompatV2Enabled (org.apache.spark.sql.delta.Snapshot snapshot)  ;
  /**
   * Check whether the current parquet footers are all <code>IcebergCompatV2</code>.
   * This will check two properties for each parquet footer,
   * see {@link ParquetIcebergCompatV2Utils.isParquetIcebergCompatV2} for details.
   * <p>
   * @param parquetFooters the parquet footers to be checked.
   * @return whether the footers are considered <code>IcebergCompatV2</code>
   */
  public  boolean isParquetFootersIcebergCompatV2 (scala.collection.immutable.Seq<org.apache.parquet.hadoop.metadata.ParquetMetadata> parquetFooters)  ;
  public  org.apache.spark.sql.SparkSession spark ()  ;
  /** The wrapper function to generate a temporary table and directory */
  public  void withTempTableAndDir (scala.Function2<java.lang.String, java.lang.String, scala.runtime.BoxedUnit> f)  ;
}
