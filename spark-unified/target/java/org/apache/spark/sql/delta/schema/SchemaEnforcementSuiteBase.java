package org.apache.spark.sql.delta.schema;
public  interface SchemaEnforcementSuiteBase extends org.apache.spark.sql.test.SharedSparkSession {
  public  void disableAutoMigration (scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void enableAutoMigration (scala.Function0<scala.runtime.BoxedUnit> f)  ;
}
