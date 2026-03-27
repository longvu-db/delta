package org.apache.spark.sql.delta;
public  interface DeltaInsertReplaceOnOrUsingCommonTests extends org.apache.spark.sql.delta.DeltaInsertReplaceOnOrUsingTestUtils {
  public  void executeInsertAtomicReplace (java.lang.String tableName, scala.collection.immutable.Seq<java.lang.String> matchingCols, java.lang.String sourceQuery, boolean byName, boolean withSchemaEvolution)  ;
  /**
   * The expected error parameter value for the replace criteria given a set of matching columns.
   * This is the matching condition for REPLACE ON or a list of column names for REPLACE USING.
   * @param matchingCols (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String expectedReplaceCriteriaValue (scala.collection.immutable.Seq<java.lang.String> matchingCols)  ;
  public  void testInsertReplaceOnOrUsingMaterializeSourceUnpersistRetries ()  ;
  public  scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> testInsertReplaceOnOrUsingMaterializedSourceUnpersist (java.lang.String tblName, java.lang.String sourceViewName, int numKills)  ;
  public <Intercept extends java.lang.Exception> void testWithCustomErrorInjected (java.lang.Exception inject, scala.Function2<Intercept, scala.Option<org.apache.spark.sql.delta.commands.merge.MergeIntoMaterializeSourceError>, scala.runtime.BoxedUnit> handle, scala.reflect.ClassTag<Intercept> evidence$1)  ;
}
