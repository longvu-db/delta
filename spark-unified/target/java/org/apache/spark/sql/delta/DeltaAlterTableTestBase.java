package org.apache.spark.sql.delta;
public  interface DeltaAlterTableTestBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.DeltaColumnMappingTestUtils, org.apache.spark.sql.delta.DeltaTestUtilsForTempViews {
  public  void assertNotSupported (java.lang.String command, scala.collection.immutable.Seq<java.lang.String> messages)  ;
  public  java.lang.String createTable (java.lang.String schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> tblProperties)  ;
  public  java.lang.String createTable (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.immutable.Seq<java.lang.String> partitionedBy)  ;
  public  void ddlTest (java.lang.String testName, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void dropTable (java.lang.String identifier)  ;
  public  scala.Tuple2<org.apache.spark.sql.delta.DeltaLog, org.apache.spark.sql.delta.Snapshot> getDeltaLogWithSnapshot (java.lang.String identifier)  ;
  public  void withDeltaTable (java.lang.String schema, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f)  ;
  public  void withDeltaTable (java.lang.String schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> tblProperties, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f)  ;
  public  void withDeltaTable (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f)  ;
  public  void withDeltaTable (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.immutable.Seq<java.lang.String> partitionedBy, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f)  ;
}
