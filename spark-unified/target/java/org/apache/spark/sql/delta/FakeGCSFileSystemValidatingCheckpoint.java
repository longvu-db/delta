package org.apache.spark.sql.delta;
/** A fake GCS file system to verify delta checkpoints are written in a separate gcs thread. */
public  class FakeGCSFileSystemValidatingCheckpoint extends org.apache.hadoop.fs.RawLocalFileSystem {
  public   FakeGCSFileSystemValidatingCheckpoint ()  { throw new RuntimeException(); }
  protected  void assertGCSThread (org.apache.hadoop.fs.Path f)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path f, org.apache.hadoop.fs.permission.FsPermission permission, boolean overwrite, int bufferSize, short replication, long blockSize, org.apache.hadoop.util.Progressable progress)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path f, boolean overwrite, int bufferSize, short replication, long blockSize, org.apache.hadoop.util.Progressable progress)  { throw new RuntimeException(); }
  public  java.lang.String getScheme ()  { throw new RuntimeException(); }
  public  java.net.URI getUri ()  { throw new RuntimeException(); }
  protected  boolean shouldValidateFilePattern (org.apache.hadoop.fs.Path f)  { throw new RuntimeException(); }
}
