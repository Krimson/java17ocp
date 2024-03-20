package lab.bjes.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLab {
    public StreamLab() {
        streamTerminalOperation();
        streamInstance();
        streamCollections();
        intStreams();
        streamReduce();
    }

    private void streamTerminalOperation() {
        System.out.println("--- Stream - Terminal operations");
        Stream stream = Stream.of("streamElement1", "streamElement2", "streamElement2");

        // ignoring instruction in peek, due to non-terminal operation
        stream.distinct().peek(e -> System.out.println("Distinct element in stream: " + e + ". But wont print, cuz non-terminal operation"));

        Stream stream2 = Stream.of("streamElement1", "streamElement2", "streamElement2");
        List<String> stringList = stream2.distinct().peek(x -> System.out.println("Distinct element in stream: " + x)).toList();

        try{
            stringList = stream2.toList();
        }
        catch (IllegalStateException e){
            System.out.println("Could not operate on Stream twice, IllegalStateException...");
        }
    }

    private void streamInstance() {
        System.out.println("--- Stream - Instances");
        List<Object> objectList = new ArrayList<>(Arrays.asList("1", 2, 3, true));

        objectList.stream().filter(x -> x instanceof String).peek(x -> System.out.println("String element: " + x)).toList();
        objectList.stream().filter(x -> x instanceof Number).peek(x -> System.out.println("Number element: " + x)).toList();
        objectList.stream().filter(x -> x instanceof Integer).peek(x -> System.out.println("Integer element: " + x)).toList();
    }

    private void streamCollections() {
        System.out.println("--- Stream - Collections");

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 15, 20, 25);
        double avgValue = integerStream.collect(Collectors.averagingDouble(x -> x));
        System.out.println("Avarage value: " + avgValue);

        avgValue = Stream.of(1, 2, 3, 15, 20, 25).filter(x -> x > 10).collect(Collectors.averagingDouble(x -> x));
        System.out.println("Avarage value: " + avgValue);
    }

    private void intStreams() {
        System.out.println("--- Stream - IntStream");
        System.out.println("Creating IntStream with IntStream.range(4, 7)");
        IntStream intStream = IntStream.range(4, 7);
        OptionalInt optionalInt = intStream.sorted().findFirst();
        System.out.println("Found first element: " + optionalInt);

        System.out.println("Converting IntStream to Stream<Integer> using IntStream.range(4,7).boxed()");
        Stream<Integer> iStream = IntStream.range(4,7).boxed();
        iStream.sorted().findFirst();
        System.out.println("Found first element: " + optionalInt);

        System.out.println("--- Stream - Intstream sums");
        System.out.println("Sums: Checking value of IntStream.of(3,7,10).sum(): " + IntStream.of(3,7,10).sum());
        System.out.println("Sums: Checking value of Stream.of(2,5,6).mapToInt(x -> x*2).sum(): " + Stream.of(2,5,6).mapToInt(x -> x*2).sum());
    }

    private void streamReduce() {
        System.out.println("--- Stream - Reduce");

        System.out.println("Using reduce to calculate sum with different identity (initial value) parameter...");
        int sum = Stream.of( 1, 2, 3).reduce(0, (Integer a, Integer b) -> a+b);
        System.out.println("Stream.of( 1, 2, 3).reduce(0, (Integer a, Integer b) -> a+b): " + sum);

        sum = Stream.of( 1, 2, 3).reduce(10, (Integer a, Integer b) -> a+b);
        System.out.println("Stream.of( 1, 2, 3).reduce(10, (Integer a, Integer b) -> a+b): " + sum);

        //double avarage = Stream.of(3.0,5.5).reduce(2.3, (a, b) -> a + b); ?

        String[] arr = new String[] {"abc", "123", "hej"};
        String result = Arrays.stream(arr).reduce("init", (String subtotal, String element) -> subtotal + "_" + element);
        System.out.println("String[] arr = new String[] {\"abc\", \"123\", \"hej\"}");
        System.out.println("Arrays.stream(arr).reduce(\"init\", (String subtotal, String element) -> subtotal + \"_\" + element)");
        System.out.println("Result: " + result);
    }

    private void streamParallel() {
        System.out.println("--- Stream - Parallel");
    }
}
