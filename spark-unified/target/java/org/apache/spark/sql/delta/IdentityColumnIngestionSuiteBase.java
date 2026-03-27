package org.apache.spark.sql.delta;
/**
 * Identity Column test suite for ingestion, including insert-only MERGE.
 * Tests with identity columns where MERGE does data modification should be
 * in IdentityColumnDMLSuiteBase.
 */
public  interface IdentityColumnIngestionSuiteBase extends org.apache.spark.sql.delta.IdentityColumnTestUtils {
  public  class IngestMode {
    static public  scala.Enumeration.Value appendV1 ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.Value appendV2 ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.Value insertIntoValues ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.Value insertIntoSelect ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.Value insertOverwriteValues ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.Value insertOverwriteSelect ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.Value streaming ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.Value mergeInsert ()  { throw new RuntimeException(); }
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
  public  class IngestMode$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IngestMode$ MODULE$ = null;
    public   IngestMode$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value appendV1 ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value appendV2 ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value insertIntoValues ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value insertIntoSelect ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value insertOverwriteValues ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value insertOverwriteSelect ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value streaming ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value mergeInsert ()  { throw new RuntimeException(); }
  }
  public  class IngestTestCase implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  long start ()  { throw new RuntimeException(); }
    public  long step ()  { throw new RuntimeException(); }
    public  int iteration ()  { throw new RuntimeException(); }
    public  int batchSize ()  { throw new RuntimeException(); }
    // not preceding
    public   IngestTestCase (long start, long step, int iteration, int batchSize)  { throw new RuntimeException(); }
  }
  public  class IngestTestCase$ extends scala.runtime.AbstractFunction4<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.sql.delta.IdentityColumnIngestionSuiteBase.IngestTestCase> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IngestTestCase$ MODULE$ = null;
    public   IngestTestCase$ ()  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.delta.IdentityColumnIngestionSuiteBase.IngestMode$ IngestMode ()  ;
  /** Helper function to write a single 'value' column into `sourcePath`. */
  public  void setupSimpleCsvFiles (java.lang.String sourcePath, int start, int end)  ;
  /**
   * Helper function to test ingesting data to delta table with IDENTITY columns.
   * <p>
   * @param start     IDENTITY start configuration.
   * @param step      IDENTITY step configuration.
   * @param iteration How many batch to ingest.
   * @param batchSize How many rows to ingest in each batch.
   * @param mode      Specifies what command to use to ingest data.
   */
  public  void testIngestData (long start, long step, int iteration, int batchSize, scala.Enumeration.Value mode)  ;
  /**
   * Creates a source and destination table with the same schema such that if it is a positive step,
   * the source table has identity column values < the target table's start value. If it's
   * a negative step, the source table has identity column values > the target table's start value.
   * @param isSrcDataSubsetOfTgt Whether the source data is a subset of the target data. If false,
   *                             some data is inserted into the target table below the start of
   *                             the identity column value.
   * @param positiveStep Whether the identity column values are generated in a positive step.
   * @param expectValidHighWaterMark Whether the high water mark is expected to be set to a valid
   *                                 value in the target table after running <code>insertDataFn</code>. If so,
   *                                 we check that it respects the start value of the column.
   * @param insertDataFn Function that inserts data from the source table to the target table.
   */
  public  void withSrcAndDestTables (boolean isSrcDataSubsetOfTgt, boolean positiveStep, boolean expectValidHighWaterMark, scala.Function2<java.lang.String, java.lang.String, scala.runtime.BoxedUnit> insertDataFn)  ;
}
