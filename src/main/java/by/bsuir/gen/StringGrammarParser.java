package by.bsuir.gen;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StringGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, BEGIN=5, IF=6, PRINT=7, FOR=8, ELSE=9, 
		END=10, CONST=11, WHILE=12, INT=13, CHAR=14, ADD=15, REMOVE=16, STRING=17, 
		STRING_ARRAY=18, RETURN=19, CALL=20, GLOBAL=21, DOT=22, DOT_COMMA=23, 
		COLON=24, PLUS=25, MINUS=26, MULTIPLY=27, DIVIDE=28, NEGATION=29, EQUAL=30, 
		NON_EQUAL=31, LESS=32, LESS_OR_EQUALS=33, GREATER=34, GREATER_OR_EQUALS=35, 
		O_BRACKET=36, C_BRACKET=37, K_O_BRACKET=38, K_C_BRACKET=39, SQ_O_BRACKET=40, 
		SQ_C_BRACKET=41, LINE=42, NUMBER=43, SYMBOL=44, ID=45, WS=46;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_digit_expression = 3, 
		RULE_intialize_char = 4, RULE_initialize_string = 5, RULE_initialize_string_array = 6, 
		RULE_global_assign_var = 7, RULE_global_assign_string = 8, RULE_global_assign_string_array = 9, 
		RULE_print = 10, RULE_assign_var_method_invocation = 11, RULE_assign_string = 12, 
		RULE_assign_string_array = 13, RULE_assign_var = 14, RULE_operarions_with_string_array = 15, 
		RULE_operations = 16, RULE_simple_compare = 17, RULE_multi_compare = 18, 
		RULE_while_cicle = 19, RULE_if_else = 20, RULE_for_each = 21, RULE_type = 22, 
		RULE_type_1 = 23, RULE_signature = 24, RULE_subprogram_return = 25, RULE_subprogram_non_return = 26, 
		RULE_block_return = 27, RULE_block_non_return = 28, RULE_signature_method_invokation = 29, 
		RULE_method_invokation = 30, RULE_global_program = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "digit_expression", "intialize_char", 
			"initialize_string", "initialize_string_array", "global_assign_var", 
			"global_assign_string", "global_assign_string_array", "print", "assign_var_method_invocation", 
			"assign_string", "assign_string_array", "assign_var", "operarions_with_string_array", 
			"operations", "simple_compare", "multi_compare", "while_cicle", "if_else", 
			"for_each", "type", "type_1", "signature", "subprogram_return", "subprogram_non_return", 
			"block_return", "block_non_return", "signature_method_invokation", "method_invokation", 
			"global_program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main_program'", "','", "'='", "'sub_program'", "'begin'", "'if'", 
			"'print'", "'for'", "'else'", "'end'", "'const'", "'while'", "'int'", 
			"'char'", "'add'", "'remove'", "'string'", "'stringArray'", "'return'", 
			"'call'", "'global'", "'.'", "';'", "':'", "'+'", "'-'", "'*'", "'/'", 
			"'!'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'('", "')'", "'{'", 
			"'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "BEGIN", "IF", "PRINT", "FOR", "ELSE", 
			"END", "CONST", "WHILE", "INT", "CHAR", "ADD", "REMOVE", "STRING", "STRING_ARRAY", 
			"RETURN", "CALL", "GLOBAL", "DOT", "DOT_COMMA", "COLON", "PLUS", "MINUS", 
			"MULTIPLY", "DIVIDE", "NEGATION", "EQUAL", "NON_EQUAL", "LESS", "LESS_OR_EQUALS", 
			"GREATER", "GREATER_OR_EQUALS", "O_BRACKET", "C_BRACKET", "K_O_BRACKET", 
			"K_C_BRACKET", "SQ_O_BRACKET", "SQ_C_BRACKET", "LINE", "NUMBER", "SYMBOL", 
			"ID", "WS"
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
	public String getGrammarFileName() { return "StringGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StringGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__0);
			setState(65);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(StringGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(StringGrammarParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(BEGIN);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << FOR) | (1L << WHILE) | (1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << STRING_ARRAY) | (1L << CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(68);
				statement();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public Assign_stringContext assign_string() {
			return getRuleContext(Assign_stringContext.class,0);
		}
		public Assign_string_arrayContext assign_string_array() {
			return getRuleContext(Assign_string_arrayContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public Operarions_with_string_arrayContext operarions_with_string_array() {
			return getRuleContext(Operarions_with_string_arrayContext.class,0);
		}
		public Assign_var_method_invocationContext assign_var_method_invocation() {
			return getRuleContext(Assign_var_method_invocationContext.class,0);
		}
		public While_cicleContext while_cicle() {
			return getRuleContext(While_cicleContext.class,0);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public Method_invokationContext method_invokation() {
			return getRuleContext(Method_invokationContext.class,0);
		}
		public For_eachContext for_each() {
			return getRuleContext(For_eachContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				assign_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				assign_string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				assign_string_array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				operations();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				operarions_with_string_array();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				assign_var_method_invocation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				while_cicle();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(84);
				if_else();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(85);
				method_invokation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(86);
				for_each();
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

	public static class Digit_expressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StringGrammarParser.ID, 0); }
		public TerminalNode O_BRACKET() { return getToken(StringGrammarParser.O_BRACKET, 0); }
		public List<Digit_expressionContext> digit_expression() {
			return getRuleContexts(Digit_expressionContext.class);
		}
		public Digit_expressionContext digit_expression(int i) {
			return getRuleContext(Digit_expressionContext.class,i);
		}
		public TerminalNode C_BRACKET() { return getToken(StringGrammarParser.C_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(StringGrammarParser.NUMBER, 0); }
		public TerminalNode MULTIPLY() { return getToken(StringGrammarParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(StringGrammarParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(StringGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(StringGrammarParser.MINUS, 0); }
		public Digit_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterDigit_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitDigit_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitDigit_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Digit_expressionContext digit_expression() throws RecognitionException {
		return digit_expression(0);
	}

	private Digit_expressionContext digit_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Digit_expressionContext _localctx = new Digit_expressionContext(_ctx, _parentState);
		Digit_expressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_digit_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(90);
				match(ID);
				}
				break;
			case O_BRACKET:
				{
				setState(91);
				match(O_BRACKET);
				setState(92);
				digit_expression(0);
				setState(93);
				match(C_BRACKET);
				}
				break;
			case NUMBER:
				{
				setState(95);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(104);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Digit_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_digit_expression);
						setState(98);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(99);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(100);
						digit_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Digit_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_digit_expression);
						setState(101);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(102);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						digit_expression(5);
						}
						break;
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Intialize_charContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(StringGrammarParser.SYMBOL, 0); }
		public Intialize_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intialize_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterIntialize_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitIntialize_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitIntialize_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Intialize_charContext intialize_char() throws RecognitionException {
		Intialize_charContext _localctx = new Intialize_charContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intialize_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(SYMBOL);
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

	public static class Initialize_stringContext extends ParserRuleContext {
		public TerminalNode LINE() { return getToken(StringGrammarParser.LINE, 0); }
		public List<TerminalNode> ID() { return getTokens(StringGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StringGrammarParser.ID, i);
		}
		public TerminalNode MULTIPLY() { return getToken(StringGrammarParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(StringGrammarParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(StringGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(StringGrammarParser.MINUS, 0); }
		public Initialize_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialize_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterInitialize_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitInitialize_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitInitialize_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initialize_stringContext initialize_string() throws RecognitionException {
		Initialize_stringContext _localctx = new Initialize_stringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initialize_string);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(LINE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(112);
				match(ID);
				setState(113);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				match(ID);
				}
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

	public static class Initialize_string_arrayContext extends ParserRuleContext {
		public TerminalNode SQ_O_BRACKET() { return getToken(StringGrammarParser.SQ_O_BRACKET, 0); }
		public TerminalNode SQ_C_BRACKET() { return getToken(StringGrammarParser.SQ_C_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(StringGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StringGrammarParser.ID, i);
		}
		public Initialize_string_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialize_string_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterInitialize_string_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitInitialize_string_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitInitialize_string_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initialize_string_arrayContext initialize_string_array() throws RecognitionException {
		Initialize_string_arrayContext _localctx = new Initialize_string_arrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_initialize_string_array);
		try {
			int _alt;
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(117);
				match(SQ_O_BRACKET);
				setState(118);
				match(SQ_C_BRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(119);
				match(SQ_O_BRACKET);
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(120);
						match(ID);
						setState(121);
						match(T__1);
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(127);
				match(ID);
				setState(128);
				match(SQ_C_BRACKET);
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

	public static class Global_assign_varContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(StringGrammarParser.GLOBAL, 0); }
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public Global_assign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_assign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterGlobal_assign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitGlobal_assign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitGlobal_assign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_assign_varContext global_assign_var() throws RecognitionException {
		Global_assign_varContext _localctx = new Global_assign_varContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_global_assign_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(GLOBAL);
			setState(132);
			assign_var();
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

	public static class Global_assign_stringContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(StringGrammarParser.GLOBAL, 0); }
		public Assign_stringContext assign_string() {
			return getRuleContext(Assign_stringContext.class,0);
		}
		public Global_assign_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_assign_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterGlobal_assign_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitGlobal_assign_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitGlobal_assign_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_assign_stringContext global_assign_string() throws RecognitionException {
		Global_assign_stringContext _localctx = new Global_assign_stringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_global_assign_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(GLOBAL);
			setState(135);
			assign_string();
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

	public static class Global_assign_string_arrayContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(StringGrammarParser.GLOBAL, 0); }
		public Assign_string_arrayContext assign_string_array() {
			return getRuleContext(Assign_string_arrayContext.class,0);
		}
		public Global_assign_string_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_assign_string_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterGlobal_assign_string_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitGlobal_assign_string_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitGlobal_assign_string_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_assign_string_arrayContext global_assign_string_array() throws RecognitionException {
		Global_assign_string_arrayContext _localctx = new Global_assign_string_arrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_global_assign_string_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(GLOBAL);
			setState(138);
			assign_string_array();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(StringGrammarParser.PRINT, 0); }
		public TerminalNode O_BRACKET() { return getToken(StringGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(StringGrammarParser.C_BRACKET, 0); }
		public TerminalNode DOT_COMMA() { return getToken(StringGrammarParser.DOT_COMMA, 0); }
		public TerminalNode ID() { return getToken(StringGrammarParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(StringGrammarParser.NUMBER, 0); }
		public TerminalNode LINE() { return getToken(StringGrammarParser.LINE, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(PRINT);
			setState(141);
			match(O_BRACKET);
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE) | (1L << NUMBER) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(143);
			match(C_BRACKET);
			setState(144);
			match(DOT_COMMA);
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

	public static class Assign_var_method_invocationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(StringGrammarParser.ID, 0); }
		public Method_invokationContext method_invokation() {
			return getRuleContext(Method_invokationContext.class,0);
		}
		public TerminalNode CONST() { return getToken(StringGrammarParser.CONST, 0); }
		public Assign_var_method_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_var_method_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterAssign_var_method_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitAssign_var_method_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitAssign_var_method_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_var_method_invocationContext assign_var_method_invocation() throws RecognitionException {
		Assign_var_method_invocationContext _localctx = new Assign_var_method_invocationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign_var_method_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			type();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(147);
				match(CONST);
				}
			}

			setState(150);
			match(ID);
			setState(151);
			match(T__2);
			setState(152);
			method_invokation();
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

	public static class Assign_stringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(StringGrammarParser.STRING, 0); }
		public TerminalNode ID() { return getToken(StringGrammarParser.ID, 0); }
		public TerminalNode DOT_COMMA() { return getToken(StringGrammarParser.DOT_COMMA, 0); }
		public Initialize_stringContext initialize_string() {
			return getRuleContext(Initialize_stringContext.class,0);
		}
		public TerminalNode CONST() { return getToken(StringGrammarParser.CONST, 0); }
		public Assign_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterAssign_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitAssign_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitAssign_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stringContext assign_string() throws RecognitionException {
		Assign_stringContext _localctx = new Assign_stringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(STRING);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(155);
				match(CONST);
				}
			}

			setState(158);
			match(ID);
			setState(159);
			match(T__2);
			{
			setState(160);
			initialize_string();
			}
			setState(161);
			match(DOT_COMMA);
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

	public static class Assign_string_arrayContext extends ParserRuleContext {
		public TerminalNode STRING_ARRAY() { return getToken(StringGrammarParser.STRING_ARRAY, 0); }
		public TerminalNode ID() { return getToken(StringGrammarParser.ID, 0); }
		public TerminalNode DOT_COMMA() { return getToken(StringGrammarParser.DOT_COMMA, 0); }
		public Initialize_string_arrayContext initialize_string_array() {
			return getRuleContext(Initialize_string_arrayContext.class,0);
		}
		public TerminalNode CONST() { return getToken(StringGrammarParser.CONST, 0); }
		public Assign_string_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_string_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterAssign_string_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitAssign_string_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitAssign_string_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_string_arrayContext assign_string_array() throws RecognitionException {
		Assign_string_arrayContext _localctx = new Assign_string_arrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign_string_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(STRING_ARRAY);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(164);
				match(CONST);
				}
			}

			setState(167);
			match(ID);
			setState(168);
			match(T__2);
			{
			setState(169);
			initialize_string_array();
			}
			setState(170);
			match(DOT_COMMA);
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

	public static class Assign_varContext extends ParserRuleContext {
		public Type_1Context type_1() {
			return getRuleContext(Type_1Context.class,0);
		}
		public TerminalNode ID() { return getToken(StringGrammarParser.ID, 0); }
		public TerminalNode DOT_COMMA() { return getToken(StringGrammarParser.DOT_COMMA, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public Intialize_charContext intialize_char() {
			return getRuleContext(Intialize_charContext.class,0);
		}
		public TerminalNode CONST() { return getToken(StringGrammarParser.CONST, 0); }
		public Assign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterAssign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitAssign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitAssign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_varContext assign_var() throws RecognitionException {
		Assign_varContext _localctx = new Assign_varContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assign_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			type_1();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(173);
				match(CONST);
				}
			}

			setState(176);
			match(ID);
			setState(177);
			match(T__2);
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case O_BRACKET:
			case NUMBER:
			case ID:
				{
				setState(178);
				digit_expression(0);
				}
				break;
			case SYMBOL:
				{
				setState(179);
				intialize_char();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182);
			match(DOT_COMMA);
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

	public static class Operarions_with_string_arrayContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(StringGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StringGrammarParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(StringGrammarParser.DOT, 0); }
		public TerminalNode DOT_COMMA() { return getToken(StringGrammarParser.DOT_COMMA, 0); }
		public TerminalNode ADD() { return getToken(StringGrammarParser.ADD, 0); }
		public TerminalNode REMOVE() { return getToken(StringGrammarParser.REMOVE, 0); }
		public TerminalNode O_BRACKET() { return getToken(StringGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(StringGrammarParser.C_BRACKET, 0); }
		public Operarions_with_string_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operarions_with_string_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterOperarions_with_string_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitOperarions_with_string_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitOperarions_with_string_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operarions_with_string_arrayContext operarions_with_string_array() throws RecognitionException {
		Operarions_with_string_arrayContext _localctx = new Operarions_with_string_arrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operarions_with_string_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ID);
			setState(185);
			match(DOT);
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==REMOVE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(187);
			match(O_BRACKET);
			setState(188);
			match(ID);
			setState(189);
			match(C_BRACKET);
			}
			setState(191);
			match(DOT_COMMA);
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

	public static class OperationsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StringGrammarParser.ID, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(StringGrammarParser.DOT_COMMA, 0); }
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ID);
			setState(194);
			match(T__2);
			setState(195);
			digit_expression(0);
			setState(196);
			match(DOT_COMMA);
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

	public static class Simple_compareContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(StringGrammarParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(StringGrammarParser.NON_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(StringGrammarParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(StringGrammarParser.GREATER, 0); }
		public TerminalNode LESS_OR_EQUALS() { return getToken(StringGrammarParser.LESS_OR_EQUALS, 0); }
		public TerminalNode GREATER_OR_EQUALS() { return getToken(StringGrammarParser.GREATER_OR_EQUALS, 0); }
		public List<Digit_expressionContext> digit_expression() {
			return getRuleContexts(Digit_expressionContext.class);
		}
		public Digit_expressionContext digit_expression(int i) {
			return getRuleContext(Digit_expressionContext.class,i);
		}
		public Simple_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterSimple_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitSimple_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitSimple_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_compareContext simple_compare() throws RecognitionException {
		Simple_compareContext _localctx = new Simple_compareContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simple_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(198);
			digit_expression(0);
			}
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NON_EQUAL) | (1L << LESS) | (1L << LESS_OR_EQUALS) | (1L << GREATER) | (1L << GREATER_OR_EQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(200);
			digit_expression(0);
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

	public static class Multi_compareContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(StringGrammarParser.O_BRACKET, 0); }
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(StringGrammarParser.C_BRACKET, 0); }
		public TerminalNode NEGATION() { return getToken(StringGrammarParser.NEGATION, 0); }
		public Multi_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterMulti_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitMulti_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitMulti_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_compareContext multi_compare() throws RecognitionException {
		Multi_compareContext _localctx = new Multi_compareContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multi_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(202);
				match(NEGATION);
				}
			}

			setState(205);
			match(O_BRACKET);
			setState(206);
			simple_compare();
			setState(207);
			match(C_BRACKET);
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

	public static class While_cicleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(StringGrammarParser.WHILE, 0); }
		public TerminalNode O_BRACKET() { return getToken(StringGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(StringGrammarParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public Multi_compareContext multi_compare() {
			return getRuleContext(Multi_compareContext.class,0);
		}
		public While_cicleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cicle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterWhile_cicle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitWhile_cicle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitWhile_cicle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_cicleContext while_cicle() throws RecognitionException {
		While_cicleContext _localctx = new While_cicleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while_cicle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(WHILE);
			setState(210);
			match(O_BRACKET);
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(211);
				simple_compare();
				}
				break;
			case 2:
				{
				setState(212);
				multi_compare();
				}
				break;
			}
			setState(215);
			match(C_BRACKET);
			setState(216);
			block();
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

	public static class If_elseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(StringGrammarParser.IF, 0); }
		public TerminalNode O_BRACKET() { return getToken(StringGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(StringGrammarParser.C_BRACKET, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(StringGrammarParser.ELSE, 0); }
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public Multi_compareContext multi_compare() {
			return getRuleContext(Multi_compareContext.class,0);
		}
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitIf_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(IF);
			setState(219);
			match(O_BRACKET);
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(220);
				simple_compare();
				}
				break;
			case 2:
				{
				setState(221);
				multi_compare();
				}
				break;
			}
			setState(224);
			match(C_BRACKET);
			setState(225);
			block();
			setState(226);
			match(ELSE);
			setState(227);
			block();
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

	public static class For_eachContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(StringGrammarParser.FOR, 0); }
		public TerminalNode O_BRACKET() { return getToken(StringGrammarParser.O_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(StringGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StringGrammarParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(StringGrammarParser.COLON, 0); }
		public TerminalNode C_BRACKET() { return getToken(StringGrammarParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_eachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterFor_each(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitFor_each(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitFor_each(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_eachContext for_each() throws RecognitionException {
		For_eachContext _localctx = new For_eachContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_each);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(FOR);
			setState(230);
			match(O_BRACKET);
			setState(231);
			match(ID);
			setState(232);
			match(COLON);
			setState(233);
			match(ID);
			setState(234);
			match(C_BRACKET);
			setState(235);
			block();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(StringGrammarParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(StringGrammarParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(StringGrammarParser.STRING, 0); }
		public TerminalNode STRING_ARRAY() { return getToken(StringGrammarParser.STRING_ARRAY, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << STRING_ARRAY))) != 0)) ) {
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

	public static class Type_1Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(StringGrammarParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(StringGrammarParser.CHAR, 0); }
		public Type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterType_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitType_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitType_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_1Context type_1() throws RecognitionException {
		Type_1Context _localctx = new Type_1Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_type_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==CHAR) ) {
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

	public static class SignatureContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(StringGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(StringGrammarParser.C_BRACKET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(StringGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StringGrammarParser.ID, i);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_signature);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(241);
			match(O_BRACKET);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(242);
					type();
					setState(243);
					match(ID);
					setState(244);
					match(T__1);
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			{
			setState(251);
			type();
			setState(252);
			match(ID);
			}
			setState(254);
			match(C_BRACKET);
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

	public static class Subprogram_returnContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(StringGrammarParser.ID, 0); }
		public Block_returnContext block_return() {
			return getRuleContext(Block_returnContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(StringGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(StringGrammarParser.C_BRACKET, 0); }
		public Subprogram_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterSubprogram_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitSubprogram_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitSubprogram_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_returnContext subprogram_return() throws RecognitionException {
		Subprogram_returnContext _localctx = new Subprogram_returnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_subprogram_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__3);
			setState(257);
			type();
			setState(258);
			match(ID);
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(259);
				signature();
				}
				break;
			case 2:
				{
				{
				setState(260);
				match(O_BRACKET);
				setState(261);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(264);
			block_return();
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

	public static class Subprogram_non_returnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StringGrammarParser.ID, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public Block_non_returnContext block_non_return() {
			return getRuleContext(Block_non_returnContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(StringGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(StringGrammarParser.C_BRACKET, 0); }
		public Subprogram_non_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_non_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterSubprogram_non_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitSubprogram_non_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitSubprogram_non_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_non_returnContext subprogram_non_return() throws RecognitionException {
		Subprogram_non_returnContext _localctx = new Subprogram_non_returnContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_subprogram_non_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__3);
			setState(267);
			match(ID);
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(268);
				signature();
				}
				break;
			case 2:
				{
				{
				setState(269);
				match(O_BRACKET);
				setState(270);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(273);
				block_non_return();
				}
				break;
			case 2:
				{
				setState(274);
				block();
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

	public static class Block_returnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(StringGrammarParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(StringGrammarParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(StringGrammarParser.ID, 0); }
		public TerminalNode DOT_COMMA() { return getToken(StringGrammarParser.DOT_COMMA, 0); }
		public TerminalNode END() { return getToken(StringGrammarParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterBlock_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitBlock_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitBlock_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_returnContext block_return() throws RecognitionException {
		Block_returnContext _localctx = new Block_returnContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_block_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(BEGIN);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << FOR) | (1L << WHILE) | (1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << STRING_ARRAY) | (1L << CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(278);
				statement();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			match(RETURN);
			setState(285);
			match(ID);
			setState(286);
			match(DOT_COMMA);
			setState(287);
			match(END);
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

	public static class Block_non_returnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(StringGrammarParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(StringGrammarParser.RETURN, 0); }
		public TerminalNode DOT_COMMA() { return getToken(StringGrammarParser.DOT_COMMA, 0); }
		public TerminalNode END() { return getToken(StringGrammarParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_non_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_non_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterBlock_non_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitBlock_non_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitBlock_non_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_non_returnContext block_non_return() throws RecognitionException {
		Block_non_returnContext _localctx = new Block_non_returnContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_block_non_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(BEGIN);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << FOR) | (1L << WHILE) | (1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << STRING_ARRAY) | (1L << CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(290);
				statement();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(RETURN);
			setState(297);
			match(DOT_COMMA);
			setState(298);
			match(END);
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

	public static class Signature_method_invokationContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(StringGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(StringGrammarParser.C_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(StringGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StringGrammarParser.ID, i);
		}
		public Signature_method_invokationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature_method_invokation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterSignature_method_invokation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitSignature_method_invokation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitSignature_method_invokation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signature_method_invokationContext signature_method_invokation() throws RecognitionException {
		Signature_method_invokationContext _localctx = new Signature_method_invokationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_signature_method_invokation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(300);
			match(O_BRACKET);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301);
					match(ID);
					setState(302);
					match(T__1);
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			{
			setState(308);
			match(ID);
			}
			setState(309);
			match(C_BRACKET);
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

	public static class Method_invokationContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(StringGrammarParser.CALL, 0); }
		public TerminalNode ID() { return getToken(StringGrammarParser.ID, 0); }
		public TerminalNode DOT_COMMA() { return getToken(StringGrammarParser.DOT_COMMA, 0); }
		public Signature_method_invokationContext signature_method_invokation() {
			return getRuleContext(Signature_method_invokationContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(StringGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(StringGrammarParser.C_BRACKET, 0); }
		public Method_invokationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_invokation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterMethod_invokation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitMethod_invokation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitMethod_invokation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_invokationContext method_invokation() throws RecognitionException {
		Method_invokationContext _localctx = new Method_invokationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_method_invokation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(CALL);
			setState(312);
			match(ID);
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(313);
				signature_method_invokation();
				}
				break;
			case 2:
				{
				{
				setState(314);
				match(O_BRACKET);
				setState(315);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(318);
			match(DOT_COMMA);
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

	public static class Global_programContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<Global_assign_varContext> global_assign_var() {
			return getRuleContexts(Global_assign_varContext.class);
		}
		public Global_assign_varContext global_assign_var(int i) {
			return getRuleContext(Global_assign_varContext.class,i);
		}
		public List<Global_assign_stringContext> global_assign_string() {
			return getRuleContexts(Global_assign_stringContext.class);
		}
		public Global_assign_stringContext global_assign_string(int i) {
			return getRuleContext(Global_assign_stringContext.class,i);
		}
		public List<Global_assign_string_arrayContext> global_assign_string_array() {
			return getRuleContexts(Global_assign_string_arrayContext.class);
		}
		public Global_assign_string_arrayContext global_assign_string_array(int i) {
			return getRuleContext(Global_assign_string_arrayContext.class,i);
		}
		public List<Subprogram_non_returnContext> subprogram_non_return() {
			return getRuleContexts(Subprogram_non_returnContext.class);
		}
		public Subprogram_non_returnContext subprogram_non_return(int i) {
			return getRuleContext(Subprogram_non_returnContext.class,i);
		}
		public List<Subprogram_returnContext> subprogram_return() {
			return getRuleContexts(Subprogram_returnContext.class);
		}
		public Subprogram_returnContext subprogram_return(int i) {
			return getRuleContext(Subprogram_returnContext.class,i);
		}
		public Global_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).enterGlobal_program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringGrammarListener) ((StringGrammarListener)listener).exitGlobal_program(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringGrammarVisitor) return ((StringGrammarVisitor<? extends T>)visitor).visitGlobal_program(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_programContext global_program() throws RecognitionException {
		Global_programContext _localctx = new Global_programContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_global_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(320);
					global_assign_var();
					}
					break;
				case 2:
					{
					setState(321);
					global_assign_string();
					}
					break;
				case 3:
					{
					setState(322);
					global_assign_string_array();
					}
					break;
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			program();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(329);
					subprogram_non_return();
					}
					break;
				case 2:
					{
					setState(330);
					subprogram_return();
					}
					break;
				}
				}
				setState(335);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return digit_expression_sempred((Digit_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean digit_expression_sempred(Digit_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0153\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5c\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5k\n\5\f\5\16\5n\13\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\5\7v\n\7\3\b\3\b\3\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080\13\b\3"+
		"\b\3\b\5\b\u0084\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\5\r\u0097\n\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u009f"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u00a8\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\5\20\u00b1\n\20\3\20\3\20\3\20\3\20\5\20\u00b7\n"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\5\24\u00ce\n\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\5\25\u00d8\n\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\5\26\u00e1\n\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\7\32\u00f9"+
		"\n\32\f\32\16\32\u00fc\13\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u0109\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0112\n\34\3\34\3\34\5\34\u0116\n\34\3\35\3\35\7\35\u011a\n\35\f\35\16"+
		"\35\u011d\13\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\7\36\u0126\n\36\f\36"+
		"\16\36\u0129\13\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u0132\n\37"+
		"\f\37\16\37\u0135\13\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \5 \u013f\n \3 \3"+
		" \3!\3!\3!\7!\u0146\n!\f!\16!\u0149\13!\3!\3!\3!\7!\u014e\n!\f!\16!\u0151"+
		"\13!\3!\2\3\b\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@\2\n\3\2\35\36\3\2\33\34\3\2\33\36\4\2,-//\3\2\21\22\3\2 %"+
		"\4\2\17\20\23\24\3\2\17\20\2\u0159\2B\3\2\2\2\4E\3\2\2\2\6Y\3\2\2\2\b"+
		"b\3\2\2\2\no\3\2\2\2\fu\3\2\2\2\16\u0083\3\2\2\2\20\u0085\3\2\2\2\22\u0088"+
		"\3\2\2\2\24\u008b\3\2\2\2\26\u008e\3\2\2\2\30\u0094\3\2\2\2\32\u009c\3"+
		"\2\2\2\34\u00a5\3\2\2\2\36\u00ae\3\2\2\2 \u00ba\3\2\2\2\"\u00c3\3\2\2"+
		"\2$\u00c8\3\2\2\2&\u00cd\3\2\2\2(\u00d3\3\2\2\2*\u00dc\3\2\2\2,\u00e7"+
		"\3\2\2\2.\u00ef\3\2\2\2\60\u00f1\3\2\2\2\62\u00f3\3\2\2\2\64\u0102\3\2"+
		"\2\2\66\u010c\3\2\2\28\u0117\3\2\2\2:\u0123\3\2\2\2<\u012e\3\2\2\2>\u0139"+
		"\3\2\2\2@\u0147\3\2\2\2BC\7\3\2\2CD\5\4\3\2D\3\3\2\2\2EI\7\7\2\2FH\5\6"+
		"\4\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\f"+
		"\2\2M\5\3\2\2\2NZ\5\36\20\2OZ\5\32\16\2PZ\5\34\17\2QZ\5\26\f\2RZ\5\"\22"+
		"\2SZ\5 \21\2TZ\5\30\r\2UZ\5(\25\2VZ\5*\26\2WZ\5> \2XZ\5,\27\2YN\3\2\2"+
		"\2YO\3\2\2\2YP\3\2\2\2YQ\3\2\2\2YR\3\2\2\2YS\3\2\2\2YT\3\2\2\2YU\3\2\2"+
		"\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\7\3\2\2\2[\\\b\5\1\2\\c\7/\2\2]^\7&"+
		"\2\2^_\5\b\5\2_`\7\'\2\2`c\3\2\2\2ac\7-\2\2b[\3\2\2\2b]\3\2\2\2ba\3\2"+
		"\2\2cl\3\2\2\2de\f\7\2\2ef\t\2\2\2fk\5\b\5\bgh\f\6\2\2hi\t\3\2\2ik\5\b"+
		"\5\7jd\3\2\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\t\3\2\2\2nl\3"+
		"\2\2\2op\7.\2\2p\13\3\2\2\2qv\7,\2\2rs\7/\2\2st\t\4\2\2tv\7/\2\2uq\3\2"+
		"\2\2ur\3\2\2\2v\r\3\2\2\2wx\7*\2\2x\u0084\7+\2\2y~\7*\2\2z{\7/\2\2{}\7"+
		"\4\2\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2"+
		"\2\u0080~\3\2\2\2\u0081\u0082\7/\2\2\u0082\u0084\7+\2\2\u0083w\3\2\2\2"+
		"\u0083y\3\2\2\2\u0084\17\3\2\2\2\u0085\u0086\7\27\2\2\u0086\u0087\5\36"+
		"\20\2\u0087\21\3\2\2\2\u0088\u0089\7\27\2\2\u0089\u008a\5\32\16\2\u008a"+
		"\23\3\2\2\2\u008b\u008c\7\27\2\2\u008c\u008d\5\34\17\2\u008d\25\3\2\2"+
		"\2\u008e\u008f\7\t\2\2\u008f\u0090\7&\2\2\u0090\u0091\t\5\2\2\u0091\u0092"+
		"\7\'\2\2\u0092\u0093\7\31\2\2\u0093\27\3\2\2\2\u0094\u0096\5.\30\2\u0095"+
		"\u0097\7\r\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\7/\2\2\u0099\u009a\7\5\2\2\u009a\u009b\5> \2\u009b\31"+
		"\3\2\2\2\u009c\u009e\7\23\2\2\u009d\u009f\7\r\2\2\u009e\u009d\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7/\2\2\u00a1\u00a2"+
		"\7\5\2\2\u00a2\u00a3\5\f\7\2\u00a3\u00a4\7\31\2\2\u00a4\33\3\2\2\2\u00a5"+
		"\u00a7\7\24\2\2\u00a6\u00a8\7\r\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa\u00ab\7\5\2\2\u00ab"+
		"\u00ac\5\16\b\2\u00ac\u00ad\7\31\2\2\u00ad\35\3\2\2\2\u00ae\u00b0\5\60"+
		"\31\2\u00af\u00b1\7\r\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\7/\2\2\u00b3\u00b6\7\5\2\2\u00b4\u00b7\5\b"+
		"\5\2\u00b5\u00b7\5\n\6\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\7\31\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\7/\2"+
		"\2\u00bb\u00bc\7\30\2\2\u00bc\u00bd\t\6\2\2\u00bd\u00be\7&\2\2\u00be\u00bf"+
		"\7/\2\2\u00bf\u00c0\7\'\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\31\2\2\u00c2"+
		"!\3\2\2\2\u00c3\u00c4\7/\2\2\u00c4\u00c5\7\5\2\2\u00c5\u00c6\5\b\5\2\u00c6"+
		"\u00c7\7\31\2\2\u00c7#\3\2\2\2\u00c8\u00c9\5\b\5\2\u00c9\u00ca\t\7\2\2"+
		"\u00ca\u00cb\5\b\5\2\u00cb%\3\2\2\2\u00cc\u00ce\7\37\2\2\u00cd\u00cc\3"+
		"\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7&\2\2\u00d0"+
		"\u00d1\5$\23\2\u00d1\u00d2\7\'\2\2\u00d2\'\3\2\2\2\u00d3\u00d4\7\16\2"+
		"\2\u00d4\u00d7\7&\2\2\u00d5\u00d8\5$\23\2\u00d6\u00d8\5&\24\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\'\2\2\u00da"+
		"\u00db\5\4\3\2\u00db)\3\2\2\2\u00dc\u00dd\7\b\2\2\u00dd\u00e0\7&\2\2\u00de"+
		"\u00e1\5$\23\2\u00df\u00e1\5&\24\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\'\2\2\u00e3\u00e4\5\4\3\2\u00e4"+
		"\u00e5\7\13\2\2\u00e5\u00e6\5\4\3\2\u00e6+\3\2\2\2\u00e7\u00e8\7\n\2\2"+
		"\u00e8\u00e9\7&\2\2\u00e9\u00ea\7/\2\2\u00ea\u00eb\7\32\2\2\u00eb\u00ec"+
		"\7/\2\2\u00ec\u00ed\7\'\2\2\u00ed\u00ee\5\4\3\2\u00ee-\3\2\2\2\u00ef\u00f0"+
		"\t\b\2\2\u00f0/\3\2\2\2\u00f1\u00f2\t\t\2\2\u00f2\61\3\2\2\2\u00f3\u00fa"+
		"\7&\2\2\u00f4\u00f5\5.\30\2\u00f5\u00f6\7/\2\2\u00f6\u00f7\7\4\2\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00fe\5.\30\2\u00fe\u00ff\7/\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\'"+
		"\2\2\u0101\63\3\2\2\2\u0102\u0103\7\6\2\2\u0103\u0104\5.\30\2\u0104\u0108"+
		"\7/\2\2\u0105\u0109\5\62\32\2\u0106\u0107\7&\2\2\u0107\u0109\7\'\2\2\u0108"+
		"\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\58"+
		"\35\2\u010b\65\3\2\2\2\u010c\u010d\7\6\2\2\u010d\u0111\7/\2\2\u010e\u0112"+
		"\5\62\32\2\u010f\u0110\7&\2\2\u0110\u0112\7\'\2\2\u0111\u010e\3\2\2\2"+
		"\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0116\5:\36\2\u0114\u0116"+
		"\5\4\3\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\67\3\2\2\2\u0117"+
		"\u011b\7\7\2\2\u0118\u011a\5\6\4\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u011f\7\25\2\2\u011f\u0120\7/\2\2\u0120\u0121\7\31"+
		"\2\2\u0121\u0122\7\f\2\2\u01229\3\2\2\2\u0123\u0127\7\7\2\2\u0124\u0126"+
		"\5\6\4\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7\25"+
		"\2\2\u012b\u012c\7\31\2\2\u012c\u012d\7\f\2\2\u012d;\3\2\2\2\u012e\u0133"+
		"\7&\2\2\u012f\u0130\7/\2\2\u0130\u0132\7\4\2\2\u0131\u012f\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7/\2\2\u0137\u0138\7\'\2\2\u0138"+
		"=\3\2\2\2\u0139\u013a\7\26\2\2\u013a\u013e\7/\2\2\u013b\u013f\5<\37\2"+
		"\u013c\u013d\7&\2\2\u013d\u013f\7\'\2\2\u013e\u013b\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\31\2\2\u0141?\3\2\2\2\u0142"+
		"\u0146\5\20\t\2\u0143\u0146\5\22\n\2\u0144\u0146\5\24\13\2\u0145\u0142"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u014a\u014f\5\2\2\2\u014b\u014e\5\66\34\2\u014c\u014e\5\64\33\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150A\3\2\2\2\u0151\u014f\3\2\2\2\36IYbjlu~"+
		"\u0083\u0096\u009e\u00a7\u00b0\u00b6\u00cd\u00d7\u00e0\u00fa\u0108\u0111"+
		"\u0115\u011b\u0127\u0133\u013e\u0145\u0147\u014d\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}