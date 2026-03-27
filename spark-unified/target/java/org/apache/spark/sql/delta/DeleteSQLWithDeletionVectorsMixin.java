package org.apache.spark.sql.delta;
public  interface DeleteSQLWithDeletionVectorsMixin extends org.apache.spark.sql.delta.DeleteSQLMixin, org.apache.spark.sql.delta.test.DeltaExcludedTestMixin, org.apache.spark.sql.delta.DeletionVectorsTestUtils, org.apache.spark.sql.delta.DeltaDMLTestUtilsPathBased {
  public  void beforeAll ()  ;
  public  scala.collection.immutable.Seq<java.lang.String> excluded ()  ;
  public  void testSuperSetColsTempView ()  ;
}
