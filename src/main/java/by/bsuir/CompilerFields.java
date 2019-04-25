package by.bsuir;

public class CompilerFields {
    public static final String MAIN_PROGRAM = "main_program";

    public static final String BEGIN = "{\n";
    public static final String END = "}\n";
    public static final String SEPARATOR = ";\n";
    public static final String ASSIGN = "=";

    public static final String MAIN_METHOD = "private static void main_program () ";
    public static final String GLOBAL_VAR = "private static ";
    public static final String SUB_METHOD = "private static ";
    public static final String VOID = "void";
    public static final String COMMA = ",";
    public static final String RETURN = "return";

    public static final String SOUT = "System.out.println(String.valueOf(%s))";

    public static final String WHILE = "while (%s)";
    public static final String FOR_EACH = "for (%s:%s)";
    public static final String IF_ELSE = "if (%s) %s else %s";
    public static final String NEW_CHAR = "new Char(%s)";
    public static final String STRING = "MyString";
    public static final String NEW_STRING = "new MyString(%s)";
    public static final String NEW_STRING_ARRAY = "new StringArray()" ;


    public static final String OPEN_BRACKET = "(";
    public static final String CLOSE_BRACKET = ")";
    public static final String DELIMITER = ".";
    public static final String ADD_NEW_STRING = "add(%s)";
    public static final String REMOVE_NEW_STRING = "remove(%s)";

    public static final String STATIC_CONTENT = ""+
            "import java.util.Iterator;\n" +
            "import java.util.Objects;\n" +
            "import java.util.ArrayList;\n" +
            "import java.util.List;\n" +
            "\n" +
            "public class %s {\n" +
            "public static void main (String args[]){\n" +
            "try{\n" +
            "main_program();" +
            "} catch (Exception ex){" +
            "ex.printStackTrace();" +
            "}\n" +
            "}\n" +
            "\n" +
            "%s" +
            "\n" +
            "}" +
            "\n" +
            "class Char {\n" +
            "\n" +
            "    private final char data;\n" +
            "\n" +
            "    public Char(char data) {\n" +
            "        this.data = data;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public String toString() {\n" +
            "        return String.valueOf(data);\n" +
            "    }\n" +
            "\n" +
            "}\n" +
            "\n" +
            "class MyString {\n" +
            "\n" +
            "    private String data ;\n" +
            "\n" +
            "    public MyString(String data) {\n" +
            "        this.data = data;\n" +
            "    }\n" +
            "\n" +
            "    public MyString() {\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public String toString() {\n" +
            "        return data;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean equals(Object obj) {\n" +
            "        if (obj == this) {\n" +
            "            return true;\n" +
            "        }\n" +
            "        if (obj instanceof MyString) {\n" +
            "            return ((MyString) obj).data.equals(data);\n" +
            "        }\n" +
            "        return false;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public int hashCode() {\n" +
            "        return Objects.hash(data);\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "\n" +
            "    public static MyString concat(MyString s1, MyString s2) {\n" +
            "\n" +
            "        MyString out = new MyString();\n" +
            "\n" +
            "        out.data = s1.data.concat(s2.data);\n" +
            "\n" +
            "\n" +
            "        return out;\n" +
            "    }\n" +
            "\n" +
            "    public static MyString join(MyString s1, MyString s2) {\n" +
            "\n" +
            "        MyString out = new MyString();\n" +
            "\n" +
            "        out.data = String.join(\" \",s1.data,s2.data);\n" +
            "\n" +
            "\n" +
            "        return out;\n" +
            "    }\n" +
            " public static MyString replace(MyString s1, MyString s2) {\n" +
            "\n" +
            "        MyString out = new MyString();\n" +
            "\n" +
            "        out.data = s1.data.replace(s1.data.charAt(0),s2.data.charAt(0));\n" +
            "\n" +
            "\n" +
            "        return out;\n" +
            "    }\n public static MyString substring(MyString s1, MyString s2) {\n" +
            "\n" +
            "       MyString out = new MyString();\n" +
                    " MyString s3 = new MyString();\n" +
            "        \n" +
            "        s3.data = s1.data.concat(s2.data);\n" +
            "\n" +
            "        out.data = s3.data.substring(1,s3.data.length()-1);\n" +
            "\n" +
            "\n" +
            "        return out;\n" +
            "    }\n" +
            "}\n" +
            "class StringArray implements Iterable<MyString> {\n" +
            "    private final List<MyString> stringArray = new ArrayList<>();\n" +
            "\n" +
            "    public StringArray() {\n" +
            "    }\n" +
            "\n" +
            "    public boolean add(MyString myString) {\n" +
            "        return stringArray.add(myString);\n" +
            "    }\n" +
            "\n" +
            "    public boolean remove(MyString myString) {\n" +
            "       return stringArray.remove(myString);\n" +
            "    }\n" +
            "\n" +
            "    public int size() {\n" +
            "        return stringArray.size();\n" +
            "    }\n" +
            "\n" +
            "    public void clear() {\n" +
            "        stringArray.clear();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public Iterator<MyString> iterator() {\n" +
            "       return stringArray.iterator();\n" +
            "    }\n" +
            "}\n";

}
