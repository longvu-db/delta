package org.apache.spark.sql.delta.coordinatedcommits;
public  interface CommitCoordinatorUtilBase {
  /** Clear relevant table feature commit coordinator builders that are registered. */
  public  void clearBuilders ()  ;
  /**
   * Returns true if this test is about CatalogOwned table feature.
   * Returns false if this test is about CoordinatedCommits tabel feature.
   * @return (undocumented)
   */
  public  boolean isCatalogOwnedTest ()  ;
  /** Keeps track of the number of table names pointing to the location. */
  public  scala.collection.mutable.Map<java.lang.String, java.lang.Object> locRefCount ()  ;
  /** Returns the properties string to be used in the table creation for test. */
  public  java.lang.String propertiesString ()  ;
  /** Register a builder to the appropriate builder provider. */
  public  void registerBuilder (org.apache.spark.sql.delta.coordinatedcommits.CommitCoordinatorBuilder builder)  ;
  /**
   * Runs a specific test with commit coordinator feature unset.
   * @param testName (undocumented)
   * @param f (undocumented)
   */
  public  void testWithDefaultCommitCoordinatorUnset (java.lang.String testName, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /** Run the test with different backfill batch sizes: 1, 2, 10 */
  public  void testWithDifferentBackfillInterval (java.lang.String testName, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> f)  ;
  /**
   * Runs the function <code>f</code> with commit coordinator table feature set.
   * Any table created in function <code>f</code> have CatalogOwned/CoordinatedCommits enabled by default.<code>
   * @param f (undocumented)
   */
  public  void withDefaultCCTableFeature (scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Runs the function <code>f</code> with commit coordinator table feature unset.
   * Any table created in function <code>f</code> have CatalogOwned/CoordinatedCommits disabled by default.
   * @param f (undocumented)
   */
  public  void withoutDefaultCCTableFeature (scala.Function0<scala.runtime.BoxedUnit> f)  ;
}
