import java.util.Arrays;

public class Calculator {

    public static void presentResult(String result) {
        System.out.println(result);
    }

    public static void sum(int operand1, int operand2) {
        long sum = (long)operand1 + operand2;
        presentResult("Sum is " + sum);
    }

    public static void substract(int operand1, int operand2) {
        long difference = (long)operand1 - operand2;
        presentResult("Difference is " + difference);
    }

    public static void multiply(int operand1, int operand2) {
        long product = (long)operand1 * operand2;
        presentResult("Product is " + product);
    }

    public static void divide(int operand1, int operand2) {
        double quotient = (double)operand1 / operand2;
        presentResult("Quotient is " + quotient);
    }
}
