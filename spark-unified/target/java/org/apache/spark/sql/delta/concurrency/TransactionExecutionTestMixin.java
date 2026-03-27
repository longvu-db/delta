package org.apache.spark.sql.delta.concurrency;
public  interface TransactionExecutionTestMixin {
  /**
   * Prepare and commit the transaction managed by the given observer.
   * @param observer (undocumented)
   */
  public  void prepareAndCommit (org.apache.spark.sql.delta.fuzzer.PhaseLockingTransactionExecutionObserver observer)  ;
  /**
   * Prepare and commit the transaction managed by the given observer.
   * If nextObserver is set, we need to manually call backfillPhase.leave() to advance to the
   * nextObserver. Details in {@link TransactionObserver.waitForCommitPhaseAndAdvanceToNextObserver}.
   * @param observer (undocumented)
   * @param hasNextObserver (undocumented)
   */
  public  void prepareAndCommitBase (org.apache.spark.sql.delta.fuzzer.PhaseLockingTransactionExecutionObserver observer, boolean hasNextObserver)  ;
  /**
   * Prepare and commit the transaction managed by the given observer which has nextObserver set.
   * @param observer (undocumented)
   */
  public  void prepareAndCommitWithNextObserverSet (org.apache.spark.sql.delta.fuzzer.PhaseLockingTransactionExecutionObserver observer)  ;
  /** Run a given function `fn` inside the given `executor` within a {@link TransactionObserver} */
    scala.Tuple2<org.apache.spark.sql.delta.fuzzer.PhaseLockingTransactionExecutionObserver, scala.concurrent.Future<org.apache.spark.sql.Row[]>> runFunctionWithObserver (java.lang.String name, java.util.concurrent.ExecutorService executorService, scala.Function0<org.apache.spark.sql.Row[]> fn)  ;
  /**
   * Run <code>functions</code> with the ordering defined by <code>observerOrdering</code> function.
   * This function returns futures for each of the query results.
   * @param functions (undocumented)
   * @param observerOrdering (undocumented)
   * @return (undocumented)
   */
    scala.collection.immutable.Seq<scala.concurrent.Future<org.apache.spark.sql.Row[]>> runFunctionsWithOrderingFromObserver (scala.collection.immutable.Seq<scala.Function0<org.apache.spark.sql.Row[]>> functions, scala.Function1<scala.collection.immutable.Seq<org.apache.spark.sql.delta.fuzzer.PhaseLockingTransactionExecutionObserver>, scala.runtime.BoxedUnit> observerOrdering)  ;
  /** Run a given `queryString` inside the given `executor` */
  public  scala.Tuple2<org.apache.spark.sql.delta.fuzzer.PhaseLockingTransactionExecutionObserver, scala.concurrent.Future<org.apache.spark.sql.Row[]>> runQueryWithObserver (java.lang.String name, java.util.concurrent.ExecutorService executor, java.lang.String queryString)  ;
  /**
   * Run 2 transactions A, B with following order:
   * <p>
   * t1 -------------------------------------- TxnA starts
   * t2 --------- TxnB starts
   * t3 --------- TxnB commits
   * t6 -------------------------------------- TxnA commits
   * <p>
   * This function returns futures for each of the query runs.
   * @param txnA (undocumented)
   * @param txnB (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<scala.concurrent.Future<org.apache.spark.sql.Row[]>, scala.concurrent.Future<org.apache.spark.sql.Row[]>> runTxnsWithOrder__A_Start__B__A_End (scala.Function0<org.apache.spark.sql.Row[]> txnA, scala.Function0<org.apache.spark.sql.Row[]> txnB)  ;
  /**
   * Run 2 transactions A, B with following order:
   * <p>
   * t1 -------------------------------------- TxnA starts
   * t2 --------- TxnB starts and commits (no transaction observer)
   * t6 -------------------------------------- TxnA commits
   * <p>
   * This function returns futures for each of the query runs.
   * @param txnA (undocumented)
   * @param txnB (undocumented)
   * @return (undocumented)
   */
  public  scala.concurrent.Future<org.apache.spark.sql.Row[]> runTxnsWithOrder__A_Start__B__A_end_without_observer_on_B (scala.Function0<org.apache.spark.sql.Row[]> txnA, scala.Function0<org.apache.spark.sql.Row[]> txnB)  ;
  /**
   * Run 3 queries A, B, C with following order:
   * <p>
   * t1 -------------------------------------- TxnA starts
   * t2 --------- TxnB starts
   * t3 --------- TxnB commits
   * t4 ----------------- TxnC starts
   * t5 ----------------- TxnC commits
   * t6 -------------------------------------- TxnA commits
   * <p>
   * This function returns futures for each of the query runs.
   * @param txnA (undocumented)
   * @param txnB (undocumented)
   * @param txnC (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple3<scala.concurrent.Future<org.apache.spark.sql.Row[]>, scala.concurrent.Future<org.apache.spark.sql.Row[]>, scala.concurrent.Future<org.apache.spark.sql.Row[]>> runTxnsWithOrder__A_Start__B__C__A_End (scala.Function0<org.apache.spark.sql.Row[]> txnA, scala.Function0<org.apache.spark.sql.Row[]> txnB, scala.Function0<org.apache.spark.sql.Row[]> txnC)  ;
  /**
   * Timeout used when waiting for individual phases of instrumented operations to complete.
   * @return (undocumented)
   */
  public  scala.concurrent.duration.FiniteDuration timeout ()  ;
  /** Unblocks all phases for {@link TransactionObserver} so that corresponding query can finish. */
  public  void unblockAllPhases (org.apache.spark.sql.delta.fuzzer.PhaseLockingTransactionExecutionObserver observer)  ;
  /**
   * Unblocks the <code>commitPhase</code> and <code>backfillPhase</code> for {@link TransactionObserver}.
   * @param observer (undocumented)
   */
  public  void unblockCommit (org.apache.spark.sql.delta.fuzzer.PhaseLockingTransactionExecutionObserver observer)  ;
  /** Unblocks all phases before the `commitPhase` for {@link TransactionObserver} */
  public  void unblockUntilPreCommit (org.apache.spark.sql.delta.fuzzer.PhaseLockingTransactionExecutionObserver observer)  ;
  public  void waitForCommit (org.apache.spark.sql.delta.fuzzer.PhaseLockingTransactionExecutionObserver observer)  ;
  public  void waitForPrecommit (org.apache.spark.sql.delta.fuzzer.PhaseLockingTransactionExecutionObserver observer)  ;
}
