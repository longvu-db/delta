package org.apache.spark.sql.delta;
public  interface DeltaLimitPushDownTests extends org.apache.spark.sql.test.SharedSparkSession, com.databricks.spark.util.DatabricksLogging, org.apache.spark.sql.delta.test.ScanReportHelper, org.apache.spark.sql.delta.DeletionVectorsTestUtils, org.apache.spark.sql.delta.stats.StatsUtils, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.coordinatedcommits.CatalogOwnedTestBaseSuite {
  public  void withDVSettings (scala.Function0<scala.runtime.BoxedUnit> thunk)  ;
}
