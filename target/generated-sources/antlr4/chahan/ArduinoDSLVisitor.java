// Generated from chahan/ArduinoDSL.g4 by ANTLR 4.9.2
package chahan;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArduinoDSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArduinoDSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(ArduinoDSLParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#components}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponents(ArduinoDSLParser.ComponentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#alarm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlarm(ArduinoDSLParser.AlarmContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#sensor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensor(ArduinoDSLParser.SensorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(ArduinoDSLParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#states}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStates(ArduinoDSLParser.StatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(ArduinoDSLParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(ArduinoDSLParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(ArduinoDSLParser.TransitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(ArduinoDSLParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ArduinoDSLParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#logicalOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOP(ArduinoDSLParser.LogicalOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial(ArduinoDSLParser.InitialContext ctx);
}