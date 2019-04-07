import exception.StringSyntaxException;

import java.util.*;

public class Compiler extends StringParserBaseVisitor<String> {
    private List<String> functions = new ArrayList<>();
    private Map<String, String> variables = new HashMap<>();

    public Compiler(Map<String, String> variables) {
        this.variables = variables;
    }

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
                Compiler functionVisitor = new Compiler(variables);
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
                if (Objects.isNull(variables.get(var_name))) {
                    ret.append(type_name + " " + var_name);
                    if (i < ctx.type().size() - 1) {
                        ret.append(", ");
                    }
                    variables.put(var_name, ctx.type().get(i).getText());
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
    public String visitThen_block(StringParser.Then_blockContext ctx) throws StringSyntaxException {
        return visitOperators(ctx.operators());
    }

    @Override
    public String visitElse_block(StringParser.Else_blockContext ctx) throws StringSyntaxException {
        return visitOperators(ctx.operators());
    }

    @Override
    public String visitFor_instruction(StringParser.For_instructionContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();

        String iterable;
        if (Objects.nonNull(ctx.operand())) {
            iterable = getIterableString(ctx.operand());
        } else {
            iterable = (visitOperation(ctx.operation()));
        }

        final String name = visitName(ctx.name());
        ret.append("for (auto " + name + " : " + iterable + ") {\n");
        if (Objects.nonNull(variables.get(name))) {
            throw new StringSyntaxException(("Variable with name \"" + name + "\" is already defined\n"));
        }
        variables.put(name, "str");
        ret.append(visitOperators(ctx.operators()));
        ret.append("}");

        return ret.toString();
    }

    private String getIterableString(StringParser.OperandContext ctx) throws StringSyntaxException {
        String iterable;
        String varName = visitName(ctx.name());
        if (ctx.name() != null) {
            String type = variables.get(varName);
            if (type.equals("list")) {
                throw new StringSyntaxException(varName + " is not iterable\n");
            } else {
                iterable = varName;
            }
        } else if (ctx.array() != null || ctx.ident().STRING() != null) {
            iterable = (visitOperand(ctx));
        } else {
            throw new StringSyntaxException(ctx.getText() + " is not iterable");
        }
        return iterable;
    }

    @Override
    public String visitWhile_instruction(StringParser.While_instructionContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();

        ret.append("while (").append(visitCondition(ctx.condition())).append(") {\n");
        ret.append(visitOperators(ctx.operators()));
        ret.append("}");

        return ret.toString();
    }

    @Override
    public String visitDefinition_instruction(StringParser.Definition_instructionContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        final String type = visitType(ctx.type());
        final String name = visitName(ctx.name());
        if (Objects.nonNull(variables.get(name))) {
            throw new StringSyntaxException(("Variable with name \"" + name + "\" is already defined\n"));
        } else {
            ret.append(type).append(" ");
            ret.append(name);
            variables.put(name, ctx.type().getText());
        }
        if (Objects.nonNull(ctx.operation())) {
            ret.append(" = ").append(visitOperation(ctx.operation()));
        }
        ret.append(";");
        return ret.toString();
    }

    @Override
    public String visitAssign_instruction(StringParser.Assign_instructionContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        if (Objects.nonNull(ctx.name())) {
            ret.append(simpleAssignTranslation(ctx));
        } else if (Objects.nonNull(ctx.get_item())) {
            ret.append(insertAssignTranslation(ctx));
        } else {
            ret.append(replaceAssignTranslation(ctx));
        }
        return ret.toString();
    }

    private String replaceAssignTranslation(StringParser.Assign_instructionContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        StringParser.NameContext var_name = ctx.get_slice().operand().name();
        String varName = visitName(var_name);
        if (var_name != null) {    // TODO: чо за дерьмо?!!!
            String varType = variables.get(varName);
            if (Objects.isNull(varType)) {
                throw new StringSyntaxException("Undefined variable ");
            } else if (varType == "str") {
                String index1 = visitItem_index1(ctx.get_slice().item_index1());
                String index2 = visitItem_index2(ctx.get_slice().item_index2());
                ret.append(varName + " = substr_to_x(" + var.second + ", " + index1 + ") + " +
                        visitOperation(ctx.operation()) + " + substr_from_x(" + var.second + ", " + //TODO: заменить говнометоды на нормальные
                        index2 + ");");
            } else if (varType.equals("list")) {
                String index1 = visitItem_index1(ctx.get_slice().item_index1());
                String index2 = visitItem_index2(ctx.get_slice().item_index2());
                ret += "std::replace(" + var.second + ".begin() + " + index1 + ", " + // TODO: заменить говнокод на нормальные православные методы
                        var.second + ".begin() + " + index2 + ", " +
                        visitOperation(ctx.operation()) + ");";
            } else {
                throw new StringSyntaxException(" is not iterable\n");
            }
        } else {
            throw new StringSyntaxException("Could not assign to constant value\n");
        }
        return ret.toString();

    }

    private String insertAssignTranslation(StringParser.Assign_instructionContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        StringParser.NameContext var_name = ctx.get_item().operand().name();
        if (var_name != null) {
            String var = variables.get(visitName(var_name));
            if (Objects.isNull(var)) {
                throw new StringSyntaxException("Undefined variable ");
            } else if (var.first == "str") {
                StringParser.OperandContext operand = ctx.get_item().item_index1().operand();
                String type;
                if (operand.name() != null) {
                    type = variables.get(operand.name().getText()).first;
                }

                if (type == "int" || operand.ident().NUMBER()) {
                    String index = visitItem_index1(ctx.get_item().item_index1());
                    ret += var.second + ".insert(" + index + ", std::string(" +
                            visitOperation(ctx.operation()) +
                            "));";
                } else if (type == "str" || operand.ident().STRING()) {
                    String substr = visitItem_index1(ctx.get_item().item_index1());
                    String string1 = visitOperation(ctx.operation());
                    ret += "replaceFirstOccurrence(" + var.second + ", " + substr + ", " + string1 + ");";
                } else {
                    throw new StringSyntaxException("Incompatible type for assign operation");
                }
            } else if (0 == strncmp(var.first.c_str(), "list", 4)) {

                String index = visitItem_index1(ctx.get_item().item_index1());
                ret.append(var.second + ".emplace(" + var.second + ".begin() + " + index + ", std::string(" +
                        visitOperation(ctx.operation()) + "));");
            } else {
                throw new StringSyntaxException(" is not iterable\n");
            }
        } else {
            throw new StringSyntaxException("Could not assign to constant value\n");
        }
        return ret.toString();


    }

    private String simpleAssignTranslation(StringParser.Assign_instructionContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        String name = visitName(ctx.name());
        if (Objects.isNull(variables.get(name))) {
            throw new StringSyntaxException(("Undefined variable \"" + name + "\"\n"));
        }
        ret.append(name);
        ret.append(" = ");
        ret.append(visitOperation(ctx.operation()) + ";");
        return ret.toString();

    }

    @Override
    public String visitPrint(StringParser.PrintContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        ret.append("System.out.println(\"\"");
        for (StringParser.OperationContext param : ctx.param_list().operation()) {
            if (Objects.nonNull(param.operand()) && Objects.nonNull(param.operand().name())) {
                String name = visitName(param.operand().name());
                if (Objects.isNull(variables.get(name))) {
                    throw new StringSyntaxException(("Variable with name \"" + name + "\" does not exists\n"));
                } else {
                    ret.append(" + ").append(visitOperation(param));
                }
            }
            ret.append(" + ").append(visitOperation(param));
        }
        ret.append("\"\");");
        return ret.toString();
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
    public String visitGet_slice(StringParser.Get_sliceContext ctx) throws StringSyntaxException {
        StringBuilder ret = new StringBuilder();
        String operand = visitOperand(ctx.operand());
        if (Objects.nonNull(ctx.operand().name())) {
            final String type = variables.get(operand);
            if (Objects.isNull(type)) {
                throw new StringSyntaxException(("Variable with name \"" + operand + "\" does not exists\n"));
            } else if (!type.equals("str") || !type.equals("list")) {
                throw new StringSyntaxException(type + " type is not iterable"); //TODO: что за дерьмо?!
            }
        }
        ret.append(visitOperand(ctx.operand()) + ".substr(" +
                visitItem_index1(ctx.item_index1()) + ", " +
                visitItem_index2(ctx.item_index2()) + ")");
        return ret.toString();
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
        ret.append("std::list<std::string>({");  // TODO: Mark pidr

        for (int i = 0; i < ctx.operand().size(); ++i) {
            List<StringParser.OperandContext> operand = ctx.operand();
            StringParser.OperandContext element = operand.get(i);
            if (Objects.nonNull(element.name()) &&
                    !variables.get(visitName(element.name())).equals("str") ||
                    Objects.isNull(element.ident().STRING())) {
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
