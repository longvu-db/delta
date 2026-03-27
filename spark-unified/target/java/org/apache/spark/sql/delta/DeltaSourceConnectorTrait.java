package org.apache.spark.sql.delta;
/**
 * Trait that provides abstraction for testing both DSv1 and DSv2 connectors.
 */
public  interface DeltaSourceConnectorTrait {
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> loadStreamWithOptions (java.lang.String path, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  ;
  public  boolean useDsv2 ()  ;
}
