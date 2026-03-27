package org.apache.spark.sql.delta;
/**
 * Common functions used across CONVERT TO DELTA test suites. We separate out these functions
 * so that we can re-use them in tests using Hive support. Tests that leverage Hive support cannot
 * extend the <code>SharedSparkSession</code>, therefore we keep this utility class as bare-bones as possible.
 */
public  interface ConvertToDeltaTestUtils extends org.apache.spark.sql.delta.test.DeltaExceptionTestUtils {
  public  java.lang.String blockNonDeltaMsg ()  ;
  public  java.lang.String collectStatisticsStringOption (boolean collectStats)  ;
  public  void convertToDelta (java.lang.String identifier, scala.Option<java.lang.String> partitionSchema, boolean collectStats)  ;
  public  boolean deltaRead (scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> df)  ;
  public  java.lang.String invalidParquetMsg ()  ;
  public  java.lang.String parquetOnlyMsg ()  ;
  public  org.apache.hadoop.conf.Configuration sessionHadoopConf ()  ;
  public  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> simpleDF ()  ;
  public  void writeFiles (java.lang.String dir, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String format, scala.collection.immutable.Seq<java.lang.String> partCols, java.lang.String mode)  ;
}
