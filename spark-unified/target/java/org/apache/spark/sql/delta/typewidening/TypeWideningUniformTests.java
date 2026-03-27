package org.apache.spark.sql.delta.typewidening;
/** Trait collecting tests covering type widening + Uniform Iceberg compatibility. */
public  interface TypeWideningUniformTests extends org.apache.spark.sql.delta.typewidening.TypeWideningTestMixin, org.apache.spark.sql.delta.typewidening.TypeWideningTestCases, org.apache.spark.sql.delta.DeltaInsertIntoTest, org.scalatest.GivenWhenThen {
  /** Helper to check that the given function violates Uniform compatibility with type widening. */
  public  void checkIcebergCompatViolation (org.apache.spark.sql.delta.IcebergCompatBase compat, org.apache.spark.sql.types.DataType fromType, org.apache.spark.sql.types.DataType toType, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /** Helper to enable Uniform with Iceberg compatibility on the given table. */
  public  void enableIcebergUniform (java.lang.String tableName, org.apache.spark.sql.delta.IcebergCompatBase compat)  ;
}
