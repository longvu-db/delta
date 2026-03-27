package org.apache.spark.sql.delta;
public  interface DeleteSQLMixin extends org.apache.spark.sql.delta.DeleteBaseMixin, org.apache.spark.sql.delta.DeltaDMLTestUtils, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public  void executeDelete (java.lang.String target, java.lang.String where)  ;
}
