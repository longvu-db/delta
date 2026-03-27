package org.apache.spark.sql.delta;
public  interface DDLTestUtils extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  protected  class DDLType {
    static public  scala.Enumeration.Value CREATE ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.Value REPLACE ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.Value CREATE_OR_REPLACE ()  { throw new RuntimeException(); }
    static protected  java.lang.Object readResolve ()  { throw new RuntimeException(); }
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.ValueSet values ()  { throw new RuntimeException(); }
    static protected  int nextId ()  { throw new RuntimeException(); }
    static protected  void nextId_$eq (int x$1)  { throw new RuntimeException(); }
    static protected  scala.collection.Iterator<java.lang.String> nextName ()  { throw new RuntimeException(); }
    static protected  void nextName_$eq (scala.collection.Iterator<java.lang.String> x$1)  { throw new RuntimeException(); }
    static public final  int maxId ()  { throw new RuntimeException(); }
    static public final  scala.Enumeration.Value apply (int x)  { throw new RuntimeException(); }
    static public final  scala.Enumeration.Value withName (java.lang.String s)  { throw new RuntimeException(); }
    static protected final  scala.Enumeration.Value Value ()  { throw new RuntimeException(); }
    static protected final  scala.Enumeration.Value Value (int i)  { throw new RuntimeException(); }
    static protected final  scala.Enumeration.Value Value (java.lang.String name)  { throw new RuntimeException(); }
    static protected final  scala.Enumeration.Value Value (int i, java.lang.String name)  { throw new RuntimeException(); }
  }
  protected  class DDLType$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DDLType$ MODULE$ = null;
    public   DDLType$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value CREATE ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value REPLACE ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value CREATE_OR_REPLACE ()  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.delta.DDLTestUtils.DDLType$ DDLType ()  ;
  public  void createOrReplaceTable (java.lang.String tableName, scala.collection.immutable.Seq<org.apache.spark.sql.delta.ColumnSpec> columnSpecs, scala.collection.immutable.Seq<java.lang.String> partitionedBy, scala.collection.immutable.Map<java.lang.String, java.lang.String> tblProperties)  ;
  public  void createTable (java.lang.String tableName, scala.collection.immutable.Seq<org.apache.spark.sql.delta.ColumnSpec> columnSpecs, scala.collection.immutable.Seq<java.lang.String> partitionedBy, scala.collection.immutable.Map<java.lang.String, java.lang.String> tblProperties)  ;
  public  void replaceTable (java.lang.String tableName, scala.collection.immutable.Seq<org.apache.spark.sql.delta.ColumnSpec> columnSpecs, scala.collection.immutable.Seq<java.lang.String> partitionedBy, scala.collection.immutable.Map<java.lang.String, java.lang.String> tblProperties)  ;
  /** Interface (SQL, Scala) agnostic helper to execute the DDL statement. */
  public  void runDDL (scala.Enumeration.Value ddlType, java.lang.String tableName, scala.collection.immutable.Seq<org.apache.spark.sql.delta.ColumnSpec> columnSpecs, scala.collection.immutable.Seq<java.lang.String> partitionedBy, scala.collection.immutable.Map<java.lang.String, java.lang.String> tblProperties)  ;
}
