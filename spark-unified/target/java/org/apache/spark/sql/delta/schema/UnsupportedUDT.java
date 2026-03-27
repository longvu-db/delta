package org.apache.spark.sql.delta.schema;
public  class UnsupportedUDT extends org.apache.spark.sql.delta.schema.PointUDT {
  public   UnsupportedUDT ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType sqlType ()  { throw new RuntimeException(); }
}
