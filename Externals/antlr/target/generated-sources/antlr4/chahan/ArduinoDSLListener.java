// Generated from chahan/ArduinoDSL.g4 by ANTLR 4.9.2
package chahan;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArduinoDSLParser}.
 */
public interface ArduinoDSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(ArduinoDSLParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(ArduinoDSLParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#components}.
	 * @param ctx the parse tree
	 */
	void enterComponents(ArduinoDSLParser.ComponentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#components}.
	 * @param ctx the parse tree
	 */
	void exitComponents(ArduinoDSLParser.ComponentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#alarm}.
	 * @param ctx the parse tree
	 */
	void enterAlarm(ArduinoDSLParser.AlarmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#alarm}.
	 * @param ctx the parse tree
	 */
	void exitAlarm(ArduinoDSLParser.AlarmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#sensor}.
	 * @param ctx the parse tree
	 */
	void enterSensor(ArduinoDSLParser.SensorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#sensor}.
	 * @param ctx the parse tree
	 */
	void exitSensor(ArduinoDSLParser.SensorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(ArduinoDSLParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(ArduinoDSLParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#states}.
	 * @param ctx the parse tree
	 */
	void enterStates(ArduinoDSLParser.StatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#states}.
	 * @param ctx the parse tree
	 */
	void exitStates(ArduinoDSLParser.StatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(ArduinoDSLParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(ArduinoDSLParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(ArduinoDSLParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(ArduinoDSLParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(ArduinoDSLParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(ArduinoDSLParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#temporal}.
	 * @param ctx the parse tree
	 */
	void enterTemporal(ArduinoDSLParser.TemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#temporal}.
	 * @param ctx the parse tree
	 */
	void exitTemporal(ArduinoDSLParser.TemporalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(ArduinoDSLParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(ArduinoDSLParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ArduinoDSLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ArduinoDSLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#logicalOP}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOP(ArduinoDSLParser.LogicalOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#logicalOP}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOP(ArduinoDSLParser.LogicalOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterInitial(ArduinoDSLParser.InitialContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitInitial(ArduinoDSLParser.InitialContext ctx);
}