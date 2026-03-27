package org.apache.spark.sql.delta;
public  interface MergeIntoMaterializeSourceTests extends org.apache.spark.sql.delta.MergeIntoMaterializeSourceMixin {
  public  scala.collection.immutable.Seq<scala.Tuple2<scala.collection.immutable.Seq<org.apache.spark.sql.catalyst.plans.logical.ResolvedHint>, org.apache.spark.sql.catalyst.plans.logical.JoinHint>> getHints (scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> df)  ;
  public  java.lang.String mergeSourceMaterializeReason (scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> events)  ;
  public  org.apache.spark.sql.delta.commands.merge.MergeStats mergeStats (scala.collection.immutable.Seq<com.databricks.spark.util.UsageRecord> events)  ;
}
