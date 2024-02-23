package lab.bjes.instance;

import lab.bjes.interfaces.DerivedClassAB;
import lab.bjes.interfaces.InterfaceA;

import java.util.Arrays;

public class InstanceOfLab {
    public InstanceOfLab() {
        instanceOfExample();
    }

    private void instanceOfExample() {
        System.out.println("--- Instanceof - Looping through var arr = Arrays.asList(\"value\", i, 20L, 15F, 20.0, false, new byte[5]); and determining type using instance of");
        int i = 1337;
        var arr = Arrays.asList("value", i, 20L, 15F, 20.0, false, new byte[5]);

        arr.forEach(x -> {
            if(x instanceof String) {
                System.out.println("String value: " + x);
            }
            /*
            if(x instanceof int) { // NOK, can only use instance of to check if it's an object of a class. Primitive data types aren't instances

            }*/
            else if(x instanceof Integer) {
                System.out.println("Integer value: " + x);
            }
            else if(x instanceof InterfaceA) {
                System.out.println("InterfaceA value: " + x);
            }
            else if(x instanceof DerivedClassAB){
                System.out.println("DerivedClassAB value: " + x);
            }
            else if(x instanceof Boolean) {
                System.out.println("Boolean value: " + x);
            }
            else if(x instanceof Long) {
                System.out.println("Long value: " + x);
            }
            else if(x instanceof Double) {
                System.out.println("Double value: " + x);
            }
            else {
                System.out.println("Unknown type of value: " + x);
            }
        });
    }
}
