import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        try {
            if (num2 == 0) throw new ArithmeticException("Division by zero is not allowed.");
            System.out.println("Division: " + (num1 / num2));
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        scanner.close();
    }
}
