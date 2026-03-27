package org.apache.spark.sql.delta;
/**
 * For ByPath tests, we select a test case per ALTER TABLE command to simply test identifier
 * resolution.
 */
public  interface DeltaAlterTableByPathTests extends org.apache.spark.sql.delta.DeltaAlterTableTestBase {
  public  java.lang.String createTable (java.lang.String schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> tblProperties)  ;
  public  java.lang.String createTable (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.immutable.Seq<java.lang.String> partitionedBy)  ;
  public  void ddlTest (java.lang.String testName, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void dropTable (java.lang.String identifier)  ;
  public  scala.Tuple2<org.apache.spark.sql.delta.DeltaLog, org.apache.spark.sql.delta.Snapshot> getDeltaLogWithSnapshot (java.lang.String identifier)  ;
}
