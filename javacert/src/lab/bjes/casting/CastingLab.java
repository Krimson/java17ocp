package lab.bjes.casting;

public class CastingLab {
    public CastingLab() {
        casting();
    }

    private void casting() {
        System.out.println("--- Casting");
        System.out.println("We got 3 classes: A, B extends A & C extends B. All contain a method void output()");

        System.out.println("A a = new A();");
        System.out.println("a.output(): ");
        A a = new A();
        a.output(); // This is class A

        System.out.println("a = new B();");
        System.out.println("a.output();");
        a = new B();
        a.output(); // This is class B

        System.out.println("a = new C();");
        System.out.println("a.output();");
        a = new C();
        a.output(); // This is class C

        System.out.println("a = (B) new C(); (Redundant cast to B)");
        System.out.println("a.output();");
        a = (B) new C(); // Casting to B redundant
        a.output(); // This is class C

        System.out.println("A super object can be assigned to the state of a child object, but not vice-versa.");
        System.out.println("B b = new B();");
        System.out.println("A a2 = b;");
        B b = new B();
        A a2 = b;
        System.out.println("a2.output();");
        a2.output();



        System.out.println("B b = new A(), NOK... Compilation error.");
        System.out.println("B b = (B) new A(): will result in ClassCastException. B is not a subclass of A");

    }
}

class A {
    public void output() {
        System.out.println("This is class A");
    }
}

class B extends A {
    public void output() {
        System.out.println("This is class B");
    }
}

class C extends B {
    public void output() {
        System.out.println("This is class C");
    }
}

/*
class C extends B, A { // NOK, Can only extend one class

}
 */
