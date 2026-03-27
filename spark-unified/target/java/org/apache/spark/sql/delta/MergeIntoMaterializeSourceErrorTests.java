package org.apache.spark.sql.delta;
public  interface MergeIntoMaterializeSourceErrorTests extends org.apache.spark.sql.delta.MergeIntoMaterializeSourceMixin {
  public  void testMergeMaterializeSourceUnpersistRetries ()  ;
  public <Intercept extends java.lang.Exception> void testWithCustomErrorInjected (java.lang.Exception inject, scala.Function2<Intercept, scala.Option<org.apache.spark.sql.delta.commands.merge.MergeIntoMaterializeSourceError>, scala.runtime.BoxedUnit> handle, scala.reflect.ClassTag<Intercept> evidence$1)  ;
}
