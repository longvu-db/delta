package org.apache.spark.sql.delta;
/**
 * This custom fs implementation is used for testing the msync calling in HDFSLogStore writes.
 * If <code>msync</code> is not called, <code>listStatus</code> will return stale results.
 */
public  class TimestampLocalFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  static public  java.lang.String scheme ()  { throw new RuntimeException(); }
  public   TimestampLocalFileSystem ()  { throw new RuntimeException(); }
  public  java.lang.String getScheme ()  { throw new RuntimeException(); }
  public  void initialize (java.net.URI name, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  public  java.net.URI getUri ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FileStatus[] listStatus (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  void msync ()  { throw new RuntimeException(); }
}
