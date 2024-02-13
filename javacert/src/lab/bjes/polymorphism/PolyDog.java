package lab.bjes.polymorphism;

public class PolyDog implements PolyAnimal{

    public PolyDog() {
        System.out.println("--- Polymorphism - Overriding");
    }

    @Override
    public int legCount() {
        return 4;
    }

    public String animalSound() {
        return "woof";
    }

    @Override
    public boolean hasFur() {
        return true;
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

    public int reaction(String action, String action2) {
        if(action != null && action.equals("give bone") &&
            action2 != null && action2.equals("ride car")) {
            return 1;
        }
        return 0;
    }
}
