package org.apache.spark.sql.delta;
public  class SQLAPIOutput implements scala.Product, java.io.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String outputLocation ()  { throw new RuntimeException(); }
  public  java.lang.String confiInput ()  { throw new RuntimeException(); }
  public  java.lang.String sqlOperation ()  { throw new RuntimeException(); }
  public  boolean asSelect ()  { throw new RuntimeException(); }
  public  java.lang.String containsOptionNoPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String containsOptionPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String containsTblPropertiesNoPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String containsTblPropertiesPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String config ()  { throw new RuntimeException(); }
  // not preceding
  public   SQLAPIOutput (java.lang.String outputLocation, java.lang.String confiInput, java.lang.String sqlOperation, boolean asSelect, java.lang.String containsOptionNoPrefix, java.lang.String containsOptionPrefix, java.lang.String containsTblPropertiesNoPrefix, java.lang.String containsTblPropertiesPrefix, java.lang.String config)  { throw new RuntimeException(); }
}
