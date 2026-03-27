package org.apache.spark.sql.delta;
/**
 * Defines helper class &amp; methods to test writing to a Delta streaming sink using data types that
 * don't match the corresponding column type in the table schema.
 */
public abstract class DeltaSinkImplicitCastSuiteBase extends org.apache.spark.sql.delta.DeltaSinkTest {
  /**
   * Helper to write to and read from a Delta sink. Creates and runs a streaming query for each call
   * to <code>write</code>.
   */
  public  class TestDeltaStream<T extends java.lang.Object> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   TestDeltaStream (java.io.File outputDir, java.io.File checkpointDir, org.apache.spark.sql.Encoder<T> evidence$1)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType currentSchema ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.DeltaLog deltaLog ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> read ()  { throw new RuntimeException(); }
    public  void write (scala.collection.immutable.Seq<T> data, scala.collection.immutable.Seq<java.lang.String> selectExpr)  { throw new RuntimeException(); }
    public  void write (org.apache.spark.sql.streaming.OutputMode outputMode, scala.concurrent.duration.Duration timeout, scala.collection.immutable.Map<java.lang.String, java.lang.String> extraOptions, scala.collection.immutable.Seq<T> data, scala.collection.immutable.Seq<java.lang.String> selectExpr)  { throw new RuntimeException(); }
  }
  public   DeltaSinkImplicitCastSuiteBase ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  /**
   * Validates that the table history for the test Delta sink matches the given list of operations.
   * @param stream (undocumented)
   * @param expectedOperations (undocumented)
   */
  public <T extends java.lang.Object> void checkOperationHistory (org.apache.spark.sql.delta.DeltaSinkImplicitCastSuiteBase.TestDeltaStream<T> stream, scala.collection.immutable.Seq<java.lang.String> expectedOperations)  { throw new RuntimeException(); }
  /** Sets up a new {@link TestDeltaStream} to write to and read from a test Delta sink. */
  public <T extends java.lang.Object> void withDeltaStream (scala.Function1<org.apache.spark.sql.delta.DeltaSinkImplicitCastSuiteBase.TestDeltaStream<T>, scala.runtime.BoxedUnit> f, org.apache.spark.sql.Encoder<T> evidence$2)  { throw new RuntimeException(); }
}
