package org.apache.spark.sql.delta;
public  interface DeltaParquetFileFormatSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.DeletionVectorsTestUtils, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public  void assertParquetHasMultipleRowGroups (org.apache.hadoop.fs.Path filePath)  ;
  public  org.apache.spark.sql.delta.storage.dv.DeletionVectorStore dvStore ()  ;
  /** Helper method to generate a table with single Parquet file with multiple rowgroups */
  public  void generateData (java.lang.String tablePath)  ;
  public  org.apache.hadoop.conf.Configuration hadoopConf ()  ;
  /** Helper method to run the test with vectorized and non-vectorized Parquet readers */
  public  void testWithBothParquetReaders (java.lang.String name, scala.Function0<java.lang.Object> f)  ;
}
