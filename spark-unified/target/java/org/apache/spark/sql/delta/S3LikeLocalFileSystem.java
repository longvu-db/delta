package org.apache.spark.sql.delta;
/**
 * A local filesystem on scheme s3. Useful for testing paths on non-default schemes.
 */
public  class S3LikeLocalFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  public   S3LikeLocalFileSystem ()  { throw new RuntimeException(); }
  public  java.lang.String getScheme ()  { throw new RuntimeException(); }
  public  java.net.URI getUri ()  { throw new RuntimeException(); }
  public  void initialize (java.net.URI name, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
}
