package org.apache.spark.sql.delta;
/**
 * Trait collecting schema evolution test runner methods and other helpers.
 */
public  interface MergeIntoSchemaEvolutionMixin {
  public  scala.collection.immutable.Seq<java.lang.String> strToJsonSeq (java.lang.String str)  ;
  /**
   * Test runner used by most non-nested schema evolution tests. Runs the MERGE operation once with
   * schema evolution disabled then with schema evolution enabled. Tests must provide for each case
   * either the expected result or the expected error message but not both.
   * @param name (undocumented)
   * @param targetData (undocumented)
   * @param sourceData (undocumented)
   * @param cond (undocumented)
   * @param clauses (undocumented)
   * @param expected (undocumented)
   * @param expectedWithoutEvolution (undocumented)
   * @param expectedSchema (undocumented)
   * @param expectedSchemaWithoutEvolution (undocumented)
   * @param expectErrorContains (undocumented)
   * @param expectErrorWithoutEvolutionContains (undocumented)
   * @param confs (undocumented)
   * @param partitionCols (undocumented)
   */
  public  void testEvolution (java.lang.String name, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> targetData, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sourceData, java.lang.String cond, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> expected, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> expectedWithoutEvolution, org.apache.spark.sql.types.StructType expectedSchema, org.apache.spark.sql.types.StructType expectedSchemaWithoutEvolution, java.lang.String expectErrorContains, java.lang.String expectErrorWithoutEvolutionContains, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs, scala.collection.immutable.Seq<java.lang.String> partitionCols)  ;
  /**
   * Helper method similar to {@link testEvolution()} but without aliasing the target and source tables
   * as 't' and 's'. Used to check that attribute resolution works correctly with schema evolution
   * when using column name qualified with the actual table name: <code>table_name.column</code>.
   * @param name (undocumented)
   * @param targetData (undocumented)
   * @param sourceData (undocumented)
   * @param clauses (undocumented)
   * @param expected (undocumented)
   * @param expectErrorContains (undocumented)
   * @param expectErrorWithoutEvolutionContains (undocumented)
   */
  public  void testEvolutionWithoutTableAliases (java.lang.String name, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> targetData, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sourceData, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses, scala.Function0<scala.collection.immutable.Seq<org.apache.spark.sql.Row>> expected, java.lang.String expectErrorContains, java.lang.String expectErrorWithoutEvolutionContains)  ;
  /**
   * Test runner used by most nested schema evolution tests. Similar to <code>testEvolution()</code> except
   * that the target &amp; source data and expected results are parsed as JSON strings for convenience.
   * @param name (undocumented)
   * @param target (undocumented)
   * @param source (undocumented)
   * @param targetSchema (undocumented)
   * @param sourceSchema (undocumented)
   * @param cond (undocumented)
   * @param clauses (undocumented)
   * @param result (undocumented)
   * @param resultSchema (undocumented)
   * @param resultWithoutEvolution (undocumented)
   * @param expectErrorContains (undocumented)
   * @param expectErrorWithoutEvolutionContains (undocumented)
   * @param confs (undocumented)
   */
  public  void testNestedStructsEvolution (java.lang.String name, scala.collection.immutable.Seq<java.lang.String> target, scala.collection.immutable.Seq<java.lang.String> source, org.apache.spark.sql.types.StructType targetSchema, org.apache.spark.sql.types.StructType sourceSchema, java.lang.String cond, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses, scala.collection.immutable.Seq<java.lang.String> result, org.apache.spark.sql.types.StructType resultSchema, scala.collection.immutable.Seq<java.lang.String> resultWithoutEvolution, java.lang.String expectErrorContains, java.lang.String expectErrorWithoutEvolutionContains, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs)  ;
}
