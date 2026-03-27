package org.apache.spark.sql.delta.test.shims;
/**
 * Test shim for variant shredding to handle differences between Spark versions.
 * In Spark 4.1, VARIANT_INFER_SHREDDING_SCHEMA exists.
 */
public  class VariantShreddingTestShims {
  /**
   * Returns true if VARIANT_INFER_SHREDDING_SCHEMA config is supported in this Spark version.
   * In Spark 4.1, this returns true.
   * @return (undocumented)
   */
  static public  boolean variantInferShreddingSchemaSupported ()  { throw new RuntimeException(); }
  /**
   * Returns the config key for VARIANT_INFER_SHREDDING_SCHEMA.
   * In Spark 4.1, this returns the actual SQLConf key.
   * @return (undocumented)
   */
  static public  java.lang.String variantInferShreddingSchemaKey ()  { throw new RuntimeException(); }
}
