package org.apache.spark.sql.delta.cdc;
/**
 * Tests for MERGE INTO in CDC output mode.
 * <p>
 */
public  interface MergeCDCTests extends org.apache.spark.sql.delta.cdc.CDCEnabled, org.apache.spark.sql.delta.cdc.MergeCDCMixin, org.apache.spark.sql.delta.CDCTestMixin {
  /**
   * Utility method for simpler test writing when there's at most clause of each type.
   * @param name (undocumented)
   * @param target (undocumented)
   * @param source (undocumented)
   * @param deleteWhen (undocumented)
   * @param update (undocumented)
   * @param insert (undocumented)
   * @param expectedTableData (undocumented)
   * @param expectedCdcDataWithoutVersion (undocumented)
   * @param expectErrorContains (undocumented)
   * @param confs (undocumented)
   */
  public  void testMergeCdc (java.lang.String name, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> target, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> source, java.lang.String deleteWhen, java.lang.String update, java.lang.String insert, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> expectedTableData, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> expectedCdcDataWithoutVersion, java.lang.String expectErrorContains, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs)  ;
  public  void testMergeCdcUnlimitedClauses (java.lang.String name, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> target, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> source, java.lang.String mergeCondition, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> clauses, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> expectedTableData, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> expectedCdcDataWithoutVersion, java.lang.String expectErrorContains, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs, scala.Option<org.apache.spark.sql.types.StructType> targetTableSchema)  ;
}
