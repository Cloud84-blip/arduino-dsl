// Generated from chahan/ArduinoDSL.g4 by ANTLR 4.9.2
package chahan;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArduinoDSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PORT_NUMBER=11, NUMBER=12, SIGNAL=13, ID=14, EQ=15, LCURLY=16, 
		RCURLY=17, NEWLINE=18, WS=19, COMMENT=20;
	public static final int
		RULE_root = 0, RULE_components = 1, RULE_alarm = 2, RULE_sensor = 3, RULE_location = 4, 
		RULE_states = 5, RULE_state = 6, RULE_action = 7, RULE_transition = 8, 
		RULE_temporal = 9, RULE_conditions = 10, RULE_condition = 11, RULE_logicalOP = 12, 
		RULE_initial = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "components", "alarm", "sensor", "location", "states", "state", 
			"action", "transition", "temporal", "conditions", "condition", "logicalOP", 
			"initial"
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

	@Override
	public String getGrammarFileName() { return "ArduinoDSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArduinoDSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public ComponentsContext components() {
			return getRuleContext(ComponentsContext.class,0);
		}
		public StatesContext states() {
			return getRuleContext(StatesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ArduinoDSLParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			components();
			setState(29);
			states();
			setState(30);
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

	public static class ComponentsContext extends ParserRuleContext {
		public List<AlarmContext> alarm() {
			return getRuleContexts(AlarmContext.class);
		}
		public AlarmContext alarm(int i) {
			return getRuleContext(AlarmContext.class,i);
		}
		public List<SensorContext> sensor() {
			return getRuleContexts(SensorContext.class);
		}
		public SensorContext sensor(int i) {
			return getRuleContext(SensorContext.class,i);
		}
		public ComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_components; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterComponents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitComponents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitComponents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentsContext components() throws RecognitionException {
		ComponentsContext _localctx = new ComponentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_components);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(32);
					alarm();
					}
					break;
				case T__1:
					{
					setState(33);
					sensor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(38);
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

	public static class AlarmContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public AlarmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alarm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterAlarm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitAlarm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitAlarm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlarmContext alarm() throws RecognitionException {
		AlarmContext _localctx = new AlarmContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alarm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			location();
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

	public static class SensorContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public SensorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterSensor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitSensor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitSensor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SensorContext sensor() throws RecognitionException {
		SensorContext _localctx = new SensorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sensor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__1);
			setState(43);
			location();
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

	public static class LocationContext extends ParserRuleContext {
		public Token name;
		public Token pin;
		public TerminalNode ID() { return getToken(ArduinoDSLParser.ID, 0); }
		public TerminalNode PORT_NUMBER() { return getToken(ArduinoDSLParser.PORT_NUMBER, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((LocationContext)_localctx).name = match(ID);
			setState(46);
			match(T__2);
			setState(47);
			((LocationContext)_localctx).pin = match(PORT_NUMBER);
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

	public static class StatesContext extends ParserRuleContext {
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public StatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_states; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterStates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitStates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitStates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatesContext states() throws RecognitionException {
		StatesContext _localctx = new StatesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_states);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				state();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 || _la==ID );
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

	public static class StateContext extends ParserRuleContext {
		public Token stateName;
		public TerminalNode LCURLY() { return getToken(ArduinoDSLParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ArduinoDSLParser.RCURLY, 0); }
		public TerminalNode ID() { return getToken(ArduinoDSLParser.ID, 0); }
		public InitialContext initial() {
			return getRuleContext(InitialContext.class,0);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public List<TemporalContext> temporal() {
			return getRuleContexts(TemporalContext.class);
		}
		public TemporalContext temporal(int i) {
			return getRuleContext(TemporalContext.class,i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_state);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(54);
				initial();
				}
			}

			setState(57);
			((StateContext)_localctx).stateName = match(ID);
			setState(58);
			match(LCURLY);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					action();
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==ID) {
				{
				setState(67);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(65);
					transition();
					}
					break;
				case T__5:
					{
					setState(66);
					temporal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(RCURLY);
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

	public static class ActionContext extends ParserRuleContext {
		public Token receiver;
		public Token value;
		public TerminalNode ID() { return getToken(ArduinoDSLParser.ID, 0); }
		public TerminalNode SIGNAL() { return getToken(ArduinoDSLParser.SIGNAL, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			((ActionContext)_localctx).receiver = match(ID);
			setState(75);
			match(T__3);
			setState(76);
			((ActionContext)_localctx).value = match(SIGNAL);
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

	public static class TransitionContext extends ParserRuleContext {
		public Token next;
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode ID() { return getToken(ArduinoDSLParser.ID, 0); }
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			conditions();
			setState(79);
			match(T__4);
			setState(80);
			((TransitionContext)_localctx).next = match(ID);
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

	public static class TemporalContext extends ParserRuleContext {
		public Token time;
		public Token next;
		public TerminalNode NUMBER() { return getToken(ArduinoDSLParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(ArduinoDSLParser.ID, 0); }
		public TemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemporalContext temporal() throws RecognitionException {
		TemporalContext _localctx = new TemporalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_temporal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__5);
			setState(83);
			((TemporalContext)_localctx).time = match(NUMBER);
			setState(84);
			match(T__4);
			setState(85);
			((TemporalContext)_localctx).next = match(ID);
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

	public static class ConditionsContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public LogicalOPContext logicalOP() {
			return getRuleContext(LogicalOPContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			condition();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==T__8) {
				{
				setState(88);
				logicalOP();
				setState(89);
				condition();
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

	public static class ConditionContext extends ParserRuleContext {
		public Token trigger;
		public Token value;
		public TerminalNode ID() { return getToken(ArduinoDSLParser.ID, 0); }
		public TerminalNode SIGNAL() { return getToken(ArduinoDSLParser.SIGNAL, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((ConditionContext)_localctx).trigger = match(ID);
			setState(94);
			match(T__6);
			setState(95);
			((ConditionContext)_localctx).value = match(SIGNAL);
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

	public static class LogicalOPContext extends ParserRuleContext {
		public LogicalOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterLogicalOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitLogicalOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitLogicalOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOPContext logicalOP() throws RecognitionException {
		LogicalOPContext _localctx = new LogicalOPContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logicalOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
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

	public static class InitialContext extends ParserRuleContext {
		public InitialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterInitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitInitial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitInitial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialContext initial() throws RecognitionException {
		InitialContext _localctx = new InitialContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__9);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\7\3%\n\3\f"+
		"\3\16\3(\13\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\6\7\65\n\7\r"+
		"\7\16\7\66\3\b\5\b:\n\b\3\b\3\b\3\b\7\b?\n\b\f\b\16\bB\13\b\3\b\3\b\7"+
		"\bF\n\b\f\b\16\bI\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f^\n\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3\2\n\13"+
		"\2a\2\36\3\2\2\2\4&\3\2\2\2\6)\3\2\2\2\b,\3\2\2\2\n/\3\2\2\2\f\64\3\2"+
		"\2\2\169\3\2\2\2\20L\3\2\2\2\22P\3\2\2\2\24T\3\2\2\2\26Y\3\2\2\2\30_\3"+
		"\2\2\2\32c\3\2\2\2\34e\3\2\2\2\36\37\5\4\3\2\37 \5\f\7\2 !\7\2\2\3!\3"+
		"\3\2\2\2\"%\5\6\4\2#%\5\b\5\2$\"\3\2\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2"+
		"&\'\3\2\2\2\'\5\3\2\2\2(&\3\2\2\2)*\7\3\2\2*+\5\n\6\2+\7\3\2\2\2,-\7\4"+
		"\2\2-.\5\n\6\2.\t\3\2\2\2/\60\7\20\2\2\60\61\7\5\2\2\61\62\7\r\2\2\62"+
		"\13\3\2\2\2\63\65\5\16\b\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\67\r\3\2\2\28:\5\34\17\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7"+
		"\20\2\2<@\7\22\2\2=?\5\20\t\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2"+
		"AG\3\2\2\2B@\3\2\2\2CF\5\22\n\2DF\5\24\13\2EC\3\2\2\2ED\3\2\2\2FI\3\2"+
		"\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\23\2\2K\17\3\2\2\2LM"+
		"\7\20\2\2MN\7\6\2\2NO\7\17\2\2O\21\3\2\2\2PQ\5\26\f\2QR\7\7\2\2RS\7\20"+
		"\2\2S\23\3\2\2\2TU\7\b\2\2UV\7\16\2\2VW\7\7\2\2WX\7\20\2\2X\25\3\2\2\2"+
		"Y]\5\30\r\2Z[\5\32\16\2[\\\5\30\r\2\\^\3\2\2\2]Z\3\2\2\2]^\3\2\2\2^\27"+
		"\3\2\2\2_`\7\20\2\2`a\7\t\2\2ab\7\17\2\2b\31\3\2\2\2cd\t\2\2\2d\33\3\2"+
		"\2\2ef\7\f\2\2f\35\3\2\2\2\n$&\669@EG]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}