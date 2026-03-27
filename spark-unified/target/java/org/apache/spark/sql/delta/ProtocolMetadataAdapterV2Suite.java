package org.apache.spark.sql.delta;
/**
 * Unit tests for ProtocolMetadataAdapterV2.
 * <p>
 * This suite tests the V2 wrapper implementation that adapts kernel's Protocol and Metadata
 * to the ProtocolMetadataAdapter interface.
 */
public  class ProtocolMetadataAdapterV2Suite extends org.apache.spark.sql.delta.ProtocolMetadataAdapterSuiteBase {
  public   ProtocolMetadataAdapterV2Suite ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.delta.ProtocolMetadataAdapter createWrapper (int minReaderVersion, int minWriterVersion, scala.Option<scala.collection.immutable.Set<java.lang.String>> readerFeatures, scala.Option<scala.collection.immutable.Set<java.lang.String>> writerFeatures, org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> configuration)  { throw new RuntimeException(); }
  /**
   * Tests that are not applicable to V2 (kernel-based) implementation.
   * These tests can be ignored because V2 has different behavior or limitations.
   * @return (undocumented)
   */
  protected  scala.collection.immutable.Set<java.lang.String> ignoredTests ()  { throw new RuntimeException(); }
  protected  void test (java.lang.String testName, scala.collection.immutable.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
}
