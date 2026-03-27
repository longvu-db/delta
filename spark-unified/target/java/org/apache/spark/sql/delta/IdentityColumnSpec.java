package org.apache.spark.sql.delta;
public  class IdentityColumnSpec implements org.apache.spark.sql.delta.ColumnSpec, scala.Product, java.io.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value generatedAsIdentityType ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> startsWith ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> incrementBy ()  { throw new RuntimeException(); }
  public  java.lang.String colName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> comment ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  // not preceding
  public   IdentityColumnSpec (scala.Enumeration.Value generatedAsIdentityType, scala.Option<java.lang.Object> startsWith, scala.Option<java.lang.Object> incrementBy, java.lang.String colName, org.apache.spark.sql.types.DataType dataType, scala.Option<java.lang.String> comment, boolean nullable)  { throw new RuntimeException(); }
  public  java.lang.String ddl ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructField structField (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
}
