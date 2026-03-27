package org.apache.spark.sql.delta;
public  interface DeltaColumnMappingTestUtilsBase extends org.apache.spark.sql.test.SharedSparkSession {
  public  class PhysicalNameString {
    public   PhysicalNameString (java.lang.String s)  { throw new RuntimeException(); }
    public  java.lang.String phy (org.apache.spark.sql.delta.DeltaLog deltaLog)  { throw new RuntimeException(); }
  }
  /**
   * Check if two schemas are equal ignoring column mapping metadata
   * @param schema1 Schema
   * @param schema2 Schema
   */
  public  void assertEqual (org.apache.spark.sql.types.StructType schema1, org.apache.spark.sql.types.StructType schema2)  ;
  /**
   * Check if two table configurations are equal ignoring column mapping metadata
   * @param config1 Table config
   * @param config2 Table config
   */
  public  void assertEqual (scala.collection.immutable.Map<java.lang.String, java.lang.String> config1, scala.collection.immutable.Map<java.lang.String, java.lang.String> config2)  ;
  /**
   * Assert partition exists in an array of set of partition names/paths
   * @param partCol Partition column name
   * @param deltaLog Delta log
   * @param inputFiles Input files to scan for DF
   */
  public  void assertPartitionExists (java.lang.String partCol, org.apache.spark.sql.delta.DeltaLog deltaLog, java.lang.String[] inputFiles)  ;
  /**
   * Check if a partition with specific values exists.
   * Handles both column mapped and non-mapped cases
   * @param partCol Partition column name
   * @param partValue Partition value
   * @param deltaLog DeltaLog
   */
  public  void assertPartitionWithValueExists (java.lang.String partCol, java.lang.String partValue, org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  /** Return KV pairs of Protocol-related stuff for checking the result of DESCRIBE TABLE. */
  public  scala.collection.immutable.Seq<scala.Tuple2<java.lang.String, java.lang.String>> buildProtocolProps (org.apache.spark.sql.delta.Snapshot snapshot)  ;
  public  boolean columnMappingEnabled ()  ;
  public  java.lang.String columnMappingMode ()  ;
  public  java.lang.String columnMappingModeString ()  ;
  /**
   * Convert a (nested) column string to sequence of name parts
   * @param col Column string
   * @return Sequence of parts
   */
  public  scala.collection.immutable.Seq<java.lang.String> columnNameToParts (java.lang.String col)  ;
  /**
   * Convert (nested) column name string into physical name.
   * Ignore parts of special paths starting with:
   *  1. stats columns: minValues, maxValues, numRecords
   *  2. stats df: stats_parsed
   *  3. partition values: partitionValues_parsed, partitionValues
   * @param col Logical column name (e.g. a.b.c)
   * @param schema Reference schema with metadata
   * @return Unresolved attribute with physical name paths
   */
  public  org.apache.spark.sql.catalyst.analysis.UnresolvedAttribute convertColumnNameToAttributeWithPhysicalName (java.lang.String col, org.apache.spark.sql.types.StructType schema)  ;
  /**
   * Standard CONVERT TO DELTA
   * @param tableOrPath String
   */
  public  void convertToDelta (java.lang.String tableOrPath)  ;
  /**
   * Convert a list of (nested) stats columns into physical name with reference from DeltaLog
   * @param columns Logical columns
   * @param deltaLog Reference DeltaLog
   * @return Physical columns
   */
  public  scala.collection.immutable.Seq<org.apache.spark.sql.Column> convertToPhysicalColumns (scala.collection.immutable.Seq<org.apache.spark.sql.Column> columns, org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  /**
   * Drop column mapping configurations from Map
   * @param configuration Table configuration
   * @return Configuration
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> dropColumnMappingConfigurations (scala.collection.immutable.Map<java.lang.String, java.lang.String> configuration)  ;
  /**
   * Drop column mapping configurations from Dataset (e.g. sql("SHOW TBLPROPERTIES t1")
   * @param configs Table configuration
   * @return Configuration Dataset
   */
  public  org.apache.spark.sql.Dataset<scala.Tuple2<java.lang.String, java.lang.String>> dropColumnMappingConfigurations (org.apache.spark.sql.Dataset<scala.Tuple2<java.lang.String, java.lang.String>> configs)  ;
  /**
   * Get partition file paths grouped by partition value
   * @param partCol Logical or physical partition name
   * @param deltaLog DeltaLog
   * @return Partition value to paths
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String[]> getPartitionFilePaths (java.lang.String partCol, org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  /**
   * Get partition file paths for a specific partition value
   * @param partCol Logical or physical partition name
   * @param partValue Partition value
   * @param deltaLog DeltaLog
   * @return List of paths
   */
  public  java.lang.String[] getPartitionFilePathsWithValue (java.lang.String partCol, java.lang.String partValue, org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  /**
   * Convert (nested) column name string into physical name with reference from DeltaLog
   * If target field does not have physical name, display name is returned
   * @param col Logical column name
   * @param deltaLog Reference DeltaLog
   * @return Physical column name
   */
  public  java.lang.String getPhysicalName (java.lang.String col, org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  public  java.lang.String getPhysicalName (java.lang.String col, org.apache.spark.sql.types.StructType schema)  ;
  public  java.lang.String getPhysicalName (scala.collection.immutable.Seq<java.lang.String> nameParts, org.apache.spark.sql.types.StructType schema)  ;
  /**
   * Gets the physical names of a path. This is used for converting column paths in stats schema,
   * so it's ok to not support MapType and ArrayType.
   * @param path (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<scala.collection.immutable.Seq<java.lang.String>> getPhysicalPathForStats (scala.collection.immutable.Seq<java.lang.String> path, org.apache.spark.sql.types.StructType schema)  ;
  /**
   * Group a list of input file paths by partition key-value pair w.r.t. delta log
   * @param inputFiles Input file paths
   * @param deltaLog Delta log
   * @return A mapped array each with the corresponding partition keys
   */
  public  scala.collection.immutable.Map<scala.Tuple2<java.lang.String, java.lang.String>, java.lang.String[]> groupInputFilesByPartition (java.lang.String[] inputFiles, org.apache.spark.sql.delta.DeltaLog deltaLog)  ;
  /**
   * Load Deltalog from path
   * @param pathOrIdentifier Location
   * @param isIdentifier Whether the previous argument is a metastore identifier
   * @return
   */
  public  org.apache.spark.sql.delta.DeltaLog loadDeltaLog (java.lang.String pathOrIdentifier, boolean isIdentifier)  ;
  /**
   * Get the partition value for null
   * @return (undocumented)
   */
  public  java.lang.String nullPartitionValue ()  ;
  public  Object withColumnMappingConf (java.lang.String mode, scala.Function0<java.lang.Object> f)  ;
  public  Object withMaxColumnIdConf (java.lang.String maxId, scala.Function0<java.lang.Object> f)  ;
  /**
   * Force enable streaming read (with possible data loss) on column mapping enabled table with
   * drop / rename schema changes.
   * @param f (undocumented)
   */
  public  void withStreamingReadOnColumnMappingTableEnabled (scala.Function0<scala.runtime.BoxedUnit> f)  ;
}
