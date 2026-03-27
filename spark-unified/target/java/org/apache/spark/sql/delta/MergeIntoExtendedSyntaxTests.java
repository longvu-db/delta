package org.apache.spark.sql.delta;
public  interface MergeIntoExtendedSyntaxTests extends org.apache.spark.sql.delta.MergeIntoSuiteBaseMixin {
  public  void testMergeErrorOnMultipleMatches (java.lang.String name, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> source, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> target, java.lang.String mergeOn, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> mergeClauses)  ;
}
