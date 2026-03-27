package org.apache.spark.sql.delta.test;
public  interface DeltaExceptionTestUtils {
  /**
   * Handles a breaking change between Spark 3.5 and Spark Master (4.0) to improve error messaging
   * in Spark. Previously, in Spark 3.5, when an executor would throw an exception, the driver would
   * wrap it in a {@link SparkException}. Now, in Spark Master (4.0), the original executor exception is
   * thrown directly.
   * <p>
   * This method, which is Spark-version agnostic, executes {@link f} and unwraps it as needed to return
   * the desired {@link Throwable} of type {@link T}.
   * @param f (undocumented)
   * @param evidence$1 (undocumented)
   * @param pos (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Throwable> T interceptWithUnwrapping (scala.Function0<java.lang.Object> f, scala.reflect.ClassTag<T> evidence$1, org.scalactic.source.Position pos)  ;
}
