package org.apache.spark.sql.delta;
public  interface DeltaInsertReplaceOnOrUsingTestUtils extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public  class DataLayoutType {
    static public  scala.Enumeration.Value PARTITIONED ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.Value CLUSTERED ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.Value NORMAL ()  { throw new RuntimeException(); }
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
  public  class DataLayoutType$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DataLayoutType$ MODULE$ = null;
    public   DataLayoutType$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value PARTITIONED ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value CLUSTERED ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value NORMAL ()  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.delta.DeltaInsertReplaceOnOrUsingTestUtils.DataLayoutType$ DataLayoutType ()  ;
  public  void createTable (java.lang.String tableName, scala.collection.immutable.Seq<java.lang.String> tableCols, scala.collection.immutable.Seq<java.lang.String> partCols, scala.collection.immutable.Seq<java.lang.String> clusterCols)  ;
  public  void executeInsertReplaceOn (java.lang.String tableName, java.lang.String matchingCond, java.lang.String sourceQuery, boolean byName)  ;
  public  org.apache.spark.sql.delta.commands.InsertReplaceOnOrUsingStats getInsertReplaceOnOrUsingStats (scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> events)  ;
  public  scala.Tuple2<java.lang.Object, java.lang.Object> getLastCommitNumAddedAndRemovedBytes (org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  public  scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> getTahoeEvents (scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> events, java.lang.String opType)  ;
  public  void insertValues (java.lang.String tableName, scala.collection.immutable.Seq<java.lang.String> rows)  ;
  public  java.lang.String replaceOnOrUsingSourceMaterializationReason (scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> events)  ;
  public  void verifyUsageLogWhenExceptionOccurs (org.apache.spark.sql.delta.commands.InsertReplaceOnOrUsingStats stats, java.lang.String expectedReplaceCriteria, java.lang.String expectedExCondition, java.lang.String expectedExParams, scala.Option<java.lang.Object> expectedIsDeleteInsertParallelizedOpt)  ;
}
