package by.bsuir.enums;

import by.bsuir.gen.StringGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import javax.annotation.Nullable;

public enum Statement {
    ASSIGN(StringGrammarParser.Assign_varContext.class, (ctx, visitor) -> {
        return ctx.assign_var().accept(visitor);
    }),
    ASSIGN_STRING(StringGrammarParser.Assign_stringContext.class, (ctx, visitor) -> {
        return ctx.assign_string().accept(visitor);
    }),
    ASSIGN_STRING_ARRAY(StringGrammarParser.Assign_string_arrayContext.class, (ctx, visitor) -> {
        return ctx.assign_string_array().accept(visitor);
    }),
    PRINT(StringGrammarParser.PrintContext.class, (ctx, visitor) -> {
        return ctx.print().accept(visitor);
    }),
    OPERATION_INT(StringGrammarParser.OperationsContext.class, (ctx, visitor) -> {
        return ctx.operations().accept(visitor);
    }),
    WHILE_CICLE(StringGrammarParser.While_cicleContext.class, (ctx, visitor) -> {
        return ctx.while_cicle().accept(visitor);
    }),
    IF_THEN(StringGrammarParser.If_elseContext.class, (ctx, visitor) -> {
        return ctx.if_else().accept(visitor);
    }),
    METHOD_INVOCATION(StringGrammarParser.Method_invokationContext.class, (ctx, visitor) -> {
        return ctx.method_invokation().accept(visitor);
    }),
    METHOD_INVOCATION_AND_ASSIGN(StringGrammarParser.Assign_var_method_invocationContext.class, (ctx, visitor) -> {
        return ctx.assign_var_method_invocation().accept(visitor);
    }),
    STRING_ARRAY_OPERATIONS(StringGrammarParser.Operarions_with_string_arrayContext.class, (ctx, visitor) -> {
        return ctx.operarions_with_string_array().accept(visitor);
    }),
    FOR_EACH(StringGrammarParser.For_eachContext.class, (ctx, visitor) -> {
        return ctx.for_each().accept(visitor);
    });

    private final Class clazz;
    private final InvocationAction<String> action;

    Statement(Class clazz, InvocationAction<String> action) {
        this.clazz = clazz;
        this.action = action;
    }

    @Nullable
    public static Statement findStatement(ParserRuleContext ctx) {
        for (Statement statement : Statement.values()) {
            if (ctx.getRuleContext(statement.clazz, 0) != null) {
                return statement;
            }
        }
        return null;
    }

    public String invoke(StringGrammarParser.StatementContext ctx, ParseTreeVisitor<String> visitor) {
        return action.invoke(ctx, visitor);
    }

    private interface InvocationAction<T> {

        T invoke(StringGrammarParser.StatementContext ctx, ParseTreeVisitor<T> visitor);

    }
}
