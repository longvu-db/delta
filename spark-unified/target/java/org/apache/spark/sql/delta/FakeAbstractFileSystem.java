package org.apache.spark.sql.delta;
/**
 * A fake AbstractFileSystem to test whether session Hadoop configuration will be picked up.
 * This is a wrapper around {@link FakeFileSystem}.
 */
public  class FakeAbstractFileSystem extends org.apache.hadoop.fs.DelegateToFileSystem {
  public   FakeAbstractFileSystem (java.net.URI uri, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FsServerDefaults getServerDefaults ()  { throw new RuntimeException(); }
  public  int getUriDefaultPort ()  { throw new RuntimeException(); }
  public  boolean isValidName (java.lang.String src)  { throw new RuntimeException(); }
}
