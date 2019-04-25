package by.bsuir;

import by.bsuir.enums.MethodType;
import by.bsuir.enums.Operation;
import by.bsuir.enums.Statement;
import by.bsuir.enums.VariableType;
import by.bsuir.exception.BlockException;
import by.bsuir.exception.FunctionException;
import by.bsuir.exception.PrintException;
import by.bsuir.exception.WrongExpressionException;
import by.bsuir.gen.StringGrammarParser;
import by.bsuir.gen.StringGrammarVisitor;
import by.bsuir.methods.Method;
import by.bsuir.variable.Variable;
import by.bsuir.variable.VariableAndMethodRegister;
import com.google.common.base.Preconditions;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VisitorImpl implements StringGrammarVisitor<String> {
    private final StringParser stringParser;
    private final VariableAndMethodRegister register =  new VariableAndMethodRegister();
    private final String name;

    public VisitorImpl(StringParser stringParser, String name) {
        this.stringParser = stringParser;
        this.name = name;
    }

    @Override
    public String visitProgram(StringGrammarParser.ProgramContext ctx) {
        register.registerMethodInvocation();
        String result = CompilerFields.MAIN_METHOD + ctx.block().accept(this);
        register.registerMethodInvocationEnded();
        return result;
    }

    @Override
    public String visitBlock(StringGrammarParser.BlockContext ctx) {
        register.registerNewVisibilityArea();
        StringBuilder out = new StringBuilder(CompilerFields.BEGIN).append(invokeAllStatementsForBlock(ctx.statement()));
        out.append(CompilerFields.END);
        register.registerVisibilityAreaEnded();
        return out.toString();
    }

    private StringBuilder invokeAllStatementsForBlock(List<StringGrammarParser.StatementContext> list) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            out.append(list.get(i).accept(this));
        }
        return out;
    }

    @Override
    public String visitStatement(StringGrammarParser.StatementContext ctx) {

        Statement statement = Statement.findStatement(ctx);
        Preconditions.checkNotNull(statement);
        return statement.invoke(ctx, this);
    }

    @Override
    public String visitDigit_expression(StringGrammarParser.Digit_expressionContext ctx) {
        validateDigitExpression(ctx);
        return concatExpr(ctx) + CompilerFields.SEPARATOR;
    }

    private void validateDigitExpression(StringGrammarParser.Digit_expressionContext ctx) {
        if (ctx.ID() != null) {
            Variable variable = register.getVariable(ctx.ID().toString());
            if (variable == null || variable.getVariableType() != VariableType.INT) {
                throw new WrongExpressionException("Wrong by.by.bsuir.compiler.type of content:"+ctx.getText());
            }
        }
        List<StringGrammarParser.Digit_expressionContext> expr = ctx.digit_expression();
        for (int i = 0; i < expr.size(); i++) {
            validateDigitExpression(expr.get(i));
        }
    }

    private String concatExpr(ParserRuleContext ctx) {
        StringBuilder out = new StringBuilder();
        List<Token> tokens = stringParser.getTokens(ctx.start, ctx.stop);
        for (int i = 0; i < tokens.size(); i++) {
            out.append(tokens.get(i).getText());
        }
        return out.toString();
    }

    @Override
    public String visitIntialize_char(StringGrammarParser.Intialize_charContext ctx) {
        return String.format(CompilerFields.NEW_CHAR, ctx.SYMBOL()) + CompilerFields.SEPARATOR;
    }

    @Override
    public String visitInitialize_string(StringGrammarParser.Initialize_stringContext ctx) {
        String ID = ((StringGrammarParser.Assign_stringContext) ctx.parent).ID().getText();
        return VariableType.STRING.getOutName() + " " + ID + CompilerFields.ASSIGN + String.format(CompilerFields.NEW_STRING, ctx.LINE()) + CompilerFields.SEPARATOR;
    }

    @Override
    public String visitInitialize_string_array(StringGrammarParser.Initialize_string_arrayContext ctx) {
        String ID = ((StringGrammarParser.Assign_string_arrayContext) ctx.parent).ID().getText();
        return CompilerFields.NEW_STRING_ARRAY + CompilerFields.SEPARATOR+ handleStringArrayInitialization(ctx.ID(),ID);
    }

    private String handleStringArrayInitialization(List<TerminalNode> list, String rootID) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            Variable variable = Preconditions.checkNotNull(register.getVariable(list.get(i).getText()));
            if (variable.getVariableType() != VariableType.STRING) {
                throw new WrongExpressionException("Wrong by.by.bsuir.compiler.type of content:"+variable.getVariableType().getOutName());
            }
            out.append(rootID).append(CompilerFields.DELIMITER).append(String.format(CompilerFields.ADD_NEW_STRING, variable.getID())).append(CompilerFields.SEPARATOR);
        }
        return out.toString();
    }

    @Override
    public String visitGlobal_assign_var(StringGrammarParser.Global_assign_varContext ctx) {
        return CompilerFields.GLOBAL_VAR + processAssignVar(ctx.assign_var(), true);
    }

    @Override
    public String visitGlobal_assign_string(StringGrammarParser.Global_assign_stringContext ctx) {
        return CompilerFields.GLOBAL_VAR + processAssignString(ctx.assign_string(),true);
    }

    @Override
    public String visitGlobal_assign_string_array(StringGrammarParser.Global_assign_string_arrayContext ctx) {
        return CompilerFields.GLOBAL_VAR + processAssignStringArray(ctx.assign_string_array(),true);
    }

    @Override
    public String visitAssign_var_method_invocation(StringGrammarParser.Assign_var_method_invocationContext ctx) {
        Variable variable = new Variable(ctx.ID().getText(), Preconditions.checkNotNull(VariableType.findByDisplayName(ctx.type().getText())), ctx.CONST() != null);
        Preconditions.checkState(register.registerVariable(variable));
        Method method = Preconditions.checkNotNull(register.getRegisteredMethod(ctx.method_invokation().ID().getText()));
        if (method.getMethodType() == MethodType.RETURN_OPTIONAL || method.getMethodType().getReturnedType() != variable.getVariableType()) {
            throw new FunctionException("Different actual and expected returned types "+ctx.getText());
        }
        return variable.getVariableType().getOutName() + " " + variable.getID() + CompilerFields.ASSIGN + ctx.method_invokation().accept(this);
    }

    @Override
    public String visitAssign_string(StringGrammarParser.Assign_stringContext ctx) {
        return processAssignString(ctx,false);
    }

    private String processAssignString(StringGrammarParser.Assign_stringContext ctx, boolean global) {
        StringBuilder out = new StringBuilder();
        Operation operation = Operation.findOperation(ctx.initialize_string());
        Variable varForRegister;
        if (operation == null) {
            out.append(VariableType.STRING.invokeInitLine(ctx, this));
            varForRegister = new Variable(ctx.ID().toString(), VariableType.STRING, ctx.CONST() != null);
        } else {
            for (int i = 1; i < 2; i++) {
                Variable variable = Preconditions.checkNotNull(register.getVariable(ctx.initialize_string().ID(i).getText()));
                if (variable.getVariableType() != VariableType.STRING) {
                    throw new WrongExpressionException("Wrong by.by.bsuir.compiler.type of content: "+ctx.getText());
                }
            }
            out.append(VariableType.STRING.getOutName()).append(" ").append(ctx.ID()).append(CompilerFields.ASSIGN);
            out.append(String.format(operation.getOverrideString(), ctx.initialize_string().ID(0), ctx.initialize_string().ID(1))).append(CompilerFields.SEPARATOR);
            varForRegister = new Variable(ctx.ID().toString(), VariableType.STRING);
        }
        if (!global) {
            Preconditions.checkState(register.registerVariable(varForRegister));
        } else {
            Preconditions.checkState(register.registerGlobalVariable(varForRegister));
        }


        return out.toString();

    }

    @Override
    public String visitAssign_string_array(StringGrammarParser.Assign_string_arrayContext ctx) {
        return processAssignStringArray(ctx,false);
    }

    private String processAssignStringArray(StringGrammarParser.Assign_string_arrayContext ctx, boolean global) {

        StringBuilder out = new StringBuilder();

        Variable varForRegister;

        out.append(VariableType.STRING_ARRAY.getOutName()).append(" ").append(ctx.ID()).append(CompilerFields.ASSIGN);
        out.append(VariableType.STRING_ARRAY.invokeInitLine(ctx,this));
        varForRegister = new Variable(ctx.ID().toString(), VariableType.STRING_ARRAY);

        if (!global) {
            Preconditions.checkState(register.registerVariable(varForRegister));
        } else {
            Preconditions.checkState(register.registerGlobalVariable(varForRegister));
        }
        return out.toString();
    }

    @Override
    public String visitAssign_var(StringGrammarParser.Assign_varContext ctx) {
        return processAssignVar(ctx, false);
    }

    private String processAssignVar(StringGrammarParser.Assign_varContext ctx, boolean global) {
        VariableType variableType = Preconditions.checkNotNull(VariableType.findByDisplayName(ctx.type_1().getText()));
        String out = variableType.getOutName() + " " + ctx.ID() + CompilerFields.ASSIGN + variableType.invokeInitLine(ctx, this);
        if (!global) {
            Preconditions.checkState(register.registerVariable(new Variable(ctx.ID().toString(), variableType, ctx.CONST() != null)));
        } else {
            Preconditions.checkState(register.registerGlobalVariable(new Variable(ctx.ID().toString(), variableType, ctx.CONST() != null)));
        }
        return out;
    }


    @Override
    public String visitOperarions_with_string_array(StringGrammarParser.Operarions_with_string_arrayContext ctx) {
        Variable variable = Preconditions.checkNotNull(register.getVariable(ctx.ID(0).getText()));
        Variable str = Preconditions.checkNotNull(register.getVariable(ctx.ID(1).getText()));
        if (variable.getVariableType() != VariableType.STRING_ARRAY || str.getVariableType() != VariableType.STRING || variable.isConstant()) {
            throw new WrongExpressionException("Wrong by.by.bsuir.compiler.type of content: "+ctx.getText());
        }
        if (ctx.ADD() == null) {
            return variable.getID() + CompilerFields.DELIMITER + String.format(CompilerFields.REMOVE_NEW_STRING, str.getID()) + CompilerFields.SEPARATOR;
        } else {
            return variable.getID() + CompilerFields.DELIMITER + String.format(CompilerFields.REMOVE_NEW_STRING, str.getID()) + CompilerFields.SEPARATOR;
        }
    }


    @Override
    public String visitPrint(StringGrammarParser.PrintContext ctx) {
        if (ctx.ID() != null) {
            Variable variable = Preconditions.checkNotNull(register.getVariable(ctx.ID().getText()));
            return String.format(CompilerFields.SOUT, variable.getID()) + CompilerFields.SEPARATOR;
        } else if (ctx.LINE() != null){
            return String.format(CompilerFields.SOUT, ctx.LINE()) + CompilerFields.SEPARATOR;
        }
        else if (ctx.NUMBER() != null){
            return String.format(CompilerFields.SOUT, ctx.NUMBER()) + CompilerFields.SEPARATOR;
        }

        throw new PrintException("Cannot print this information: " + ctx.getText());

    }

    @Override
    public String visitOperations(StringGrammarParser.OperationsContext ctx) {
        Variable variable = register.getVariable(ctx.ID().toString());
        if (variable == null || variable.getVariableType() != VariableType.INT || variable.isConstant()) {
            throw new WrongExpressionException("Wrong by.by.bsuir.compiler.type of operation with digits: "+ctx.getText());
        }
        validateDigitExpression(ctx.digit_expression());
        return variable.getID() + CompilerFields.ASSIGN + concatExpr(ctx.digit_expression()) + CompilerFields.SEPARATOR;
    }

    @Override
    public String visitSimple_compare(StringGrammarParser.Simple_compareContext ctx) {
        List<StringGrammarParser.Digit_expressionContext> dctx = ctx.digit_expression();
        validateDigitExpression(dctx.get(0));
        validateDigitExpression(dctx.get(1));
        return concatExpr(ctx);
    }

    @Override
    public String visitMulti_compare(StringGrammarParser.Multi_compareContext ctx) {
        return ctx.NEGATION().getText() + ctx.O_BRACKET().getText() + visitSimple_compare(ctx.simple_compare()) + ctx.C_BRACKET().getText();

    }

    @Override
    public String visitWhile_cicle(StringGrammarParser.While_cicleContext ctx) {
        String out = String.format(CompilerFields.WHILE, handlerCompare(ctx.multi_compare(), ctx.simple_compare()));
        out += ctx.block().accept(this);
        return out;
    }

    @Override
    public String visitIf_else(StringGrammarParser.If_elseContext ctx) {
        return String.format(CompilerFields.IF_ELSE, handlerCompare(ctx.multi_compare(), ctx.simple_compare()), ctx.block(0).accept(this), ctx.block(1).accept(this));
    }

    private String handlerCompare(StringGrammarParser.Multi_compareContext htx, StringGrammarParser.Simple_compareContext stx) {
        return stx == null ? htx.accept(this) : stx.accept(this);
    }


    @Override
    public String visitFor_each(StringGrammarParser.For_eachContext ctx) {
        Variable variable = register.getVariable(ctx.ID(1).getText());
        if (variable == null || variable.getVariableType() != VariableType.STRING_ARRAY) {
            throw new WrongExpressionException("Wrong by.by.bsuir.compiler.type of content: "+ctx.getText()+".There must be stringArray");
        }
        Preconditions.checkState(register.registerVariable(new Variable(ctx.ID(0).getText(), VariableType.STRING)));
        return String.format(CompilerFields.FOR_EACH, CompilerFields.STRING + " " + ctx.ID(0).getText(), variable.getID()) + ctx.block().accept(this);
    }

    @Override
    public String visitType(StringGrammarParser.TypeContext ctx) {
        VariableType variableType = VariableType.findByDisplayName(ctx.getText());
        return Preconditions.checkNotNull(variableType).getOutName();
    }

    @Override
    public String visitType_1(StringGrammarParser.Type_1Context ctx) {
        VariableType variableType = VariableType.findByDisplayName(ctx.getText());
        return Preconditions.checkNotNull(variableType).getOutName();
    }

    @Override
    public String visitSignature(StringGrammarParser.SignatureContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append(CompilerFields.OPEN_BRACKET);
        for (int i = 0; i < ctx.ID().size(); i++) {
            VariableType variableType = VariableType.findByDisplayName(ctx.type(i).getText());
            Preconditions.checkNotNull(variableType);
            register.registerVariable(new Variable(ctx.ID(i).getText(), variableType));
            builder.append(ctx.type(i).accept(this)).append(" ").append(ctx.ID(i));
            if (i != ctx.ID().size() - 1) {
                builder.append(CompilerFields.COMMA);
            }
        }
        builder.append(CompilerFields.CLOSE_BRACKET);
        return builder.toString();
    }

    @Override
    public String visitSubprogram_return(StringGrammarParser.Subprogram_returnContext ctx) {
        Method method = register.getRegisteredMethod(ctx.ID().toString());
        if (method == null || method.getMethodType() == MethodType.RETURN_OPTIONAL) {
            throw new FunctionException("The function is not a by.by.bsuir.compiler.type of void");
        }
        register.registerMethodInvocation();
        //NPE checked before.
        String s = CompilerFields.SUB_METHOD + method.getMethodType().getReturnedType().getOutName()
                + " " + ctx.ID() + ctx.signature().accept(this) + ctx.block_return().accept(this);
        register.registerMethodInvocationEnded();
        return s;
    }

    @Override
    public String visitSubprogram_non_return(StringGrammarParser.Subprogram_non_returnContext ctx) {
        Method method = register.getRegisteredMethod(ctx.ID().toString());
        if (method == null || method.getMethodType() != MethodType.RETURN_OPTIONAL) {
            throw new FunctionException("The function must be void: "+ctx.getText());
        }
        register.registerMethodInvocation();
        String s = CompilerFields.SUB_METHOD + CompilerFields.VOID + " " + ctx.ID() + handleSignature(ctx.signature());
        s += ctx.block_non_return() == null ? ctx.block().accept(this) : ctx.block_non_return().accept(this);
        register.registerMethodInvocationEnded();
        return s;
    }

    private String handleSignature(StringGrammarParser.SignatureContext ctx) {
        return ctx == null ? CompilerFields.OPEN_BRACKET + CompilerFields.CLOSE_BRACKET : ctx.accept(this);
    }

    @Override
    public String visitBlock_return(StringGrammarParser.Block_returnContext ctx) {
        register.registerNewVisibilityArea();
        Method method = Preconditions.checkNotNull(register.getRegisteredMethod(((StringGrammarParser.Subprogram_returnContext) ctx.parent).ID().getText()));
        StringBuilder out = new StringBuilder(CompilerFields.BEGIN).append(invokeAllStatementsForBlock(ctx.statement()));
        out.append(CompilerFields.RETURN);
        Variable variable = Preconditions.checkNotNull(register.getVariable(ctx.ID().getText()));
        if (variable.getVariableType() != method.getMethodType().getReturnedType()) {
            throw new BlockException("Actual and expected return values are not equal: "+ctx.getText());
        }
        out.append(" ").append(variable.getID()).append(CompilerFields.SEPARATOR).append(CompilerFields.END);
        register.registerVisibilityAreaEnded();
        return out.toString();
    }

    @Override
    public String visitBlock_non_return(StringGrammarParser.Block_non_returnContext ctx) {
        register.registerNewVisibilityArea();
        StringBuilder out = new StringBuilder(CompilerFields.BEGIN).append(invokeAllStatementsForBlock(ctx.statement()));
        out.append(CompilerFields.RETURN);
        out.append(CompilerFields.SEPARATOR);
        out.append(CompilerFields.END);
        register.registerVisibilityAreaEnded();
        return out.toString();
    }

    @Override
    public String visitSignature_method_invokation(StringGrammarParser.Signature_method_invokationContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append(CompilerFields.OPEN_BRACKET);
        Method method = register.getRegisteredMethod(((StringGrammarParser.Method_invokationContext) ctx.parent).ID().getText());
        Preconditions.checkNotNull(method);
        if (method.getArguments().size() != ctx.ID().size()) {
            throw new FunctionException("Wrong size of method arguments: "+ctx.getText());
        }
        for (int i = 0; i < ctx.ID().size(); i++) {
            Variable variable = register.getVariable(ctx.ID(i).getText());
            if (variable == null || method.getArguments().get(i) != variable.getVariableType()) {
                throw new FunctionException("Arguments not found or are of wrong by.by.bsuir.compiler.type: "+ctx.getText());
            }
            builder.append(variable.getID());
        }
        return builder.append(CompilerFields.CLOSE_BRACKET).toString();
    }

    @Override
    public String visitMethod_invokation(StringGrammarParser.Method_invokationContext ctx) {
        Method method = register.getRegisteredMethod(ctx.ID().toString());
        if (method == null) {
            throw new FunctionException("by.by.bsuir.compiler.methods.Method not found: "+ctx.getText());
        }
        return method.getID() + " " + handleSignatureOfInvocation(ctx) + CompilerFields.SEPARATOR;
    }


    private String handleSignatureOfInvocation(StringGrammarParser.Method_invokationContext ctx) {
        if (ctx.signature_method_invokation() == null) {
            Method method = Preconditions.checkNotNull(register.getRegisteredMethod(ctx.ID().getText()));
            if (method.getArguments().size() != 0) {
                throw new FunctionException(ctx.getText()+" is a method without arguments");
            }
            return CompilerFields.OPEN_BRACKET + CompilerFields.CLOSE_BRACKET;
        }
        return ctx.signature_method_invokation().accept(this);
    }

    @Override
    public String visitGlobal_program(StringGrammarParser.Global_programContext ctx) {
        StringBuilder out = new StringBuilder();
        register.registerMethod(new Method(CompilerFields.MAIN_PROGRAM, MethodType.RETURN_OPTIONAL, Collections.emptyList()));
        List<StringGrammarParser.Subprogram_non_returnContext> non_returnContexts = ctx.subprogram_non_return();
        List<StringGrammarParser.Subprogram_returnContext> returnContexts = ctx.subprogram_return();
        for (StringGrammarParser.Global_assign_varContext ct : ctx.global_assign_var()) {
            out.append(ct.accept(this));
        }
        for (StringGrammarParser.Subprogram_returnContext ct : returnContexts) {
            VariableType variableType = Preconditions.checkNotNull(VariableType.findByDisplayName(ct.type().getText()));
            register.registerMethod(new Method(ct.ID().toString(), Preconditions.checkNotNull(MethodType.findByReturnedType(variableType)), collectMethodArguments(ct.signature())));
            out.append(ct.accept(this));
        }
        for (StringGrammarParser.Subprogram_non_returnContext ct : non_returnContexts) {
            register.registerMethod(new Method(ct.ID().toString(), MethodType.RETURN_OPTIONAL, collectMethodArguments(ct.signature())));
            out.append(ct.accept(this));
        }
        out.append(ctx.program().accept(this));
        return out.toString();
    }

    private List<VariableType> collectMethodArguments(StringGrammarParser.SignatureContext ctx) {
        List<VariableType> variableTypes = new ArrayList<>();
        if (ctx == null) {
            return Collections.emptyList();
        }
        for (int i = 0; i < ctx.ID().size(); i++) {
            VariableType variableType = VariableType.findByDisplayName(ctx.type(i).getText());
            variableTypes.add(Preconditions.checkNotNull(variableType));
        }
        return variableTypes;
    }

    @Override
    public String visit(ParseTree parseTree) {
        String out = parseTree.accept(this);
        return String.format(CompilerFields.STATIC_CONTENT, name, out);
    }

    @Override
    public String visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public String visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public String visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
