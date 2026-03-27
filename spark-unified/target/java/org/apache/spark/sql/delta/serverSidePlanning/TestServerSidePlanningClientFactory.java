package org.apache.spark.sql.delta.serverSidePlanning;
/**
 * Factory for creating TestServerSidePlanningClient instances.
 */
public  class TestServerSidePlanningClientFactory implements org.apache.spark.sql.delta.serverSidePlanning.ServerSidePlanningClientFactory {
  public   TestServerSidePlanningClientFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.delta.serverSidePlanning.ServerSidePlanningClient buildClient (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.delta.serverSidePlanning.ServerSidePlanningMetadata metadata)  { throw new RuntimeException(); }
}
