package org.apache.spark.sql.delta;
/**
 * A minimal CommitInfo with only operation parameters. This one
 * does not use the custom JsonMapDeserializer so we can
 * use it to test our ability to generate the legacy operation parameters.
 */
public  class LegacyCommitInfoWithOperationParametersOnly implements scala.Product, java.io.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> operationParameters ()  { throw new RuntimeException(); }
  // not preceding
  public   LegacyCommitInfoWithOperationParametersOnly (scala.collection.immutable.Map<java.lang.String, java.lang.String> operationParameters)  { throw new RuntimeException(); }
}
