package by.bsuir;

import by.bsuir.exception.VisitorException;
import by.bsuir.gen.StringGrammarLexer;
import by.bsuir.gen.StringGrammarVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Args empty");
            return;
        }
        System.out.println("Args not empty");
        String text = getString(args[0]);
//        String text = getString("E:\\JAVA\\AIPOS\\compiler\\src\\main\\resources\\test2.txt");
        if (text != null) {
            try {
                StringGrammarLexer lexer = new StringGrammarLexer(CharStreams.fromString(text));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                StringParser parser = new StringParser(tokens);
                ParseTree tree = parser.global_program();
                StringGrammarVisitor<String> visitor = new VisitorImpl(parser, "Program");
                String out = visitor.visit(tree);
                FileWriter fileWriter = new FileWriter("Program.java");
                fileWriter.write(out);
                fileWriter.close();
                System.out.println("OK");
            } catch (VisitorException e) {
                System.out.println("Compiler error : " + e.getMessage());
            }

        }
    }

    private static String getString(String filename) {
        InputStream is = null;
        try {
            is = new FileInputStream(filename);
            BufferedReader buf = new BufferedReader(new InputStreamReader(is));
            String line = buf.readLine();
            StringBuilder sb = new StringBuilder();
            while (line != null) {
                sb.append(line).append("\n");
                line = buf.readLine();
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
