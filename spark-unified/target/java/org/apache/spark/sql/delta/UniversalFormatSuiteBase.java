package org.apache.spark.sql.delta;
public  interface UniversalFormatSuiteBase extends org.apache.spark.sql.delta.IcebergCompatUtilsBase, org.apache.spark.sql.delta.UniversalFormatTestHelper {
  public  void assertAddFileIcebergCompatVersion (org.apache.spark.sql.delta.Snapshot snapshot, int icebergCompatVersion, int count)  ;
  public  void assertUniFormIcebergProtocolAndProperties (java.lang.String tableId, int compatVersion)  ;
  public  void checkFileNotRewritten (org.apache.spark.sql.delta.Snapshot prevSnapshot, org.apache.spark.sql.delta.Snapshot currSnapshot)  ;
  public  org.apache.spark.sql.DataFrameWriter<org.apache.spark.sql.Row> getDfWriter (java.lang.String colName, java.lang.String mode, boolean enableUniform)  ;
  public  void runReorgTableForUpgradeUniform (java.lang.String tableId, int icebergCompatVersion)  ;
}
