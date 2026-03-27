package org.apache.spark.sql.delta;
/** Trait containing common utility methods for struct evolution nullness tests. */
public  interface MergeIntoStructEvolutionNullnessTestUtils extends org.apache.spark.sql.delta.MergeHelpers {
  protected  class SourceType {
    static public  class Val extends scala.Enumeration.Val implements scala.Product, java.io.Serializable {
      public  java.lang.String displayName ()  { throw new RuntimeException(); }
      // not preceding
      public   Val (java.lang.String displayName)  { throw new RuntimeException(); }
    }
    static public  class Val$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.SourceType$.Val> implements java.io.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final Val$ MODULE$ = null;
      public   Val$ ()  { throw new RuntimeException(); }
    }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.SourceType$.Val NonNullLeaves ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.SourceType$.Val NullLeaves ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.SourceType$.Val NullNestedStruct ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.SourceType$.Val NullNestedArray ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.SourceType$.Val NullNestedMap ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.SourceType$.Val NullCol ()  { throw new RuntimeException(); }
    static public  java.lang.String getName (scala.Enumeration.Value sourceType)  { throw new RuntimeException(); }
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
  protected  class SourceType$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SourceType$ MODULE$ = null;
    public   SourceType$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.SourceType$.Val NonNullLeaves ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.SourceType$.Val NullLeaves ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.SourceType$.Val NullNestedStruct ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.SourceType$.Val NullNestedArray ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.SourceType$.Val NullNestedMap ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.SourceType$.Val NullCol ()  { throw new RuntimeException(); }
    public  java.lang.String getName (scala.Enumeration.Value sourceType)  { throw new RuntimeException(); }
  }
  protected  class TargetType {
    static public  class Val extends scala.Enumeration.Val implements scala.Product, java.io.Serializable {
      public  java.lang.String displayName ()  { throw new RuntimeException(); }
      public   Val (java.lang.String displayName)  { throw new RuntimeException(); }
    }
    static public  class Val$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$.Val> implements java.io.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final Val$ MODULE$ = null;
      public   Val$ ()  { throw new RuntimeException(); }
    }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$.Val NonNullLeaves ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$.Val NullLeaves ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$.Val NullNestedStruct ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$.Val NullNestedArray ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$.Val NullNestedMap ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$.Val NullCol ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$.Val Empty ()  { throw new RuntimeException(); }
    static public  java.lang.String getName (scala.Enumeration.Value targetType)  { throw new RuntimeException(); }
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
  protected  class TargetType$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TargetType$ MODULE$ = null;
    public   TargetType$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$.Val NonNullLeaves ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$.Val NullLeaves ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$.Val NullNestedStruct ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$.Val NullNestedArray ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$.Val NullNestedMap ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$.Val NullCol ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$.Val Empty ()  { throw new RuntimeException(); }
    public  java.lang.String getName (scala.Enumeration.Value targetType)  { throw new RuntimeException(); }
  }
  protected  class ActionType {
    static public  class Val extends scala.Enumeration.Val implements scala.Product, java.io.Serializable {
      public  java.lang.String displayName ()  { throw new RuntimeException(); }
      public  org.apache.spark.sql.delta.MergeHelpers.MergeClause clause ()  { throw new RuntimeException(); }
      public   Val (java.lang.String displayName, org.apache.spark.sql.delta.MergeHelpers.MergeClause clause)  { throw new RuntimeException(); }
    }
    static public  class Val$ extends scala.runtime.AbstractFunction2<java.lang.String, org.apache.spark.sql.delta.MergeHelpers.MergeClause, org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.ActionType$.Val> implements java.io.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final Val$ MODULE$ = null;
      public   Val$ ()  { throw new RuntimeException(); }
    }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.ActionType$.Val UpdateStar ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.ActionType$.Val UpdateCol ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.ActionType$.Val UpdateColY ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.ActionType$.Val InsertStar ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.ActionType$.Val InsertCol ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.ActionType$.Val toVal (scala.Enumeration.Value v)  { throw new RuntimeException(); }
    static public  java.lang.String getName (scala.Enumeration.Value actionType)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.delta.MergeHelpers.MergeClause getClause (scala.Enumeration.Value actionType)  { throw new RuntimeException(); }
    static public  boolean isWholeStructAssignment (scala.Enumeration.Value actionType)  { throw new RuntimeException(); }
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
  protected  class ActionType$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ActionType$ MODULE$ = null;
    public   ActionType$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.ActionType$.Val UpdateStar ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.ActionType$.Val UpdateCol ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.ActionType$.Val UpdateColY ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.ActionType$.Val InsertStar ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.ActionType$.Val InsertCol ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.ActionType$.Val toVal (scala.Enumeration.Value v)  { throw new RuntimeException(); }
    public  java.lang.String getName (scala.Enumeration.Value actionType)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeHelpers.MergeClause getClause (scala.Enumeration.Value actionType)  { throw new RuntimeException(); }
    public  boolean isWholeStructAssignment (scala.Enumeration.Value actionType)  { throw new RuntimeException(); }
  }
  /** Represents a struct evolution nullness test case. */
  protected  class StructEvolutionNullnessTestCase implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String testName ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType sourceSchema ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType targetSchema ()  { throw new RuntimeException(); }
    public  java.lang.String sourceData ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<java.lang.String> targetData ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.delta.MergeHelpers.MergeClause actionClause ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType resultSchema ()  { throw new RuntimeException(); }
    public  java.lang.String expectedResult ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs ()  { throw new RuntimeException(); }
    // not preceding
    public   StructEvolutionNullnessTestCase (java.lang.String testName, org.apache.spark.sql.types.StructType sourceSchema, org.apache.spark.sql.types.StructType targetSchema, java.lang.String sourceData, scala.collection.immutable.Seq<java.lang.String> targetData, org.apache.spark.sql.delta.MergeHelpers.MergeClause actionClause, org.apache.spark.sql.types.StructType resultSchema, java.lang.String expectedResult, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs)  { throw new RuntimeException(); }
  }
  protected  class StructEvolutionNullnessTestCase$ extends scala.runtime.AbstractFunction9<java.lang.String, org.apache.spark.sql.types.StructType, org.apache.spark.sql.types.StructType, java.lang.String, scala.collection.immutable.Seq<java.lang.String>, org.apache.spark.sql.delta.MergeHelpers.MergeClause, org.apache.spark.sql.types.StructType, java.lang.String, scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>>, org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.StructEvolutionNullnessTestCase> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StructEvolutionNullnessTestCase$ MODULE$ = null;
    public   StructEvolutionNullnessTestCase$ ()  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.ActionType$ ActionType ()  ;
  public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.SourceType$ SourceType ()  ;
  public  org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.TargetType$ TargetType ()  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> castToMap (Object value)  ;
  /** Parses a JSON string to a Map[String, Any]. */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> fromJsonToMap (java.lang.String jsonStr)  ;
  /**
   * Generates test cases for struct evolution nullness tests.
   * <p>
   * @param testNamePrefix Prefix for test names
   * @param sourceSchema Source table schema
   * @param targetSchema Target table schema
   * @param sourceTypes Source types to test
   * @param updateTargetTypes Target types to use for UPDATE operations
   * @param actionTypes Action types to test
   * @param generateResultSchemaFn Function to determine result schema based on action type
   * @param generateSourceRowFn Function to generate source row
   * @param generateTargetRowFn Function to generate target row
   * @param generateExpectedResultFn Function to generate expected result
   * @return (undocumented)
   */
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils.StructEvolutionNullnessTestCase> generateStructEvolutionNullnessTests (java.lang.String testNamePrefix, org.apache.spark.sql.types.StructType sourceSchema, org.apache.spark.sql.types.StructType targetSchema, scala.collection.immutable.Seq<scala.Enumeration.Value> sourceTypes, scala.collection.immutable.Seq<scala.Enumeration.Value> updateTargetTypes, scala.collection.immutable.Seq<scala.Enumeration.Value> actionTypes, scala.Function1<scala.Enumeration.Value, org.apache.spark.sql.types.StructType> generateResultSchemaFn, scala.Function1<scala.Enumeration.Value, java.lang.String> generateSourceRowFn, scala.Function1<scala.Enumeration.Value, scala.Option<java.lang.String>> generateTargetRowFn, scala.Function3<java.lang.String, scala.Option<java.lang.String>, scala.Enumeration.Value, java.lang.String> generateExpectedResultFn)  ;
  public  Object getNestedValue (scala.collection.immutable.Map<java.lang.String, java.lang.Object> map, java.lang.String key)  ;
  /** Whether to preserve null source structs for struct evolution tests. */
  public  boolean preserveNullSourceStructs ()  ;
  /** Whether to preserve null source structs for UPDATE * specifically. */
  public  boolean preserveNullSourceStructsUpdateStar ()  ;
  /** Configurations for preserving null source structs. */
  public  scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> preserveNullStructsConfs ()  ;
  /**
   * Determines whether the target struct should be overwritten with null.
   * <p>
   * Conditions to set the target struct to NULL:
   * - For UPDATE *, the source struct is null AND the target struct is null.
   * - For whole-struct assignment (UPDATE col = s.col, INSERT), the source struct is null.
   * <p>
   * @param sourceCol The source column value (can be null)
   * @param targetColOpt Optional target column value corresponding to sourceCol
   * @param actionType The action type
   * @return true if target should be overwritten with null, false otherwise
   */
  public  boolean shouldOverwriteWithNull (scala.collection.immutable.Map<java.lang.String, java.lang.Object> sourceCol, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.Object>> targetColOpt, scala.Enumeration.Value actionType)  ;
  /**
   * Checks if null source struct preservation is enabled for UPDATE SET * operations.
   * @return true if both preserveNullSourceStructs and preserveNullSourceStructsUpdateStar are true
   */
  public  boolean shouldPreserveNullSourceStructsForUpdateStar ()  ;
  /**
   * Checks if null source struct preservation is enabled for whole-struct assignments.
   * @return true if preserveNullSourceStructs is true
   */
  public  boolean shouldPreserveNullSourceStructsForWholeStructAssignment ()  ;
  /**
   * Converts a Scala object to JSON string, preserving null values.
   * Unlike org.apache.spark.sql.util.JsonUtils.toJson(), this method uses Include.ALWAYS
   * to ensure null values are preserved in the JSON output.
   * Uses ClassTag instead of deprecated Manifest for Scala 3 compatibility.
   * @param obj (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> java.lang.String toJsonWithNulls (T obj, scala.reflect.ClassTag<T> evidence$1)  ;
}
