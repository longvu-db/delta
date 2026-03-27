package org.apache.spark.sql.delta;
public  interface UpdateBaseMiscTests extends org.apache.spark.sql.delta.UpdateBaseMixin {
  public  java.lang.String fileFormat ()  ;
  /**
   * @param function the unsupported function.
   * @param functionType The type of the unsupported expression to be tested.
   * @param data the data in the table.
   * @param set the set action containing the unsupported expression.
   * @param where the where clause containing the unsupported expression.
   * @param expectException whether an exception is expected to be thrown
   * @param customErrorRegex customized error regex.
   */
  public  void testUnsupportedExpression (java.lang.String function, java.lang.String functionType, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> data, java.lang.String set, java.lang.String where, boolean expectException, scala.Option<java.lang.String> customErrorRegex)  ;
}
