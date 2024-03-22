package lab.bjes.optionals;

import java.util.Map;
import java.util.Optional;

public class OptionalLab {
    public OptionalLab() {
        optionalLab();
    }

    private void optionalLab() {
        System.out.println("--- Optional");
        System.out.println("Retrieving Optional values on this map: ");
        System.out.println("Map<String, String> map = Map.ofEntries(Map.entry(\"Sweden\", \"Stockholm\"), Map.entry(\"Norway\", \"Oslo\"), Map.entry(\"Spain\", \"Madrid\"));");
        System.out.println("return map.get(country);");

        Optional<String> capital = Optional.of(getCapital("Sweden"));
        System.out.println("Optional<String> capital = Optional.of(getCapital(\"Sweden\")): " + capital);
        System.out.println("capital.get(): " + capital.get());

        capital = Optional.ofNullable(getCapital("Swed"));
        System.out.println("Optional.of(null) will cause a NPE. Should use ofNullable");
        System.out.println("capital = Optional.ofNullable(getCapital(\"Swed\")): " + capital);
        System.out.println("capital.get(): NPE!!");

        System.out.println("Can use orElse, orElseGet or orElseThrow if Optional is empty. ");
        capital = Optional.ofNullable(getCapital("Spanien"));
        System.out.println("capital = Optional.ofNullable(getCapital(\"Spanien\")): " + capital);
        String cap = capital.orElse(getCapital("Span"));
        System.out.println("String cap = capital.orElse(getCapital(\"Span\")): " + cap);

        System.out.println("similar to orElse, but orElseGet takes a Supplier function as argument");
        cap = capital.orElseGet(() -> getCapital("span"));
        System.out.println("cap = capital.orElseGet(() -> getCapital(\"span\")): " + cap);
    }

    private String getCapital(String country) {
        Map<String, String> map = Map.ofEntries(Map.entry("Sweden", "Stockholm"), Map.entry("Norway", "Oslo"), Map.entry("Spain", "Madrid"));
        return map.get(country);
    }
}
