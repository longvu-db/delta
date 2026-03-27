package org.apache.spark.sql.delta.serverSidePlanning;
/**
 * Companion object for TestServerSidePlanningClient.
 * Stores captured pushdown parameters (filter, projection, limit) for test verification.
 */
public  class TestServerSidePlanningClient$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TestServerSidePlanningClient$ MODULE$ = null;
  public   TestServerSidePlanningClient$ ()  { throw new RuntimeException(); }
    boolean clientClosed ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.sources.Filter> getCapturedFilter ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Seq<java.lang.String>> getCapturedProjection ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> getCapturedLimit ()  { throw new RuntimeException(); }
  public  boolean isClientClosed ()  { throw new RuntimeException(); }
  /**
   * Configure whether filters should be treated as convertible.
   * Used for testing filter conversion failure scenarios.
   * @param convertible (undocumented)
   */
  public  void setFiltersConvertible (boolean convertible)  { throw new RuntimeException(); }
  public  void clearCaptured ()  { throw new RuntimeException(); }
}
