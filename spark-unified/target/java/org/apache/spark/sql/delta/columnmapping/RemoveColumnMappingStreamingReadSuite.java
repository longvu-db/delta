package org.apache.spark.sql.delta.columnmapping;
/**
 * Test suite for removing column mapping(CM) from a streaming table. Test different
 * scenarios with respect to table schema at different points of time. There are a few events we
 * are interested in:
 * Upgrade: enable column mapping
 * Downgrade: disable column mapping
 * Rename, Drop: rename, drop a column
 * <p>
 * And we can decide when we start the streaming read with StartStreamRead.
 * <p>
 * We test all the possible combinations of these events.
 * <p>
 * Additionally, we test each scenario with schema tracking enabled which in general results in
 * a failure as schema tracking prohibits reading across an Upgrade.
 */
public  class RemoveColumnMappingStreamingReadSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.delta.columnmapping.RemoveColumnMappingSuiteUtils, org.apache.spark.sql.streaming.StreamTest, org.apache.spark.sql.delta.ColumnMappingStreamingTestUtils {
  public  interface CheckAnswerStreamActionLike extends org.apache.spark.sql.delta.columnmapping.RemoveColumnMappingStreamingReadSuite.StreamActionLike {
    public  scala.collection.immutable.Seq<org.apache.spark.sql.streaming.StreamTest.StreamAction> toStreamActions ()  ;
  }
  public  interface StreamActionLike {
    public  scala.collection.immutable.Seq<org.apache.spark.sql.streaming.StreamTest.StreamAction> toStreamActions ()  ;
  }
  public  org.apache.spark.sql.streaming.StreamTest.AddData$ AddData ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AddDataMemory$ AddDataMemory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AdvanceManualClock$ AdvanceManualClock ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.Assert$ Assert ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery$ AssertOnQuery ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AwaitEpoch$ AwaitEpoch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$ AwaitTerminationTester ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswer$ CheckAnswer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows$ CheckAnswerRows ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsByFunc$ CheckAnswerRowsByFunc ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsContains$ CheckAnswerRowsContains ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckLastBatch$ CheckLastBatch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckNewAnswer$ CheckNewAnswer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckNewAnswerRows$ CheckNewAnswerRows ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.Execute$ Execute ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery ExistingRetryableInStreamSchemaChangeFailure ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.ExpectFailure$ ExpectFailure ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.StreamTest.ExpectFailure<org.apache.spark.sql.delta.DeltaStreamingNonAdditiveSchemaIncompatibleException> ExpectGenericSchemaIncompatibleFailure ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.StreamTest.ExpectFailure<org.apache.spark.sql.delta.DeltaStreamingNonAdditiveSchemaIncompatibleException> ExpectInStreamSchemaChangeFailure ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.StreamTest.ExpectFailure<org.apache.spark.sql.delta.DeltaRuntimeException> ExpectMetadataEvolutionException ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.StreamTest.ExpectFailure<org.apache.spark.sql.delta.DeltaStreamingNonAdditiveSchemaIncompatibleException> ExpectStreamStartInCompatibleSchemaFailure ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.IncrementEpoch$ IncrementEpoch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.MultiAddData$ MultiAddData ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.ProcessAllAvailable$ ProcessAllAvailable ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery ProcessAllAvailableIgnoreError ()  { throw new RuntimeException(); }
  public   RemoveColumnMappingStreamingReadSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.StartStream$ StartStream ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.StopStream$ StopStream ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.StreamProgressLockedActions$ StreamProgressLockedActions ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.Signaler defaultSignaler ()  { throw new RuntimeException(); }
  protected  java.lang.String defaultTempDirPrefix ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.streaming.Trigger defaultTrigger ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  protected  java.lang.String firstColumn ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> intervalData ()  { throw new RuntimeException(); }
  protected  boolean isCdcTest ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  protected  java.lang.String logicalColumnName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> lowerCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> lowerCaseDataWithDuplicates ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.MapData> mapData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> negativeData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> nullInts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> nullStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> nullableRepeatedData ()  { throw new RuntimeException(); }
  protected  int numFiles ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> person ()  { throw new RuntimeException(); }
  protected  java.lang.String renamedThirdColumn ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> repeatedData ()  { throw new RuntimeException(); }
  protected  int rowsPerFile ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
  protected  java.lang.String secondColumn ()  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  public  org.scalatest.time.Span streamingTimeout ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  protected  java.lang.String testTableName ()  { throw new RuntimeException(); }
  protected  java.lang.String thirdColumn ()  { throw new RuntimeException(); }
  protected  int totalRows ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
