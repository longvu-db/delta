package org.apache.spark.sql.delta;
/**
 * Various helper methods to for metric tests.
 */
public  class DeltaMetricsUtils {
  /**
   * Get operation metrics of the last operation of a table.
   * <p>
   * @param table The Delta table to query
   * @return The operation metrics of the last command.
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> getLastOperationMetrics (io.delta.tables.DeltaTable table)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> getLastOperationMetrics (java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Assert that metrics of a Delta operation have the expected values.
   * <p>
   * @param expectedMetrics The expected metrics the values of which to check.
   * @param operationMetrics The operation metrics that were collected from Delta log.
   */
  static public  void checkOperationMetrics (scala.collection.immutable.Map<java.lang.String, java.lang.Object> expectedMetrics, scala.collection.immutable.Map<java.lang.String, java.lang.Object> operationMetrics)  { throw new RuntimeException(); }
  /**
   * Check that time metrics for a Delta operation are valid.
   * <p>
   * @param operationMetrics The collected operation metrics from the Delta log.
   * @param expectedMetrics The keys of the expected time metrics. Set to None to check for
   *                        common time metrics.
   */
  static public  void checkOperationTimeMetrics (scala.collection.immutable.Map<java.lang.String, java.lang.Object> operationMetrics, scala.collection.immutable.Set<java.lang.String> expectedMetrics)  { throw new RuntimeException(); }
  /**
   * Computes the expected operation metrics from the actions in a Delta commit.
   * <p>
   * @param deltaLog The Delta log of the table.
   * @param version The version of the commit.
   * @return A map with the expected operation metrics.
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> getOperationMetricsFromCommitActions (org.apache.spark.sql.delta.DeltaLog deltaLog, long version)  { throw new RuntimeException(); }
  /**
   * Checks the provided operation metrics against the actions in a Delta commit.
   * <p>
   * @param deltaLog The Delta log of the table.
   * @param version The version of the commit.
   * @param operationMetrics The operation metrics that were collected from Delta log.
   */
  static public  void checkOperationMetricsAgainstCommitActions (org.apache.spark.sql.delta.DeltaLog deltaLog, long version, scala.collection.immutable.Map<java.lang.String, java.lang.Object> operationMetrics)  { throw new RuntimeException(); }
}
