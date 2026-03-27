package org.apache.spark.sql.delta;
public  interface ConvertToDeltaSQLSuiteBase extends org.apache.spark.sql.delta.ConvertToDeltaSuiteBaseCommons, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public  void convertToDelta (java.lang.String identifier, scala.Option<java.lang.String> partitionSchema, boolean collectStats)  ;
}
