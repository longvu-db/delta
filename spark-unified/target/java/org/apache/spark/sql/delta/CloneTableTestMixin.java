package org.apache.spark.sql.delta;
/** Common test setup and utils for CLONE TABLE tests. */
public  interface CloneTableTestMixin extends org.apache.spark.sql.delta.DeltaColumnMappingTestUtils, org.scalatest.BeforeAndAfterAll, org.apache.spark.sql.delta.DeltaTestUtilsBase {
  public  org.scalatest.Tag TAG_CHANGE_COLUMN_MAPPING_MODE ()  ;
  public  org.scalatest.Tag TAG_HAS_SHALLOW_CLONE ()  ;
  public  org.scalatest.Tag TAG_MODIFY_PROTOCOL ()  ;
  public  org.scalatest.Tag TAG_USES_CONVERT_TO_DELTA ()  ;
  public  void cloneTable (java.lang.String source, java.lang.String target, boolean isShallow, boolean sourceIsTable, boolean targetIsTable, scala.Option<java.lang.String> targetLocation, scala.Option<java.lang.Object> versionAsOf, scala.Option<java.lang.String> timestampAsOf, boolean isCreate, boolean isReplace, scala.collection.immutable.Map<java.lang.String, java.lang.String> tableProperties)  ;
  public  void cloneTest (java.lang.String testName, scala.collection.immutable.Seq<org.scalatest.Tag> testTags, scala.Function2<java.lang.String, java.lang.String, scala.runtime.BoxedUnit> f)  ;
  public  java.lang.String cloneTypeStr (boolean isShallow)  ;
  public  void compareMetadata (org.apache.spark.sql.delta.commands.CloneSource cloneSource, org.apache.spark.sql.delta.Snapshot targetLog, boolean targetIsTable, boolean isReplace)  ;
  /**
   * Filter out row tracking properties from the configuration map.
   * These properties are not expected to be the same in source and target metadata.
   * <p>
   * @param conf The configuration map to filter.
   * @return Filtered configuration map without row tracking properties.
   * @param name (undocumented)
   * @param format (undocumented)
   * @param isTable (undocumented)
   */
  public  org.apache.spark.sql.catalyst.TableIdentifier resolveTableIdentifier (java.lang.String name, scala.Option<java.lang.String> format, boolean isTable)  ;
  public  void runAndValidateClone (java.lang.String source, java.lang.String target, boolean isShallow, boolean sourceIsTable, boolean targetIsTable, scala.Option<java.lang.String> targetLocation, scala.Option<java.lang.Object> sourceVersion, scala.Option<java.lang.String> sourceTimestamp, boolean isCreate, boolean isReplaceOperation, boolean isReplaceDelta, scala.collection.immutable.Map<java.lang.String, java.lang.String> tableProperties, scala.collection.immutable.Map<java.lang.String, java.lang.String> commitLargeMetricsMap, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedDataframe, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Run the given test function for SHALLOW clone.
   * @param testName (undocumented)
   * @param testTags (undocumented)
   * @param testFunc (undocumented)
   */
  public  void testAllClones (java.lang.String testName, scala.collection.immutable.Seq<org.scalatest.Tag> testTags, scala.Function3<java.lang.String, java.lang.String, java.lang.Object, scala.runtime.BoxedUnit> testFunc)  ;
  public  java.lang.String uniqueFileActionGroupBy (org.apache.spark.sql.delta.actions.FileAction action)  ;
  public  void verifyAllCloneOperationsEmitted (scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> allLogs, boolean emitHandleExistingTable, scala.collection.immutable.Map<java.lang.String, java.lang.String> commitLargeMetricsMap)  ;
  public  void withSourceTargetDir (scala.Function2<java.lang.String, java.lang.String, scala.runtime.BoxedUnit> f)  ;
}
