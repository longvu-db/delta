package org.apache.spark.sql.delta;
public  interface ConflictResolutionTestUtils extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.concurrency.PhaseLockingTestMixin, org.apache.spark.sql.delta.concurrency.TransactionExecutionTestMixin, org.apache.spark.sql.delta.DeletionVectorsTestUtils, org.apache.spark.sql.delta.rowid.RowIdTestUtils {
  public abstract class TestTransaction {
    public   TestTransaction (scala.collection.immutable.Map<java.lang.String, java.lang.String> sqlConf)  { throw new RuntimeException(); }
    public abstract  java.lang.String name ()  ;
    public  java.lang.String sqlConfStr ()  { throw new RuntimeException(); }
    public abstract  java.lang.String toSQL (java.lang.String tableName)  ;
    public  void execute (org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestContext ctx)  { throw new RuntimeException(); }
    public  void executeImpl (org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestContext ctx)  { throw new RuntimeException(); }
    /** Whether this transaction is committing data change actions. */
    public abstract  boolean dataChange ()  ;
    /** Whether writing Deletion Vectors is enabled for this transaction. */
    public  boolean deletionVectorsEnabled (org.apache.spark.sql.delta.DeltaLog deltaLog)  { throw new RuntimeException(); }
    /** The transaction observer to step through the transaction phases. */
    public  scala.Option<org.apache.spark.sql.delta.fuzzer.PhaseLockingTransactionExecutionObserver> observer ()  { throw new RuntimeException(); }
    /** Start transaction and unblock until precommit. */
    public  void start (org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestContext ctx)  { throw new RuntimeException(); }
    /** Commit the transaction. */
    public  void commit (org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestContext ctx)  { throw new RuntimeException(); }
    /** Run transaction and interleave fn() while transaction is stopped in precommit. */
    public <T extends java.lang.Object> void interleave (org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestContext ctx, scala.Function0<scala.runtime.BoxedUnit> fn)  { throw new RuntimeException(); }
  }
  public  class TestTransaction$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TestTransaction$ MODULE$ = null;
    public   TestTransaction$ ()  { throw new RuntimeException(); }
  }
  public  class Insert extends org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<java.lang.Object> rows ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> partitionColumn ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, java.lang.String> sqlConf ()  { throw new RuntimeException(); }
    // not preceding
    public   Insert (scala.collection.immutable.Seq<java.lang.Object> rows, scala.Option<java.lang.Object> partitionColumn, scala.collection.immutable.Map<java.lang.String, java.lang.String> sqlConf)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  java.lang.String toSQL (java.lang.String tableName)  { throw new RuntimeException(); }
    public  void executeImpl (org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestContext ctx)  { throw new RuntimeException(); }
    public  boolean dataChange ()  { throw new RuntimeException(); }
  }
  public  class Insert$ extends scala.runtime.AbstractFunction3<scala.collection.immutable.Seq<java.lang.Object>, scala.Option<java.lang.Object>, scala.collection.immutable.Map<java.lang.String, java.lang.String>, org.apache.spark.sql.delta.ConflictResolutionTestUtils.Insert> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Insert$ MODULE$ = null;
    public   Insert$ ()  { throw new RuntimeException(); }
  }
  public  class Delete extends org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<java.lang.Object> rows ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, java.lang.String> sqlConf ()  { throw new RuntimeException(); }
    // not preceding
    public   Delete (scala.collection.immutable.Seq<java.lang.Object> rows, scala.collection.immutable.Map<java.lang.String, java.lang.String> sqlConf)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  java.lang.String toSQL (java.lang.String tableName)  { throw new RuntimeException(); }
    public  boolean dataChange ()  { throw new RuntimeException(); }
    public  boolean deletionVectorsEnabled (org.apache.spark.sql.delta.DeltaLog deltaLog)  { throw new RuntimeException(); }
  }
  public  class Delete$ extends scala.runtime.AbstractFunction2<scala.collection.immutable.Seq<java.lang.Object>, scala.collection.immutable.Map<java.lang.String, java.lang.String>, org.apache.spark.sql.delta.ConflictResolutionTestUtils.Delete> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Delete$ MODULE$ = null;
    public   Delete$ ()  { throw new RuntimeException(); }
  }
  public  class Update extends org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<java.lang.Object> rows ()  { throw new RuntimeException(); }
    public  long setValue ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, java.lang.String> sqlConf ()  { throw new RuntimeException(); }
    // not preceding
    public   Update (scala.collection.immutable.Seq<java.lang.Object> rows, long setValue, scala.collection.immutable.Map<java.lang.String, java.lang.String> sqlConf)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  java.lang.String toSQL (java.lang.String tableName)  { throw new RuntimeException(); }
    public  boolean dataChange ()  { throw new RuntimeException(); }
    public  boolean deletionVectorsEnabled (org.apache.spark.sql.delta.DeltaLog deltaLog)  { throw new RuntimeException(); }
  }
  public  class Update$ extends scala.runtime.AbstractFunction3<scala.collection.immutable.Seq<java.lang.Object>, java.lang.Object, scala.collection.immutable.Map<java.lang.String, java.lang.String>, org.apache.spark.sql.delta.ConflictResolutionTestUtils.Update> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Update$ MODULE$ = null;
    public   Update$ ()  { throw new RuntimeException(); }
  }
  public  class Merge extends org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<java.lang.Object> deleteRows ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, java.lang.String> sqlConf ()  { throw new RuntimeException(); }
    // not preceding
    public   Merge (scala.collection.immutable.Seq<java.lang.Object> deleteRows, scala.collection.immutable.Map<java.lang.String, java.lang.String> sqlConf)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  java.lang.String toSQL (java.lang.String tableName)  { throw new RuntimeException(); }
    public  boolean dataChange ()  { throw new RuntimeException(); }
    public  boolean deletionVectorsEnabled (org.apache.spark.sql.delta.DeltaLog deltaLog)  { throw new RuntimeException(); }
  }
  public  class Merge$ extends scala.runtime.AbstractFunction2<scala.collection.immutable.Seq<java.lang.Object>, scala.collection.immutable.Map<java.lang.String, java.lang.String>, org.apache.spark.sql.delta.ConflictResolutionTestUtils.Merge> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Merge$ MODULE$ = null;
    public   Merge$ ()  { throw new RuntimeException(); }
  }
  /**
   * Helper class containing the Delta log and committed transactions of a test.
   */
  public  class TestContext {
    // not preceding
    public   TestContext (org.apache.spark.sql.delta.DeltaLog deltaLog)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.DeltaLog deltaLog ()  { throw new RuntimeException(); }
    public  io.delta.tables.DeltaTable deltaTable ()  { throw new RuntimeException(); }
    /** Returns the transactions that successfully committed. */
    public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction> getCommittedTransactions ()  { throw new RuntimeException(); }
    /** The version of the Delta table after writing the initial data. */
    public  long initialVersion ()  { throw new RuntimeException(); }
    /** Execute fn() and record the transaction if it successfully created a commit. */
    public  void trackTransaction (org.apache.spark.sql.delta.ConflictResolutionTestUtils.TestTransaction transaction, scala.Function0<scala.runtime.BoxedUnit> fn)  { throw new RuntimeException(); }
  }
  public  java.lang.String ID_COLUMN ()  ;
  public  java.lang.String PARTITION_COLUMN ()  ;
  public  java.lang.String abbreviate (java.lang.String str, java.lang.String abbrevMarker, int len)  ;
  public  scala.concurrent.duration.FiniteDuration timeout ()  ;
}
