package org.apache.spark.sql.delta;
public  interface DeltaSourceDeletionVectorTests extends org.apache.spark.sql.streaming.StreamTest, org.apache.spark.sql.delta.DeletionVectorsTestUtils {
  public  class SourceChangeVariant implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String label ()  { throw new RuntimeException(); }
    public  scala.Function1<java.io.File, java.lang.String> query ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<java.lang.Object> answerWithIgnoreChanges ()  { throw new RuntimeException(); }
    // not preceding
    public   SourceChangeVariant (java.lang.String label, scala.Function1<java.io.File, java.lang.String> query, scala.collection.immutable.Seq<java.lang.Object> answerWithIgnoreChanges)  { throw new RuntimeException(); }
  }
  public  class SourceChangeVariant$ extends scala.runtime.AbstractFunction3<java.lang.String, scala.Function1<java.io.File, java.lang.String>, scala.collection.immutable.Seq<java.lang.Object>, org.apache.spark.sql.delta.DeltaSourceDeletionVectorTests.SourceChangeVariant> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SourceChangeVariant$ MODULE$ = null;
    public   SourceChangeVariant$ ()  { throw new RuntimeException(); }
  }
  /**
   * If deletion vectors are expected here, return true if they are present. If none are expected,
   * return true if none are present.
   * @param inputDir (undocumented)
   * @param expectDVs (undocumented)
   * @return (undocumented)
   */
  public  boolean deletionVectorsPresentIfExpected (java.lang.String inputDir, boolean expectDVs)  ;
  public <T extends java.lang.Object> T eventually (java.lang.String message, scala.Function0<T> func)  ;
  /**
   * Executes a DML SQL statement (DELETE, INSERT, etc.).
   * Overridable so that V2 suites can route DML through the V1 connector,
   * since SparkTable (V2) is read-only and does not support writes.
   * @param sqlText (undocumented)
   */
  public  void executeDml (java.lang.String sqlText)  ;
  public  void ignoreOperationsTest (java.lang.String inputDir, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> sourceOptions, java.lang.String sqlCommand, scala.Option<java.lang.Object> commandShouldProduceDVs, scala.collection.immutable.Seq<org.apache.spark.sql.streaming.StreamTest.StreamAction> expectations)  ;
  public  void ignoreOperationsTestWithManualClock (java.lang.String inputDir, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> sourceOptions, java.lang.String sqlCommand1, java.lang.String sqlCommand2, scala.Option<java.lang.Object> command1ShouldProduceDVs, scala.Option<java.lang.Object> command2ShouldProduceDVs, scala.collection.immutable.List<org.apache.spark.sql.streaming.StreamTest.StreamAction> expectations)  ;
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.DeltaSourceDeletionVectorTests.SourceChangeVariant> sourceChangeVariants ()  ;
}
