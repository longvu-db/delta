package org.apache.spark.sql.delta;
/**
 * Trait collecting a subset of tests providing core coverage for schema evolution. Mix this trait
 * in other suites to get basic test coverage for schema evolution in combination with other
 * features, e.g. CDF, DVs.
 */
public  interface MergeIntoSchemaEvolutionCoreTests extends org.apache.spark.sql.delta.MergeIntoSchemaEvolutionMixin {
}
