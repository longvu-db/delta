package org.apache.spark.sql.delta;
public  class DeltaTestUtils {
  static public  interface TableIdentifierOrPath {
  }
  static public  class TableIdentifierOrPath$ {
    static public  class Identifier implements org.apache.spark.sql.delta.DeltaTestUtils.TableIdentifierOrPath, scala.Product, java.io.Serializable {
      public  org.apache.spark.sql.catalyst.TableIdentifier id ()  { throw new RuntimeException(); }
      public  scala.Option<java.lang.String> alias ()  { throw new RuntimeException(); }
      // not preceding
      public   Identifier (org.apache.spark.sql.catalyst.TableIdentifier id, scala.Option<java.lang.String> alias)  { throw new RuntimeException(); }
    }
    static public  class Identifier$ extends scala.runtime.AbstractFunction2<org.apache.spark.sql.catalyst.TableIdentifier, scala.Option<java.lang.String>, org.apache.spark.sql.delta.DeltaTestUtils.TableIdentifierOrPath.Identifier> implements java.io.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final Identifier$ MODULE$ = null;
      public   Identifier$ ()  { throw new RuntimeException(); }
    }
    static public  class Path implements org.apache.spark.sql.delta.DeltaTestUtils.TableIdentifierOrPath, scala.Product, java.io.Serializable {
      public  java.lang.String path ()  { throw new RuntimeException(); }
      public  scala.Option<java.lang.String> alias ()  { throw new RuntimeException(); }
      // not preceding
      public   Path (java.lang.String path, scala.Option<java.lang.String> alias)  { throw new RuntimeException(); }
    }
    static public  class Path$ extends scala.runtime.AbstractFunction2<java.lang.String, scala.Option<java.lang.String>, org.apache.spark.sql.delta.DeltaTestUtils.TableIdentifierOrPath.Path> implements java.io.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final Path$ MODULE$ = null;
      public   Path$ ()  { throw new RuntimeException(); }
    }
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TableIdentifierOrPath$ MODULE$ = null;
    public   TableIdentifierOrPath$ ()  { throw new RuntimeException(); }
  }
  static public  class Plans implements scala.Product, java.io.Serializable {
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan analyzed ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan optimized ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.SparkPlan sparkPlan ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.SparkPlan executedPlan ()  { throw new RuntimeException(); }
    // not preceding
    public   Plans (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan analyzed, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan optimized, org.apache.spark.sql.execution.SparkPlan sparkPlan, org.apache.spark.sql.execution.SparkPlan executedPlan)  { throw new RuntimeException(); }
  }
  static public  class Plans$ extends scala.runtime.AbstractFunction4<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.execution.SparkPlan, org.apache.spark.sql.execution.SparkPlan, org.apache.spark.sql.delta.DeltaTestUtils.Plans> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Plans$ MODULE$ = null;
    public   Plans$ ()  { throw new RuntimeException(); }
  }
  /**
   * Implements an ordering where <code>x < y</code> iff both reader and writer versions of
   * <code>x</code> are strictly less than those of <code>y</code>.
   * <p>
   * Can be used to conveniently check that this relationship holds in tests/assertions
   * without having to write out the conjunction of the two subconditions every time.
   */
  static public  class StrictProtocolOrdering$ implements scala.math.PartialOrdering<org.apache.spark.sql.delta.actions.Protocol>, scala.Product, java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StrictProtocolOrdering$ MODULE$ = null;
    public   StrictProtocolOrdering$ ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> tryCompare (org.apache.spark.sql.delta.actions.Protocol x, org.apache.spark.sql.delta.actions.Protocol y)  { throw new RuntimeException(); }
    public  boolean lteq (org.apache.spark.sql.delta.actions.Protocol x, org.apache.spark.sql.delta.actions.Protocol y)  { throw new RuntimeException(); }
    public  boolean fulfillsVersionRequirements (org.apache.spark.sql.delta.actions.Protocol actual, org.apache.spark.sql.delta.actions.Protocol requirement)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.sql.delta.DeltaTestUtilsBase.ExpectedResult$ ExpectedResult ()  { throw new RuntimeException(); }
  /**
   * Creates an AddFile that can be used for tests where the exact parameters do not matter.
   * @param encodedPath (undocumented)
   * @param partitionValues (undocumented)
   * @param size (undocumented)
   * @param modificationTime (undocumented)
   * @param dataChange (undocumented)
   * @param stats (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.delta.actions.AddFile createTestAddFile (java.lang.String encodedPath, scala.collection.immutable.Map<java.lang.String, java.lang.String> partitionValues, long size, long modificationTime, boolean dataChange, java.lang.String stats)  { throw new RuntimeException(); }
  /**
   * Discovers all DeltaOperations.Operation subclasses using reflection.
   * Returns a Set of operation class names.
   * <p>
   * This is useful for tests that need to ensure exhaustive coverage of all operations.
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Set<java.lang.String> getAllDeltaOperations ()  { throw new RuntimeException(); }
  /**
   * Extracts the table name and alias (if any) from the given string. Correctly handles whitespaces
   * in table name but doesn't support whitespaces in alias.
   * @param table (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple2<java.lang.String, scala.Option<java.lang.String>> parseTableAndAlias (java.lang.String table)  { throw new RuntimeException(); }
  static public  void modifyCommitTimestamp (org.apache.spark.sql.delta.DeltaLog deltaLog, long version, long ts)  { throw new RuntimeException(); }
  static public  void withTimeZone (java.lang.String zone, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public final  scala.collection.immutable.Seq<java.lang.Object> BOOLEAN_DOMAIN ()  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.collection.immutable.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> withLogicalPlansCaptured (org.apache.spark.sql.SparkSession spark, boolean optimizedPlan, scala.Function0<scala.runtime.BoxedUnit> thunk)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.collection.immutable.Seq<org.apache.spark.sql.execution.SparkPlan> withPhysicalPlansCaptured (org.apache.spark.sql.SparkSession spark, scala.Function0<scala.runtime.BoxedUnit> thunk)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.collection.immutable.Seq<org.apache.spark.sql.delta.DeltaTestUtils.Plans> withAllPlansCaptured (org.apache.spark.sql.SparkSession spark, scala.Function0<scala.runtime.BoxedUnit> thunk)  { throw new RuntimeException(); }
  static public  int countSparkJobs (org.apache.spark.SparkContext sc, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> filterUsageRecords (scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> usageRecords, java.lang.String opType)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<com.databricks.spark.util.UsageRecord> collectUsageLogs (java.lang.String opType, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void removeProtocolAndMetadataFromChecksumFile (org.apache.hadoop.fs.Path checksumFilePath)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.SparkPlan getfindTouchedFilesJobPlans (scala.collection.immutable.Seq<org.apache.spark.sql.delta.DeltaTestUtils.Plans> plans)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.delta.DeltaTestUtils.TableIdentifierOrPath getTableIdentifierOrPath (java.lang.String sqlIdentifier)  { throw new RuntimeException(); }
  static public  io.delta.tables.DeltaTable getDeltaTableForIdentifierOrPath (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.DeltaTestUtils.TableIdentifierOrPath identifierOrPath)  { throw new RuntimeException(); }
  static protected  void errorContains (java.lang.String errMsg, java.lang.String str)  { throw new RuntimeException(); }
  static public <E extends java.lang.Throwable> scala.Option<E> findIfResponsible (java.lang.Throwable e, scala.reflect.ClassTag<E> evidence$1)  { throw new RuntimeException(); }
  static public  void verifyBackfilled (org.apache.hadoop.fs.FileStatus file)  { throw new RuntimeException(); }
  static public  void verifyUnbackfilled (org.apache.hadoop.fs.FileStatus file)  { throw new RuntimeException(); }
}
