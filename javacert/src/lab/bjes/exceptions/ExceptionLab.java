package lab.bjes.exceptions;

import java.io.IOException;

class NestedException {
    public int stringLength(String s) throws NullPointerException, IOException  {
        return s.length();
    }
}

public class ExceptionLab {
    public ExceptionLab() {
        mainException();
        customException();
        finallyFlow();
    }
    private void mainException() {
        System.out.println("--- Exceptions - Throws");
        NestedException nestedException = new NestedException();

        System.out.println("Attempting to use nested class method that throws ");

        String sa[] = new String[] {"test", "123", null};
        for(String s : sa) {
            try {
                System.out.println("Attempting to check length of String: " + s);
                System.out.println("It was: " + nestedException.stringLength(s));
            }
            catch(NullPointerException npe) { // Need to catch all CHECKED EXCEPTIONS THROWN, ie this isn't necessary
                System.out.println("Caught NPE :O");
            }
            catch (IOException ioe) { // but this is
                System.out.println("Caught IOException :O");
            }
        }
    }
    private void customException() {
        System.out.println("--- Exceptions - Custom Exceptions");
        try {
            throw new CustomException("Custom error occurred");
        }
        catch (CustomException ce) {
            System.out.println("Custom exception caught. ");
            //ce.printStackTrace();
        }
    }

    private void finallyFlow() {
        System.out.println("--- Exceptions - Finally");
        System.out.println("Finally block always runs after a try or catch has finished.");
        try {
            System.out.println("In try: return;");
            return;
        }
        catch (Exception e) {
            System.out.println("Caught exception");
        }
        finally {
            System.out.println("Finally runs before return happens!");
        }
        System.out.println("Not reaching this");
    }
}


