// Generated from C:/Users/Carlos Manrique/IdeaProjects/DLP/src/parser\Cmm.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITE_SPACE=1, NEW_LINE=2, TAB=3, SINGLE_LINE_COMMENT=4, MULTILINE_COMMENT=5, 
		REAL_CONSTANT=6, ID=7, INT_CONSTANT=8, CHAR_CONSTANT=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHITE_SPACE", "NEW_LINE", "TAB", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
			"REAL_CONSTANT", "ID", "INT_CONSTANT", "CHAR_CONSTANT", "LETTER", "FIXED_POINT", 
			"DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u00a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\3\6\3$\n"+
		"\3\r\3\16\3%\3\3\3\3\3\4\6\4+\n\4\r\4\16\4,\3\4\3\4\3\5\3\5\3\5\3\5\7"+
		"\5\65\n\5\f\5\16\58\13\5\3\5\5\5;\n\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6C\n\6"+
		"\f\6\16\6F\13\6\3\6\3\6\3\6\5\6K\n\6\3\6\3\6\3\7\3\7\5\7Q\n\7\3\7\3\7"+
		"\5\7U\n\7\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\5\b^\n\b\3\b\3\b\3\b\7\bc\n\b\f"+
		"\b\16\bf\13\b\3\t\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\5\tp\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n}\n\n\r\n\16\n~\5\n\u0081\n\n\3\n"+
		"\5\n\u0084\n\n\3\13\3\13\3\f\6\f\u0089\n\f\r\f\16\f\u008a\3\f\3\f\7\f"+
		"\u008f\n\f\f\f\16\f\u0092\13\f\3\f\7\f\u0095\n\f\f\f\16\f\u0098\13\f\3"+
		"\f\3\f\6\f\u009c\n\f\r\f\16\f\u009d\5\f\u00a0\n\f\3\r\3\r\4\66D\2\16\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\2\3\2\n\4\2\f\f\17"+
		"\17\3\3\f\f\4\2GGgg\3\2\63;\3\2\62;\4\2/\60\u0080\u0080\4\2ppvv\4\2C\\"+
		"c|\2\u00b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\34\3\2\2\2\5#"+
		"\3\2\2\2\7*\3\2\2\2\t\60\3\2\2\2\13>\3\2\2\2\rY\3\2\2\2\17]\3\2\2\2\21"+
		"o\3\2\2\2\23\u0083\3\2\2\2\25\u0085\3\2\2\2\27\u009f\3\2\2\2\31\u00a1"+
		"\3\2\2\2\33\35\7\"\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37"+
		"\3\2\2\2\37 \3\2\2\2 !\b\2\2\2!\4\3\2\2\2\"$\t\2\2\2#\"\3\2\2\2$%\3\2"+
		"\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\b\3\2\2(\6\3\2\2\2)+\7\13\2\2*"+
		")\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\b\4\2\2/\b\3\2\2\2"+
		"\60\61\7\61\2\2\61\62\7\61\2\2\62\66\3\2\2\2\63\65\13\2\2\2\64\63\3\2"+
		"\2\2\658\3\2\2\2\66\67\3\2\2\2\66\64\3\2\2\2\67:\3\2\2\28\66\3\2\2\29"+
		";\t\3\2\2:9\3\2\2\2;<\3\2\2\2<=\b\5\2\2=\n\3\2\2\2>?\7\61\2\2?@\7,\2\2"+
		"@D\3\2\2\2AC\13\2\2\2BA\3\2\2\2CF\3\2\2\2DE\3\2\2\2DB\3\2\2\2EJ\3\2\2"+
		"\2FD\3\2\2\2GH\7,\2\2HK\7\61\2\2IK\7\2\2\3JG\3\2\2\2JI\3\2\2\2KL\3\2\2"+
		"\2LM\b\6\2\2M\f\3\2\2\2NQ\5\27\f\2OQ\5\21\t\2PN\3\2\2\2PO\3\2\2\2QR\3"+
		"\2\2\2RT\t\4\2\2SU\7/\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\5\21\t\2WZ\3"+
		"\2\2\2XZ\5\27\f\2YP\3\2\2\2YX\3\2\2\2Z\16\3\2\2\2[^\5\25\13\2\\^\7a\2"+
		"\2][\3\2\2\2]\\\3\2\2\2^d\3\2\2\2_c\5\25\13\2`c\7a\2\2ac\5\31\r\2b_\3"+
		"\2\2\2b`\3\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\20\3\2\2\2f"+
		"d\3\2\2\2gp\7\62\2\2hl\t\5\2\2ik\t\6\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2"+
		"lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2og\3\2\2\2oh\3\2\2\2p\22\3\2\2\2qr\7)\2"+
		"\2rs\5\25\13\2st\7)\2\2t\u0084\3\2\2\2uv\7)\2\2vw\t\7\2\2w\u0084\7)\2"+
		"\2xy\7)\2\2y\u0080\7^\2\2z\u0081\t\b\2\2{}\5\21\t\2|{\3\2\2\2}~\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080z\3\2\2\2\u0080|\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0084\7)\2\2\u0083q\3\2\2\2\u0083u\3\2"+
		"\2\2\u0083x\3\2\2\2\u0084\24\3\2\2\2\u0085\u0086\t\t\2\2\u0086\26\3\2"+
		"\2\2\u0087\u0089\5\21\t\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0090\7\60"+
		"\2\2\u008d\u008f\5\31\r\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u00a0\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0095\5\21\t\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009b\7\60\2\2\u009a\u009c\5\31\r\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u0088\3\2\2\2\u009f\u0096\3\2\2\2\u00a0\30\3\2\2\2\u00a1\u00a2"+
		"\t\6\2\2\u00a2\32\3\2\2\2\32\2\36%,\66:DJPTY]bdlo~\u0080\u0083\u008a\u0090"+
		"\u0096\u009d\u009f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}