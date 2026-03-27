package org.apache.spark.sql.delta;
public  interface MergeHelpers {
  protected  class MatchedClause implements org.apache.spark.sql.delta.MergeHelpers.MergeClause, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String condition ()  { throw new RuntimeException(); }
    public  java.lang.String action ()  { throw new RuntimeException(); }
    // not preceding
    public   MatchedClause (java.lang.String condition, java.lang.String action)  { throw new RuntimeException(); }
    public  java.lang.String clause ()  { throw new RuntimeException(); }
  }
  protected  class MatchedClause$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.spark.sql.delta.MergeHelpers.MatchedClause> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MatchedClause$ MODULE$ = null;
    public   MatchedClause$ ()  { throw new RuntimeException(); }
  }
  protected  class NotMatchedClause implements org.apache.spark.sql.delta.MergeHelpers.MergeClause, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String condition ()  { throw new RuntimeException(); }
    public  java.lang.String action ()  { throw new RuntimeException(); }
    // not preceding
    public   NotMatchedClause (java.lang.String condition, java.lang.String action)  { throw new RuntimeException(); }
    public  java.lang.String clause ()  { throw new RuntimeException(); }
  }
  protected  class NotMatchedClause$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.spark.sql.delta.MergeHelpers.NotMatchedClause> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NotMatchedClause$ MODULE$ = null;
    public   NotMatchedClause$ ()  { throw new RuntimeException(); }
  }
  protected  class NotMatchedBySourceClause implements org.apache.spark.sql.delta.MergeHelpers.MergeClause, scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.lang.String condition ()  { throw new RuntimeException(); }
    public  java.lang.String action ()  { throw new RuntimeException(); }
    // not preceding
    public   NotMatchedBySourceClause (java.lang.String condition, java.lang.String action)  { throw new RuntimeException(); }
    public  java.lang.String clause ()  { throw new RuntimeException(); }
  }
  protected  class NotMatchedBySourceClause$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.spark.sql.delta.MergeHelpers.NotMatchedBySourceClause> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NotMatchedBySourceClause$ MODULE$ = null;
    public   NotMatchedBySourceClause$ ()  { throw new RuntimeException(); }
  }
  /** A simple representative of a any WHEN clause in a MERGE statement */
  public  interface MergeClause {
    public  java.lang.String action ()  ;
    public  java.lang.String clause ()  ;
    public  java.lang.String condition ()  ;
    public  java.lang.String sql ()  ;
  }
  public  org.apache.spark.sql.delta.MergeHelpers.MergeClause delete (java.lang.String condition)  ;
  public  org.apache.spark.sql.delta.MergeHelpers.MergeClause deleteNotMatched (java.lang.String condition)  ;
  public  org.apache.spark.sql.delta.MergeHelpers.MergeClause insert (java.lang.String values, java.lang.String condition)  ;
  public  org.apache.spark.sql.delta.MergeHelpers.MergeClause update (java.lang.String set, java.lang.String condition)  ;
  public  org.apache.spark.sql.delta.MergeHelpers.MergeClause updateNotMatched (java.lang.String set, java.lang.String condition)  ;
}
