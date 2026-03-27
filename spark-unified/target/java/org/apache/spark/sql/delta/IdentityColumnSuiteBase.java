package org.apache.spark.sql.delta;
/**
 * General test suite for identity columns.
 */
public  interface IdentityColumnSuiteBase extends org.apache.spark.sql.delta.IdentityColumnTestUtils {
  public  org.apache.spark.sql.types.StructType expectedSchema (scala.Enumeration.Value generatedAsIdentityType, long start, long step)  ;
  public  void withWriterVersion5Table (scala.Function1<java.lang.String, scala.runtime.BoxedUnit> func)  ;
}
