package org.apache.spark.sql.delta;
public  interface CDCTestMixin extends org.apache.spark.sql.test.SharedSparkSession {
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> computeCDC (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.DeltaLog deltaLog, long startVersion, long endVersion, scala.collection.immutable.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates)  ;
}
