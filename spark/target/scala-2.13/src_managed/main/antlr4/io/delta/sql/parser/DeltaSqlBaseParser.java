// Generated from /home/long.vu/delta/spark/src/main/antlr4/io/delta/sql/parser/DeltaSqlBase.g4 by ANTLR 4.13.1
package io.delta.sql.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DeltaSqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ADD=2, ALTER=3, APPLY=4, AS=5, BY=6, CHANGE=7, CHECK=8, CLONE=9, 
		CLUSTER=10, COLUMN=11, COMMA=12, COMMENT=13, CONSTRAINT=14, CONVERT=15, 
		CREATE=16, DELTA=17, DESC=18, DESCRIBE=19, DETAIL=20, DOT=21, DROP=22, 
		DRY=23, EXISTS=24, FALSE=25, FEATURE=26, FOR=27, FULL=28, GENERATE=29, 
		HISTORY=30, HOURS=31, ICEBERG_COMPAT_VERSION=32, IDENTITY=33, IF=34, INVENTORY=35, 
		LEFT_PAREN=36, LIMIT=37, LITE=38, LOCATION=39, MINUS=40, NO=41, NONE=42, 
		NOT=43, NULL=44, OF=45, OR=46, OPTIMIZE=47, REORG=48, PARTITIONED=49, 
		PURGE=50, REPLACE=51, RESTORE=52, RETAIN=53, RIGHT_PAREN=54, RUN=55, SHALLOW=56, 
		SYNC=57, SYSTEM_TIME=58, SYSTEM_VERSION=59, TABLE=60, TBLPROPERTIES=61, 
		TIMESTAMP=62, TRUNCATE=63, TO=64, TRUE=65, UNIFORM=66, UPGRADE=67, USING=68, 
		VACUUM=69, VERSION=70, WHERE=71, ZORDER=72, STATISTICS=73, EQ=74, NSEQ=75, 
		NEQ=76, NEQJ=77, LTE=78, GTE=79, CONCAT_PIPE=80, STRING=81, DOUBLEQUOTED_STRING=82, 
		BIGINT_LITERAL=83, SMALLINT_LITERAL=84, TINYINT_LITERAL=85, INTEGER_VALUE=86, 
		DECIMAL_VALUE=87, DOUBLE_LITERAL=88, BIGDECIMAL_LITERAL=89, IDENTIFIER=90, 
		BACKQUOTED_IDENTIFIER=91, SIMPLE_COMMENT=92, BRACKETED_COMMENT=93, WS=94, 
		UNRECOGNIZED=95, DELIMITER=96;
	public static final int
		RULE_singleStatement = 0, RULE_statement = 1, RULE_createTableHeader = 2, 
		RULE_replaceTableHeader = 3, RULE_cloneTableHeader = 4, RULE_zorderSpec = 5, 
		RULE_clusterBySpec = 6, RULE_temporalClause = 7, RULE_qualifiedName = 8, 
		RULE_propertyList = 9, RULE_property = 10, RULE_propertyKey = 11, RULE_propertyValue = 12, 
		RULE_featureNameValue = 13, RULE_singleStringLit = 14, RULE_stringLit = 15, 
		RULE_booleanValue = 16, RULE_identifier = 17, RULE_quotedIdentifier = 18, 
		RULE_colTypeList = 19, RULE_colType = 20, RULE_dataType = 21, RULE_vacuumModifiers = 22, 
		RULE_vacuumType = 23, RULE_inventory = 24, RULE_retain = 25, RULE_dryRun = 26, 
		RULE_number = 27, RULE_constraint = 28, RULE_predicateToken = 29, RULE_subQuery = 30, 
		RULE_exprToken = 31, RULE_nonReserved = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "statement", "createTableHeader", "replaceTableHeader", 
			"cloneTableHeader", "zorderSpec", "clusterBySpec", "temporalClause", 
			"qualifiedName", "propertyList", "property", "propertyKey", "propertyValue", 
			"featureNameValue", "singleStringLit", "stringLit", "booleanValue", "identifier", 
			"quotedIdentifier", "colTypeList", "colType", "dataType", "vacuumModifiers", 
			"vacuumType", "inventory", "retain", "dryRun", "number", "constraint", 
			"predicateToken", "subQuery", "exprToken", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'ADD'", "'ALTER'", "'APPLY'", "'AS'", "'BY'", "'CHANGE'", 
			"'CHECK'", "'CLONE'", "'CLUSTER'", "'COLUMN'", "','", "'COMMENT'", "'CONSTRAINT'", 
			"'CONVERT'", "'CREATE'", "'DELTA'", "'DESC'", "'DESCRIBE'", "'DETAIL'", 
			"'.'", "'DROP'", "'DRY'", "'EXISTS'", "'FALSE'", "'FEATURE'", "'FOR'", 
			"'FULL'", "'GENERATE'", "'HISTORY'", "'HOURS'", "'ICEBERG_COMPAT_VERSION'", 
			"'IDENTITY'", "'IF'", "'INVENTORY'", "'('", "'LIMIT'", "'LITE'", "'LOCATION'", 
			"'-'", "'NO'", "'NONE'", null, "'NULL'", "'OF'", "'OR'", "'OPTIMIZE'", 
			"'REORG'", "'PARTITIONED'", "'PURGE'", "'REPLACE'", "'RESTORE'", "'RETAIN'", 
			"')'", "'RUN'", "'SHALLOW'", "'SYNC'", "'SYSTEM_TIME'", "'SYSTEM_VERSION'", 
			"'TABLE'", "'TBLPROPERTIES'", "'TIMESTAMP'", "'TRUNCATE'", "'TO'", "'TRUE'", 
			"'UNIFORM'", "'UPGRADE'", "'USING'", "'VACUUM'", "'VERSION'", "'WHERE'", 
			"'ZORDER'", "'STATISTICS'", null, "'<=>'", "'<>'", "'!='", null, null, 
			"'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ADD", "ALTER", "APPLY", "AS", "BY", "CHANGE", "CHECK", "CLONE", 
			"CLUSTER", "COLUMN", "COMMA", "COMMENT", "CONSTRAINT", "CONVERT", "CREATE", 
			"DELTA", "DESC", "DESCRIBE", "DETAIL", "DOT", "DROP", "DRY", "EXISTS", 
			"FALSE", "FEATURE", "FOR", "FULL", "GENERATE", "HISTORY", "HOURS", "ICEBERG_COMPAT_VERSION", 
			"IDENTITY", "IF", "INVENTORY", "LEFT_PAREN", "LIMIT", "LITE", "LOCATION", 
			"MINUS", "NO", "NONE", "NOT", "NULL", "OF", "OR", "OPTIMIZE", "REORG", 
			"PARTITIONED", "PURGE", "REPLACE", "RESTORE", "RETAIN", "RIGHT_PAREN", 
			"RUN", "SHALLOW", "SYNC", "SYSTEM_TIME", "SYSTEM_VERSION", "TABLE", "TBLPROPERTIES", 
			"TIMESTAMP", "TRUNCATE", "TO", "TRUE", "UNIFORM", "UPGRADE", "USING", 
			"VACUUM", "VERSION", "WHERE", "ZORDER", "STATISTICS", "EQ", "NSEQ", "NEQ", 
			"NEQJ", "LTE", "GTE", "CONCAT_PIPE", "STRING", "DOUBLEQUOTED_STRING", 
			"BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", 
			"DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
			"UNRECOGNIZED", "DELIMITER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DeltaSqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is folllowed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	public DeltaSqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DeltaSqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			statement();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(67);
				match(T__0);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RestoreContext extends StatementContext {
		public QualifiedNameContext table;
		public TemporalClauseContext clause;
		public TerminalNode RESTORE() { return getToken(DeltaSqlBaseParser.RESTORE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TemporalClauseContext temporalClause() {
			return getRuleContext(TemporalClauseContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(DeltaSqlBaseParser.TABLE, 0); }
		public TerminalNode TO() { return getToken(DeltaSqlBaseParser.TO, 0); }
		public RestoreContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterRestore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitRestore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitRestore(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AlterTableSyncIdentityContext extends StatementContext {
		public QualifiedNameContext table;
		public QualifiedNameContext column;
		public List<TerminalNode> ALTER() { return getTokens(DeltaSqlBaseParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(DeltaSqlBaseParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(DeltaSqlBaseParser.TABLE, 0); }
		public TerminalNode SYNC() { return getToken(DeltaSqlBaseParser.SYNC, 0); }
		public TerminalNode IDENTITY() { return getToken(DeltaSqlBaseParser.IDENTITY, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public TerminalNode CHANGE() { return getToken(DeltaSqlBaseParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(DeltaSqlBaseParser.COLUMN, 0); }
		public AlterTableSyncIdentityContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterAlterTableSyncIdentity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitAlterTableSyncIdentity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitAlterTableSyncIdentity(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AlterTableDropFeatureContext extends StatementContext {
		public QualifiedNameContext table;
		public FeatureNameValueContext featureName;
		public TerminalNode ALTER() { return getToken(DeltaSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(DeltaSqlBaseParser.TABLE, 0); }
		public TerminalNode DROP() { return getToken(DeltaSqlBaseParser.DROP, 0); }
		public TerminalNode FEATURE() { return getToken(DeltaSqlBaseParser.FEATURE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FeatureNameValueContext featureNameValue() {
			return getRuleContext(FeatureNameValueContext.class,0);
		}
		public TerminalNode TRUNCATE() { return getToken(DeltaSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode HISTORY() { return getToken(DeltaSqlBaseParser.HISTORY, 0); }
		public AlterTableDropFeatureContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterAlterTableDropFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitAlterTableDropFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitAlterTableDropFeature(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConvertContext extends StatementContext {
		public QualifiedNameContext table;
		public TerminalNode CONVERT() { return getToken(DeltaSqlBaseParser.CONVERT, 0); }
		public TerminalNode TO() { return getToken(DeltaSqlBaseParser.TO, 0); }
		public TerminalNode DELTA() { return getToken(DeltaSqlBaseParser.DELTA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode NO() { return getToken(DeltaSqlBaseParser.NO, 0); }
		public TerminalNode STATISTICS() { return getToken(DeltaSqlBaseParser.STATISTICS, 0); }
		public TerminalNode PARTITIONED() { return getToken(DeltaSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(DeltaSqlBaseParser.BY, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DeltaSqlBaseParser.LEFT_PAREN, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DeltaSqlBaseParser.RIGHT_PAREN, 0); }
		public ConvertContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterConvert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitConvert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitConvert(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeDeltaHistoryContext extends StatementContext {
		public StringLitContext path;
		public QualifiedNameContext table;
		public Token limit;
		public TerminalNode HISTORY() { return getToken(DeltaSqlBaseParser.HISTORY, 0); }
		public TerminalNode DESC() { return getToken(DeltaSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(DeltaSqlBaseParser.DESCRIBE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(DeltaSqlBaseParser.LIMIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(DeltaSqlBaseParser.INTEGER_VALUE, 0); }
		public DescribeDeltaHistoryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterDescribeDeltaHistory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitDescribeDeltaHistory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitDescribeDeltaHistory(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropTableConstraintContext extends StatementContext {
		public QualifiedNameContext table;
		public IdentifierContext name;
		public TerminalNode ALTER() { return getToken(DeltaSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(DeltaSqlBaseParser.TABLE, 0); }
		public TerminalNode DROP() { return getToken(DeltaSqlBaseParser.DROP, 0); }
		public TerminalNode CONSTRAINT() { return getToken(DeltaSqlBaseParser.CONSTRAINT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(DeltaSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(DeltaSqlBaseParser.EXISTS, 0); }
		public DropTableConstraintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterDropTableConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitDropTableConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitDropTableConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClusterByContext extends StatementContext {
		public List<ClusterBySpecContext> clusterBySpec() {
			return getRuleContexts(ClusterBySpecContext.class);
		}
		public ClusterBySpecContext clusterBySpec(int i) {
			return getRuleContext(ClusterBySpecContext.class,i);
		}
		public ClusterByContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterClusterBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitClusterBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitClusterBy(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReorgTableContext extends StatementContext {
		public QualifiedNameContext table;
		public PredicateTokenContext partitionPredicate;
		public Token version;
		public TerminalNode REORG() { return getToken(DeltaSqlBaseParser.REORG, 0); }
		public TerminalNode TABLE() { return getToken(DeltaSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode APPLY() { return getToken(DeltaSqlBaseParser.APPLY, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(DeltaSqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(DeltaSqlBaseParser.LEFT_PAREN, i);
		}
		public TerminalNode PURGE() { return getToken(DeltaSqlBaseParser.PURGE, 0); }
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(DeltaSqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(DeltaSqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode UPGRADE() { return getToken(DeltaSqlBaseParser.UPGRADE, 0); }
		public TerminalNode UNIFORM() { return getToken(DeltaSqlBaseParser.UNIFORM, 0); }
		public TerminalNode ICEBERG_COMPAT_VERSION() { return getToken(DeltaSqlBaseParser.ICEBERG_COMPAT_VERSION, 0); }
		public TerminalNode EQ() { return getToken(DeltaSqlBaseParser.EQ, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(DeltaSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode WHERE() { return getToken(DeltaSqlBaseParser.WHERE, 0); }
		public PredicateTokenContext predicateToken() {
			return getRuleContext(PredicateTokenContext.class,0);
		}
		public ReorgTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterReorgTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitReorgTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitReorgTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PassThroughContext extends StatementContext {
		public PassThroughContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterPassThrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitPassThrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitPassThrough(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeDeltaDetailContext extends StatementContext {
		public StringLitContext path;
		public QualifiedNameContext table;
		public TerminalNode DETAIL() { return getToken(DeltaSqlBaseParser.DETAIL, 0); }
		public TerminalNode DESC() { return getToken(DeltaSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(DeltaSqlBaseParser.DESCRIBE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public DescribeDeltaDetailContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterDescribeDeltaDetail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitDescribeDeltaDetail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitDescribeDeltaDetail(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptimizeTableContext extends StatementContext {
		public StringLitContext path;
		public QualifiedNameContext table;
		public PredicateTokenContext partitionPredicate;
		public TerminalNode OPTIMIZE() { return getToken(DeltaSqlBaseParser.OPTIMIZE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FULL() { return getToken(DeltaSqlBaseParser.FULL, 0); }
		public TerminalNode WHERE() { return getToken(DeltaSqlBaseParser.WHERE, 0); }
		public ZorderSpecContext zorderSpec() {
			return getRuleContext(ZorderSpecContext.class,0);
		}
		public PredicateTokenContext predicateToken() {
			return getRuleContext(PredicateTokenContext.class,0);
		}
		public OptimizeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterOptimizeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitOptimizeTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitOptimizeTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddTableConstraintContext extends StatementContext {
		public QualifiedNameContext table;
		public IdentifierContext name;
		public TerminalNode ALTER() { return getToken(DeltaSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(DeltaSqlBaseParser.TABLE, 0); }
		public TerminalNode ADD() { return getToken(DeltaSqlBaseParser.ADD, 0); }
		public TerminalNode CONSTRAINT() { return getToken(DeltaSqlBaseParser.CONSTRAINT, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AddTableConstraintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterAddTableConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitAddTableConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitAddTableConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CloneContext extends StatementContext {
		public QualifiedNameContext source;
		public TemporalClauseContext clause;
		public PropertyListContext tableProps;
		public StringLitContext location;
		public CloneTableHeaderContext cloneTableHeader() {
			return getRuleContext(CloneTableHeaderContext.class,0);
		}
		public TerminalNode SHALLOW() { return getToken(DeltaSqlBaseParser.SHALLOW, 0); }
		public TerminalNode CLONE() { return getToken(DeltaSqlBaseParser.CLONE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(DeltaSqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode LOCATION() { return getToken(DeltaSqlBaseParser.LOCATION, 0); }
		public TemporalClauseContext temporalClause() {
			return getRuleContext(TemporalClauseContext.class,0);
		}
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public CloneContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterClone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitClone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitClone(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VacuumTableContext extends StatementContext {
		public StringLitContext path;
		public QualifiedNameContext table;
		public TerminalNode VACUUM() { return getToken(DeltaSqlBaseParser.VACUUM, 0); }
		public VacuumModifiersContext vacuumModifiers() {
			return getRuleContext(VacuumModifiersContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public VacuumTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterVacuumTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitVacuumTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitVacuumTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenerateContext extends StatementContext {
		public IdentifierContext modeName;
		public QualifiedNameContext table;
		public TerminalNode GENERATE() { return getToken(DeltaSqlBaseParser.GENERATE, 0); }
		public TerminalNode FOR() { return getToken(DeltaSqlBaseParser.FOR, 0); }
		public TerminalNode TABLE() { return getToken(DeltaSqlBaseParser.TABLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public GenerateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterGenerate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitGenerate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitGenerate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AlterTableClusterByContext extends StatementContext {
		public QualifiedNameContext table;
		public TerminalNode ALTER() { return getToken(DeltaSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(DeltaSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ClusterBySpecContext clusterBySpec() {
			return getRuleContext(ClusterBySpecContext.class,0);
		}
		public TerminalNode CLUSTER() { return getToken(DeltaSqlBaseParser.CLUSTER, 0); }
		public TerminalNode BY() { return getToken(DeltaSqlBaseParser.BY, 0); }
		public TerminalNode NONE() { return getToken(DeltaSqlBaseParser.NONE, 0); }
		public AlterTableClusterByContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterAlterTableClusterBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitAlterTableClusterBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitAlterTableClusterBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new VacuumTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(VACUUM);
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case DOUBLEQUOTED_STRING:
					{
					setState(76);
					((VacuumTableContext)_localctx).path = stringLit();
					}
					break;
				case APPLY:
				case AS:
				case BY:
				case CHANGE:
				case CHECK:
				case CLONE:
				case CLUSTER:
				case COLUMN:
				case CONVERT:
				case DELTA:
				case DESC:
				case DESCRIBE:
				case DETAIL:
				case DRY:
				case EXISTS:
				case FEATURE:
				case FOR:
				case FULL:
				case GENERATE:
				case HOURS:
				case ICEBERG_COMPAT_VERSION:
				case IDENTITY:
				case INVENTORY:
				case LEFT_PAREN:
				case LIMIT:
				case LITE:
				case NO:
				case NONE:
				case OF:
				case OPTIMIZE:
				case REORG:
				case PARTITIONED:
				case PURGE:
				case RESTORE:
				case RETAIN:
				case RIGHT_PAREN:
				case RUN:
				case SHALLOW:
				case SYNC:
				case TABLE:
				case TRUNCATE:
				case TO:
				case UNIFORM:
				case UPGRADE:
				case USING:
				case VACUUM:
				case ZORDER:
				case STATISTICS:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(77);
					((VacuumTableContext)_localctx).table = qualifiedName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80);
				vacuumModifiers();
				}
				break;
			case 2:
				_localctx = new DescribeDeltaDetailContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(83);
				match(DETAIL);
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case DOUBLEQUOTED_STRING:
					{
					setState(84);
					((DescribeDeltaDetailContext)_localctx).path = stringLit();
					}
					break;
				case APPLY:
				case AS:
				case BY:
				case CHANGE:
				case CHECK:
				case CLONE:
				case CLUSTER:
				case COLUMN:
				case CONVERT:
				case DELTA:
				case DESC:
				case DESCRIBE:
				case DETAIL:
				case DRY:
				case EXISTS:
				case FEATURE:
				case FOR:
				case FULL:
				case GENERATE:
				case HOURS:
				case ICEBERG_COMPAT_VERSION:
				case IDENTITY:
				case INVENTORY:
				case LEFT_PAREN:
				case LIMIT:
				case LITE:
				case NO:
				case NONE:
				case OF:
				case OPTIMIZE:
				case REORG:
				case PARTITIONED:
				case PURGE:
				case RESTORE:
				case RETAIN:
				case RIGHT_PAREN:
				case RUN:
				case SHALLOW:
				case SYNC:
				case TABLE:
				case TRUNCATE:
				case TO:
				case UNIFORM:
				case UPGRADE:
				case USING:
				case VACUUM:
				case ZORDER:
				case STATISTICS:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(85);
					((DescribeDeltaDetailContext)_localctx).table = qualifiedName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				_localctx = new GenerateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(GENERATE);
				setState(89);
				((GenerateContext)_localctx).modeName = identifier();
				setState(90);
				match(FOR);
				setState(91);
				match(TABLE);
				setState(92);
				((GenerateContext)_localctx).table = qualifiedName();
				}
				break;
			case 4:
				_localctx = new DescribeDeltaHistoryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(95);
				match(HISTORY);
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case DOUBLEQUOTED_STRING:
					{
					setState(96);
					((DescribeDeltaHistoryContext)_localctx).path = stringLit();
					}
					break;
				case APPLY:
				case AS:
				case BY:
				case CHANGE:
				case CHECK:
				case CLONE:
				case CLUSTER:
				case COLUMN:
				case CONVERT:
				case DELTA:
				case DESC:
				case DESCRIBE:
				case DETAIL:
				case DRY:
				case EXISTS:
				case FEATURE:
				case FOR:
				case FULL:
				case GENERATE:
				case HOURS:
				case ICEBERG_COMPAT_VERSION:
				case IDENTITY:
				case INVENTORY:
				case LEFT_PAREN:
				case LIMIT:
				case LITE:
				case NO:
				case NONE:
				case OF:
				case OPTIMIZE:
				case REORG:
				case PARTITIONED:
				case PURGE:
				case RESTORE:
				case RETAIN:
				case RIGHT_PAREN:
				case RUN:
				case SHALLOW:
				case SYNC:
				case TABLE:
				case TRUNCATE:
				case TO:
				case UNIFORM:
				case UPGRADE:
				case USING:
				case VACUUM:
				case ZORDER:
				case STATISTICS:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(97);
					((DescribeDeltaHistoryContext)_localctx).table = qualifiedName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(100);
					match(LIMIT);
					setState(101);
					((DescribeDeltaHistoryContext)_localctx).limit = match(INTEGER_VALUE);
					}
				}

				}
				break;
			case 5:
				_localctx = new ConvertContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				match(CONVERT);
				setState(105);
				match(TO);
				setState(106);
				match(DELTA);
				setState(107);
				((ConvertContext)_localctx).table = qualifiedName();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(108);
					match(NO);
					setState(109);
					match(STATISTICS);
					}
				}

				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(112);
					match(PARTITIONED);
					setState(113);
					match(BY);
					setState(114);
					match(LEFT_PAREN);
					setState(115);
					colTypeList();
					setState(116);
					match(RIGHT_PAREN);
					}
				}

				}
				break;
			case 6:
				_localctx = new RestoreContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				match(RESTORE);
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(121);
					match(TABLE);
					}
					break;
				}
				setState(124);
				((RestoreContext)_localctx).table = qualifiedName();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(125);
					match(TO);
					}
				}

				setState(128);
				((RestoreContext)_localctx).clause = temporalClause();
				}
				break;
			case 7:
				_localctx = new AddTableConstraintContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				match(ALTER);
				setState(131);
				match(TABLE);
				setState(132);
				((AddTableConstraintContext)_localctx).table = qualifiedName();
				setState(133);
				match(ADD);
				setState(134);
				match(CONSTRAINT);
				setState(135);
				((AddTableConstraintContext)_localctx).name = identifier();
				setState(136);
				constraint();
				}
				break;
			case 8:
				_localctx = new DropTableConstraintContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(138);
				match(ALTER);
				setState(139);
				match(TABLE);
				setState(140);
				((DropTableConstraintContext)_localctx).table = qualifiedName();
				setState(141);
				match(DROP);
				setState(142);
				match(CONSTRAINT);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(143);
					match(IF);
					setState(144);
					match(EXISTS);
					}
				}

				setState(147);
				((DropTableConstraintContext)_localctx).name = identifier();
				}
				break;
			case 9:
				_localctx = new AlterTableDropFeatureContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(149);
				match(ALTER);
				setState(150);
				match(TABLE);
				setState(151);
				((AlterTableDropFeatureContext)_localctx).table = qualifiedName();
				setState(152);
				match(DROP);
				setState(153);
				match(FEATURE);
				setState(154);
				((AlterTableDropFeatureContext)_localctx).featureName = featureNameValue();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRUNCATE) {
					{
					setState(155);
					match(TRUNCATE);
					setState(156);
					match(HISTORY);
					}
				}

				}
				break;
			case 10:
				_localctx = new AlterTableClusterByContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(159);
				match(ALTER);
				setState(160);
				match(TABLE);
				setState(161);
				((AlterTableClusterByContext)_localctx).table = qualifiedName();
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(162);
					clusterBySpec();
					}
					break;
				case 2:
					{
					setState(163);
					match(CLUSTER);
					setState(164);
					match(BY);
					setState(165);
					match(NONE);
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new AlterTableSyncIdentityContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(168);
				match(ALTER);
				setState(169);
				match(TABLE);
				setState(170);
				((AlterTableSyncIdentityContext)_localctx).table = qualifiedName();
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(172);
					match(COLUMN);
					}
					break;
				}
				setState(175);
				((AlterTableSyncIdentityContext)_localctx).column = qualifiedName();
				setState(176);
				match(SYNC);
				setState(177);
				match(IDENTITY);
				}
				break;
			case 12:
				_localctx = new OptimizeTableContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(179);
				match(OPTIMIZE);
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case DOUBLEQUOTED_STRING:
					{
					setState(180);
					((OptimizeTableContext)_localctx).path = stringLit();
					}
					break;
				case APPLY:
				case AS:
				case BY:
				case CHANGE:
				case CHECK:
				case CLONE:
				case CLUSTER:
				case COLUMN:
				case CONVERT:
				case DELTA:
				case DESC:
				case DESCRIBE:
				case DETAIL:
				case DRY:
				case EXISTS:
				case FEATURE:
				case FOR:
				case FULL:
				case GENERATE:
				case HOURS:
				case ICEBERG_COMPAT_VERSION:
				case IDENTITY:
				case INVENTORY:
				case LEFT_PAREN:
				case LIMIT:
				case LITE:
				case NO:
				case NONE:
				case OF:
				case OPTIMIZE:
				case REORG:
				case PARTITIONED:
				case PURGE:
				case RESTORE:
				case RETAIN:
				case RIGHT_PAREN:
				case RUN:
				case SHALLOW:
				case SYNC:
				case TABLE:
				case TRUNCATE:
				case TO:
				case UNIFORM:
				case UPGRADE:
				case USING:
				case VACUUM:
				case ZORDER:
				case STATISTICS:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(181);
					((OptimizeTableContext)_localctx).table = qualifiedName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FULL) {
					{
					setState(184);
					match(FULL);
					}
				}

				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(187);
					match(WHERE);
					setState(188);
					((OptimizeTableContext)_localctx).partitionPredicate = predicateToken();
					}
				}

				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ZORDER) {
					{
					setState(191);
					zorderSpec();
					}
				}

				}
				break;
			case 13:
				_localctx = new ReorgTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(194);
				match(REORG);
				setState(195);
				match(TABLE);
				setState(196);
				((ReorgTableContext)_localctx).table = qualifiedName();
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHERE) {
						{
						setState(197);
						match(WHERE);
						setState(198);
						((ReorgTableContext)_localctx).partitionPredicate = predicateToken();
						}
					}

					setState(201);
					match(APPLY);
					setState(202);
					match(LEFT_PAREN);
					setState(203);
					match(PURGE);
					setState(204);
					match(RIGHT_PAREN);
					}
					break;
				case 2:
					{
					setState(205);
					match(APPLY);
					setState(206);
					match(LEFT_PAREN);
					setState(207);
					match(UPGRADE);
					setState(208);
					match(UNIFORM);
					setState(209);
					match(LEFT_PAREN);
					setState(210);
					match(ICEBERG_COMPAT_VERSION);
					setState(211);
					match(EQ);
					setState(212);
					((ReorgTableContext)_localctx).version = match(INTEGER_VALUE);
					setState(213);
					match(RIGHT_PAREN);
					setState(214);
					match(RIGHT_PAREN);
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new CloneContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(217);
				cloneTableHeader();
				setState(218);
				match(SHALLOW);
				setState(219);
				match(CLONE);
				setState(220);
				((CloneContext)_localctx).source = qualifiedName();
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & 8836895211521L) != 0)) {
					{
					setState(221);
					((CloneContext)_localctx).clause = temporalClause();
					}
				}

				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(224);
					match(TBLPROPERTIES);
					setState(225);
					((CloneContext)_localctx).tableProps = propertyList();
					}
				}

				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(228);
					match(LOCATION);
					setState(229);
					((CloneContext)_localctx).location = stringLit();
					}
				}

				}
				break;
			case 15:
				_localctx = new ClusterByContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(232);
						matchWildcard();
						}
						} 
					}
					setState(237);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(239); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(238);
						clusterBySpec();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(241); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(243);
						matchWildcard();
						}
						} 
					}
					setState(248);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case 16:
				_localctx = new PassThroughContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(249);
						matchWildcard();
						}
						} 
					}
					setState(254);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableHeaderContext extends ParserRuleContext {
		public QualifiedNameContext table;
		public TerminalNode CREATE() { return getToken(DeltaSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(DeltaSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(DeltaSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DeltaSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DeltaSqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(CREATE);
			setState(258);
			match(TABLE);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(259);
				match(IF);
				setState(260);
				match(NOT);
				setState(261);
				match(EXISTS);
				}
			}

			setState(264);
			((CreateTableHeaderContext)_localctx).table = qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public QualifiedNameContext table;
		public TerminalNode REPLACE() { return getToken(DeltaSqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(DeltaSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(DeltaSqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(DeltaSqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitReplaceTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitReplaceTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(266);
				match(CREATE);
				setState(267);
				match(OR);
				}
			}

			setState(270);
			match(REPLACE);
			setState(271);
			match(TABLE);
			setState(272);
			((ReplaceTableHeaderContext)_localctx).table = qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CloneTableHeaderContext extends ParserRuleContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public CloneTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cloneTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterCloneTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitCloneTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitCloneTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloneTableHeaderContext cloneTableHeader() throws RecognitionException {
		CloneTableHeaderContext _localctx = new CloneTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cloneTableHeader);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				createTableHeader();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				replaceTableHeader();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ZorderSpecContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName;
		public List<QualifiedNameContext> interleave = new ArrayList<QualifiedNameContext>();
		public TerminalNode ZORDER() { return getToken(DeltaSqlBaseParser.ZORDER, 0); }
		public TerminalNode BY() { return getToken(DeltaSqlBaseParser.BY, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DeltaSqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DeltaSqlBaseParser.RIGHT_PAREN, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DeltaSqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DeltaSqlBaseParser.COMMA, i);
		}
		public ZorderSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zorderSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterZorderSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitZorderSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitZorderSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZorderSpecContext zorderSpec() throws RecognitionException {
		ZorderSpecContext _localctx = new ZorderSpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_zorderSpec);
		int _la;
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(ZORDER);
				setState(279);
				match(BY);
				setState(280);
				match(LEFT_PAREN);
				setState(281);
				((ZorderSpecContext)_localctx).qualifiedName = qualifiedName();
				((ZorderSpecContext)_localctx).interleave.add(((ZorderSpecContext)_localctx).qualifiedName);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(282);
					match(COMMA);
					setState(283);
					((ZorderSpecContext)_localctx).qualifiedName = qualifiedName();
					((ZorderSpecContext)_localctx).interleave.add(((ZorderSpecContext)_localctx).qualifiedName);
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(289);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(ZORDER);
				setState(292);
				match(BY);
				setState(293);
				((ZorderSpecContext)_localctx).qualifiedName = qualifiedName();
				((ZorderSpecContext)_localctx).interleave.add(((ZorderSpecContext)_localctx).qualifiedName);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(294);
					match(COMMA);
					setState(295);
					((ZorderSpecContext)_localctx).qualifiedName = qualifiedName();
					((ZorderSpecContext)_localctx).interleave.add(((ZorderSpecContext)_localctx).qualifiedName);
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClusterBySpecContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName;
		public List<QualifiedNameContext> interleave = new ArrayList<QualifiedNameContext>();
		public TerminalNode CLUSTER() { return getToken(DeltaSqlBaseParser.CLUSTER, 0); }
		public TerminalNode BY() { return getToken(DeltaSqlBaseParser.BY, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DeltaSqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DeltaSqlBaseParser.RIGHT_PAREN, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DeltaSqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DeltaSqlBaseParser.COMMA, i);
		}
		public ClusterBySpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterBySpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterClusterBySpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitClusterBySpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitClusterBySpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClusterBySpecContext clusterBySpec() throws RecognitionException {
		ClusterBySpecContext _localctx = new ClusterBySpecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_clusterBySpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(CLUSTER);
			setState(304);
			match(BY);
			setState(305);
			match(LEFT_PAREN);
			setState(306);
			((ClusterBySpecContext)_localctx).qualifiedName = qualifiedName();
			((ClusterBySpecContext)_localctx).interleave.add(((ClusterBySpecContext)_localctx).qualifiedName);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(307);
				match(COMMA);
				setState(308);
				((ClusterBySpecContext)_localctx).qualifiedName = qualifiedName();
				((ClusterBySpecContext)_localctx).interleave.add(((ClusterBySpecContext)_localctx).qualifiedName);
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemporalClauseContext extends ParserRuleContext {
		public Token version;
		public Token timestamp;
		public TerminalNode AS() { return getToken(DeltaSqlBaseParser.AS, 0); }
		public TerminalNode OF() { return getToken(DeltaSqlBaseParser.OF, 0); }
		public TerminalNode SYSTEM_VERSION() { return getToken(DeltaSqlBaseParser.SYSTEM_VERSION, 0); }
		public TerminalNode VERSION() { return getToken(DeltaSqlBaseParser.VERSION, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(DeltaSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode STRING() { return getToken(DeltaSqlBaseParser.STRING, 0); }
		public TerminalNode FOR() { return getToken(DeltaSqlBaseParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(DeltaSqlBaseParser.SYSTEM_TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(DeltaSqlBaseParser.TIMESTAMP, 0); }
		public TemporalClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporalClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterTemporalClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitTemporalClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitTemporalClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemporalClauseContext temporalClause() throws RecognitionException {
		TemporalClauseContext _localctx = new TemporalClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_temporalClause);
		int _la;
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(316);
					match(FOR);
					}
				}

				setState(319);
				_la = _input.LA(1);
				if ( !(_la==SYSTEM_VERSION || _la==VERSION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				match(AS);
				setState(321);
				match(OF);
				setState(322);
				((TemporalClauseContext)_localctx).version = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==INTEGER_VALUE) ) {
					((TemporalClauseContext)_localctx).version = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(323);
					match(FOR);
					}
				}

				setState(326);
				_la = _input.LA(1);
				if ( !(_la==SYSTEM_TIME || _la==TIMESTAMP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(327);
				match(AS);
				setState(328);
				match(OF);
				setState(329);
				((TemporalClauseContext)_localctx).timestamp = match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(DeltaSqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DeltaSqlBaseParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_qualifiedName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			identifier();
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(333);
					match(DOT);
					setState(334);
					identifier();
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(340);
				match(DOT);
				setState(341);
				identifier();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DeltaSqlBaseParser.LEFT_PAREN, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DeltaSqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DeltaSqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DeltaSqlBaseParser.COMMA, i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(LEFT_PAREN);
			setState(348);
			property();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(349);
				match(COMMA);
				setState(350);
				property();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public PropertyKeyContext key;
		public PropertyValueContext value;
		public PropertyKeyContext propertyKey() {
			return getRuleContext(PropertyKeyContext.class,0);
		}
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(DeltaSqlBaseParser.EQ, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((PropertyContext)_localctx).key = propertyKey();
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(359);
					match(EQ);
					}
				}

				setState(362);
				((PropertyContext)_localctx).value = propertyValue();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(DeltaSqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DeltaSqlBaseParser.DOT, i);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterPropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitPropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitPropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyKeyContext propertyKey() throws RecognitionException {
		PropertyKeyContext _localctx = new PropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_propertyKey);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPLY:
			case AS:
			case BY:
			case CHANGE:
			case CHECK:
			case CLONE:
			case CLUSTER:
			case COLUMN:
			case CONVERT:
			case DELTA:
			case DESC:
			case DESCRIBE:
			case DETAIL:
			case DRY:
			case EXISTS:
			case FEATURE:
			case FOR:
			case FULL:
			case GENERATE:
			case HOURS:
			case ICEBERG_COMPAT_VERSION:
			case IDENTITY:
			case INVENTORY:
			case LEFT_PAREN:
			case LIMIT:
			case LITE:
			case NO:
			case NONE:
			case OF:
			case OPTIMIZE:
			case REORG:
			case PARTITIONED:
			case PURGE:
			case RESTORE:
			case RETAIN:
			case RIGHT_PAREN:
			case RUN:
			case SHALLOW:
			case SYNC:
			case TABLE:
			case TRUNCATE:
			case TO:
			case UNIFORM:
			case UPGRADE:
			case USING:
			case VACUUM:
			case ZORDER:
			case STATISTICS:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				identifier();
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(366);
					match(DOT);
					setState(367);
					identifier();
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
			case DOUBLEQUOTED_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				stringLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyValueContext extends ParserRuleContext {
		public StringLitContext value;
		public TerminalNode INTEGER_VALUE() { return getToken(DeltaSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(DeltaSqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DeltaSqlBaseParser.LEFT_PAREN, 0); }
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DeltaSqlBaseParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DeltaSqlBaseParser.RIGHT_PAREN, 0); }
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterPropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitPropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitPropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_propertyValue);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				booleanValue();
				}
				break;
			case APPLY:
			case AS:
			case BY:
			case CHANGE:
			case CHECK:
			case CLONE:
			case CLUSTER:
			case COLUMN:
			case CONVERT:
			case DELTA:
			case DESC:
			case DESCRIBE:
			case DETAIL:
			case DRY:
			case EXISTS:
			case FEATURE:
			case FOR:
			case FULL:
			case GENERATE:
			case HOURS:
			case ICEBERG_COMPAT_VERSION:
			case IDENTITY:
			case INVENTORY:
			case LEFT_PAREN:
			case LIMIT:
			case LITE:
			case NO:
			case NONE:
			case OF:
			case OPTIMIZE:
			case REORG:
			case PARTITIONED:
			case PURGE:
			case RESTORE:
			case RETAIN:
			case RIGHT_PAREN:
			case RUN:
			case SHALLOW:
			case SYNC:
			case TABLE:
			case TRUNCATE:
			case TO:
			case UNIFORM:
			case UPGRADE:
			case USING:
			case VACUUM:
			case ZORDER:
			case STATISTICS:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
				identifier();
				setState(380);
				match(LEFT_PAREN);
				setState(381);
				stringLit();
				setState(382);
				match(COMMA);
				setState(383);
				stringLit();
				setState(384);
				match(RIGHT_PAREN);
				}
				break;
			case STRING:
			case DOUBLEQUOTED_STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				((PropertyValueContext)_localctx).value = stringLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FeatureNameValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public FeatureNameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureNameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterFeatureNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitFeatureNameValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitFeatureNameValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureNameValueContext featureNameValue() throws RecognitionException {
		FeatureNameValueContext _localctx = new FeatureNameValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_featureNameValue);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPLY:
			case AS:
			case BY:
			case CHANGE:
			case CHECK:
			case CLONE:
			case CLUSTER:
			case COLUMN:
			case CONVERT:
			case DELTA:
			case DESC:
			case DESCRIBE:
			case DETAIL:
			case DRY:
			case EXISTS:
			case FEATURE:
			case FOR:
			case FULL:
			case GENERATE:
			case HOURS:
			case ICEBERG_COMPAT_VERSION:
			case IDENTITY:
			case INVENTORY:
			case LEFT_PAREN:
			case LIMIT:
			case LITE:
			case NO:
			case NONE:
			case OF:
			case OPTIMIZE:
			case REORG:
			case PARTITIONED:
			case PURGE:
			case RESTORE:
			case RETAIN:
			case RIGHT_PAREN:
			case RUN:
			case SHALLOW:
			case SYNC:
			case TABLE:
			case TRUNCATE:
			case TO:
			case UNIFORM:
			case UPGRADE:
			case USING:
			case VACUUM:
			case ZORDER:
			case STATISTICS:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				identifier();
				}
				break;
			case STRING:
			case DOUBLEQUOTED_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				stringLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleStringLitContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DeltaSqlBaseParser.STRING, 0); }
		public TerminalNode DOUBLEQUOTED_STRING() { return getToken(DeltaSqlBaseParser.DOUBLEQUOTED_STRING, 0); }
		public SingleStringLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStringLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterSingleStringLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitSingleStringLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitSingleStringLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStringLitContext singleStringLit() throws RecognitionException {
		SingleStringLitContext _localctx = new SingleStringLitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_singleStringLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==DOUBLEQUOTED_STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLitContext extends ParserRuleContext {
		public List<SingleStringLitContext> singleStringLit() {
			return getRuleContexts(SingleStringLitContext.class);
		}
		public SingleStringLitContext singleStringLit(int i) {
			return getRuleContext(SingleStringLitContext.class,i);
		}
		public StringLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterStringLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitStringLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitStringLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLitContext stringLit() throws RecognitionException {
		StringLitContext _localctx = new StringLitContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stringLit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(395);
					singleStringLit();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(398); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(DeltaSqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DeltaSqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierAlternativeContext extends IdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(DeltaSqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_identifier);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				quotedIdentifier();
				}
				break;
			case APPLY:
			case AS:
			case BY:
			case CHANGE:
			case CHECK:
			case CLONE:
			case CLUSTER:
			case COLUMN:
			case CONVERT:
			case DELTA:
			case DESC:
			case DESCRIBE:
			case DETAIL:
			case DRY:
			case EXISTS:
			case FEATURE:
			case FOR:
			case FULL:
			case GENERATE:
			case HOURS:
			case ICEBERG_COMPAT_VERSION:
			case IDENTITY:
			case INVENTORY:
			case LEFT_PAREN:
			case LIMIT:
			case LITE:
			case NO:
			case NONE:
			case OF:
			case OPTIMIZE:
			case REORG:
			case PARTITIONED:
			case PURGE:
			case RESTORE:
			case RETAIN:
			case RIGHT_PAREN:
			case RUN:
			case SHALLOW:
			case SYNC:
			case TABLE:
			case TRUNCATE:
			case TO:
			case UNIFORM:
			case UPGRADE:
			case USING:
			case VACUUM:
			case ZORDER:
			case STATISTICS:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				nonReserved();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(DeltaSqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DeltaSqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DeltaSqlBaseParser.COMMA, i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_colTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			colType();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(410);
				match(COMMA);
				setState(411);
				colType();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext colName;
		public StringLitContext comment;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DeltaSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(DeltaSqlBaseParser.NULL, 0); }
		public TerminalNode COMMENT() { return getToken(DeltaSqlBaseParser.COMMENT, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_colType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			((ColTypeContext)_localctx).colName = identifier();
			setState(418);
			dataType();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(419);
				match(NOT);
				setState(420);
				match(NULL);
				}
			}

			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(423);
				match(COMMENT);
				setState(424);
				((ColTypeContext)_localctx).comment = stringLit();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DeltaSqlBaseParser.LEFT_PAREN, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(DeltaSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(DeltaSqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DeltaSqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DeltaSqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DeltaSqlBaseParser.COMMA, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dataType);
		int _la;
		try {
			_localctx = new PrimitiveDataTypeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			identifier();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(428);
				match(LEFT_PAREN);
				setState(429);
				match(INTEGER_VALUE);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(430);
					match(COMMA);
					setState(431);
					match(INTEGER_VALUE);
					}
					}
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(437);
				match(RIGHT_PAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VacuumModifiersContext extends ParserRuleContext {
		public List<VacuumTypeContext> vacuumType() {
			return getRuleContexts(VacuumTypeContext.class);
		}
		public VacuumTypeContext vacuumType(int i) {
			return getRuleContext(VacuumTypeContext.class,i);
		}
		public List<InventoryContext> inventory() {
			return getRuleContexts(InventoryContext.class);
		}
		public InventoryContext inventory(int i) {
			return getRuleContext(InventoryContext.class,i);
		}
		public List<RetainContext> retain() {
			return getRuleContexts(RetainContext.class);
		}
		public RetainContext retain(int i) {
			return getRuleContext(RetainContext.class,i);
		}
		public List<DryRunContext> dryRun() {
			return getRuleContexts(DryRunContext.class);
		}
		public DryRunContext dryRun(int i) {
			return getRuleContext(DryRunContext.class,i);
		}
		public VacuumModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuumModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterVacuumModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitVacuumModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitVacuumModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VacuumModifiersContext vacuumModifiers() throws RecognitionException {
		VacuumModifiersContext _localctx = new VacuumModifiersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_vacuumModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 35185445863457L) != 0)) {
				{
				setState(444);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FULL:
				case LITE:
					{
					setState(440);
					vacuumType();
					}
					break;
				case USING:
					{
					setState(441);
					inventory();
					}
					break;
				case RETAIN:
					{
					setState(442);
					retain();
					}
					break;
				case DRY:
					{
					setState(443);
					dryRun();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VacuumTypeContext extends ParserRuleContext {
		public TerminalNode LITE() { return getToken(DeltaSqlBaseParser.LITE, 0); }
		public TerminalNode FULL() { return getToken(DeltaSqlBaseParser.FULL, 0); }
		public VacuumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterVacuumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitVacuumType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitVacuumType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VacuumTypeContext vacuumType() throws RecognitionException {
		VacuumTypeContext _localctx = new VacuumTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_vacuumType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_la = _input.LA(1);
			if ( !(_la==FULL || _la==LITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InventoryContext extends ParserRuleContext {
		public QualifiedNameContext inventoryTable;
		public SubQueryContext inventoryQuery;
		public TerminalNode USING() { return getToken(DeltaSqlBaseParser.USING, 0); }
		public TerminalNode INVENTORY() { return getToken(DeltaSqlBaseParser.INVENTORY, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DeltaSqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DeltaSqlBaseParser.RIGHT_PAREN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SubQueryContext subQuery() {
			return getRuleContext(SubQueryContext.class,0);
		}
		public InventoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inventory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterInventory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitInventory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitInventory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InventoryContext inventory() throws RecognitionException {
		InventoryContext _localctx = new InventoryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_inventory);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(USING);
			setState(452);
			match(INVENTORY);
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(453);
				((InventoryContext)_localctx).inventoryTable = qualifiedName();
				}
				break;
			case 2:
				{
				setState(454);
				match(LEFT_PAREN);
				setState(455);
				((InventoryContext)_localctx).inventoryQuery = subQuery();
				setState(456);
				match(RIGHT_PAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetainContext extends ParserRuleContext {
		public TerminalNode RETAIN() { return getToken(DeltaSqlBaseParser.RETAIN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode HOURS() { return getToken(DeltaSqlBaseParser.HOURS, 0); }
		public RetainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterRetain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitRetain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitRetain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetainContext retain() throws RecognitionException {
		RetainContext _localctx = new RetainContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_retain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(RETAIN);
			setState(461);
			number();
			setState(462);
			match(HOURS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DryRunContext extends ParserRuleContext {
		public TerminalNode DRY() { return getToken(DeltaSqlBaseParser.DRY, 0); }
		public TerminalNode RUN() { return getToken(DeltaSqlBaseParser.RUN, 0); }
		public DryRunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dryRun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterDryRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitDryRun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitDryRun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DryRunContext dryRun() throws RecognitionException {
		DryRunContext _localctx = new DryRunContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dryRun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(DRY);
			setState(465);
			match(RUN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(DeltaSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(DeltaSqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(DeltaSqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(DeltaSqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(DeltaSqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(DeltaSqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(DeltaSqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(DeltaSqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(DeltaSqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(DeltaSqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(DeltaSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(DeltaSqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(DeltaSqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(DeltaSqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_number);
		int _la;
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(467);
					match(MINUS);
					}
				}

				setState(470);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(471);
					match(MINUS);
					}
				}

				setState(474);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(475);
					match(MINUS);
					}
				}

				setState(478);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(479);
					match(MINUS);
					}
				}

				setState(482);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(483);
					match(MINUS);
					}
				}

				setState(486);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(487);
					match(MINUS);
					}
				}

				setState(490);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(491);
					match(MINUS);
					}
				}

				setState(494);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintContext extends ParserRuleContext {
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
	 
		public ConstraintContext() { }
		public void copyFrom(ConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckConstraintContext extends ConstraintContext {
		public TerminalNode CHECK() { return getToken(DeltaSqlBaseParser.CHECK, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DeltaSqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DeltaSqlBaseParser.RIGHT_PAREN, 0); }
		public List<ExprTokenContext> exprToken() {
			return getRuleContexts(ExprTokenContext.class);
		}
		public ExprTokenContext exprToken(int i) {
			return getRuleContext(ExprTokenContext.class,i);
		}
		public CheckConstraintContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterCheckConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitCheckConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitCheckConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constraint);
		try {
			int _alt;
			_localctx = new CheckConstraintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(CHECK);
			setState(498);
			match(LEFT_PAREN);
			setState(500); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(499);
					exprToken();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(502); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(504);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateTokenContext extends ParserRuleContext {
		public PredicateTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterPredicateToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitPredicateToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitPredicateToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateTokenContext predicateToken() throws RecognitionException {
		PredicateTokenContext _localctx = new PredicateTokenContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_predicateToken);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(506);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(509); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubQueryContext extends ParserRuleContext {
		public SubQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterSubQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitSubQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitSubQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubQueryContext subQuery() throws RecognitionException {
		SubQueryContext _localctx = new SubQueryContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_subQuery);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(512); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(511);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(514); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprTokenContext extends ParserRuleContext {
		public ExprTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterExprToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitExprToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitExprToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprTokenContext exprToken() throws RecognitionException {
		ExprTokenContext _localctx = new ExprTokenContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_exprToken);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(516);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(519); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode VACUUM() { return getToken(DeltaSqlBaseParser.VACUUM, 0); }
		public TerminalNode FULL() { return getToken(DeltaSqlBaseParser.FULL, 0); }
		public TerminalNode LITE() { return getToken(DeltaSqlBaseParser.LITE, 0); }
		public TerminalNode USING() { return getToken(DeltaSqlBaseParser.USING, 0); }
		public TerminalNode INVENTORY() { return getToken(DeltaSqlBaseParser.INVENTORY, 0); }
		public TerminalNode RETAIN() { return getToken(DeltaSqlBaseParser.RETAIN, 0); }
		public TerminalNode HOURS() { return getToken(DeltaSqlBaseParser.HOURS, 0); }
		public TerminalNode DRY() { return getToken(DeltaSqlBaseParser.DRY, 0); }
		public TerminalNode RUN() { return getToken(DeltaSqlBaseParser.RUN, 0); }
		public TerminalNode CONVERT() { return getToken(DeltaSqlBaseParser.CONVERT, 0); }
		public TerminalNode TO() { return getToken(DeltaSqlBaseParser.TO, 0); }
		public TerminalNode DELTA() { return getToken(DeltaSqlBaseParser.DELTA, 0); }
		public TerminalNode PARTITIONED() { return getToken(DeltaSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(DeltaSqlBaseParser.BY, 0); }
		public TerminalNode DESC() { return getToken(DeltaSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(DeltaSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode LIMIT() { return getToken(DeltaSqlBaseParser.LIMIT, 0); }
		public TerminalNode DETAIL() { return getToken(DeltaSqlBaseParser.DETAIL, 0); }
		public TerminalNode GENERATE() { return getToken(DeltaSqlBaseParser.GENERATE, 0); }
		public TerminalNode FOR() { return getToken(DeltaSqlBaseParser.FOR, 0); }
		public TerminalNode TABLE() { return getToken(DeltaSqlBaseParser.TABLE, 0); }
		public TerminalNode CHECK() { return getToken(DeltaSqlBaseParser.CHECK, 0); }
		public TerminalNode EXISTS() { return getToken(DeltaSqlBaseParser.EXISTS, 0); }
		public TerminalNode OPTIMIZE() { return getToken(DeltaSqlBaseParser.OPTIMIZE, 0); }
		public TerminalNode IDENTITY() { return getToken(DeltaSqlBaseParser.IDENTITY, 0); }
		public TerminalNode SYNC() { return getToken(DeltaSqlBaseParser.SYNC, 0); }
		public TerminalNode COLUMN() { return getToken(DeltaSqlBaseParser.COLUMN, 0); }
		public TerminalNode CHANGE() { return getToken(DeltaSqlBaseParser.CHANGE, 0); }
		public TerminalNode REORG() { return getToken(DeltaSqlBaseParser.REORG, 0); }
		public TerminalNode APPLY() { return getToken(DeltaSqlBaseParser.APPLY, 0); }
		public TerminalNode PURGE() { return getToken(DeltaSqlBaseParser.PURGE, 0); }
		public TerminalNode UPGRADE() { return getToken(DeltaSqlBaseParser.UPGRADE, 0); }
		public TerminalNode UNIFORM() { return getToken(DeltaSqlBaseParser.UNIFORM, 0); }
		public TerminalNode ICEBERG_COMPAT_VERSION() { return getToken(DeltaSqlBaseParser.ICEBERG_COMPAT_VERSION, 0); }
		public TerminalNode RESTORE() { return getToken(DeltaSqlBaseParser.RESTORE, 0); }
		public TerminalNode AS() { return getToken(DeltaSqlBaseParser.AS, 0); }
		public TerminalNode OF() { return getToken(DeltaSqlBaseParser.OF, 0); }
		public TerminalNode ZORDER() { return getToken(DeltaSqlBaseParser.ZORDER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DeltaSqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DeltaSqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode NO() { return getToken(DeltaSqlBaseParser.NO, 0); }
		public TerminalNode STATISTICS() { return getToken(DeltaSqlBaseParser.STATISTICS, 0); }
		public TerminalNode CLONE() { return getToken(DeltaSqlBaseParser.CLONE, 0); }
		public TerminalNode SHALLOW() { return getToken(DeltaSqlBaseParser.SHALLOW, 0); }
		public TerminalNode FEATURE() { return getToken(DeltaSqlBaseParser.FEATURE, 0); }
		public TerminalNode TRUNCATE() { return getToken(DeltaSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode CLUSTER() { return getToken(DeltaSqlBaseParser.CLUSTER, 0); }
		public TerminalNode NONE() { return getToken(DeltaSqlBaseParser.NONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaSqlBaseListener ) ((DeltaSqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaSqlBaseVisitor ) return ((DeltaSqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -7784570380494139408L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 829L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001`\u020c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0005\u0000"+
		"E\b\u0000\n\u0000\f\u0000H\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001O\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001W\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001c\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001g\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001o\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001w\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001{\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u007f\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0092\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u009e\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u00a7\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u00ae\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00b7\b\u0001\u0001"+
		"\u0001\u0003\u0001\u00ba\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00be"+
		"\b\u0001\u0001\u0001\u0003\u0001\u00c1\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00c8\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u00d8\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u00df\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u00e3\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00e7\b"+
		"\u0001\u0001\u0001\u0005\u0001\u00ea\b\u0001\n\u0001\f\u0001\u00ed\t\u0001"+
		"\u0001\u0001\u0004\u0001\u00f0\b\u0001\u000b\u0001\f\u0001\u00f1\u0001"+
		"\u0001\u0005\u0001\u00f5\b\u0001\n\u0001\f\u0001\u00f8\t\u0001\u0001\u0001"+
		"\u0005\u0001\u00fb\b\u0001\n\u0001\f\u0001\u00fe\t\u0001\u0003\u0001\u0100"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0107\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u010d\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0115\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u011d\b\u0005\n"+
		"\u0005\f\u0005\u0120\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0129\b\u0005\n"+
		"\u0005\f\u0005\u012c\t\u0005\u0003\u0005\u012e\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0136"+
		"\b\u0006\n\u0006\f\u0006\u0139\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0003\u0007\u013e\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0145\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u014b\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u0150\b\b\n\b\f\b\u0153\t\b\u0001\b\u0001\b\u0005\b\u0157\b\b\n\b\f\b"+
		"\u015a\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0160\b\t\n\t\f\t\u0163"+
		"\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n\u0169\b\n\u0001\n\u0003\n"+
		"\u016c\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0171\b\u000b"+
		"\n\u000b\f\u000b\u0174\t\u000b\u0001\u000b\u0003\u000b\u0177\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0184\b\f\u0001\r\u0001\r\u0003\r\u0188\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0004\u000f\u018d\b\u000f\u000b\u000f\f\u000f"+
		"\u018e\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0196\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u019d\b\u0013\n\u0013\f\u0013\u01a0\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01a6\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u01aa\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u01b1\b\u0015\n\u0015\f\u0015\u01b4"+
		"\t\u0015\u0001\u0015\u0003\u0015\u01b7\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u01bd\b\u0016\n\u0016\f\u0016\u01c0"+
		"\t\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01cb\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0003\u001b\u01d5\b\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u01d9\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01dd\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u01e1\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u01e5\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01e9\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01ed\b\u001b\u0001\u001b\u0003"+
		"\u001b\u01f0\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0004\u001c\u01f5"+
		"\b\u001c\u000b\u001c\f\u001c\u01f6\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0004\u001d\u01fc\b\u001d\u000b\u001d\f\u001d\u01fd\u0001\u001e\u0004"+
		"\u001e\u0201\b\u001e\u000b\u001e\f\u001e\u0202\u0001\u001f\u0004\u001f"+
		"\u0206\b\u001f\u000b\u001f\f\u001f\u0207\u0001 \u0001 \u0001 \u0006\u00eb"+
		"\u00f6\u00fc\u01fd\u0202\u0207\u0000!\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000"+
		"\t\u0001\u0000\u0012\u0013\u0002\u0000\u0003\u0003\u0007\u0007\u0002\u0000"+
		";;FF\u0002\u0000QQVV\u0002\u0000::>>\u0001\u0000QR\u0002\u0000\u0019\u0019"+
		"AA\u0002\u0000\u001c\u001c&&\u000f\u0000\u0004\u000b\u000f\u000f\u0011"+
		"\u0014\u0017\u0018\u001a\u001d\u001f!#&)*--/249<<?@BEHI\u0247\u0000B\u0001"+
		"\u0000\u0000\u0000\u0002\u00ff\u0001\u0000\u0000\u0000\u0004\u0101\u0001"+
		"\u0000\u0000\u0000\u0006\u010c\u0001\u0000\u0000\u0000\b\u0114\u0001\u0000"+
		"\u0000\u0000\n\u012d\u0001\u0000\u0000\u0000\f\u012f\u0001\u0000\u0000"+
		"\u0000\u000e\u014a\u0001\u0000\u0000\u0000\u0010\u014c\u0001\u0000\u0000"+
		"\u0000\u0012\u015b\u0001\u0000\u0000\u0000\u0014\u0166\u0001\u0000\u0000"+
		"\u0000\u0016\u0176\u0001\u0000\u0000\u0000\u0018\u0183\u0001\u0000\u0000"+
		"\u0000\u001a\u0187\u0001\u0000\u0000\u0000\u001c\u0189\u0001\u0000\u0000"+
		"\u0000\u001e\u018c\u0001\u0000\u0000\u0000 \u0190\u0001\u0000\u0000\u0000"+
		"\"\u0195\u0001\u0000\u0000\u0000$\u0197\u0001\u0000\u0000\u0000&\u0199"+
		"\u0001\u0000\u0000\u0000(\u01a1\u0001\u0000\u0000\u0000*\u01ab\u0001\u0000"+
		"\u0000\u0000,\u01be\u0001\u0000\u0000\u0000.\u01c1\u0001\u0000\u0000\u0000"+
		"0\u01c3\u0001\u0000\u0000\u00002\u01cc\u0001\u0000\u0000\u00004\u01d0"+
		"\u0001\u0000\u0000\u00006\u01ef\u0001\u0000\u0000\u00008\u01f1\u0001\u0000"+
		"\u0000\u0000:\u01fb\u0001\u0000\u0000\u0000<\u0200\u0001\u0000\u0000\u0000"+
		">\u0205\u0001\u0000\u0000\u0000@\u0209\u0001\u0000\u0000\u0000BF\u0003"+
		"\u0002\u0001\u0000CE\u0005\u0001\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GI\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\u0000"+
		"\u0000\u0001J\u0001\u0001\u0000\u0000\u0000KN\u0005E\u0000\u0000LO\u0003"+
		"\u001e\u000f\u0000MO\u0003\u0010\b\u0000NL\u0001\u0000\u0000\u0000NM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0003,\u0016\u0000Q\u0100"+
		"\u0001\u0000\u0000\u0000RS\u0007\u0000\u0000\u0000SV\u0005\u0014\u0000"+
		"\u0000TW\u0003\u001e\u000f\u0000UW\u0003\u0010\b\u0000VT\u0001\u0000\u0000"+
		"\u0000VU\u0001\u0000\u0000\u0000W\u0100\u0001\u0000\u0000\u0000XY\u0005"+
		"\u001d\u0000\u0000YZ\u0003\"\u0011\u0000Z[\u0005\u001b\u0000\u0000[\\"+
		"\u0005<\u0000\u0000\\]\u0003\u0010\b\u0000]\u0100\u0001\u0000\u0000\u0000"+
		"^_\u0007\u0000\u0000\u0000_b\u0005\u001e\u0000\u0000`c\u0003\u001e\u000f"+
		"\u0000ac\u0003\u0010\b\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000de\u0005%\u0000\u0000eg\u0005V\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0100\u0001\u0000"+
		"\u0000\u0000hi\u0005\u000f\u0000\u0000ij\u0005@\u0000\u0000jk\u0005\u0011"+
		"\u0000\u0000kn\u0003\u0010\b\u0000lm\u0005)\u0000\u0000mo\u0005I\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000ov\u0001\u0000"+
		"\u0000\u0000pq\u00051\u0000\u0000qr\u0005\u0006\u0000\u0000rs\u0005$\u0000"+
		"\u0000st\u0003&\u0013\u0000tu\u00056\u0000\u0000uw\u0001\u0000\u0000\u0000"+
		"vp\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0100\u0001\u0000"+
		"\u0000\u0000xz\u00054\u0000\u0000y{\u0005<\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0003\u0010"+
		"\b\u0000}\u007f\u0005@\u0000\u0000~}\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0003"+
		"\u000e\u0007\u0000\u0081\u0100\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"\u0003\u0000\u0000\u0083\u0084\u0005<\u0000\u0000\u0084\u0085\u0003\u0010"+
		"\b\u0000\u0085\u0086\u0005\u0002\u0000\u0000\u0086\u0087\u0005\u000e\u0000"+
		"\u0000\u0087\u0088\u0003\"\u0011\u0000\u0088\u0089\u00038\u001c\u0000"+
		"\u0089\u0100\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0003\u0000\u0000"+
		"\u008b\u008c\u0005<\u0000\u0000\u008c\u008d\u0003\u0010\b\u0000\u008d"+
		"\u008e\u0005\u0016\u0000\u0000\u008e\u0091\u0005\u000e\u0000\u0000\u008f"+
		"\u0090\u0005\"\u0000\u0000\u0090\u0092\u0005\u0018\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0003\"\u0011\u0000\u0094\u0100\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005\u0003\u0000\u0000\u0096\u0097\u0005"+
		"<\u0000\u0000\u0097\u0098\u0003\u0010\b\u0000\u0098\u0099\u0005\u0016"+
		"\u0000\u0000\u0099\u009a\u0005\u001a\u0000\u0000\u009a\u009d\u0003\u001a"+
		"\r\u0000\u009b\u009c\u0005?\u0000\u0000\u009c\u009e\u0005\u001e\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u0100\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0003\u0000"+
		"\u0000\u00a0\u00a1\u0005<\u0000\u0000\u00a1\u00a6\u0003\u0010\b\u0000"+
		"\u00a2\u00a7\u0003\f\u0006\u0000\u00a3\u00a4\u0005\n\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0006\u0000\u0000\u00a5\u00a7\u0005*\u0000\u0000\u00a6\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a7\u0100"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0003\u0000\u0000\u00a9\u00aa"+
		"\u0005<\u0000\u0000\u00aa\u00ab\u0003\u0010\b\u0000\u00ab\u00ad\u0007"+
		"\u0001\u0000\u0000\u00ac\u00ae\u0005\u000b\u0000\u0000\u00ad\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0003\u0010\b\u0000\u00b0\u00b1\u00059"+
		"\u0000\u0000\u00b1\u00b2\u0005!\u0000\u0000\u00b2\u0100\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b6\u0005/\u0000\u0000\u00b4\u00b7\u0003\u001e\u000f\u0000"+
		"\u00b5\u00b7\u0003\u0010\b\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8"+
		"\u00ba\u0005\u001c\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0005G\u0000\u0000\u00bc\u00be\u0003:\u001d\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c0\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c1\u0003\n\u0005\u0000\u00c0\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u0100\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u00050\u0000\u0000\u00c3\u00c4\u0005<\u0000\u0000"+
		"\u00c4\u00d7\u0003\u0010\b\u0000\u00c5\u00c6\u0005G\u0000\u0000\u00c6"+
		"\u00c8\u0003:\u001d\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0005\u0004\u0000\u0000\u00ca\u00cb\u0005$\u0000\u0000\u00cb\u00cc\u0005"+
		"2\u0000\u0000\u00cc\u00d8\u00056\u0000\u0000\u00cd\u00ce\u0005\u0004\u0000"+
		"\u0000\u00ce\u00cf\u0005$\u0000\u0000\u00cf\u00d0\u0005C\u0000\u0000\u00d0"+
		"\u00d1\u0005B\u0000\u0000\u00d1\u00d2\u0005$\u0000\u0000\u00d2\u00d3\u0005"+
		" \u0000\u0000\u00d3\u00d4\u0005J\u0000\u0000\u00d4\u00d5\u0005V\u0000"+
		"\u0000\u00d5\u00d6\u00056\u0000\u0000\u00d6\u00d8\u00056\u0000\u0000\u00d7"+
		"\u00c7\u0001\u0000\u0000\u0000\u00d7\u00cd\u0001\u0000\u0000\u0000\u00d8"+
		"\u0100\u0001\u0000\u0000\u0000\u00d9\u00da\u0003\b\u0004\u0000\u00da\u00db"+
		"\u00058\u0000\u0000\u00db\u00dc\u0005\t\u0000\u0000\u00dc\u00de\u0003"+
		"\u0010\b\u0000\u00dd\u00df\u0003\u000e\u0007\u0000\u00de\u00dd\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0005=\u0000\u0000\u00e1\u00e3\u0003\u0012\t"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\'\u0000\u0000"+
		"\u00e5\u00e7\u0003\u001e\u000f\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u0100\u0001\u0000\u0000\u0000"+
		"\u00e8\u00ea\t\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ed\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f0\u0003\f\u0006\u0000\u00ef\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f5\t\u0000\u0000\u0000\u00f4\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u0100\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fb\t\u0000"+
		"\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00ffK\u0001\u0000\u0000\u0000\u00ffR\u0001\u0000\u0000\u0000"+
		"\u00ffX\u0001\u0000\u0000\u0000\u00ff^\u0001\u0000\u0000\u0000\u00ffh"+
		"\u0001\u0000\u0000\u0000\u00ffx\u0001\u0000\u0000\u0000\u00ff\u0082\u0001"+
		"\u0000\u0000\u0000\u00ff\u008a\u0001\u0000\u0000\u0000\u00ff\u0095\u0001"+
		"\u0000\u0000\u0000\u00ff\u009f\u0001\u0000\u0000\u0000\u00ff\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ff\u00b3\u0001\u0000\u0000\u0000\u00ff\u00c2\u0001"+
		"\u0000\u0000\u0000\u00ff\u00d9\u0001\u0000\u0000\u0000\u00ff\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fc\u0001\u0000\u0000\u0000\u0100\u0003\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005\u0010\u0000\u0000\u0102\u0106\u0005"+
		"<\u0000\u0000\u0103\u0104\u0005\"\u0000\u0000\u0104\u0105\u0005+\u0000"+
		"\u0000\u0105\u0107\u0005\u0018\u0000\u0000\u0106\u0103\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0003\u0010\b\u0000\u0109\u0005\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0005\u0010\u0000\u0000\u010b\u010d\u0005.\u0000\u0000\u010c"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u00053\u0000\u0000\u010f\u0110"+
		"\u0005<\u0000\u0000\u0110\u0111\u0003\u0010\b\u0000\u0111\u0007\u0001"+
		"\u0000\u0000\u0000\u0112\u0115\u0003\u0004\u0002\u0000\u0113\u0115\u0003"+
		"\u0006\u0003\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0113\u0001"+
		"\u0000\u0000\u0000\u0115\t\u0001\u0000\u0000\u0000\u0116\u0117\u0005H"+
		"\u0000\u0000\u0117\u0118\u0005\u0006\u0000\u0000\u0118\u0119\u0005$\u0000"+
		"\u0000\u0119\u011e\u0003\u0010\b\u0000\u011a\u011b\u0005\f\u0000\u0000"+
		"\u011b\u011d\u0003\u0010\b\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d"+
		"\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u00056\u0000\u0000\u0122\u012e"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0005H\u0000\u0000\u0124\u0125\u0005"+
		"\u0006\u0000\u0000\u0125\u012a\u0003\u0010\b\u0000\u0126\u0127\u0005\f"+
		"\u0000\u0000\u0127\u0129\u0003\u0010\b\u0000\u0128\u0126\u0001\u0000\u0000"+
		"\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000"+
		"\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0116\u0001\u0000\u0000"+
		"\u0000\u012d\u0123\u0001\u0000\u0000\u0000\u012e\u000b\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0005\n\u0000\u0000\u0130\u0131\u0005\u0006\u0000\u0000"+
		"\u0131\u0132\u0005$\u0000\u0000\u0132\u0137\u0003\u0010\b\u0000\u0133"+
		"\u0134\u0005\f\u0000\u0000\u0134\u0136\u0003\u0010\b\u0000\u0135\u0133"+
		"\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013a"+
		"\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u00056\u0000\u0000\u013b\r\u0001\u0000\u0000\u0000\u013c\u013e\u0005"+
		"\u001b\u0000\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d\u013e\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0007"+
		"\u0002\u0000\u0000\u0140\u0141\u0005\u0005\u0000\u0000\u0141\u0142\u0005"+
		"-\u0000\u0000\u0142\u014b\u0007\u0003\u0000\u0000\u0143\u0145\u0005\u001b"+
		"\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0007\u0004"+
		"\u0000\u0000\u0147\u0148\u0005\u0005\u0000\u0000\u0148\u0149\u0005-\u0000"+
		"\u0000\u0149\u014b\u0005Q\u0000\u0000\u014a\u013d\u0001\u0000\u0000\u0000"+
		"\u014a\u0144\u0001\u0000\u0000\u0000\u014b\u000f\u0001\u0000\u0000\u0000"+
		"\u014c\u0151\u0003\"\u0011\u0000\u014d\u014e\u0005\u0015\u0000\u0000\u014e"+
		"\u0150\u0003\"\u0011\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0153"+
		"\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0001\u0000\u0000\u0000\u0152\u0158\u0001\u0000\u0000\u0000\u0153\u0151"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0005\u0015\u0000\u0000\u0155\u0157"+
		"\u0003\"\u0011\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u015a\u0001"+
		"\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001"+
		"\u0000\u0000\u0000\u0159\u0011\u0001\u0000\u0000\u0000\u015a\u0158\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0005$\u0000\u0000\u015c\u0161\u0003\u0014"+
		"\n\u0000\u015d\u015e\u0005\f\u0000\u0000\u015e\u0160\u0003\u0014\n\u0000"+
		"\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000"+
		"\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000"+
		"\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u00056\u0000\u0000\u0165\u0013\u0001\u0000\u0000\u0000\u0166"+
		"\u016b\u0003\u0016\u000b\u0000\u0167\u0169\u0005J\u0000\u0000\u0168\u0167"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0001\u0000\u0000\u0000\u016a\u016c\u0003\u0018\f\u0000\u016b\u0168\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u0015\u0001"+
		"\u0000\u0000\u0000\u016d\u0172\u0003\"\u0011\u0000\u016e\u016f\u0005\u0015"+
		"\u0000\u0000\u016f\u0171\u0003\"\u0011\u0000\u0170\u016e\u0001\u0000\u0000"+
		"\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0177\u0001\u0000\u0000"+
		"\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0177\u0003\u001e\u000f"+
		"\u0000\u0176\u016d\u0001\u0000\u0000\u0000\u0176\u0175\u0001\u0000\u0000"+
		"\u0000\u0177\u0017\u0001\u0000\u0000\u0000\u0178\u0184\u0005V\u0000\u0000"+
		"\u0179\u0184\u0005W\u0000\u0000\u017a\u0184\u0003 \u0010\u0000\u017b\u017c"+
		"\u0003\"\u0011\u0000\u017c\u017d\u0005$\u0000\u0000\u017d\u017e\u0003"+
		"\u001e\u000f\u0000\u017e\u017f\u0005\f\u0000\u0000\u017f\u0180\u0003\u001e"+
		"\u000f\u0000\u0180\u0181\u00056\u0000\u0000\u0181\u0184\u0001\u0000\u0000"+
		"\u0000\u0182\u0184\u0003\u001e\u000f\u0000\u0183\u0178\u0001\u0000\u0000"+
		"\u0000\u0183\u0179\u0001\u0000\u0000\u0000\u0183\u017a\u0001\u0000\u0000"+
		"\u0000\u0183\u017b\u0001\u0000\u0000\u0000\u0183\u0182\u0001\u0000\u0000"+
		"\u0000\u0184\u0019\u0001\u0000\u0000\u0000\u0185\u0188\u0003\"\u0011\u0000"+
		"\u0186\u0188\u0003\u001e\u000f\u0000\u0187\u0185\u0001\u0000\u0000\u0000"+
		"\u0187\u0186\u0001\u0000\u0000\u0000\u0188\u001b\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0007\u0005\u0000\u0000\u018a\u001d\u0001\u0000\u0000\u0000"+
		"\u018b\u018d\u0003\u001c\u000e\u0000\u018c\u018b\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000"+
		"\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u001f\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0007\u0006\u0000\u0000\u0191!\u0001\u0000\u0000\u0000\u0192"+
		"\u0196\u0005Z\u0000\u0000\u0193\u0196\u0003$\u0012\u0000\u0194\u0196\u0003"+
		"@ \u0000\u0195\u0192\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000"+
		"\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196#\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0005[\u0000\u0000\u0198%\u0001\u0000\u0000\u0000\u0199\u019e"+
		"\u0003(\u0014\u0000\u019a\u019b\u0005\f\u0000\u0000\u019b\u019d\u0003"+
		"(\u0014\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u01a0\u0001\u0000"+
		"\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000"+
		"\u0000\u0000\u019f\'\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a2\u0003\"\u0011\u0000\u01a2\u01a5\u0003*\u0015\u0000"+
		"\u01a3\u01a4\u0005+\u0000\u0000\u01a4\u01a6\u0005,\u0000\u0000\u01a5\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005\r\u0000\u0000\u01a8\u01aa\u0003"+
		"\u001e\u000f\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001"+
		"\u0000\u0000\u0000\u01aa)\u0001\u0000\u0000\u0000\u01ab\u01b6\u0003\""+
		"\u0011\u0000\u01ac\u01ad\u0005$\u0000\u0000\u01ad\u01b2\u0005V\u0000\u0000"+
		"\u01ae\u01af\u0005\f\u0000\u0000\u01af\u01b1\u0005V\u0000\u0000\u01b0"+
		"\u01ae\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b7\u00056\u0000\u0000\u01b6\u01ac\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b7+\u0001\u0000\u0000\u0000\u01b8\u01bd\u0003"+
		".\u0017\u0000\u01b9\u01bd\u00030\u0018\u0000\u01ba\u01bd\u00032\u0019"+
		"\u0000\u01bb\u01bd\u00034\u001a\u0000\u01bc\u01b8\u0001\u0000\u0000\u0000"+
		"\u01bc\u01b9\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000"+
		"\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000"+
		"\u01bf-\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c2\u0007\u0007\u0000\u0000\u01c2/\u0001\u0000\u0000\u0000\u01c3\u01c4"+
		"\u0005D\u0000\u0000\u01c4\u01ca\u0005#\u0000\u0000\u01c5\u01cb\u0003\u0010"+
		"\b\u0000\u01c6\u01c7\u0005$\u0000\u0000\u01c7\u01c8\u0003<\u001e\u0000"+
		"\u01c8\u01c9\u00056\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca"+
		"\u01c5\u0001\u0000\u0000\u0000\u01ca\u01c6\u0001\u0000\u0000\u0000\u01cb"+
		"1\u0001\u0000\u0000\u0000\u01cc\u01cd\u00055\u0000\u0000\u01cd\u01ce\u0003"+
		"6\u001b\u0000\u01ce\u01cf\u0005\u001f\u0000\u0000\u01cf3\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u0005\u0017\u0000\u0000\u01d1\u01d2\u00057\u0000\u0000"+
		"\u01d25\u0001\u0000\u0000\u0000\u01d3\u01d5\u0005(\u0000\u0000\u01d4\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d6\u01f0\u0005W\u0000\u0000\u01d7\u01d9\u0005"+
		"(\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01f0\u0005V\u0000"+
		"\u0000\u01db\u01dd\u0005(\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000"+
		"\u01de\u01f0\u0005S\u0000\u0000\u01df\u01e1\u0005(\u0000\u0000\u01e0\u01df"+
		"\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e2\u01f0\u0005T\u0000\u0000\u01e3\u01e5\u0005"+
		"(\u0000\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01f0\u0005U\u0000"+
		"\u0000\u01e7\u01e9\u0005(\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000"+
		"\u01ea\u01f0\u0005X\u0000\u0000\u01eb\u01ed\u0005(\u0000\u0000\u01ec\u01eb"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee"+
		"\u0001\u0000\u0000\u0000\u01ee\u01f0\u0005Y\u0000\u0000\u01ef\u01d4\u0001"+
		"\u0000\u0000\u0000\u01ef\u01d8\u0001\u0000\u0000\u0000\u01ef\u01dc\u0001"+
		"\u0000\u0000\u0000\u01ef\u01e0\u0001\u0000\u0000\u0000\u01ef\u01e4\u0001"+
		"\u0000\u0000\u0000\u01ef\u01e8\u0001\u0000\u0000\u0000\u01ef\u01ec\u0001"+
		"\u0000\u0000\u0000\u01f07\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005\b"+
		"\u0000\u0000\u01f2\u01f4\u0005$\u0000\u0000\u01f3\u01f5\u0003>\u001f\u0000"+
		"\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000"+
		"\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u00056\u0000\u0000\u01f9"+
		"9\u0001\u0000\u0000\u0000\u01fa\u01fc\t\u0000\u0000\u0000\u01fb\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe;\u0001"+
		"\u0000\u0000\u0000\u01ff\u0201\t\u0000\u0000\u0000\u0200\u01ff\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000"+
		"\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0203=\u0001\u0000\u0000"+
		"\u0000\u0204\u0206\t\u0000\u0000\u0000\u0205\u0204\u0001\u0000\u0000\u0000"+
		"\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000"+
		"\u0207\u0205\u0001\u0000\u0000\u0000\u0208?\u0001\u0000\u0000\u0000\u0209"+
		"\u020a\u0007\b\u0000\u0000\u020aA\u0001\u0000\u0000\u0000DFNVbfnvz~\u0091"+
		"\u009d\u00a6\u00ad\u00b6\u00b9\u00bd\u00c0\u00c7\u00d7\u00de\u00e2\u00e6"+
		"\u00eb\u00f1\u00f6\u00fc\u00ff\u0106\u010c\u0114\u011e\u012a\u012d\u0137"+
		"\u013d\u0144\u014a\u0151\u0158\u0161\u0168\u016b\u0172\u0176\u0183\u0187"+
		"\u018e\u0195\u019e\u01a5\u01a9\u01b2\u01b6\u01bc\u01be\u01ca\u01d4\u01d8"+
		"\u01dc\u01e0\u01e4\u01e8\u01ec\u01ef\u01f6\u01fd\u0202\u0207";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}