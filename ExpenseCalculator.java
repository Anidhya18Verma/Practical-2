/* Practical 2
Question 1 */

public class ExpenseCalculator {
    public static void main(String[] args) {
        // Read quantity and price from command line arguments
        int quantity = Integer.parseInt(args[0]);
        double price = Double.parseDouble(args[1]);

        // Calculate total expense
        double totalExpense = quantity * price;

        // Apply discount if quantity is more than 1000
        if (quantity > 1000) {
            totalExpense = totalExpense * 0.9; // 10% discount
        }

        // Print the total expense
        System.out.println("Total expense: " + totalExpense);
    }
}
