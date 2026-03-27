package org.apache.spark.sql.delta;
public  interface DeltaWithNewTransactionSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.DeltaColumnMappingTestUtils, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.coordinatedcommits.CatalogOwnedTestBaseSuite {
  public  void testSnapshotIsolation ()  ;
  /**
   * Test whether <code>withNewTransaction</code> captures all delta read made within it and correctly
   * detects conflicts in transaction table and provides snapshot isolation for other table reads.
   * <p>
   * The order in which the given thunks are executed is as follows.
   * - Txn started using <code>withNewTransaction</code>. The following are executed while the txn is active.
   * - currentThreadReadOp - Read operations performed in current thread.
   * - concurrentUpdateOp - Update operations performed in different thread to
   *                        simulate concurrent modification. This is synchronously completed
   *                        before moving on.
   * - currentThreadCommitOperation - Attempt to commit changes in the txn.
   * @param name (undocumented)
   * @param partitionedTableKeys (undocumented)
   * @param preTxnSetup (undocumented)
   * @param currentThreadReadOp (undocumented)
   * @param concurrentUpdateOp (undocumented)
   * @param currentThreadCommitOperation (undocumented)
   * @param shouldFail (undocumented)
   * @param confs (undocumented)
   * @param partitionTablePath (undocumented)
   */
  public  void testWithNewTransaction (java.lang.String name, scala.collection.immutable.Seq<java.lang.Object> partitionedTableKeys, scala.Function1<org.apache.spark.sql.delta.DeltaLog, scala.runtime.BoxedUnit> preTxnSetup, scala.Function1<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> currentThreadReadOp, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> concurrentUpdateOp, scala.Function1<org.apache.spark.sql.delta.OptimisticTransaction, scala.runtime.BoxedUnit> currentThreadCommitOperation, boolean shouldFail, scala.collection.immutable.Map<java.lang.String, java.lang.String> confs, java.lang.String partitionTablePath)  ;
}
