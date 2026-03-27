package org.apache.spark.sql.delta;
/**
 * Base trait collecting helper methods to run MERGE tests. Merge test suite will want to mix in
 * either {@link MergeIntoSQLTestUtils} or {@link MergeIntoScalaTestUtils} to run merge tests using the SQL
 * or Scala API resp.
 */
public  interface MergeIntoTestUtils extends org.apache.spark.sql.delta.DeltaDMLTestUtils, org.apache.spark.sql.delta.MergeHelpers {
  public  void executeMerge (java.lang.String target, java.lang.String source, java.lang.String condition, java.lang.String update, java.lang.String insert)  ;
  public  void executeMerge (java.lang.String tgt, java.lang.String src, java.lang.String cond, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses)  ;
  public  void executeMergeWithSchemaEvolution (java.lang.String tgt, java.lang.String src, java.lang.String cond, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses)  ;
  public  void withCrossJoinEnabled (scala.Function0<scala.runtime.BoxedUnit> body)  ;
}
