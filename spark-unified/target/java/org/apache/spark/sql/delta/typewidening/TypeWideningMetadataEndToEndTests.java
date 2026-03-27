package org.apache.spark.sql.delta.typewidening;
/**
 * Tests that covers recording type change information as metadata in the table schema. For
 * lower-level tests, see {@link TypeWideningMetadataTests}.
 */
public  interface TypeWideningMetadataEndToEndTests {
  public  void testTypeWideningMetadata (java.lang.String name, java.lang.String initialSchema, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> typeChanges, java.lang.String expectedJsonSchema)  ;
}
