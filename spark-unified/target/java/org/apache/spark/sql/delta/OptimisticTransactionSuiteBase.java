package org.apache.spark.sql.delta;
public  interface OptimisticTransactionSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.DeltaTestUtilsBase, org.apache.spark.sql.delta.DeletionVectorsTestUtils {
  public  scala.Tuple2<org.apache.spark.sql.delta.actions.AddFile, org.apache.spark.sql.delta.actions.RemoveFile> addDVToFileInTable (java.lang.String path, org.apache.spark.sql.delta.actions.AddFile file)  ;
  /**
   * Check whether the test transaction conflict with the concurrent writes by executing the
   * given params in the following order:
   *  - setup (including setting table isolation level
   *  - reads
   *  - concurrentWrites
   *  - actions
   * <p>
   * When <code>conflicts</code> == true, this function checks to make sure the commit of <code>actions</code> fails with
   * {@link ConcurrentModificationException}, otherwise checks that the commit is successful.
   * <p>
   * @param name                test name
   * @param conflicts           should test transaction is expected to conflict or not
   * @param setup               sets up the initial delta log state (set schema, partitioning, etc.)
   * @param reads               reads made in the test transaction
   * @param concurrentWrites    writes made by concurrent transactions after the test txn reads
   * @param actions             actions to be committed by the test transaction
   * @param expectedErrorClass  Expected error class for the exception
   * @param expectedErrorMessageParameters Expected parameter map for error message validation
   * @param exceptionClass      A substring to expect in the exception class name
   */
  public  void check (java.lang.String name, boolean conflicts, scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.Action> setup, scala.collection.immutable.Seq<scala.Function1<org.apache.spark.sql.delta.OptimisticTransaction, scala.runtime.BoxedUnit>> reads, scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.Action> concurrentWrites, scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.Action> actions, scala.Option<java.lang.String> expectedErrorClass, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> expectedErrorMessageParameters, scala.Option<java.lang.String> exceptionClass)  ;
  /**
   * Check whether the test transaction conflict with the concurrent writes by executing the
   * given params in the following order:
   *  - sets up the initial delta log state using <code>initialSetup</code> (set schema, partitioning, etc.)
   *  - reads
   *  - concurrentWrites
   *  - actions
   * <p>
   * When <code>conflicts</code> == true, this function checks to make sure the commit of <code>actions</code> fails with
   * {@link ConcurrentModificationException}, otherwise checks that the commit is successful.
   * <p>
   * @param name                test name
   * @param conflicts           should test transaction is expected to conflict or not
   * @param initialSetup        sets up the initial delta log state (set schema, partitioning, etc.)
   * @param reads               reads made in the test transaction
   * @param concurrentTxns      concurrent txns that may write data after the test txn reads
   * @param actions             actions to be committed by the test transaction
   * @param expectedErrorClass  Expected error class for the exception
   * @param expectedErrorMessageParameters Expected parameter map for error message validation
   * @param exceptionClass      A substring to expect in the exception class name
   * @param operation (undocumented)
   * @param additionalSQLConfs (undocumented)
   */
  public  void check (java.lang.String name, boolean conflicts, scala.Function1<org.apache.spark.sql.delta.DeltaLog, scala.runtime.BoxedUnit> initialSetup, scala.collection.immutable.Seq<scala.Function1<org.apache.spark.sql.delta.OptimisticTransaction, scala.runtime.BoxedUnit>> reads, scala.collection.immutable.Seq<scala.Function1<org.apache.spark.sql.delta.OptimisticTransaction, scala.runtime.BoxedUnit>> concurrentTxns, scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.Action> actions, org.apache.spark.sql.delta.DeltaOperations.Operation operation, scala.Option<java.lang.String> expectedErrorClass, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> expectedErrorMessageParameters, scala.Option<java.lang.String> exceptionClass, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> additionalSQLConfs)  ;
  public  void testRuntimeErrorOnCommit (scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.FileAction> actions, org.apache.spark.sql.delta.DeltaLog deltaLog, scala.Function1<org.apache.spark.sql.delta.DeltaRuntimeException, scala.runtime.BoxedUnit> checkErrorFun)  ;
  /**
   * Write 3 files at target path and return AddFiles.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.AddFile> writeDuplicateActionsData (java.lang.String path)  ;
}
