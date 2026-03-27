package org.apache.spark.sql.delta;
public  class InCommitTimestampTestUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final InCommitTimestampTestUtils$ MODULE$ = null;
  public   InCommitTimestampTestUtils$ ()  { throw new RuntimeException(); }
  /**
   * Overwrites the in-commit-timestamp in the delta file with the given timestamp.
   * It will also set operationParameters to an empty map because operationParameters
   * serialization/deserialization is broken.
   * @param deltaLog (undocumented)
   * @param filePath (undocumented)
   * @param ts (undocumented)
   */
  public  void overwriteICTInDeltaFile (org.apache.spark.sql.delta.DeltaLog deltaLog, org.apache.hadoop.fs.Path filePath, scala.Option<java.lang.Object> ts)  { throw new RuntimeException(); }
  /**
   * Overwrites the in-commit-timestamp in the given CRC file with the given timestamp.
   * @param deltaLog (undocumented)
   * @param version (undocumented)
   * @param ts (undocumented)
   */
  public  void overwriteICTInCrc (org.apache.spark.sql.delta.DeltaLog deltaLog, long version, scala.Option<java.lang.Object> ts)  { throw new RuntimeException(); }
  /**
   * Retrieves the in-commit timestamp for a specific version of the Delta Log.
   * @param deltaLog (undocumented)
   * @param version (undocumented)
   * @return (undocumented)
   */
  public  long getInCommitTimestamp (org.apache.spark.sql.delta.DeltaLog deltaLog, long version)  { throw new RuntimeException(); }
  /**
   * Retrieves a map of file modification times for Delta Log versions within a specified version
   * range.
   * @param deltaLog (undocumented)
   * @param start (undocumented)
   * @param end (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> getFileModificationTimesMap (org.apache.spark.sql.delta.DeltaLog deltaLog, long start, long end)  { throw new RuntimeException(); }
}
