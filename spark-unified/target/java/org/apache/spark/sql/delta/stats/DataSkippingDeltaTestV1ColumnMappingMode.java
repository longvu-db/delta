package org.apache.spark.sql.delta.stats;
public  interface DataSkippingDeltaTestV1ColumnMappingMode extends org.apache.spark.sql.delta.stats.DataSkippingDeltaIdColumnMappingTests {
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getStatsDf (org.apache.spark.sql.delta.DeltaLog deltaLog, scala.collection.immutable.Seq<org.apache.spark.sql.Column> columns)  ;
}
