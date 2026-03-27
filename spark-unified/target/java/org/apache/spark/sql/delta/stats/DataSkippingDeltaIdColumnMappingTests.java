package org.apache.spark.sql.delta.stats;
/** DataSkipping tests under id column mapping */
public  interface DataSkippingDeltaIdColumnMappingTests extends org.apache.spark.sql.delta.stats.DataSkippingDeltaTests, org.apache.spark.sql.delta.DeltaColumnMappingTestUtils {
  public  java.lang.String expectedStatsForFile (int index, java.lang.String colName, org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
}
