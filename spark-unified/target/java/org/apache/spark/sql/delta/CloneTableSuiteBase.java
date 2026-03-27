package org.apache.spark.sql.delta;
public  interface CloneTableSuiteBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.delta.CloneTableTestMixin, org.apache.spark.sql.delta.DeltaColumnMappingTestUtils, org.apache.spark.sql.delta.test.DeltaSQLCommandTest, org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.coordinatedcommits.CatalogOwnedTestBaseSuite, org.apache.spark.sql.delta.coordinatedcommits.CoordinatedCommitsTestUtils, org.apache.spark.sql.delta.DeletionVectorsTestUtils {
  public  class TableFeatureWithProperty implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.TableFeature feature ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.DeltaConfig<java.lang.Object> property ()  { throw new RuntimeException(); }
    // not preceding
    public   TableFeatureWithProperty (org.apache.spark.sql.delta.TableFeature feature, org.apache.spark.sql.delta.DeltaConfig<java.lang.Object> property)  { throw new RuntimeException(); }
  }
  public  class TableFeatureWithProperty$ extends scala.runtime.AbstractFunction2<org.apache.spark.sql.delta.TableFeature, org.apache.spark.sql.delta.DeltaConfig<java.lang.Object>, org.apache.spark.sql.delta.CloneTableSuiteBase.TableFeatureWithProperty> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TableFeatureWithProperty$ MODULE$ = null;
    public   TableFeatureWithProperty$ ()  { throw new RuntimeException(); }
  }
  public  void customConvertToDelta (java.lang.String internal, java.lang.String external)  ;
  public  void deleteSourceAndCompareData (java.lang.String source, scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> actual, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expected)  ;
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.CloneTableSuiteBase.TableFeatureWithProperty> featuresWithAutomaticProtocolUpgrade ()  ;
  public  void testSyntax (java.lang.String source, java.lang.String target, java.lang.String sqlString, boolean isShallow, boolean targetIsTable)  ;
  public  void verifyAllFilePaths (java.lang.String table, boolean targetIsTable, boolean expectAbsolute)  ;
}
