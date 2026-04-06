/*
 * Copyright (2021) The Delta Lake Project Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.sql.delta.commands

import org.apache.spark.sql.delta.DeltaCommitTag
import org.apache.spark.sql.delta.actions.{Action, FileAction}
import org.apache.spark.sql.delta.DataFrameUtils
import org.apache.spark.sql.delta.sources.DeltaSQLConf

import org.apache.spark.sql.{Dataset, Row, SparkSession}
import org.apache.spark.sql.catalyst.analysis.MultiInstanceRelation

object DMLUtils {

  /** Holder for some of the parameters for a `OptimisticTransaction.commit` */
  case class TaggedCommitData[A <: Action](
      actions: Seq[A],
      tags: Map[DeltaCommitTag, String] = Map.empty) {

    def withTag[T](key: DeltaCommitTag.TypedCommitTag[T], value: T): TaggedCommitData[A] = {
      val mergedValue = key.mergeWithNewTypedValue(tags.get(key), value)
      this.copy(tags = this.tags + (key -> mergedValue))
    }

    def stringTags: Map[String, String] = tags.map { case (k, v) => k.key -> v }
  }

  object TaggedCommitData {
    def empty[A <: Action]: TaggedCommitData[A] = TaggedCommitData(Seq.empty[A])
  }
  /**
   * Generate new exprIds for all columns in a duplicated Dataset, so that they don't conflict when
   * combined later (e.g., via a union). This can cause problems after pruning when the types do not
   * match across expressions with the same exprId (e.g., void field being dropped from a struct).
   */
  def assignNewExprIDsBeforeUnion(spark: SparkSession, baseDF: Dataset[Row]): Dataset[Row] = {
    if (!spark.conf.get(DeltaSQLConf.DELTA_DML_GENERATE_NEW_EXPR_IDS_BEFORE_UNION)) {
      return baseDF
    }

    val newPlan = baseDF.queryExecution.analyzed transformUpWithNewOutput {
      case relation: MultiInstanceRelation =>
        val newRelation = relation.newInstance()
        newRelation -> relation.output.zip(newRelation.output)
    }
    DataFrameUtils.ofRows(spark, newPlan)
  }

}
