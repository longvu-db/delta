package org.apache.spark.sql.delta;
public  interface UpdateScalaMixin extends org.apache.spark.sql.delta.UpdateBaseMixin, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.test.DeltaExcludedTestMixin, org.apache.spark.sql.delta.DeltaDMLTestUtilsPathBased {
  public  void executeUpdate (java.lang.String target, java.lang.String set, java.lang.String where)  ;
  public  void executeUpdate (java.lang.String target, scala.collection.immutable.Seq<java.lang.String> set, java.lang.String where)  ;
}
