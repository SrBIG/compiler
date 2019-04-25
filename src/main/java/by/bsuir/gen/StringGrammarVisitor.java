package by.bsuir.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StringGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StringGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(StringGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(StringGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StringGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#digit_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit_expression(StringGrammarParser.Digit_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#intialize_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntialize_char(StringGrammarParser.Intialize_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#initialize_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialize_string(StringGrammarParser.Initialize_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#initialize_string_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialize_string_array(StringGrammarParser.Initialize_string_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#global_assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_assign_var(StringGrammarParser.Global_assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#global_assign_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_assign_string(StringGrammarParser.Global_assign_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#global_assign_string_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_assign_string_array(StringGrammarParser.Global_assign_string_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(StringGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var_method_invocation(StringGrammarParser.Assign_var_method_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#assign_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_string(StringGrammarParser.Assign_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#assign_string_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_string_array(StringGrammarParser.Assign_string_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(StringGrammarParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#operarions_with_string_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperarions_with_string_array(StringGrammarParser.Operarions_with_string_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(StringGrammarParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#simple_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_compare(StringGrammarParser.Simple_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#multi_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_compare(StringGrammarParser.Multi_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#while_cicle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_cicle(StringGrammarParser.While_cicleContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(StringGrammarParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each(StringGrammarParser.For_eachContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(StringGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#type_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_1(StringGrammarParser.Type_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(StringGrammarParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#subprogram_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_return(StringGrammarParser.Subprogram_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_non_return(StringGrammarParser.Subprogram_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#block_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_return(StringGrammarParser.Block_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#block_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_non_return(StringGrammarParser.Block_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#signature_method_invokation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature_method_invokation(StringGrammarParser.Signature_method_invokationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#method_invokation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_invokation(StringGrammarParser.Method_invokationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StringGrammarParser#global_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_program(StringGrammarParser.Global_programContext ctx);

}