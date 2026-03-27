package org.apache.spark.sql.delta;
/**
 * Unit tests for ProtocolMetadataAdapterV1.
 * <p>
 * This suite tests the V1 wrapper implementation that adapts delta-spark's Protocol and Metadata
 * to the ProtocolMetadataAdapter interface.
 */
public  class ProtocolMetadataAdapterV1Suite extends org.apache.spark.sql.delta.ProtocolMetadataAdapterSuiteBase {
  public   ProtocolMetadataAdapterV1Suite ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.delta.ProtocolMetadataAdapter createWrapper (int minReaderVersion, int minWriterVersion, scala.Option<scala.collection.immutable.Set<java.lang.String>> readerFeatures, scala.Option<scala.collection.immutable.Set<java.lang.String>> writerFeatures, org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> configuration)  { throw new RuntimeException(); }
}
