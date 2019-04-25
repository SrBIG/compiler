package by.bsuir.enums;

import by.bsuir.gen.StringGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;

import javax.annotation.Nullable;

public enum Operation {
    PLUS(StringGrammarParser.PLUS, "MyString.concat(%s,%s)"),
    MINUS(StringGrammarParser.MINUS, "MyString.replace(%s,%s)"),
    DIVIDE(StringGrammarParser.DIVIDE, "MyString.substring(%s,%s)"),
    MULTIPLY(StringGrammarParser.MULTIPLY, "MyString.join(%s,%s)"),;

    private final int type;
    private final String overrideString;

    Operation(int type, String overrideString) {
        this.type = type;
        this.overrideString = overrideString;
    }

    @Nullable
    public static Operation findOperation(ParserRuleContext ctx) {
        for (Operation operation : Operation.values()) {
            if (ctx.getToken(operation.type, 0) != null) {
                return operation;
            }
        }
        return null;
    }

    public String getOverrideString() {
        return overrideString;
    }
}
