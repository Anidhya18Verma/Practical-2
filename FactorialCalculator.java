/* Practical 2
Question 3 */

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;

            // Calculate factorial using a loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Display the result
            System.out.println("Factorial of " + number + " is " + factorial);
        }

        input.close();
    }
}
