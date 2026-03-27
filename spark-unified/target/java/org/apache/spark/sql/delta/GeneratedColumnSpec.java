package org.apache.spark.sql.delta;
public  class GeneratedColumnSpec implements org.apache.spark.sql.delta.ColumnSpec, scala.Product, java.io.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String colName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  java.lang.String generatedExpression ()  { throw new RuntimeException(); }
  // not preceding
  public   GeneratedColumnSpec (java.lang.String colName, org.apache.spark.sql.types.DataType dataType, java.lang.String generatedExpression)  { throw new RuntimeException(); }
  public  java.lang.String ddl ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructField structField (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
}
