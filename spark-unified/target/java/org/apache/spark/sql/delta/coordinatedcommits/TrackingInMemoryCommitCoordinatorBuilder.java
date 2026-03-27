package org.apache.spark.sql.delta.coordinatedcommits;
public  class TrackingInMemoryCommitCoordinatorBuilder implements org.apache.spark.sql.delta.coordinatedcommits.CatalogOwnedCommitCoordinatorBuilder, scala.Product, java.io.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  long batchSize ()  { throw new RuntimeException(); }
  public  scala.Option<io.delta.storage.commit.CommitCoordinatorClient> defaultCommitCoordinatorClientOpt ()  { throw new RuntimeException(); }
  public  java.lang.String defaultCommitCoordinatorName ()  { throw new RuntimeException(); }
  // not preceding
  public   TrackingInMemoryCommitCoordinatorBuilder (long batchSize, scala.Option<io.delta.storage.commit.CommitCoordinatorClient> defaultCommitCoordinatorClientOpt, java.lang.String defaultCommitCoordinatorName)  { throw new RuntimeException(); }
  // not preceding
  public  io.delta.storage.commit.CommitCoordinatorClient trackingInMemoryCommitCoordinatorClient ()  { throw new RuntimeException(); }
  public  java.lang.String getName ()  { throw new RuntimeException(); }
  public  io.delta.storage.commit.CommitCoordinatorClient build (org.apache.spark.sql.SparkSession spark, scala.collection.immutable.Map<java.lang.String, java.lang.String> conf)  { throw new RuntimeException(); }
  public  io.delta.storage.commit.CommitCoordinatorClient buildForCatalog (org.apache.spark.sql.SparkSession spark, java.lang.String catalogName)  { throw new RuntimeException(); }
}
