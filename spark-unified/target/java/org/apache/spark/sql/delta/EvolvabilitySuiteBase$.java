package org.apache.spark.sql.delta;
/***
 * A tool to generate data and transaction log for evolvability tests.
 * <p>
 * Here are the steps to generate data.
 * <p>
 * 1. Update <code>EvolvabilitySuite.generateData</code> if there are new {@link Action} types.
 * 2. Change the following command with the right path and run it. Note: the working directory is "[delta_project_root]".
 * <p>
 * scalastyle:off
 * <code></code><code>
 * build/sbt "core/test:runMain org.apache.spark.sql.delta.EvolvabilitySuite src/test/resources/delta/delta-0.1.0 generateData"
 * </code><code></code>
 * <p>
 * You can also use this tool to generate DeltaLog that contains a checkpoint a json log with a new column.
 * <p>
 * scalastyle:off
 * <code></code><code>
 * build/sbt "core/test:runMain org.apache.spark.sql.delta.EvolvabilitySuite /path/src/test/resources/delta/transaction_log_schema_evolvability generateTransactionLogWithExtraColumn"
 * </code><code></code>
 */
public  class EvolvabilitySuiteBase$ implements java.io.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EvolvabilitySuiteBase$ MODULE$ = null;
  public   EvolvabilitySuiteBase$ ()  { throw new RuntimeException(); }
  public  void generateData (org.apache.spark.sql.SparkSession spark, java.lang.String path, scala.collection.immutable.Map<org.apache.spark.sql.delta.DeltaConfig<?>, java.lang.String> tblProps)  { throw new RuntimeException(); }
  /** Validate the generated data contains all {@link Action} types */
  public  void validateData (org.apache.spark.sql.SparkSession spark, java.lang.String path)  { throw new RuntimeException(); }
  /** Generate the transaction log with extra column in checkpoint and json. */
  public  void generateTransactionLogWithExtraColumn (org.apache.spark.sql.SparkSession spark, java.lang.String path)  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
