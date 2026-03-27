package org.apache.spark.sql.delta;
public  interface MergeCDCWithDVsMixin extends org.apache.spark.sql.delta.cdc.MergeCDCMixin, org.apache.spark.sql.delta.DeletionVectorsTestUtils {
  public  void beforeAll ()  ;
  public  scala.collection.immutable.Seq<java.lang.String> excluded ()  ;
}
