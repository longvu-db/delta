package org.apache.spark.sql.delta;
/**
 * There are **many** different ways to run an insert:
 * - Using SQL, the dataframe v1 and v2 APIs or the streaming API.
 * - Append vs. Overwrite / Partition overwrite.
 * - Position-based vs. name-based resolution.
 * <p>
 * Each take a unique path through analysis. The abstractions below captures these different
 * inserts to allow more easily running tests with all or a subset of them.
 */
public  interface DeltaInsertIntoTest extends org.apache.spark.sql.delta.DeltaDMLTestUtilsPathBased, org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public  class SQLInsertByPosition implements org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    public   SQLInsertByPosition (org.apache.spark.sql.SaveMode mode)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  boolean byName ()  { throw new RuntimeException(); }
    public  boolean isSQL ()  { throw new RuntimeException(); }
    public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
  }
  public  class SQLInsertByPosition$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.SaveMode, org.apache.spark.sql.delta.DeltaInsertIntoTest.SQLInsertByPosition> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SQLInsertByPosition$ MODULE$ = null;
    public   SQLInsertByPosition$ ()  { throw new RuntimeException(); }
  }
  public  class SQLInsertColList implements org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    public   SQLInsertColList (org.apache.spark.sql.SaveMode mode)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  boolean byName ()  { throw new RuntimeException(); }
    public  boolean isSQL ()  { throw new RuntimeException(); }
    public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
  }
  public  class SQLInsertColList$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.SaveMode, org.apache.spark.sql.delta.DeltaInsertIntoTest.SQLInsertColList> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SQLInsertColList$ MODULE$ = null;
    public   SQLInsertColList$ ()  { throw new RuntimeException(); }
  }
  public  class SQLInsertByName implements org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    public   SQLInsertByName (org.apache.spark.sql.SaveMode mode)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  boolean byName ()  { throw new RuntimeException(); }
    public  boolean isSQL ()  { throw new RuntimeException(); }
    public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
  }
  public  class SQLInsertByName$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.SaveMode, org.apache.spark.sql.delta.DeltaInsertIntoTest.SQLInsertByName> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SQLInsertByName$ MODULE$ = null;
    public   SQLInsertByName$ ()  { throw new RuntimeException(); }
  }
  public  class SQLInsertOverwriteReplaceWhere {
    static public  java.lang.String name ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    static public  boolean byName ()  { throw new RuntimeException(); }
    static public  boolean isSQL ()  { throw new RuntimeException(); }
    static public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
    static public  java.lang.String intoOrOverwrite ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedResult (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> initialDF, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> insertedDF)  { throw new RuntimeException(); }
  }
  public  class SQLInsertOverwriteReplaceWhere$ implements org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SQLInsertOverwriteReplaceWhere$ MODULE$ = null;
    public   SQLInsertOverwriteReplaceWhere$ ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    public  boolean byName ()  { throw new RuntimeException(); }
    public  boolean isSQL ()  { throw new RuntimeException(); }
    public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
  }
  public  class SQLInsertOverwritePartitionByPosition {
    static public  java.lang.String name ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    static public  boolean byName ()  { throw new RuntimeException(); }
    static public  boolean isSQL ()  { throw new RuntimeException(); }
    static public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
    static public  java.lang.String intoOrOverwrite ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedResult (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> initialDF, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> insertedDF)  { throw new RuntimeException(); }
  }
  public  class SQLInsertOverwritePartitionByPosition$ implements org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SQLInsertOverwritePartitionByPosition$ MODULE$ = null;
    public   SQLInsertOverwritePartitionByPosition$ ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    public  boolean byName ()  { throw new RuntimeException(); }
    public  boolean isSQL ()  { throw new RuntimeException(); }
    public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
  }
  public  class SQLInsertOverwritePartitionColList {
    static public  java.lang.String name ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    static public  boolean byName ()  { throw new RuntimeException(); }
    static public  boolean isSQL ()  { throw new RuntimeException(); }
    static public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
    static public  java.lang.String intoOrOverwrite ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedResult (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> initialDF, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> insertedDF)  { throw new RuntimeException(); }
  }
  public  class SQLInsertOverwritePartitionColList$ implements org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SQLInsertOverwritePartitionColList$ MODULE$ = null;
    public   SQLInsertOverwritePartitionColList$ ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    public  boolean byName ()  { throw new RuntimeException(); }
    public  boolean isSQL ()  { throw new RuntimeException(); }
    public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
  }
  public  class DFv1InsertInto implements org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    public   DFv1InsertInto (org.apache.spark.sql.SaveMode mode)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  boolean byName ()  { throw new RuntimeException(); }
    public  boolean isSQL ()  { throw new RuntimeException(); }
    public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
  }
  public  class DFv1InsertInto$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.SaveMode, org.apache.spark.sql.delta.DeltaInsertIntoTest.DFv1InsertInto> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DFv1InsertInto$ MODULE$ = null;
    public   DFv1InsertInto$ ()  { throw new RuntimeException(); }
  }
  public  class DFv1SaveAsTable implements org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    public   DFv1SaveAsTable (org.apache.spark.sql.SaveMode mode)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  boolean byName ()  { throw new RuntimeException(); }
    public  boolean isSQL ()  { throw new RuntimeException(); }
    public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
  }
  public  class DFv1SaveAsTable$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.SaveMode, org.apache.spark.sql.delta.DeltaInsertIntoTest.DFv1SaveAsTable> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DFv1SaveAsTable$ MODULE$ = null;
    public   DFv1SaveAsTable$ ()  { throw new RuntimeException(); }
  }
  public  class DFv1Save implements org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    public   DFv1Save (org.apache.spark.sql.SaveMode mode)  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  boolean byName ()  { throw new RuntimeException(); }
    public  boolean isSQL ()  { throw new RuntimeException(); }
    public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
  }
  public  class DFv1Save$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.SaveMode, org.apache.spark.sql.delta.DeltaInsertIntoTest.DFv1Save> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DFv1Save$ MODULE$ = null;
    public   DFv1Save$ ()  { throw new RuntimeException(); }
  }
  public  class DFv1InsertIntoDynamicPartitionOverwrite {
    static public  java.lang.String name ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    static public  boolean byName ()  { throw new RuntimeException(); }
    static public  boolean isSQL ()  { throw new RuntimeException(); }
    static public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
    static public  java.lang.String intoOrOverwrite ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedResult (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> initialDF, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> insertedDF)  { throw new RuntimeException(); }
  }
  public  class DFv1InsertIntoDynamicPartitionOverwrite$ implements org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DFv1InsertIntoDynamicPartitionOverwrite$ MODULE$ = null;
    public   DFv1InsertIntoDynamicPartitionOverwrite$ ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    public  boolean byName ()  { throw new RuntimeException(); }
    public  boolean isSQL ()  { throw new RuntimeException(); }
    public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
  }
  public  class DFv2Append {
    static public  java.lang.String name ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    static public  boolean byName ()  { throw new RuntimeException(); }
    static public  boolean isSQL ()  { throw new RuntimeException(); }
    static public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
    static public  java.lang.String intoOrOverwrite ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedResult (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> initialDF, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> insertedDF)  { throw new RuntimeException(); }
  }
  public  class DFv2Append$ implements org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DFv2Append$ MODULE$ = null;
    public   DFv2Append$ ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    public  boolean byName ()  { throw new RuntimeException(); }
    public  boolean isSQL ()  { throw new RuntimeException(); }
    public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
  }
  public  class DFv2Overwrite {
    static public  java.lang.String name ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    static public  boolean byName ()  { throw new RuntimeException(); }
    static public  boolean isSQL ()  { throw new RuntimeException(); }
    static public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
    static public  java.lang.String intoOrOverwrite ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedResult (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> initialDF, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> insertedDF)  { throw new RuntimeException(); }
  }
  public  class DFv2Overwrite$ implements org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DFv2Overwrite$ MODULE$ = null;
    public   DFv2Overwrite$ ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    public  boolean byName ()  { throw new RuntimeException(); }
    public  boolean isSQL ()  { throw new RuntimeException(); }
    public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
  }
  public  class DFv2OverwritePartition {
    static public  java.lang.String name ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    static public  boolean byName ()  { throw new RuntimeException(); }
    static public  boolean isSQL ()  { throw new RuntimeException(); }
    static public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
    static public  java.lang.String intoOrOverwrite ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedResult (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> initialDF, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> insertedDF)  { throw new RuntimeException(); }
  }
  public  class DFv2OverwritePartition$ implements org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DFv2OverwritePartition$ MODULE$ = null;
    public   DFv2OverwritePartition$ ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    public  boolean byName ()  { throw new RuntimeException(); }
    public  boolean isSQL ()  { throw new RuntimeException(); }
    public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
  }
  public  class StreamingInsert {
    static public  java.lang.String name ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    static public  boolean byName ()  { throw new RuntimeException(); }
    static public  boolean isSQL ()  { throw new RuntimeException(); }
    static public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
    static public  java.lang.String intoOrOverwrite ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedResult (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> initialDF, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> insertedDF)  { throw new RuntimeException(); }
  }
  public  class StreamingInsert$ implements org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StreamingInsert$ MODULE$ = null;
    public   StreamingInsert$ ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.SaveMode mode ()  { throw new RuntimeException(); }
    public  boolean byName ()  { throw new RuntimeException(); }
    public  boolean isSQL ()  { throw new RuntimeException(); }
    public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  { throw new RuntimeException(); }
  }
  /** Convenience wrapper define test data using a SQL schema and a JSON string for each row. */
  public  class TestData implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String schemaDDL ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<java.lang.String> data ()  { throw new RuntimeException(); }
    // not preceding
    public   TestData (java.lang.String schemaDDL, scala.collection.immutable.Seq<java.lang.String> data)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> toDF ()  { throw new RuntimeException(); }
  }
  public  class TestData$ extends scala.runtime.AbstractFunction2<java.lang.String, scala.collection.immutable.Seq<java.lang.String>, org.apache.spark.sql.delta.DeltaInsertIntoTest.TestData> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TestData$ MODULE$ = null;
    public   TestData$ ()  { throw new RuntimeException(); }
  }
  /**
   * Represents one way of inserting data into a Delta table.
   * param:  name A human-readable name for the insert type displayed in the test names.
   * param:  mode Append or Overwrite. This dictates in particular what the expected result after the
   *             insert should be.
   * param:  byName Whether the insert uses name-based resolution or position-based resolution.
   * param:  isSQL Whether the insert is done using SQL or the dataframe API (includes streaming
   *              write).
   */
  public  interface Insert {
    public  boolean byName ()  ;
    /** The expected content of the table after the insert. */
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedResult (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> initialDF, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> insertedDF)  ;
    /** SQL keyword for this type of insert.  */
    public  java.lang.String intoOrOverwrite ()  ;
    public  boolean isSQL ()  ;
    public  org.apache.spark.sql.SaveMode mode ()  ;
    public  java.lang.String name ()  ;
    /**
     * The method that tests will call to run the insert. Each type of insert must implement its
     * specific way to run insert.
     * @param columns (undocumented)
     * @param whereCol (undocumented)
     * @param whereValue (undocumented)
     * @param withSchemaEvolution (undocumented)
     */
    public  void runInsert (scala.collection.immutable.Seq<java.lang.String> columns, java.lang.String whereCol, int whereValue, boolean withSchemaEvolution)  ;
  }
  public  org.apache.spark.sql.delta.DeltaInsertIntoTest.DFv1InsertIntoDynamicPartitionOverwrite$ DFv1InsertIntoDynamicPartitionOverwrite ()  ;
  public  org.apache.spark.sql.delta.DeltaInsertIntoTest.DFv2Append$ DFv2Append ()  ;
  public  org.apache.spark.sql.delta.DeltaInsertIntoTest.DFv2Overwrite$ DFv2Overwrite ()  ;
  public  org.apache.spark.sql.delta.DeltaInsertIntoTest.DFv2OverwritePartition$ DFv2OverwritePartition ()  ;
  public  org.apache.spark.sql.delta.DeltaInsertIntoTest.SQLInsertOverwritePartitionByPosition$ SQLInsertOverwritePartitionByPosition ()  ;
  public  org.apache.spark.sql.delta.DeltaInsertIntoTest.SQLInsertOverwritePartitionColList$ SQLInsertOverwritePartitionColList ()  ;
  public  org.apache.spark.sql.delta.DeltaInsertIntoTest.SQLInsertOverwriteReplaceWhere$ SQLInsertOverwriteReplaceWhere ()  ;
  public  org.apache.spark.sql.delta.DeltaInsertIntoTest.StreamingInsert$ StreamingInsert ()  ;
  public  scala.collection.immutable.Set<org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert> allInsertTypes ()  ;
  public  java.lang.String catalogName ()  ;
  /** Tests should cover all insert types but it's easy to miss some cases. This method checks
   * that each test cover all insert types.
   * @param ignoredTestCases (undocumented)
   */
  public  void checkAllTestCasesImplemented (scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Set<org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert>> ignoredTestCases)  ;
  public  scala.collection.immutable.Set<org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert> insertsAppend ()  ;
  public  scala.collection.immutable.Set<org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert> insertsByName ()  ;
  public  scala.collection.immutable.Set<org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert> insertsByPosition ()  ;
  public  scala.collection.immutable.Set<org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert> insertsDataframe ()  ;
  public  scala.collection.immutable.Set<org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert> insertsOverwrite ()  ;
  public  scala.collection.immutable.Set<org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert> insertsSQL ()  ;
  public  scala.collection.mutable.Map<java.lang.String, scala.collection.immutable.Set<org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert>> testCases ()  ;
  /**
   * Test runner to cover INSERT operations defined above.
   * @param name                Test name
   * @param initialData         Initial data used to create the table.
   * @param partitionBy         Partition columns for the initial table.
   * @param insertData          Additional data to be inserted.
   * @param overwriteWhere      Where clause for overwrite PARTITION / REPLACE WHERE (as
   *                            colName -> value)
   * @param expectedResult      Expected result, see {@link ExpectedResult} above.
   * @param includeInserts      List of insert types to run the test with.
   *                            Defaults to all inserts.
   * @param excludeInserts      List of insert types to exclude when running the test.
   *                            Defaults to no  inserts excluded.
   * @param confs               Custom spark confs to set before running the insert
   *                            operation.
   * @param withSchemaEvolution Whether to enable Automatic Schema Evolution.
   */
  public <T extends java.lang.Object> void testInserts (java.lang.String name, org.apache.spark.sql.delta.DeltaInsertIntoTest.TestData initialData, scala.collection.immutable.Seq<java.lang.String> partitionBy, org.apache.spark.sql.delta.DeltaInsertIntoTest.TestData insertData, scala.Tuple2<java.lang.String, java.lang.Object> overwriteWhere, org.apache.spark.sql.delta.DeltaTestUtilsBase.ExpectedResult<T> expectedResult, scala.collection.immutable.Set<org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert> includeInserts, scala.collection.immutable.Set<org.apache.spark.sql.delta.DeltaInsertIntoTest.Insert> excludeInserts, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs, boolean withSchemaEvolution)  ;
}
