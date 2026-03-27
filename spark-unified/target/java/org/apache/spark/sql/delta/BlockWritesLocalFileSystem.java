package org.apache.spark.sql.delta;
/**
 * This custom fs implementation is used for testing the execution multiple batches of Optimize.
 */
public  class BlockWritesLocalFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  static public  java.lang.String scheme ()  { throw new RuntimeException(); }
  /**
   * @param numWrites - writing is blocked until there are <code>numWrites</code> concurrent writes to
   *                  the file system.
   */
  static public  void blockUntilConcurrentWrites (java.lang.Integer numWrites)  { throw new RuntimeException(); }
  public   BlockWritesLocalFileSystem ()  { throw new RuntimeException(); }
  public  java.lang.String getScheme ()  { throw new RuntimeException(); }
  public  void initialize (java.net.URI name, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  public  java.net.URI getUri ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path f, boolean overwrite, int bufferSize, short replication, long blockSize, org.apache.hadoop.util.Progressable progress)  { throw new RuntimeException(); }
}
