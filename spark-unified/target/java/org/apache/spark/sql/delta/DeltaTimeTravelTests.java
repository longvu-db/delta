package org.apache.spark.sql.delta;
/** A set of tests which we can open source after Spark 3.0 is released. */
public  interface DeltaTimeTravelTests extends org.apache.spark.sql.test.SharedSparkSession, org.scalatest.GivenWhenThen, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.stats.StatsUtils, org.apache.spark.sql.delta.coordinatedcommits.CatalogOwnedTestBaseSuite {
  public  long durationToLong (scala.concurrent.duration.FiniteDuration duration)  ;
  /** Generate commits with the given timestamp in millis. */
  public  void generateCommits (java.lang.String table, scala.collection.immutable.Seq<java.lang.Object> commits)  ;
  public  void generateCommitsAtPath (java.lang.String table, java.lang.String path, scala.collection.immutable.Seq<java.lang.Object> commits)  ;
  public  void generateCommitsBase (java.lang.String table, scala.Option<java.lang.String> path, scala.collection.immutable.Seq<java.lang.Object> commits)  ;
  /** Generate commits with the given timestamp in millis. */
  public  void generateCommitsCheap (org.apache.spark.sql.delta.DeltaLog deltaLog, scala.collection.immutable.Seq<java.lang.Object> commits)  ;
  public  java.lang.String getTableLocation (java.lang.String table)  ;
  public  java.sql.Timestamp longToTimestamp (long ts)  ;
  public  java.lang.String longToTimestampExpr (long value)  ;
  public  java.text.SimpleDateFormat timeFormatter ()  ;
  public  java.lang.String timestampAsOf (java.lang.String table, java.lang.String expr)  ;
  public  void verifyLogging (long tableVersion, long queriedVersion, java.lang.String accessType, java.lang.String apiUsed, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  java.lang.String versionAsOf (java.lang.String table, long version)  ;
  /** Alternate for `withTables` as we leave some tables in an unusable state for clean up */
  public  void withTable (java.lang.String tableName, java.lang.String dir, scala.Function0<scala.runtime.BoxedUnit> f)  ;
}
