package io.delta.sql;
/**
 * An extension for Spark SQL to activate Delta SQL parser to support Delta SQL grammar.
 * <p>
 * Scala example to create a <code>SparkSession</code> with the Delta SQL parser:
 * <pre><code>
 *    import org.apache.spark.sql.SparkSession
 *
 *    val spark = SparkSession
 *       .builder()
 *       .appName("...")
 *       .master("...")
 *       .config("spark.sql.extensions", "io.delta.sql.DeltaSparkSessionExtension")
 *       .getOrCreate()
 * </code></pre>
 * <p>
 * Java example to create a <code>SparkSession</code> with the Delta SQL parser:
 * <pre><code>
 *    import org.apache.spark.sql.SparkSession;
 *
 *    SparkSession spark = SparkSession
 *                 .builder()
 *                 .appName("...")
 *                 .master("...")
 *                 .config("spark.sql.extensions", "io.delta.sql.DeltaSparkSessionExtension")
 *                 .getOrCreate();
 * </code></pre>
 * <p>
 * Python example to create a <code>SparkSession</code> with the Delta SQL parser (PySpark doesn't pick up the
 * SQL conf "spark.sql.extensions" in Apache Spark 2.4.x, hence we need to activate it manually in
 * 2.4.x. However, because <code>SparkSession</code> has been created and everything has been materialized, we
 * need to clone a new session to trigger the initialization. See SPARK-25003):
 * <pre><code>
 *    from pyspark.sql import SparkSession
 *
 *    spark = SparkSession \
 *        .builder \
 *        .appName("...") \
 *        .master("...") \
 *        .config("spark.sql.extensions", "io.delta.sql.DeltaSparkSessionExtension") \
 *        .getOrCreate()
 *    if spark.sparkContext().version &lt; "3.":
 *        spark.sparkContext()._jvm.io.delta.sql.DeltaSparkSessionExtension() \
 *            .apply(spark._jsparkSession.extensions())
 *        spark = SparkSession(spark.sparkContext(), spark._jsparkSession.cloneSession())
 * </code></pre>
 * <p>
 * @since 0.4.0
 */
public  class DeltaSparkSessionExtension extends io.delta.sql.AbstractDeltaSparkSessionExtension {
  /**
   * NoOpRule for binary compatibility with Delta 3.3.0
   * This class must remain here to satisfy MiMa checks
   */
  public  class NoOpRule extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   NoOpRule ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public   DeltaSparkSessionExtension ()  { throw new RuntimeException(); }
  public  void apply (org.apache.spark.sql.SparkSessionExtensions extensions)  { throw new RuntimeException(); }
}
