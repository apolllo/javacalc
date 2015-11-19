import java.util.Arrays;

public class Calculator {

    public static void sum(double operand1, double operand2, double... operands) {
        double sum = operand1 + operand2;
        for(double operand : operands) sum += operand;
        System.out.println("Sum is " + sum);
    }

    public static void substract(double operand1, double operand2, double... operands) {
        double difference = operand1 - operand2;
        for(double operand : operands) difference -= operand;
        System.out.println("Difference is " + difference);
    }

    public static void multiply(double operand1, double operand2, double... operands) {
        double product = operand1 * operand2;
        for(double operand : operands) product *= operand;
        System.out.println("Product is " + product);
    }

    public static void divide(double operand1, double operand2, double... operands) {
        double quotient = operand1 / operand2;
        for(double operand : operands) quotient /= operand;
        System.out.println("Quotient is " + quotient);
    }
}
