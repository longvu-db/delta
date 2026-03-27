package org.apache.spark.sql.delta;
/**
 * A fake AbstractFileSystem to ensure FileSystem.renameInternal(), and thus FileContext.rename(),
 * fails. This will be used to test HDFSLogStore.writeInternal corner case.
 */
public  class FailingRenameAbstractFileSystem extends org.apache.spark.sql.delta.FakeAbstractFileSystem {
  public   FailingRenameAbstractFileSystem (java.net.URI uri, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  public  void renameInternal (org.apache.hadoop.fs.Path src, org.apache.hadoop.fs.Path dst, boolean overwrite)  { throw new RuntimeException(); }
}
