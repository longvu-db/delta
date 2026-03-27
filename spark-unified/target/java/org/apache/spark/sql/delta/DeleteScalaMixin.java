package org.apache.spark.sql.delta;
public  interface DeleteScalaMixin extends org.apache.spark.sql.delta.DeleteBaseMixin, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.DeltaDMLTestUtilsPathBased, org.apache.spark.sql.delta.test.DeltaExcludedTestMixin {
  public  void executeDelete (java.lang.String target, java.lang.String where)  ;
}
