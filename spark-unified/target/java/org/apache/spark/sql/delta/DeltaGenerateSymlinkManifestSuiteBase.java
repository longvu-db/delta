package org.apache.spark.sql.delta;
public  interface DeltaGenerateSymlinkManifestSuiteBase extends org.apache.spark.sql.delta.DeltaGenerateSymlinkManifestTestHelper, org.apache.spark.sql.delta.DeletionVectorsTestUtils, org.apache.spark.sql.delta.DeltaTestUtilsForTempViews {
  public  void checkErrorHelper (org.apache.spark.SparkThrowable exception, java.lang.String errorClass)  ;
  public  void setEnabledIncrementalManifest (java.lang.String tablePath, boolean enabled)  ;
}
