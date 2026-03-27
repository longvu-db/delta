package org.apache.spark.sql.delta;
public  interface MergeIntoTempViewsTests extends org.apache.spark.sql.delta.MergeIntoSuiteBaseMixin, org.apache.spark.sql.delta.DeltaTestUtilsForTempViews {
  /**
   * Ensure we can successfully remove the temp view from the target plan during MERGE analysis.
   * Failing to do so can cause MERGE execution to fail later on as it is assumed the target plan is
   * a simple logical relation by then without projections.
   * @param target (undocumented)
   */
  public  void checkStripViewFromTarget (java.lang.String target)  ;
  public  void testTempViews (java.lang.String name, java.lang.String text, java.lang.String mergeCondition, org.apache.spark.sql.delta.DeltaTestUtilsBase.ExpectedResult<scala.collection.immutable.Seq<org.apache.spark.sql.Row>> expectedResult, boolean checkViewStripped)  ;
}
