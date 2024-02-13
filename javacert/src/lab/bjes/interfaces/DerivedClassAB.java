package lab.bjes.interfaces;

public class DerivedClassAB implements InterfaceA, InterfaceB{

    @Override
    public void methodA() {
        System.out.println("--- Interfaces - Ambiguity: Need to override methodA since it otherwise exist in both InterfaceA and InterfaceB");
    }
}
