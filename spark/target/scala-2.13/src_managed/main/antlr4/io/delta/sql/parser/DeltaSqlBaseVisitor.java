// Generated from /home/long.vu/delta/spark/src/main/antlr4/io/delta/sql/parser/DeltaSqlBase.g4 by ANTLR 4.13.1
package io.delta.sql.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DeltaSqlBaseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DeltaSqlBaseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(DeltaSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vacuumTable}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuumTable(DeltaSqlBaseParser.VacuumTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeDeltaDetail}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeDeltaDetail(DeltaSqlBaseParser.DescribeDeltaDetailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code generate}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate(DeltaSqlBaseParser.GenerateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeDeltaHistory}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeDeltaHistory(DeltaSqlBaseParser.DescribeDeltaHistoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code convert}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvert(DeltaSqlBaseParser.ConvertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code restore}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestore(DeltaSqlBaseParser.RestoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTableConstraint}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTableConstraint(DeltaSqlBaseParser.AddTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTableConstraint}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableConstraint(DeltaSqlBaseParser.DropTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTableDropFeature}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableDropFeature(DeltaSqlBaseParser.AlterTableDropFeatureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTableClusterBy}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClusterBy(DeltaSqlBaseParser.AlterTableClusterByContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTableSyncIdentity}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableSyncIdentity(DeltaSqlBaseParser.AlterTableSyncIdentityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optimizeTable}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimizeTable(DeltaSqlBaseParser.OptimizeTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reorgTable}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReorgTable(DeltaSqlBaseParser.ReorgTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clone}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClone(DeltaSqlBaseParser.CloneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clusterBy}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClusterBy(DeltaSqlBaseParser.ClusterByContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passThrough}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassThrough(DeltaSqlBaseParser.PassThroughContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#createTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableHeader(DeltaSqlBaseParser.CreateTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceTableHeader(DeltaSqlBaseParser.ReplaceTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#cloneTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneTableHeader(DeltaSqlBaseParser.CloneTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#zorderSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZorderSpec(DeltaSqlBaseParser.ZorderSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#clusterBySpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClusterBySpec(DeltaSqlBaseParser.ClusterBySpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#temporalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporalClause(DeltaSqlBaseParser.TemporalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(DeltaSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#propertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyList(DeltaSqlBaseParser.PropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(DeltaSqlBaseParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#propertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyKey(DeltaSqlBaseParser.PropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyValue(DeltaSqlBaseParser.PropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#featureNameValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureNameValue(DeltaSqlBaseParser.FeatureNameValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#singleStringLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStringLit(DeltaSqlBaseParser.SingleStringLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#stringLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLit(DeltaSqlBaseParser.StringLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(DeltaSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DeltaSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(DeltaSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link DeltaSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(DeltaSqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(DeltaSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(DeltaSqlBaseParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(DeltaSqlBaseParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link DeltaSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(DeltaSqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#vacuumModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuumModifiers(DeltaSqlBaseParser.VacuumModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#vacuumType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuumType(DeltaSqlBaseParser.VacuumTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#inventory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInventory(DeltaSqlBaseParser.InventoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#retain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetain(DeltaSqlBaseParser.RetainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#dryRun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDryRun(DeltaSqlBaseParser.DryRunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(DeltaSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(DeltaSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(DeltaSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(DeltaSqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(DeltaSqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(DeltaSqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigDecimalLiteral(DeltaSqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkConstraint}
	 * labeled alternative in {@link DeltaSqlBaseParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckConstraint(DeltaSqlBaseParser.CheckConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#predicateToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateToken(DeltaSqlBaseParser.PredicateTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#subQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubQuery(DeltaSqlBaseParser.SubQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#exprToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprToken(DeltaSqlBaseParser.ExprTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaSqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(DeltaSqlBaseParser.NonReservedContext ctx);
}