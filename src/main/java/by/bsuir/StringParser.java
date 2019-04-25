package by.bsuir;

import by.bsuir.gen.StringGrammarParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import java.util.ArrayList;
import java.util.List;

public class StringParser extends StringGrammarParser {
    public StringParser(TokenStream input) {
        super(input);
    }

    public List<Token> getTokens(Token start, Token end) {
        List<Token> list = new ArrayList<>();
        for (int i = start.getTokenIndex(); i <= end.getTokenIndex(); i++) {
            list.add(getTokenStream().get(i));
        }
        return list;
    }
}
