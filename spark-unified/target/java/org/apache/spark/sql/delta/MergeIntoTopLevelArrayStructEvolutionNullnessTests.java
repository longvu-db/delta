package org.apache.spark.sql.delta;
/**
 * Trait collecting tests verifying the nullness of the results for array-of-struct evolution.
 */
public  interface MergeIntoTopLevelArrayStructEvolutionNullnessTests extends org.apache.spark.sql.delta.MergeIntoSchemaEvolutionMixin, org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils {
  /**
   * Generates the expected result based on <code>sourceRowJson</code>, <code>targetRowJsonOpt</code>, and <code>actionType</code>.
   * Semantics: Entire arrays are overwritten, and structs within the array evolve.
   * Note: <code>targetRowJsonOpt</code> and <code>actionType</code> are not used since arrays are always overwritten.
   *       They are added to match the data type of
   *       <code>generateStructEvolutionNullnessTests.generateExpectedResultFn</code>.
   * <p>
   * @param sourceRowJson (undocumented)
   * @param targetRowJsonOpt (undocumented)
   * @param actionType (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String generateTopLevelArrayStructExpectedResult (java.lang.String sourceRowJson, scala.Option<java.lang.String> targetRowJsonOpt, scala.Enumeration.Value actionType)  ;
  /**
   * Generates test cases for combinations of source type, target type, and action type.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.StructEvolutionNullnessTestCase> generateTopLevelArrayStructNullnessTests ()  ;
  public  java.lang.String generateTopLevelArrayStructSourceRow (scala.Enumeration.Value sourceType)  ;
  public  scala.Option<java.lang.String> generateTopLevelArrayStructTargetRow (scala.Enumeration.Value targetType)  ;
}
