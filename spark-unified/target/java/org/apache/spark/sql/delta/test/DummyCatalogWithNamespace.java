package org.apache.spark.sql.delta.test;
public  class DummyCatalogWithNamespace extends org.apache.spark.sql.delta.test.DummyCatalog implements org.apache.spark.sql.connector.catalog.SupportsNamespaces {
  static public  org.apache.hadoop.fs.Path catalogDir ()  { throw new RuntimeException(); }
  public   DummyCatalogWithNamespace ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.hadoop.fs.Path tempDir ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.hadoop.fs.FileSystem fs ()  { throw new RuntimeException(); }
  protected  java.util.Map<scala.collection.immutable.List<java.lang.String>, scala.collection.immutable.Map<java.lang.String, java.lang.String>> namespaces ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.Map<java.lang.String[], scala.collection.mutable.HashSet<org.apache.spark.sql.connector.catalog.Identifier>> tables ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.Path getTablePath (java.lang.String tableName)  { throw new RuntimeException(); }
  public  boolean tableExists (org.apache.spark.sql.connector.catalog.Identifier ident)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table loadTable (org.apache.spark.sql.connector.catalog.Identifier ident)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table createTable (org.apache.spark.sql.connector.catalog.Identifier ident, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.connector.expressions.Transform[] partitions, java.util.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  boolean dropTable (org.apache.spark.sql.connector.catalog.Identifier ident)  { throw new RuntimeException(); }
  public  void initialize (java.lang.String name, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  void createNamespace (java.lang.String[] namespace, java.util.Map<java.lang.String, java.lang.String> metadata)  { throw new RuntimeException(); }
  public  void alterNamespace (java.lang.String[] namespace, scala.collection.immutable.Seq<org.apache.spark.sql.connector.catalog.NamespaceChange> changes)  { throw new RuntimeException(); }
  public  boolean dropNamespace (java.lang.String[] namespace, boolean cascade)  { throw new RuntimeException(); }
  public  boolean namespaceExists (java.lang.String[] namespace)  { throw new RuntimeException(); }
  public  java.lang.String[][] listNamespaces ()  { throw new RuntimeException(); }
  public  java.lang.String[][] listNamespaces (java.lang.String[] namespace)  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.String> loadNamespaceMetadata (java.lang.String[] namespace)  { throw new RuntimeException(); }
  // not preceding
  public  void alterNamespace (java.lang.String[] namespace, org.apache.spark.sql.connector.catalog.NamespaceChange[] changes)  { throw new RuntimeException(); }
}
