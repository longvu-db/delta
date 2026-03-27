package org.apache.spark.sql.delta;
public  class DeltaTestUtils$ implements org.apache.spark.sql.delta.DeltaTestUtilsBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DeltaTestUtils$ MODULE$ = null;
  public  org.apache.spark.sql.delta.DeltaTestUtilsBase.ExpectedResult$ ExpectedResult ()  { throw new RuntimeException(); }
  public   DeltaTestUtils$ ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.sql.delta.actions.AddFile createTestAddFile (java.lang.String encodedPath, scala.collection.immutable.Map<java.lang.String, java.lang.String> partitionValues, long size, long modificationTime, boolean dataChange, java.lang.String stats)  { throw new RuntimeException(); }
  /**
   * Discovers all DeltaOperations.Operation subclasses using reflection.
   * Returns a Set of operation class names.
   * <p>
   * This is useful for tests that need to ensure exhaustive coverage of all operations.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Set<java.lang.String> getAllDeltaOperations ()  { throw new RuntimeException(); }
  /**
   * Extracts the table name and alias (if any) from the given string. Correctly handles whitespaces
   * in table name but doesn't support whitespaces in alias.
   * @param table (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<java.lang.String, scala.Option<java.lang.String>> parseTableAndAlias (java.lang.String table)  { throw new RuntimeException(); }
  public  void modifyCommitTimestamp (org.apache.spark.sql.delta.DeltaLog deltaLog, long version, long ts)  { throw new RuntimeException(); }
  public  void withTimeZone (java.lang.String zone, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
}
