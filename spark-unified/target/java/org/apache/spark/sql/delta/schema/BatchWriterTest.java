package org.apache.spark.sql.delta.schema;
public  interface BatchWriterTest extends org.apache.spark.sql.delta.schema.SchemaEnforcementSuiteBase, org.apache.spark.sql.test.SharedSparkSession {
  public  class RichDataFrameWriter {
    public   RichDataFrameWriter (org.apache.spark.sql.DataFrameWriter<?> dfw)  { throw new RuntimeException(); }
    public  void append (java.io.File path)  { throw new RuntimeException(); }
    public  void overwrite (java.io.File path)  { throw new RuntimeException(); }
  }
  public  void equivalenceTest (java.lang.String testName, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  org.apache.spark.sql.delta.schema.SaveOperation saveOperation ()  ;
}
