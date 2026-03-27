package io.delta.internal;
/**
 * Rule for applying the V2 streaming path by rewriting V1 StreamingRelation
 * with Delta DataSource to StreamingRelationV2 with SparkTable.
 * <p>
 * This rule handles the case where Spark's FindDataSourceTable rule has converted
 * a StreamingRelationV2 (with DeltaTableV2) back to a StreamingRelation because
 * DeltaTableV2 doesn't advertise STREAMING_READ capability. We convert it back to
 * StreamingRelationV2 with SparkTable (from sparkV2) which does support streaming.
 * <p>
 * See {@link DeltaV2Mode} for configuration behavior.
 * <p>
 * param:  session The Spark session for configuration access
 */
public  class ApplyV2Streaming extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  // not preceding
  public   ApplyV2Streaming (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
