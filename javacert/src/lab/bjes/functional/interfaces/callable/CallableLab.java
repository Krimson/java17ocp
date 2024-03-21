package lab.bjes.functional.interfaces.callable;

import java.util.concurrent.Callable;

public class CallableLab implements Callable<String> {
    @Override
    public String call() throws Exception {
        /*try { // Uncommenting this will halt the program for 5 seconds at the Future.get()
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        return Thread.currentThread().getName();
    }
}
