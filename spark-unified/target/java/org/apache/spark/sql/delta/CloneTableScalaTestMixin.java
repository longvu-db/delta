package org.apache.spark.sql.delta;
public  interface CloneTableScalaTestMixin extends org.apache.spark.sql.delta.CloneTableTestMixin {
  public  void cloneTable (java.lang.String source, java.lang.String target, boolean isShallow, boolean sourceIsTable, boolean targetIsTable, scala.Option<java.lang.String> targetLocation, scala.Option<java.lang.Object> versionAsOf, scala.Option<java.lang.String> timestampAsOf, boolean isCreate, boolean isReplace, scala.collection.immutable.Map<java.lang.String, java.lang.String> tableProperties)  ;
}
