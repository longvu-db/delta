package org.apache.spark.sql.delta.expressions;
public  class HilbertIndexSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.delta.test.shims.GridTestShim {
  /**
   * Represents a test case. Each n-k pair will verify the continuity of the mapping,
   * and the reversibility of it.
   * param:  n The number of dimensions
   * param:  k The number of bits in each dimension
   */
  public  class TestCase implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  int n ()  { throw new RuntimeException(); }
    public  int k ()  { throw new RuntimeException(); }
    // not preceding
    public   TestCase (int n, int k)  { throw new RuntimeException(); }
  }
  public  class TestCase$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.sql.delta.expressions.HilbertIndexSuite.TestCase> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TestCase$ MODULE$ = null;
    public   TestCase$ ()  { throw new RuntimeException(); }
  }
  public   HilbertIndexSuite ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Seq<org.apache.spark.sql.delta.expressions.HilbertIndexSuite.TestCase> testCases ()  { throw new RuntimeException(); }
}
