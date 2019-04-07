import java.util.List;

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
        return "return " + visitOperation(ctx.operation()) + ";";
    }

    @Override
    public String visitOperation(StringParser.OperationContext ctx) {
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
    public String visitFunction_call(StringParser.Function_callContext ctx) {
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
    public String visitItem_index1(StringParser.Item_index1Context ctx) {
        return visitOperand(ctx.operand());
    }

    @Override
    public String visitItem_index2(StringParser.Item_index2Context ctx) {
        return visitOperand(ctx.operand());
    }

    @Override
    public String visitParam_list(StringParser.Param_listContext ctx) {
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
    public String visitLen_function(StringParser.Len_functionContext ctx) {
        return visitOperation(ctx.operation()) + ".length()";
    }

    @Override
    public String visitCondition(StringParser.ConditionContext ctx) {
        StringBuilder ret = new StringBuilder();
        List<StringParser.Logical_conjContext> conjunctions = ctx.logical_conj();
        for (int i = 0; i < conjunctions.size() - 1; ++i) {
            ret.append(visitLogical_conj(conjunctions.get(i))).append(" || ");
        }
        ret.append(visitLogical_conj(conjunctions.get(conjunctions.size() - 1)));
        return ret.toString();
    }

    @Override
    public String visitLogical_conj(StringParser.Logical_conjContext ctx) {
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
    public String visitLogical_factor(StringParser.Logical_factorContext ctx) {
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
    public String visitOperand(StringParser.OperandContext ctx) {
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
    public String visitArray(StringParser.ArrayContext ctx) {
        StringBuilder ret = new StringBuilder();
        ret.append("std::list<std::string>({");

        for (int i = 0; i < ctx.operand().size(); ++i) {
            List<StringParser.OperandContext> operand = ctx.operand();
            StringParser.OperandContext element = operand.get(i);
            if ((element.name() &&
                    scopeVariables.findBySecond(visitName(element.name())).first != "str") ||
                    element.ident().STRING() == null) {
                throw StringSyntaxException("Wrong value of an array");
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
