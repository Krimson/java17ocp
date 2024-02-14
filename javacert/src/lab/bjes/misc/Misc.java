package lab.bjes.misc;

public class Misc {
    /*
     Misc theoretical topics that can appear in the exam
    * */

    public Misc() {
        gc();
    }

    private void gc() {
        System.out.println("--- Misc - Garbage Collection");
        System.out.println("Setting an object to null makes it eligible to GC because there are no other references to it.");
        System.out.println("The JVM can be requested to run GC with the commands System.gc() and Runtime.getRuntime().gc(). But there's no guarantee that the JVM will do it. ");
    }

    private void encapsulation() {
        System.out.println("--- Misc - Encapsulation");
        System.out.println("A class that is properly/strongly encapsulated has private fields and public / private getters & setters");
    }

    private void cohesion() {
        System.out.println("--- Misc - Cohesion");
        System.out.println("Cohesion is the concept of having only relevant logic in classes, if a method doesn't belong in the class, create a new class where it does");
    }
}
