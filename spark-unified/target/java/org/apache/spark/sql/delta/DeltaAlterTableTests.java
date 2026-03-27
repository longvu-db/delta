package org.apache.spark.sql.delta;
public  interface DeltaAlterTableTests extends org.apache.spark.sql.delta.DeltaAlterTableTestBase {
  public  void checkColType (org.apache.spark.sql.types.StructField f, org.apache.spark.sql.types.DataType dt)  ;
  public  void checkErrMsg (java.lang.String msg, scala.collection.immutable.Seq<java.lang.String> field)  ;
  public  void checkExceptionMessage (org.apache.spark.sql.AnalysisException e, scala.collection.immutable.Seq<java.lang.String> messages)  ;
  public  void expectValidationError (scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void setProps (java.lang.String table, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> kvs)  ;
}
