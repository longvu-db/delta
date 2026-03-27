package org.apache.spark.sql.delta;
public  interface CloneParquetSuiteBase extends org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.test.SharedSparkSession {
  protected  class ParquetIdent implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  boolean isTable ()  { throw new RuntimeException(); }
    // not preceding
    public   ParquetIdent (java.lang.String name, boolean isTable)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.TableIdentifier toTableIdent ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.commands.CloneParquetSource toCloneSource ()  { throw new RuntimeException(); }
  }
  protected  class ParquetIdent$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.Object, org.apache.spark.sql.delta.CloneParquetSuiteBase.ParquetIdent> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ParquetIdent$ MODULE$ = null;
    public   ParquetIdent$ ()  { throw new RuntimeException(); }
  }
  public  scala.collection.immutable.Seq<java.lang.String> supportedModes ()  ;
  public  void testClone (java.lang.String testName, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f)  ;
  public  void validateBlob (scala.collection.immutable.Map<java.lang.String, java.lang.Object> blob, java.lang.String mode, org.apache.spark.sql.delta.commands.CloneParquetSource source, org.apache.spark.sql.delta.DeltaLog target)  ;
  public  void withParquetTable (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.immutable.Seq<java.lang.String> partCols, scala.Function1<org.apache.spark.sql.delta.CloneParquetSuiteBase.ParquetIdent, scala.runtime.BoxedUnit> func)  ;
}
