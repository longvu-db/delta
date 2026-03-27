package org.apache.spark.sql.delta;
public  interface MergeIntoMaterializeSourceMixin extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.DeltaTestUtilsBase {
  public  void beforeAll ()  ;
  public  scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> testMergeMaterializedSourceUnpersist (java.lang.String tblName, int numKills)  ;
}
