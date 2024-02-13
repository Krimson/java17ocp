package lab.bjes.polymorphism;

public interface PolyAnimal {
    default int legCount() {return 2;}
    String animalSound();

    boolean hasFur();

    String reaction(String action);
}
