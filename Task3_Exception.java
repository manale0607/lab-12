import java.util.*;

public class Task3_Exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String input1 = sc.nextLine();

            System.out.print("Enter second number: ");
            String input2 = sc.nextLine();

            if (input1 == null || input1.isEmpty() ||
                    input2 == null || input2.isEmpty()) {
                throw new Exception("Input cannot be null or empty.");
            }

            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);

            System.out.print("Choose operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            double result = 0;

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operation.");
                    return;
            }

            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number (non-numeric input).");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
