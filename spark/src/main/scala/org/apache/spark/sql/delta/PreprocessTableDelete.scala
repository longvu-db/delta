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

package org.apache.spark.sql.delta

import org.apache.spark.sql.delta.commands.DeleteCommand

import org.apache.spark.sql.catalyst.expressions.{Exists, SubqueryExpression}
import org.apache.spark.sql.catalyst.plans.logical.{DeltaDelete, LogicalPlan}
import org.apache.spark.sql.catalyst.rules.Rule
import org.apache.spark.sql.internal.SQLConf

/**
 * Preprocess the [[DeltaDelete]] plan to convert to [[DeleteCommand]].
 */
case class PreprocessTableDelete(sqlConf: SQLConf) extends Rule[LogicalPlan] {

  override def apply(plan: LogicalPlan): LogicalPlan = {
    plan.resolveOperators {
      case d: DeltaDelete if d.resolved =>
        d.condition.foreach { cond =>
          // In OSS, only allow EXISTS/NOT EXISTS subqueries in DELETE
          // conditions. Other subquery types (IN, scalar, lateral) require
          // notOrIsNull null-handling or SkipSecureViewPlanning for
          // re-analysis, which are not available in OSS Spark/Delta.
          // EXISTS is safe because it always returns true/false (never NULL),
          // so Not(cond) is semantically equivalent to
          // Not(EqualNullSafe(cond, true)) and allows the optimizer to
          // decorrelate into LeftSemi/LeftAnti joins.
          if (SubqueryExpression.hasSubquery(cond)) {
            val hasNonExistsSubquery = cond.exists {
              case _: Exists => false
              case _: SubqueryExpression => true
              case _ => false
            }
            if (hasNonExistsSubquery) {
              throw DeltaErrors.subqueryNotSupportedException("DELETE", cond)
            }
          }
        }
        DeleteCommand(d)
    }
  }
}
