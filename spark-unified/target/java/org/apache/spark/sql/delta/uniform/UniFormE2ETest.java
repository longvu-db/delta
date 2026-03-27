package org.apache.spark.sql.delta.uniform;
/**
 * Base classes for all UniForm end-to-end test cases. Provides support to
 * write data with Delta SparkSession and read data for verification.
 * <p>
 * People who need to write a new test suite should extend this class and
 * implement their test cases with {@link write} and {@link readAndVerify}, which execute
 * with the writer and reader respectively.
 * <p>
 * Implementing classes need to correctly set up the reader and writer environments.
 * See {@link UniFormE2EIcebergSuiteBase} for existing examples.
 */
public  interface UniFormE2ETest extends org.apache.spark.sql.test.SharedSparkSession {
  /**
   * Verify the result by reading from the reader session and compare the result to the expected.
   * <p>
   * @param table  write table name
   * @param fields fields to verify, separated by comma. E.g., "col1, col2"
   * @param orderBy fields to order the results, separated by comma.
   * @param expect expected result
   */
  public  void readAndVerify (java.lang.String table, java.lang.String fields, java.lang.String orderBy, scala.collection.immutable.Seq<org.apache.spark.sql.Row> expect)  ;
  /**
   * Subclasses should override this method when the table name for reading
   * is different from the table name used for writing. For example, when we
   * write a table using the name <code>table1</code>, and then read it from another catalog
   * <code>catalog_read</code>, this method should return <code>catalog_read.default.table1</code>
   * for the input <code>table1</code>.
   * <p>
   * @param tableName table name for writing (name only)
   * @return table name for reading, default is no translation
   */
  public  java.lang.String tableNameForRead (java.lang.String tableName)  ;
  /**
   * Execute write operations through the writer SparkSession
   * <p>
   * @param sqlText write query to the UniForm table
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> write (java.lang.String sqlText)  ;
}
