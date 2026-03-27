package org.apache.spark.sql.delta.coordinatedcommits;
/**
 * General note on streaming tests: by default, a streaming query uses the ProcessingTime trigger
 * with a 0-second interval, so the query will be executed as fast as possible, and the read path
 * will be triggered periodically. Because of this, things like asserting the number of getCommits
 * on the tracking client will not be deterministic.
 */
public  interface CatalogManagedStreamingSuiteBase extends org.apache.spark.sql.streaming.StreamTest, org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.coordinatedcommits.CatalogOwnedTestBaseSuite {
  public  void assertNumCommitsCalled (int expectedNumCommits)  ;
  public  void assertNumGetCommitsCalled (int expectedNumGetCommits)  ;
  public  void beforeEach ()  ;
  public  scala.Option<org.apache.spark.sql.delta.coordinatedcommits.TrackingCommitCoordinatorClient> getTrackingClient ()  ;
  public  void resetTrackingClient ()  ;
}
