package org.apache.spark.sql.delta.typewidening;
/**
 * Mixin trait containing helpers to test dropping the type widening table feature.
 */
public  interface TypeWideningDropFeatureTestMixin extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.DeltaDMLTestUtils {
  /** Expected outcome of dropping the type widening table feature. */
  public  class ExpectedOutcome {
    static public  scala.Enumeration.Value SUCCESS ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.Value FAIL_CURRENT_VERSION_USES_FEATURE ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.Value FAIL_HISTORICAL_VERSION_USES_FEATURE ()  { throw new RuntimeException(); }
    static public  scala.Enumeration.Value FAIL_FEATURE_NOT_PRESENT ()  { throw new RuntimeException(); }
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
  /** Expected outcome of dropping the type widening table feature. */
  public  class ExpectedOutcome$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExpectedOutcome$ MODULE$ = null;
    public   ExpectedOutcome$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value SUCCESS ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value FAIL_CURRENT_VERSION_USES_FEATURE ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value FAIL_HISTORICAL_VERSION_USES_FEATURE ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value FAIL_FEATURE_NOT_PRESENT ()  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.delta.typewidening.TypeWideningDropFeatureTestMixin.ExpectedOutcome$ ExpectedOutcome ()  ;
  /**
   * Helper method to drop the type widening table feature and check for an expected outcome.
   * Validates in particular that the right number of files were rewritten and that the rewritten
   * files all contain the expected type for specified columns.
   * @param feature (undocumented)
   * @param expectedOutcome (undocumented)
   * @param expectedNumFilesRewritten (undocumented)
   * @param expectedColumnTypes (undocumented)
   */
  public  void dropTableFeature (org.apache.spark.sql.delta.TableFeature feature, scala.Enumeration.Value expectedOutcome, long expectedNumFilesRewritten, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.types.DataType> expectedColumnTypes)  ;
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogTable> getCatalogTableOpt ()  ;
  /** Get the number of remove actions committed since the given table version (included). */
  public  long getNumRemoveFilesSinceVersion (long version)  ;
}
