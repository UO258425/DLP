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
		ID=6, REAL_CONSTANT=7, INT_CONSTANT=8, CHAR_CONSTANT=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHITE_SPACE", "NEW_LINE", "TAB", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
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
			null, "WHITE_SPACE", "NEW_LINE", "TAB", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\3\6\3$\n"+
		"\3\r\3\16\3%\3\3\3\3\3\4\6\4+\n\4\r\4\16\4,\3\4\3\4\3\5\3\5\3\5\3\5\7"+
		"\5\65\n\5\f\5\16\58\13\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\7\6A\n\6\f\6\16"+
		"\6D\13\6\3\6\3\6\3\6\3\7\3\7\5\7K\n\7\3\7\3\7\3\7\7\7P\n\7\f\7\16\7S\13"+
		"\7\3\b\3\b\3\b\5\bX\n\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\7\tb\n\t\f\t"+
		"\16\te\13\t\5\tg\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\nt"+
		"\n\n\r\n\16\nu\5\nx\n\n\3\n\5\n{\n\n\3\13\3\13\3\f\6\f\u0080\n\f\r\f\16"+
		"\f\u0081\3\f\3\f\7\f\u0086\n\f\f\f\16\f\u0089\13\f\3\f\7\f\u008c\n\f\f"+
		"\f\16\f\u008f\13\f\3\f\3\f\6\f\u0093\n\f\r\f\16\f\u0094\5\f\u0097\n\f"+
		"\3\r\3\r\4\66B\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2"+
		"\31\2\3\2\n\4\2\f\f\17\17\3\3\f\f\4\2GGgg\3\2\63;\3\2\62;\4\2/\60\u0080"+
		"\u0080\4\2ppvv\4\2C\\c|\2\u00ac\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\3\34\3\2\2\2\5#\3\2\2\2\7*\3\2\2\2\t\60\3\2\2\2\13<\3\2\2\2\rJ\3"+
		"\2\2\2\17\\\3\2\2\2\21f\3\2\2\2\23z\3\2\2\2\25|\3\2\2\2\27\u0096\3\2\2"+
		"\2\31\u0098\3\2\2\2\33\35\7\"\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3"+
		"\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\b\2\2\2!\4\3\2\2\2\"$\t\2\2\2#\"\3"+
		"\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\b\3\2\2(\6\3\2\2\2"+
		")+\7\13\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\b\4\2"+
		"\2/\b\3\2\2\2\60\61\7\61\2\2\61\62\7\61\2\2\62\66\3\2\2\2\63\65\13\2\2"+
		"\2\64\63\3\2\2\2\658\3\2\2\2\66\67\3\2\2\2\66\64\3\2\2\2\67:\3\2\2\28"+
		"\66\3\2\2\29;\t\3\2\2:9\3\2\2\2;\n\3\2\2\2<=\7\61\2\2=>\7,\2\2>B\3\2\2"+
		"\2?A\13\2\2\2@?\3\2\2\2AD\3\2\2\2BC\3\2\2\2B@\3\2\2\2CE\3\2\2\2DB\3\2"+
		"\2\2EF\7,\2\2FG\7\61\2\2G\f\3\2\2\2HK\5\25\13\2IK\7a\2\2JH\3\2\2\2JI\3"+
		"\2\2\2KQ\3\2\2\2LP\5\25\13\2MP\7a\2\2NP\5\31\r\2OL\3\2\2\2OM\3\2\2\2O"+
		"N\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\16\3\2\2\2SQ\3\2\2\2TU\5\27\f"+
		"\2UW\t\4\2\2VX\7/\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\5\21\t\2Z]\3\2\2"+
		"\2[]\5\27\f\2\\T\3\2\2\2\\[\3\2\2\2]\20\3\2\2\2^g\7\62\2\2_c\t\5\2\2`"+
		"b\t\6\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2"+
		"f^\3\2\2\2f_\3\2\2\2g\22\3\2\2\2hi\7)\2\2ij\5\25\13\2jk\7)\2\2k{\3\2\2"+
		"\2lm\7)\2\2mn\t\7\2\2n{\7)\2\2op\7)\2\2pw\7^\2\2qx\t\b\2\2rt\5\21\t\2"+
		"sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wq\3\2\2\2ws\3\2\2\2"+
		"xy\3\2\2\2y{\7)\2\2zh\3\2\2\2zl\3\2\2\2zo\3\2\2\2{\24\3\2\2\2|}\t\t\2"+
		"\2}\26\3\2\2\2~\u0080\5\21\t\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0087\7\60"+
		"\2\2\u0084\u0086\5\31\r\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0097\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u008a\u008c\5\21\t\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u0090\u0092\7\60\2\2\u0091\u0093\5\31\r\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\177\3\2\2\2\u0096\u008d\3\2\2\2\u0097\30\3\2\2\2\u0098\u0099"+
		"\t\6\2\2\u0099\32\3\2\2\2\30\2\36%,\66:BJOQW\\cfuwz\u0081\u0087\u008d"+
		"\u0094\u0096\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}