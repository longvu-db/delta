package org.apache.spark.sql.delta;
/**
 * Test class to deserialize operation parameters without using custom
 * JsonMapDeserializer.
 */
public final class TestRawDeserialization implements scala.Product, java.io.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> operationParameters ()  { throw new RuntimeException(); }
  // not preceding
  public   TestRawDeserialization (scala.collection.immutable.Map<java.lang.String, java.lang.String> operationParameters)  { throw new RuntimeException(); }
}
