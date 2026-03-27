package org.apache.spark.sql.delta;
/**
 * Common tests for replaceOn option via DataFrame APIs
 * (save(), insertInto(), and saveAsTable()).
 */
public  interface DeltaInsertReplaceOnDFWriterTests extends org.apache.spark.sql.delta.DeltaInsertReplaceOnOrUsingTestUtils {
  public  scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> testMaterializedSourceUnpersist (java.lang.String targetPath, java.lang.String sourceViewName, int numKills)  ;
  /**
   * Write the sourceDF to the target with replaceOn.
   * @param sourceDF (undocumented)
   * @param target (undocumented)
   * @param replaceOnCond (undocumented)
   * @param targetAlias (undocumented)
   * @param mergeSchema (undocumented)
   */
  public  void writeReplaceOnDF (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> sourceDF, java.lang.String target, java.lang.String replaceOnCond, scala.Option<java.lang.String> targetAlias, boolean mergeSchema)  ;
}
