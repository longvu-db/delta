package org.apache.spark.sql.delta.columnmapping;
/**
 * A base trait for testing removing column mapping.
 * Takes care of setting basic SQL configs and dropping the {@link testTableName} after each test.
 */
public  interface RemoveColumnMappingSuiteUtils extends org.apache.spark.sql.delta.DeltaColumnMappingSuiteUtils {
  public  void afterEach ()  ;
  public  void beforeAll ()  ;
  public  org.apache.spark.sql.delta.DeltaLog deltaLog ()  ;
  public  void dropColumn ()  ;
  public  void enableColumnMapping ()  ;
  public  java.lang.String firstColumn ()  ;
  /**
   * Get all files in snapshot.
   * @param snapshot (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.delta.actions.AddFile[] getFiles (org.apache.spark.sql.delta.Snapshot snapshot)  ;
  public  java.lang.String logicalColumnName ()  ;
  public  int numFiles ()  ;
  public  void renameColumn ()  ;
  public  java.lang.String renamedThirdColumn ()  ;
  public  int rowsPerFile ()  ;
  public  java.lang.String secondColumn ()  ;
  public  Object testRemovingColumnMapping (boolean unsetTableProperty)  ;
  public  java.lang.String testTableName ()  ;
  public  java.lang.String thirdColumn ()  ;
  public  int totalRows ()  ;
  public  void unsetColumnMappingProperty (boolean useUnset)  ;
  public  org.scalatest.compatible.Assertion verifyColumnMappingOperationIsRecordedInHistory (scala.collection.immutable.Seq<org.apache.spark.sql.delta.DeltaHistory> history)  ;
  public  void verifyColumnMappingSchemaMetadataIsRemoved (org.apache.spark.sql.delta.Snapshot newSnapshot)  ;
  public  org.scalatest.compatible.Assertion verifyColumnMappingTablePropertiesAbsent (org.apache.spark.sql.delta.Snapshot newSnapshot, boolean unsetTablePropertyUsed)  ;
  /**
   * Verify the table still contains the same data after the rewrite, column mapping is removed
   * from table properties and the operation recorded properly.
   * @param unsetTableProperty (undocumented)
   * @param table (undocumented)
   * @param originalFiles (undocumented)
   * @param startingVersion (undocumented)
   * @param originalData (undocumented)
   * @param droppedFeature (undocumented)
   */
  public  void verifyRewrite (boolean unsetTableProperty, org.apache.spark.sql.delta.catalog.DeltaTableV2 table, org.apache.spark.sql.delta.actions.AddFile[] originalFiles, long startingVersion, org.apache.spark.sql.Row[] originalData, boolean droppedFeature)  ;
}
