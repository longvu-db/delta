package org.apache.spark.sql.delta;
/**
 * Tests for the metrics of MERGE INTO command in Delta log.
 * <p>
 * This test suite checks the values of metrics that are emitted in Delta log by MERGE INTO command,
 * with Changed Data Feed (CDF) enabled/disabled.
 * <p>
 * Metrics related with number of affected rows are deterministic and so the expected values are
 * explicitly checked. Metrics related with number of affected files and execution times are not
 * deterministic, and so we check only their presence and some invariants.
 * <p>
 */
public  interface MergeIntoMetricsBase extends org.apache.spark.sql.test.SharedSparkSession {
  public  scala.collection.immutable.Seq<java.lang.String> testsToIgnore ()  ;
  public  void testMergeMetrics (java.lang.String name, scala.Function1<org.apache.spark.sql.delta.MergeIntoMetricsBase.MergeTestConfiguration, scala.runtime.BoxedUnit> testFn)  ;
  /**
   * Check invariants for row metrics of MERGE INTO command.
   * <p>
   * @param metrics The merge operation metrics from the Delta history.
   */
  public  void checkMergeOperationRowMetricsInvariants (scala.collection.immutable.Map<java.lang.String, java.lang.String> metrics)  ;
  /**
   * Check invariants for file metrics of MERGE INTO command.
   * <p>
   * @param metrics The merge operation metrics from the Delta history.
   */
  public  void checkMergeOperationFileMetricsInvariants (scala.collection.immutable.Map<java.lang.String, java.lang.String> metrics)  ;
  /**
   * Helper method to create a target table with the desired options, run a merge command and check
   * the operation metrics in the Delta history.
   * <p>
   * For operation metrics the following checks are performed:
   * a) The operation metrics in Delta history must match {@link DeltaOperationMetrics.MERGE} schema,
   *    i.e. no metrics can be missing or unknown metrics can exist.
   * b) All operation metrics must have a non-negative values.
   * c) The values of metrics that are specified in 'expectedOpMetrics' argument must match the
   * operation metrics. Metrics with a value of -1 are ignored, to allow callers always specify
   * metrics that don't exist under some configurations.
   * d) Row-related operation metrics that are not specified in 'expectedOpMetrics' must be zero.
   * e) File/Time-related operation metrics that are not specified in 'expectedOpMetrics' can have
   * non-zero values. These metrics are not deterministic and so this method only checks that
   * some invariants hold.
   * <p>
   * @param targetDf The DataFrame to generate the target table for the merge command.
   * @param sourceDf The DataFrame to generate the source table for the merge command.
   * @param mergeCmdFn The function that actually runs the merge command.
   * @param expectedOpMetrics A map with values for expected operation metrics.
   * @param testConfig The configuration options for this test
   * @param overrideExpectedOpMetrics Sequence of expected operation metric values to override from
   *                                  those provided in expectedOpMetrics for specific
   *                                  configurations of partitioned and cdfEnabled. Elements
   *                                  provided as:
   *                                  ((partitioned, cdfEnabled), (metric_name, metric_value))
   */
  public  void runMergeCmdAndTestMetrics (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> targetDf, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> sourceDf, scala.Function2<io.delta.tables.DeltaTable, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> mergeCmdFn, scala.collection.immutable.Map<java.lang.String, java.lang.Object> expectedOpMetrics, org.apache.spark.sql.delta.MergeIntoMetricsBase.MergeTestConfiguration testConfig, scala.collection.immutable.Seq<scala.Tuple2<scala.Tuple2<java.lang.Object, java.lang.Object>, scala.Tuple2<java.lang.String, java.lang.Object>>> overrideExpectedOpMetrics)  ;
  public  void checkMergeResultMetrics (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> mergeResultDf, scala.collection.immutable.Map<java.lang.String, java.lang.Object> metrics)  ;
}
