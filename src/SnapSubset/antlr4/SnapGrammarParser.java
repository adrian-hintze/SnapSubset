package antlr4;
// Generated from SnapGrammar.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SnapGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRAGMA=1, STRING=2, SINGLELINE_COMMENT=3, MULTILINE_COMMENT=4, REGULAR_EXPRESSION=5, 
		NEW=6, THROW=7, DELETE=8, BREAK=9, CONTINUE=10, RETURN=11, FOR=12, WHILE=13, 
		IN=14, IF=15, DO=16, SWITCH=17, CASE=18, DEFAULT=19, TRY=20, CATCH=21, 
		FINALLY=22, ELSE=23, TRUE=24, FALSE=25, INCREMENT=26, DECREMENT=27, PLUS=28, 
		MINUS=29, MULTIPLICATION=30, DIVISION=31, MODULUS=32, BIT_AND=33, BIT_OR=34, 
		BIT_XOR=35, BIT_NOT=36, SHIFT_LEFT=37, SHIFT_RIGHT_PROP=38, SHIFT_RIGHT=39, 
		VAR=40, AND=41, OR=42, NOT=43, INSTANCEOF=44, TYPEOF=45, ASSIGN=46, PASSIGN=47, 
		MASSIGN=48, DIVASSIGN=49, MULTASSIGN=50, MODASSIGN=51, EQ=52, NE=53, GT=54, 
		LT=55, GE=56, LE=57, COMMA=58, COLON=59, QUESTIONMARK=60, END_STATEMENT=61, 
		RSB=62, LSB=63, RB=64, LB=65, RP=66, LP=67, FUNCTION=68, DOT=69, NUMBER=70, 
		ID=71, WS=72;
	public static final int
		RULE_jsnap_code = 0, RULE_pragma = 1, RULE_statement = 2, RULE_compressed_conditional_util = 3, 
		RULE_declaration_util = 4, RULE_var_assign_util = 5, RULE_assign_util = 6, 
		RULE_if_util = 7, RULE_try_catch_util = 8, RULE_try_catch_util_try = 9, 
		RULE_try_catch_util_catch = 10, RULE_try_catch_util_finally = 11, RULE_return_util = 12, 
		RULE_for_util = 13, RULE_for_parameters = 14, RULE_function_declaration_util = 15, 
		RULE_switch_util = 16, RULE_switch_body = 17, RULE_switch_case = 18, RULE_switch_default = 19, 
		RULE_while_util = 20, RULE_do_while_util = 21, RULE_statement_list_util = 22, 
		RULE_assign_operator = 23, RULE_parameters = 24, RULE_instruction = 25, 
		RULE_new_object_declaration_util = 26, RULE_object_access_util = 27, RULE_object_attribute = 28, 
		RULE_access_operator = 29, RULE_parenthesized_operation_util = 30, RULE_atom = 31, 
		RULE_code_block_util = 32, RULE_code_block_util_contents = 33, RULE_array_util = 34, 
		RULE_identifier_util = 35, RULE_id = 36, RULE_json_contents = 37, RULE_typeof_operator = 38, 
		RULE_and_operator = 39, RULE_or_operator = 40, RULE_sign_operator = 41, 
		RULE_comparison_operator = 42, RULE_bit_operator = 43, RULE_xment_operator = 44, 
		RULE_arithmetic_operator = 45, RULE_glorified_arithmetic_operator = 46, 
		RULE_end_statement = 47;
	public static final String[] ruleNames = {
		"jsnap_code", "pragma", "statement", "compressed_conditional_util", "declaration_util", 
		"var_assign_util", "assign_util", "if_util", "try_catch_util", "try_catch_util_try", 
		"try_catch_util_catch", "try_catch_util_finally", "return_util", "for_util", 
		"for_parameters", "function_declaration_util", "switch_util", "switch_body", 
		"switch_case", "switch_default", "while_util", "do_while_util", "statement_list_util", 
		"assign_operator", "parameters", "instruction", "new_object_declaration_util", 
		"object_access_util", "object_attribute", "access_operator", "parenthesized_operation_util", 
		"atom", "code_block_util", "code_block_util_contents", "array_util", "identifier_util", 
		"id", "json_contents", "typeof_operator", "and_operator", "or_operator", 
		"sign_operator", "comparison_operator", "bit_operator", "xment_operator", 
		"arithmetic_operator", "glorified_arithmetic_operator", "end_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'new'", "'throw'", "'delete'", "'break'", 
		"'continue'", "'return'", "'for'", "'while'", "'in'", "'if'", "'do'", 
		"'switch'", "'case'", "'default'", "'try'", "'catch'", "'finally'", "'else'", 
		"'true'", "'false'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'&'", "'|'", "'^'", "'~'", "'<<'", "'>>'", "'>>>'", "'var'", "'&&'", 
		"'||'", "'!'", "'instanceof'", "'typeof'", "'='", "'+='", "'-='", "'/='", 
		"'*='", "'%='", null, null, "'>'", "'<'", "'>='", "'<='", "','", "':'", 
		"'?'", "';'", "']'", "'['", "'}'", "'{'", "')'", "'('", "'function'", 
		"'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRAGMA", "STRING", "SINGLELINE_COMMENT", "MULTILINE_COMMENT", "REGULAR_EXPRESSION", 
		"NEW", "THROW", "DELETE", "BREAK", "CONTINUE", "RETURN", "FOR", "WHILE", 
		"IN", "IF", "DO", "SWITCH", "CASE", "DEFAULT", "TRY", "CATCH", "FINALLY", 
		"ELSE", "TRUE", "FALSE", "INCREMENT", "DECREMENT", "PLUS", "MINUS", "MULTIPLICATION", 
		"DIVISION", "MODULUS", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", "SHIFT_LEFT", 
		"SHIFT_RIGHT_PROP", "SHIFT_RIGHT", "VAR", "AND", "OR", "NOT", "INSTANCEOF", 
		"TYPEOF", "ASSIGN", "PASSIGN", "MASSIGN", "DIVASSIGN", "MULTASSIGN", "MODASSIGN", 
		"EQ", "NE", "GT", "LT", "GE", "LE", "COMMA", "COLON", "QUESTIONMARK", 
		"END_STATEMENT", "RSB", "LSB", "RB", "LB", "RP", "LP", "FUNCTION", "DOT", 
		"NUMBER", "ID", "WS"
	};
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
	public String getGrammarFileName() { return "SnapGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SnapGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Jsnap_codeContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SnapGrammarParser.EOF, 0); }
		public List<Function_declaration_utilContext> function_declaration_util() {
			return getRuleContexts(Function_declaration_utilContext.class);
		}
		public Function_declaration_utilContext function_declaration_util(int i) {
			return getRuleContext(Function_declaration_utilContext.class,i);
		}
		public List<Assign_utilContext> assign_util() {
			return getRuleContexts(Assign_utilContext.class);
		}
		public Assign_utilContext assign_util(int i) {
			return getRuleContext(Assign_utilContext.class,i);
		}
		public List<End_statementContext> end_statement() {
			return getRuleContexts(End_statementContext.class);
		}
		public End_statementContext end_statement(int i) {
			return getRuleContext(End_statementContext.class,i);
		}
		public List<Declaration_utilContext> declaration_util() {
			return getRuleContexts(Declaration_utilContext.class);
		}
		public Declaration_utilContext declaration_util(int i) {
			return getRuleContext(Declaration_utilContext.class,i);
		}
		public List<Object_access_utilContext> object_access_util() {
			return getRuleContexts(Object_access_utilContext.class);
		}
		public Object_access_utilContext object_access_util(int i) {
			return getRuleContext(Object_access_utilContext.class,i);
		}
		public List<PragmaContext> pragma() {
			return getRuleContexts(PragmaContext.class);
		}
		public PragmaContext pragma(int i) {
			return getRuleContext(PragmaContext.class,i);
		}
		public Jsnap_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsnap_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterJsnap_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitJsnap_code(this);
		}
	}

	public final Jsnap_codeContext jsnap_code() throws RecognitionException {
		Jsnap_codeContext _localctx = new Jsnap_codeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jsnap_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRAGMA) | (1L << STRING) | (1L << REGULAR_EXPRESSION) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << VAR) | (1L << LSB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LB - 65)) | (1L << (LP - 65)) | (1L << (FUNCTION - 65)) | (1L << (NUMBER - 65)) | (1L << (ID - 65)))) != 0)) {
				{
				setState(107);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(96);
					function_declaration_util();
					}
					break;
				case 2:
					{
					setState(97);
					assign_util();
					setState(98);
					end_statement();
					}
					break;
				case 3:
					{
					setState(100);
					declaration_util();
					setState(101);
					end_statement();
					}
					break;
				case 4:
					{
					setState(103);
					object_access_util();
					setState(104);
					end_statement();
					}
					break;
				case 5:
					{
					setState(106);
					pragma();
					}
					break;
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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

	public static class PragmaContext extends ParserRuleContext {
		public TerminalNode PRAGMA() { return getToken(SnapGrammarParser.PRAGMA, 0); }
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterPragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitPragma(this);
		}
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(PRAGMA);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Try_catchContext extends StatementContext {
		public Try_catch_utilContext try_catch_util() {
			return getRuleContext(Try_catch_utilContext.class,0);
		}
		public Try_catchContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterTry_catch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitTry_catch(this);
		}
	}
	public static class Compressed_conditionalContext extends StatementContext {
		public Compressed_conditional_utilContext compressed_conditional_util() {
			return getRuleContext(Compressed_conditional_utilContext.class,0);
		}
		public Compressed_conditionalContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterCompressed_conditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitCompressed_conditional(this);
		}
	}
	public static class ForContext extends StatementContext {
		public For_utilContext for_util() {
			return getRuleContext(For_utilContext.class,0);
		}
		public ForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitFor(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public While_utilContext while_util() {
			return getRuleContext(While_utilContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitWhile(this);
		}
	}
	public static class DeclarationContext extends StatementContext {
		public Declaration_utilContext declaration_util() {
			return getRuleContext(Declaration_utilContext.class,0);
		}
		public DeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitDeclaration(this);
		}
	}
	public static class IfContext extends StatementContext {
		public If_utilContext if_util() {
			return getRuleContext(If_utilContext.class,0);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitIf(this);
		}
	}
	public static class OperationContext extends StatementContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public OperationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitOperation(this);
		}
	}
	public static class ReturnContext extends StatementContext {
		public Return_utilContext return_util() {
			return getRuleContext(Return_utilContext.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitReturn(this);
		}
	}
	public static class Do_whileContext extends StatementContext {
		public Do_while_utilContext do_while_util() {
			return getRuleContext(Do_while_utilContext.class,0);
		}
		public Do_whileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitDo_while(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public Assign_utilContext assign_util() {
			return getRuleContext(Assign_utilContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitAssign(this);
		}
	}
	public static class SwitchContext extends StatementContext {
		public Switch_utilContext switch_util() {
			return getRuleContext(Switch_utilContext.class,0);
		}
		public SwitchContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitSwitch(this);
		}
	}
	public static class Statement_listContext extends StatementContext {
		public Statement_list_utilContext statement_list_util() {
			return getRuleContext(Statement_list_utilContext.class,0);
		}
		public Statement_listContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitStatement_list(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				declaration_util();
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				assign_util();
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				if_util();
				}
				break;
			case 4:
				_localctx = new Try_catchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				try_catch_util();
				}
				break;
			case 5:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				return_util();
				}
				break;
			case 6:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				for_util();
				}
				break;
			case 7:
				_localctx = new SwitchContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				switch_util();
				}
				break;
			case 8:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(123);
				while_util();
				}
				break;
			case 9:
				_localctx = new Do_whileContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(124);
				do_while_util();
				}
				break;
			case 10:
				_localctx = new OperationContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(125);
				instruction(0);
				}
				break;
			case 11:
				_localctx = new Statement_listContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(126);
				statement_list_util();
				}
				break;
			case 12:
				_localctx = new Compressed_conditionalContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(127);
				compressed_conditional_util();
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

	public static class Compressed_conditional_utilContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode QUESTIONMARK() { return getToken(SnapGrammarParser.QUESTIONMARK, 0); }
		public TerminalNode COLON() { return getToken(SnapGrammarParser.COLON, 0); }
		public List<Assign_utilContext> assign_util() {
			return getRuleContexts(Assign_utilContext.class);
		}
		public Assign_utilContext assign_util(int i) {
			return getRuleContext(Assign_utilContext.class,i);
		}
		public List<Return_utilContext> return_util() {
			return getRuleContexts(Return_utilContext.class);
		}
		public Return_utilContext return_util(int i) {
			return getRuleContext(Return_utilContext.class,i);
		}
		public List<Function_declaration_utilContext> function_declaration_util() {
			return getRuleContexts(Function_declaration_utilContext.class);
		}
		public Function_declaration_utilContext function_declaration_util(int i) {
			return getRuleContext(Function_declaration_utilContext.class,i);
		}
		public List<Compressed_conditional_utilContext> compressed_conditional_util() {
			return getRuleContexts(Compressed_conditional_utilContext.class);
		}
		public Compressed_conditional_utilContext compressed_conditional_util(int i) {
			return getRuleContext(Compressed_conditional_utilContext.class,i);
		}
		public Compressed_conditional_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compressed_conditional_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterCompressed_conditional_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitCompressed_conditional_util(this);
		}
	}

	public final Compressed_conditional_utilContext compressed_conditional_util() throws RecognitionException {
		Compressed_conditional_utilContext _localctx = new Compressed_conditional_utilContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compressed_conditional_util);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			instruction(0);
			setState(131);
			match(QUESTIONMARK);
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(132);
				assign_util();
				}
				break;
			case 2:
				{
				setState(133);
				return_util();
				}
				break;
			case 3:
				{
				setState(134);
				function_declaration_util();
				}
				break;
			case 4:
				{
				setState(135);
				instruction(0);
				}
				break;
			case 5:
				{
				setState(136);
				compressed_conditional_util();
				}
				break;
			}
			setState(139);
			match(COLON);
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(140);
				assign_util();
				}
				break;
			case 2:
				{
				setState(141);
				return_util();
				}
				break;
			case 3:
				{
				setState(142);
				function_declaration_util();
				}
				break;
			case 4:
				{
				setState(143);
				instruction(0);
				}
				break;
			case 5:
				{
				setState(144);
				compressed_conditional_util();
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

	public static class Declaration_utilContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SnapGrammarParser.VAR, 0); }
		public List<Var_assign_utilContext> var_assign_util() {
			return getRuleContexts(Var_assign_utilContext.class);
		}
		public Var_assign_utilContext var_assign_util(int i) {
			return getRuleContext(Var_assign_utilContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SnapGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SnapGrammarParser.COMMA, i);
		}
		public Declaration_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterDeclaration_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitDeclaration_util(this);
		}
	}

	public final Declaration_utilContext declaration_util() throws RecognitionException {
		Declaration_utilContext _localctx = new Declaration_utilContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration_util);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(VAR);
			setState(148);
			var_assign_util();
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					match(COMMA);
					setState(150);
					var_assign_util();
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Var_assign_utilContext extends ParserRuleContext {
		public Object_access_utilContext object_access_util() {
			return getRuleContext(Object_access_utilContext.class,0);
		}
		public Identifier_utilContext identifier_util() {
			return getRuleContext(Identifier_utilContext.class,0);
		}
		public Assign_operatorContext assign_operator() {
			return getRuleContext(Assign_operatorContext.class,0);
		}
		public Assign_utilContext assign_util() {
			return getRuleContext(Assign_utilContext.class,0);
		}
		public Function_declaration_utilContext function_declaration_util() {
			return getRuleContext(Function_declaration_utilContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Compressed_conditional_utilContext compressed_conditional_util() {
			return getRuleContext(Compressed_conditional_utilContext.class,0);
		}
		public Var_assign_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterVar_assign_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitVar_assign_util(this);
		}
	}

	public final Var_assign_utilContext var_assign_util() throws RecognitionException {
		Var_assign_utilContext _localctx = new Var_assign_utilContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_assign_util);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(156);
				object_access_util();
				}
				break;
			case 2:
				{
				setState(157);
				identifier_util();
				}
				break;
			}
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(160);
				assign_operator();
				setState(165);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(161);
					assign_util();
					}
					break;
				case 2:
					{
					setState(162);
					function_declaration_util();
					}
					break;
				case 3:
					{
					setState(163);
					instruction(0);
					}
					break;
				case 4:
					{
					setState(164);
					compressed_conditional_util();
					}
					break;
				}
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

	public static class Assign_utilContext extends ParserRuleContext {
		public Assign_operatorContext assign_operator() {
			return getRuleContext(Assign_operatorContext.class,0);
		}
		public Object_access_utilContext object_access_util() {
			return getRuleContext(Object_access_utilContext.class,0);
		}
		public Identifier_utilContext identifier_util() {
			return getRuleContext(Identifier_utilContext.class,0);
		}
		public Parenthesized_operation_utilContext parenthesized_operation_util() {
			return getRuleContext(Parenthesized_operation_utilContext.class,0);
		}
		public Assign_utilContext assign_util() {
			return getRuleContext(Assign_utilContext.class,0);
		}
		public Function_declaration_utilContext function_declaration_util() {
			return getRuleContext(Function_declaration_utilContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Compressed_conditional_utilContext compressed_conditional_util() {
			return getRuleContext(Compressed_conditional_utilContext.class,0);
		}
		public Assign_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterAssign_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitAssign_util(this);
		}
	}

	public final Assign_utilContext assign_util() throws RecognitionException {
		Assign_utilContext _localctx = new Assign_utilContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign_util);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(169);
				object_access_util();
				}
				break;
			case 2:
				{
				setState(170);
				identifier_util();
				}
				break;
			case 3:
				{
				setState(171);
				parenthesized_operation_util();
				}
				break;
			}
			setState(174);
			assign_operator();
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(175);
				assign_util();
				}
				break;
			case 2:
				{
				setState(176);
				function_declaration_util();
				}
				break;
			case 3:
				{
				setState(177);
				instruction(0);
				}
				break;
			case 4:
				{
				setState(178);
				compressed_conditional_util();
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

	public static class If_utilContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SnapGrammarParser.IF, 0); }
		public TerminalNode LP() { return getToken(SnapGrammarParser.LP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RP() { return getToken(SnapGrammarParser.RP, 0); }
		public List<Code_block_util_contentsContext> code_block_util_contents() {
			return getRuleContexts(Code_block_util_contentsContext.class);
		}
		public Code_block_util_contentsContext code_block_util_contents(int i) {
			return getRuleContext(Code_block_util_contentsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SnapGrammarParser.ELSE, 0); }
		public If_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterIf_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitIf_util(this);
		}
	}

	public final If_utilContext if_util() throws RecognitionException {
		If_utilContext _localctx = new If_utilContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_util);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(IF);
			setState(182);
			match(LP);
			setState(183);
			statement();
			setState(184);
			match(RP);
			setState(185);
			code_block_util_contents();
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(186);
				match(ELSE);
				setState(187);
				code_block_util_contents();
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

	public static class Try_catch_utilContext extends ParserRuleContext {
		public Try_catch_util_tryContext try_catch_util_try() {
			return getRuleContext(Try_catch_util_tryContext.class,0);
		}
		public Try_catch_util_catchContext try_catch_util_catch() {
			return getRuleContext(Try_catch_util_catchContext.class,0);
		}
		public Try_catch_util_finallyContext try_catch_util_finally() {
			return getRuleContext(Try_catch_util_finallyContext.class,0);
		}
		public Try_catch_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_catch_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterTry_catch_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitTry_catch_util(this);
		}
	}

	public final Try_catch_utilContext try_catch_util() throws RecognitionException {
		Try_catch_utilContext _localctx = new Try_catch_utilContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_try_catch_util);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			try_catch_util_try();
			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(191);
				try_catch_util_catch();
				}
				break;
			}
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(194);
				try_catch_util_finally();
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

	public static class Try_catch_util_tryContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(SnapGrammarParser.TRY, 0); }
		public Code_block_utilContext code_block_util() {
			return getRuleContext(Code_block_utilContext.class,0);
		}
		public Try_catch_util_tryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_catch_util_try; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterTry_catch_util_try(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitTry_catch_util_try(this);
		}
	}

	public final Try_catch_util_tryContext try_catch_util_try() throws RecognitionException {
		Try_catch_util_tryContext _localctx = new Try_catch_util_tryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_try_catch_util_try);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(TRY);
			setState(198);
			code_block_util();
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

	public static class Try_catch_util_catchContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(SnapGrammarParser.CATCH, 0); }
		public TerminalNode LP() { return getToken(SnapGrammarParser.LP, 0); }
		public Identifier_utilContext identifier_util() {
			return getRuleContext(Identifier_utilContext.class,0);
		}
		public TerminalNode RP() { return getToken(SnapGrammarParser.RP, 0); }
		public Code_block_utilContext code_block_util() {
			return getRuleContext(Code_block_utilContext.class,0);
		}
		public Try_catch_util_catchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_catch_util_catch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterTry_catch_util_catch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitTry_catch_util_catch(this);
		}
	}

	public final Try_catch_util_catchContext try_catch_util_catch() throws RecognitionException {
		Try_catch_util_catchContext _localctx = new Try_catch_util_catchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_try_catch_util_catch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(CATCH);
			setState(201);
			match(LP);
			setState(202);
			identifier_util();
			setState(203);
			match(RP);
			setState(204);
			code_block_util();
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

	public static class Try_catch_util_finallyContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(SnapGrammarParser.FINALLY, 0); }
		public Code_block_utilContext code_block_util() {
			return getRuleContext(Code_block_utilContext.class,0);
		}
		public Try_catch_util_finallyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_catch_util_finally; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterTry_catch_util_finally(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitTry_catch_util_finally(this);
		}
	}

	public final Try_catch_util_finallyContext try_catch_util_finally() throws RecognitionException {
		Try_catch_util_finallyContext _localctx = new Try_catch_util_finallyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_try_catch_util_finally);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(FINALLY);
			setState(207);
			code_block_util();
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

	public static class Return_utilContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SnapGrammarParser.RETURN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Return_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterReturn_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitReturn_util(this);
		}
	}

	public final Return_utilContext return_util() throws RecognitionException {
		Return_utilContext _localctx = new Return_utilContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_return_util);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(RETURN);
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(210);
				statement();
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

	public static class For_utilContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SnapGrammarParser.FOR, 0); }
		public TerminalNode LP() { return getToken(SnapGrammarParser.LP, 0); }
		public For_parametersContext for_parameters() {
			return getRuleContext(For_parametersContext.class,0);
		}
		public TerminalNode RP() { return getToken(SnapGrammarParser.RP, 0); }
		public Code_block_util_contentsContext code_block_util_contents() {
			return getRuleContext(Code_block_util_contentsContext.class,0);
		}
		public For_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterFor_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitFor_util(this);
		}
	}

	public final For_utilContext for_util() throws RecognitionException {
		For_utilContext _localctx = new For_utilContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_util);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(FOR);
			setState(214);
			match(LP);
			setState(215);
			for_parameters();
			setState(216);
			match(RP);
			setState(217);
			code_block_util_contents();
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

	public static class For_parametersContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(SnapGrammarParser.IN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Identifier_utilContext identifier_util() {
			return getRuleContext(Identifier_utilContext.class,0);
		}
		public Declaration_utilContext declaration_util() {
			return getRuleContext(Declaration_utilContext.class,0);
		}
		public List<TerminalNode> END_STATEMENT() { return getTokens(SnapGrammarParser.END_STATEMENT); }
		public TerminalNode END_STATEMENT(int i) {
			return getToken(SnapGrammarParser.END_STATEMENT, i);
		}
		public For_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterFor_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitFor_parameters(this);
		}
	}

	public final For_parametersContext for_parameters() throws RecognitionException {
		For_parametersContext _localctx = new For_parametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_parameters);
		int _la;
		try {
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(219);
					identifier_util();
					}
					break;
				case VAR:
					{
					setState(220);
					declaration_util();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(223);
				match(IN);
				setState(224);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << REGULAR_EXPRESSION) | (1L << NEW) | (1L << THROW) | (1L << DELETE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << SWITCH) | (1L << TRY) | (1L << TRUE) | (1L << FALSE) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << VAR) | (1L << NOT) | (1L << TYPEOF) | (1L << LSB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LB - 65)) | (1L << (LP - 65)) | (1L << (FUNCTION - 65)) | (1L << (NUMBER - 65)) | (1L << (ID - 65)))) != 0)) {
					{
					setState(226);
					statement();
					}
				}

				setState(229);
				match(END_STATEMENT);
				setState(231);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << REGULAR_EXPRESSION) | (1L << NEW) | (1L << THROW) | (1L << DELETE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << SWITCH) | (1L << TRY) | (1L << TRUE) | (1L << FALSE) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << VAR) | (1L << NOT) | (1L << TYPEOF) | (1L << LSB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LB - 65)) | (1L << (LP - 65)) | (1L << (FUNCTION - 65)) | (1L << (NUMBER - 65)) | (1L << (ID - 65)))) != 0)) {
					{
					setState(230);
					statement();
					}
				}

				setState(233);
				match(END_STATEMENT);
				setState(235);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << REGULAR_EXPRESSION) | (1L << NEW) | (1L << THROW) | (1L << DELETE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << SWITCH) | (1L << TRY) | (1L << TRUE) | (1L << FALSE) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << VAR) | (1L << NOT) | (1L << TYPEOF) | (1L << LSB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LB - 65)) | (1L << (LP - 65)) | (1L << (FUNCTION - 65)) | (1L << (NUMBER - 65)) | (1L << (ID - 65)))) != 0)) {
					{
					setState(234);
					statement();
					}
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

	public static class Function_declaration_utilContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(SnapGrammarParser.FUNCTION, 0); }
		public TerminalNode LP() { return getToken(SnapGrammarParser.LP, 0); }
		public TerminalNode RP() { return getToken(SnapGrammarParser.RP, 0); }
		public Code_block_utilContext code_block_util() {
			return getRuleContext(Code_block_utilContext.class,0);
		}
		public Identifier_utilContext identifier_util() {
			return getRuleContext(Identifier_utilContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Access_operatorContext access_operator() {
			return getRuleContext(Access_operatorContext.class,0);
		}
		public Function_declaration_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterFunction_declaration_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitFunction_declaration_util(this);
		}
	}

	public final Function_declaration_utilContext function_declaration_util() throws RecognitionException {
		Function_declaration_utilContext _localctx = new Function_declaration_utilContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_declaration_util);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(FUNCTION);
			setState(241);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(240);
				identifier_util();
				}
			}

			setState(243);
			match(LP);
			setState(245);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << REGULAR_EXPRESSION) | (1L << NEW) | (1L << THROW) | (1L << DELETE) | (1L << BREAK) | (1L << CONTINUE) | (1L << TRUE) | (1L << FALSE) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << NOT) | (1L << TYPEOF) | (1L << LSB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LB - 65)) | (1L << (LP - 65)) | (1L << (FUNCTION - 65)) | (1L << (NUMBER - 65)) | (1L << (ID - 65)))) != 0)) {
				{
				setState(244);
				parameters();
				}
			}

			setState(247);
			match(RP);
			setState(248);
			code_block_util();
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(249);
				access_operator();
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

	public static class Switch_utilContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(SnapGrammarParser.SWITCH, 0); }
		public TerminalNode LP() { return getToken(SnapGrammarParser.LP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RP() { return getToken(SnapGrammarParser.RP, 0); }
		public Switch_bodyContext switch_body() {
			return getRuleContext(Switch_bodyContext.class,0);
		}
		public Switch_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterSwitch_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitSwitch_util(this);
		}
	}

	public final Switch_utilContext switch_util() throws RecognitionException {
		Switch_utilContext _localctx = new Switch_utilContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switch_util);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(SWITCH);
			setState(253);
			match(LP);
			setState(254);
			statement();
			setState(255);
			match(RP);
			setState(256);
			switch_body();
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

	public static class Switch_bodyContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(SnapGrammarParser.LB, 0); }
		public TerminalNode RB() { return getToken(SnapGrammarParser.RB, 0); }
		public List<Switch_caseContext> switch_case() {
			return getRuleContexts(Switch_caseContext.class);
		}
		public Switch_caseContext switch_case(int i) {
			return getRuleContext(Switch_caseContext.class,i);
		}
		public Switch_defaultContext switch_default() {
			return getRuleContext(Switch_defaultContext.class,0);
		}
		public Switch_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterSwitch_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitSwitch_body(this);
		}
	}

	public final Switch_bodyContext switch_body() throws RecognitionException {
		Switch_bodyContext _localctx = new Switch_bodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switch_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(LB);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(259);
				switch_case();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(265);
				switch_default();
				}
			}

			setState(268);
			match(RB);
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

	public static class Switch_caseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(SnapGrammarParser.CASE, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SnapGrammarParser.COLON, 0); }
		public List<Code_block_util_contentsContext> code_block_util_contents() {
			return getRuleContexts(Code_block_util_contentsContext.class);
		}
		public Code_block_util_contentsContext code_block_util_contents(int i) {
			return getRuleContext(Code_block_util_contentsContext.class,i);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitSwitch_case(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switch_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(CASE);
			setState(271);
			instruction(0);
			setState(272);
			match(COLON);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRAGMA) | (1L << STRING) | (1L << REGULAR_EXPRESSION) | (1L << NEW) | (1L << THROW) | (1L << DELETE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << SWITCH) | (1L << TRY) | (1L << TRUE) | (1L << FALSE) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << VAR) | (1L << NOT) | (1L << TYPEOF) | (1L << LSB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LB - 65)) | (1L << (LP - 65)) | (1L << (FUNCTION - 65)) | (1L << (NUMBER - 65)) | (1L << (ID - 65)))) != 0)) {
				{
				{
				setState(273);
				code_block_util_contents();
				}
				}
				setState(278);
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

	public static class Switch_defaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SnapGrammarParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(SnapGrammarParser.COLON, 0); }
		public List<Code_block_util_contentsContext> code_block_util_contents() {
			return getRuleContexts(Code_block_util_contentsContext.class);
		}
		public Code_block_util_contentsContext code_block_util_contents(int i) {
			return getRuleContext(Code_block_util_contentsContext.class,i);
		}
		public Switch_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterSwitch_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitSwitch_default(this);
		}
	}

	public final Switch_defaultContext switch_default() throws RecognitionException {
		Switch_defaultContext _localctx = new Switch_defaultContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_switch_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(DEFAULT);
			setState(280);
			match(COLON);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRAGMA) | (1L << STRING) | (1L << REGULAR_EXPRESSION) | (1L << NEW) | (1L << THROW) | (1L << DELETE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << SWITCH) | (1L << TRY) | (1L << TRUE) | (1L << FALSE) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << VAR) | (1L << NOT) | (1L << TYPEOF) | (1L << LSB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LB - 65)) | (1L << (LP - 65)) | (1L << (FUNCTION - 65)) | (1L << (NUMBER - 65)) | (1L << (ID - 65)))) != 0)) {
				{
				{
				setState(281);
				code_block_util_contents();
				}
				}
				setState(286);
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

	public static class While_utilContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SnapGrammarParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(SnapGrammarParser.LP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RP() { return getToken(SnapGrammarParser.RP, 0); }
		public Code_block_util_contentsContext code_block_util_contents() {
			return getRuleContext(Code_block_util_contentsContext.class,0);
		}
		public While_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterWhile_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitWhile_util(this);
		}
	}

	public final While_utilContext while_util() throws RecognitionException {
		While_utilContext _localctx = new While_utilContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_while_util);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(WHILE);
			setState(288);
			match(LP);
			setState(289);
			statement();
			setState(290);
			match(RP);
			setState(291);
			code_block_util_contents();
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

	public static class Do_while_utilContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(SnapGrammarParser.DO, 0); }
		public Code_block_util_contentsContext code_block_util_contents() {
			return getRuleContext(Code_block_util_contentsContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(SnapGrammarParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(SnapGrammarParser.LP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RP() { return getToken(SnapGrammarParser.RP, 0); }
		public Do_while_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterDo_while_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitDo_while_util(this);
		}
	}

	public final Do_while_utilContext do_while_util() throws RecognitionException {
		Do_while_utilContext _localctx = new Do_while_utilContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_do_while_util);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(DO);
			setState(294);
			code_block_util_contents();
			setState(295);
			match(WHILE);
			setState(296);
			match(LP);
			setState(297);
			statement();
			setState(298);
			match(RP);
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

	public static class Statement_list_utilContext extends ParserRuleContext {
		public List<Assign_utilContext> assign_util() {
			return getRuleContexts(Assign_utilContext.class);
		}
		public Assign_utilContext assign_util(int i) {
			return getRuleContext(Assign_utilContext.class,i);
		}
		public List<Function_declaration_utilContext> function_declaration_util() {
			return getRuleContexts(Function_declaration_utilContext.class);
		}
		public Function_declaration_utilContext function_declaration_util(int i) {
			return getRuleContext(Function_declaration_utilContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SnapGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SnapGrammarParser.COMMA, i);
		}
		public Statement_list_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterStatement_list_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitStatement_list_util(this);
		}
	}

	public final Statement_list_utilContext statement_list_util() throws RecognitionException {
		Statement_list_utilContext _localctx = new Statement_list_utilContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement_list_util);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(300);
				assign_util();
				}
				break;
			case 2:
				{
				setState(301);
				function_declaration_util();
				}
				break;
			case 3:
				{
				setState(302);
				instruction(0);
				}
				break;
			}
			setState(311); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(305);
					match(COMMA);
					setState(309);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(306);
						assign_util();
						}
						break;
					case 2:
						{
						setState(307);
						function_declaration_util();
						}
						break;
					case 3:
						{
						setState(308);
						instruction(0);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(313); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Assign_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SnapGrammarParser.ASSIGN, 0); }
		public TerminalNode PASSIGN() { return getToken(SnapGrammarParser.PASSIGN, 0); }
		public TerminalNode MASSIGN() { return getToken(SnapGrammarParser.MASSIGN, 0); }
		public TerminalNode DIVASSIGN() { return getToken(SnapGrammarParser.DIVASSIGN, 0); }
		public TerminalNode MULTASSIGN() { return getToken(SnapGrammarParser.MULTASSIGN, 0); }
		public TerminalNode MODASSIGN() { return getToken(SnapGrammarParser.MODASSIGN, 0); }
		public Assign_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterAssign_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitAssign_operator(this);
		}
	}

	public final Assign_operatorContext assign_operator() throws RecognitionException {
		Assign_operatorContext _localctx = new Assign_operatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assign_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << PASSIGN) | (1L << MASSIGN) | (1L << DIVASSIGN) | (1L << MULTASSIGN) | (1L << MODASSIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ParametersContext extends ParserRuleContext {
		public List<Assign_utilContext> assign_util() {
			return getRuleContexts(Assign_utilContext.class);
		}
		public Assign_utilContext assign_util(int i) {
			return getRuleContext(Assign_utilContext.class,i);
		}
		public List<Function_declaration_utilContext> function_declaration_util() {
			return getRuleContexts(Function_declaration_utilContext.class);
		}
		public Function_declaration_utilContext function_declaration_util(int i) {
			return getRuleContext(Function_declaration_utilContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<Compressed_conditional_utilContext> compressed_conditional_util() {
			return getRuleContexts(Compressed_conditional_utilContext.class);
		}
		public Compressed_conditional_utilContext compressed_conditional_util(int i) {
			return getRuleContext(Compressed_conditional_utilContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SnapGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SnapGrammarParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(317);
				assign_util();
				}
				break;
			case 2:
				{
				setState(318);
				function_declaration_util();
				}
				break;
			case 3:
				{
				setState(319);
				instruction(0);
				}
				break;
			case 4:
				{
				setState(320);
				compressed_conditional_util();
				}
				break;
			}
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(323);
				match(COMMA);
				setState(328);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(324);
					assign_util();
					}
					break;
				case 2:
					{
					setState(325);
					function_declaration_util();
					}
					break;
				case 3:
					{
					setState(326);
					instruction(0);
					}
					break;
				case 4:
					{
					setState(327);
					compressed_conditional_util();
					}
					break;
				}
				}
				}
				setState(334);
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

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegationContext extends InstructionContext {
		public TerminalNode NOT() { return getToken(SnapGrammarParser.NOT, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public NegationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitNegation(this);
		}
	}
	public static class BreakContext extends InstructionContext {
		public TerminalNode BREAK() { return getToken(SnapGrammarParser.BREAK, 0); }
		public BreakContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitBreak(this);
		}
	}
	public static class Arithmetic_operationContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Arithmetic_operatorContext arithmetic_operator() {
			return getRuleContext(Arithmetic_operatorContext.class,0);
		}
		public Arithmetic_operationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterArithmetic_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitArithmetic_operation(this);
		}
	}
	public static class Instanceof_operationContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode INSTANCEOF() { return getToken(SnapGrammarParser.INSTANCEOF, 0); }
		public Instanceof_operationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterInstanceof_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitInstanceof_operation(this);
		}
	}
	public static class Prexment_operationContext extends InstructionContext {
		public Xment_operatorContext xment_operator() {
			return getRuleContext(Xment_operatorContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Prexment_operationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterPrexment_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitPrexment_operation(this);
		}
	}
	public static class Comparison_operationContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public Comparison_operationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterComparison_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitComparison_operation(this);
		}
	}
	public static class DeleteContext extends InstructionContext {
		public TerminalNode DELETE() { return getToken(SnapGrammarParser.DELETE, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public DeleteContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitDelete(this);
		}
	}
	public static class Typeof_operationContext extends InstructionContext {
		public Typeof_operatorContext typeof_operator() {
			return getRuleContext(Typeof_operatorContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Typeof_operationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterTypeof_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitTypeof_operation(this);
		}
	}
	public static class Or_operationContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Or_operatorContext or_operator() {
			return getRuleContext(Or_operatorContext.class,0);
		}
		public Or_operationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterOr_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitOr_operation(this);
		}
	}
	public static class Signed_operationContext extends InstructionContext {
		public Sign_operatorContext sign_operator() {
			return getRuleContext(Sign_operatorContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Signed_operationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterSigned_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitSigned_operation(this);
		}
	}
	public static class Xment_operationContext extends InstructionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Xment_operatorContext xment_operator() {
			return getRuleContext(Xment_operatorContext.class,0);
		}
		public Xment_operationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterXment_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitXment_operation(this);
		}
	}
	public static class New_object_declarationContext extends InstructionContext {
		public New_object_declaration_utilContext new_object_declaration_util() {
			return getRuleContext(New_object_declaration_utilContext.class,0);
		}
		public New_object_declarationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterNew_object_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitNew_object_declaration(this);
		}
	}
	public static class And_operationContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public And_operatorContext and_operator() {
			return getRuleContext(And_operatorContext.class,0);
		}
		public And_operationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterAnd_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitAnd_operation(this);
		}
	}
	public static class ThrowContext extends InstructionContext {
		public TerminalNode THROW() { return getToken(SnapGrammarParser.THROW, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ThrowContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterThrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitThrow(this);
		}
	}
	public static class ContinueContext extends InstructionContext {
		public TerminalNode CONTINUE() { return getToken(SnapGrammarParser.CONTINUE, 0); }
		public ContinueContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitContinue(this);
		}
	}
	public static class Object_accessContext extends InstructionContext {
		public Object_access_utilContext object_access_util() {
			return getRuleContext(Object_access_utilContext.class,0);
		}
		public Object_accessContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterObject_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitObject_access(this);
		}
	}
	public static class Bit_operationContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Bit_operatorContext bit_operator() {
			return getRuleContext(Bit_operatorContext.class,0);
		}
		public Bit_operationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterBit_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitBit_operation(this);
		}
	}
	public static class Glorified_arithmetic_operationContext extends InstructionContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Glorified_arithmetic_operatorContext glorified_arithmetic_operator() {
			return getRuleContext(Glorified_arithmetic_operatorContext.class,0);
		}
		public Glorified_arithmetic_operationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterGlorified_arithmetic_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitGlorified_arithmetic_operation(this);
		}
	}
	public static class Atomic_operationContext extends InstructionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Atomic_operationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterAtomic_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitAtomic_operation(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		return instruction(0);
	}

	private InstructionContext instruction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstructionContext _localctx = new InstructionContext(_ctx, _parentState);
		InstructionContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_instruction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new Typeof_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(336);
				typeof_operator();
				setState(337);
				instruction(16);
				}
				break;
			case 2:
				{
				_localctx = new DeleteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(339);
				match(DELETE);
				setState(340);
				instruction(14);
				}
				break;
			case 3:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				match(NOT);
				setState(342);
				instruction(10);
				}
				break;
			case 4:
				{
				_localctx = new Signed_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(343);
				sign_operator();
				setState(344);
				instruction(3);
				}
				break;
			case 5:
				{
				_localctx = new Atomic_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(346);
				atom();
				}
				break;
			case 6:
				{
				_localctx = new Object_accessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347);
				object_access_util();
				}
				break;
			case 7:
				{
				_localctx = new ThrowContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				match(THROW);
				setState(349);
				statement();
				}
				break;
			case 8:
				{
				_localctx = new BreakContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(350);
				match(BREAK);
				}
				break;
			case 9:
				{
				_localctx = new ContinueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351);
				match(CONTINUE);
				}
				break;
			case 10:
				{
				_localctx = new New_object_declarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(352);
				new_object_declaration_util();
				}
				break;
			case 11:
				{
				_localctx = new Prexment_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353);
				xment_operator();
				setState(354);
				atom();
				}
				break;
			case 12:
				{
				_localctx = new Xment_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356);
				atom();
				setState(357);
				xment_operator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(388);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new Instanceof_operationContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(361);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(362);
						match(INSTANCEOF);
						setState(363);
						instruction(18);
						}
						break;
					case 2:
						{
						_localctx = new And_operationContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(364);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(365);
						and_operator();
						setState(366);
						instruction(10);
						}
						break;
					case 3:
						{
						_localctx = new Or_operationContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(368);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(369);
						or_operator();
						setState(370);
						instruction(9);
						}
						break;
					case 4:
						{
						_localctx = new Bit_operationContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(372);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(373);
						bit_operator();
						setState(374);
						instruction(8);
						}
						break;
					case 5:
						{
						_localctx = new Comparison_operationContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(376);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(377);
						comparison_operator();
						setState(378);
						instruction(7);
						}
						break;
					case 6:
						{
						_localctx = new Glorified_arithmetic_operationContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(380);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(381);
						glorified_arithmetic_operator();
						setState(382);
						instruction(6);
						}
						break;
					case 7:
						{
						_localctx = new Arithmetic_operationContext(new InstructionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_instruction);
						setState(384);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(385);
						arithmetic_operator();
						setState(386);
						instruction(5);
						}
						break;
					}
					} 
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class New_object_declaration_utilContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(SnapGrammarParser.NEW, 0); }
		public Identifier_utilContext identifier_util() {
			return getRuleContext(Identifier_utilContext.class,0);
		}
		public New_object_declaration_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_object_declaration_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterNew_object_declaration_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitNew_object_declaration_util(this);
		}
	}

	public final New_object_declaration_utilContext new_object_declaration_util() throws RecognitionException {
		New_object_declaration_utilContext _localctx = new New_object_declaration_utilContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_new_object_declaration_util);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(NEW);
			setState(394);
			identifier_util();
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

	public static class Object_access_utilContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public New_object_declaration_utilContext new_object_declaration_util() {
			return getRuleContext(New_object_declaration_utilContext.class,0);
		}
		public Parenthesized_operation_utilContext parenthesized_operation_util() {
			return getRuleContext(Parenthesized_operation_utilContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SnapGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SnapGrammarParser.DOT, i);
		}
		public List<Object_attributeContext> object_attribute() {
			return getRuleContexts(Object_attributeContext.class);
		}
		public Object_attributeContext object_attribute(int i) {
			return getRuleContext(Object_attributeContext.class,i);
		}
		public Object_access_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_access_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterObject_access_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitObject_access_util(this);
		}
	}

	public final Object_access_utilContext object_access_util() throws RecognitionException {
		Object_access_utilContext _localctx = new Object_access_utilContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_object_access_util);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(396);
				atom();
				}
				break;
			case 2:
				{
				setState(397);
				new_object_declaration_util();
				}
				break;
			case 3:
				{
				setState(398);
				parenthesized_operation_util();
				}
				break;
			}
			setState(403); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(401);
					match(DOT);
					setState(402);
					object_attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(405); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class Object_attributeContext extends ParserRuleContext {
		public Identifier_utilContext identifier_util() {
			return getRuleContext(Identifier_utilContext.class,0);
		}
		public Object_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterObject_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitObject_attribute(this);
		}
	}

	public final Object_attributeContext object_attribute() throws RecognitionException {
		Object_attributeContext _localctx = new Object_attributeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_object_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			identifier_util();
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

	public static class Access_operatorContext extends ParserRuleContext {
		public Access_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_operator; }
	 
		public Access_operatorContext() { }
		public void copyFrom(Access_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Array_accessContext extends Access_operatorContext {
		public TerminalNode LSB() { return getToken(SnapGrammarParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(SnapGrammarParser.RSB, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Statement_list_utilContext statement_list_util() {
			return getRuleContext(Statement_list_utilContext.class,0);
		}
		public Compressed_conditional_utilContext compressed_conditional_util() {
			return getRuleContext(Compressed_conditional_utilContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SnapGrammarParser.COMMA, 0); }
		public Array_accessContext(Access_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterArray_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitArray_access(this);
		}
	}
	public static class Function_callContext extends Access_operatorContext {
		public TerminalNode LP() { return getToken(SnapGrammarParser.LP, 0); }
		public TerminalNode RP() { return getToken(SnapGrammarParser.RP, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Function_callContext(Access_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitFunction_call(this);
		}
	}

	public final Access_operatorContext access_operator() throws RecognitionException {
		Access_operatorContext _localctx = new Access_operatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_access_operator);
		int _la;
		try {
			setState(425);
			switch (_input.LA(1)) {
			case LSB:
				_localctx = new Array_accessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(LSB);
				setState(413);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(410);
					instruction(0);
					}
					break;
				case 2:
					{
					setState(411);
					statement_list_util();
					}
					break;
				case 3:
					{
					setState(412);
					compressed_conditional_util();
					}
					break;
				}
				setState(416);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(415);
					match(COMMA);
					}
				}

				setState(418);
				match(RSB);
				}
				break;
			case LP:
				_localctx = new Function_callContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(LP);
				setState(422);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << REGULAR_EXPRESSION) | (1L << NEW) | (1L << THROW) | (1L << DELETE) | (1L << BREAK) | (1L << CONTINUE) | (1L << TRUE) | (1L << FALSE) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << NOT) | (1L << TYPEOF) | (1L << LSB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LB - 65)) | (1L << (LP - 65)) | (1L << (FUNCTION - 65)) | (1L << (NUMBER - 65)) | (1L << (ID - 65)))) != 0)) {
					{
					setState(421);
					parameters();
					}
				}

				setState(424);
				match(RP);
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

	public static class Parenthesized_operation_utilContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(SnapGrammarParser.LP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RP() { return getToken(SnapGrammarParser.RP, 0); }
		public List<Access_operatorContext> access_operator() {
			return getRuleContexts(Access_operatorContext.class);
		}
		public Access_operatorContext access_operator(int i) {
			return getRuleContext(Access_operatorContext.class,i);
		}
		public Parenthesized_operation_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_operation_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterParenthesized_operation_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitParenthesized_operation_util(this);
		}
	}

	public final Parenthesized_operation_utilContext parenthesized_operation_util() throws RecognitionException {
		Parenthesized_operation_utilContext _localctx = new Parenthesized_operation_utilContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parenthesized_operation_util);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(LP);
			setState(428);
			statement();
			setState(429);
			match(RP);
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(430);
					access_operator();
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends AtomContext {
		public Identifier_utilContext identifier_util() {
			return getRuleContext(Identifier_utilContext.class,0);
		}
		public IdentifierContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitIdentifier(this);
		}
	}
	public static class NumberContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(SnapGrammarParser.NUMBER, 0); }
		public NumberContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitNumber(this);
		}
	}
	public static class Parenthesized_operationContext extends AtomContext {
		public Parenthesized_operation_utilContext parenthesized_operation_util() {
			return getRuleContext(Parenthesized_operation_utilContext.class,0);
		}
		public Parenthesized_operationContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterParenthesized_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitParenthesized_operation(this);
		}
	}
	public static class BooleanContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(SnapGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SnapGrammarParser.FALSE, 0); }
		public BooleanContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitBoolean(this);
		}
	}
	public static class StringContext extends AtomContext {
		public TerminalNode STRING() { return getToken(SnapGrammarParser.STRING, 0); }
		public StringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitString(this);
		}
	}
	public static class Regular_expressionContext extends AtomContext {
		public TerminalNode REGULAR_EXPRESSION() { return getToken(SnapGrammarParser.REGULAR_EXPRESSION, 0); }
		public Regular_expressionContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterRegular_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitRegular_expression(this);
		}
	}
	public static class ArrayContext extends AtomContext {
		public Array_utilContext array_util() {
			return getRuleContext(Array_utilContext.class,0);
		}
		public ArrayContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitArray(this);
		}
	}
	public static class JsonContext extends AtomContext {
		public TerminalNode LB() { return getToken(SnapGrammarParser.LB, 0); }
		public TerminalNode RB() { return getToken(SnapGrammarParser.RB, 0); }
		public List<Json_contentsContext> json_contents() {
			return getRuleContexts(Json_contentsContext.class);
		}
		public Json_contentsContext json_contents(int i) {
			return getRuleContext(Json_contentsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SnapGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SnapGrammarParser.COMMA, i);
		}
		public JsonContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitJson(this);
		}
	}
	public static class Code_blockContext extends AtomContext {
		public Code_block_utilContext code_block_util() {
			return getRuleContext(Code_block_utilContext.class,0);
		}
		public Code_blockContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitCode_block(this);
		}
	}
	public static class Function_declarationContext extends AtomContext {
		public Function_declaration_utilContext function_declaration_util() {
			return getRuleContext(Function_declaration_utilContext.class,0);
		}
		public Function_declarationContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitFunction_declaration(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_atom);
		int _la;
		try {
			setState(456);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new Function_declarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				function_declaration_util();
				}
				break;
			case 2:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				identifier_util();
				}
				break;
			case 3:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				match(NUMBER);
				}
				break;
			case 5:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(440);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 6:
				_localctx = new JsonContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(441);
				match(LB);
				setState(446); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(442);
					json_contents();
					setState(444);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(443);
						match(COMMA);
						}
					}

					}
					}
					setState(448); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING || _la==ID );
				setState(450);
				match(RB);
				}
				break;
			case 7:
				_localctx = new Code_blockContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(452);
				code_block_util();
				}
				break;
			case 8:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(453);
				array_util();
				}
				break;
			case 9:
				_localctx = new Regular_expressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(454);
				match(REGULAR_EXPRESSION);
				}
				break;
			case 10:
				_localctx = new Parenthesized_operationContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(455);
				parenthesized_operation_util();
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

	public static class Code_block_utilContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(SnapGrammarParser.LB, 0); }
		public TerminalNode RB() { return getToken(SnapGrammarParser.RB, 0); }
		public List<Code_block_util_contentsContext> code_block_util_contents() {
			return getRuleContexts(Code_block_util_contentsContext.class);
		}
		public Code_block_util_contentsContext code_block_util_contents(int i) {
			return getRuleContext(Code_block_util_contentsContext.class,i);
		}
		public Code_block_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterCode_block_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitCode_block_util(this);
		}
	}

	public final Code_block_utilContext code_block_util() throws RecognitionException {
		Code_block_utilContext _localctx = new Code_block_utilContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_code_block_util);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(LB);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRAGMA) | (1L << STRING) | (1L << REGULAR_EXPRESSION) | (1L << NEW) | (1L << THROW) | (1L << DELETE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << DO) | (1L << SWITCH) | (1L << TRY) | (1L << TRUE) | (1L << FALSE) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << VAR) | (1L << NOT) | (1L << TYPEOF) | (1L << LSB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LB - 65)) | (1L << (LP - 65)) | (1L << (FUNCTION - 65)) | (1L << (NUMBER - 65)) | (1L << (ID - 65)))) != 0)) {
				{
				{
				setState(459);
				code_block_util_contents();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
			match(RB);
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

	public static class Code_block_util_contentsContext extends ParserRuleContext {
		public If_utilContext if_util() {
			return getRuleContext(If_utilContext.class,0);
		}
		public For_utilContext for_util() {
			return getRuleContext(For_utilContext.class,0);
		}
		public While_utilContext while_util() {
			return getRuleContext(While_utilContext.class,0);
		}
		public Do_while_utilContext do_while_util() {
			return getRuleContext(Do_while_utilContext.class,0);
		}
		public End_statementContext end_statement() {
			return getRuleContext(End_statementContext.class,0);
		}
		public Switch_utilContext switch_util() {
			return getRuleContext(Switch_utilContext.class,0);
		}
		public Try_catch_utilContext try_catch_util() {
			return getRuleContext(Try_catch_utilContext.class,0);
		}
		public Return_utilContext return_util() {
			return getRuleContext(Return_utilContext.class,0);
		}
		public Code_block_utilContext code_block_util() {
			return getRuleContext(Code_block_utilContext.class,0);
		}
		public Declaration_utilContext declaration_util() {
			return getRuleContext(Declaration_utilContext.class,0);
		}
		public Assign_utilContext assign_util() {
			return getRuleContext(Assign_utilContext.class,0);
		}
		public Statement_list_utilContext statement_list_util() {
			return getRuleContext(Statement_list_utilContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Function_declaration_utilContext function_declaration_util() {
			return getRuleContext(Function_declaration_utilContext.class,0);
		}
		public Compressed_conditional_utilContext compressed_conditional_util() {
			return getRuleContext(Compressed_conditional_utilContext.class,0);
		}
		public PragmaContext pragma() {
			return getRuleContext(PragmaContext.class,0);
		}
		public Code_block_util_contentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block_util_contents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterCode_block_util_contents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitCode_block_util_contents(this);
		}
	}

	public final Code_block_util_contentsContext code_block_util_contents() throws RecognitionException {
		Code_block_util_contentsContext _localctx = new Code_block_util_contentsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_code_block_util_contents);
		try {
			setState(496);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				if_util();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				for_util();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				while_util();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				do_while_util();
				setState(471);
				end_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
				switch_util();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(474);
				try_catch_util();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(475);
				return_util();
				setState(476);
				end_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(478);
				code_block_util();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(479);
				declaration_util();
				setState(480);
				end_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(482);
				assign_util();
				setState(483);
				end_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(485);
				statement_list_util();
				setState(486);
				end_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(488);
				instruction(0);
				setState(489);
				end_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(491);
				function_declaration_util();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(492);
				compressed_conditional_util();
				setState(493);
				end_statement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(495);
				pragma();
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

	public static class Array_utilContext extends ParserRuleContext {
		public TerminalNode LSB() { return getToken(SnapGrammarParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(SnapGrammarParser.RSB, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Array_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterArray_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitArray_util(this);
		}
	}

	public final Array_utilContext array_util() throws RecognitionException {
		Array_utilContext _localctx = new Array_utilContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_array_util);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(LSB);
			setState(500);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << REGULAR_EXPRESSION) | (1L << NEW) | (1L << THROW) | (1L << DELETE) | (1L << BREAK) | (1L << CONTINUE) | (1L << TRUE) | (1L << FALSE) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << NOT) | (1L << TYPEOF) | (1L << LSB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LB - 65)) | (1L << (LP - 65)) | (1L << (FUNCTION - 65)) | (1L << (NUMBER - 65)) | (1L << (ID - 65)))) != 0)) {
				{
				setState(499);
				parameters();
				}
			}

			setState(502);
			match(RSB);
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

	public static class Identifier_utilContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<Access_operatorContext> access_operator() {
			return getRuleContexts(Access_operatorContext.class);
		}
		public Access_operatorContext access_operator(int i) {
			return getRuleContext(Access_operatorContext.class,i);
		}
		public Identifier_utilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_util; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterIdentifier_util(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitIdentifier_util(this);
		}
	}

	public final Identifier_utilContext identifier_util() throws RecognitionException {
		Identifier_utilContext _localctx = new Identifier_utilContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_identifier_util);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			id();
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(505);
					access_operator();
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SnapGrammarParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(ID);
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

	public static class Json_contentsContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(SnapGrammarParser.COLON, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode ID() { return getToken(SnapGrammarParser.ID, 0); }
		public TerminalNode STRING() { return getToken(SnapGrammarParser.STRING, 0); }
		public Json_contentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_contents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterJson_contents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitJson_contents(this);
		}
	}

	public final Json_contentsContext json_contents() throws RecognitionException {
		Json_contentsContext _localctx = new Json_contentsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_json_contents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(514);
			match(COLON);
			setState(515);
			instruction(0);
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

	public static class Typeof_operatorContext extends ParserRuleContext {
		public TerminalNode TYPEOF() { return getToken(SnapGrammarParser.TYPEOF, 0); }
		public Typeof_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeof_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterTypeof_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitTypeof_operator(this);
		}
	}

	public final Typeof_operatorContext typeof_operator() throws RecognitionException {
		Typeof_operatorContext _localctx = new Typeof_operatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeof_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(TYPEOF);
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

	public static class And_operatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(SnapGrammarParser.AND, 0); }
		public And_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterAnd_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitAnd_operator(this);
		}
	}

	public final And_operatorContext and_operator() throws RecognitionException {
		And_operatorContext _localctx = new And_operatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_and_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(AND);
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

	public static class Or_operatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SnapGrammarParser.OR, 0); }
		public Or_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterOr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitOr_operator(this);
		}
	}

	public final Or_operatorContext or_operator() throws RecognitionException {
		Or_operatorContext _localctx = new Or_operatorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_or_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(OR);
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

	public static class Sign_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SnapGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SnapGrammarParser.MINUS, 0); }
		public Sign_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterSign_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitSign_operator(this);
		}
	}

	public final Sign_operatorContext sign_operator() throws RecognitionException {
		Sign_operatorContext _localctx = new Sign_operatorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sign_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Comparison_operatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SnapGrammarParser.EQ, 0); }
		public TerminalNode NE() { return getToken(SnapGrammarParser.NE, 0); }
		public TerminalNode GT() { return getToken(SnapGrammarParser.GT, 0); }
		public TerminalNode LT() { return getToken(SnapGrammarParser.LT, 0); }
		public TerminalNode GE() { return getToken(SnapGrammarParser.GE, 0); }
		public TerminalNode LE() { return getToken(SnapGrammarParser.LE, 0); }
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitComparison_operator(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_comparison_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << GT) | (1L << LT) | (1L << GE) | (1L << LE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Bit_operatorContext extends ParserRuleContext {
		public TerminalNode BIT_AND() { return getToken(SnapGrammarParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(SnapGrammarParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(SnapGrammarParser.BIT_XOR, 0); }
		public TerminalNode SHIFT_LEFT() { return getToken(SnapGrammarParser.SHIFT_LEFT, 0); }
		public TerminalNode SHIFT_RIGHT_PROP() { return getToken(SnapGrammarParser.SHIFT_RIGHT_PROP, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(SnapGrammarParser.SHIFT_RIGHT, 0); }
		public Bit_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterBit_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitBit_operator(this);
		}
	}

	public final Bit_operatorContext bit_operator() throws RecognitionException {
		Bit_operatorContext _localctx = new Bit_operatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_bit_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIT_AND) | (1L << BIT_OR) | (1L << BIT_XOR) | (1L << SHIFT_LEFT) | (1L << SHIFT_RIGHT_PROP) | (1L << SHIFT_RIGHT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Xment_operatorContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(SnapGrammarParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SnapGrammarParser.DECREMENT, 0); }
		public TerminalNode BIT_NOT() { return getToken(SnapGrammarParser.BIT_NOT, 0); }
		public Xment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterXment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitXment_operator(this);
		}
	}

	public final Xment_operatorContext xment_operator() throws RecognitionException {
		Xment_operatorContext _localctx = new Xment_operatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_xment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCREMENT) | (1L << DECREMENT) | (1L << BIT_NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Arithmetic_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SnapGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SnapGrammarParser.MINUS, 0); }
		public Arithmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterArithmetic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitArithmetic_operator(this);
		}
	}

	public final Arithmetic_operatorContext arithmetic_operator() throws RecognitionException {
		Arithmetic_operatorContext _localctx = new Arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arithmetic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Glorified_arithmetic_operatorContext extends ParserRuleContext {
		public TerminalNode MULTIPLICATION() { return getToken(SnapGrammarParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(SnapGrammarParser.DIVISION, 0); }
		public TerminalNode MODULUS() { return getToken(SnapGrammarParser.MODULUS, 0); }
		public Glorified_arithmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glorified_arithmetic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterGlorified_arithmetic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitGlorified_arithmetic_operator(this);
		}
	}

	public final Glorified_arithmetic_operatorContext glorified_arithmetic_operator() throws RecognitionException {
		Glorified_arithmetic_operatorContext _localctx = new Glorified_arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_glorified_arithmetic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MODULUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class End_statementContext extends ParserRuleContext {
		public TerminalNode END_STATEMENT() { return getToken(SnapGrammarParser.END_STATEMENT, 0); }
		public End_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).enterEnd_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnapGrammarListener ) ((SnapGrammarListener)listener).exitEnd_statement(this);
		}
	}

	public final End_statementContext end_statement() throws RecognitionException {
		End_statementContext _localctx = new End_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_end_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(END_STATEMENT);
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
		case 25:
			return instruction_sempred((InstructionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean instruction_sempred(InstructionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3J\u021c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\7\2n\n\2\f\2\16\2q\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0083\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u008c\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0094\n\5\3\6\3\6\3\6"+
		"\3\6\7\6\u009a\n\6\f\6\16\6\u009d\13\6\3\7\3\7\5\7\u00a1\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00a8\n\7\5\7\u00aa\n\7\3\b\3\b\3\b\5\b\u00af\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00b6\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bf\n\t"+
		"\3\n\3\n\5\n\u00c3\n\n\3\n\5\n\u00c6\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\5\16\u00d6\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\5\20\u00e0\n\20\3\20\3\20\3\20\3\20\5\20\u00e6\n\20"+
		"\3\20\3\20\5\20\u00ea\n\20\3\20\3\20\5\20\u00ee\n\20\5\20\u00f0\n\20\3"+
		"\21\3\21\5\21\u00f4\n\21\3\21\3\21\5\21\u00f8\n\21\3\21\3\21\3\21\5\21"+
		"\u00fd\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u0107\n\23\f"+
		"\23\16\23\u010a\13\23\3\23\5\23\u010d\n\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\7\24\u0115\n\24\f\24\16\24\u0118\13\24\3\25\3\25\3\25\7\25\u011d\n"+
		"\25\f\25\16\25\u0120\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u0132\n\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0138\n\30\6\30\u013a\n\30\r\30\16\30\u013b\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\5\32\u0144\n\32\3\32\3\32\3\32\3\32\3\32\5\32\u014b\n\32\7"+
		"\32\u014d\n\32\f\32\16\32\u0150\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u016a\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0187\n\33\f\33\16\33\u018a\13\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\5\35\u0192\n\35\3\35\3\35\6\35\u0196\n"+
		"\35\r\35\16\35\u0197\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u01a0\n\37\3\37"+
		"\5\37\u01a3\n\37\3\37\3\37\3\37\3\37\5\37\u01a9\n\37\3\37\5\37\u01ac\n"+
		"\37\3 \3 \3 \3 \7 \u01b2\n \f \16 \u01b5\13 \3!\3!\3!\3!\3!\3!\3!\3!\5"+
		"!\u01bf\n!\6!\u01c1\n!\r!\16!\u01c2\3!\3!\3!\3!\3!\3!\5!\u01cb\n!\3\""+
		"\3\"\7\"\u01cf\n\"\f\"\16\"\u01d2\13\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01f3"+
		"\n#\3$\3$\5$\u01f7\n$\3$\3$\3%\3%\7%\u01fd\n%\f%\16%\u0200\13%\3&\3&\3"+
		"\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3"+
		"\60\3\61\3\61\3\61\2\3\64\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\n\3\2\60\65\3\2\32\33\4\2\4"+
		"\4II\3\2\36\37\3\2\66;\4\2#%\')\4\2\34\35&&\3\2 \"\u0261\2o\3\2\2\2\4"+
		"t\3\2\2\2\6\u0082\3\2\2\2\b\u0084\3\2\2\2\n\u0095\3\2\2\2\f\u00a0\3\2"+
		"\2\2\16\u00ae\3\2\2\2\20\u00b7\3\2\2\2\22\u00c0\3\2\2\2\24\u00c7\3\2\2"+
		"\2\26\u00ca\3\2\2\2\30\u00d0\3\2\2\2\32\u00d3\3\2\2\2\34\u00d7\3\2\2\2"+
		"\36\u00ef\3\2\2\2 \u00f1\3\2\2\2\"\u00fe\3\2\2\2$\u0104\3\2\2\2&\u0110"+
		"\3\2\2\2(\u0119\3\2\2\2*\u0121\3\2\2\2,\u0127\3\2\2\2.\u0131\3\2\2\2\60"+
		"\u013d\3\2\2\2\62\u0143\3\2\2\2\64\u0169\3\2\2\2\66\u018b\3\2\2\28\u0191"+
		"\3\2\2\2:\u0199\3\2\2\2<\u01ab\3\2\2\2>\u01ad\3\2\2\2@\u01ca\3\2\2\2B"+
		"\u01cc\3\2\2\2D\u01f2\3\2\2\2F\u01f4\3\2\2\2H\u01fa\3\2\2\2J\u0201\3\2"+
		"\2\2L\u0203\3\2\2\2N\u0207\3\2\2\2P\u0209\3\2\2\2R\u020b\3\2\2\2T\u020d"+
		"\3\2\2\2V\u020f\3\2\2\2X\u0211\3\2\2\2Z\u0213\3\2\2\2\\\u0215\3\2\2\2"+
		"^\u0217\3\2\2\2`\u0219\3\2\2\2bn\5 \21\2cd\5\16\b\2de\5`\61\2en\3\2\2"+
		"\2fg\5\n\6\2gh\5`\61\2hn\3\2\2\2ij\58\35\2jk\5`\61\2kn\3\2\2\2ln\5\4\3"+
		"\2mb\3\2\2\2mc\3\2\2\2mf\3\2\2\2mi\3\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\2\2\3s\3\3\2\2\2tu\7\3\2\2u\5\3\2"+
		"\2\2v\u0083\5\n\6\2w\u0083\5\16\b\2x\u0083\5\20\t\2y\u0083\5\22\n\2z\u0083"+
		"\5\32\16\2{\u0083\5\34\17\2|\u0083\5\"\22\2}\u0083\5*\26\2~\u0083\5,\27"+
		"\2\177\u0083\5\64\33\2\u0080\u0083\5.\30\2\u0081\u0083\5\b\5\2\u0082v"+
		"\3\2\2\2\u0082w\3\2\2\2\u0082x\3\2\2\2\u0082y\3\2\2\2\u0082z\3\2\2\2\u0082"+
		"{\3\2\2\2\u0082|\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0082\177\3\2\2"+
		"\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\7\3\2\2\2\u0084\u0085"+
		"\5\64\33\2\u0085\u008b\7>\2\2\u0086\u008c\5\16\b\2\u0087\u008c\5\32\16"+
		"\2\u0088\u008c\5 \21\2\u0089\u008c\5\64\33\2\u008a\u008c\5\b\5\2\u008b"+
		"\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0093\7=\2\2\u008e"+
		"\u0094\5\16\b\2\u008f\u0094\5\32\16\2\u0090\u0094\5 \21\2\u0091\u0094"+
		"\5\64\33\2\u0092\u0094\5\b\5\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2"+
		"\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\t\3"+
		"\2\2\2\u0095\u0096\7*\2\2\u0096\u009b\5\f\7\2\u0097\u0098\7<\2\2\u0098"+
		"\u009a\5\f\7\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\13\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a1"+
		"\58\35\2\u009f\u00a1\5H%\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a9\3\2\2\2\u00a2\u00a7\5\60\31\2\u00a3\u00a8\5\16\b\2\u00a4\u00a8"+
		"\5 \21\2\u00a5\u00a8\5\64\33\2\u00a6\u00a8\5\b\5\2\u00a7\u00a3\3\2\2\2"+
		"\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00aa"+
		"\3\2\2\2\u00a9\u00a2\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\r\3\2\2\2\u00ab"+
		"\u00af\58\35\2\u00ac\u00af\5H%\2\u00ad\u00af\5> \2\u00ae\u00ab\3\2\2\2"+
		"\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b5"+
		"\5\60\31\2\u00b1\u00b6\5\16\b\2\u00b2\u00b6\5 \21\2\u00b3\u00b6\5\64\33"+
		"\2\u00b4\u00b6\5\b\5\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\17\3\2\2\2\u00b7\u00b8\7\21\2\2\u00b8"+
		"\u00b9\7E\2\2\u00b9\u00ba\5\6\4\2\u00ba\u00bb\7D\2\2\u00bb\u00be\5D#\2"+
		"\u00bc\u00bd\7\31\2\2\u00bd\u00bf\5D#\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\21\3\2\2\2\u00c0\u00c2\5\24\13\2\u00c1\u00c3\5\26\f\2\u00c2"+
		"\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c6\5\30"+
		"\r\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\23\3\2\2\2\u00c7\u00c8"+
		"\7\26\2\2\u00c8\u00c9\5B\"\2\u00c9\25\3\2\2\2\u00ca\u00cb\7\27\2\2\u00cb"+
		"\u00cc\7E\2\2\u00cc\u00cd\5H%\2\u00cd\u00ce\7D\2\2\u00ce\u00cf\5B\"\2"+
		"\u00cf\27\3\2\2\2\u00d0\u00d1\7\30\2\2\u00d1\u00d2\5B\"\2\u00d2\31\3\2"+
		"\2\2\u00d3\u00d5\7\r\2\2\u00d4\u00d6\5\6\4\2\u00d5\u00d4\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\33\3\2\2\2\u00d7\u00d8\7\16\2\2\u00d8\u00d9\7E\2"+
		"\2\u00d9\u00da\5\36\20\2\u00da\u00db\7D\2\2\u00db\u00dc\5D#\2\u00dc\35"+
		"\3\2\2\2\u00dd\u00e0\5H%\2\u00de\u00e0\5\n\6\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\20\2\2\u00e2\u00e3\5"+
		"\6\4\2\u00e3\u00f0\3\2\2\2\u00e4\u00e6\5\6\4\2\u00e5\u00e4\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\7?\2\2\u00e8\u00ea\5\6"+
		"\4\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\7?\2\2\u00ec\u00ee\5\6\4\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00df\3\2\2\2\u00ef\u00e5\3\2\2\2\u00f0"+
		"\37\3\2\2\2\u00f1\u00f3\7F\2\2\u00f2\u00f4\5H%\2\u00f3\u00f2\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\7E\2\2\u00f6\u00f8\5\62"+
		"\32\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\7D\2\2\u00fa\u00fc\5B\"\2\u00fb\u00fd\5<\37\2\u00fc\u00fb\3\2\2"+
		"\2\u00fc\u00fd\3\2\2\2\u00fd!\3\2\2\2\u00fe\u00ff\7\23\2\2\u00ff\u0100"+
		"\7E\2\2\u0100\u0101\5\6\4\2\u0101\u0102\7D\2\2\u0102\u0103\5$\23\2\u0103"+
		"#\3\2\2\2\u0104\u0108\7C\2\2\u0105\u0107\5&\24\2\u0106\u0105\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010d\5(\25\2\u010c\u010b\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7B\2\2\u010f%\3\2\2\2\u0110"+
		"\u0111\7\24\2\2\u0111\u0112\5\64\33\2\u0112\u0116\7=\2\2\u0113\u0115\5"+
		"D#\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\'\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\25\2"+
		"\2\u011a\u011e\7=\2\2\u011b\u011d\5D#\2\u011c\u011b\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f)\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0122\7\17\2\2\u0122\u0123\7E\2\2\u0123\u0124\5\6"+
		"\4\2\u0124\u0125\7D\2\2\u0125\u0126\5D#\2\u0126+\3\2\2\2\u0127\u0128\7"+
		"\22\2\2\u0128\u0129\5D#\2\u0129\u012a\7\17\2\2\u012a\u012b\7E\2\2\u012b"+
		"\u012c\5\6\4\2\u012c\u012d\7D\2\2\u012d-\3\2\2\2\u012e\u0132\5\16\b\2"+
		"\u012f\u0132\5 \21\2\u0130\u0132\5\64\33\2\u0131\u012e\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0139\3\2\2\2\u0133\u0137\7<\2\2\u0134"+
		"\u0138\5\16\b\2\u0135\u0138\5 \21\2\u0136\u0138\5\64\33\2\u0137\u0134"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0133\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c/\3\2\2\2\u013d\u013e\t\2\2\2\u013e\61\3\2\2\2\u013f\u0144\5"+
		"\16\b\2\u0140\u0144\5 \21\2\u0141\u0144\5\64\33\2\u0142\u0144\5\b\5\2"+
		"\u0143\u013f\3\2\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142"+
		"\3\2\2\2\u0144\u014e\3\2\2\2\u0145\u014a\7<\2\2\u0146\u014b\5\16\b\2\u0147"+
		"\u014b\5 \21\2\u0148\u014b\5\64\33\2\u0149\u014b\5\b\5\2\u014a\u0146\3"+
		"\2\2\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014d\3\2\2\2\u014c\u0145\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\63\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152"+
		"\b\33\1\2\u0152\u0153\5N(\2\u0153\u0154\5\64\33\22\u0154\u016a\3\2\2\2"+
		"\u0155\u0156\7\n\2\2\u0156\u016a\5\64\33\20\u0157\u0158\7-\2\2\u0158\u016a"+
		"\5\64\33\f\u0159\u015a\5T+\2\u015a\u015b\5\64\33\5\u015b\u016a\3\2\2\2"+
		"\u015c\u016a\5@!\2\u015d\u016a\58\35\2\u015e\u015f\7\t\2\2\u015f\u016a"+
		"\5\6\4\2\u0160\u016a\7\13\2\2\u0161\u016a\7\f\2\2\u0162\u016a\5\66\34"+
		"\2\u0163\u0164\5Z.\2\u0164\u0165\5@!\2\u0165\u016a\3\2\2\2\u0166\u0167"+
		"\5@!\2\u0167\u0168\5Z.\2\u0168\u016a\3\2\2\2\u0169\u0151\3\2\2\2\u0169"+
		"\u0155\3\2\2\2\u0169\u0157\3\2\2\2\u0169\u0159\3\2\2\2\u0169\u015c\3\2"+
		"\2\2\u0169\u015d\3\2\2\2\u0169\u015e\3\2\2\2\u0169\u0160\3\2\2\2\u0169"+
		"\u0161\3\2\2\2\u0169\u0162\3\2\2\2\u0169\u0163\3\2\2\2\u0169\u0166\3\2"+
		"\2\2\u016a\u0188\3\2\2\2\u016b\u016c\f\23\2\2\u016c\u016d\7.\2\2\u016d"+
		"\u0187\5\64\33\24\u016e\u016f\f\13\2\2\u016f\u0170\5P)\2\u0170\u0171\5"+
		"\64\33\f\u0171\u0187\3\2\2\2\u0172\u0173\f\n\2\2\u0173\u0174\5R*\2\u0174"+
		"\u0175\5\64\33\13\u0175\u0187\3\2\2\2\u0176\u0177\f\t\2\2\u0177\u0178"+
		"\5X-\2\u0178\u0179\5\64\33\n\u0179\u0187\3\2\2\2\u017a\u017b\f\b\2\2\u017b"+
		"\u017c\5V,\2\u017c\u017d\5\64\33\t\u017d\u0187\3\2\2\2\u017e\u017f\f\7"+
		"\2\2\u017f\u0180\5^\60\2\u0180\u0181\5\64\33\b\u0181\u0187\3\2\2\2\u0182"+
		"\u0183\f\6\2\2\u0183\u0184\5\\/\2\u0184\u0185\5\64\33\7\u0185\u0187\3"+
		"\2\2\2\u0186\u016b\3\2\2\2\u0186\u016e\3\2\2\2\u0186\u0172\3\2\2\2\u0186"+
		"\u0176\3\2\2\2\u0186\u017a\3\2\2\2\u0186\u017e\3\2\2\2\u0186\u0182\3\2"+
		"\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\65\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7\b\2\2\u018c\u018d\5H%\2"+
		"\u018d\67\3\2\2\2\u018e\u0192\5@!\2\u018f\u0192\5\66\34\2\u0190\u0192"+
		"\5> \2\u0191\u018e\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0194\7G\2\2\u0194\u0196\5:\36\2\u0195\u0193\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"9\3\2\2\2\u0199\u019a\5H%\2\u019a;\3\2\2\2\u019b\u019f\7A\2\2\u019c\u01a0"+
		"\5\64\33\2\u019d\u01a0\5.\30\2\u019e\u01a0\5\b\5\2\u019f\u019c\3\2\2\2"+
		"\u019f\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u01a3"+
		"\7<\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a5\7@\2\2\u01a5\u01ac\3\2\2\2\u01a6\u01a8\7E\2\2\u01a7\u01a9\5\62"+
		"\32\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ac\7D\2\2\u01ab\u019b\3\2\2\2\u01ab\u01a6\3\2\2\2\u01ac=\3\2\2\2\u01ad"+
		"\u01ae\7E\2\2\u01ae\u01af\5\6\4\2\u01af\u01b3\7D\2\2\u01b0\u01b2\5<\37"+
		"\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4?\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01cb\5 \21\2\u01b7"+
		"\u01cb\5H%\2\u01b8\u01cb\7\4\2\2\u01b9\u01cb\7H\2\2\u01ba\u01cb\t\3\2"+
		"\2\u01bb\u01c0\7C\2\2\u01bc\u01be\5L\'\2\u01bd\u01bf\7<\2\2\u01be\u01bd"+
		"\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01bc\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4\u01c5\7B\2\2\u01c5\u01cb\3\2\2\2\u01c6\u01cb\5B\"\2\u01c7\u01cb"+
		"\5F$\2\u01c8\u01cb\7\7\2\2\u01c9\u01cb\5> \2\u01ca\u01b6\3\2\2\2\u01ca"+
		"\u01b7\3\2\2\2\u01ca\u01b8\3\2\2\2\u01ca\u01b9\3\2\2\2\u01ca\u01ba\3\2"+
		"\2\2\u01ca\u01bb\3\2\2\2\u01ca\u01c6\3\2\2\2\u01ca\u01c7\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cbA\3\2\2\2\u01cc\u01d0\7C\2\2\u01cd"+
		"\u01cf\5D#\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2"+
		"\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4"+
		"\7B\2\2\u01d4C\3\2\2\2\u01d5\u01f3\5\20\t\2\u01d6\u01f3\5\34\17\2\u01d7"+
		"\u01f3\5*\26\2\u01d8\u01d9\5,\27\2\u01d9\u01da\5`\61\2\u01da\u01f3\3\2"+
		"\2\2\u01db\u01f3\5\"\22\2\u01dc\u01f3\5\22\n\2\u01dd\u01de\5\32\16\2\u01de"+
		"\u01df\5`\61\2\u01df\u01f3\3\2\2\2\u01e0\u01f3\5B\"\2\u01e1\u01e2\5\n"+
		"\6\2\u01e2\u01e3\5`\61\2\u01e3\u01f3\3\2\2\2\u01e4\u01e5\5\16\b\2\u01e5"+
		"\u01e6\5`\61\2\u01e6\u01f3\3\2\2\2\u01e7\u01e8\5.\30\2\u01e8\u01e9\5`"+
		"\61\2\u01e9\u01f3\3\2\2\2\u01ea\u01eb\5\64\33\2\u01eb\u01ec\5`\61\2\u01ec"+
		"\u01f3\3\2\2\2\u01ed\u01f3\5 \21\2\u01ee\u01ef\5\b\5\2\u01ef\u01f0\5`"+
		"\61\2\u01f0\u01f3\3\2\2\2\u01f1\u01f3\5\4\3\2\u01f2\u01d5\3\2\2\2\u01f2"+
		"\u01d6\3\2\2\2\u01f2\u01d7\3\2\2\2\u01f2\u01d8\3\2\2\2\u01f2\u01db\3\2"+
		"\2\2\u01f2\u01dc\3\2\2\2\u01f2\u01dd\3\2\2\2\u01f2\u01e0\3\2\2\2\u01f2"+
		"\u01e1\3\2\2\2\u01f2\u01e4\3\2\2\2\u01f2\u01e7\3\2\2\2\u01f2\u01ea\3\2"+
		"\2\2\u01f2\u01ed\3\2\2\2\u01f2\u01ee\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3"+
		"E\3\2\2\2\u01f4\u01f6\7A\2\2\u01f5\u01f7\5\62\32\2\u01f6\u01f5\3\2\2\2"+
		"\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\7@\2\2\u01f9G\3\2"+
		"\2\2\u01fa\u01fe\5J&\2\u01fb\u01fd\5<\37\2\u01fc\u01fb\3\2\2\2\u01fd\u0200"+
		"\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ffI\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0201\u0202\7I\2\2\u0202K\3\2\2\2\u0203\u0204\t\4\2\2\u0204"+
		"\u0205\7=\2\2\u0205\u0206\5\64\33\2\u0206M\3\2\2\2\u0207\u0208\7/\2\2"+
		"\u0208O\3\2\2\2\u0209\u020a\7+\2\2\u020aQ\3\2\2\2\u020b\u020c\7,\2\2\u020c"+
		"S\3\2\2\2\u020d\u020e\t\5\2\2\u020eU\3\2\2\2\u020f\u0210\t\6\2\2\u0210"+
		"W\3\2\2\2\u0211\u0212\t\7\2\2\u0212Y\3\2\2\2\u0213\u0214\t\b\2\2\u0214"+
		"[\3\2\2\2\u0215\u0216\t\5\2\2\u0216]\3\2\2\2\u0217\u0218\t\t\2\2\u0218"+
		"_\3\2\2\2\u0219\u021a\7?\2\2\u021aa\3\2\2\2\64mo\u0082\u008b\u0093\u009b"+
		"\u00a0\u00a7\u00a9\u00ae\u00b5\u00be\u00c2\u00c5\u00d5\u00df\u00e5\u00e9"+
		"\u00ed\u00ef\u00f3\u00f7\u00fc\u0108\u010c\u0116\u011e\u0131\u0137\u013b"+
		"\u0143\u014a\u014e\u0169\u0186\u0188\u0191\u0197\u019f\u01a2\u01a8\u01ab"+
		"\u01b3\u01be\u01c2\u01ca\u01d0\u01f2\u01f6\u01fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}