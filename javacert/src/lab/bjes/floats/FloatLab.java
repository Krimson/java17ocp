package lab.bjes.floats;

public class FloatLab {
    public FloatLab() {
        divideByZero();
        operandTypes();
    }

    private void divideByZero() {
        System.out.println("--- Float & Double - Infinities");
        System.out.println("While an Integral division by 0 would cause a ArithmeticException to be thrown, doing it on a float or double results in an infinity instead. ");
        float f = 10f / 0f;
        System.out.println("float f = 10f / 0f: " + f);
        System.out.println("Float.isFinite(f): " + Float.isFinite(f) + ". Float.isInfinite(f) : " + Float.isInfinite(f));
        System.out.println("From floats class: public static final float POSITIVE_INFINITY = 1.0f / 0.0f;");

        f = -10.0f / 0.0f;
        System.out.println("float f = -10.0f / 0.0f: " + f);
        System.out.println("Float.isFinite(f): " + Float.isFinite(f) + ". Float.isInfinite(f) : " + Float.isInfinite(f));
        System.out.println("These are the s");
        System.out.println("From floats class: public static final float NEGATIVE_INFINITY = -1.0f / 0.0f;");

        System.out.println("Same example with double: ");
        double d = 5 / 0.0;
        System.out.println("double d = 5 / 0.0: " + d);
        System.out.println("Double.isFinite(d): " + Double.isFinite(d) + ". Double.isInfinite(d): " + Double.isInfinite(d));

        d = -3 / 0d;
        System.out.println("d = -3 / 0d: " + d);
        System.out.println("Double.isFinite(d): " + Double.isFinite(d) + ". Double.isInfinite(d): " + Double.isInfinite(d));

        System.out.println("Example when using the wrapper class: ");
        Double dw = -5 / 0.;
        System.out.println("Double dw = -5 / 0.: " + dw);
        System.out.println("Double.isFinite(dw): " + Double.isFinite(dw) + ". Double.isInfinite(dw): " + Double.isInfinite(dw));

        dw = 3 / 0d;
        System.out.println("dw = 3 / 0d: " + dw);
        System.out.println("Double.isFinite(dw): " + Double.isFinite(dw) + ". Double.isInfinite(dw): " + Double.isInfinite(dw));
    }

    private void operandTypes() {
        System.out.println("--- Float & Double - Operand Types");
        int i = 10;
        float f = i + i;

        System.out.println("It's possible to create floats or floats using ints in most operations (not working in 0 division)");
        System.out.println("int i = 10;");
        System.out.println("float f = i + i: " + f);

        System.out.println("doubles can be created from floats, but not vice-versa (unless casting)");
        double d = f + f;
        System.out.println("double d = f + f: " + d);

        float f2 =  (float) d + (float) d;
        System.out.println("float f2 =  (float) d + (float) d : " + f2);
    }
}
