package lab.bjes.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerLab {

    // Atomic usage: use atomic when in a multithreaded context for thread safety (AtomicBoolean, AtomicReference, AtomicLong also exist)
    /*
        Example:
        int i = 5;
        an Integer relates to 5 while an AtomicInteger relates to i

        Integers are object representations of literals and therefore immutable, can only be read
        AtomicIntegers are containers for those values, can be read and updated, same as assigning a value to a variable.
    */

    public AtomicIntegerLab() {
        atomicIntegerOps();
    }

    private void atomicIntegerOps() {
        System.out.println("--- Atomic Integers");

        AtomicInteger ai = new AtomicInteger(5);
        System.out.println("Created ai with initual value: " + ai);

        // AtomicInteger ai2 = 5; // no
        AtomicInteger ai2 = new AtomicInteger();
        System.out.println("Created ai2 without given starting value: " + ai2); // 0

        System.out.println("ai.getAndSet(10): " + ai.getAndSet(10)); // get 0 first, then set 10
        System.out.println("ai in next line: " + ai.get());
        System.out.println("ai.addAndGet(3): " + ai.addAndGet(3));
        System.out.println("ai.getAndDecrement(): " + ai.getAndDecrement());
        System.out.println("ai in next line: " + ai.get());
        System.out.println("ai.incrementAndGet(): " + ai.incrementAndGet());

        System.out.println();
        System.out.println("Compare: ");
        System.out.println("ai.compareAndExchange(25, 20), return value: " + ai.compareAndExchange(25, 20));
        System.out.println("ai: " + ai.get() + ". Not changed, because expected value (first param) was not correct. Trying again: ");
        System.out.println("ai.compareAndExchange(13, 20), return value: " + ai.compareAndExchange(13, 20));
        System.out.println("ai: " + ai.get());

        System.out.println("companyAndSet is the same but return a boolean");
        System.out.println("ai.compareAndSet(50, 100) " + ai.compareAndSet(50, 100));
        System.out.println("ai: " + ai.get());
        System.out.println("ai.compareAndSet(20, 100) " + ai.compareAndSet(20, 100));
        System.out.println("ai: " + ai.get());
    }
}
