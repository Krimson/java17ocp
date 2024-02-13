package lab.bjes.polymorphism;

import java.util.HashMap;
import java.util.Map;

public class BaseTZ {
    public  <T extends Number, Z extends Number> Map<T, Z> getMap(T t, Z z) {
        return new HashMap<T, Z>();
    }
}
