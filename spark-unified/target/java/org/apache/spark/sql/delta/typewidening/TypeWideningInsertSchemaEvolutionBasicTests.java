package org.apache.spark.sql.delta.typewidening;
/**
 * Tests covering type widening during schema evolution in INSERT.
 */
public  interface TypeWideningInsertSchemaEvolutionBasicTests extends org.apache.spark.sql.delta.DeltaInsertIntoTest, org.apache.spark.sql.delta.typewidening.TypeWideningTestCases {
  /**
   * Short-hand to create a logical plan to insert into the table. This captures the state of the
   * table at the time the method is called, e.p. the type widening property value that will be used
   * during analysis.
   * @param df (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan createInsertPlan (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  ;
}
