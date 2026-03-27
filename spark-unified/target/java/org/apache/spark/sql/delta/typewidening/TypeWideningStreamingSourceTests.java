package org.apache.spark.sql.delta.typewidening;
/**
 * Common tests for type widening when streaming from a Delta source.
 * Can run both with and without schema tracking.
 */
public  interface TypeWideningStreamingSourceTests extends org.apache.spark.sql.streaming.StreamTest, org.apache.spark.sql.test.SQLTestUtils, org.apache.spark.sql.delta.typewidening.TypeWideningStreamingSourceTestMixin {
  /**
   * Test a streaming query with a type widening operation. Creates a Delta source with two columns
   * <code>widened</code> and <code>other</code> of type <code>byte</code> and widens the <code>widened</code> column to <code>int</code>. The query under
   * test is used to read from the table and checked against the expected result.
   * @param name           Test name.
   * @param query          Streaming query to apply on the source.
   * @param expectedResult In case of success, checks the last batch of data written by the stream
   *                       matches the expected result. In case of failure, the caller provides a
   *                       check to perform on the exception.
   * @param outputMode     Output mode of the streaming query. <code>Append</code> by default but can be
   *                       overriden to e.g. <code>Complete</code> for aggregations.
   * @param partitionBy (undocumented)
   */
  public  void testStreamTypeWidening (java.lang.String name, scala.Function1<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> query, scala.Option<java.lang.String> partitionBy, org.apache.spark.sql.delta.DeltaTestUtilsBase.ExpectedResult<scala.collection.immutable.Seq<org.apache.spark.sql.Row>> expectedResult, org.apache.spark.sql.streaming.OutputMode outputMode)  ;
}
