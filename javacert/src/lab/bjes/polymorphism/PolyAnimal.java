package lab.bjes.polymorphism;

public class PolyAnimal {

    int legCount() {
        return 2;
    }
    String animalSound() {
        return "Squeek";
    };


    String reaction(String action) {
        if(action != null && action.equals("pet")) {
            return "happy";
        }
        return "no reaction";
    }

}
