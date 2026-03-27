package org.apache.spark.sql.delta;
public  interface MergeIntoSQLTestUtils extends org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.MergeIntoTestUtils {
  public  java.lang.String basicMergeStmt (scala.Option<java.lang.String> cte, java.lang.String target, java.lang.String source, java.lang.String condition, java.lang.String update, java.lang.String insert)  ;
  public  java.lang.String basicMergeStmt (scala.Option<java.lang.String> cte, java.lang.String target, java.lang.String source, java.lang.String condition, boolean withSchemaEvolution, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses)  ;
  public  void executeMerge (java.lang.String target, java.lang.String source, java.lang.String condition, java.lang.String update, java.lang.String insert)  ;
  public  void executeMerge (java.lang.String tgt, java.lang.String src, java.lang.String cond, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses)  ;
  public  void executeMergeWithSchemaEvolution (java.lang.String tgt, java.lang.String src, java.lang.String cond, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses)  ;
}
