package org.apache.spark.sql.delta;
public  class DeltaLogMinorCompactionSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.coordinatedcommits.CatalogOwnedTestBaseSuite {
  public  class CompactedDelta implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  scala.Tuple2<java.lang.Object, java.lang.Object> versionWindow ()  { throw new RuntimeException(); }
    public  int numAdds ()  { throw new RuntimeException(); }
    public  int numRemoves ()  { throw new RuntimeException(); }
    public  int numMetadata ()  { throw new RuntimeException(); }
    // not preceding
    public   CompactedDelta (scala.Tuple2<java.lang.Object, java.lang.Object> versionWindow, int numAdds, int numRemoves, int numMetadata)  { throw new RuntimeException(); }
  }
  public  class CompactedDelta$ extends scala.runtime.AbstractFunction4<scala.Tuple2<java.lang.Object, java.lang.Object>, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.sql.delta.DeltaLogMinorCompactionSuite.CompactedDelta> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CompactedDelta$ MODULE$ = null;
    public   CompactedDelta$ ()  { throw new RuntimeException(); }
  }
  public   DeltaLogMinorCompactionSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.DeltaTestUtilsBase.ExpectedResult$ ExpectedResult ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.actions.AddFile createTestAddFile (java.lang.String path, scala.collection.immutable.Map<java.lang.String, java.lang.String> partitionValues, long size, long modificationTime, boolean dataChange, java.lang.String stats)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  public  java.lang.String defaultCatalogOwnedFeatureEnabledKey ()  { throw new RuntimeException(); }
  protected  java.lang.String defaultTempDirPrefix ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  public  void generateData (java.lang.String tableDir, scala.collection.immutable.Set<java.lang.Object> checkpoints)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> intervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.Map<java.lang.String, java.lang.Object> locRefCount ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> lowerCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> lowerCaseDataWithDuplicates ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.MapData> mapData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> negativeData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> nullInts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> nullStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> nullableRepeatedData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> person ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> repeatedData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  /**
   * This test creates a Delta table with 11 commits (0, 1, ..., 10) and also creates compacted
   * deltas based on the provided <code>compactionRange</code> tuples.
   * <p>
   * At the end, we create a Snapshot and see if the Snapshot is initialized properly using the
   * right compacted delta files instead of regular delta files. We also compare the
   * <code>computeState</code>, <code>stateDF</code>, <code>allFiles</code> of this compacted delta backed Snapshot against a
   * regular Snapshot backed by single delta files.
   * @param compactionWindows (undocumented)
   * @param checkpoints (undocumented)
   * @param postDataGenerationFunc (undocumented)
   * @param postSetupFunc (undocumented)
   * @param expectedCompactedDeltas (undocumented)
   * @param expectedDeltas (undocumented)
   * @param expectedCheckpoint (undocumented)
   * @param expectError (undocumented)
   * @param additionalConfs (undocumented)
   */
  public  void testSnapshotCreation (scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> compactionWindows, scala.collection.immutable.Set<java.lang.Object> checkpoints, scala.Option<scala.Function1<org.apache.spark.sql.delta.DeltaLog, scala.runtime.BoxedUnit>> postDataGenerationFunc, scala.Option<scala.Function1<org.apache.spark.sql.delta.DeltaLog, scala.runtime.BoxedUnit>> postSetupFunc, scala.collection.immutable.Seq<org.apache.spark.sql.delta.DeltaLogMinorCompactionSuite.CompactedDelta> expectedCompactedDeltas, scala.collection.immutable.Seq<java.lang.Object> expectedDeltas, long expectedCheckpoint, boolean expectError, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> additionalConfs)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  void validateCommit (org.apache.spark.sql.delta.DeltaLog log, long version, int numAdds, int numRemoves, int numMetadata)  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
