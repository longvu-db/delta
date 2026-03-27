package org.apache.spark.sql.delta.typewidening;
public  interface TypeWideningTableFeatureVersionTests extends org.apache.spark.sql.delta.typewidening.TypeWideningTestCases {
  /**
   * Directly add the preview/stable type widening table feature without using the type widening
   * table property.
   * @param tablePath (undocumented)
   * @param feature (undocumented)
   */
  public  void addTableFeature (java.lang.String tablePath, org.apache.spark.sql.delta.TypeWideningTableFeatureBase feature)  ;
  /** Validate whether the preview stable type widening table feature are supported or not. */
  public  void assertFeatureSupported (boolean preview, boolean stable)  ;
}
