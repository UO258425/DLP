// Generated from C:/Users/Carlos Manrique/IdeaProjects/DLP/src/parser\Cmm.g4 by ANTLR 4.8
package parser;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, WHITE_SPACE=37, NEW_LINE=38, 
		TAB=39, SINGLE_LINE_COMMENT=40, MULTILINE_COMMENT=41, REAL_CONSTANT=42, 
		ID=43, INT_CONSTANT=44, CHAR_CONSTANT=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "WHITE_SPACE", "NEW_LINE", "TAB", "SINGLE_LINE_COMMENT", 
			"MULTILINE_COMMENT", "REAL_CONSTANT", "ID", "INT_CONSTANT", "CHAR_CONSTANT", 
			"LETTER", "FIXED_POINT", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'('", "')'", "','", "';'", "'{'", "'}'", "'['", "']'", 
			"'.'", "'-'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", 
			"'!='", "'=='", "'&&'", "'||'", "'!'", "'='", "'while'", "'if'", "'else'", 
			"'return'", "'read'", "'write'", "'int'", "'char'", "'double'", "'void'", 
			"'struct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WHITE_SPACE", "NEW_LINE", "TAB", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
			"REAL_CONSTANT", "ID", "INT_CONSTANT", "CHAR_CONSTANT"
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0165\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\6&\u00dc"+
		"\n&\r&\16&\u00dd\3&\3&\3\'\6\'\u00e3\n\'\r\'\16\'\u00e4\3\'\3\'\3(\6("+
		"\u00ea\n(\r(\16(\u00eb\3(\3(\3)\3)\3)\3)\7)\u00f4\n)\f)\16)\u00f7\13)"+
		"\3)\5)\u00fa\n)\3)\3)\3*\3*\3*\3*\7*\u0102\n*\f*\16*\u0105\13*\3*\3*\3"+
		"*\5*\u010a\n*\3*\3*\3+\3+\5+\u0110\n+\3+\3+\5+\u0114\n+\3+\3+\3+\5+\u0119"+
		"\n+\3,\3,\5,\u011d\n,\3,\3,\3,\7,\u0122\n,\f,\16,\u0125\13,\3-\3-\3-\7"+
		"-\u012a\n-\f-\16-\u012d\13-\5-\u012f\n-\3.\3.\3.\5.\u0134\n.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\6.\u013f\n.\r.\16.\u0140\5.\u0143\n.\3.\5.\u0146\n"+
		".\3/\3/\3\60\6\60\u014b\n\60\r\60\16\60\u014c\3\60\3\60\7\60\u0151\n\60"+
		"\f\60\16\60\u0154\13\60\3\60\7\60\u0157\n\60\f\60\16\60\u015a\13\60\3"+
		"\60\3\60\6\60\u015e\n\60\r\60\16\60\u015f\5\60\u0162\n\60\3\61\3\61\4"+
		"\u00f5\u0103\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\2_\2a\2\3\2\n\4\2"+
		"\f\f\17\17\3\3\f\f\4\2GGgg\3\2\63;\3\2\62;\3\2\"\u0080\4\2ppvv\4\2C\\"+
		"c|\2\u017a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3c\3\2\2\2\5h\3\2"+
		"\2\2\7j\3\2\2\2\tl\3\2\2\2\13n\3\2\2\2\rp\3\2\2\2\17r\3\2\2\2\21t\3\2"+
		"\2\2\23v\3\2\2\2\25x\3\2\2\2\27z\3\2\2\2\31|\3\2\2\2\33~\3\2\2\2\35\u0080"+
		"\3\2\2\2\37\u0082\3\2\2\2!\u0084\3\2\2\2#\u0086\3\2\2\2%\u0089\3\2\2\2"+
		"\'\u008b\3\2\2\2)\u008e\3\2\2\2+\u0091\3\2\2\2-\u0094\3\2\2\2/\u0097\3"+
		"\2\2\2\61\u009a\3\2\2\2\63\u009c\3\2\2\2\65\u009e\3\2\2\2\67\u00a4\3\2"+
		"\2\29\u00a7\3\2\2\2;\u00ac\3\2\2\2=\u00b3\3\2\2\2?\u00b8\3\2\2\2A\u00be"+
		"\3\2\2\2C\u00c2\3\2\2\2E\u00c7\3\2\2\2G\u00ce\3\2\2\2I\u00d3\3\2\2\2K"+
		"\u00db\3\2\2\2M\u00e2\3\2\2\2O\u00e9\3\2\2\2Q\u00ef\3\2\2\2S\u00fd\3\2"+
		"\2\2U\u0118\3\2\2\2W\u011c\3\2\2\2Y\u012e\3\2\2\2[\u0145\3\2\2\2]\u0147"+
		"\3\2\2\2_\u0161\3\2\2\2a\u0163\3\2\2\2cd\7o\2\2de\7c\2\2ef\7k\2\2fg\7"+
		"p\2\2g\4\3\2\2\2hi\7*\2\2i\6\3\2\2\2jk\7+\2\2k\b\3\2\2\2lm\7.\2\2m\n\3"+
		"\2\2\2no\7=\2\2o\f\3\2\2\2pq\7}\2\2q\16\3\2\2\2rs\7\177\2\2s\20\3\2\2"+
		"\2tu\7]\2\2u\22\3\2\2\2vw\7_\2\2w\24\3\2\2\2xy\7\60\2\2y\26\3\2\2\2z{"+
		"\7/\2\2{\30\3\2\2\2|}\7,\2\2}\32\3\2\2\2~\177\7\61\2\2\177\34\3\2\2\2"+
		"\u0080\u0081\7\'\2\2\u0081\36\3\2\2\2\u0082\u0083\7-\2\2\u0083 \3\2\2"+
		"\2\u0084\u0085\7@\2\2\u0085\"\3\2\2\2\u0086\u0087\7@\2\2\u0087\u0088\7"+
		"?\2\2\u0088$\3\2\2\2\u0089\u008a\7>\2\2\u008a&\3\2\2\2\u008b\u008c\7>"+
		"\2\2\u008c\u008d\7?\2\2\u008d(\3\2\2\2\u008e\u008f\7#\2\2\u008f\u0090"+
		"\7?\2\2\u0090*\3\2\2\2\u0091\u0092\7?\2\2\u0092\u0093\7?\2\2\u0093,\3"+
		"\2\2\2\u0094\u0095\7(\2\2\u0095\u0096\7(\2\2\u0096.\3\2\2\2\u0097\u0098"+
		"\7~\2\2\u0098\u0099\7~\2\2\u0099\60\3\2\2\2\u009a\u009b\7#\2\2\u009b\62"+
		"\3\2\2\2\u009c\u009d\7?\2\2\u009d\64\3\2\2\2\u009e\u009f\7y\2\2\u009f"+
		"\u00a0\7j\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2"+
		"\u00a3\66\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7h\2\2\u00a68\3\2\2\2"+
		"\u00a7\u00a8\7g\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab"+
		"\7g\2\2\u00ab:\3\2\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af"+
		"\7v\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7p\2\2\u00b2"+
		"<\3\2\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7f\2\2\u00b7>\3\2\2\2\u00b8\u00b9\7y\2\2\u00b9\u00ba\7t\2\2\u00ba"+
		"\u00bb\7k\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7g\2\2\u00bd@\3\2\2\2\u00be"+
		"\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7v\2\2\u00c1B\3\2\2\2\u00c2"+
		"\u00c3\7e\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7t\2\2"+
		"\u00c6D\3\2\2\2\u00c7\u00c8\7f\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7w\2"+
		"\2\u00ca\u00cb\7d\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cdF\3\2"+
		"\2\2\u00ce\u00cf\7x\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2"+
		"\7f\2\2\u00d2H\3\2\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6"+
		"\7t\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7v\2\2\u00d9"+
		"J\3\2\2\2\u00da\u00dc\7\"\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\b&\2\2\u00e0L\3\2\2\2\u00e1\u00e3\t\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\b\'\2\2\u00e7N\3\2\2\2\u00e8\u00ea\7\13\2\2\u00e9\u00e8\3\2\2\2"+
		"\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ee\b(\2\2\u00eeP\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0"+
		"\u00f1\7\61\2\2\u00f1\u00f5\3\2\2\2\u00f2\u00f4\13\2\2\2\u00f3\u00f2\3"+
		"\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\t\3\2\2\u00f9\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b)\2\2\u00fcR\3\2\2\2\u00fd\u00fe"+
		"\7\61\2\2\u00fe\u00ff\7,\2\2\u00ff\u0103\3\2\2\2\u0100\u0102\13\2\2\2"+
		"\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0104\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0104\u0109\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7,\2\2\u0107"+
		"\u010a\7\61\2\2\u0108\u010a\7\2\2\3\u0109\u0106\3\2\2\2\u0109\u0108\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b*\2\2\u010cT\3\2\2\2\u010d\u0110"+
		"\5_\60\2\u010e\u0110\5Y-\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0113\t\4\2\2\u0112\u0114\7/\2\2\u0113\u0112\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\5Y-\2\u0116\u0119"+
		"\3\2\2\2\u0117\u0119\5_\60\2\u0118\u010f\3\2\2\2\u0118\u0117\3\2\2\2\u0119"+
		"V\3\2\2\2\u011a\u011d\5]/\2\u011b\u011d\7a\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011b\3\2\2\2\u011d\u0123\3\2\2\2\u011e\u0122\5]/\2\u011f\u0122\7a\2"+
		"\2\u0120\u0122\5a\61\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120"+
		"\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"X\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u012f\7\62\2\2\u0127\u012b\t\5\2\2"+
		"\u0128\u012a\t\6\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u0126\3\2\2\2\u012e\u0127\3\2\2\2\u012fZ\3\2\2\2\u0130\u0133\7)\2\2\u0131"+
		"\u0134\5]/\2\u0132\u0134\5Y-\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2"+
		"\u0134\u0135\3\2\2\2\u0135\u0136\7)\2\2\u0136\u0146\3\2\2\2\u0137\u0138"+
		"\7)\2\2\u0138\u0139\t\7\2\2\u0139\u0146\7)\2\2\u013a\u013b\7)\2\2\u013b"+
		"\u0142\7^\2\2\u013c\u0143\t\b\2\2\u013d\u013f\5Y-\2\u013e\u013d\3\2\2"+
		"\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143"+
		"\3\2\2\2\u0142\u013c\3\2\2\2\u0142\u013e\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0146\7)\2\2\u0145\u0130\3\2\2\2\u0145\u0137\3\2\2\2\u0145\u013a\3\2"+
		"\2\2\u0146\\\3\2\2\2\u0147\u0148\t\t\2\2\u0148^\3\2\2\2\u0149\u014b\5"+
		"Y-\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0152\7\60\2\2\u014f\u0151\5"+
		"a\61\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0162\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0157\5Y"+
		"-\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\7\60"+
		"\2\2\u015c\u015e\5a\61\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u014a\3\2"+
		"\2\2\u0161\u0158\3\2\2\2\u0162`\3\2\2\2\u0163\u0164\t\6\2\2\u0164b\3\2"+
		"\2\2\33\2\u00dd\u00e4\u00eb\u00f5\u00f9\u0103\u0109\u010f\u0113\u0118"+
		"\u011c\u0121\u0123\u012b\u012e\u0133\u0140\u0142\u0145\u014c\u0152\u0158"+
		"\u015f\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}