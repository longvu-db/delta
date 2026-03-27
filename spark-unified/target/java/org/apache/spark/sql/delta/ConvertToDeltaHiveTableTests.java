package org.apache.spark.sql.delta;
/**
 * Tests that involve tables defined in a Catalog such as Hive. We test in the sql as well as
 * hive package, where the hive package uses a proper HiveExternalCatalog to alter table definitions
 * in the HiveMetaStore. This test trait *should not* extend SharedSparkSession so that it can be
 * mixed in with the Hive test utilities.
 */
public  interface ConvertToDeltaHiveTableTests extends org.apache.spark.sql.delta.ConvertToDeltaTestUtils, org.apache.spark.sql.delta.test.DeltaSQLTestUtils {
  public  java.lang.String getPathForTableName (java.lang.String tableName)  ;
  public  void testCatalogFileManifest (java.lang.String testName, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> block)  ;
  public  void testCatalogSchema (java.lang.String testName, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> testFn)  ;
  public  void verifyExternalCatalogMetadata (java.lang.String tableName)  ;
}
