package org.apache.spark.sql.delta;
/** A fake file system to test whether GCSLogStore properly handles precondition failures. */
public  class FailingGCSFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  public   FailingGCSFileSystem ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path f, boolean overwrite)  { throw new RuntimeException(); }
  public  java.lang.String getScheme ()  { throw new RuntimeException(); }
  public  java.net.URI getUri ()  { throw new RuntimeException(); }
}
