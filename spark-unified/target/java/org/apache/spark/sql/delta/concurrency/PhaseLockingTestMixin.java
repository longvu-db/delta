package org.apache.spark.sql.delta.concurrency;
public  interface PhaseLockingTestMixin {
  /**
   * Keep checking if <code>check</code> return <code>true</code> until it's the case or <code>waitTime</code> expires.
   * <p>
   * Optionally provide a custom error <code>message</code>.
   * @param check (undocumented)
   * @param timeout (undocumented)
   * @param message (undocumented)
   */
  public  void busyWaitFor (scala.Function0<java.lang.Object> check, scala.concurrent.duration.FiniteDuration timeout, scala.Function0<java.lang.String> message)  ;
  /** Keep checking if `barrier` in `state` until it's the case or `waitTime` expires. */
  public  void busyWaitForState (org.apache.spark.sql.delta.fuzzer.AtomicBarrier barrier, org.apache.spark.sql.delta.fuzzer.AtomicBarrier.State state, scala.concurrent.duration.FiniteDuration waitTime)  ;
}
