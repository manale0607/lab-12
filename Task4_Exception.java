import java.util.*;

public class Task4_Exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a sentence: ");
            String input = sc.nextLine();

            // Check null or empty
            if (input == null || input.trim().isEmpty()) {
                throw new Exception("Input string is null or empty.");
            }

            // Split into words
            String[] words = input.trim().split("\\s+");

            // Check less than two words
            if (words.length < 2) {
                throw new Exception("Sentence must contain at least two words.");
            }

            // Example operation:
            // Reverse the sentence
            StringBuilder reversed = new StringBuilder();

            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]).append(" ");
            }

            System.out.println("Modified Sentence: " + reversed.toString().trim());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
