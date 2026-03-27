package org.apache.spark.sql.delta;
public  interface DeltaCheckpointTestUtils extends org.apache.spark.sql.delta.DeltaTestUtilsBase {
  /**
   * Helper method to get the dataframe corresponding to the files which has the file actions for a
   * given checkpoint.
   * @param log (undocumented)
   * @param checkpointFile (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getCheckpointDfForFilesContainingFileActions (org.apache.spark.sql.delta.DeltaLog log, org.apache.hadoop.fs.Path checkpointFile)  ;
  public  void testDifferentCheckpoints (java.lang.String testName, boolean quiet, scala.Function2<org.apache.spark.sql.delta.CheckpointPolicy.Policy, scala.Option<org.apache.spark.sql.delta.V2Checkpoint.Format>, scala.runtime.BoxedUnit> f)  ;
}
