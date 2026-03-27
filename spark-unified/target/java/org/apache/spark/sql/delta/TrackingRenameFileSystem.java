package org.apache.spark.sql.delta;
/**
 * A file system allowing to track how many times <code>rename</code> is called.
 * <code>TrackingRenameFileSystem.numOfRename</code> should be reset to 0 before starting to trace.
 */
public  class TrackingRenameFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  static public  java.util.concurrent.atomic.AtomicInteger renameCounter ()  { throw new RuntimeException(); }
  static public  void resetCounter ()  { throw new RuntimeException(); }
  public   TrackingRenameFileSystem ()  { throw new RuntimeException(); }
  public  boolean rename (org.apache.hadoop.fs.Path src, org.apache.hadoop.fs.Path dst)  { throw new RuntimeException(); }
}
