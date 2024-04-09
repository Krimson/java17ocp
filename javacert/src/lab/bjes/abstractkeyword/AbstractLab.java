package lab.bjes.abstractkeyword;

public class AbstractLab {
    public AbstractLab() {
        abstractClass();
        abstractMethods();
    }

    private void abstractClass() {
        System.out.println("--- Abstraction - Classes");
        System.out.println("Abstract classes can NOT be instantiated, in order to create an object of it, it must be inherited from another class. ");
        System.out.println("An abstract class can have 0,1 or many abstract methods. It can also have non-abstract methods. ");

        System.out.println("Example, we have an abstract class Animal extended by a class Dog. The Animal class has a method public abstract void animalSound(), which is implemented in Dog.");
        Animal animal = new Dog();
        System.out.println("Animal animal = new Dog(); ");
        System.out.print("animal.animalSound(): ");
        animal.animalSound();
    }

    private void abstractMethods() {
        System.out.println("--- Abstraction - Methods");
        System.out.println("An abstract method can only be declared in an abstract class. It cannot have a body (body is provided in the subclass). ");
    }
}

abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println(" * Barking * ");
    }
}

abstract class Rodent extends Animal {
    public void sleep() {
        System.out.println("ZZZZZZZZ");
    }
}

class Beaver extends Rodent {
    @Override
    public void animalSound() {
        System.out.println(" * Hissing * ");
    }
}