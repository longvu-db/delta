package org.apache.spark.sql.delta;
/**
 * Singleton for BlockWritesLocalFileSystem used to initialize the file system countdown latch.
 */
public  class BlockWritesLocalFileSystem$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BlockWritesLocalFileSystem$ MODULE$ = null;
  public   BlockWritesLocalFileSystem$ ()  { throw new RuntimeException(); }
  public  java.lang.String scheme ()  { throw new RuntimeException(); }
  /**
   * @param numWrites - writing is blocked until there are <code>numWrites</code> concurrent writes to
   *                  the file system.
   */
  public  void blockUntilConcurrentWrites (java.lang.Integer numWrites)  { throw new RuntimeException(); }
}
