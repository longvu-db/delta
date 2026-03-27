package org.apache.spark.sql.delta;
public  interface OpenSourceDataFrameWriterV2Tests extends org.apache.spark.sql.test.SharedSparkSession, org.scalatest.BeforeAndAfter {
  public  org.apache.spark.sql.connector.catalog.TableCatalog catalog ()  ;
  public  java.lang.String catalogPrefix ()  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getProperties (org.apache.spark.sql.connector.catalog.Table table)  ;
}
