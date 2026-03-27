package org.apache.spark.sql.delta;
public  interface MergeIntoSuiteBaseMixin extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.test.ScanReportHelper, org.apache.spark.sql.delta.MergeIntoTestUtils, org.apache.spark.sql.delta.MergeIntoSchemaEvolutionMixin {
  public  scala.collection.immutable.Set<java.lang.String> expectedOpTypes ()  ;
  public  scala.collection.immutable.Set<java.lang.String> expectedOpTypesInsertOnly ()  ;
  public  void insertOnlyMergeFeatureFlagOff (java.lang.String sourceName, java.lang.String targetName)  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> mappedErrorClasses ()  ;
  public  org.apache.spark.sql.delta.commands.merge.MergeStats performMergeAndCollectStatsForDataSkippingOnMatchPredicates (java.lang.String sourceName, java.lang.String targetName, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> result, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> mergeClauses)  ;
  public  void testExtendedMerge (java.lang.String name, java.lang.String namePrefix, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> source, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> target, java.lang.String mergeOn, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> mergeClauses, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> result)  ;
  /**
   * Test runner to cover analysis exception in MERGE INTO.
   * @param name (undocumented)
   * @param mergeOn (undocumented)
   * @param mergeClauses (undocumented)
   * @param expectedErrorClass (undocumented)
   * @param expectedMessageParameters (undocumented)
   */
  public  void testMergeAnalysisException (java.lang.String name, java.lang.String mergeOn, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> mergeClauses, java.lang.String expectedErrorClass, scala.collection.immutable.Map<java.lang.String, java.lang.String> expectedMessageParameters)  ;
  /**
   * Test whether data skipping on matched predicates of a merge command is performed.
   * @param name The name of the test case.
   * @param source The source for merge.
   * @param target The target for merge.
   * @param dataSkippingOnTargetOnly The boolean variable indicates whether
   *                                 when matched clauses are on target fields only.
   *                                 Data Skipping should be performed before inner join if
   *                                 this variable is true.
   * @param isMatchedOnly The boolean variable indicates whether the merge command only
   *                      contains when matched clauses.
   * @param mergeClauses Merge Clauses.
   * @param result (undocumented)
   */
  public  void testMergeDataSkippingOnMatchPredicates (java.lang.String name, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> source, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> target, boolean dataSkippingOnTargetOnly, boolean isMatchedOnly, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> mergeClauses, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> result)  ;
  public  void testMergeWithRepartition (java.lang.String name, scala.collection.immutable.Seq<java.lang.String> partitionColumns, scala.collection.immutable.Range srcRange, boolean expectLessFilesWithRepartition, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses)  ;
  public  void testNestedDataSupport (java.lang.String name, java.lang.String namePrefix, java.lang.String source, java.lang.String target, scala.collection.immutable.Seq<java.lang.String> update, java.lang.String insert, org.apache.spark.sql.types.StructType targetSchema, org.apache.spark.sql.types.StructType sourceSchema, java.lang.String result, scala.collection.immutable.Seq<java.lang.String> errorStrs, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs)  ;
  /**
   * @param function the unsupported function.
   * @param functionType The type of the unsupported expression to be tested.
   * @param sourceData the data in the source table.
   * @param targetData the data in the target table.
   * @param mergeCondition the merge condition containing the unsupported expression.
   * @param clauseCondition the clause condition containing the unsupported expression.
   * @param clauseAction the clause action containing the unsupported expression.
   * @param expectExceptionInAction whether expect exception thrown in action.
   * @param customConditionErrorRegex the customized error regex for condition.
   * @param customActionErrorRegex the customized error regex for action.
   */
  public  void testUnsupportedExpression (java.lang.String function, java.lang.String functionType, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sourceData, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> targetData, java.lang.String mergeCondition, java.lang.String clauseCondition, java.lang.String clauseAction, scala.Option<java.lang.Object> expectExceptionInAction, scala.Option<java.lang.String> customConditionErrorRegex, scala.Option<java.lang.String> customActionErrorRegex)  ;
  public  void withJsonData (scala.collection.immutable.Seq<java.lang.String> source, scala.collection.immutable.Seq<java.lang.String> target, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.types.StructType sourceSchema, scala.Function2<java.lang.String, java.lang.String, scala.runtime.BoxedUnit> thunk)  ;
}
