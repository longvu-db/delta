package org.apache.spark.sql.delta.typewidening;
/**
 * Test mixin that enables type widening by default for all tests in the suite.
 */
public  interface TypeWideningTestMixin extends org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.DeltaDMLTestUtilsPathBased {
  public <T extends java.lang.Object> void addSingleFile (scala.collection.immutable.Seq<T> values, org.apache.spark.sql.types.DataType dataType, org.apache.spark.sql.Encoder<T> evidence$1)  ;
  /**
   * Similar to <code>QueryTest.checkAnswer</code> but using fuzzy equality for double values. This is needed
   * because double partition values are serialized as string leading to loss of precision. Also
   * <code>checkAnswer</code> treats -0f and 0f as different values without tolerance.
   * @param actualDf (undocumented)
   * @param expectedDf (undocumented)
   * @param toType (undocumented)
   * @param tolerance (undocumented)
   */
  public  void checkAnswerWithTolerance (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> actualDf, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedDf, org.apache.spark.sql.types.DataType toType, double tolerance)  ;
  /** Enable (or disable) type widening for the table under the given path. */
  public  void enableTypeWidening (java.lang.String tablePath, boolean enabled)  ;
  /** Whether the type widening table property is enabled on the test table. */
  public  boolean isTypeWideningEnabled ()  ;
  /** Whether the test table supports the type widening table feature. */
  public  boolean isTypeWideningSupported ()  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  /** Short-hand to create type widening metadata for struct fields. */
  public  org.apache.spark.sql.types.Metadata typeWideningMetadata (org.apache.spark.sql.types.AtomicType from, org.apache.spark.sql.types.AtomicType to, scala.collection.immutable.Seq<java.lang.String> path)  ;
}
