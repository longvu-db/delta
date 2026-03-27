package org.apache.spark.sql.delta;
public  class TestColumnSpec implements org.apache.spark.sql.delta.ColumnSpec, scala.Product, java.io.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String colName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  // not preceding
  public   TestColumnSpec (java.lang.String colName, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  public  java.lang.String ddl ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructField structField (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
}
