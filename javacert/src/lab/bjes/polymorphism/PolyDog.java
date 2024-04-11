package lab.bjes.polymorphism;

public class PolyDog extends PolyAnimal{

    public PolyDog() {
        System.out.println("--- Polymorphism - Overriding & Overloading");
        System.out.println("Overriding = Run-time polymorphism");
        System.out.println("Overriding is when implementing a method (that already exist in the superclass) with the same name and SAME SIGNATURES"); // like legcount

        System.out.println("Overloading = Compile-time / static polymorphism");
        System.out.println("Overloading is when implementing a method (that already exist in the superclass) with the same name but DIFFERENT SIGNATURES, ie different amount or types on params"); // like reaction(String, String)
    }

    @Override
    public int legCount() {
        return 4;
    }

    public String animalSound() {
        return "Woof";
    }

    @Override
    public String reaction(String action) {
        if(action != null && action.equals("give bone")) {
            return "happy";
        }
        return null;
    }

    /* NOK - method reaction(string param) already exist
    public int reaction(String action) {
        return 0;
    }*/

    // Overload
    public int reaction(String action, String action2) {
        if(action != null && action.equals("give bone") &&
            action2 != null && action2.equals("ride car")) {
            return 1;
        }
        return 0;
    }
}
