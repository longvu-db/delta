package org.apache.spark.sql.delta.uniform.hms;
/**
 * EmbeddedHMS is an embedded Hive MetaStore for testing purposes.
 * Multiple EmbeddedHMS instances can be started in parallel on the same host
 * (see {@link HMSTest} for how to use it in the code).
 */
public  class EmbeddedHMS {
  static public  java.lang.Integer firstAvailablePort ()  { throw new RuntimeException(); }
  public   EmbeddedHMS ()  { throw new RuntimeException(); }
  /**
   * Generate a random suffix for HMS warehouse/metastore to keep
   * the directory unique for each suite if running concurrently.
   * @return (undocumented)
   */
  public  java.lang.String randomSuffix ()  { throw new RuntimeException(); }
  /**
   * Start an EmbeddedHMS instance
   */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Stop the instance and cleanup its resources
   */
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Fetch the configuration used for clients to connect to the MetaStore
   * @return conf containing thrift uri and warehouse location
   */
  public  org.apache.hadoop.conf.Configuration conf ()  { throw new RuntimeException(); }
}
