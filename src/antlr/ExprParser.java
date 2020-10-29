// Generated from Expr.g4 by ANTLR 4.8

    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NEWLINE=5, IMPORT=6, FROM=7, AS=8, NAME=9, 
		HDF5=10, WS=11;
	public static final int
		RULE_prog = 0, RULE_import_stmt = 1, RULE_ds = 2, RULE_fname = 3, RULE_symbol = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "import_stmt", "ds", "fname", "symbol"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'/'", "'\\'", "'.'", null, "'import'", "'from'", "'as'", 
			null, "'HDF5'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NEWLINE", "IMPORT", "FROM", "AS", "NAME", 
			"HDF5", "WS"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends ProgContext {
		public List<Import_stmtContext> import_stmt() {
			return getRuleContexts(Import_stmtContext.class);
		}
		public Import_stmtContext import_stmt(int i) {
			return getRuleContext(Import_stmtContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(10);
				import_stmt();
				setState(11);
				match(NEWLINE);
				}
				}
				setState(17);
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

	public static class Import_stmtContext extends ParserRuleContext {
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
	 
		public Import_stmtContext() { }
		public void copyFrom(Import_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImportContext extends Import_stmtContext {
		public TerminalNode IMPORT() { return getToken(ExprParser.IMPORT, 0); }
		public DsContext ds() {
			return getRuleContext(DsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ExprParser.FROM, 0); }
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExprParser.AS, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ImportContext(Import_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_import_stmt);
		try {
			_localctx = new ImportContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(IMPORT);
			setState(19);
			match(T__0);
			setState(20);
			ds();
			setState(21);
			match(T__0);
			setState(22);
			match(FROM);
			setState(23);
			match(T__0);
			setState(24);
			fname();
			setState(25);
			match(T__0);
			setState(26);
			match(AS);
			setState(27);
			symbol();
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

	public static class DsContext extends ParserRuleContext {
		public DsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ds; }
	 
		public DsContext() { }
		public void copyFrom(DsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DatasetContext extends DsContext {
		public List<TerminalNode> NAME() { return getTokens(ExprParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ExprParser.NAME, i);
		}
		public DatasetContext(DsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDataset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDataset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDataset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DsContext ds() throws RecognitionException {
		DsContext _localctx = new DsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ds);
		int _la;
		try {
			_localctx = new DatasetContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				match(T__1);
				setState(30);
				match(NAME);
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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

	public static class FnameContext extends ParserRuleContext {
		public FnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fname; }
	 
		public FnameContext() { }
		public void copyFrom(FnameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FilenameContext extends FnameContext {
		public TerminalNode HDF5() { return getToken(ExprParser.HDF5, 0); }
		public List<TerminalNode> NAME() { return getTokens(ExprParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ExprParser.NAME, i);
		}
		public FilenameContext(FnameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnameContext fname() throws RecognitionException {
		FnameContext _localctx = new FnameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fname);
		int _la;
		try {
			_localctx = new FilenameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				match(T__2);
				setState(36);
				match(NAME);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(41);
			match(T__3);
			setState(42);
			match(HDF5);
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

	public static class SymbolContext extends ParserRuleContext {
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
	 
		public SymbolContext() { }
		public void copyFrom(SymbolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableContext extends SymbolContext {
		public TerminalNode NAME() { return getToken(ExprParser.NAME, 0); }
		public VariableContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_symbol);
		try {
			_localctx = new VariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(NAME);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\61\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\6\4\"\n\4\r\4\16\4"+
		"#\3\5\3\5\6\5(\n\5\r\5\16\5)\3\5\3\5\3\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2"+
		"\2\2.\2\21\3\2\2\2\4\24\3\2\2\2\6!\3\2\2\2\b\'\3\2\2\2\n.\3\2\2\2\f\r"+
		"\5\4\3\2\r\16\7\7\2\2\16\20\3\2\2\2\17\f\3\2\2\2\20\23\3\2\2\2\21\17\3"+
		"\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\21\3\2\2\2\24\25\7\b\2\2\25\26\7"+
		"\3\2\2\26\27\5\6\4\2\27\30\7\3\2\2\30\31\7\t\2\2\31\32\7\3\2\2\32\33\5"+
		"\b\5\2\33\34\7\3\2\2\34\35\7\n\2\2\35\36\5\n\6\2\36\5\3\2\2\2\37 \7\4"+
		"\2\2 \"\7\13\2\2!\37\3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\7\3\2\2\2"+
		"%&\7\5\2\2&(\7\13\2\2\'%\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2"+
		"\2\2+,\7\6\2\2,-\7\f\2\2-\t\3\2\2\2./\7\13\2\2/\13\3\2\2\2\5\21#)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}