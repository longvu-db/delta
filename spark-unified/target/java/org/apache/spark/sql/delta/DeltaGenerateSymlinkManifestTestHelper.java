package org.apache.spark.sql.delta;
public  interface DeltaGenerateSymlinkManifestTestHelper extends org.apache.spark.sql.test.SharedSparkSession {
  public  void assertManifest (java.io.File tablePath, boolean expectSameFiles, int expectedNumFiles)  ;
  public  void assertManifest (java.lang.String tableName, boolean expectSameFiles, int expectedNumFiles)  ;
  /**
   * Assert that the manifest files in the table meet the expectations.
   * @param deltaSnapshot Snapshot of the Delta table to check against
   * @param tablePath Path of the Delta table
   * @param expectSameFiles Expect that the manifest files contain the same data files
   *                        as the latest version of the table
   * @param expectedNumFiles Expected number of manifest files
   */
  public  void assertManifest (org.apache.spark.sql.delta.Snapshot deltaSnapshot, java.io.File tablePath, boolean expectSameFiles, int expectedNumFiles)  ;
  public  void generateSymlinkManifest (java.lang.String tablePath)  ;
  public  void withIncrementalManifest (java.io.File tablePath, boolean enabled, scala.Function0<scala.runtime.BoxedUnit> func)  ;
}
