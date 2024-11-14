package even.odd;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       boolean continueRunning = true;

        while (continueRunning) {
            // Initialize counters
            int evenCount = 0;
            int oddCount = 0;

            // Prompt the user to enter integers
            System.out.print("Enter a sequence of integers. Type ('done') when finished:");

            // Loop to take integer inputs
            while (input.hasNextInt()) {
                int number = input.nextInt();
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            // Clear the buffer by reading the next token (which is not an integer)
            input.next(); // this clears the non-integer token (e.g., "done")

            // Display the results
            System.out.println("Number of even integers: " + evenCount);
            System.out.println("Number of odd integers: " + oddCount);

            // Ask the user if they want to continue
            System.out.print("Do you want to enter another sequence? (yes/no): ");
            String response = input.next().trim().toLowerCase();

            // Check if response is "no"
            if (response.equals("no")) {
                continueRunning = false;
            } else if (!response.equals("yes")) {
                System.out.println("Invalid response. Exiting the program.");
                continueRunning = false;
            }

            // Print a line break before the next sequence
            if (continueRunning) {
                System.out.println();
            }
        }

        // Close the scanner
        input.close();
        System.out.println("Program Success.");
    }
}

