// Generated from chahan/ArduinoDSL.g4 by ANTLR 4.9.2
package chahan;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArduinoDSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PORT_NUMBER=11, NUMBER=12, SIGNAL=13, ID=14, EQ=15, LCURLY=16, 
		RCURLY=17, NEWLINE=18, WS=19, COMMENT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "PORT_NUMBER", "NUMBER", "SIGNAL", "ID", "EQ", "LCURLY", "RCURLY", 
			"NEWLINE", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'alarm'", "'sensor'", "'at'", "'<='", "'=>'", "'after'", "'is'", 
			"'AND'", "'OR'", "'->'", null, null, null, null, "'='", "'{'", "'}'", 
			null, null, "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "PORT_NUMBER", 
			"NUMBER", "SIGNAL", "ID", "EQ", "LCURLY", "RCURLY", "NEWLINE", "WS", 
			"COMMENT"
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


	public ArduinoDSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArduinoDSL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\\\n\f\3\r\6\r_\n\r\r\r\16\r`\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16j\n\16\3\17\3\17\7\17n\n\17\f\17\16\17q\13\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\5\23z\n\23\3\23\3\23\6\23~\n\23\r"+
		"\23\16\23\177\3\23\3\23\3\24\6\24\u0085\n\24\r\24\16\24\u0086\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\7\3\2\63"+
		";\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\4\2\13\13\"\"\2\u0098\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\61\3\2\2\2\78\3\2\2\2\t;\3\2\2\2"+
		"\13>\3\2\2\2\rA\3\2\2\2\17G\3\2\2\2\21J\3\2\2\2\23N\3\2\2\2\25Q\3\2\2"+
		"\2\27[\3\2\2\2\31^\3\2\2\2\33i\3\2\2\2\35k\3\2\2\2\37r\3\2\2\2!t\3\2\2"+
		"\2#v\3\2\2\2%}\3\2\2\2\'\u0084\3\2\2\2)\u008a\3\2\2\2+,\7c\2\2,-\7n\2"+
		"\2-.\7c\2\2./\7t\2\2/\60\7o\2\2\60\4\3\2\2\2\61\62\7u\2\2\62\63\7g\2\2"+
		"\63\64\7p\2\2\64\65\7u\2\2\65\66\7q\2\2\66\67\7t\2\2\67\6\3\2\2\289\7"+
		"c\2\29:\7v\2\2:\b\3\2\2\2;<\7>\2\2<=\7?\2\2=\n\3\2\2\2>?\7?\2\2?@\7@\2"+
		"\2@\f\3\2\2\2AB\7c\2\2BC\7h\2\2CD\7v\2\2DE\7g\2\2EF\7t\2\2F\16\3\2\2\2"+
		"GH\7k\2\2HI\7u\2\2I\20\3\2\2\2JK\7C\2\2KL\7P\2\2LM\7F\2\2M\22\3\2\2\2"+
		"NO\7Q\2\2OP\7T\2\2P\24\3\2\2\2QR\7/\2\2RS\7@\2\2S\26\3\2\2\2T\\\t\2\2"+
		"\2UV\7\63\2\2V\\\7\62\2\2WX\7\63\2\2X\\\7\63\2\2YZ\7\63\2\2Z\\\7\64\2"+
		"\2[T\3\2\2\2[U\3\2\2\2[W\3\2\2\2[Y\3\2\2\2\\\30\3\2\2\2]_\t\3\2\2^]\3"+
		"\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\32\3\2\2\2bc\7J\2\2cd\7K\2\2de\7"+
		"I\2\2ej\7J\2\2fg\7N\2\2gh\7Q\2\2hj\7Y\2\2ib\3\2\2\2if\3\2\2\2j\34\3\2"+
		"\2\2ko\t\4\2\2ln\t\5\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\36\3"+
		"\2\2\2qo\3\2\2\2rs\7?\2\2s \3\2\2\2tu\7}\2\2u\"\3\2\2\2vw\7\177\2\2w$"+
		"\3\2\2\2xz\7\17\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{~\7\f\2\2|~\7\17\2\2"+
		"}y\3\2\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\b\23\2\2\u0082&\3\2\2\2\u0083\u0085\t\6\2\2"+
		"\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\24\2\2\u0089(\3\2\2\2\u008a"+
		"\u008b\7\61\2\2\u008b\u008c\7\61\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b"+
		"\25\2\2\u008e*\3\2\2\2\13\2[`ioy}\177\u0086\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}