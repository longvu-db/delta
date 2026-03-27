package org.apache.spark.sql.delta.uniform.hms;
/**
 * Start a Thrift Server that accepts standard HMS thrift client.
 * <p>
 * param:  conf including database connection and warehouse location
 * param:  port the port this thrift server listens
 */
public  class HMSServer {
  public  org.apache.hadoop.hive.conf.HiveConf conf ()  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
  // not preceding
  public   HMSServer (org.apache.hadoop.hive.conf.HiveConf conf, int port)  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
