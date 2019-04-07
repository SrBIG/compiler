// Generated from /home/mrbig/Projects/compiler/grammar/StringParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StringParser}.
 */
public interface StringParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StringParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StringParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StringParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(StringParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(StringParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(StringParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(StringParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#param_def}.
	 * @param ctx the parse tree
	 */
	void enterParam_def(StringParser.Param_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#param_def}.
	 * @param ctx the parse tree
	 */
	void exitParam_def(StringParser.Param_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(StringParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(StringParser.OperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(StringParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(StringParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#if_instruction}.
	 * @param ctx the parse tree
	 */
	void enterIf_instruction(StringParser.If_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#if_instruction}.
	 * @param ctx the parse tree
	 */
	void exitIf_instruction(StringParser.If_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#then_block}.
	 * @param ctx the parse tree
	 */
	void enterThen_block(StringParser.Then_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#then_block}.
	 * @param ctx the parse tree
	 */
	void exitThen_block(StringParser.Then_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(StringParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(StringParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#for_instruction}.
	 * @param ctx the parse tree
	 */
	void enterFor_instruction(StringParser.For_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#for_instruction}.
	 * @param ctx the parse tree
	 */
	void exitFor_instruction(StringParser.For_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#while_instruction}.
	 * @param ctx the parse tree
	 */
	void enterWhile_instruction(StringParser.While_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#while_instruction}.
	 * @param ctx the parse tree
	 */
	void exitWhile_instruction(StringParser.While_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#definition_instruction}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_instruction(StringParser.Definition_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#definition_instruction}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_instruction(StringParser.Definition_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#assign_instruction}.
	 * @param ctx the parse tree
	 */
	void enterAssign_instruction(StringParser.Assign_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#assign_instruction}.
	 * @param ctx the parse tree
	 */
	void exitAssign_instruction(StringParser.Assign_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(StringParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(StringParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#return_instruction}.
	 * @param ctx the parse tree
	 */
	void enterReturn_instruction(StringParser.Return_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#return_instruction}.
	 * @param ctx the parse tree
	 */
	void exitReturn_instruction(StringParser.Return_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(StringParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(StringParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(StringParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(StringParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#get_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_item(StringParser.Get_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#get_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_item(StringParser.Get_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#get_slice}.
	 * @param ctx the parse tree
	 */
	void enterGet_slice(StringParser.Get_sliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#get_slice}.
	 * @param ctx the parse tree
	 */
	void exitGet_slice(StringParser.Get_sliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#item_index1}.
	 * @param ctx the parse tree
	 */
	void enterItem_index1(StringParser.Item_index1Context ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#item_index1}.
	 * @param ctx the parse tree
	 */
	void exitItem_index1(StringParser.Item_index1Context ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#item_index2}.
	 * @param ctx the parse tree
	 */
	void enterItem_index2(StringParser.Item_index2Context ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#item_index2}.
	 * @param ctx the parse tree
	 */
	void exitItem_index2(StringParser.Item_index2Context ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(StringParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(StringParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#len_function}.
	 * @param ctx the parse tree
	 */
	void enterLen_function(StringParser.Len_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#len_function}.
	 * @param ctx the parse tree
	 */
	void exitLen_function(StringParser.Len_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(StringParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(StringParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#logical_conj}.
	 * @param ctx the parse tree
	 */
	void enterLogical_conj(StringParser.Logical_conjContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#logical_conj}.
	 * @param ctx the parse tree
	 */
	void exitLogical_conj(StringParser.Logical_conjContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#logical_factor}.
	 * @param ctx the parse tree
	 */
	void enterLogical_factor(StringParser.Logical_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#logical_factor}.
	 * @param ctx the parse tree
	 */
	void exitLogical_factor(StringParser.Logical_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(StringParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(StringParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(StringParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(StringParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(StringParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(StringParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(StringParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(StringParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(StringParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(StringParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(StringParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(StringParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(StringParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(StringParser.ArrayContext ctx);
}