package lab.bjes;

import lab.bjes.arrays.ArrayLab;
import lab.bjes.interfaces.DerivedClassAB;
import lab.bjes.paths.PathLab;
import lab.bjes.polymorphism.PolyDog;
import lab.bjes.streams.StreamLab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean runAll = args.length == 0 ? true: false;

        // Streams
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("streams"))) {
            StreamLab streamLab = new StreamLab();
        }

        // Arrays
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("arrays"))) {
            ArrayLab arrayLab = new ArrayLab();
        }

        // Paths
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("paths"))) {
            PathLab pathLab = new PathLab();
        }

        // Polymorphism
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("polys"))) {
            // Overloading: compile-time polymorphism / static polymorphism
            // Overriding: run-time polymorphism
            PolyDog polyDog = new PolyDog();
        }

        // Interfaces
        if(runAll || Arrays.stream(args).anyMatch(x -> x.equals("interfaces"))) {
            DerivedClassAB derivedClassAB = new DerivedClassAB();
            derivedClassAB.methodA();
        }

        // substring

        // switch

        // enums

        // paths + resolve p1 and p2

        // jdbc with own module + autocommit (on con or stmt?)

        // T & Z overload + override

        //string  sa[] = new string {"1", "2"}

        // throws exceptions in nested methods

        // autocloseable + trywithresources + everything might not be thrown if theres no proper catch??

        // functional interface + supplier/function

        // ArrayDequeue remove()

        // intstream

        // AtomicInteger

        // serializable

        // observable

        // module info

        // concurrency


    }
}


/*

compile: javac lab.bjes.Main.java
create jar: jar -cf myJar.jar lab.bjes.Main.class lab/bjes/* /*.class

execute: java -cp myJar.jar lab.bjes.Main









* */
