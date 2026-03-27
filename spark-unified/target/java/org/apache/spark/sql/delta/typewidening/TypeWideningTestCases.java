package org.apache.spark.sql.delta.typewidening;
/**
 * Trait collecting supported and unsupported type change test cases.
 */
public  interface TypeWideningTestCases extends org.apache.spark.sql.test.SQLTestUtils {
  public  class SupportedTypeEvolutionTestCase<FromType extends org.apache.spark.sql.types.DataType, ToType extends org.apache.spark.sql.types.DataType, FromVal extends java.lang.Object, ToVal extends java.lang.Object> extends org.apache.spark.sql.delta.typewidening.TypeWideningTestCases.TypeEvolutionTestCase implements scala.Product, java.io.Serializable {
    /**
     * Represents the input of an unsupported type change test. Handles converting the test values
     * from scala types to a dataframe. Additional values to insert are always empty since the type
     * change is expected to fail.
     * @return (undocumented)
     */
    public  FromType fromType ()  { throw new RuntimeException(); }
    public  ToType toType ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<FromVal> initialValues ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<ToVal> additionalValues ()  { throw new RuntimeException(); }
    public   SupportedTypeEvolutionTestCase (FromType fromType, ToType toType, scala.collection.immutable.Seq<FromVal> initialValues, scala.collection.immutable.Seq<ToVal> additionalValues, org.apache.spark.sql.Encoder<FromVal> evidence$1, org.apache.spark.sql.Encoder<ToVal> evidence$2)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> initialValuesDF ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> additionalValuesDF ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedResult ()  { throw new RuntimeException(); }
  }
  public  class SupportedTypeEvolutionTestCase$ implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SupportedTypeEvolutionTestCase$ MODULE$ = null;
    public   SupportedTypeEvolutionTestCase$ ()  { throw new RuntimeException(); }
  }
  public  class UnsupportedTypeEvolutionTestCase<FromType extends org.apache.spark.sql.types.DataType, ToType extends org.apache.spark.sql.types.DataType, FromVal extends java.lang.Object> extends org.apache.spark.sql.delta.typewidening.TypeWideningTestCases.TypeEvolutionTestCase implements scala.Product, java.io.Serializable {
    public  FromType fromType ()  { throw new RuntimeException(); }
    public  ToType toType ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Seq<FromVal> initialValues ()  { throw new RuntimeException(); }
    public   UnsupportedTypeEvolutionTestCase (FromType fromType, ToType toType, scala.collection.immutable.Seq<FromVal> initialValues, org.apache.spark.sql.Encoder<FromVal> evidence$3)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> initialValuesDF ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> additionalValuesDF ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedResult ()  { throw new RuntimeException(); }
  }
  public  class UnsupportedTypeEvolutionTestCase$ implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final UnsupportedTypeEvolutionTestCase$ MODULE$ = null;
    public   UnsupportedTypeEvolutionTestCase$ ()  { throw new RuntimeException(); }
  }
  /**
   * Represents the input of a type change test.
   * param:  fromType         The original type of the column 'value' in the test table.
   * param:  toType           The type to use when changing the type of column 'value'.
   */
  public abstract class TypeEvolutionTestCase {
    // not preceding
    public   TypeEvolutionTestCase (org.apache.spark.sql.types.DataType fromType, org.apache.spark.sql.types.DataType toType)  { throw new RuntimeException(); }
    /** Additional values to insert after changing the type of the column 'value' to `toType`. */
    public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> additionalValuesDF ()  ;
    /** Expected content of the table after inserting the additional values. */
    public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedResult ()  ;
    public  org.apache.spark.sql.types.DataType fromType ()  { throw new RuntimeException(); }
    /** The initial values to insert with type `fromType` in column 'value' after table creation. */
    public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> initialValuesDF ()  ;
    public  org.apache.spark.sql.types.DataType toType ()  { throw new RuntimeException(); }
  }
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.typewidening.TypeWideningTestCases.TypeEvolutionTestCase> restrictedAutomaticWideningTestCases ()  ;
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.typewidening.TypeWideningTestCases.TypeEvolutionTestCase> supportedTestCases ()  ;
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.typewidening.TypeWideningTestCases.TypeEvolutionTestCase> unsupportedTestCases ()  ;
}
