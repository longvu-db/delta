package org.apache.spark.sql.delta;
/**
 * Trait collecting tests verifying the nullness of the results for nested array-of-struct
 * evolution.
 */
public  interface MergeIntoNestedArrayStructEvolutionNullnessTests extends org.apache.spark.sql.delta.MergeIntoSchemaEvolutionMixin, org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils {
  /**
   * Generates the expected result based on <code>sourceRowJson</code>, <code>targetRowJsonOpt</code>, and <code>actionType</code>.
   * Semantics: col struct evolves, nested arrays are overwritten, and structs within the
   * array evolve.
   * @param sourceRowJson (undocumented)
   * @param targetRowJsonOpt (undocumented)
   * @param actionType (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String generateNestedArrayExpectedResult (java.lang.String sourceRowJson, scala.Option<java.lang.String> targetRowJsonOpt, scala.Enumeration.Value actionType)  ;
  public  java.lang.String generateNestedArraySourceRow (scala.Enumeration.Value sourceType)  ;
  /**
   * Generates test cases for combinations of source type, target type, and action type.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.StructEvolutionNullnessTestCase> generateNestedArrayStructNullnessTests ()  ;
  public  scala.Option<java.lang.String> generateNestedArrayTargetRow (scala.Enumeration.Value targetType)  ;
  public  org.apache.spark.sql.types.StructType getNestedArrayResultSchema (scala.Enumeration.Value actionType)  ;
}
