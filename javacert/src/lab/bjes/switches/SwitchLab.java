package lab.bjes.switches;

import lab.bjes.enums.EnumLab;

import java.util.Arrays;
import java.util.Objects;

public class SwitchLab {


    /*
    Switches only work with 4 primitives and their wrappers + enums and Strings
        byte and Byte
        short and Short
        int and Integer
        char and Character
        enum
        String
    * */
    public SwitchLab() {
        enumSwitch();
        scope();
    }

    private void enumSwitch() {
        System.out.println("--- Switch - Enum");

        EnumLab enumLabs[] = new EnumLab[]{EnumLab.LAB, EnumLab.LAB, null, EnumLab.VALUE};

        System.out.println("Running following list in a for with a switch: {EnumLab.LAB, EnumLab.LAB, null, EnumLab.VALUE}");
        for (EnumLab e : Arrays.stream(enumLabs).filter(Objects::nonNull).toList()) { // NPE in switch if objects are passed
            switch (e) {
                case LAB -> { // redundant
                    System.out.println("case LAB");
                }
                case VALUE -> System.out.println("case VALUE");
            }
            ;

            String s = switch (e) {
                case LAB, ENUMVAL -> "lab / enumval";
                //case VALUE -> "VALUE"
                default ->
                        "default, since no case for value"; // All cases need to be covered if the switch returns something
            };

            System.out.println("Second switch returned string : " + s);
        }
    }

    private void scope() {
        System.out.println("--- Switch Scope");
        System.out.println("A variable created in one case is accessible in the rest of the switch, like this: ");
        int i = 3;
        switch (i) {
            case 1:
                String s = "i = 1";
            case 3:
                s = "i = 3";
        }

        System.out.println("        int i = 3;\n" +
                "        switch(i) {\n" +
                "            case 1:\n" +
                "                String s = \"i = 1\";\n" +
                "            case 3:\n" +
                "                s = \"i = 3\";\n" +
                "        }");

        System.out.println("s can not be accessed after the Switch ends. ");
    }
}
