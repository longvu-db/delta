package org.apache.spark.sql.delta;
public  interface ScalaDDLTestUtils extends org.apache.spark.sql.delta.DDLTestUtils {
  public  void runDDL (scala.Enumeration.Value ddlType, java.lang.String tableName, scala.collection.immutable.Seq<org.apache.spark.sql.delta.ColumnSpec> columnSpecs, scala.collection.immutable.Seq<java.lang.String> partitionedBy, scala.collection.immutable.Map<java.lang.String, java.lang.String> tblProperties)  ;
}
