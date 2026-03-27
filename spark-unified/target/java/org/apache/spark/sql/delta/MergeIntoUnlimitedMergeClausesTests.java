package org.apache.spark.sql.delta;
public  interface MergeIntoUnlimitedMergeClausesTests extends org.apache.spark.sql.delta.MergeIntoSuiteBaseMixin {
  public  void testUnlimitedClauses (java.lang.String name, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> source, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> target, java.lang.String mergeOn, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> mergeClauses, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> result)  ;
}
