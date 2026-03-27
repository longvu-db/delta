package org.apache.spark.sql.delta;
/**
 * Trait collecting tests with multiple MERGE clauses for struct evolution nullness behavior.
 * <p>
 * When multiple clauses have different actions, fields excluded in one clause may still be
 * added to the final evolved schema by another clause. The tests verify the nullness of the
 * results in these scenarios.
 */
public  interface MergeIntoStructEvolutionNullnessMultiClauseTests extends org.apache.spark.sql.delta.MergeIntoSchemaEvolutionMixin, org.apache.spark.sql.delta.MergeIntoStructEvolutionNullnessTestUtils {
}
