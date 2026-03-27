package org.apache.spark.sql.delta.logging;
/**
 * Use a mocked object to replace calls to <code>System.nanoTime()</code> with a custom value that can be
 * controlled by calling <code>advance(nanos)</code> on an instance of this class.
 */
public  class MockedNanoTime implements org.apache.spark.sql.delta.metering.NanoTimeTimeSource {
  public   MockedNanoTime ()  { throw new RuntimeException(); }
  public  void advance (scala.concurrent.duration.FiniteDuration time)  { throw new RuntimeException(); }
  public  long nanoTime ()  { throw new RuntimeException(); }
}
