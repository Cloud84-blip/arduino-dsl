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
		PORT_NUMBER=10, NUMBER=11, SIGNAL=12, ID=13, COMMENT=14, WS=15, EQ=16, 
		LCURLY=17, RCURLY=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"PORT_NUMBER", "NUMBER", "SIGNAL", "ID", "COMMENT", "WS", "EQ", "LCURLY", 
			"RCURLY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'alarm'", "'sensor'", "'at'", "'<='", "'=>'", "'is'", "'AND'", 
			"'OR'", "'->'", null, null, null, null, null, null, "'='", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "PORT_NUMBER", 
			"NUMBER", "SIGNAL", "ID", "COMMENT", "WS", "EQ", "LCURLY", "RCURLY"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13R\n\13\3\f\6\f"+
		"U\n\f\r\f\16\fV\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r`\n\r\3\16\3\16\7\16d\n"+
		"\16\f\16\16\16g\13\16\3\17\3\17\3\17\3\17\7\17m\n\17\f\17\16\17p\13\17"+
		"\3\17\3\17\3\20\6\20u\n\20\r\20\16\20v\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\3\2\b\3\2\63;\3\2\62;\4\2C\\c|\6\2\62"+
		";C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0087\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3"+
		"\2\2\2\5-\3\2\2\2\7\64\3\2\2\2\t\67\3\2\2\2\13:\3\2\2\2\r=\3\2\2\2\17"+
		"@\3\2\2\2\21D\3\2\2\2\23G\3\2\2\2\25Q\3\2\2\2\27T\3\2\2\2\31_\3\2\2\2"+
		"\33a\3\2\2\2\35h\3\2\2\2\37t\3\2\2\2!z\3\2\2\2#|\3\2\2\2%~\3\2\2\2\'("+
		"\7c\2\2()\7n\2\2)*\7c\2\2*+\7t\2\2+,\7o\2\2,\4\3\2\2\2-.\7u\2\2./\7g\2"+
		"\2/\60\7p\2\2\60\61\7u\2\2\61\62\7q\2\2\62\63\7t\2\2\63\6\3\2\2\2\64\65"+
		"\7c\2\2\65\66\7v\2\2\66\b\3\2\2\2\678\7>\2\289\7?\2\29\n\3\2\2\2:;\7?"+
		"\2\2;<\7@\2\2<\f\3\2\2\2=>\7k\2\2>?\7u\2\2?\16\3\2\2\2@A\7C\2\2AB\7P\2"+
		"\2BC\7F\2\2C\20\3\2\2\2DE\7Q\2\2EF\7T\2\2F\22\3\2\2\2GH\7/\2\2HI\7@\2"+
		"\2I\24\3\2\2\2JR\t\2\2\2KL\7\63\2\2LR\7\62\2\2MN\7\63\2\2NR\7\63\2\2O"+
		"P\7\63\2\2PR\7\64\2\2QJ\3\2\2\2QK\3\2\2\2QM\3\2\2\2QO\3\2\2\2R\26\3\2"+
		"\2\2SU\t\3\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\30\3\2\2\2XY\7"+
		"J\2\2YZ\7K\2\2Z[\7I\2\2[`\7J\2\2\\]\7N\2\2]^\7Q\2\2^`\7Y\2\2_X\3\2\2\2"+
		"_\\\3\2\2\2`\32\3\2\2\2ae\t\4\2\2bd\t\5\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2"+
		"\2\2ef\3\2\2\2f\34\3\2\2\2ge\3\2\2\2hi\7\61\2\2ij\7\61\2\2jn\3\2\2\2k"+
		"m\n\6\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2"+
		"qr\b\17\2\2r\36\3\2\2\2su\t\7\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2"+
		"\2\2wx\3\2\2\2xy\b\20\2\2y \3\2\2\2z{\7?\2\2{\"\3\2\2\2|}\7}\2\2}$\3\2"+
		"\2\2~\177\7\177\2\2\177&\3\2\2\2\t\2QV_env\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}