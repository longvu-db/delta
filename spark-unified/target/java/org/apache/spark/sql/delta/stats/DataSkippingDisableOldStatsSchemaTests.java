package org.apache.spark.sql.delta.stats;
/**
 * Used to disable the tests with the old stats collection behavior on long-running suites to
 * avoid time-out
 * TODO(lin): remove this after we remove the DELTA_COLLECT_STATS_USING_TABLE_SCHEMA flag
 */
public  interface DataSkippingDisableOldStatsSchemaTests extends org.apache.spark.sql.delta.stats.DataSkippingDeltaTests {
  public  void test (java.lang.String testName, scala.collection.immutable.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  ;
}
