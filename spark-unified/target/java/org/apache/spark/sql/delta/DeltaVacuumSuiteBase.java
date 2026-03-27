package org.apache.spark.sql.delta;
public  interface DeltaVacuumSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.scalatest.GivenWhenThen, org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.DeletionVectorsTestUtils, org.apache.spark.sql.delta.DeltaTestUtilsForTempViews, org.apache.spark.sql.delta.coordinatedcommits.CatalogOwnedTestBaseSuite {
  /**
   * Write a file to the given absolute or relative path. Could be inside or outside the Reservoir
   * base path. The file can be committed to the action log to be tracked, or left out for deletion.
   */
  public  class CreateFile implements org.apache.spark.sql.delta.DeltaVacuumSuiteBase.Operation, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String path ()  { throw new RuntimeException(); }
    public  boolean commitToActionLog ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, java.lang.String> partitionValues ()  { throw new RuntimeException(); }
    // not preceding
    public   CreateFile (java.lang.String path, boolean commitToActionLog, scala.collection.immutable.Map<java.lang.String, java.lang.String> partitionValues)  { throw new RuntimeException(); }
  }
  public  class CreateFile$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.Object, scala.collection.immutable.Map<java.lang.String, java.lang.String>, org.apache.spark.sql.delta.DeltaVacuumSuiteBase.CreateFile> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CreateFile$ MODULE$ = null;
    public   CreateFile$ ()  { throw new RuntimeException(); }
  }
  /** Create a directory at the given path. */
  public  class CreateDirectory implements org.apache.spark.sql.delta.DeltaVacuumSuiteBase.Operation, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String path ()  { throw new RuntimeException(); }
    // not preceding
    public   CreateDirectory (java.lang.String path)  { throw new RuntimeException(); }
  }
  public  class CreateDirectory$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.delta.DeltaVacuumSuiteBase.CreateDirectory> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CreateDirectory$ MODULE$ = null;
    public   CreateDirectory$ ()  { throw new RuntimeException(); }
  }
  /**
   * Logically deletes a file in the action log. Paths can be absolute or relative paths, and can
   * point to files inside and outside a reservoir.
   */
  public  class LogicallyDeleteFile implements org.apache.spark.sql.delta.DeltaVacuumSuiteBase.Operation, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String path ()  { throw new RuntimeException(); }
    // not preceding
    public   LogicallyDeleteFile (java.lang.String path)  { throw new RuntimeException(); }
  }
  public  class LogicallyDeleteFile$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.delta.DeltaVacuumSuiteBase.LogicallyDeleteFile> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final LogicallyDeleteFile$ MODULE$ = null;
    public   LogicallyDeleteFile$ ()  { throw new RuntimeException(); }
  }
  /** Check that the given paths exist. */
  public  class CheckFiles implements org.apache.spark.sql.delta.DeltaVacuumSuiteBase.Operation, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<java.lang.String> paths ()  { throw new RuntimeException(); }
    public  boolean exist ()  { throw new RuntimeException(); }
    // not preceding
    public   CheckFiles (scala.collection.immutable.Seq<java.lang.String> paths, boolean exist)  { throw new RuntimeException(); }
  }
  public  class CheckFiles$ extends scala.runtime.AbstractFunction2<scala.collection.immutable.Seq<java.lang.String>, java.lang.Object, org.apache.spark.sql.delta.DeltaVacuumSuiteBase.CheckFiles> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CheckFiles$ MODULE$ = null;
    public   CheckFiles$ ()  { throw new RuntimeException(); }
  }
  /** Garbage collect the reservoir. */
  public  class GC implements org.apache.spark.sql.delta.DeltaVacuumSuiteBase.Operation, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  boolean dryRun ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<java.lang.String> expectedDf ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> retentionHours ()  { throw new RuntimeException(); }
    // not preceding
    public   GC (boolean dryRun, scala.collection.immutable.Seq<java.lang.String> expectedDf, scala.Option<java.lang.Object> retentionHours)  { throw new RuntimeException(); }
  }
  public  class GC$ extends scala.runtime.AbstractFunction3<java.lang.Object, scala.collection.immutable.Seq<java.lang.String>, scala.Option<java.lang.Object>, org.apache.spark.sql.delta.DeltaVacuumSuiteBase.GC> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GC$ MODULE$ = null;
    public   GC$ ()  { throw new RuntimeException(); }
  }
  public  class GCByInventory implements org.apache.spark.sql.delta.DeltaVacuumSuiteBase.Operation, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  boolean dryRun ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<java.lang.String> expectedDf ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> retentionHours ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> inventory ()  { throw new RuntimeException(); }
    // not preceding
    public   GCByInventory (boolean dryRun, scala.collection.immutable.Seq<java.lang.String> expectedDf, scala.Option<java.lang.Object> retentionHours, scala.Option<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> inventory)  { throw new RuntimeException(); }
  }
  public  class GCByInventory$ extends scala.runtime.AbstractFunction4<java.lang.Object, scala.collection.immutable.Seq<java.lang.String>, scala.Option<java.lang.Object>, scala.Option<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>>, org.apache.spark.sql.delta.DeltaVacuumSuiteBase.GCByInventory> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GCByInventory$ MODULE$ = null;
    public   GCByInventory$ ()  { throw new RuntimeException(); }
  }
  /** Garbage collect the reservoir. */
  public  class ExecuteVacuumInScala implements org.apache.spark.sql.delta.DeltaVacuumSuiteBase.Operation, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  io.delta.tables.DeltaTable deltaTable ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<java.lang.String> expectedDf ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> retentionHours ()  { throw new RuntimeException(); }
    // not preceding
    public   ExecuteVacuumInScala (io.delta.tables.DeltaTable deltaTable, scala.collection.immutable.Seq<java.lang.String> expectedDf, scala.Option<java.lang.Object> retentionHours)  { throw new RuntimeException(); }
  }
  public  class ExecuteVacuumInScala$ extends scala.runtime.AbstractFunction3<io.delta.tables.DeltaTable, scala.collection.immutable.Seq<java.lang.String>, scala.Option<java.lang.Object>, org.apache.spark.sql.delta.DeltaVacuumSuiteBase.ExecuteVacuumInScala> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExecuteVacuumInScala$ MODULE$ = null;
    public   ExecuteVacuumInScala$ ()  { throw new RuntimeException(); }
  }
  /** Advance the time. */
  public  class AdvanceClock implements org.apache.spark.sql.delta.DeltaVacuumSuiteBase.Operation, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  long timeToAdd ()  { throw new RuntimeException(); }
    // not preceding
    public   AdvanceClock (long timeToAdd)  { throw new RuntimeException(); }
  }
  public  class AdvanceClock$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.sql.delta.DeltaVacuumSuiteBase.AdvanceClock> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AdvanceClock$ MODULE$ = null;
    public   AdvanceClock$ ()  { throw new RuntimeException(); }
  }
  /** Execute SQL command */
  public  class ExecuteVacuumInSQL implements org.apache.spark.sql.delta.DeltaVacuumSuiteBase.Operation, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String identifier ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<java.lang.String> expectedDf ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> retentionHours ()  { throw new RuntimeException(); }
    public  boolean dryRun ()  { throw new RuntimeException(); }
    // not preceding
    public   ExecuteVacuumInSQL (java.lang.String identifier, scala.collection.immutable.Seq<java.lang.String> expectedDf, scala.Option<java.lang.Object> retentionHours, boolean dryRun)  { throw new RuntimeException(); }
    public  java.lang.String sql ()  { throw new RuntimeException(); }
  }
  public  class ExecuteVacuumInSQL$ extends scala.runtime.AbstractFunction4<java.lang.String, scala.collection.immutable.Seq<java.lang.String>, scala.Option<java.lang.Object>, java.lang.Object, org.apache.spark.sql.delta.DeltaVacuumSuiteBase.ExecuteVacuumInSQL> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExecuteVacuumInSQL$ MODULE$ = null;
    public   ExecuteVacuumInSQL$ ()  { throw new RuntimeException(); }
  }
  /**
   * Expect a failure with the given exception type. Expect the given <code>msg</code> fragments as the error
   * message.
   */
  public  class ExpectFailure<T extends java.lang.Throwable> implements org.apache.spark.sql.delta.DeltaVacuumSuiteBase.Operation, scala.Product, java.io.Serializable {
    public  org.apache.spark.sql.delta.DeltaVacuumSuiteBase.Operation action ()  { throw new RuntimeException(); }
    public  java.lang.Class<T> expectedError ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<java.lang.String> msg ()  { throw new RuntimeException(); }
    // not preceding
    public   ExpectFailure (org.apache.spark.sql.delta.DeltaVacuumSuiteBase.Operation action, java.lang.Class<T> expectedError, scala.collection.immutable.Seq<java.lang.String> msg)  { throw new RuntimeException(); }
  }
  public  class ExpectFailure$ implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExpectFailure$ MODULE$ = null;
    public   ExpectFailure$ ()  { throw new RuntimeException(); }
  }
  public  interface Operation {
  }
  public  java.lang.String RANDOM_FILE_CONTENT ()  ;
  public  void assertNumFiles (org.apache.spark.sql.delta.DeltaLog deltaLog, int addFiles, int addFilesWithDVs, int dvFiles, int dataFiles)  ;
  public  org.apache.spark.sql.delta.actions.AddFile createFile (java.lang.String reservoirBase, java.lang.String filePath, java.io.File file, org.apache.spark.util.ManualClock clock, scala.collection.immutable.Map<java.lang.String, java.lang.String> partitionValues)  ;
  public  long defaultTombstoneInterval ()  ;
  public  boolean deleteCommitFile (org.apache.spark.sql.delta.catalog.DeltaTableV2 table, long version)  ;
  public  void executeWithEnvironment (java.io.File file, scala.Function2<java.io.File, org.apache.spark.util.ManualClock, scala.runtime.BoxedUnit> f)  ;
  public  java.lang.String fileToPathString (java.io.File f)  ;
  public  void gcTest (org.apache.spark.sql.delta.catalog.DeltaTableV2 table, org.apache.spark.util.ManualClock clock, scala.collection.immutable.Seq<org.apache.spark.sql.delta.DeltaVacuumSuiteBase.Operation> actions)  ;
  /**
   * Helper method to get all of the {@link AddCDCFile}s that exist in the delta table
   * @param deltaLog (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.AddCDCFile> getCDCFiles (org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  public  boolean isLiteVacuum ()  ;
  /** Lists the data files in a given dir recursively. */
  public  scala.collection.immutable.Seq<java.lang.String> listDataFiles (org.apache.spark.sql.SparkSession spark, java.lang.String tableDir)  ;
  /**
   * Helper method to tell us if the given filePath exists. Thus, it can be used to detect if a
   * file has been deleted.
   * @param deltaLog (undocumented)
   * @param filePath (undocumented)
   * @return (undocumented)
   */
  public  boolean pathExists (org.apache.spark.sql.delta.DeltaLog deltaLog, java.lang.String filePath)  ;
  public  boolean setCommitClock (org.apache.spark.sql.delta.catalog.DeltaTableV2 table, long version, org.apache.spark.util.ManualClock clock)  ;
  public  void testCDCVacuumForTombstones ()  ;
  public  void testCDCVacuumForUpdateMerge ()  ;
  public  void testFullVacuumOnly (java.lang.String testName, scala.collection.immutable.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun)  ;
  public  void vacuumSQLTest (org.apache.spark.sql.delta.catalog.DeltaTableV2 table, java.lang.String tableName)  ;
  public  void vacuumScalaTest (io.delta.tables.DeltaTable deltaTable, java.lang.String tablePath)  ;
  public  void withEnvironment (scala.Function2<java.io.File, org.apache.spark.util.ManualClock, scala.runtime.BoxedUnit> f)  ;
  public  void withEnvironment (java.lang.String prefix, scala.Function2<java.io.File, org.apache.spark.util.ManualClock, scala.runtime.BoxedUnit> f)  ;
}
