package org.apache.spark.sql.delta;
public  class OldPersistedSchema implements scala.Product, java.io.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String tableId ()  { throw new RuntimeException(); }
  public  long deltaCommitVersion ()  { throw new RuntimeException(); }
  public  java.lang.String dataSchemaJson ()  { throw new RuntimeException(); }
  public  java.lang.String partitionSchemaJson ()  { throw new RuntimeException(); }
  public  java.lang.String sourceMetadataPath ()  { throw new RuntimeException(); }
  // not preceding
  public   OldPersistedSchema (java.lang.String tableId, long deltaCommitVersion, java.lang.String dataSchemaJson, java.lang.String partitionSchemaJson, java.lang.String sourceMetadataPath)  { throw new RuntimeException(); }
}
