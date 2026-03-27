package org.apache.spark.sql.delta;
public abstract class DeltaCDCSuiteBase extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.delta.cdc.CDCEnabled, org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.CheckCDCAnswer, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.coordinatedcommits.CatalogOwnedTestBaseSuite, org.apache.spark.sql.delta.test.DeltaSQLTestUtils {
  /** Represents path or metastore table name */
  public abstract class TblId implements scala.Product, java.io.Serializable {
    public  java.lang.String id ()  { throw new RuntimeException(); }
    // not preceding
    public   TblId (java.lang.String id)  { throw new RuntimeException(); }
  }
  public  class TblId$ implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TblId$ MODULE$ = null;
    public   TblId$ ()  { throw new RuntimeException(); }
  }
  public  class StartingVersion implements org.apache.spark.sql.delta.DeltaCDCSuiteBase.Boundary, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String value ()  { throw new RuntimeException(); }
    // not preceding
    public   StartingVersion (java.lang.String value)  { throw new RuntimeException(); }
  }
  public  class StartingVersion$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.delta.DeltaCDCSuiteBase.StartingVersion> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StartingVersion$ MODULE$ = null;
    public   StartingVersion$ ()  { throw new RuntimeException(); }
  }
  public  class StartingTimestamp implements org.apache.spark.sql.delta.DeltaCDCSuiteBase.Boundary, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String value ()  { throw new RuntimeException(); }
    // not preceding
    public   StartingTimestamp (java.lang.String value)  { throw new RuntimeException(); }
  }
  public  class StartingTimestamp$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.delta.DeltaCDCSuiteBase.StartingTimestamp> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StartingTimestamp$ MODULE$ = null;
    public   StartingTimestamp$ ()  { throw new RuntimeException(); }
  }
  public  class EndingVersion implements org.apache.spark.sql.delta.DeltaCDCSuiteBase.Boundary, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String value ()  { throw new RuntimeException(); }
    // not preceding
    public   EndingVersion (java.lang.String value)  { throw new RuntimeException(); }
  }
  public  class EndingVersion$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.delta.DeltaCDCSuiteBase.EndingVersion> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final EndingVersion$ MODULE$ = null;
    public   EndingVersion$ ()  { throw new RuntimeException(); }
  }
  public  class EndingTimestamp implements org.apache.spark.sql.delta.DeltaCDCSuiteBase.Boundary, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String value ()  { throw new RuntimeException(); }
    // not preceding
    public   EndingTimestamp (java.lang.String value)  { throw new RuntimeException(); }
  }
  public  class EndingTimestamp$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.delta.DeltaCDCSuiteBase.EndingTimestamp> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final EndingTimestamp$ MODULE$ = null;
    public   EndingTimestamp$ ()  { throw new RuntimeException(); }
  }
  public  class Unbounded {
    static public abstract  boolean canEqual (Object that)  ;
    static public abstract  boolean equals (Object that)  ;
    static public abstract  int productArity ()  ;
    static public abstract  Object productElement (int n)  ;
    static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
    static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    static public  java.lang.String productElementName (int n)  { throw new RuntimeException(); }
    static public  scala.collection.Iterator<java.lang.String> productElementNames ()  { throw new RuntimeException(); }
  }
  public  class Unbounded$ implements org.apache.spark.sql.delta.DeltaCDCSuiteBase.Boundary, scala.Product, java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Unbounded$ MODULE$ = null;
    public   Unbounded$ ()  { throw new RuntimeException(); }
  }
  public  class TablePath extends org.apache.spark.sql.delta.DeltaCDCSuiteBase.TblId {
    public   TablePath (java.lang.String path)  { throw new RuntimeException(); }
  }
  public  class TableName extends org.apache.spark.sql.delta.DeltaCDCSuiteBase.TblId {
    public   TableName (java.lang.String name)  { throw new RuntimeException(); }
  }
  /** Indicates either the starting or ending version/timestamp */
  public  interface Boundary {
  }
  public   DeltaCDCSuiteBase ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.DeltaTestUtilsBase.ExpectedResult$ ExpectedResult ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.DeltaCDCSuiteBase.Unbounded$ Unbounded ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calendarIntervalData ()  { throw new RuntimeException(); }
  /** Single method to do all kinds of CDC reads */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> cdcRead (org.apache.spark.sql.delta.DeltaCDCSuiteBase.TblId tblId, org.apache.spark.sql.delta.DeltaCDCSuiteBase.Boundary start, org.apache.spark.sql.delta.DeltaCDCSuiteBase.Boundary end, scala.Option<org.apache.spark.sql.delta.DeltaBatchCDFSchemaMode> schemaMode, scala.collection.immutable.Map<java.lang.String, java.lang.String> readerOptions)  ;
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  public  void createTblWithThreeVersions (scala.Option<java.lang.String> tblName, scala.Option<java.lang.String> path)  { throw new RuntimeException(); }
  /** Create table utility method */
  public  void ctas (java.lang.String srcTbl, java.lang.String dstTbl, boolean disableCDC)  { throw new RuntimeException(); }
  public  java.text.SimpleDateFormat dateFormat ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  public  java.lang.String defaultCatalogOwnedFeatureEnabledKey ()  { throw new RuntimeException(); }
  protected  java.lang.String defaultTempDirPrefix ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> intervalData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.Map<java.lang.String, java.lang.Object> locRefCount ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> lowerCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> lowerCaseDataWithDuplicates ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.MapData> mapData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> negativeData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> nullInts ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> nullStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> nullableRepeatedData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> person ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> repeatedData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.classic.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
