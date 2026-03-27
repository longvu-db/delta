package org.apache.spark.sql.delta;
public  interface IdentityColumnConflictSuiteBase extends org.apache.spark.sql.delta.IdentityColumnTestUtils, org.apache.spark.sql.delta.concurrency.TransactionExecutionTestMixin, org.apache.spark.sql.delta.concurrency.PhaseLockingTestMixin {
  public  java.lang.String colName ()  ;
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.TransactionConflictTestCase> conflictTestCases ()  ;
  /**
   * Returns the expected exception class for the test case.
   * Returns None if no exception is expected.
   * @param currentTxn (undocumented)
   * @param winningTxn (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Class<? extends java.lang.RuntimeException>> expectedExceptionClass (org.apache.spark.sql.delta.TransactionConflictTestCase currentTxn, org.apache.spark.sql.delta.TransactionConflictTestCase winningTxn)  ;
  public  void setupEmptyTableWithRowTrackingTableFeature (scala.Option<org.apache.spark.sql.delta.IsolationLevel> tblIsoLevel, java.lang.String tblName)  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  /** Executes the winning transaction SQL. Overridable for custom RPC assertions. */
  public  void sqlWithTotalRpcBound (java.lang.String sqlText)  ;
  /**
   * Helper function to test two concurrently running commands. Winning transaction commits before
   * current transaction commits.
   * @param currentTxn (undocumented)
   * @param winningTxn (undocumented)
   * @param tblIsoLevel (undocumented)
   */
  public  void transactionIdentityConflictHelper (org.apache.spark.sql.delta.TransactionConflictTestCase currentTxn, org.apache.spark.sql.delta.TransactionConflictTestCase winningTxn, scala.Option<org.apache.spark.sql.delta.IsolationLevel> tblIsoLevel)  ;
}
