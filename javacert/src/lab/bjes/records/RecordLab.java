package lab.bjes.records;


import java.io.Serial;
import java.io.Serializable;

public class RecordLab {
    public RecordLab() {
        testPersonRecord();
        recordImplements();
    }

    private void testPersonRecord() {
        System.out.println("--- Records");
        System.out.println("Records are final and can't have instance fields (static OK), it's instance fields are created automatically by the compiler using the given parameters");

        PersonRecord pr = new PersonRecord(30, "bjes");
        System.out.println("We have the record: record PersonRecord(int age, String name)");
        System.out.println("PersonRecord pr = new PersonRecord(30, \"bjes\")");

        System.out.println(pr);
        System.out.println("pr.age(): " + pr.age());
    }

    private void recordImplements() {
        System.out.println("--- Records - Implements");
        System.out.println("Records can implement interfaces");

        AnimalRecord ar = new AnimalRecord(4, "Dog");

        System.out.println("We got the interface & regord: ");
        System.out.println("interface AnimalRecordBase {\n" +
                "    int legs();\n" +
                "    String type();\n" +
                "}");
        System.out.println("record AnimalRecord(int legs, String types) implements AnimalRecordBase");
        System.out.println("Created record using: new AnimalRecord(4, \"Dog\")");
        System.out.println(ar);
        System.out.println("There is a method called weakness() that returns a specific String, but this is not part of the record. ");
        System.out.println("ar.weakness(): " + ar.weakness());
        System.out.println("It's possible to override record fields as well, so that ar.legs() would return something predetermined, but the record itself will contain the constructed value");
        System.out.println("ar.legs(): " + ar.legs());
    }
}

record PersonRecord(int age, String name) implements Serializable {
    // int noInstanceFieldsAllowed;
    @Serial
    static final long serialVersionUID = 15L; // static fields OK
    static String type = "Human";

    /*public void setName(String name) { // NOK! name is final!
        this.name = name;
    }*/
}

interface AnimalRecordBase {
    int legs();
    String type();
}

record AnimalRecord(int legs, String type) implements AnimalRecordBase {
    public String weakness() {
        return "Being alone";
    }

    @Override
    public int legs() {
        return 2;
    }
}

// RECORDS ARE ALWAYS FINAL!!
/*
The following are NOK
abstract record notAbstract () {

}

sealed record notSealed() {
    // sealed & final = illegal combination
}

non-sealed record nonSealed() {

}
*/