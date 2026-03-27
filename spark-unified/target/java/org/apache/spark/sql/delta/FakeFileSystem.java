package org.apache.spark.sql.delta;
/** A fake file system to test whether session Hadoop configuration will be picked up. */
public  class FakeFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  static public  java.lang.String scheme ()  { throw new RuntimeException(); }
  static public  java.net.URI uri ()  { throw new RuntimeException(); }
  public   FakeFileSystem ()  { throw new RuntimeException(); }
  public  java.lang.String getScheme ()  { throw new RuntimeException(); }
  public  java.net.URI getUri ()  { throw new RuntimeException(); }
}
