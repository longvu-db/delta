package org.apache.spark.sql.delta;
public  interface UniversalFormatTestHelper {
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.IcebergCompatBase> allCompatObjects ()  ;
  public  org.apache.spark.sql.delta.IcebergCompatBase compatObjectFromVersion (int version)  ;
  public  int getCompatVersionOtherThan (int version)  ;
  public  scala.collection.immutable.Seq<java.lang.Object> getCompatVersionsOtherThan (int version)  ;
}
