package org.apache.spark.sql.delta;
public  interface MergeIntoNotMatchedBySourceWithCDCMixin extends org.apache.spark.sql.delta.MergeIntoSuiteBaseMixin {
  /**
   * Variant of <code>testExtendedMerge</code> that runs a MERGE INTO command, checks the expected result and
   * additionally validate that the CDC produced is correct.
   * @param name (undocumented)
   * @param namePrefix (undocumented)
   * @param source (undocumented)
   * @param target (undocumented)
   * @param mergeOn (undocumented)
   * @param mergeClauses (undocumented)
   * @param result (undocumented)
   * @param cdc (undocumented)
   */
  public  void testExtendedMergeWithCDC (java.lang.String name, java.lang.String namePrefix, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> source, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> target, java.lang.String mergeOn, scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeHelpers.MergeClause> mergeClauses, scala.collection.immutable.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> result, scala.collection.immutable.Seq<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.String>> cdc)  ;
}
