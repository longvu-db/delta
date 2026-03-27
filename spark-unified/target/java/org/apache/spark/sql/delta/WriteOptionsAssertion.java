package org.apache.spark.sql.delta;
public  class WriteOptionsAssertion implements scala.Product, java.io.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String mode ()  { throw new RuntimeException(); }
  public  boolean isDynamicPartitionOverwrite ()  { throw new RuntimeException(); }
  public  boolean canOverwriteSchema ()  { throw new RuntimeException(); }
  public  boolean canMergeSchema ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> predicate ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteOptionsAssertion (java.lang.String mode, boolean isDynamicPartitionOverwrite, boolean canOverwriteSchema, boolean canMergeSchema, scala.Option<java.lang.String> predicate)  { throw new RuntimeException(); }
}
