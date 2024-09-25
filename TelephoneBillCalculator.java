/* Practical 2
Question 2 */

import java.util.Scanner;
public class TelephoneBillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input telephone number and number of calls
        System.out.print("Enter the telephone number: ");
        String telephoneNumber = input.nextLine();
        
        System.out.print("Enter the number of calls made: ");
        int numberOfCalls = input.nextInt();

        // Calculate the total bill
        double totalBill = 400.0; // Fixed rent
        if (numberOfCalls > 50) {
            totalBill += (numberOfCalls - 50) * 0.50; // Charge for extra calls
        }

        // Display the result
        System.out.println("Telephone Number: " + telephoneNumber);
        System.out.println("Total Bill: Rs " + totalBill);
        
        input.close();
    }
}
