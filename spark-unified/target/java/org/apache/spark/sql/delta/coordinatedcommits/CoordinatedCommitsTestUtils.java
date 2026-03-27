package org.apache.spark.sql.delta.coordinatedcommits;
public  interface CoordinatedCommitsTestUtils extends org.apache.spark.sql.delta.DeltaTestUtilsBase, org.apache.spark.sql.delta.coordinatedcommits.CommitCoordinatorUtilBase {
  public  void clearBuilders ()  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> defaultCommitsCoordinatorConf ()  ;
  public  java.lang.String defaultCommitsCoordinatorName ()  ;
  public  io.delta.storage.commit.UpdatedActions getUpdatedActionsForNonZerothCommit (org.apache.spark.sql.delta.actions.CommitInfo commitInfo)  ;
  public  io.delta.storage.commit.UpdatedActions getUpdatedActionsForZerothCommit (org.apache.spark.sql.delta.actions.CommitInfo commitInfo, org.apache.spark.sql.delta.actions.Metadata oldMetadata)  ;
  public  boolean isCatalogOwnedTest ()  ;
  public  java.lang.String propertiesString ()  ;
  public  void registerBuilder (org.apache.spark.sql.delta.coordinatedcommits.CommitCoordinatorBuilder builder)  ;
  public  void testWithDefaultCommitCoordinatorUnset (java.lang.String testName, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void testWithDifferentBackfillInterval (java.lang.String testName, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> f)  ;
  /** Run the test with:
   * 1. Without coordinated-commits
   * 2. With coordinated-commits with different backfill batch sizes
   * @param testName (undocumented)
   * @param f (undocumented)
   */
  public  void testWithDifferentBackfillIntervalOptional (java.lang.String testName, scala.Function1<scala.Option<java.lang.Object>, scala.runtime.BoxedUnit> f)  ;
  public  void withCustomCoordinatedCommitsTableProperties (java.lang.String commitCoordinatorName, scala.collection.immutable.Map<java.lang.String, java.lang.String> conf, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void withDefaultCCTableFeature (scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void withoutDefaultCCTableFeature (scala.Function0<scala.runtime.BoxedUnit> f)  ;
}
