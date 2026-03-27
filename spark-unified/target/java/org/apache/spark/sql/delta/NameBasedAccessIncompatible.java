package org.apache.spark.sql.delta;
/**
 * Represents a test that is incompatible with name-based table access
 */
public  class NameBasedAccessIncompatible {
  static public  java.lang.String name ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  int productArity ()  ;
  static public abstract  Object productElement (int n)  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  static public  java.lang.String productElementName (int n)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<java.lang.String> productElementNames ()  { throw new RuntimeException(); }
}
