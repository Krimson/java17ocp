package lab.bjes;

import lab.bjes.arrays.ArrayLab;
import lab.bjes.arrays.MultidimensionalArrayLab;
import lab.bjes.atomic.AtomicIntegerLab;
import lab.bjes.enums.EnumOrderLab;
import lab.bjes.exceptions.ExceptionLab;
import lab.bjes.floats.FloatLab;
import lab.bjes.functional.interfaces.FiLab;
import lab.bjes.instance.InstanceOfLab;
import lab.bjes.interfaces.DerivedClassAB;
import lab.bjes.lambda.LambdaLab;
import lab.bjes.misc.Misc;
import lab.bjes.paths.PathLab;
import lab.bjes.polymorphism.PolyDog;
import lab.bjes.records.RecordLab;
import lab.bjes.serialization.SerializationLab;
import lab.bjes.streams.StreamLab;
import lab.bjes.strings.StringLab;
import lab.bjes.switches.SwitchLab;
import lab.bjes.time.TimeLab;
import lab.bjes.varargs.VarargsLab;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean runAll = args == null || args.length == 0;

        // Streams
        // collectors, summarizing int  etc
        // parallel stream
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("stream"))) {
            StreamLab streamLab = new StreamLab();
        }

        // Arrays
        // + add Arrays.compare, Arrays.mismatch
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("array"))) {
            ArrayLab arrayLab = new ArrayLab();
        }

        // Paths
        // + is valid, test 4 q 15
        // + copy q40 test 5
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

        // Float
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("float"))) {
            FloatLab floatLab = new FloatLab();
        }

        // Priority
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("prio"))) {

        }



        // nested class


        // multidimensional array
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("multi"))) {
            MultidimensionalArrayLab multidimensionalArrayLab = new MultidimensionalArrayLab();
        }

        // Varargs
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("varargs"))) {
            VarargsLab varargsLab = new VarargsLab();
        }


        // loops + do; while

        // Records
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("record"))) {
            RecordLab recordLab = new RecordLab();
        }

        // Strings
        // + isBlank()
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("string"))) {
            StringLab stringLab = new StringLab();
        }

        // Switch
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("switch"))) {
            SwitchLab switchLab = new SwitchLab();
        }

        // Instanceof
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("instanceof"))) {
            InstanceOfLab instanceOfLab = new InstanceOfLab();
        }

        // Enums
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("enums"))) {
            EnumOrderLab enumOrderLab = new EnumOrderLab();
        }

        // Collections
        // compareTo with null as second param
        // test 4 q13

        // Locales + resource bundles for different langs

        // jdbc with own module + autocommit (on con or stmt?)

        // autocloseable + trywithresources + everything might not be thrown if theres no proper catch??

        // functional interface + supplier/function

        // ArrayDequeue remove() <-- important (can act as both queue and stack)

        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("serialize"))) {
            try {
                SerializationLab serializationLab = new SerializationLab();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                System.out.println("Exception caught in SerializationLab...");
            }

        }

        // observable fi?

        // module info

        // Time (LocalDateTime, Period, Duration etc)
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("time"))) {
            TimeLab timeLab = new TimeLab();
        }

        // concurrency

        // reflection

        // RandomAccessFile, test 4 q6

        // Functional Interfaces
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("functional"))) {
            FiLab fiLab = new FiLab();
        }

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
