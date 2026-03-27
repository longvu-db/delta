package org.apache.spark.sql.delta;
public  interface DeltaColumnMappingSuiteUtils extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public  void alterTableWithProps (java.lang.String tableName, scala.collection.immutable.Map<java.lang.String, java.lang.String> props)  ;
  public  java.lang.String colName (java.lang.String name)  ;
  public  java.lang.String mode (scala.collection.immutable.Map<java.lang.String, java.lang.String> props)  ;
  public  java.lang.String partitionStmt (scala.collection.immutable.Seq<java.lang.String> partCols)  ;
  public  java.lang.String propString (scala.collection.immutable.Map<java.lang.String, java.lang.String> props)  ;
  public  scala.collection.immutable.Seq<java.lang.String> supportedModes ()  ;
  public  void testColumnMapping (java.lang.String testName, boolean enableSQLConf, scala.Option<scala.collection.immutable.Seq<java.lang.String>> modes, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> testCode)  ;
}
