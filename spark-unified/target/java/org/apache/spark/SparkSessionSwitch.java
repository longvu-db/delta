package org.apache.spark;
/**
 * Helper for easily switch between multiple sessions in test
 */
public  interface SparkSessionSwitch {
  /**
   * Clear the session related context. Necessary before creating new sessions
   */
  public  void clear ()  ;
  /**
   * Create a SparkSession and save its context. Calling this will not change
   * the current active SparkSession. Use {@link withSession} when you want to use
   * the newly created session.
   * <p>
   * @param factory used to create the session
   * @return the newly created session
   */
  public  org.apache.spark.sql.SparkSession newSession (scala.Function0<org.apache.spark.sql.SparkSession> factory)  ;
  /**
   * Record the SparkContext/SparkEnv for current active session
   */
  public  void registerActiveSession ()  ;
  /**
   * Restore the snapshot made for the given session
   * @param session the session to be restore
   */
  public  void restore (org.apache.spark.sql.SparkSession session)  ;
  /**
   * Synchronize local properties when switch SparkContext by merging
   * and overwriting from off to on
   * @param off the context to be deactivated
   * @param on the context to be activated
   */
  public  void syncContext (org.apache.spark.SparkContext off, org.apache.spark.SparkContext on)  ;
  /**
   * Execute code with the given session.
   * @param session session to use
   * @param thunk code to execute within the specified session
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T withSession (org.apache.spark.sql.SparkSession session, scala.Function1<org.apache.spark.sql.SparkSession, T> thunk)  ;
}
