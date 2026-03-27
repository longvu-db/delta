package org.apache.spark.sql.delta.serverSidePlanning;
/**
 * Implementation of ServerSidePlanningClient that uses Spark SQL with input_file_name()
 * to discover the list of files in a table. This allows end-to-end testing without
 * a real server that can do server-side planning.
 * <p>
 * Also captures filter/projection parameters for test verification via companion object.
 */
public  class TestServerSidePlanningClient implements org.apache.spark.sql.delta.serverSidePlanning.ServerSidePlanningClient {
  static   boolean clientClosed ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.sources.Filter> getCapturedFilter ()  { throw new RuntimeException(); }
  static public  scala.Option<scala.collection.immutable.Seq<java.lang.String>> getCapturedProjection ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.Object> getCapturedLimit ()  { throw new RuntimeException(); }
  static public  boolean isClientClosed ()  { throw new RuntimeException(); }
  /**
   * Configure whether filters should be treated as convertible.
   * Used for testing filter conversion failure scenarios.
   * @param convertible (undocumented)
   */
  static public  void setFiltersConvertible (boolean convertible)  { throw new RuntimeException(); }
  static public  void clearCaptured ()  { throw new RuntimeException(); }
  public   TestServerSidePlanningClient (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.serverSidePlanning.ScanPlan planScan (java.lang.String databaseName, java.lang.String table, scala.Option<org.apache.spark.sql.sources.Filter> filterOption, scala.Option<scala.collection.immutable.Seq<java.lang.String>> projectionOption, scala.Option<java.lang.Object> limitOption)  { throw new RuntimeException(); }
  public  boolean canConvertFilters (org.apache.spark.sql.sources.Filter[] filters)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
