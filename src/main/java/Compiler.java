public class Compiler extends StringParserBaseVisitor<String> {
    @Override
    public String visitProgram(StringParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public String visitExpression(StringParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public String visitFunction(StringParser.FunctionContext ctx) {
        return super.visitFunction(ctx);
    }

    @Override
    public String visitParam_def(StringParser.Param_defContext ctx) {
        return super.visitParam_def(ctx);
    }

    @Override
    public String visitOperators(StringParser.OperatorsContext ctx) {
        return super.visitOperators(ctx);
    }

    @Override
    public String visitInstruction(StringParser.InstructionContext ctx) {
        return super.visitInstruction(ctx);
    }

    @Override
    public String visitIf_instruction(StringParser.If_instructionContext ctx) {
        return super.visitIf_instruction(ctx);
    }

    @Override
    public String visitThen_block(StringParser.Then_blockContext ctx) {
        return super.visitThen_block(ctx);
    }

    @Override
    public String visitElse_block(StringParser.Else_blockContext ctx) {
        return super.visitElse_block(ctx);
    }

    @Override
    public String visitFor_instruction(StringParser.For_instructionContext ctx) {
        return super.visitFor_instruction(ctx);
    }

    @Override
    public String visitWhile_instruction(StringParser.While_instructionContext ctx) {
        return super.visitWhile_instruction(ctx);
    }

    @Override
    public String visitDefinition_instruction(StringParser.Definition_instructionContext ctx) {
        return super.visitDefinition_instruction(ctx);
    }

    @Override
    public String visitAssign_instruction(StringParser.Assign_instructionContext ctx) {
        return super.visitAssign_instruction(ctx);
    }

    @Override
    public String visitPrint(StringParser.PrintContext ctx) {
        return super.visitPrint(ctx);
    }

    @Override
    public String visitReturn_instruction(StringParser.Return_instructionContext ctx) {
        return super.visitReturn_instruction(ctx);
    }

    @Override
    public String visitOperation(StringParser.OperationContext ctx) {
        return super.visitOperation(ctx);
    }

    @Override
    public String visitFunction_call(StringParser.Function_callContext ctx) {
        return super.visitFunction_call(ctx);
    }

    @Override
    public String visitGet_item(StringParser.Get_itemContext ctx) {
        return super.visitGet_item(ctx);
    }

    @Override
    public String visitGet_slice(StringParser.Get_sliceContext ctx) {
        return super.visitGet_slice(ctx);
    }

    @Override
    public String visitItem_index1(StringParser.Item_index1Context ctx) {
        return super.visitItem_index1(ctx);
    }

    @Override
    public String visitItem_index2(StringParser.Item_index2Context ctx) {
        return super.visitItem_index2(ctx);
    }

    @Override
    public String visitParam_list(StringParser.Param_listContext ctx) {
        return super.visitParam_list(ctx);
    }

    @Override
    public String visitLen_function(StringParser.Len_functionContext ctx) {
        return super.visitLen_function(ctx);
    }

    @Override
    public String visitCondition(StringParser.ConditionContext ctx) {
        return super.visitCondition(ctx);
    }

    @Override
    public String visitLogical_conj(StringParser.Logical_conjContext ctx) {
        return super.visitLogical_conj(ctx);
    }

    @Override
    public String visitLogical_factor(StringParser.Logical_factorContext ctx) {
        return super.visitLogical_factor(ctx);
    }

    @Override
    public String visitNegation(StringParser.NegationContext ctx) {
        return super.visitNegation(ctx);
    }

    @Override
    public String visitType(StringParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public String visitList(StringParser.ListContext ctx) {
        return super.visitList(ctx);
    }

    @Override
    public String visitOperand(StringParser.OperandContext ctx) {
        return super.visitOperand(ctx);
    }

    @Override
    public String visitName(StringParser.NameContext ctx) {
        return super.visitName(ctx);
    }

    @Override
    public String visitIdent(StringParser.IdentContext ctx) {
        return super.visitIdent(ctx);
    }

    @Override
    public String visitArray(StringParser.ArrayContext ctx) {
        return super.visitArray(ctx);
    }
}
