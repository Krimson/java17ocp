package lab.bjes;

import lab.bjes.arrays.ArrayLab;
import lab.bjes.atomic.AtomicIntegerLab;
import lab.bjes.exceptions.ExceptionLab;
import lab.bjes.interfaces.DerivedClassAB;
import lab.bjes.lambda.LambdaLab;
import lab.bjes.misc.Misc;
import lab.bjes.paths.PathLab;
import lab.bjes.polymorphism.PolyDog;
import lab.bjes.streams.StreamLab;
import lab.bjes.switches.SwitchLab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean runAll = args == null || args.length == 0;

        // Streams
        // + sum (doesnt exist in stream, but in int stream, via mapToInt)
        // collectors, summarizing int  etc

        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("stream"))) {
            StreamLab streamLab = new StreamLab();
        }

        // Arrays
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("array"))) {
            ArrayLab arrayLab = new ArrayLab();
        }

        // Paths
        // + get paths from string
        // + subpath (test 4 q11)
        // + get name
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("path"))) {
            PathLab pathLab = new PathLab();
        }

        // Polymorphism
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("poly"))) {
            // Overloading: compile-time polymorphism / static polymorphism
            // Overriding: run-time polymorphism
            PolyDog polyDog = new PolyDog();
        }

        // Interfaces
        // add interfaces extending other interfaces & abstract classes
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("interface"))) {
            DerivedClassAB derivedClassAB = new DerivedClassAB();
            derivedClassAB.methodA();
        }

        // Exceptions
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("exception"))) {
            ExceptionLab exceptionLab = new ExceptionLab();
        }

        // Atomic Integers
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("atomic"))) {
            AtomicIntegerLab atomicIntegerLab = new AtomicIntegerLab();
        }

        // Lambda expressions
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("lambda"))) {
            LambdaLab lambdaLab = new LambdaLab();
        }



        // Priority
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("prio"))) {

        }



        // nested class
        // matrix/table test4q14


        // loops + do; while

        // Records
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("record"))) {

        }

        // String (stringbuild, append, substring)
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("string"))) {

        }

        // Switch (test 3 q24)
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("switch"))) {
            SwitchLab switchLab = new SwitchLab();
        }


        // Enum
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("enum"))) {

        }

        // Collections
        // compareTo with null as second param
        // test 4 q13

        // Locales + resource bundles for different langs

        // jdbc with own module + autocommit (on con or stmt?)

        // autocloseable + trywithresources + everything might not be thrown if theres no proper catch??

        // functional interface + supplier/function

        // ArrayDequeue remove() <-- important (can act as both queue and stack )

        // intstream

        // serializable

        // observable

        // module info

        // concurrency

        // reflection

        // time calulation, test 4 q5

        // RandomAccessFile, test 4 q6

        // Futures (implements Callable t4q7)

        // Misc
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("misc"))) {
            Misc misc = new Misc();
        }

    }
}


/*

compile: javac lab.bjes.Main.java
create jar: jar -cf myJar.jar lab.bjes.Main.class lab/bjes/* /*.class

execute: java -cp myJar.jar lab.bjes.Main









* */
