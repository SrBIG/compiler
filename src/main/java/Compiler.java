import exception.StringSyntaxException;

import java.util.*;

public class Compiler extends StringParserBaseVisitor<String> {
    private List<String> functions = new ArrayList<>();

    @Override
    public String visitProgram(StringParser.ProgramContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();

//        ret .append( "#include <algorithm>\n";
//        ret .append( "#include <iostream>\n";
//        ret .append( "#include <list>\n";
//        ret .append( "#include <string>\n\n";
//        ret .append( REPLACE_FIRST_OCCURRENCE_FUNCTION;
//        ret .append( FIND_FROM_X_FUNCTION;
//        ret .append( FIND_TO_X_FUNCTION;

        if (!ctx.function().isEmpty()) {
            for (StringParser.FunctionContext f : ctx.function()) {
                //Compiler functionVisitor = new Compiler(scopeVariables);
                Compiler functionVisitor = new Compiler();
                ret.append(functionVisitor.visitFunction(f));
            }
        }

        ret.append("public static void main() {\n");
        if (!ctx.expression().isEmpty()) {
            for (StringParser.ExpressionContext e : ctx.expression()) {
                ret.append(visitExpression(e));
            }
        }
        ret.append("return 0;\n");
        ret.append("}\n");

        return ret.toString();
    }

    @Override
    public String visitExpression(StringParser.ExpressionContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        if (Objects.nonNull(ctx.instruction())) {
            ret.append(visitInstruction(ctx.instruction())).append("\n");
        } else {
            ret.append(visitOperation(ctx.operation())).append(";\n");
        }
        return ret.toString();
    }

    @Override
    public String visitFunction(StringParser.FunctionContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        ret.append(Objects.nonNull(ctx.type()) ? visitType(ctx.type()) : "void").append(" ");
        if (Objects.nonNull(ctx.name())) {
            final String funcName = visitName(ctx.name());
            ret.append(funcName);
            if (!functions.contains(funcName)) {
                functions.add(funcName);
            } else {
                throw new StringSyntaxException(("Function with name \"" + funcName + "\" is already defined\n"));
            }
        }
        ret.append("(");
        if (Objects.nonNull(ctx.param_def())) {
            ret.append(visitParam_def(ctx.param_def()));
        }
        ret.append(") {\n");
        if (Objects.nonNull(ctx.operators())) {
            ret.append(visitOperators(ctx.operators()));
        }
        ret.append("}\n\n");
        return ret.toString();
    }

    @Override
    public String visitParam_def(StringParser.Param_defContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        if (!ctx.getText().isEmpty()) {
            for (int i = 0; i < ctx.type().size(); ++i) {
                final String type_name = visitType(ctx.type().get(i));
                final String var_name = visitName(ctx.name().get(i));
                if (scopeVariables.findBySecond(var_name) == scopeVariables.end()) {
                    ret.append(type_name + " " + var_name;
                    if (i < ctx.type().size() - 1) {
                        ret.append(", ";
                    }
                    scopeVariables.insert(std::pair < std::string, std::string > (ctx.type().at(i).
                            getText(), var_name));
                } else {
                    throw new StringSyntaxException(("Variable with name \"" + var_name + "\" is already defined\n"));
                }
            }
        }
        return ret.toString();
    }

    @Override
    public String visitOperators(StringParser.OperatorsContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        if (!ctx.expression().isEmpty()) {
            for (StringParser.ExpressionContext e : ctx.expression()) {
                ret.append(visitExpression(e));
            }
        }
        return ret.toString();
    }

    @Override
    public String visitInstruction(StringParser.InstructionContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();

        if (Objects.nonNull(ctx.if_instruction())) {
            ret.append(visitIf_instruction(ctx.if_instruction()));
        } else if (Objects.nonNull(ctx.for_instruction())) {
            ret.append(visitFor_instruction(ctx.for_instruction()));
        } else if (Objects.nonNull(ctx.while_instruction())) {
            ret.append(visitWhile_instruction(ctx.while_instruction()));
        } else if (Objects.nonNull(ctx.definition_instruction())) {
            ret.append(visitDefinition_instruction(ctx.definition_instruction()));
        } else if (Objects.nonNull(ctx.assign_instruction())) {
            ret.append(visitAssign_instruction(ctx.assign_instruction()));
        } else if (Objects.nonNull(ctx.print())) {
            ret.append(visitPrint(ctx.print()));
        } else if (Objects.nonNull(ctx.return_instruction())) {
            ret.append(visitReturn_instruction(ctx.return_instruction()));
        }
        return ret.toString();
    }

    @Override
    public String visitIf_instruction(StringParser.If_instructionContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();

        ret.append("if (").append(visitCondition(ctx.condition())).append(" ) {\n");
        ret.append(visitThen_block(ctx.then_block()));
        ret.append("}");
        if (Objects.nonNull(ctx.else_block())) {
            ret.append(" else {\n");
            ret.append(visitElse_block(ctx.else_block()));
            ret.append("}");
        }
        return ret.toString();
    }

    @Override
    public String visitThen_block(StringParser.Then_blockContext ctx)throws StringSyntaxException {
        return visitOperators(ctx.operators());
    }

    @Override
    public String visitElse_block(StringParser.Else_blockContext ctx)throws StringSyntaxException {
        return visitOperators(ctx.operators());
    }

    @Override
    public String visitFor_instruction(StringParser.For_instructionContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();

        StringBuilder iterable = new StringBuilder();
        if (Objects.nonNull(ctx.operand())) {
            iterable = getIterableString(ctx.operand());
        } else {
            iterable.append(visitOperation(ctx.operation()));
        }

        final String name = visitName(ctx.name()));
        ret.append("for (auto " + name + " : " + iterable + ") {\n";
        if (scopeVariables.findBySecond(name) != scopeVariables.end()) {
            throw new StringSyntaxException(("Variable with name \"" + name + "\" is already defined\n"));
        }
        scopeVariables.insert(std::pair < std::string, std::string > ("str", name));
        ret.append(visitOperators(ctx.operators()));
        ret.append("}");

        return ret.toString();
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
    public String visitReturn_instruction(StringParser.Return_instructionContext ctx) throws StringSyntaxException {
        return "return " + visitOperation(ctx.operation()) + ";";
    }

    @Override
    public String visitOperation(StringParser.OperationContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        if (ctx.function_call() != null) {
            ret.append(visitFunction_call(ctx.function_call()));
        } else if (ctx.get_item() != null) {
            ret.append(visitGet_item(ctx.get_item()));
        } else if (ctx.get_slice() != null) {
            ret.append(visitGet_slice(ctx.get_slice()));
        } else if (ctx.SUM() != null) {
            ret.append(visitOperation(ctx.operation().get(0))).append(" + ");
            ret.append(visitOperation(ctx.operation().get(1)));
        } else if (ctx.IN() != null) {
            ret.append(visitOperation(ctx.operation().get(1))).append(".find(");
            ret.append(visitOperation(ctx.operation().get(0))).append(")");
        } else if (ctx.EQ() != null) {
            ret.append(visitOperation(ctx.operation().get(0))).append(" == ");
            ret.append(visitOperation(ctx.operation().get(1)));
        } else if (ctx.len_function() != null) {
            ret.append(visitLen_function(ctx.len_function()));
        } else if (ctx.operand() != null) {
            ret.append(visitOperand(ctx.operand()));
        }
        return ret.toString();
    }

    @Override
    public String visitFunction_call(StringParser.Function_callContext ctx) throws StringSyntaxException {
        return (visitName(ctx.name()) + "(" + visitParam_list(ctx.param_list()) + ")");
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
    public String visitItem_index1(StringParser.Item_index1Context ctx) throws StringSyntaxException {
        return visitOperand(ctx.operand());
    }

    @Override
    public String visitItem_index2(StringParser.Item_index2Context ctx) throws StringSyntaxException {
        return visitOperand(ctx.operand());
    }

    @Override
    public String visitParam_list(StringParser.Param_listContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < ctx.operation().size(); ++i) {
            ret.append(visitOperation(ctx.operation().get(i)));
            if (i < ctx.operation().size() - 1) {
                ret.append(", ");
            }
        }
        return ret.toString();
    }

    @Override
    public String visitLen_function(StringParser.Len_functionContext ctx) throws StringSyntaxException {
        return visitOperation(ctx.operation()) + ".length()";
    }

    @Override
    public String visitCondition(StringParser.ConditionContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        List<StringParser.Logical_conjContext> conjunctions = ctx.logical_conj();
        for (int i = 0; i < conjunctions.size() - 1; ++i) {
            ret.append(visitLogical_conj(conjunctions.get(i))).append(" || ");
        }
        ret.append(visitLogical_conj(conjunctions.get(conjunctions.size() - 1)));
        return ret.toString();
    }

    @Override
    public String visitLogical_conj(StringParser.Logical_conjContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        if (ctx.condition() != null) {
            ret.append('(').append(visitCondition(ctx.condition())).append(')');
        } else {
            List<StringParser.Logical_factorContext> logical_factor = ctx.logical_factor();
            for (int i = 0; i < logical_factor.size() - 1; ++i) {
                ret.append(visitLogical_factor(logical_factor.get(i))).append(" && ");
            }
            ret.append(visitLogical_factor(logical_factor.get(logical_factor.size() - 1)))
            ;
        }
        return ret.toString();
    }

    @Override
    public String visitLogical_factor(StringParser.Logical_factorContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        if (ctx.negation() != null) {
            ret.append("!");
        }
        ret.append(ctx.condition() != null
                ? visitCondition(ctx.condition())
                : visitOperation(ctx.operation()));
        return ret.toString();
    }

    @Override
    public String visitType(StringParser.TypeContext ctx) {
        StringBuilder ret = new StringBuilder();
        if (ctx.BOOL() != null) {
            ret.append("boolean");
        } else if (ctx.INT() != null) {
            ret.append("int");
        } else if (ctx.STR() != null) {
            ret.append("String");
        } else if (ctx.list() != null) {
            ret.append(visitList(ctx.list()));
        }
        return ret.toString();
    }

    @Override
    public String visitList(StringParser.ListContext ctx) {
        return "List< " + visitType(ctx.type()) + " >";
    }

    @Override
    public String visitOperand(StringParser.OperandContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();

        if (ctx.name() != null) {     //todo check condition
            ret.append(visitName(ctx.name()));
        } else if (ctx.array() != null) { //todo check condition
            ret.append(visitArray(ctx.array()));
        } else {
            ret.append(ctx.getText());
        }

        return ret.toString();
    }

    @Override
    public String visitName(StringParser.NameContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitIdent(StringParser.IdentContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitArray(StringParser.ArrayContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        ret.append("std::list<std::string>({");

        for (int i = 0; i < ctx.operand().size(); ++i) {
            List<StringParser.OperandContext> operand = ctx.operand();
            StringParser.OperandContext element = operand.get(i);
            if ((element.name() &&
                    scopeVariables.findBySecond(visitName(element.name())).first != "str") ||
                    element.ident().STRING() == null) {
                throw new StringSyntaxException("Wrong value of an array");
            } else {
                ret.append(visitOperand(element));
                if (i < ctx.operand().size() - 1) {
                    ret.append(", ");
                }
            }
        }

        ret.append("})");
        return ret.toString();
    }
}
