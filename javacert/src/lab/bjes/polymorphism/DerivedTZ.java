package lab.bjes.polymorphism;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DerivedTZ extends BaseTZ {

    // Overload: when a class both inherits and implements a method with the same name but different parameter data types
    // Override: when a class both inherits and implements a method with the same name using same parameter data types

    /*
    Inheriting:
    public  <T extends Number, Z extends Number> Map<T, Z> getMap(T t, Z z) {
        return new HashMap<T, Z>();
    }
    */

    public  <T, Z> Map<T, Z> getMap(T t, Z z) { // OK Overload, T, Z and T extends Number, Z extends Number are different parameter types
        return new TreeMap<T, Z>();
    }

    /*
    public Map<Number, Number> getMap(Number t, Number z) { // OK Override
        return new TreeMap<Number, Number>();
    }*/

    @Override // @Override not required, but it makes the compiler generate an error if method is incorrectly overridden
    public Map<Integer, Integer> getMap(Number t, Number z) { // OK Override
        return new HashMap<Integer, Integer>();
    }

}
