package lab.bjes.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLab {

    public StreamLab() {
        streamTerminalOperation();
        streamInstance();
        streamCollections();
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

    private void streamReduce() {
        System.out.println("--- Stream - Reduce");
    }

    private void streamParallel() {
        System.out.println("--- Stream - Parallel");

    }
}
