package org.apache.spark.sql.delta;
/**
 * Trait collecting tests verifying the nullness of the results for top-level struct evolution.
 */
public  interface MergeIntoTopLevelStructEvolutionNullnessTests extends org.apache.spark.sql.delta.MergeIntoSchemaEvolutionMixin, org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils {
  /**
   * Generates the expected result based on <code>sourceRowJson</code>, <code>targetRowJsonOpt</code>, and <code>actionType</code>.
   * Semantics:
   * - UPDATE *: field-level merge, preserves target-only fields (col.z).
   * - UPDATE t.col = s.col, INSERT: whole-struct assignment, nulls target-only fields.
   * @param sourceRowJson (undocumented)
   * @param targetRowJsonOpt (undocumented)
   * @param actionType (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String generateTopLevelStructExpectedResult (java.lang.String sourceRowJson, scala.Option<java.lang.String> targetRowJsonOpt, scala.Enumeration.Value actionType)  ;
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.StructEvolutionNullnessTestCase> generateTopLevelStructNullnessTests ()  ;
  public  java.lang.String generateTopLevelStructSourceRow (scala.Enumeration.Value sourceType)  ;
  public  scala.Option<java.lang.String> generateTopLevelStructTargetRow (scala.Enumeration.Value targetType)  ;
}
