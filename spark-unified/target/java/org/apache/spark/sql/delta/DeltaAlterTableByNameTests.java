package org.apache.spark.sql.delta;
public  interface DeltaAlterTableByNameTests extends org.apache.spark.sql.delta.DeltaAlterTableTests {
  public  java.lang.String createTable (java.lang.String schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> tblProperties)  ;
  public  java.lang.String createTable (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.immutable.Seq<java.lang.String> partitionedBy)  ;
  public  void dropTable (java.lang.String identifier)  ;
  public  scala.Tuple2<org.apache.spark.sql.delta.DeltaLog, org.apache.spark.sql.delta.Snapshot> getDeltaLogWithSnapshot (java.lang.String identifier)  ;
}
