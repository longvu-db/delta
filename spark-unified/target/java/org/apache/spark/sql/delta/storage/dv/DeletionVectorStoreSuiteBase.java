package org.apache.spark.sql.delta.storage.dv;
public  interface DeletionVectorStoreSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  /** Helper to method to simulate data corruption in on-disk DV */
  public  void corruptByte (org.apache.spark.sql.delta.util.PathWithFileSystem pathWithFS, int byteToCorrupt)  ;
  public  org.apache.spark.sql.delta.storage.dv.DeletionVectorStore dvStore ()  ;
  public  org.apache.hadoop.conf.Configuration newHadoopConf ()  ;
  public  org.apache.spark.sql.delta.deletionvectors.RoaringBitmapArray simpleBitmap ()  ;
  public  org.apache.spark.sql.delta.deletionvectors.RoaringBitmapArray simpleBitmap2 ()  ;
  /** Helper method to run the test using all DV serialization formats */
  public  void testWithAllSerializationFormats (java.lang.String name, scala.Function1<scala.Enumeration.Value, scala.runtime.BoxedUnit> func)  ;
  public <T extends java.lang.Object> T withTempHadoopFileSystemPath (scala.Function1<org.apache.hadoop.fs.Path, T> f)  ;
}
