package org.apache.spark.sql.delta;
public  class DeltaCDCSQLSuite extends org.apache.spark.sql.delta.DeltaCDCSuiteBase implements org.apache.spark.sql.delta.DeltaColumnMappingTestUtils {
  public   DeltaCDCSQLSuite ()  { throw new RuntimeException(); }
  /** Single method to do all kinds of CDC reads */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> cdcRead (org.apache.spark.sql.delta.DeltaCDCSuiteBase.TblId tblId, org.apache.spark.sql.delta.DeltaCDCSuiteBase.Boundary start, org.apache.spark.sql.delta.DeltaCDCSuiteBase.Boundary end, scala.Option<org.apache.spark.sql.delta.DeltaBatchCDFSchemaMode> schemaMode, scala.collection.immutable.Map<java.lang.String, java.lang.String> readerOptions)  { throw new RuntimeException(); }
  public  void ctas (java.lang.String srcTbl, java.lang.String dstTbl, boolean disableCDC)  { throw new RuntimeException(); }
}
