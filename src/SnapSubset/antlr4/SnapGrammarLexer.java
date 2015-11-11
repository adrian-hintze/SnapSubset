package antlr4;
// Generated from SnapGrammar.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SnapGrammarLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRAGMA", "STRING", "SINGLELINE_COMMENT", "MULTILINE_COMMENT", "REGULAR_EXPRESSION", 
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


	public SnapGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SnapGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2J\u01f0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\2\3\2\6\2\u0099\n\2\r\2\16\2\u009a\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\7\3\u00a5\n\3\f\3\16\3\u00a8\13\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3\u00af\n\3\f\3\16\3\u00b2\13\3\3\3\5\3\u00b5\n\3\3\4\3\4\3\4\3\4\7\4"+
		"\u00bb\n\4\f\4\16\4\u00be\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u00c6\n\5\f"+
		"\5\16\5\u00c9\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\6\6\u00d2\n\6\r\6\16\6"+
		"\u00d3\3\6\6\6\u00d7\n\6\r\6\16\6\u00d8\3\6\3\6\7\6\u00dd\n\6\f\6\16\6"+
		"\u00e0\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+"+
		"\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\5\65\u01a7\n\65\3\66\3\66\3\66\3\66\5\66\u01ad"+
		"\n\66\3\67\3\67\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?"+
		"\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3G\6G"+
		"\u01d9\nG\rG\16G\u01da\3G\3G\6G\u01df\nG\rG\16G\u01e0\5G\u01e3\nG\3H\6"+
		"H\u01e6\nH\rH\16H\u01e7\3I\6I\u01eb\nI\rI\16I\u01ec\3I\3I\6\u009a\u00a6"+
		"\u00b0\u00c7\2J\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\3\2\t\4\2\f\f\17\17\6\2\62;C\\aac|\n\2$"+
		"+--//<<>>@B]_}\177\5\2iikkoo\3\2\62;\7\2&&\62;C\\aac|\5\2\13\f\17\17\""+
		"\"\u0202\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0093\3\2\2\2\5\u00b4"+
		"\3\2\2\2\7\u00b6\3\2\2\2\t\u00c1\3\2\2\2\13\u00cf\3\2\2\2\r\u00e1\3\2"+
		"\2\2\17\u00e5\3\2\2\2\21\u00eb\3\2\2\2\23\u00f2\3\2\2\2\25\u00f8\3\2\2"+
		"\2\27\u0101\3\2\2\2\31\u0108\3\2\2\2\33\u010c\3\2\2\2\35\u0112\3\2\2\2"+
		"\37\u0115\3\2\2\2!\u0118\3\2\2\2#\u011b\3\2\2\2%\u0122\3\2\2\2\'\u0127"+
		"\3\2\2\2)\u012f\3\2\2\2+\u0133\3\2\2\2-\u0139\3\2\2\2/\u0141\3\2\2\2\61"+
		"\u0146\3\2\2\2\63\u014b\3\2\2\2\65\u0151\3\2\2\2\67\u0154\3\2\2\29\u0157"+
		"\3\2\2\2;\u0159\3\2\2\2=\u015b\3\2\2\2?\u015d\3\2\2\2A\u015f\3\2\2\2C"+
		"\u0161\3\2\2\2E\u0163\3\2\2\2G\u0165\3\2\2\2I\u0167\3\2\2\2K\u0169\3\2"+
		"\2\2M\u016c\3\2\2\2O\u016f\3\2\2\2Q\u0173\3\2\2\2S\u0177\3\2\2\2U\u017a"+
		"\3\2\2\2W\u017d\3\2\2\2Y\u017f\3\2\2\2[\u018a\3\2\2\2]\u0191\3\2\2\2_"+
		"\u0193\3\2\2\2a\u0196\3\2\2\2c\u0199\3\2\2\2e\u019c\3\2\2\2g\u019f\3\2"+
		"\2\2i\u01a2\3\2\2\2k\u01a8\3\2\2\2m\u01ae\3\2\2\2o\u01b0\3\2\2\2q\u01b2"+
		"\3\2\2\2s\u01b5\3\2\2\2u\u01b8\3\2\2\2w\u01ba\3\2\2\2y\u01bc\3\2\2\2{"+
		"\u01be\3\2\2\2}\u01c0\3\2\2\2\177\u01c2\3\2\2\2\u0081\u01c4\3\2\2\2\u0083"+
		"\u01c6\3\2\2\2\u0085\u01c8\3\2\2\2\u0087\u01ca\3\2\2\2\u0089\u01cc\3\2"+
		"\2\2\u008b\u01d5\3\2\2\2\u008d\u01d8\3\2\2\2\u008f\u01e5\3\2\2\2\u0091"+
		"\u01ea\3\2\2\2\u0093\u0094\7\61\2\2\u0094\u0095\7,\2\2\u0095\u0096\7B"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0099\13\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009d\7#\2\2\u009d\u009e\7,\2\2\u009e\u009f\7\61\2\2\u009f"+
		"\4\3\2\2\2\u00a0\u00a6\7$\2\2\u00a1\u00a2\7^\2\2\u00a2\u00a5\7$\2\2\u00a3"+
		"\u00a5\13\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00b5\7$\2\2\u00aa\u00b0\7)\2\2\u00ab\u00ac\7^\2"+
		"\2\u00ac\u00af\7)\2\2\u00ad\u00af\13\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\7)\2\2\u00b4\u00a0\3\2"+
		"\2\2\u00b4\u00aa\3\2\2\2\u00b5\6\3\2\2\2\u00b6\u00b7\7\61\2\2\u00b7\u00b8"+
		"\7\61\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00bb\n\2\2\2\u00ba\u00b9\3\2\2\2"+
		"\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\b\4\2\2\u00c0\b\3\2\2\2\u00c1"+
		"\u00c2\7\61\2\2\u00c2\u00c3\7,\2\2\u00c3\u00c7\3\2\2\2\u00c4\u00c6\13"+
		"\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7,"+
		"\2\2\u00cb\u00cc\7\61\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b\5\2\2\u00ce"+
		"\n\3\2\2\2\u00cf\u00d6\7\61\2\2\u00d0\u00d2\t\3\2\2\u00d1\u00d0\3\2\2"+
		"\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7"+
		"\3\2\2\2\u00d5\u00d7\t\4\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00de\7\61\2\2\u00db\u00dd\t\5\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\f\3\2\2\2"+
		"\u00e0\u00de\3\2\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4"+
		"\7y\2\2\u00e4\16\3\2\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7j\2\2\u00e7\u00e8"+
		"\7t\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7y\2\2\u00ea\20\3\2\2\2\u00eb\u00ec"+
		"\7f\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7g\2\2\u00ef"+
		"\u00f0\7v\2\2\u00f0\u00f1\7g\2\2\u00f1\22\3\2\2\2\u00f2\u00f3\7d\2\2\u00f3"+
		"\u00f4\7t\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7m\2\2"+
		"\u00f7\24\3\2\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7"+
		"p\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff"+
		"\7w\2\2\u00ff\u0100\7g\2\2\u0100\26\3\2\2\2\u0101\u0102\7t\2\2\u0102\u0103"+
		"\7g\2\2\u0103\u0104\7v\2\2\u0104\u0105\7w\2\2\u0105\u0106\7t\2\2\u0106"+
		"\u0107\7p\2\2\u0107\30\3\2\2\2\u0108\u0109\7h\2\2\u0109\u010a\7q\2\2\u010a"+
		"\u010b\7t\2\2\u010b\32\3\2\2\2\u010c\u010d\7y\2\2\u010d\u010e\7j\2\2\u010e"+
		"\u010f\7k\2\2\u010f\u0110\7n\2\2\u0110\u0111\7g\2\2\u0111\34\3\2\2\2\u0112"+
		"\u0113\7k\2\2\u0113\u0114\7p\2\2\u0114\36\3\2\2\2\u0115\u0116\7k\2\2\u0116"+
		"\u0117\7h\2\2\u0117 \3\2\2\2\u0118\u0119\7f\2\2\u0119\u011a\7q\2\2\u011a"+
		"\"\3\2\2\2\u011b\u011c\7u\2\2\u011c\u011d\7y\2\2\u011d\u011e\7k\2\2\u011e"+
		"\u011f\7v\2\2\u011f\u0120\7e\2\2\u0120\u0121\7j\2\2\u0121$\3\2\2\2\u0122"+
		"\u0123\7e\2\2\u0123\u0124\7c\2\2\u0124\u0125\7u\2\2\u0125\u0126\7g\2\2"+
		"\u0126&\3\2\2\2\u0127\u0128\7f\2\2\u0128\u0129\7g\2\2\u0129\u012a\7h\2"+
		"\2\u012a\u012b\7c\2\2\u012b\u012c\7w\2\2\u012c\u012d\7n\2\2\u012d\u012e"+
		"\7v\2\2\u012e(\3\2\2\2\u012f\u0130\7v\2\2\u0130\u0131\7t\2\2\u0131\u0132"+
		"\7{\2\2\u0132*\3\2\2\2\u0133\u0134\7e\2\2\u0134\u0135\7c\2\2\u0135\u0136"+
		"\7v\2\2\u0136\u0137\7e\2\2\u0137\u0138\7j\2\2\u0138,\3\2\2\2\u0139\u013a"+
		"\7h\2\2\u013a\u013b\7k\2\2\u013b\u013c\7p\2\2\u013c\u013d\7c\2\2\u013d"+
		"\u013e\7n\2\2\u013e\u013f\7n\2\2\u013f\u0140\7{\2\2\u0140.\3\2\2\2\u0141"+
		"\u0142\7g\2\2\u0142\u0143\7n\2\2\u0143\u0144\7u\2\2\u0144\u0145\7g\2\2"+
		"\u0145\60\3\2\2\2\u0146\u0147\7v\2\2\u0147\u0148\7t\2\2\u0148\u0149\7"+
		"w\2\2\u0149\u014a\7g\2\2\u014a\62\3\2\2\2\u014b\u014c\7h\2\2\u014c\u014d"+
		"\7c\2\2\u014d\u014e\7n\2\2\u014e\u014f\7u\2\2\u014f\u0150\7g\2\2\u0150"+
		"\64\3\2\2\2\u0151\u0152\7-\2\2\u0152\u0153\7-\2\2\u0153\66\3\2\2\2\u0154"+
		"\u0155\7/\2\2\u0155\u0156\7/\2\2\u01568\3\2\2\2\u0157\u0158\7-\2\2\u0158"+
		":\3\2\2\2\u0159\u015a\7/\2\2\u015a<\3\2\2\2\u015b\u015c\7,\2\2\u015c>"+
		"\3\2\2\2\u015d\u015e\7\61\2\2\u015e@\3\2\2\2\u015f\u0160\7\'\2\2\u0160"+
		"B\3\2\2\2\u0161\u0162\7(\2\2\u0162D\3\2\2\2\u0163\u0164\7~\2\2\u0164F"+
		"\3\2\2\2\u0165\u0166\7`\2\2\u0166H\3\2\2\2\u0167\u0168\7\u0080\2\2\u0168"+
		"J\3\2\2\2\u0169\u016a\7>\2\2\u016a\u016b\7>\2\2\u016bL\3\2\2\2\u016c\u016d"+
		"\7@\2\2\u016d\u016e\7@\2\2\u016eN\3\2\2\2\u016f\u0170\7@\2\2\u0170\u0171"+
		"\7@\2\2\u0171\u0172\7@\2\2\u0172P\3\2\2\2\u0173\u0174\7x\2\2\u0174\u0175"+
		"\7c\2\2\u0175\u0176\7t\2\2\u0176R\3\2\2\2\u0177\u0178\7(\2\2\u0178\u0179"+
		"\7(\2\2\u0179T\3\2\2\2\u017a\u017b\7~\2\2\u017b\u017c\7~\2\2\u017cV\3"+
		"\2\2\2\u017d\u017e\7#\2\2\u017eX\3\2\2\2\u017f\u0180\7k\2\2\u0180\u0181"+
		"\7p\2\2\u0181\u0182\7u\2\2\u0182\u0183\7v\2\2\u0183\u0184\7c\2\2\u0184"+
		"\u0185\7p\2\2\u0185\u0186\7e\2\2\u0186\u0187\7g\2\2\u0187\u0188\7q\2\2"+
		"\u0188\u0189\7h\2\2\u0189Z\3\2\2\2\u018a\u018b\7v\2\2\u018b\u018c\7{\2"+
		"\2\u018c\u018d\7r\2\2\u018d\u018e\7g\2\2\u018e\u018f\7q\2\2\u018f\u0190"+
		"\7h\2\2\u0190\\\3\2\2\2\u0191\u0192\7?\2\2\u0192^\3\2\2\2\u0193\u0194"+
		"\7-\2\2\u0194\u0195\7?\2\2\u0195`\3\2\2\2\u0196\u0197\7/\2\2\u0197\u0198"+
		"\7?\2\2\u0198b\3\2\2\2\u0199\u019a\7\61\2\2\u019a\u019b\7?\2\2\u019bd"+
		"\3\2\2\2\u019c\u019d\7,\2\2\u019d\u019e\7?\2\2\u019ef\3\2\2\2\u019f\u01a0"+
		"\7\'\2\2\u01a0\u01a1\7?\2\2\u01a1h\3\2\2\2\u01a2\u01a3\7?\2\2\u01a3\u01a4"+
		"\7?\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a7\7?\2\2\u01a6\u01a5\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7j\3\2\2\2\u01a8\u01a9\7#\2\2\u01a9\u01aa\7?\2\2\u01aa"+
		"\u01ac\3\2\2\2\u01ab\u01ad\7?\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01adl\3\2\2\2\u01ae\u01af\7@\2\2\u01afn\3\2\2\2\u01b0\u01b1\7>\2"+
		"\2\u01b1p\3\2\2\2\u01b2\u01b3\7@\2\2\u01b3\u01b4\7?\2\2\u01b4r\3\2\2\2"+
		"\u01b5\u01b6\7>\2\2\u01b6\u01b7\7?\2\2\u01b7t\3\2\2\2\u01b8\u01b9\7.\2"+
		"\2\u01b9v\3\2\2\2\u01ba\u01bb\7<\2\2\u01bbx\3\2\2\2\u01bc\u01bd\7A\2\2"+
		"\u01bdz\3\2\2\2\u01be\u01bf\7=\2\2\u01bf|\3\2\2\2\u01c0\u01c1\7_\2\2\u01c1"+
		"~\3\2\2\2\u01c2\u01c3\7]\2\2\u01c3\u0080\3\2\2\2\u01c4\u01c5\7\177\2\2"+
		"\u01c5\u0082\3\2\2\2\u01c6\u01c7\7}\2\2\u01c7\u0084\3\2\2\2\u01c8\u01c9"+
		"\7+\2\2\u01c9\u0086\3\2\2\2\u01ca\u01cb\7*\2\2\u01cb\u0088\3\2\2\2\u01cc"+
		"\u01cd\7h\2\2\u01cd\u01ce\7w\2\2\u01ce\u01cf\7p\2\2\u01cf\u01d0\7e\2\2"+
		"\u01d0\u01d1\7v\2\2\u01d1\u01d2\7k\2\2\u01d2\u01d3\7q\2\2\u01d3\u01d4"+
		"\7p\2\2\u01d4\u008a\3\2\2\2\u01d5\u01d6\7\60\2\2\u01d6\u008c\3\2\2\2\u01d7"+
		"\u01d9\t\6\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01d8\3\2"+
		"\2\2\u01da\u01db\3\2\2\2\u01db\u01e2\3\2\2\2\u01dc\u01de\5\u008bF\2\u01dd"+
		"\u01df\t\6\2\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01dc\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u008e\3\2\2\2\u01e4\u01e6\t\7\2\2\u01e5\u01e4\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u0090\3\2\2\2\u01e9\u01eb\t\b\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01ef\bI\2\2\u01ef\u0092\3\2\2\2\26\2\u009a\u00a4\u00a6\u00ae\u00b0\u00b4"+
		"\u00bc\u00c7\u00d3\u00d6\u00d8\u00de\u01a6\u01ac\u01da\u01e0\u01e2\u01e7"+
		"\u01ec\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}