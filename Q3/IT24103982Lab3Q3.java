import java.util.Scanner;
public class IT24103982Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter the rupee amount
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();
        // Define the denominations
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[denominations.length];
        // Calculate the number of each denomination
        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                count[i] = amount / denominations[i];
                amount %= denominations[i];
            }
        }
        // Display the results
        System.out.println("Denominations:");
        for (int i = 0; i < denominations.length; i++) {
            if (denominations[i] >= 10) {
                System.out.printf("%d Notes – %d%n", denominations[i], count[i]);
            } else {
                System.out.printf("%02d Coins – %d%n", denominations[i], count[i]);
            }
        }
        scanner.close();
    }
}