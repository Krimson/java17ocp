package lab.bjes.loops;

public class LoopLab {
    public LoopLab() {
        whileLoop();
        doWhileLoop();
    }

    private void whileLoop() {
        System.out.println("--- Loops - While");
        System.out.println("A Loop must have its body reachable, ie you cant write a loop like this: while(false) {};. It will result in a compile-time error. ");

        System.out.println("Having a final variable can also make the body unreachable, for example: final int x = 3;");
        System.out.println("while(x > 2) {}: will compile, but will be an endless loop. ");
        System.out.println("while(x > 3) {}: won't compile, because body is unreachable. ");
    }
    private void doWhileLoop() {
        System.out.println("--- Loops - Do While");
        System.out.println("The body of a do-while loop will always execute once before checking if it should continue. ");

        System.out.println("do {System.out.println(\" * inside loop * \");} while(false); ");
        do {System.out.println(" * inside loop * ");} while(false);

        System.out.println("This would not be ");
    }
}
