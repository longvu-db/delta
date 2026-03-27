// Generated from /home/long.vu/delta/spark/src/main/antlr4/io/delta/sql/parser/DeltaSqlBase.g4 by ANTLR 4.13.1
package io.delta.sql.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DeltaSqlBaseParser}.
 */
public interface DeltaSqlBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(DeltaSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(DeltaSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vacuumTable}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVacuumTable(DeltaSqlBaseParser.VacuumTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vacuumTable}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVacuumTable(DeltaSqlBaseParser.VacuumTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeDeltaDetail}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeDeltaDetail(DeltaSqlBaseParser.DescribeDeltaDetailContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeDeltaDetail}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeDeltaDetail(DeltaSqlBaseParser.DescribeDeltaDetailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generate}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate(DeltaSqlBaseParser.GenerateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generate}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate(DeltaSqlBaseParser.GenerateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeDeltaHistory}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeDeltaHistory(DeltaSqlBaseParser.DescribeDeltaHistoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeDeltaHistory}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeDeltaHistory(DeltaSqlBaseParser.DescribeDeltaHistoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code convert}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConvert(DeltaSqlBaseParser.ConvertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code convert}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConvert(DeltaSqlBaseParser.ConvertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code restore}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRestore(DeltaSqlBaseParser.RestoreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code restore}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRestore(DeltaSqlBaseParser.RestoreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTableConstraint}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTableConstraint(DeltaSqlBaseParser.AddTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTableConstraint}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTableConstraint(DeltaSqlBaseParser.AddTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTableConstraint}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTableConstraint(DeltaSqlBaseParser.DropTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTableConstraint}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTableConstraint(DeltaSqlBaseParser.DropTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableDropFeature}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableDropFeature(DeltaSqlBaseParser.AlterTableDropFeatureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableDropFeature}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableDropFeature(DeltaSqlBaseParser.AlterTableDropFeatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableClusterBy}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClusterBy(DeltaSqlBaseParser.AlterTableClusterByContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableClusterBy}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClusterBy(DeltaSqlBaseParser.AlterTableClusterByContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableSyncIdentity}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableSyncIdentity(DeltaSqlBaseParser.AlterTableSyncIdentityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableSyncIdentity}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableSyncIdentity(DeltaSqlBaseParser.AlterTableSyncIdentityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optimizeTable}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOptimizeTable(DeltaSqlBaseParser.OptimizeTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optimizeTable}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOptimizeTable(DeltaSqlBaseParser.OptimizeTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reorgTable}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReorgTable(DeltaSqlBaseParser.ReorgTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reorgTable}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReorgTable(DeltaSqlBaseParser.ReorgTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clone}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClone(DeltaSqlBaseParser.CloneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clone}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClone(DeltaSqlBaseParser.CloneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clusterBy}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClusterBy(DeltaSqlBaseParser.ClusterByContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clusterBy}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClusterBy(DeltaSqlBaseParser.ClusterByContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passThrough}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPassThrough(DeltaSqlBaseParser.PassThroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passThrough}
	 * labeled alternative in {@link DeltaSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPassThrough(DeltaSqlBaseParser.PassThroughContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(DeltaSqlBaseParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(DeltaSqlBaseParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterReplaceTableHeader(DeltaSqlBaseParser.ReplaceTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitReplaceTableHeader(DeltaSqlBaseParser.ReplaceTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#cloneTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCloneTableHeader(DeltaSqlBaseParser.CloneTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#cloneTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCloneTableHeader(DeltaSqlBaseParser.CloneTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#zorderSpec}.
	 * @param ctx the parse tree
	 */
	void enterZorderSpec(DeltaSqlBaseParser.ZorderSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#zorderSpec}.
	 * @param ctx the parse tree
	 */
	void exitZorderSpec(DeltaSqlBaseParser.ZorderSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#clusterBySpec}.
	 * @param ctx the parse tree
	 */
	void enterClusterBySpec(DeltaSqlBaseParser.ClusterBySpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#clusterBySpec}.
	 * @param ctx the parse tree
	 */
	void exitClusterBySpec(DeltaSqlBaseParser.ClusterBySpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#temporalClause}.
	 * @param ctx the parse tree
	 */
	void enterTemporalClause(DeltaSqlBaseParser.TemporalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#temporalClause}.
	 * @param ctx the parse tree
	 */
	void exitTemporalClause(DeltaSqlBaseParser.TemporalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(DeltaSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(DeltaSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList(DeltaSqlBaseParser.PropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList(DeltaSqlBaseParser.PropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(DeltaSqlBaseParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(DeltaSqlBaseParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#propertyKey}.
	 * @param ctx the parse tree
	 */
	void enterPropertyKey(DeltaSqlBaseParser.PropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#propertyKey}.
	 * @param ctx the parse tree
	 */
	void exitPropertyKey(DeltaSqlBaseParser.PropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValue(DeltaSqlBaseParser.PropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValue(DeltaSqlBaseParser.PropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#featureNameValue}.
	 * @param ctx the parse tree
	 */
	void enterFeatureNameValue(DeltaSqlBaseParser.FeatureNameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#featureNameValue}.
	 * @param ctx the parse tree
	 */
	void exitFeatureNameValue(DeltaSqlBaseParser.FeatureNameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#singleStringLit}.
	 * @param ctx the parse tree
	 */
	void enterSingleStringLit(DeltaSqlBaseParser.SingleStringLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#singleStringLit}.
	 * @param ctx the parse tree
	 */
	void exitSingleStringLit(DeltaSqlBaseParser.SingleStringLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#stringLit}.
	 * @param ctx the parse tree
	 */
	void enterStringLit(DeltaSqlBaseParser.StringLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#stringLit}.
	 * @param ctx the parse tree
	 */
	void exitStringLit(DeltaSqlBaseParser.StringLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(DeltaSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(DeltaSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DeltaSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(DeltaSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DeltaSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(DeltaSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link DeltaSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(DeltaSqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link DeltaSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(DeltaSqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(DeltaSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(DeltaSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(DeltaSqlBaseParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(DeltaSqlBaseParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(DeltaSqlBaseParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(DeltaSqlBaseParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link DeltaSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(DeltaSqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link DeltaSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(DeltaSqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#vacuumModifiers}.
	 * @param ctx the parse tree
	 */
	void enterVacuumModifiers(DeltaSqlBaseParser.VacuumModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#vacuumModifiers}.
	 * @param ctx the parse tree
	 */
	void exitVacuumModifiers(DeltaSqlBaseParser.VacuumModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#vacuumType}.
	 * @param ctx the parse tree
	 */
	void enterVacuumType(DeltaSqlBaseParser.VacuumTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#vacuumType}.
	 * @param ctx the parse tree
	 */
	void exitVacuumType(DeltaSqlBaseParser.VacuumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#inventory}.
	 * @param ctx the parse tree
	 */
	void enterInventory(DeltaSqlBaseParser.InventoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#inventory}.
	 * @param ctx the parse tree
	 */
	void exitInventory(DeltaSqlBaseParser.InventoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#retain}.
	 * @param ctx the parse tree
	 */
	void enterRetain(DeltaSqlBaseParser.RetainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#retain}.
	 * @param ctx the parse tree
	 */
	void exitRetain(DeltaSqlBaseParser.RetainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#dryRun}.
	 * @param ctx the parse tree
	 */
	void enterDryRun(DeltaSqlBaseParser.DryRunContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#dryRun}.
	 * @param ctx the parse tree
	 */
	void exitDryRun(DeltaSqlBaseParser.DryRunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(DeltaSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(DeltaSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(DeltaSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(DeltaSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(DeltaSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(DeltaSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(DeltaSqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(DeltaSqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(DeltaSqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(DeltaSqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(DeltaSqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(DeltaSqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(DeltaSqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link DeltaSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(DeltaSqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkConstraint}
	 * labeled alternative in {@link DeltaSqlBaseParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckConstraint(DeltaSqlBaseParser.CheckConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkConstraint}
	 * labeled alternative in {@link DeltaSqlBaseParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckConstraint(DeltaSqlBaseParser.CheckConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#predicateToken}.
	 * @param ctx the parse tree
	 */
	void enterPredicateToken(DeltaSqlBaseParser.PredicateTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#predicateToken}.
	 * @param ctx the parse tree
	 */
	void exitPredicateToken(DeltaSqlBaseParser.PredicateTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#subQuery}.
	 * @param ctx the parse tree
	 */
	void enterSubQuery(DeltaSqlBaseParser.SubQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#subQuery}.
	 * @param ctx the parse tree
	 */
	void exitSubQuery(DeltaSqlBaseParser.SubQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#exprToken}.
	 * @param ctx the parse tree
	 */
	void enterExprToken(DeltaSqlBaseParser.ExprTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#exprToken}.
	 * @param ctx the parse tree
	 */
	void exitExprToken(DeltaSqlBaseParser.ExprTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaSqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(DeltaSqlBaseParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaSqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(DeltaSqlBaseParser.NonReservedContext ctx);
}