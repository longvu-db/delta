package org.apache.spark.sql.delta.storage;
public abstract class LineClosableIteratorSuiteBase extends org.apache.spark.SparkFunSuite {
  public   LineClosableIteratorSuiteBase ()  { throw new RuntimeException(); }
  protected abstract  org.apache.spark.sql.delta.storage.ClosableIterator<java.lang.String> createIter (java.io.Reader _reader)  ;
}
