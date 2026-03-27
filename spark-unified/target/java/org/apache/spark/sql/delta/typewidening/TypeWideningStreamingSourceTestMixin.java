package org.apache.spark.sql.delta.typewidening;
public  interface TypeWideningStreamingSourceTestMixin extends org.apache.spark.sql.delta.typewidening.TypeWideningTestMixin, org.scalatest.BeforeAndAfterAll {
  /** Test action checking that the stream fails due to a metadata change - typ. a schema change. */
  public  class ExpectMetadataEvolutionException {
    static public  org.apache.spark.sql.streaming.StreamTest.StreamAction apply ()  { throw new RuntimeException(); }
  }
  /** Test action checking that the stream fails due to a metadata change - typ. a schema change. */
  public  class ExpectMetadataEvolutionException$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExpectMetadataEvolutionException$ MODULE$ = null;
    public   ExpectMetadataEvolutionException$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.StreamAction apply ()  { throw new RuntimeException(); }
  }
  /** Test action checking that the stream fails due to a type change being blocked. */
  public  class ExpectTypeChangeBlockedException {
    static public  org.apache.spark.sql.streaming.StreamTest.StreamAction apply ()  { throw new RuntimeException(); }
  }
  /** Test action checking that the stream fails due to a type change being blocked. */
  public  class ExpectTypeChangeBlockedException$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExpectTypeChangeBlockedException$ MODULE$ = null;
    public   ExpectTypeChangeBlockedException$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.StreamAction apply ()  { throw new RuntimeException(); }
  }
  /** Test action checking that the stream fails due to an unsupported type change. */
  public  class ExpectIncompatibleSchemaChangeException {
    static public  org.apache.spark.sql.streaming.StreamTest.StreamAction apply ()  { throw new RuntimeException(); }
  }
  /** Test action checking that the stream fails due to an unsupported type change. */
  public  class ExpectIncompatibleSchemaChangeException$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExpectIncompatibleSchemaChangeException$ MODULE$ = null;
    public   ExpectIncompatibleSchemaChangeException$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.StreamAction apply ()  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.delta.typewidening.TypeWideningStreamingSourceTestMixin.ExpectIncompatibleSchemaChangeException$ ExpectIncompatibleSchemaChangeException ()  ;
  public  org.apache.spark.sql.delta.typewidening.TypeWideningStreamingSourceTestMixin.ExpectMetadataEvolutionException$ ExpectMetadataEvolutionException ()  ;
  public  org.apache.spark.sql.delta.typewidening.TypeWideningStreamingSourceTestMixin.ExpectTypeChangeBlockedException$ ExpectTypeChangeBlockedException ()  ;
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
  /** Short-hand to read a data stream from the Delta table at the given location. */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> readStream (java.io.File path, java.io.File checkpointDir, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  ;
  /** Whether the suite uses schema tracking to handle widening type changes. */
  public  boolean schemaTrackingEnabled ()  ;
  /** Unblocks the stream after a widening type change. */
  public  void withUnblockedTypeChanges (scala.Function0<scala.runtime.BoxedUnit> fn)  ;
}
