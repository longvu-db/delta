package org.apache.spark.sql.delta.schema;
public  interface SaveOperation {
  public  void apply (org.apache.spark.sql.DataFrameWriter<?> dfw)  ;
}
