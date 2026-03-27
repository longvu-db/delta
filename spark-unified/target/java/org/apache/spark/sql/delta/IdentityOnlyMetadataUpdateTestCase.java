package org.apache.spark.sql.delta;
/** A transaction that will be tagged as a metadata update only for identity column. */
public  class IdentityOnlyMetadataUpdateTestCase implements org.apache.spark.sql.delta.TransactionConflictTestCase, scala.Product, java.io.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String sqlCommand ()  { throw new RuntimeException(); }
  public  boolean isAppend ()  { throw new RuntimeException(); }
  // not preceding
  public   IdentityOnlyMetadataUpdateTestCase (java.lang.String name, java.lang.String sqlCommand, boolean isAppend)  { throw new RuntimeException(); }
  public  boolean hasMetadataUpdate ()  { throw new RuntimeException(); }
}
