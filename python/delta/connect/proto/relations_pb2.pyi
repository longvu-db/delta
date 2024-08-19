#
# Copyright (2024) The Delta Lake Project Authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
"""
@generated by mypy-protobuf.  Do not edit manually!
isort:skip_file

Copyright (2024) The Delta Lake Project Authors.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
"""
import builtins
import collections.abc
import delta.connect.proto.proto.base_pb2
import google.protobuf.descriptor
import google.protobuf.internal.containers
import google.protobuf.message
import pyspark.sql.connect.proto.expressions_pb2
import pyspark.sql.connect.proto.relations_pb2
import pyspark.sql.connect.proto.types_pb2
import sys

if sys.version_info >= (3, 8):
    import typing as typing_extensions
else:
    import typing_extensions

DESCRIPTOR: google.protobuf.descriptor.FileDescriptor

class DeltaRelation(google.protobuf.message.Message):
    """Message to hold all relation extensions in Delta Connect."""

    DESCRIPTOR: google.protobuf.descriptor.Descriptor

    SCAN_FIELD_NUMBER: builtins.int
    DESCRIBE_HISTORY_FIELD_NUMBER: builtins.int
    DESCRIBE_DETAIL_FIELD_NUMBER: builtins.int
    CONVERT_TO_DELTA_FIELD_NUMBER: builtins.int
    RESTORE_TABLE_FIELD_NUMBER: builtins.int
    IS_DELTA_TABLE_FIELD_NUMBER: builtins.int
    DELETE_FROM_TABLE_FIELD_NUMBER: builtins.int
    UPDATE_TABLE_FIELD_NUMBER: builtins.int
    MERGE_INTO_TABLE_FIELD_NUMBER: builtins.int
    @property
    def scan(self) -> global___Scan: ...
    @property
    def describe_history(self) -> global___DescribeHistory: ...
    @property
    def describe_detail(self) -> global___DescribeDetail: ...
    @property
    def convert_to_delta(self) -> global___ConvertToDelta: ...
    @property
    def restore_table(self) -> global___RestoreTable: ...
    @property
    def is_delta_table(self) -> global___IsDeltaTable: ...
    @property
    def delete_from_table(self) -> global___DeleteFromTable: ...
    @property
    def update_table(self) -> global___UpdateTable: ...
    @property
    def merge_into_table(self) -> global___MergeIntoTable: ...
    def __init__(
        self,
        *,
        scan: global___Scan | None = ...,
        describe_history: global___DescribeHistory | None = ...,
        describe_detail: global___DescribeDetail | None = ...,
        convert_to_delta: global___ConvertToDelta | None = ...,
        restore_table: global___RestoreTable | None = ...,
        is_delta_table: global___IsDeltaTable | None = ...,
        delete_from_table: global___DeleteFromTable | None = ...,
        update_table: global___UpdateTable | None = ...,
        merge_into_table: global___MergeIntoTable | None = ...,
    ) -> None: ...
    def HasField(
        self,
        field_name: typing_extensions.Literal[
            "convert_to_delta",
            b"convert_to_delta",
            "delete_from_table",
            b"delete_from_table",
            "describe_detail",
            b"describe_detail",
            "describe_history",
            b"describe_history",
            "is_delta_table",
            b"is_delta_table",
            "merge_into_table",
            b"merge_into_table",
            "relation_type",
            b"relation_type",
            "restore_table",
            b"restore_table",
            "scan",
            b"scan",
            "update_table",
            b"update_table",
        ],
    ) -> builtins.bool: ...
    def ClearField(
        self,
        field_name: typing_extensions.Literal[
            "convert_to_delta",
            b"convert_to_delta",
            "delete_from_table",
            b"delete_from_table",
            "describe_detail",
            b"describe_detail",
            "describe_history",
            b"describe_history",
            "is_delta_table",
            b"is_delta_table",
            "merge_into_table",
            b"merge_into_table",
            "relation_type",
            b"relation_type",
            "restore_table",
            b"restore_table",
            "scan",
            b"scan",
            "update_table",
            b"update_table",
        ],
    ) -> None: ...
    def WhichOneof(
        self, oneof_group: typing_extensions.Literal["relation_type", b"relation_type"]
    ) -> (
        typing_extensions.Literal[
            "scan",
            "describe_history",
            "describe_detail",
            "convert_to_delta",
            "restore_table",
            "is_delta_table",
            "delete_from_table",
            "update_table",
            "merge_into_table",
        ]
        | None
    ): ...

global___DeltaRelation = DeltaRelation

class Scan(google.protobuf.message.Message):
    """Relation that reads from a Delta table."""

    DESCRIPTOR: google.protobuf.descriptor.Descriptor

    TABLE_FIELD_NUMBER: builtins.int
    @property
    def table(self) -> delta.connect.proto.base_pb2.DeltaTable:
        """(Required) The Delta table to scan."""
    def __init__(
        self,
        *,
        table: delta.connect.proto.base_pb2.DeltaTable | None = ...,
    ) -> None: ...
    def HasField(
        self, field_name: typing_extensions.Literal["table", b"table"]
    ) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["table", b"table"]) -> None: ...

global___Scan = Scan

class DescribeHistory(google.protobuf.message.Message):
    """Relation containing information of the latest commits on a Delta table.
    The information is in reverse chronological order.
    """

    DESCRIPTOR: google.protobuf.descriptor.Descriptor

    TABLE_FIELD_NUMBER: builtins.int
    @property
    def table(self) -> delta.connect.proto.base_pb2.DeltaTable:
        """(Required) The Delta table to read the history of."""
    def __init__(
        self,
        *,
        table: delta.connect.proto.base_pb2.DeltaTable | None = ...,
    ) -> None: ...
    def HasField(
        self, field_name: typing_extensions.Literal["table", b"table"]
    ) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["table", b"table"]) -> None: ...

global___DescribeHistory = DescribeHistory

class DescribeDetail(google.protobuf.message.Message):
    """Relation containing the details of a Delta table such as the format, name, and size."""

    DESCRIPTOR: google.protobuf.descriptor.Descriptor

    TABLE_FIELD_NUMBER: builtins.int
    @property
    def table(self) -> delta.connect.proto.base_pb2.DeltaTable:
        """(Required) The Delta table to describe the details of."""
    def __init__(
        self,
        *,
        table: delta.connect.proto.base_pb2.DeltaTable | None = ...,
    ) -> None: ...
    def HasField(
        self, field_name: typing_extensions.Literal["table", b"table"]
    ) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["table", b"table"]) -> None: ...

global___DescribeDetail = DescribeDetail

class ConvertToDelta(google.protobuf.message.Message):
    """Command that turns a Parquet table into a Delta table.

    This needs to be a Relation as it returns the identifier of the resulting table.
    We cannot simply reuse the input identifier, as it could be a path-based identifier,
    and in that case we need to replace "parquet.`...`" with "delta.`...`".
    """

    DESCRIPTOR: google.protobuf.descriptor.Descriptor

    IDENTIFIER_FIELD_NUMBER: builtins.int
    PARTITION_SCHEMA_STRING_FIELD_NUMBER: builtins.int
    PARTITION_SCHEMA_STRUCT_FIELD_NUMBER: builtins.int
    identifier: builtins.str
    """(Required) Parquet table identifier formatted as "parquet.`path`" """
    partition_schema_string: builtins.str
    """Hive DDL formatted string"""
    @property
    def partition_schema_struct(self) -> pyspark.sql.connect.proto.types_pb2.DataType:
        """Struct with names and types of partitioning columns"""
    def __init__(
        self,
        *,
        identifier: builtins.str = ...,
        partition_schema_string: builtins.str = ...,
        partition_schema_struct: pyspark.sql.connect.proto.types_pb2.DataType | None = ...,
    ) -> None: ...
    def HasField(
        self,
        field_name: typing_extensions.Literal[
            "partition_schema",
            b"partition_schema",
            "partition_schema_string",
            b"partition_schema_string",
            "partition_schema_struct",
            b"partition_schema_struct",
        ],
    ) -> builtins.bool: ...
    def ClearField(
        self,
        field_name: typing_extensions.Literal[
            "identifier",
            b"identifier",
            "partition_schema",
            b"partition_schema",
            "partition_schema_string",
            b"partition_schema_string",
            "partition_schema_struct",
            b"partition_schema_struct",
        ],
    ) -> None: ...
    def WhichOneof(
        self, oneof_group: typing_extensions.Literal["partition_schema", b"partition_schema"]
    ) -> typing_extensions.Literal["partition_schema_string", "partition_schema_struct"] | None: ...

global___ConvertToDelta = ConvertToDelta

class RestoreTable(google.protobuf.message.Message):
    """Command that restores the DeltaTable to an older version of the table specified by either a
    version number or a timestamp.

    Needs to be a Relation, as it returns a row containing the execution metrics.
    """

    DESCRIPTOR: google.protobuf.descriptor.Descriptor

    TABLE_FIELD_NUMBER: builtins.int
    VERSION_FIELD_NUMBER: builtins.int
    TIMESTAMP_FIELD_NUMBER: builtins.int
    @property
    def table(self) -> delta.connect.proto.base_pb2.DeltaTable:
        """(Required) The Delta table to restore to an earlier version."""
    version: builtins.int
    """The version number to restore to."""
    timestamp: builtins.str
    """The timestamp to restore to."""
    def __init__(
        self,
        *,
        table: delta.connect.proto.base_pb2.DeltaTable | None = ...,
        version: builtins.int = ...,
        timestamp: builtins.str = ...,
    ) -> None: ...
    def HasField(
        self,
        field_name: typing_extensions.Literal[
            "table",
            b"table",
            "timestamp",
            b"timestamp",
            "version",
            b"version",
            "version_or_timestamp",
            b"version_or_timestamp",
        ],
    ) -> builtins.bool: ...
    def ClearField(
        self,
        field_name: typing_extensions.Literal[
            "table",
            b"table",
            "timestamp",
            b"timestamp",
            "version",
            b"version",
            "version_or_timestamp",
            b"version_or_timestamp",
        ],
    ) -> None: ...
    def WhichOneof(
        self,
        oneof_group: typing_extensions.Literal["version_or_timestamp", b"version_or_timestamp"],
    ) -> typing_extensions.Literal["version", "timestamp"] | None: ...

global___RestoreTable = RestoreTable

class IsDeltaTable(google.protobuf.message.Message):
    """Relation containing a single row containing a single boolean that indicates whether the provided
    path contains a Delta table.
    """

    DESCRIPTOR: google.protobuf.descriptor.Descriptor

    PATH_FIELD_NUMBER: builtins.int
    path: builtins.str
    """(Required) The path to check."""
    def __init__(
        self,
        *,
        path: builtins.str = ...,
    ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["path", b"path"]) -> None: ...

global___IsDeltaTable = IsDeltaTable

class DeleteFromTable(google.protobuf.message.Message):
    """Command that deletes data from the target table that matches the given condition.

    Needs to be a Relation, as it returns a row containing the execution metrics.
    """

    DESCRIPTOR: google.protobuf.descriptor.Descriptor

    TARGET_FIELD_NUMBER: builtins.int
    CONDITION_FIELD_NUMBER: builtins.int
    @property
    def target(self) -> pyspark.sql.connect.proto.relations_pb2.Relation:
        """(Required) Target table to delete data from. Must either be a DeltaRelation containing a Scan
        or a SubqueryAlias with a DeltaRelation containing a Scan as its input.
        """
    @property
    def condition(self) -> pyspark.sql.connect.proto.expressions_pb2.Expression:
        """(Optional) Expression returning a boolean."""
    def __init__(
        self,
        *,
        target: pyspark.sql.connect.proto.relations_pb2.Relation | None = ...,
        condition: pyspark.sql.connect.proto.expressions_pb2.Expression | None = ...,
    ) -> None: ...
    def HasField(
        self, field_name: typing_extensions.Literal["condition", b"condition", "target", b"target"]
    ) -> builtins.bool: ...
    def ClearField(
        self, field_name: typing_extensions.Literal["condition", b"condition", "target", b"target"]
    ) -> None: ...

global___DeleteFromTable = DeleteFromTable

class UpdateTable(google.protobuf.message.Message):
    """Command that updates data in the target table using the given assignments for rows that matches
    the given condition.

    Needs to be a Relation, as it returns a row containing the execution metrics.
    """

    DESCRIPTOR: google.protobuf.descriptor.Descriptor

    TARGET_FIELD_NUMBER: builtins.int
    CONDITION_FIELD_NUMBER: builtins.int
    ASSIGNMENTS_FIELD_NUMBER: builtins.int
    @property
    def target(self) -> pyspark.sql.connect.proto.relations_pb2.Relation:
        """(Required) Target table to delete data from. Must either be a DeltaRelation containing a Scan
        or a SubqueryAlias with a DeltaRelation containing a Scan as its input.
        """
    @property
    def condition(self) -> pyspark.sql.connect.proto.expressions_pb2.Expression:
        """(Optional) Condition that determines which rows must be updated.
        Must be an expression returning a boolean.
        """
    @property
    def assignments(
        self,
    ) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[global___Assignment]:
        """(Optional) Set of assignments to apply to the rows matching the condition."""
    def __init__(
        self,
        *,
        target: pyspark.sql.connect.proto.relations_pb2.Relation | None = ...,
        condition: pyspark.sql.connect.proto.expressions_pb2.Expression | None = ...,
        assignments: collections.abc.Iterable[global___Assignment] | None = ...,
    ) -> None: ...
    def HasField(
        self, field_name: typing_extensions.Literal["condition", b"condition", "target", b"target"]
    ) -> builtins.bool: ...
    def ClearField(
        self,
        field_name: typing_extensions.Literal[
            "assignments", b"assignments", "condition", b"condition", "target", b"target"
        ],
    ) -> None: ...

global___UpdateTable = UpdateTable

class MergeIntoTable(google.protobuf.message.Message):
    """Command that merges a source query/table into a Delta table,

    Needs to be a Relation, as it returns a row containing the execution metrics.
    """

    DESCRIPTOR: google.protobuf.descriptor.Descriptor

    class Action(google.protobuf.message.Message):
        """Rule that specifies how the target table should be modified."""

        DESCRIPTOR: google.protobuf.descriptor.Descriptor

        class DeleteAction(google.protobuf.message.Message):
            """Action that deletes the target row."""

            DESCRIPTOR: google.protobuf.descriptor.Descriptor

            def __init__(
                self,
            ) -> None: ...

        class UpdateAction(google.protobuf.message.Message):
            """Action that updates the target row using a set of assignments."""

            DESCRIPTOR: google.protobuf.descriptor.Descriptor

            ASSIGNMENTS_FIELD_NUMBER: builtins.int
            @property
            def assignments(
                self,
            ) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[
                global___Assignment
            ]:
                """(Optional) Set of assignments to apply."""
            def __init__(
                self,
                *,
                assignments: collections.abc.Iterable[global___Assignment] | None = ...,
            ) -> None: ...
            def ClearField(
                self, field_name: typing_extensions.Literal["assignments", b"assignments"]
            ) -> None: ...

        class UpdateStarAction(google.protobuf.message.Message):
            """Action that updates the target row by overwriting all columns."""

            DESCRIPTOR: google.protobuf.descriptor.Descriptor

            def __init__(
                self,
            ) -> None: ...

        class InsertAction(google.protobuf.message.Message):
            """Action that inserts the source row into the target using a set of assignments."""

            DESCRIPTOR: google.protobuf.descriptor.Descriptor

            ASSIGNMENTS_FIELD_NUMBER: builtins.int
            @property
            def assignments(
                self,
            ) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[
                global___Assignment
            ]:
                """(Optional) Set of assignments to apply."""
            def __init__(
                self,
                *,
                assignments: collections.abc.Iterable[global___Assignment] | None = ...,
            ) -> None: ...
            def ClearField(
                self, field_name: typing_extensions.Literal["assignments", b"assignments"]
            ) -> None: ...

        class InsertStarAction(google.protobuf.message.Message):
            """Action that inserts the source row into the target by setting all columns."""

            DESCRIPTOR: google.protobuf.descriptor.Descriptor

            def __init__(
                self,
            ) -> None: ...

        CONDITION_FIELD_NUMBER: builtins.int
        DELETE_ACTION_FIELD_NUMBER: builtins.int
        UPDATE_ACTION_FIELD_NUMBER: builtins.int
        UPDATE_STAR_ACTION_FIELD_NUMBER: builtins.int
        INSERT_ACTION_FIELD_NUMBER: builtins.int
        INSERT_STAR_ACTION_FIELD_NUMBER: builtins.int
        @property
        def condition(self) -> pyspark.sql.connect.proto.expressions_pb2.Expression:
            """(Optional) Condition for the action to be applied."""
        @property
        def delete_action(self) -> global___MergeIntoTable.Action.DeleteAction: ...
        @property
        def update_action(self) -> global___MergeIntoTable.Action.UpdateAction: ...
        @property
        def update_star_action(self) -> global___MergeIntoTable.Action.UpdateStarAction: ...
        @property
        def insert_action(self) -> global___MergeIntoTable.Action.InsertAction: ...
        @property
        def insert_star_action(self) -> global___MergeIntoTable.Action.InsertStarAction: ...
        def __init__(
            self,
            *,
            condition: pyspark.sql.connect.proto.expressions_pb2.Expression | None = ...,
            delete_action: global___MergeIntoTable.Action.DeleteAction | None = ...,
            update_action: global___MergeIntoTable.Action.UpdateAction | None = ...,
            update_star_action: global___MergeIntoTable.Action.UpdateStarAction | None = ...,
            insert_action: global___MergeIntoTable.Action.InsertAction | None = ...,
            insert_star_action: global___MergeIntoTable.Action.InsertStarAction | None = ...,
        ) -> None: ...
        def HasField(
            self,
            field_name: typing_extensions.Literal[
                "action_type",
                b"action_type",
                "condition",
                b"condition",
                "delete_action",
                b"delete_action",
                "insert_action",
                b"insert_action",
                "insert_star_action",
                b"insert_star_action",
                "update_action",
                b"update_action",
                "update_star_action",
                b"update_star_action",
            ],
        ) -> builtins.bool: ...
        def ClearField(
            self,
            field_name: typing_extensions.Literal[
                "action_type",
                b"action_type",
                "condition",
                b"condition",
                "delete_action",
                b"delete_action",
                "insert_action",
                b"insert_action",
                "insert_star_action",
                b"insert_star_action",
                "update_action",
                b"update_action",
                "update_star_action",
                b"update_star_action",
            ],
        ) -> None: ...
        def WhichOneof(
            self, oneof_group: typing_extensions.Literal["action_type", b"action_type"]
        ) -> (
            typing_extensions.Literal[
                "delete_action",
                "update_action",
                "update_star_action",
                "insert_action",
                "insert_star_action",
            ]
            | None
        ): ...

    TARGET_FIELD_NUMBER: builtins.int
    SOURCE_FIELD_NUMBER: builtins.int
    CONDITION_FIELD_NUMBER: builtins.int
    MATCHED_ACTIONS_FIELD_NUMBER: builtins.int
    NOT_MATCHED_ACTIONS_FIELD_NUMBER: builtins.int
    NOT_MATCHED_BY_SOURCE_ACTIONS_FIELD_NUMBER: builtins.int
    WITH_SCHEMA_EVOLUTION_FIELD_NUMBER: builtins.int
    @property
    def target(self) -> pyspark.sql.connect.proto.relations_pb2.Relation:
        """(Required) Target table to merge into."""
    @property
    def source(self) -> pyspark.sql.connect.proto.relations_pb2.Relation:
        """(Required) Source data to merge from."""
    @property
    def condition(self) -> pyspark.sql.connect.proto.expressions_pb2.Expression:
        """(Required) Condition for a source row to match with a target row."""
    @property
    def matched_actions(
        self,
    ) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[
        global___MergeIntoTable.Action
    ]:
        """(Optional) Actions to apply when a source row matches a target row."""
    @property
    def not_matched_actions(
        self,
    ) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[
        global___MergeIntoTable.Action
    ]:
        """(Optional) Actions to apply when a source row does not match a target row."""
    @property
    def not_matched_by_source_actions(
        self,
    ) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[
        global___MergeIntoTable.Action
    ]:
        """(Optional) Actions to apply when a target row does not match a source row."""
    with_schema_evolution: builtins.bool
    """(Optional) Whether Schema Evolution is enabled for this command."""
    def __init__(
        self,
        *,
        target: pyspark.sql.connect.proto.relations_pb2.Relation | None = ...,
        source: pyspark.sql.connect.proto.relations_pb2.Relation | None = ...,
        condition: pyspark.sql.connect.proto.expressions_pb2.Expression | None = ...,
        matched_actions: collections.abc.Iterable[global___MergeIntoTable.Action] | None = ...,
        not_matched_actions: collections.abc.Iterable[global___MergeIntoTable.Action] | None = ...,
        not_matched_by_source_actions: collections.abc.Iterable[global___MergeIntoTable.Action]
        | None = ...,
        with_schema_evolution: builtins.bool | None = ...,
    ) -> None: ...
    def HasField(
        self,
        field_name: typing_extensions.Literal[
            "_with_schema_evolution",
            b"_with_schema_evolution",
            "condition",
            b"condition",
            "source",
            b"source",
            "target",
            b"target",
            "with_schema_evolution",
            b"with_schema_evolution",
        ],
    ) -> builtins.bool: ...
    def ClearField(
        self,
        field_name: typing_extensions.Literal[
            "_with_schema_evolution",
            b"_with_schema_evolution",
            "condition",
            b"condition",
            "matched_actions",
            b"matched_actions",
            "not_matched_actions",
            b"not_matched_actions",
            "not_matched_by_source_actions",
            b"not_matched_by_source_actions",
            "source",
            b"source",
            "target",
            b"target",
            "with_schema_evolution",
            b"with_schema_evolution",
        ],
    ) -> None: ...
    def WhichOneof(
        self,
        oneof_group: typing_extensions.Literal["_with_schema_evolution", b"_with_schema_evolution"],
    ) -> typing_extensions.Literal["with_schema_evolution"] | None: ...

global___MergeIntoTable = MergeIntoTable

class Assignment(google.protobuf.message.Message):
    """Represents an assignment of a value to a field."""

    DESCRIPTOR: google.protobuf.descriptor.Descriptor

    FIELD_FIELD_NUMBER: builtins.int
    VALUE_FIELD_NUMBER: builtins.int
    @property
    def field(self) -> pyspark.sql.connect.proto.expressions_pb2.Expression:
        """(Required) Expression identifying the (struct) field that is assigned a new value."""
    @property
    def value(self) -> pyspark.sql.connect.proto.expressions_pb2.Expression:
        """(Required) Expression that produces the value to assign to the field."""
    def __init__(
        self,
        *,
        field: pyspark.sql.connect.proto.expressions_pb2.Expression | None = ...,
        value: pyspark.sql.connect.proto.expressions_pb2.Expression | None = ...,
    ) -> None: ...
    def HasField(
        self, field_name: typing_extensions.Literal["field", b"field", "value", b"value"]
    ) -> builtins.bool: ...
    def ClearField(
        self, field_name: typing_extensions.Literal["field", b"field", "value", b"value"]
    ) -> None: ...

global___Assignment = Assignment
