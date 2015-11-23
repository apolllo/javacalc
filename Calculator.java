import java.math.BigDecimal;

public class Calculator {

    private static void printResultToConsole(long result, String operation) {
        switch (operation) {
            case "add":
                System.out.println("Sum is " + result);
                break;
            case "substract":
                System.out.println("Difference is " + result);
                break;
            case "multiply":
                System.out.println("Product is " + result);
                break;
        }
    }
    private static void printResultToConsole(BigDecimal result) {
        System.out.println("Quotient is " + result.toString());
    }

    public static void add(int operand1, int operand2) {
        long sum = (long)operand1 + operand2;
        printResultToConsole(sum, "add");
    }

    public static void substract(int operand1, int operand2) {
        long difference = (long)operand1 - operand2;
        printResultToConsole(difference, "substract");
    }

    public static void multiply(int operand1, int operand2) {
        long product = (long)operand1 * operand2;
        printResultToConsole(product, "multiply");
    }

    public static void divide(int operand1, int operand2) {
        BigDecimal quotient = new BigDecimal(operand1).divide(new BigDecimal(operand2), 10, BigDecimal.ROUND_HALF_UP);
        printResultToConsole(quotient);
    }
}
