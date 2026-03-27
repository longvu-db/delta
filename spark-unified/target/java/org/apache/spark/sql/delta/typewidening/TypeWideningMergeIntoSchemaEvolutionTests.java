package org.apache.spark.sql.delta.typewidening;
/**
 * Tests covering type widening during schema evolution in MERGE INTO.
 */
public  interface TypeWideningMergeIntoSchemaEvolutionTests extends org.apache.spark.sql.delta.MergeIntoSQLTestUtils, org.apache.spark.sql.delta.MergeIntoSchemaEvolutionMixin, org.apache.spark.sql.delta.typewidening.TypeWideningTestCases {
  /**
   * Wrapper around testNestedStructsEvolution that constrains the result with and without schema
   * evolution to be the same: the schema is different but the values should be the same.
   * @param name (undocumented)
   * @param target (undocumented)
   * @param source (undocumented)
   * @param targetSchema (undocumented)
   * @param sourceSchema (undocumented)
   * @param cond (undocumented)
   * @param clauses (undocumented)
   * @param result (undocumented)
   * @param resultSchema (undocumented)
   */
  public  void testTypeEvolution (java.lang.String name, scala.collection.immutable.Seq<java.lang.String> target, scala.collection.immutable.Seq<java.lang.String> source, org.apache.spark.sql.types.StructType targetSchema, org.apache.spark.sql.types.StructType sourceSchema, java.lang.String cond, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses, scala.collection.immutable.Seq<java.lang.String> result, org.apache.spark.sql.types.StructType resultSchema)  ;
}
