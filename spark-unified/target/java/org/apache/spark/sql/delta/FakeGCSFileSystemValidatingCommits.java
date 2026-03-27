package org.apache.spark.sql.delta;
/** A fake GCS file system to verify delta commits are written in a separate gcs thread. */
public  class FakeGCSFileSystemValidatingCommits extends org.apache.spark.sql.delta.FakeGCSFileSystemValidatingCheckpoint {
  public   FakeGCSFileSystemValidatingCommits ()  { throw new RuntimeException(); }
  protected  boolean shouldValidateFilePattern (org.apache.hadoop.fs.Path f)  { throw new RuntimeException(); }
}
