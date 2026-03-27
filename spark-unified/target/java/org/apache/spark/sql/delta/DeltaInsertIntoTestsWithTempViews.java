package org.apache.spark.sql.delta;
public abstract class DeltaInsertIntoTestsWithTempViews extends org.apache.spark.sql.delta.DeltaInsertIntoTests implements org.apache.spark.sql.delta.DeltaTestUtilsForTempViews {
  public   DeltaInsertIntoTestsWithTempViews (boolean supportsDynamicOverwrite, boolean includeSQLOnlyTests)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.DeltaTestUtilsBase.ExpectedResult$ ExpectedResult ()  { throw new RuntimeException(); }
  protected  void testComplexTempViews (java.lang.String name, java.lang.String text, scala.collection.immutable.Seq<org.apache.spark.sql.Row> expectedResult)  { throw new RuntimeException(); }
}
