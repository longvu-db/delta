package org.apache.spark.sql.delta.util;
/**
 * Helpers for constructing {@link CatalogTable} instances inside Java tests.
 * <p>
 * Spark's {@link CatalogTable} is defined in Scala and its constructor signature shifts between Spark
 * releases. Centralising the construction in Scala keeps the kernel tests insulated from those
 * binary changes and saves Java tests from manually wiring the many optional parameters.
 */
public  class CatalogTableTestUtils {
  /**
   * Creates a {@link CatalogTable} with configurable options.
   * <p>
   * @param tableName table name (default: "tbl")
   * @param catalogName optional catalog name for the identifier
   * @param properties table properties (default: empty)
   * @param storageProperties storage properties (default: empty)
   * @param locationUri optional storage location URI
   * @param nullStorage if true, sets storage to null (for edge case testing)
   * @param nullStorageProperties if true, sets storage properties to null
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.catalog.CatalogTable createCatalogTable (java.lang.String tableName, scala.Option<java.lang.String> catalogName, java.util.Map<java.lang.String, java.lang.String> properties, java.util.Map<java.lang.String, java.lang.String> storageProperties, scala.Option<java.net.URI> locationUri, boolean nullStorage, boolean nullStorageProperties)  { throw new RuntimeException(); }
}
