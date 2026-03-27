package org.apache.spark.sql.delta;
/**
 * The shared utils base to be extended by corresponding suites/traits.
 */
public  interface IcebergCompatUtilsBase {
  public  scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> allReaderWriterVersions ()  ;
  public  void assertIcebergCompatProtocolAndProperties (java.lang.String tableId, org.apache.spark.sql.delta.IcebergCompatBase compatObj)  ;
  public  java.lang.String compatColumnMappingMode ()  ;
  public  org.apache.spark.sql.delta.IcebergCompatBase compatObject ()  ;
  public  org.apache.spark.sql.delta.TableFeature compatTableFeature ()  ;
  public  int compatVersion ()  ;
  public  java.lang.String defaultCatalogName ()  ;
  public  java.lang.String defaultSchemaName ()  ;
  public  java.lang.String enableCompatTableProperty ()  ;
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> executeSql (java.lang.String sqlStr)  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getProperties (java.lang.String tableId)  ;
  public  org.apache.spark.sql.catalyst.TableIdentifier getRndTableId ()  ;
  public  int parseIcebergVersion (java.lang.String metadataLocation)  ;
  public  org.apache.spark.sql.SparkSession spark ()  ;
  /**
   * Executes <code>f</code> with params (tableId, tempPath).
   * <p>
   * We want to use a temp directory in addition to a unique temp table so that when the async
   * iceberg conversion runs and completes, the parent folder is still removed.
   * @param f (undocumented)
   */
  public  void withTempTableAndDir (scala.Function2<java.lang.String, java.lang.String, scala.runtime.BoxedUnit> f)  ;
}
