package org.apache.spark.sql.delta;
public  class MockS3FileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  public   MockS3FileSystem ()  { throw new RuntimeException(); }
  public  java.lang.String getScheme ()  { throw new RuntimeException(); }
  public  java.net.URI getUri ()  { throw new RuntimeException(); }
}
