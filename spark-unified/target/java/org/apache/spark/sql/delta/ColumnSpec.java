package org.apache.spark.sql.delta;
/**
 * Base trait for specifying column definitions in tests in an API agnostic way.
 * <p>
 * Note: we don't use StructField because StructField is defined in Spark. It's easier to
 * write tests with flexible helpers in our own project.
 */
public  interface ColumnSpec {
  /** Name of the column. */
  public  java.lang.String colName ()  ;
  /** Spark logical type for the column. */
  public  org.apache.spark.sql.types.DataType dataType ()  ;
  /** Returns a String which can be used to define the column in SQL. */
  public  java.lang.String ddl ()  ;
  /** Return the specification as a StructField */
  public  org.apache.spark.sql.types.StructField structField (org.apache.spark.sql.SparkSession spark)  ;
}
