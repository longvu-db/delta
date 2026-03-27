package org.apache.spark.sql.delta.optimize;
/**
 * A trait used by unit tests to trigger compaction over a table.
 */
public  interface CompactionTestHelper extends org.apache.spark.sql.delta.test.DeltaSQLTestUtils {
  /**
   * Compact files under the given <code>tablePath</code> using AutoCompaction/OPTIMIZE and
   * returns the {@link OptimizeMetrics}
   * @param tablePath (undocumented)
   * @param where (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.delta.commands.optimize.OptimizeMetrics compactAndGetMetrics (java.lang.String tablePath, java.lang.String where)  ;
  /** Create `numFilePartitions` partitions and each partition has `numFilesPerPartition` files. */
  public  void createFilesToPartitions (int numFilePartitions, int numFilesPerPartition, java.lang.String dir, org.apache.spark.sql.SparkSession spark)  ;
  /** Create `numFiles` files without any partition. */
  public  void createFilesWithoutPartitions (int numFiles, java.lang.String dir, org.apache.spark.sql.SparkSession spark)  ;
  /** config controlling the target file size for compaction */
  public  java.lang.String maxFileSizeConf ()  ;
  /** config controlling the min file size required for compaction */
  public  java.lang.String minFileSizeConf ()  ;
}
