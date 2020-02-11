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
		WHITE_SPACE=1, NEW_LINE=2, TAB=3, MULTILINE_COMMENT=4, SINGLE_LINE_COMMENT=5, 
		ID=6, REAL_CONSTANT=7, INT_CONSTANT=8, CHAR_CONSTANT=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHITE_SPACE", "NEW_LINE", "TAB", "MULTILINE_COMMENT", "SINGLE_LINE_COMMENT", 
			"ID", "REAL_CONSTANT", "INT_CONSTANT", "CHAR_CONSTANT", "LETTER", "FIXED_POINT", 
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
			null, "WHITE_SPACE", "NEW_LINE", "TAB", "MULTILINE_COMMENT", "SINGLE_LINE_COMMENT", 
			"ID", "REAL_CONSTANT", "INT_CONSTANT", "CHAR_CONSTANT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\3\6\3$\n"+
		"\3\r\3\16\3%\3\3\3\3\3\4\6\4+\n\4\r\4\16\4,\3\4\3\4\3\5\3\5\3\5\3\5\7"+
		"\5\65\n\5\f\5\16\58\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5"+
		"\6E\n\6\3\7\3\7\5\7I\n\7\3\7\3\7\3\7\7\7N\n\7\f\7\16\7Q\13\7\3\b\3\b\3"+
		"\b\5\bV\n\b\3\b\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\7\t`\n\t\f\t\16\tc\13\t\5"+
		"\te\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\nr\n\n\r\n\16\n"+
		"s\5\nv\n\n\3\n\5\ny\n\n\3\13\3\13\3\f\6\f~\n\f\r\f\16\f\177\3\f\3\f\7"+
		"\f\u0084\n\f\f\f\16\f\u0087\13\f\3\f\7\f\u008a\n\f\f\f\16\f\u008d\13\f"+
		"\3\f\3\f\6\f\u0091\n\f\r\f\16\f\u0092\5\f\u0095\n\f\3\r\3\r\3\66\2\16"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\2\3\2\n\4\2\f\f"+
		"\17\17\3\3\f\f\4\2GGgg\3\2\63;\3\2\62;\4\2/\60\u0080\u0080\4\2ppvv\4\2"+
		"C\\c|\2\u00a9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\34\3\2\2\2\5"+
		"#\3\2\2\2\7*\3\2\2\2\t\60\3\2\2\2\13?\3\2\2\2\rH\3\2\2\2\17Z\3\2\2\2\21"+
		"d\3\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27\u0094\3\2\2\2\31\u0096\3\2\2\2\33"+
		"\35\7\"\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37"+
		" \3\2\2\2 !\b\2\2\2!\4\3\2\2\2\"$\t\2\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2"+
		"\2%&\3\2\2\2&\'\3\2\2\2\'(\b\3\2\2(\6\3\2\2\2)+\7\13\2\2*)\3\2\2\2+,\3"+
		"\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\b\4\2\2/\b\3\2\2\2\60\61\7\61\2"+
		"\2\61\62\7,\2\2\62\66\3\2\2\2\63\65\13\2\2\2\64\63\3\2\2\2\658\3\2\2\2"+
		"\66\67\3\2\2\2\66\64\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7,\2\2:;\7\61\2"+
		"\2;<\3\2\2\2<=\7,\2\2=>\7\61\2\2>\n\3\2\2\2?@\7\61\2\2@A\7\61\2\2AB\3"+
		"\2\2\2BD\13\2\2\2CE\t\3\2\2DC\3\2\2\2E\f\3\2\2\2FI\5\25\13\2GI\7a\2\2"+
		"HF\3\2\2\2HG\3\2\2\2IO\3\2\2\2JN\5\25\13\2KN\7a\2\2LN\5\31\r\2MJ\3\2\2"+
		"\2MK\3\2\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\16\3\2\2\2QO\3\2"+
		"\2\2RS\5\27\f\2SU\t\4\2\2TV\7/\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\5\21"+
		"\t\2X[\3\2\2\2Y[\5\27\f\2ZR\3\2\2\2ZY\3\2\2\2[\20\3\2\2\2\\e\7\62\2\2"+
		"]a\t\5\2\2^`\t\6\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2"+
		"ca\3\2\2\2d\\\3\2\2\2d]\3\2\2\2e\22\3\2\2\2fg\7)\2\2gh\5\25\13\2hi\7)"+
		"\2\2iy\3\2\2\2jk\7)\2\2kl\t\7\2\2ly\7)\2\2mn\7)\2\2nu\7^\2\2ov\t\b\2\2"+
		"pr\5\21\t\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2uo\3\2\2"+
		"\2uq\3\2\2\2vw\3\2\2\2wy\7)\2\2xf\3\2\2\2xj\3\2\2\2xm\3\2\2\2y\24\3\2"+
		"\2\2z{\t\t\2\2{\26\3\2\2\2|~\5\21\t\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0085\7\60\2\2\u0082"+
		"\u0084\5\31\r\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0095\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u008a\5\21\t\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0090\7\60\2\2\u008f\u0091\5\31\r\2\u0090\u008f\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"}\3\2\2\2\u0094\u008b\3\2\2\2\u0095\30\3\2\2\2\u0096\u0097\t\6\2\2\u0097"+
		"\32\3\2\2\2\27\2\36%,\66DHMOUZadsux\177\u0085\u008b\u0092\u0094\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}