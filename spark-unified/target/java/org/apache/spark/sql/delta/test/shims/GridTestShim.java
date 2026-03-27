package org.apache.spark.sql.delta.test.shims;
/**
 * Shim for SparkFunSuite as gridTest doesn't exist in Spark 4.0 but we rely on it
 * in tests. In Spark 4.1 it exists so we don't need to do anything.
 */
public  interface GridTestShim {
}
