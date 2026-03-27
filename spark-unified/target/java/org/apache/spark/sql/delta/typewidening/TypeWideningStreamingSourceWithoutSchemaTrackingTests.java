package org.apache.spark.sql.delta.typewidening;
/** Tests that specifically cover type widening without schema tracking. */
public  interface TypeWideningStreamingSourceWithoutSchemaTrackingTests extends org.apache.spark.sql.streaming.StreamTest, org.apache.spark.sql.test.SQLTestUtils, org.apache.spark.sql.delta.typewidening.TypeWideningStreamingSourceTestMixin {
}
