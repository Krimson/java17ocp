package lab.bjes.collectors;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsLab {
    public CollectorsLab() {
        mapCollect();
        joinCollect();
    }

    private void mapCollect() {
        System.out.println("--- Collectors - Collect to Map");
        System.out.println("Collecting a Stream of Strings and counting their occurrences: ");

        Stream<String> stream = Stream.of("123", "xyz", "abcd", "xyz", "231", "123");
        System.out.println("Stream<String> stream = Stream.of(\"123\", \"xyz\", \"abcd\", \"xyz\", \"231\", \"123\");");

        Map<String, Long> map = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Map<String, Long> map = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));");

        System.out.println(map);

        System.out.println("Getting specific value from key using map.get(\"xyz\")): " + map.get("xyz"));
    }

    private void joinCollect() {
        System.out.println("--- Collectors - Join to String");

        System.out.println("String cars = Stream.of(\"Volvo\", \"Saab\", \"Tesla\").collect(Collectors.joining(\",\"));");
        String cars = Stream.of("Volvo", "Saab", "Tesla").collect(Collectors.joining(","));

        System.out.println("cars: " + cars);
    }
}
