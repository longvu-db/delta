package org.apache.spark.sql.delta.test;
/**
 * Test utility for initializing a SparkSession with a Hive Client and a Hive Catalog for testing
 * DDL operations. Typical tests leverage an in-memory catalog with a mock catalog client. Here we
 * use real Hive classes.
 */
public  interface DeltaHiveTest extends org.scalatest.BeforeAndAfterAll {
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
  public  org.apache.spark.sql.classic.SparkSession spark ()  ;
}
