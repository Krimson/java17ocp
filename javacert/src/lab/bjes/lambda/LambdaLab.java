package lab.bjes.lambda;

import java.util.Arrays;

public class LambdaLab {
    public LambdaLab() {
        lambdaExpressions();
    }

    private void lambdaExpressions() {
        var values = Arrays.asList("1st", "2", "3rd");


        System.out.println("--- Lambda Expressions - Parameters");
        System.out.println("Printing length of list  {\"1st\", \"2\", \"3rd\"}, twice");
        values.forEach(f -> System.out.println(f.length()));
        // values.forEach(var f -> System.out.println(f)); // NOK, use parenthesis if type should be given
        values.forEach((var f) -> System.out.println(f.length()));
    }
}
