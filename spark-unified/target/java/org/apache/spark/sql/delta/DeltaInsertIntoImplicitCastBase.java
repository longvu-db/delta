package org.apache.spark.sql.delta;
/**
 * Test suite covering implicit casting in INSERT operations when the type of the data to insert
 * doesn't match the type in Delta table.
 * <p>
 * The casting behavior is (unfortunately) dependent on the API used to run the INSERT, e.g.
 * Dataframe V1 insertInto() vs V2 saveAsTable() or using SQL.
 * This suite intends to exhaustively cover all the ways INSERT can be run on a Delta table. See
 * {@link DeltaInsertIntoTest} for a list of these INSERT operations covered.
 */
public  interface DeltaInsertIntoImplicitCastBase extends org.apache.spark.sql.delta.DeltaInsertIntoTest {
  public  void beforeAll ()  ;
  public  scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Set<org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert>> ignoredTestCases ()  ;
}
