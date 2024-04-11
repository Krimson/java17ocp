package lab.bjes.deques;


import java.util.ArrayDeque;
import java.util.Deque;

public class DequeLab {
    public DequeLab() {
        dequeInfo();
        arrayDeque();
    }

    private void dequeInfo() {
        System.out.println("--- Deques - Info");
        System.out.println("Deque is an interface that extends Queue -> Collection -> Iterable. ");
        System.out.println("It's implemented by ArrayDeque and LinkedList. ");
        System.out.println("Deque:s can be used both as a Queue (FIFO) or a Stack (LIFO). ");
    }

    private void arrayDeque() {
        System.out.println("--- Deques - Deque Operations");
        Deque<String> dq = new ArrayDeque<>();
        System.out.println("Deque<String> dq = new ArrayDeque<>();");

        System.out.println("Using push puts an element in the beginning of the Deque");
        dq.push("x");
        dq.push("y");
        dq.push("z");
        System.out.println("dq.push(\"x\");");
        System.out.println("dq.push(\"y\");");
        System.out.println("dq.push(\"z\");");
        printDeque(dq); // z, y, x

        System.out.println("Using add will add an element to the end of the Deque");
        dq.add("1");
        dq.add("2");
        dq.add("3");
        System.out.println("dq.add(\"1\");");
        System.out.println("dq.add(\"2\");");
        System.out.println("dq.add(\"3\");");
        printDeque(dq); // z, y, x, 1, 2, 3

        System.out.println("We can also use methods addFirst & addLast:");
        dq.addFirst("first");
        dq.addLast("last");
        System.out.println("dq.addFirst(\"first\");");
        System.out.println("dq.addLast(\"last\");");
        printDeque(dq);

        System.out.println("To extract values from the front (index 0), we can use remove()");
        System.out.println("dq.remove(): " + dq.remove());
        System.out.println("dq.remove(): " + dq.remove());
        printDeque(dq);


        System.out.println("Or we can use removeFirst & removeLast: ");
        System.out.println("dq.removeFirst(): " + dq.removeFirst());
        System.out.println("dq.removeLast(): " + dq.removeLast());
        printDeque(dq);

        System.out.println("We can use getFirst() and getLast() to retrieve a value without removing it: ");
        System.out.println("dq.getFirst(): " + dq.getFirst());
        System.out.println("dq.getLast(): " + dq.getLast());
        printDeque(dq);

        System.out.println("In order to get the Deque in reversed order, we can use .reversed(): ");
        System.out.println("printDeque(dq.reversed()): ");
        printDeque(dq.reversed());
    }

    private void printDeque(Deque<String> dq) {
        System.out.println("Deque order: ");
        for(String s : dq) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }
}
