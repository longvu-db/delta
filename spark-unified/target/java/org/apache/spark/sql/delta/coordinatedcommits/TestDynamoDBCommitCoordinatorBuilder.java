package org.apache.spark.sql.delta.coordinatedcommits;
public  class TestDynamoDBCommitCoordinatorBuilder implements org.apache.spark.sql.delta.coordinatedcommits.CommitCoordinatorBuilder, scala.Product, java.io.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long batchSize ()  { throw new RuntimeException(); }
  // not preceding
  public   TestDynamoDBCommitCoordinatorBuilder (long batchSize)  { throw new RuntimeException(); }
  public  java.lang.String getName ()  { throw new RuntimeException(); }
  public  io.delta.storage.commit.CommitCoordinatorClient build (org.apache.spark.sql.SparkSession spark, scala.collection.immutable.Map<java.lang.String, java.lang.String> config)  { throw new RuntimeException(); }
}
