// Generated from /home/mrbig/Projects/compiler/grammar/StringParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StringParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, FOR=3, WHILE=4, END=5, BOOL=6, INT=7, STR=8, LIST=9, TRUE=10, 
		FALSE=11, NOT=12, AND=13, OR=14, FUNC=15, RETURN=16, LEN=17, IN=18, EQ=19, 
		LESS=20, GREATER=21, PRINT=22, SUM=23, MULT=24, ASSIGN=25, NAME=26, STRING=27, 
		NUMBER=28, BOOLEAN=29, COMMA=30, OPEN_PARANTHESIS=31, CLOSE_PARANTHESIS=32, 
		OPEN_SQUARE_BRACKET=33, CLOSE_SQUARE_BRACKET=34, OPEN_TRIANGLE_BRACKET=35, 
		CLOSE_TRIANGLE_BRACKET=36, SEP_SLICE=37, BEGIN=38, RET_TYPE=39, OPERATOR_DEL=40, 
		DIGIT=41, COMMENT=42, WS=43;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_function = 2, RULE_param_def = 3, 
		RULE_operators = 4, RULE_instruction = 5, RULE_if_instruction = 6, RULE_then_block = 7, 
		RULE_else_block = 8, RULE_for_instruction = 9, RULE_while_instruction = 10, 
		RULE_definition_instruction = 11, RULE_assign_instruction = 12, RULE_print = 13, 
		RULE_return_instruction = 14, RULE_operation = 15, RULE_function_call = 16, 
		RULE_get_item = 17, RULE_get_slice = 18, RULE_item_index1 = 19, RULE_item_index2 = 20, 
		RULE_param_list = 21, RULE_len_function = 22, RULE_condition = 23, RULE_logical_conj = 24, 
		RULE_logical_factor = 25, RULE_negation = 26, RULE_type = 27, RULE_list = 28, 
		RULE_operand = 29, RULE_name = 30, RULE_ident = 31, RULE_array = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "function", "param_def", "operators", "instruction", 
			"if_instruction", "then_block", "else_block", "for_instruction", "while_instruction", 
			"definition_instruction", "assign_instruction", "print", "return_instruction", 
			"operation", "function_call", "get_item", "get_slice", "item_index1", 
			"item_index2", "param_list", "len_function", "condition", "logical_conj", 
			"logical_factor", "negation", "type", "list", "operand", "name", "ident", 
			"array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'while'", "'end'", "'bool'", "'int'", 
			"'str'", "'list'", "'true'", "'false'", "'not'", "'and'", "'or'", "'func'", 
			"'return'", "'len'", "'in'", "'eq'", "'ls'", "'gr'", "'print'", "'+'", 
			"'*'", "'='", null, null, null, null, "','", "'('", "')'", "'['", "']'", 
			"'<'", "'>'", "':'", null, "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "WHILE", "END", "BOOL", "INT", "STR", "LIST", 
			"TRUE", "FALSE", "NOT", "AND", "OR", "FUNC", "RETURN", "LEN", "IN", "EQ", 
			"LESS", "GREATER", "PRINT", "SUM", "MULT", "ASSIGN", "NAME", "STRING", 
			"NUMBER", "BOOLEAN", "COMMA", "OPEN_PARANTHESIS", "CLOSE_PARANTHESIS", 
			"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "OPEN_TRIANGLE_BRACKET", 
			"CLOSE_TRIANGLE_BRACKET", "SEP_SLICE", "BEGIN", "RET_TYPE", "OPERATOR_DEL", 
			"DIGIT", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "StringParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StringParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TerminalNode> OPERATOR_DEL() { return getTokens(StringParser.OPERATOR_DEL); }
		public TerminalNode OPERATOR_DEL(int i) {
			return getToken(StringParser.OPERATOR_DEL, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case WHILE:
			case BOOL:
			case INT:
			case STR:
			case LIST:
			case FUNC:
			case RETURN:
			case LEN:
			case PRINT:
			case NAME:
			case STRING:
			case NUMBER:
			case BOOLEAN:
			case OPEN_SQUARE_BRACKET:
			case OPERATOR_DEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPERATOR_DEL) {
					{
					{
					setState(66);
					match(OPERATOR_DEL);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(74);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IF:
						case FOR:
						case WHILE:
						case BOOL:
						case INT:
						case STR:
						case LIST:
						case RETURN:
						case LEN:
						case PRINT:
						case NAME:
						case STRING:
						case NUMBER:
						case BOOLEAN:
						case OPEN_SQUARE_BRACKET:
							{
							setState(72);
							expression();
							}
							break;
						case FUNC:
							{
							setState(73);
							function();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(76);
						match(OPERATOR_DEL);
						}
						} 
					}
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(85);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case FOR:
				case WHILE:
				case BOOL:
				case INT:
				case STR:
				case LIST:
				case RETURN:
				case LEN:
				case PRINT:
				case NAME:
				case STRING:
				case NUMBER:
				case BOOLEAN:
				case OPEN_SQUARE_BRACKET:
					{
					setState(83);
					expression();
					}
					break;
				case FUNC:
					{
					setState(84);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPERATOR_DEL) {
					{
					{
					setState(87);
					match(OPERATOR_DEL);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressionContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				operation(0);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(StringParser.FUNC, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_PARANTHESIS() { return getToken(StringParser.OPEN_PARANTHESIS, 0); }
		public Param_defContext param_def() {
			return getRuleContext(Param_defContext.class,0);
		}
		public TerminalNode CLOSE_PARANTHESIS() { return getToken(StringParser.CLOSE_PARANTHESIS, 0); }
		public TerminalNode BEGIN() { return getToken(StringParser.BEGIN, 0); }
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public TerminalNode END() { return getToken(StringParser.END, 0); }
		public TerminalNode RET_TYPE() { return getToken(StringParser.RET_TYPE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(FUNC);
			setState(101);
			name();
			setState(102);
			match(OPEN_PARANTHESIS);
			setState(103);
			param_def();
			setState(104);
			match(CLOSE_PARANTHESIS);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RET_TYPE) {
				{
				setState(105);
				match(RET_TYPE);
				setState(106);
				type();
				}
			}

			setState(109);
			match(BEGIN);
			setState(110);
			operators();
			setState(111);
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

	public static class Param_defContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StringParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StringParser.COMMA, i);
		}
		public Param_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterParam_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitParam_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitParam_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_defContext param_def() throws RecognitionException {
		Param_defContext _localctx = new Param_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STR) | (1L << LIST))) != 0)) {
				{
				setState(113);
				type();
				setState(114);
				name();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(115);
					match(COMMA);
					setState(116);
					type();
					setState(117);
					name();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class OperatorsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> OPERATOR_DEL() { return getTokens(StringParser.OPERATOR_DEL); }
		public TerminalNode OPERATOR_DEL(int i) {
			return getToken(StringParser.OPERATOR_DEL, i);
		}
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operators);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					expression();
					setState(127);
					match(OPERATOR_DEL);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BOOL) | (1L << INT) | (1L << STR) | (1L << LIST) | (1L << RETURN) | (1L << LEN) | (1L << PRINT) | (1L << NAME) | (1L << STRING) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << OPEN_SQUARE_BRACKET))) != 0)) {
				{
				setState(134);
				expression();
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

	public static class InstructionContext extends ParserRuleContext {
		public If_instructionContext if_instruction() {
			return getRuleContext(If_instructionContext.class,0);
		}
		public For_instructionContext for_instruction() {
			return getRuleContext(For_instructionContext.class,0);
		}
		public While_instructionContext while_instruction() {
			return getRuleContext(While_instructionContext.class,0);
		}
		public Definition_instructionContext definition_instruction() {
			return getRuleContext(Definition_instructionContext.class,0);
		}
		public Assign_instructionContext assign_instruction() {
			return getRuleContext(Assign_instructionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Return_instructionContext return_instruction() {
			return getRuleContext(Return_instructionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruction);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				if_instruction();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				for_instruction();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				while_instruction();
				}
				break;
			case BOOL:
			case INT:
			case STR:
			case LIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				definition_instruction();
				}
				break;
			case NAME:
			case STRING:
			case NUMBER:
			case BOOLEAN:
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				assign_instruction();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				print();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				return_instruction();
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

	public static class If_instructionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(StringParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> BEGIN() { return getTokens(StringParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(StringParser.BEGIN, i);
		}
		public Then_blockContext then_block() {
			return getRuleContext(Then_blockContext.class,0);
		}
		public TerminalNode END() { return getToken(StringParser.END, 0); }
		public TerminalNode ELSE() { return getToken(StringParser.ELSE, 0); }
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterIf_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitIf_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitIf_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_instructionContext if_instruction() throws RecognitionException {
		If_instructionContext _localctx = new If_instructionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(IF);
			setState(147);
			condition();
			setState(148);
			match(BEGIN);
			setState(149);
			then_block();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(150);
				match(ELSE);
				setState(151);
				match(BEGIN);
				setState(152);
				else_block();
				}
			}

			setState(155);
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

	public static class Then_blockContext extends ParserRuleContext {
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public Then_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterThen_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitThen_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitThen_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Then_blockContext then_block() throws RecognitionException {
		Then_blockContext _localctx = new Then_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_then_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			operators();
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

	public static class Else_blockContext extends ParserRuleContext {
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			operators();
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

	public static class For_instructionContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(StringParser.FOR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(StringParser.COMMA, 0); }
		public TerminalNode BEGIN() { return getToken(StringParser.BEGIN, 0); }
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public TerminalNode END() { return getToken(StringParser.END, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public For_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterFor_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitFor_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitFor_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_instructionContext for_instruction() throws RecognitionException {
		For_instructionContext _localctx = new For_instructionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(FOR);
			setState(162);
			name();
			setState(163);
			match(COMMA);
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(164);
				operand();
				}
				break;
			case 2:
				{
				setState(165);
				operation(0);
				}
				break;
			}
			setState(168);
			match(BEGIN);
			setState(169);
			operators();
			setState(170);
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

	public static class While_instructionContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(StringParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(StringParser.BEGIN, 0); }
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public TerminalNode END() { return getToken(StringParser.END, 0); }
		public While_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterWhile_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitWhile_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitWhile_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_instructionContext while_instruction() throws RecognitionException {
		While_instructionContext _localctx = new While_instructionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(WHILE);
			setState(173);
			condition();
			setState(174);
			match(BEGIN);
			setState(175);
			operators();
			setState(176);
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

	public static class Definition_instructionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(StringParser.ASSIGN, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Definition_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterDefinition_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitDefinition_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitDefinition_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_instructionContext definition_instruction() throws RecognitionException {
		Definition_instructionContext _localctx = new Definition_instructionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_definition_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			type();
			setState(179);
			name();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(180);
				match(ASSIGN);
				setState(181);
				operation(0);
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

	public static class Assign_instructionContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(StringParser.ASSIGN, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Get_sliceContext get_slice() {
			return getRuleContext(Get_sliceContext.class,0);
		}
		public Get_itemContext get_item() {
			return getRuleContext(Get_itemContext.class,0);
		}
		public Assign_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterAssign_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitAssign_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitAssign_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_instructionContext assign_instruction() throws RecognitionException {
		Assign_instructionContext _localctx = new Assign_instructionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(184);
				name();
				}
				break;
			case 2:
				{
				setState(185);
				get_slice();
				}
				break;
			case 3:
				{
				setState(186);
				get_item();
				}
				break;
			}
			setState(189);
			match(ASSIGN);
			setState(190);
			operation(0);
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
		public TerminalNode PRINT() { return getToken(StringParser.PRINT, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(PRINT);
			setState(193);
			param_list();
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

	public static class Return_instructionContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(StringParser.RETURN, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Return_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterReturn_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitReturn_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitReturn_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_instructionContext return_instruction() throws RecognitionException {
		Return_instructionContext _localctx = new Return_instructionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_return_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(RETURN);
			setState(196);
			operation(0);
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

	public static class OperationContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Get_itemContext get_item() {
			return getRuleContext(Get_itemContext.class,0);
		}
		public Get_sliceContext get_slice() {
			return getRuleContext(Get_sliceContext.class,0);
		}
		public Len_functionContext len_function() {
			return getRuleContext(Len_functionContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode SUM() { return getToken(StringParser.SUM, 0); }
		public TerminalNode IN() { return getToken(StringParser.IN, 0); }
		public TerminalNode EQ() { return getToken(StringParser.EQ, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(199);
				function_call();
				}
				break;
			case 2:
				{
				setState(200);
				get_item();
				}
				break;
			case 3:
				{
				setState(201);
				get_slice();
				}
				break;
			case 4:
				{
				setState(202);
				len_function();
				}
				break;
			case 5:
				{
				setState(203);
				operand();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(206);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(207);
						match(SUM);
						setState(208);
						operation(6);
						}
						break;
					case 2:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(209);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(210);
						match(IN);
						setState(211);
						operation(5);
						}
						break;
					case 3:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(212);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(213);
						match(EQ);
						setState(214);
						operation(4);
						}
						break;
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Function_callContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_PARANTHESIS() { return getToken(StringParser.OPEN_PARANTHESIS, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode CLOSE_PARANTHESIS() { return getToken(StringParser.CLOSE_PARANTHESIS, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			name();
			setState(221);
			match(OPEN_PARANTHESIS);
			setState(222);
			param_list();
			setState(223);
			match(CLOSE_PARANTHESIS);
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

	public static class Get_itemContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(StringParser.OPEN_SQUARE_BRACKET, 0); }
		public Item_index1Context item_index1() {
			return getRuleContext(Item_index1Context.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(StringParser.CLOSE_SQUARE_BRACKET, 0); }
		public Get_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterGet_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitGet_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitGet_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_itemContext get_item() throws RecognitionException {
		Get_itemContext _localctx = new Get_itemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_get_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			operand();
			setState(226);
			match(OPEN_SQUARE_BRACKET);
			setState(227);
			item_index1();
			setState(228);
			match(CLOSE_SQUARE_BRACKET);
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

	public static class Get_sliceContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(StringParser.OPEN_SQUARE_BRACKET, 0); }
		public Item_index1Context item_index1() {
			return getRuleContext(Item_index1Context.class,0);
		}
		public TerminalNode SEP_SLICE() { return getToken(StringParser.SEP_SLICE, 0); }
		public Item_index2Context item_index2() {
			return getRuleContext(Item_index2Context.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(StringParser.CLOSE_SQUARE_BRACKET, 0); }
		public Get_sliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_slice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterGet_slice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitGet_slice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitGet_slice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_sliceContext get_slice() throws RecognitionException {
		Get_sliceContext _localctx = new Get_sliceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_get_slice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			operand();
			setState(231);
			match(OPEN_SQUARE_BRACKET);
			setState(232);
			item_index1();
			setState(233);
			match(SEP_SLICE);
			setState(234);
			item_index2();
			setState(235);
			match(CLOSE_SQUARE_BRACKET);
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

	public static class Item_index1Context extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Item_index1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_index1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterItem_index1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitItem_index1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitItem_index1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_index1Context item_index1() throws RecognitionException {
		Item_index1Context _localctx = new Item_index1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_item_index1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			operand();
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

	public static class Item_index2Context extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Item_index2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_index2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterItem_index2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitItem_index2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitItem_index2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_index2Context item_index2() throws RecognitionException {
		Item_index2Context _localctx = new Item_index2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_item_index2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			operand();
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

	public static class Param_listContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StringParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StringParser.COMMA, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEN) | (1L << NAME) | (1L << STRING) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << OPEN_SQUARE_BRACKET))) != 0)) {
				{
				setState(241);
				operation(0);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(242);
					match(COMMA);
					setState(243);
					operation(0);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Len_functionContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(StringParser.LEN, 0); }
		public TerminalNode OPEN_PARANTHESIS() { return getToken(StringParser.OPEN_PARANTHESIS, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode CLOSE_PARANTHESIS() { return getToken(StringParser.CLOSE_PARANTHESIS, 0); }
		public Len_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterLen_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitLen_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitLen_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Len_functionContext len_function() throws RecognitionException {
		Len_functionContext _localctx = new Len_functionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_len_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(LEN);
			setState(252);
			match(OPEN_PARANTHESIS);
			setState(253);
			operation(0);
			setState(254);
			match(CLOSE_PARANTHESIS);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARANTHESIS() { return getToken(StringParser.OPEN_PARANTHESIS, 0); }
		public List<Logical_conjContext> logical_conj() {
			return getRuleContexts(Logical_conjContext.class);
		}
		public Logical_conjContext logical_conj(int i) {
			return getRuleContext(Logical_conjContext.class,i);
		}
		public TerminalNode CLOSE_PARANTHESIS() { return getToken(StringParser.CLOSE_PARANTHESIS, 0); }
		public List<TerminalNode> OR() { return getTokens(StringParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(StringParser.OR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condition);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(OPEN_PARANTHESIS);
				setState(257);
				logical_conj();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(258);
					match(OR);
					setState(259);
					logical_conj();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				match(CLOSE_PARANTHESIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				logical_conj();
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(268);
					match(OR);
					setState(269);
					logical_conj();
					}
					}
					setState(274);
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

	public static class Logical_conjContext extends ParserRuleContext {
		public TerminalNode OPEN_PARANTHESIS() { return getToken(StringParser.OPEN_PARANTHESIS, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PARANTHESIS() { return getToken(StringParser.CLOSE_PARANTHESIS, 0); }
		public List<Logical_factorContext> logical_factor() {
			return getRuleContexts(Logical_factorContext.class);
		}
		public Logical_factorContext logical_factor(int i) {
			return getRuleContext(Logical_factorContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(StringParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(StringParser.AND, i);
		}
		public Logical_conjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_conj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterLogical_conj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitLogical_conj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitLogical_conj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_conjContext logical_conj() throws RecognitionException {
		Logical_conjContext _localctx = new Logical_conjContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logical_conj);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(OPEN_PARANTHESIS);
				setState(278);
				condition();
				setState(279);
				match(CLOSE_PARANTHESIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				logical_factor();
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(282);
					match(AND);
					setState(283);
					logical_factor();
					}
					}
					setState(288);
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

	public static class Logical_factorContext extends ParserRuleContext {
		public TerminalNode OPEN_PARANTHESIS() { return getToken(StringParser.OPEN_PARANTHESIS, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PARANTHESIS() { return getToken(StringParser.CLOSE_PARANTHESIS, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public Logical_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterLogical_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitLogical_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitLogical_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_factorContext logical_factor() throws RecognitionException {
		Logical_factorContext _localctx = new Logical_factorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logical_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(291);
				negation();
				}
			}

			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PARANTHESIS:
				{
				setState(294);
				match(OPEN_PARANTHESIS);
				setState(295);
				condition();
				setState(296);
				match(CLOSE_PARANTHESIS);
				}
				break;
			case LEN:
			case NAME:
			case STRING:
			case NUMBER:
			case BOOLEAN:
			case OPEN_SQUARE_BRACKET:
				{
				setState(298);
				operation(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NegationContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(StringParser.NOT, 0); }
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(NOT);
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
		public TerminalNode BOOL() { return getToken(StringParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(StringParser.INT, 0); }
		public TerminalNode STR() { return getToken(StringParser.STR, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(BOOL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(INT);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(STR);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				list();
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(StringParser.LIST, 0); }
		public TerminalNode OPEN_TRIANGLE_BRACKET() { return getToken(StringParser.OPEN_TRIANGLE_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSE_TRIANGLE_BRACKET() { return getToken(StringParser.CLOSE_TRIANGLE_BRACKET, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(LIST);
			setState(310);
			match(OPEN_TRIANGLE_BRACKET);
			setState(311);
			type();
			setState(312);
			match(CLOSE_TRIANGLE_BRACKET);
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

	public static class OperandContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operand);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				name();
				}
				break;
			case STRING:
			case NUMBER:
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				ident();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				array();
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(StringParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(StringParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(StringParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(StringParser.BOOLEAN, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << BOOLEAN))) != 0)) ) {
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(StringParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(StringParser.CLOSE_SQUARE_BRACKET, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StringParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StringParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringParserListener ) ((StringParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringParserVisitor ) return ((StringParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(OPEN_SQUARE_BRACKET);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << STRING) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << OPEN_SQUARE_BRACKET))) != 0)) {
				{
				setState(324);
				operand();
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(325);
					match(COMMA);
					setState(326);
					operand();
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(334);
			match(CLOSE_SQUARE_BRACKET);
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
		case 15:
			return operation_sempred((OperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0153\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\5\2M\n\2\3\2\3\2\7\2Q"+
		"\n\2\f\2\16\2T\13\2\3\2\3\2\5\2X\n\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\5"+
		"\2a\n\2\3\3\3\3\5\3e\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5z\n\5\f\5\16\5}\13\5\5\5\177\n\5\3"+
		"\6\3\6\3\6\7\6\u0084\n\6\f\6\16\6\u0087\13\6\3\6\5\6\u008a\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u0093\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009c"+
		"\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a9\n\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00b9"+
		"\n\r\3\16\3\16\3\16\5\16\u00be\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00cf\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00da\n\21\f\21\16\21\u00dd\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\7\27\u00f7\n\27\f\27"+
		"\16\27\u00fa\13\27\5\27\u00fc\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\7\31\u0107\n\31\f\31\16\31\u010a\13\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u0111\n\31\f\31\16\31\u0114\13\31\5\31\u0116\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u011f\n\32\f\32\16\32\u0122\13\32\5\32"+
		"\u0124\n\32\3\33\5\33\u0127\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u012e\n"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0136\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\5\37\u0140\n\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\7\"\u014a"+
		"\n\"\f\"\16\"\u014d\13\"\5\"\u014f\n\"\3\"\3\"\3\"\2\3 #\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\3\3\2\35\37\2\u015f"+
		"\2`\3\2\2\2\4d\3\2\2\2\6f\3\2\2\2\b~\3\2\2\2\n\u0085\3\2\2\2\f\u0092\3"+
		"\2\2\2\16\u0094\3\2\2\2\20\u009f\3\2\2\2\22\u00a1\3\2\2\2\24\u00a3\3\2"+
		"\2\2\26\u00ae\3\2\2\2\30\u00b4\3\2\2\2\32\u00bd\3\2\2\2\34\u00c2\3\2\2"+
		"\2\36\u00c5\3\2\2\2 \u00ce\3\2\2\2\"\u00de\3\2\2\2$\u00e3\3\2\2\2&\u00e8"+
		"\3\2\2\2(\u00ef\3\2\2\2*\u00f1\3\2\2\2,\u00fb\3\2\2\2.\u00fd\3\2\2\2\60"+
		"\u0115\3\2\2\2\62\u0123\3\2\2\2\64\u0126\3\2\2\2\66\u012f\3\2\2\28\u0135"+
		"\3\2\2\2:\u0137\3\2\2\2<\u013f\3\2\2\2>\u0141\3\2\2\2@\u0143\3\2\2\2B"+
		"\u0145\3\2\2\2DF\7*\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HR\3\2"+
		"\2\2IG\3\2\2\2JM\5\4\3\2KM\5\6\4\2LJ\3\2\2\2LK\3\2\2\2MN\3\2\2\2NO\7*"+
		"\2\2OQ\3\2\2\2PL\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SW\3\2\2\2TR\3\2"+
		"\2\2UX\5\4\3\2VX\5\6\4\2WU\3\2\2\2WV\3\2\2\2X\\\3\2\2\2Y[\7*\2\2ZY\3\2"+
		"\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]a\3\2\2\2^\\\3\2\2\2_a\3\2\2\2`G"+
		"\3\2\2\2`_\3\2\2\2a\3\3\2\2\2be\5\f\7\2ce\5 \21\2db\3\2\2\2dc\3\2\2\2"+
		"e\5\3\2\2\2fg\7\21\2\2gh\5> \2hi\7!\2\2ij\5\b\5\2jm\7\"\2\2kl\7)\2\2l"+
		"n\58\35\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7(\2\2pq\5\n\6\2qr\7\7\2\2r"+
		"\7\3\2\2\2st\58\35\2t{\5> \2uv\7 \2\2vw\58\35\2wx\5> \2xz\3\2\2\2yu\3"+
		"\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~s\3\2\2\2"+
		"~\177\3\2\2\2\177\t\3\2\2\2\u0080\u0081\5\4\3\2\u0081\u0082\7*\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u008a\5\4\3\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\13\3\2\2"+
		"\2\u008b\u0093\5\16\b\2\u008c\u0093\5\24\13\2\u008d\u0093\5\26\f\2\u008e"+
		"\u0093\5\30\r\2\u008f\u0093\5\32\16\2\u0090\u0093\5\34\17\2\u0091\u0093"+
		"\5\36\20\2\u0092\u008b\3\2\2\2\u0092\u008c\3\2\2\2\u0092\u008d\3\2\2\2"+
		"\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091"+
		"\3\2\2\2\u0093\r\3\2\2\2\u0094\u0095\7\3\2\2\u0095\u0096\5\60\31\2\u0096"+
		"\u0097\7(\2\2\u0097\u009b\5\20\t\2\u0098\u0099\7\4\2\2\u0099\u009a\7("+
		"\2\2\u009a\u009c\5\22\n\2\u009b\u0098\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\7\7\2\2\u009e\17\3\2\2\2\u009f\u00a0\5\n\6"+
		"\2\u00a0\21\3\2\2\2\u00a1\u00a2\5\n\6\2\u00a2\23\3\2\2\2\u00a3\u00a4\7"+
		"\5\2\2\u00a4\u00a5\5> \2\u00a5\u00a8\7 \2\2\u00a6\u00a9\5<\37\2\u00a7"+
		"\u00a9\5 \21\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\7(\2\2\u00ab\u00ac\5\n\6\2\u00ac\u00ad\7\7\2\2\u00ad"+
		"\25\3\2\2\2\u00ae\u00af\7\6\2\2\u00af\u00b0\5\60\31\2\u00b0\u00b1\7(\2"+
		"\2\u00b1\u00b2\5\n\6\2\u00b2\u00b3\7\7\2\2\u00b3\27\3\2\2\2\u00b4\u00b5"+
		"\58\35\2\u00b5\u00b8\5> \2\u00b6\u00b7\7\33\2\2\u00b7\u00b9\5 \21\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\31\3\2\2\2\u00ba\u00be\5> \2"+
		"\u00bb\u00be\5&\24\2\u00bc\u00be\5$\23\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\33\2\2"+
		"\u00c0\u00c1\5 \21\2\u00c1\33\3\2\2\2\u00c2\u00c3\7\30\2\2\u00c3\u00c4"+
		"\5,\27\2\u00c4\35\3\2\2\2\u00c5\u00c6\7\22\2\2\u00c6\u00c7\5 \21\2\u00c7"+
		"\37\3\2\2\2\u00c8\u00c9\b\21\1\2\u00c9\u00cf\5\"\22\2\u00ca\u00cf\5$\23"+
		"\2\u00cb\u00cf\5&\24\2\u00cc\u00cf\5.\30\2\u00cd\u00cf\5<\37\2\u00ce\u00c8"+
		"\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00db\3\2\2\2\u00d0\u00d1\f\7\2\2\u00d1\u00d2\7\31"+
		"\2\2\u00d2\u00da\5 \21\b\u00d3\u00d4\f\6\2\2\u00d4\u00d5\7\24\2\2\u00d5"+
		"\u00da\5 \21\7\u00d6\u00d7\f\5\2\2\u00d7\u00d8\7\25\2\2\u00d8\u00da\5"+
		" \21\6\u00d9\u00d0\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc!\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00de\u00df\5> \2\u00df\u00e0\7!\2\2\u00e0\u00e1"+
		"\5,\27\2\u00e1\u00e2\7\"\2\2\u00e2#\3\2\2\2\u00e3\u00e4\5<\37\2\u00e4"+
		"\u00e5\7#\2\2\u00e5\u00e6\5(\25\2\u00e6\u00e7\7$\2\2\u00e7%\3\2\2\2\u00e8"+
		"\u00e9\5<\37\2\u00e9\u00ea\7#\2\2\u00ea\u00eb\5(\25\2\u00eb\u00ec\7\'"+
		"\2\2\u00ec\u00ed\5*\26\2\u00ed\u00ee\7$\2\2\u00ee\'\3\2\2\2\u00ef\u00f0"+
		"\5<\37\2\u00f0)\3\2\2\2\u00f1\u00f2\5<\37\2\u00f2+\3\2\2\2\u00f3\u00f8"+
		"\5 \21\2\u00f4\u00f5\7 \2\2\u00f5\u00f7\5 \21\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"-\3\2\2\2\u00fd\u00fe\7\23\2\2\u00fe\u00ff\7!\2\2\u00ff\u0100\5 \21\2"+
		"\u0100\u0101\7\"\2\2\u0101/\3\2\2\2\u0102\u0103\7!\2\2\u0103\u0108\5\62"+
		"\32\2\u0104\u0105\7\20\2\2\u0105\u0107\5\62\32\2\u0106\u0104\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7\"\2\2\u010c\u0116\3\2\2\2\u010d"+
		"\u0112\5\62\32\2\u010e\u010f\7\20\2\2\u010f\u0111\5\62\32\2\u0110\u010e"+
		"\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0102\3\2\2\2\u0115\u010d\3\2"+
		"\2\2\u0116\61\3\2\2\2\u0117\u0118\7!\2\2\u0118\u0119\5\60\31\2\u0119\u011a"+
		"\7\"\2\2\u011a\u0124\3\2\2\2\u011b\u0120\5\64\33\2\u011c\u011d\7\17\2"+
		"\2\u011d\u011f\5\64\33\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123\u0117\3\2\2\2\u0123\u011b\3\2\2\2\u0124\63\3\2\2\2\u0125\u0127"+
		"\5\66\34\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012d\3\2\2\2"+
		"\u0128\u0129\7!\2\2\u0129\u012a\5\60\31\2\u012a\u012b\7\"\2\2\u012b\u012e"+
		"\3\2\2\2\u012c\u012e\5 \21\2\u012d\u0128\3\2\2\2\u012d\u012c\3\2\2\2\u012e"+
		"\65\3\2\2\2\u012f\u0130\7\16\2\2\u0130\67\3\2\2\2\u0131\u0136\7\b\2\2"+
		"\u0132\u0136\7\t\2\2\u0133\u0136\7\n\2\2\u0134\u0136\5:\36\2\u0135\u0131"+
		"\3\2\2\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"9\3\2\2\2\u0137\u0138\7\13\2\2\u0138\u0139\7%\2\2\u0139\u013a\58\35\2"+
		"\u013a\u013b\7&\2\2\u013b;\3\2\2\2\u013c\u0140\5> \2\u013d\u0140\5@!\2"+
		"\u013e\u0140\5B\"\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e"+
		"\3\2\2\2\u0140=\3\2\2\2\u0141\u0142\7\34\2\2\u0142?\3\2\2\2\u0143\u0144"+
		"\t\2\2\2\u0144A\3\2\2\2\u0145\u014e\7#\2\2\u0146\u014b\5<\37\2\u0147\u0148"+
		"\7 \2\2\u0148\u014a\5<\37\2\u0149\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014e\u0146\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\7$\2\2\u0151C\3\2\2\2#GLRW\\`dm{~\u0085\u0089\u0092\u009b\u00a8"+
		"\u00b8\u00bd\u00ce\u00d9\u00db\u00f8\u00fb\u0108\u0112\u0115\u0120\u0123"+
		"\u0126\u012d\u0135\u013f\u014b\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}