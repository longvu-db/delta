package org.apache.spark.sql.delta.test;
/**
 * A trait for tests that are testing a fully set up SparkSession with all of Delta's requirements,
 * such as the configuration of the DeltaCatalog and the addition of all Delta extensions.
 */
public  interface DeltaSQLCommandTest extends org.apache.spark.sql.test.SharedSparkSession {
  public  org.apache.spark.SparkConf sparkConf ()  ;
}
