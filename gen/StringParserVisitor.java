// Generated from /home/mrbig/Projects/compiler/grammar/StringParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StringParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StringParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StringParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(StringParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(StringParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(StringParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#param_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_def(StringParser.Param_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperators(StringParser.OperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(StringParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#if_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_instruction(StringParser.If_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#then_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_block(StringParser.Then_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(StringParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#for_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_instruction(StringParser.For_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#while_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_instruction(StringParser.While_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#definition_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_instruction(StringParser.Definition_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#assign_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_instruction(StringParser.Assign_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(StringParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#return_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_instruction(StringParser.Return_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(StringParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(StringParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#get_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_item(StringParser.Get_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#get_slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_slice(StringParser.Get_sliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#item_index1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_index1(StringParser.Item_index1Context ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#item_index2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_index2(StringParser.Item_index2Context ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(StringParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#len_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen_function(StringParser.Len_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(StringParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#logical_conj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_conj(StringParser.Logical_conjContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#logical_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_factor(StringParser.Logical_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(StringParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(StringParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(StringParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(StringParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(StringParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(StringParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(StringParser.ArrayContext ctx);
}