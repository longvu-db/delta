package org.apache.spark.sql.delta;
public  interface MergeIntoDVsMixin extends org.apache.spark.sql.delta.MergeIntoSQLMixin, org.apache.spark.sql.delta.DeletionVectorsTestUtils {
  public  void beforeAll ()  ;
  public  scala.collection.immutable.Seq<java.lang.String> excluded ()  ;
  public  scala.collection.immutable.Set<java.lang.String> expectedOpTypes ()  ;
}
