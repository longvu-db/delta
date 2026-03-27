package org.apache.spark.sql.delta;
public  interface MergeIntoScalaTestUtils extends org.apache.spark.sql.delta.MergeIntoTestUtils {
  public  void executeMerge (java.lang.String target, java.lang.String source, java.lang.String condition, java.lang.String update, java.lang.String insert)  ;
  public  void executeMerge (java.lang.String tgt, java.lang.String src, java.lang.String cond, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses)  ;
  public  void executeMergeWithSchemaEvolution (java.lang.String tgt, java.lang.String src, java.lang.String cond, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses)  ;
  public  io.delta.tables.DeltaMergeBuilder getMergeBuilder (java.lang.String tgt, java.lang.String src, java.lang.String cond, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses)  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> parseInsert (java.lang.String valueStr, scala.Option<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clause)  ;
  public  java.lang.String parsePath (java.lang.String nameOrPath)  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> parseUpdate (scala.collection.immutable.Seq<java.lang.String> update)  ;
}
