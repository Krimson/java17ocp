package lab.bjes.misc;

public class Misc {
    /*
     Misc theoretical topics that can appear in the exam
    * */

    public Misc() {
        platformIndependent();
        serialization();
        gc();
        encapsulation();
        cohesion();
        moduleInfo();
    }

    private void platformIndependent() {
        System.out.println("--- Misc - Platform independency");
        System.out.println("--- Java is platform independent because it the code (.java) is compiled to bytecode (.class) by the javac compiler. That bytecode can then be run on any machine that has a JVM. ");
    }

    // serialization
    private void serialization() {
        System.out.println("--- Misc - Serialization");
        System.out.println("Serialization is when converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the Java object in memory, which is used to persist an object. ");
        System.out.println("Serialization rules: ");
        System.out.println("1: If a parent class has implemented the Serializable interface then the subclass doesn't need to. ");
        System.out.println("2: Only non-static data members are saved via the Serialization process. ");
        System.out.println("3: Static & Transient data members are not saved via the Serialization process. So if a value of a non-static data member shouldn't be saved it should be a transient data member. ");
        System.out.println("4: Constructor of object is never called when an object is deserialized. ");


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

    private void moduleInfo() {
        System.out.println("--- Misc - module-info");
        System.out.println("1) The module-info file must be placed in the root directory of a module");
        System.out.println("2) It can't be empty, it must specify the name of the module, ie minimum: \"module com.xyz.hr{" +
                "}\"");
        System.out.println("3) module-info.java is compiled into module-info.class by the compiler");
        System.out.println("4) A module doesn't depend or belong to any package. Packages belong to a module. ");
    }

    private void javaCommand() {}

    private void jdepsCommand() {

    }

    private void jmodCommand() {

    }

    // callable + runnable, test5q39
}
