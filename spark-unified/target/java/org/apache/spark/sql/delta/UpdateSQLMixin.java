package org.apache.spark.sql.delta;
public  interface UpdateSQLMixin extends org.apache.spark.sql.delta.UpdateBaseMixin, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.DeltaDMLTestUtils {
  public  void executeUpdate (java.lang.String target, java.lang.String set, java.lang.String where)  ;
}
