package org.apache.spark.sql.delta.coordinatedcommits;
public  interface CoordinatedCommitsPropertySuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.coordinatedcommits.CoordinatedCommitsTestUtils {
  public  void beforeEach ()  ;
  public  java.lang.String cc1 ()  ;
  public  java.lang.String cc2 ()  ;
  public  java.lang.String command ()  ;
  public  java.lang.String coordinatorConfDefaultKey ()  ;
  public  java.lang.String coordinatorConfKey ()  ;
  public  java.lang.String coordinatorNameDefaultKey ()  ;
  public  java.lang.String coordinatorNameKey ()  ;
  public  java.lang.String getCCPropertiesClause (scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> properties)  ;
  public  java.lang.String getRandomTableName ()  ;
  public  java.lang.String randomCoordinatorConf ()  ;
  public  java.lang.String randomTableConf ()  ;
  public  java.lang.String source ()  ;
  public  java.lang.String tableConfDefaultKey ()  ;
  public  java.lang.String tableConfKey ()  ;
  public  java.lang.String target ()  ;
  public  void testImpl (scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> commandConfs, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> defaultConfs, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> targetConfs, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> sourceConfs, scala.Option<java.lang.String> expectedCoordinator)  ;
  public  void verifyCommitCoordinator (java.lang.String table, scala.Option<java.lang.String> expectedCoordinator)  ;
}
