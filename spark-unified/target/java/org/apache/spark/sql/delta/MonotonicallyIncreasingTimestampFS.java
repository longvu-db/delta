package org.apache.spark.sql.delta;
/**
 * A FileSystem implementation that returns monotonically increasing timestamps for file creation.
 * Note that we may return a different timestamp for the same file. This is okay for the tests
 * where we use this though.
 */
public  class MonotonicallyIncreasingTimestampFS extends org.apache.hadoop.fs.RawLocalFileSystem {
  static public  java.lang.String scheme ()  { throw new RuntimeException(); }
  public   MonotonicallyIncreasingTimestampFS ()  { throw new RuntimeException(); }
  public  java.lang.String getScheme ()  { throw new RuntimeException(); }
  public  java.net.URI getUri ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FileStatus getFileStatus (org.apache.hadoop.fs.Path f)  { throw new RuntimeException(); }
}
