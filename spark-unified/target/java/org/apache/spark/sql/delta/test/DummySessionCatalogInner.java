package org.apache.spark.sql.delta.test;
public  class DummySessionCatalogInner extends org.apache.spark.sql.connector.catalog.DelegatingCatalogExtension {
  public   DummySessionCatalogInner ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table loadTable (org.apache.spark.sql.connector.catalog.Identifier ident)  { throw new RuntimeException(); }
}
