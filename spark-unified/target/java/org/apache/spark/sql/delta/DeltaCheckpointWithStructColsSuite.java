package org.apache.spark.sql.delta;
public  class DeltaCheckpointWithStructColsSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.DeltaColumnMappingTestUtils, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public   DeltaCheckpointWithStructColsSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  /**
   * Check the existence of the stats field and also not existence of the <code>unexpected</code> fields. The
   * <code>addColumns</code> is a Set of column names that contain the entire tree of columns in the <code>add</code>
   * field of the schema.
   * @param addColumns (undocumented)
   * @param statsAsJsonExists (undocumented)
   * @param unexpected (undocumented)
   */
  protected  void checkFields (scala.collection.immutable.Set<java.lang.String> addColumns, boolean statsAsJsonExists, scala.collection.immutable.Seq<java.lang.String> unexpected)  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Seq<scala.Function1<org.apache.spark.sql.delta.DeltaLog, java.lang.Object>> checkpointFnsWithStructAndJsonStats ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Seq<scala.Function1<org.apache.spark.sql.delta.DeltaLog, java.lang.Object>> checkpointFnsWithStructWithoutJsonStats ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Seq<scala.Function1<org.apache.spark.sql.delta.DeltaLog, java.lang.Object>> checkpointFnsWithoutStructWithJsonStats ()  { throw new RuntimeException(); }
  /**
   * Creates a table from the given DataFrame and partitioning. Then for each checkpointing
   * function, it runs the given validation function.
   * @param df (undocumented)
   * @param partitionBy (undocumented)
   * @param checkpointingFns (undocumented)
   * @param expectedCols (undocumented)
   * @param additionalValidationFn (undocumented)
   */
  protected  void checkpointSchemaForTable (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.immutable.Seq<java.lang.String> partitionBy, scala.collection.immutable.Seq<scala.Function1<org.apache.spark.sql.delta.DeltaLog, java.lang.Object>> checkpointingFns, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, org.apache.spark.sql.types.DataType>> expectedCols, scala.Function1<scala.collection.immutable.Set<java.lang.String>, scala.runtime.BoxedUnit> additionalValidationFn)  { throw new RuntimeException(); }
  /**
   * Creates a checkpoint by based on <code>writeStatsAsJson</code>/<code>writeStatsAsStruct</code> properties.
   * @param writeStatsAsJson (undocumented)
   * @param writeStatsAsStruct (undocumented)
   * @param deltaLog (undocumented)
   * @return (undocumented)
   */
  protected  long checkpointWithProperty (scala.Option<java.lang.Object> writeStatsAsJson, boolean writeStatsAsStruct, org.apache.spark.sql.delta.DeltaLog deltaLog)  { throw new RuntimeException(); }
  /** A checkpoint that doesn't have any stats columns, i.e. `stats` and `stats_parsed`. */
  protected  long checkpointWithoutStats (org.apache.spark.sql.delta.DeltaLog deltaLog)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> intervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
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
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
