import java.util.*;

public class Task2_Exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        try {
            if (input == null || input.isEmpty()) {
                throw new Exception("Input is null or empty.");
            }

            int n = Integer.parseInt(input);

            if (n < 0) {
                throw new Exception("Negative numbers not allowed.");
            }

            long fact = 1;

            for (int i = 1; i <= n; i++) {
                fact *= i;

                // Overflow check
                if (fact < 0) {
                    throw new ArithmeticException("Integer overflow occurred.");
                }
            }

            System.out.println("Factorial of " + n + " = " + fact);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid integer (non-numeric input).");
        } catch (ArithmeticException e) {
            System.out.println("Error: Number too large (overflow).");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
