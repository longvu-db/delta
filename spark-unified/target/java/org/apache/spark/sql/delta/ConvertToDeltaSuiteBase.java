package org.apache.spark.sql.delta;
/** Tests for CONVERT TO DELTA that can be leveraged across SQL and Scala APIs. */
public  interface ConvertToDeltaSuiteBase extends org.apache.spark.sql.delta.ConvertToDeltaSuiteBaseCommons, org.apache.spark.sql.delta.ConvertToDeltaHiveTableTests {
  public  void testSchemaMerging (java.lang.String testName, scala.Function0<scala.runtime.BoxedUnit> block)  ;
  public  void testSpecialCharactersInDirectoryNames (java.lang.String c, boolean expectFailure)  ;
}
