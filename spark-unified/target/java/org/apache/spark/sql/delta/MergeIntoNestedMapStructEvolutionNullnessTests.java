package org.apache.spark.sql.delta;
/**
 * Trait collecting tests verifying the nullness of the results for nested map-of-struct
 * evolution.
 */
public  interface MergeIntoNestedMapStructEvolutionNullnessTests extends org.apache.spark.sql.delta.MergeIntoSchemaEvolutionMixin, org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils {
  /**
   * Generates the expected result based on <code>sourceRowJson</code>, <code>targetRowJsonOpt</code>, and <code>actionType</code>.
   * Semantics: col struct evolves, nested maps are overwritten, and structs within the
   * map evolve.
   * @param sourceRowJson (undocumented)
   * @param targetRowJsonOpt (undocumented)
   * @param actionType (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String generateNestedMapExpectedResult (java.lang.String sourceRowJson, scala.Option<java.lang.String> targetRowJsonOpt, scala.Enumeration.Value actionType)  ;
  public  java.lang.String generateNestedMapSourceRow (scala.Enumeration.Value sourceType)  ;
  /**
   * Generates test cases for combinations of source type, target type, and action type.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.StructEvolutionNullnessTestCase> generateNestedMapStructNullnessTests ()  ;
  public  scala.Option<java.lang.String> generateNestedMapTargetRow (scala.Enumeration.Value targetType)  ;
  public  org.apache.spark.sql.types.StructType getNestedMapResultSchema (scala.Enumeration.Value actionType)  ;
}
