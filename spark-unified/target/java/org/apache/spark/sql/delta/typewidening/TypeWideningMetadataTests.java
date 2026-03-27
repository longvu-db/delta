package org.apache.spark.sql.delta.typewidening;
/**
 * Tests covering the {@link TypeWideningMetadata} and {@link TypeChange} classes used to handle the
 * metadata recorded by the Type Widening table feature in the table schema.
 */
public  interface TypeWideningMetadataTests extends org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
  /**
   * Short-hand to build the metadata for a type change to cut down on repetition.
   * @param fromType (undocumented)
   * @param toType (undocumented)
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.Metadata typeChangeMetadata (java.lang.String fromType, java.lang.String toType, java.lang.String path)  ;
}
