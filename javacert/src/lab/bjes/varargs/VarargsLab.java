package lab.bjes.varargs;

import java.util.Arrays;

public class VarargsLab {
    public VarargsLab() {
        varargs();
    }


    private void varargs() {
        System.out.println("--- Varargs - Arbitrary number of values");
        System.out.println("Defining a parameter type like String... means that it can contain 0 or more Strings, or an array of them");
        System.out.println("This can be done using other data types than Strings. But only one per method as this needs to be in the end of the parameter list");

        System.out.println("We have a method that counts the given strings that looks like this: ");
        System.out.println("private int stringCount(String ... strings) {\n" +
                "        return (int) Arrays.stream(strings).count();\n" +
                "    }");
        System.out.println("Running this with different inputs returns: ");
        System.out.println(stringCount("test"));
        System.out.println(stringCount("test", "hej", "san"));
        System.out.println(stringCount());
        System.out.println(stringCount((String) null));


    }

    private int stringCount(String ... strings) {
        return (int) Arrays.stream(strings).count();
    }
}
