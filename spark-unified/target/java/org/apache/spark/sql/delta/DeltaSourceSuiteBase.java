package org.apache.spark.sql.delta;
public  interface DeltaSourceSuiteBase extends org.apache.spark.sql.streaming.StreamTest, org.apache.spark.sql.delta.test.DeltaSQLTestUtils, org.apache.spark.sql.delta.coordinatedcommits.CatalogOwnedTestBaseSuite, org.apache.spark.sql.delta.DeltaSourceConnectorTrait {
  public  class AddToReservoir {
    static public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (java.io.File path, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
  }
  public  class AddToReservoir$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AddToReservoir$ MODULE$ = null;
    public   AddToReservoir$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (java.io.File path, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
  }
  public  class UpdateReservoir {
    static public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (java.io.File path, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.Column> updateExpression)  { throw new RuntimeException(); }
  }
  public  class UpdateReservoir$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final UpdateReservoir$ MODULE$ = null;
    public   UpdateReservoir$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (java.io.File path, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.Column> updateExpression)  { throw new RuntimeException(); }
  }
  public  class DeleteFromReservoir {
    static public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (java.io.File path, org.apache.spark.sql.Column deleteCondition)  { throw new RuntimeException(); }
  }
  public  class DeleteFromReservoir$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DeleteFromReservoir$ MODULE$ = null;
    public   DeleteFromReservoir$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (java.io.File path, org.apache.spark.sql.Column deleteCondition)  { throw new RuntimeException(); }
  }
  public  class MergeIntoReservoir {
    static public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (java.io.File path, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dfToMerge, org.apache.spark.sql.Column mergeCondition, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.Column> updateExpression)  { throw new RuntimeException(); }
  }
  public  class MergeIntoReservoir$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MergeIntoReservoir$ MODULE$ = null;
    public   MergeIntoReservoir$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (java.io.File path, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dfToMerge, org.apache.spark.sql.Column mergeCondition, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.Column> updateExpression)  { throw new RuntimeException(); }
  }
  public  class CheckProgress {
    static public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (scala.collection.immutable.Seq<java.lang.Object> rowsPerBatch)  { throw new RuntimeException(); }
  }
  public  class CheckProgress$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CheckProgress$ MODULE$ = null;
    public   CheckProgress$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (scala.collection.immutable.Seq<java.lang.Object> rowsPerBatch)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.delta.DeltaSourceSuiteBase.AddToReservoir$ AddToReservoir ()  ;
  public  org.apache.spark.sql.delta.DeltaSourceSuiteBase.CheckProgress$ CheckProgress ()  ;
  public  org.apache.spark.sql.delta.DeltaSourceSuiteBase.DeleteFromReservoir$ DeleteFromReservoir ()  ;
  public  org.apache.spark.sql.delta.DeltaSourceSuiteBase.MergeIntoReservoir$ MergeIntoReservoir ()  ;
  public  org.apache.spark.sql.delta.DeltaSourceSuiteBase.UpdateReservoir$ UpdateReservoir ()  ;
  /**
   * Copy metadata for fields in newSchema from currentSchema
   * @param newSchema new schema
   * @param currentSchema current schema to reference
   * @param columnMappingMode mode for column mapping
   * @return updated new schema
   */
  public  org.apache.spark.sql.types.StructType copyOverMetadata (org.apache.spark.sql.types.StructType newSchema, org.apache.spark.sql.types.StructType currentSchema, org.apache.spark.sql.delta.DeltaColumnMappingMode columnMappingMode)  ;
  public  void withMetadata (org.apache.spark.sql.delta.DeltaLog deltaLog, org.apache.spark.sql.types.StructType schema, java.lang.String format, scala.Option<java.lang.String> tableId)  ;
  /**
   * Creates 3 temporary directories for use within a function.
   * @param f function to be run with created temp directories
   */
  public  void withTempDirs (scala.Function3<java.io.File, java.io.File, java.io.File, scala.runtime.BoxedUnit> f)  ;
  /**
   * Creates 3 temporary directories for use within a function using a given prefix.
   * @param f function to be run with created temp directories
   * @param prefix (undocumented)
   */
  public  void withTempDirs (java.lang.String prefix, scala.Function3<java.io.File, java.io.File, java.io.File, scala.runtime.BoxedUnit> f)  ;
}
