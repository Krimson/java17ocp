package lab.bjes.interfaces;

public interface InterfaceB {
    static final String s = "string"; // static & final redundant
    default void methodA() {}

    void methodB();

    default void methodC() {};
}
