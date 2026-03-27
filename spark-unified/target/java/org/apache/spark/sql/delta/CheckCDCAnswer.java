package org.apache.spark.sql.delta;
public  interface CheckCDCAnswer {
  /**
   * Check the result of a CDC operation. The expected answer should include only CDC type and
   * log version - the timestamp is nondeterministic, so we'll check just that it matches the
   * correct value in the Delta log.
   * <p>
   * @param log            The Delta log for the table CDC is being extracted from.
   * @param df             The computed dataframe, which should match the default CDC result schema.
   *                       Callers doing projections on top should use checkAnswer directly.
   * @param expectedAnswer The expected results for the CDC query, excluding the CDC_LOG_TIMESTAMP
   *                       column which we handle inside this method.
   */
  public  void checkCDCAnswer (org.apache.spark.sql.delta.DeltaLog log, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> df, scala.collection.immutable.Seq<org.apache.spark.sql.Row> expectedAnswer)  ;
  public  void checkCDCAnswer (org.apache.spark.sql.delta.DeltaLog log, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> df, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedAnswer)  ;
}
