package org.apache.spark.sql.delta.coordinatedcommits;
/**
 * An in-memory implementation of DynamoDB client for testing. Only the methods used by
 * <code>DynamoDBCommitCoordinatorClient</code> are implemented.
 */
public  class InMemoryDynamoDBClient extends com.amazonaws.services.dynamodbv2.AbstractAmazonDynamoDB {
  public  class PerEntryData implements scala.Product, java.io.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  java.util.concurrent.locks.ReentrantReadWriteLock lock ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.Map<java.lang.String, com.amazonaws.services.dynamodbv2.model.AttributeValue> data ()  { throw new RuntimeException(); }
    // not preceding
    public   PerEntryData (java.util.concurrent.locks.ReentrantReadWriteLock lock, scala.collection.mutable.Map<java.lang.String, com.amazonaws.services.dynamodbv2.model.AttributeValue> data)  { throw new RuntimeException(); }
  }
  public  class PerEntryData$ extends scala.runtime.AbstractFunction2<java.util.concurrent.locks.ReentrantReadWriteLock, scala.collection.mutable.Map<java.lang.String, com.amazonaws.services.dynamodbv2.model.AttributeValue>, org.apache.spark.sql.delta.coordinatedcommits.InMemoryDynamoDBClient.PerEntryData> implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PerEntryData$ MODULE$ = null;
    public   PerEntryData$ ()  { throw new RuntimeException(); }
  }
  public   InMemoryDynamoDBClient ()  { throw new RuntimeException(); }
  public  com.amazonaws.services.dynamodbv2.model.CreateTableResult createTable (com.amazonaws.services.dynamodbv2.model.CreateTableRequest createTableRequest)  { throw new RuntimeException(); }
  /**
   * The db has multiple tables (outer map). Each table has multiple entries (inner map).
   * @return (undocumented)
   */
  public  scala.collection.mutable.Map<java.lang.String, scala.collection.mutable.Map<java.lang.String, org.apache.spark.sql.delta.coordinatedcommits.InMemoryDynamoDBClient.PerEntryData>> db ()  { throw new RuntimeException(); }
  public  com.amazonaws.services.dynamodbv2.model.DescribeTableResult describeTable (java.lang.String tableName)  { throw new RuntimeException(); }
  public  com.amazonaws.services.dynamodbv2.model.GetItemResult getItem (com.amazonaws.services.dynamodbv2.model.GetItemRequest getItemRequest)  { throw new RuntimeException(); }
  public  com.amazonaws.services.dynamodbv2.model.PutItemResult putItem (com.amazonaws.services.dynamodbv2.model.PutItemRequest putItemRequest)  { throw new RuntimeException(); }
  public  com.amazonaws.services.dynamodbv2.model.UpdateItemResult updateItem (com.amazonaws.services.dynamodbv2.model.UpdateItemRequest request)  { throw new RuntimeException(); }
}
