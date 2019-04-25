package by.bsuir.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StringGrammarParser}.
 */
public interface StringGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StringGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StringGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(StringGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(StringGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StringGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StringGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#digit_expression}.
	 * @param ctx the parse tree
	 */
	void enterDigit_expression(StringGrammarParser.Digit_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#digit_expression}.
	 * @param ctx the parse tree
	 */
	void exitDigit_expression(StringGrammarParser.Digit_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#intialize_char}.
	 * @param ctx the parse tree
	 */
	void enterIntialize_char(StringGrammarParser.Intialize_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#intialize_char}.
	 * @param ctx the parse tree
	 */
	void exitIntialize_char(StringGrammarParser.Intialize_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#initialize_string}.
	 * @param ctx the parse tree
	 */
	void enterInitialize_string(StringGrammarParser.Initialize_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#initialize_string}.
	 * @param ctx the parse tree
	 */
	void exitInitialize_string(StringGrammarParser.Initialize_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#initialize_string_array}.
	 * @param ctx the parse tree
	 */
	void enterInitialize_string_array(StringGrammarParser.Initialize_string_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#initialize_string_array}.
	 * @param ctx the parse tree
	 */
	void exitInitialize_string_array(StringGrammarParser.Initialize_string_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#global_assign_var}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_assign_var(StringGrammarParser.Global_assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#global_assign_var}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_assign_var(StringGrammarParser.Global_assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#global_assign_string}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_assign_string(StringGrammarParser.Global_assign_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#global_assign_string}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_assign_string(StringGrammarParser.Global_assign_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#global_assign_string_array}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_assign_string_array(StringGrammarParser.Global_assign_string_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#global_assign_string_array}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_assign_string_array(StringGrammarParser.Global_assign_string_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(StringGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(StringGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var_method_invocation(StringGrammarParser.Assign_var_method_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var_method_invocation(StringGrammarParser.Assign_var_method_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#assign_string}.
	 * @param ctx the parse tree
	 */
	void enterAssign_string(StringGrammarParser.Assign_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#assign_string}.
	 * @param ctx the parse tree
	 */
	void exitAssign_string(StringGrammarParser.Assign_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#assign_string_array}.
	 * @param ctx the parse tree
	 */
	void enterAssign_string_array(StringGrammarParser.Assign_string_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#assign_string_array}.
	 * @param ctx the parse tree
	 */
	void exitAssign_string_array(StringGrammarParser.Assign_string_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var(StringGrammarParser.Assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var(StringGrammarParser.Assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#operarions_with_string_array}.
	 * @param ctx the parse tree
	 */
	void enterOperarions_with_string_array(StringGrammarParser.Operarions_with_string_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#operarions_with_string_array}.
	 * @param ctx the parse tree
	 */
	void exitOperarions_with_string_array(StringGrammarParser.Operarions_with_string_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(StringGrammarParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(StringGrammarParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void enterSimple_compare(StringGrammarParser.Simple_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void exitSimple_compare(StringGrammarParser.Simple_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#multi_compare}.
	 * @param ctx the parse tree
	 */
	void enterMulti_compare(StringGrammarParser.Multi_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#multi_compare}.
	 * @param ctx the parse tree
	 */
	void exitMulti_compare(StringGrammarParser.Multi_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#while_cicle}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cicle(StringGrammarParser.While_cicleContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#while_cicle}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cicle(StringGrammarParser.While_cicleContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(StringGrammarParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(StringGrammarParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#for_each}.
	 * @param ctx the parse tree
	 */
	void enterFor_each(StringGrammarParser.For_eachContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#for_each}.
	 * @param ctx the parse tree
	 */
	void exitFor_each(StringGrammarParser.For_eachContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(StringGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(StringGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#type_1}.
	 * @param ctx the parse tree
	 */
	void enterType_1(StringGrammarParser.Type_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#type_1}.
	 * @param ctx the parse tree
	 */
	void exitType_1(StringGrammarParser.Type_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(StringGrammarParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(StringGrammarParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_return(StringGrammarParser.Subprogram_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_return(StringGrammarParser.Subprogram_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_non_return(StringGrammarParser.Subprogram_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_non_return(StringGrammarParser.Subprogram_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#block_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_return(StringGrammarParser.Block_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#block_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_return(StringGrammarParser.Block_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_non_return(StringGrammarParser.Block_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_non_return(StringGrammarParser.Block_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#signature_method_invokation}.
	 * @param ctx the parse tree
	 */
	void enterSignature_method_invokation(StringGrammarParser.Signature_method_invokationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#signature_method_invokation}.
	 * @param ctx the parse tree
	 */
	void exitSignature_method_invokation(StringGrammarParser.Signature_method_invokationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#method_invokation}.
	 * @param ctx the parse tree
	 */
	void enterMethod_invokation(StringGrammarParser.Method_invokationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#method_invokation}.
	 * @param ctx the parse tree
	 */
	void exitMethod_invokation(StringGrammarParser.Method_invokationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StringGrammarParser#global_program}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_program(StringGrammarParser.Global_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link StringGrammarParser#global_program}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_program(StringGrammarParser.Global_programContext ctx);
}