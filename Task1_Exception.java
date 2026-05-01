import java.util.*;

class Task1_Exception {
    public static void main(String[] args) {

        // Example input (you can also pass via args)
        String[] input = {"10", "20", "abc", "30"};

        if (input == null || input.length == 0) {
            System.out.println("Error: List is null or empty.");
            return;
        }

        double sum = 0;
        int count = 0;

        for (String s : input) {
            try {
                int num = Integer.parseInt(s);
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Skipping invalid value: " + s);
            }
        }

        if (count == 0) {
            System.out.println("Error: No valid integers in the list.");
        } else {
            double avg = sum / count;
            System.out.println("Average: " + avg);
        }
    }
}
