package org.apache.spark.sql.delta;
public  interface DeltaProtocolTransitionsBaseSuite extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public  void beforeAll ()  ;
  public  void testProtocolTransition (scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> createTableColumns, scala.collection.immutable.Seq<scala.Tuple3<java.lang.String, java.lang.String, java.lang.String>> createTableGeneratedColumns, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> createTableProperties, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> alterTableProperties, scala.collection.immutable.Seq<org.apache.spark.sql.delta.TableFeature> dropFeatures, org.apache.spark.sql.delta.actions.Protocol expectedProtocol)  ;
}
