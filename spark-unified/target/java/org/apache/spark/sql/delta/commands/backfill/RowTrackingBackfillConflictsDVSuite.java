package org.apache.spark.sql.delta.commands.backfill;
/**
 * RESTORE uses commitLarge which does not do conflict checking nor retry. So when there is
 * a concurrent conflict, either RESTORE will fail from concurrent modification or
 * Backfill will fail from the metadata change.
 */
public  class RowTrackingBackfillConflictsDVSuite extends org.apache.spark.sql.delta.commands.backfill.RowTrackingBackfillConflictsSuite {
  public   RowTrackingBackfillConflictsDVSuite ()  { throw new RuntimeException(); }
  public  boolean usePersistentDeletionVectors ()  { throw new RuntimeException(); }
}
