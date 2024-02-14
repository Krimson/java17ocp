package lab.bjes.interfaces;

public class DerivedClassAB implements InterfaceA, InterfaceB{

    @Override
    public void methodA() {
        System.out.println("--- Interfaces - Ambiguity: Need to implement default method because both interfaces has methodA");
    }

    @Override
    public void methodB() {

    }


}
