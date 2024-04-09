package lab.bjes.strings;

public class StringLab {
    public StringLab() {
        stringConcatenation();
        tripleQuotations();
        subStrings();
        isBlank();
    }

    private void stringConcatenation() {
        System.out.println("--- Strings - Concatenation");

        System.out.println("StringBuilder provides a number of String manipulation abilities");
        StringBuilder sb = new StringBuilder("init");
        System.out.println("StringBuilder sb = new StringBuilder(\"init\"): "+ sb);
        sb.append("123456");
        System.out.println("sb.append(\"123456\"): " + sb);
        System.out.println("sb.indexOf(\"45\"): " + sb.indexOf("45"));

        System.out.println("StringBuffer is the Synchronized version of StringBuilder, meaning it's supposed to be thread safe. ");
        StringBuffer sbu = new StringBuffer("init");
    }

    private void tripleQuotations() {
        System.out.println("--- Strings - Text blocks");
        String s = """
                123""";
        /*String wrong = """text block starts in the following line
                """;*/

        System.out.println("Text blocks Strings can be created using 3 quotation marks. They start at the following line (ie does not start with a \\n)");
        System.out.println("String s = \"\"\"\n" +
                "                123\"\"\";");
        System.out.println("s.length(): " + s.length());
        System.out.println("Adding a line to the text block would mean adding \\n to the String");
    }

    private void subStrings() {
        System.out.println("--- Strings - Substrings");

        System.out.println("A Substring can be extracted from a String by providing a start index and a stop index (stop index character not included)");
        String s = "example";
        System.out.println("String s = \"example\"; ");
        System.out.println("s.substring(1, 4) : " + s.substring(1, 4)); // xam, index 1 = x, index 4 = p

        System.out.println("Can also be done by only giving a start index. s.substring(4): " + s.substring(4)); // ple

        System.out.println("If substring is not in bounds within the String a StringIndexOutOfBoundsException will be thrown");
    }

    private void isBlank() {
        System.out.println("--- Strings - isBlank() vs isEmpty()");
        System.out.println("isBlank returns true if Strings contains only whitespaces. isEmpty returns true if the String is empty. ");
        System.out.println("\"\".isBlank(): " + "".isBlank()); // true
        System.out.println("\" \".isBlank(): " + " ".isBlank()); // true
        System.out.println("\"\\t\\n\".isBlank(): " + "\t\n".isBlank()); // true

        System.out.println("\"\".isEmpty(): " + "".isEmpty()); // true
        System.out.println("\" \".isEmpty(): " + " ".isEmpty()); // false
        System.out.println("\"\\t\\n\".isEmpty(): " + "\t\n".isEmpty()); // false
    }
}
