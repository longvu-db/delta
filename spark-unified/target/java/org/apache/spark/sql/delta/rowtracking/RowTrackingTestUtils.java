package org.apache.spark.sql.delta.rowtracking;
public  interface RowTrackingTestUtils extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.execution.datasources.parquet.ParquetTest {
  public  java.lang.String defaultRowTrackingFeatureProperty ()  ;
  public  java.lang.String rowTrackingFeatureName ()  ;
  public  void withRowTrackingEnabled (boolean enabled, scala.Function0<scala.runtime.BoxedUnit> f)  ;
}
