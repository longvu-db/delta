package org.apache.spark.sql.delta.cdc;
public  interface DeleteCDCMixin extends org.apache.spark.sql.delta.DeleteSQLMixin, org.apache.spark.sql.delta.cdc.CDCEnabled {
  public  void testCDCDelete (java.lang.String name, scala.Function0<org.apache.spark.sql.Dataset<?>> initialData, scala.collection.immutable.Seq<java.lang.String> partitionColumns, java.lang.String deleteCondition, scala.Function0<org.apache.spark.sql.Dataset<?>> expectedData, scala.Function0<org.apache.spark.sql.Dataset<?>> expectedChangeDataWithoutVersion)  ;
}
