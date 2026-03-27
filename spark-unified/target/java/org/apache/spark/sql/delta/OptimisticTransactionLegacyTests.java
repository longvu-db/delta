package org.apache.spark.sql.delta;
public  interface OptimisticTransactionLegacyTests extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public  java.lang.String A_1_1 ()  ;
  public  java.lang.String A_P1 ()  ;
  public  java.lang.String B_1_2 ()  ;
  public  java.lang.String B_P1 ()  ;
  public  java.lang.String C_2_1 ()  ;
  public  java.lang.String C_P1 ()  ;
  public  java.lang.String C_P2 ()  ;
  public  java.lang.String D_3_1 ()  ;
  public  java.lang.String D_P2 ()  ;
  public  java.lang.String E_P3 ()  ;
  public  java.lang.String F_P3 ()  ;
  public  java.lang.String G_P4 ()  ;
  public  org.apache.spark.sql.delta.actions.AddFile addA_1_1_nested ()  ;
  public  org.apache.spark.sql.delta.actions.AddFile addB_1_2_nested ()  ;
  public  org.apache.spark.sql.delta.actions.AddFile addC_2_1_nested ()  ;
  public  org.apache.spark.sql.delta.actions.AddFile addD_3_1_nested ()  ;
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.FileAction> setDataChangeFalse (scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.FileAction> fileActions)  ;
  public  void withLog (scala.collection.immutable.Seq<org.apache.spark.sql.delta.actions.Action> actions, scala.collection.immutable.Seq<java.lang.String> partitionCols, scala.Function1<org.apache.spark.sql.delta.DeltaLog, scala.runtime.BoxedUnit> test)  ;
}
