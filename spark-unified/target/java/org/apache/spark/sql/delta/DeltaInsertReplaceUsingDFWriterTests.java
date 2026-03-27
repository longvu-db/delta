package org.apache.spark.sql.delta;
/**
 * Common tests for replaceUsing option via DataFrame APIs (save(), insertInto(),
 * and saveAsTable()).
 */
public  interface DeltaInsertReplaceUsingDFWriterTests extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  /**
   * Write the sourceDF to the target with replaceUsing.
   * @param sourceDF (undocumented)
   * @param target (undocumented)
   * @param replaceUsingCols (undocumented)
   * @param writeMode (undocumented)
   * @param mergeSchema (undocumented)
   * @param options (undocumented)
   */
  public  void writeReplaceUsingDF (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> sourceDF, java.lang.String target, java.lang.String replaceUsingCols, java.lang.String writeMode, boolean mergeSchema, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  ;
}
