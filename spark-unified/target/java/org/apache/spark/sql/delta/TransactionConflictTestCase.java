package org.apache.spark.sql.delta;
/**
 * Helper class used in this test suite for describing different transaction conflict scenarios.
 */
public  interface TransactionConflictTestCase {
  /** Boolean indicating whether this transaction does a metadata update. */
  public  boolean hasMetadataUpdate ()  ;
  /** Boolean indicating whether the SQL command appends data (add files) to the table. */
  public  boolean isAppend ()  ;
  /** label for this transaction scenario. */
  public  java.lang.String name ()  ;
  /** SQL command to be executed. */
  public  java.lang.String sqlCommand ()  ;
}
