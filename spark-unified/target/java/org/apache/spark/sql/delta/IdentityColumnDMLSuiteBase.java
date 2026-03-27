package org.apache.spark.sql.delta;
/**
 * Identity Column test suite for DML operations, including INSERT REPLACE WHERE.
 */
public  interface IdentityColumnDMLSuiteBase extends org.apache.spark.sql.delta.IdentityColumnTestUtils {
  public  void testMergeWithMultipleWhenNotMatchedClauses (int numPartitions, boolean codegenEnabled)  ;
  public  void testReplaceWhereWithCDF (boolean isPartitioned)  ;
}
