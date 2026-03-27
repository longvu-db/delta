package org.apache.spark.sql.delta.test;
/**
 * Trait that forces Delta V2 connector mode to STRICT, ensuring all operations
 * use the Kernel-based SparkTable implementation (V2 connector) instead of
 * DeltaTableV2 (V1 connector).
 * <p>
 * See {@link DeltaSQLConf.V2_ENABLE_MODE} for V1 vs V2 connector definitions.
 * <p>
 * Usage:
 * <pre><code>
 * class MyKernelTest extends MyOriginalSuite with V2ForceTest {
 *   override protected def shouldSkipTest(testName: String): Boolean = {
 *     testName.contains("unsupported feature")
 *   }
 * }
 * </code></pre>
 */
public  interface V2ForceTest extends org.apache.spark.sql.delta.test.DeltaSQLCommandTest {
  public  void afterAll ()  ;
  /**
   * Determine if a test is expected to fail based on the test name.
   * Subclasses should override this method to define which tests are expected to fail.
   * By default, no tests are expected to fail.
   * <p>
   * @param testName The name of the test
   * @return true if the test is expected to fail, false otherwise
   */
  public  boolean shouldFail (java.lang.String testName)  ;
  /**
   * Override <code>sparkConf</code> to set V2_ENABLE_MODE to "STRICT".
   * This ensures all catalog operations use Kernel SparkTable (V2 connector).
   * @return (undocumented)
   */
  public  org.apache.spark.SparkConf sparkConf ()  ;
  /**
   * Override <code>test</code> to apply the <code>shouldFail</code> logic.
   * Tests that are expected to fail are converted to ignored tests.
   * @param testName (undocumented)
   * @param testTags (undocumented)
   * @param testFun (undocumented)
   * @param pos (undocumented)
   */
  public  void test (java.lang.String testName, scala.collection.immutable.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  ;
}
