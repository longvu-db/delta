package org.apache.spark.sql.delta;
public  interface UpdateSQLWithDeletionVectorsMixin extends org.apache.spark.sql.delta.UpdateSQLMixin, org.apache.spark.sql.delta.test.DeltaExcludedTestMixin, org.apache.spark.sql.delta.DeletionVectorsTestUtils {
  public  void beforeAll ()  ;
  public  scala.collection.immutable.Seq<java.lang.String> excluded ()  ;
}
