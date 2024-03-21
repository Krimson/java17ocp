package lab.bjes.functional.interfaces;

import lab.bjes.functional.interfaces.callable.CallableLab;
import lab.bjes.functional.interfaces.runnable.RunnableLab;

import java.util.Date;
import java.util.concurrent.*;

public class FiLab {
    public FiLab() {
        description();
        runnable();
        callable();
    }

    private void description() {
        System.out.println("--- Functional Interfaces - Description");
        System.out.println("Functional interfaces are interfaces that only contain one abstract method (Functional method), they are denoted with @FunctionalInterface");
        System.out.println("Java provides a bunch of functional interfaces in the package java.util.function");
    }

    private void runnable() {
        System.out.println("--- Functional Interfaces - Runnable, run()");
        System.out.println("Runnable tasks can be performed by a Thread or an ExecutorService.");

        System.out.println("While the Thread class provides ways to create and control multiple threads. The Runnable interface simply provides a way to perform one task in a new thread");
        System.out.println("By using Runnable and separating the task from the thread, the code becomes more modular. (A Runnable can be used by 2 separate new threads)");
        System.out.println("Initializing a new platform thread using Thread t = new Thread(new RunnableLab());");
        System.out.println("The class RunnableLab contains one method called run()");
        Thread t = new Thread(new RunnableLab());
        System.out.println("Starting the task with t.start();");
        t.start();

        System.out.println("When the Runnable has finished executing. The Thread that it was created on will end. ");


        System.out.println("Runnables can also be created by lambda expressions");
        System.out.println("Runnable r = () -> {\n" +
                "          System.out.println(\" * Runnable with Lambda Expression... * \");  \n" +
                "        }; \n" +
                "new Thread(r).start(); ");
        Runnable r = () -> {
            System.out.println(" * Runnable with Lambda Expression... * ");
        };
        new Thread(r).start();
    }

    private void callable() {
        System.out.println("--- Functional Interfaces - Callable, call()");
        System.out.println("Callable tasks are asynchronous tasks that are run using an ExecutorService");

        System.out.println("Create Executor with 1 thread using: ExecutorService executor = Executors.newFixedThreadPool(1);");
        ExecutorService executor = Executors.newFixedThreadPool(1);

        System.out.println("Create a Future by submitting the Callable: Future<String> future = executor.submit(new CallableLab());");
        System.out.println("The CallableLab has a method call() that returns a String with the thread name: return Thread.currentThread().getName()");
        Future<String> future = executor.submit(new CallableLab());

        try {
            System.out.println("Trying to return the Future<String> by calling future.get(), this requires catching InterruptedException and ExecutionException");
            System.out.println("Callable was run on thread: " + future.get() + " at " + new Date());
        }
        catch(InterruptedException | ExecutionException e) {
            System.out.println("InterruptedException or ExecutionException caught.");
        }


        System.out.println("Callables can also be created using Lambda Expressions: ");
        System.out.println("Callable c = () -> {return 1337;};");
        System.out.println("Future<Integer> f = executor.submit(c);");

        Callable c = () -> {
            return 1337;
        };
        Future<Integer> f = executor.submit(c);


        try {
            Integer result = f.get();
            System.out.println("Integer result = f.get(): " + result);
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException caught.");
        }
        catch (ExecutionException e) {
            System.out.println("ExecutionException caught.");
        }


        System.out.println("Shut down the ExecutorService: executor.shutdown();");
        executor.shutdown();
    }
}
