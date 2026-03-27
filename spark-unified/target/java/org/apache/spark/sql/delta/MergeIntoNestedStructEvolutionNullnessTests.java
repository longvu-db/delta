package org.apache.spark.sql.delta;
/**
 * Trait collecting tests verifying the nullness of the results for nested struct evolution.
 */
public  interface MergeIntoNestedStructEvolutionNullnessTests extends org.apache.spark.sql.delta.MergeIntoSchemaEvolutionMixin, org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils {
  /**
   * Generates the expected result based on <code>sourceRowJson</code>, <code>targetRowJsonOpt</code>, and <code>actionType</code>.
   * Semantics:
   * - UPDATE *: field-level merge, preserves target-only fields.
   * - UPDATE t.col = s.col, INSERT: whole-struct assignment, nulls target-only fields.
   * - UPDATE t.col.y = s.col.y: whole-struct assignment, nulls target-only fields.
   * @param sourceRowJson (undocumented)
   * @param targetRowJsonOpt (undocumented)
   * @param actionType (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String generateNestedStructExpectedResult (java.lang.String sourceRowJson, scala.Option<java.lang.String> targetRowJsonOpt, scala.Enumeration.Value actionType)  ;
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.StructEvolutionNullnessTestCase> generateNestedStructNullnessTests ()  ;
  public  java.lang.String generateNestedStructSourceRow (scala.Enumeration.Value sourceType)  ;
  public  scala.Option<java.lang.String> generateNestedStructTargetRow (scala.Enumeration.Value targetType)  ;
  public  org.apache.spark.sql.types.StructType getNestedStructResultSchema (scala.Enumeration.Value actionType)  ;
}
