package org.apache.spark.sql.delta.stats;
public  interface DataSkippingDeltaTestsUtils extends org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Returns the number of files that should be included in a scan after applying the given
   * predicate on a snapshot of the Delta log.
   * <p>
   * @param deltaLog Delta log for a table.
   * @param predicate Predicate to run on the Delta table.
   * @param checkEmptyUnusedFilters If true, check if there were no unused filters, meaning
   *                                the given predicate was used as data or partition filters.
   * @return The number of files that should be included in a scan after applying the predicate.
   * @param spark (undocumented)
   */
  public  int filesRead (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.DeltaLog deltaLog, java.lang.String predicate, boolean checkEmptyUnusedFilters)  ;
  /**
   * Returns the files that should be included in a scan after applying the given predicate on
   * a snapshot of the Delta log.
   * @param deltaLog Delta log for a table.
   * @param predicate Predicate to run on the Delta table.
   * @param checkEmptyUnusedFilters If true, check if there were no unused filters, meaning
   *                                the given predicate was used as data or partition filters.
   * @return The files that should be included in a scan after applying the predicate.
   * @param spark (undocumented)
   */
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.AddFile> getFilesRead (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.DeltaLog deltaLog, java.lang.String predicate, boolean checkEmptyUnusedFilters)  ;
  public  scala.collection.immutable.Seq<org.apache.spark.sql.catalyst.expressions.Expression> parse (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.DeltaLog deltaLog, java.lang.String predicate)  ;
}
