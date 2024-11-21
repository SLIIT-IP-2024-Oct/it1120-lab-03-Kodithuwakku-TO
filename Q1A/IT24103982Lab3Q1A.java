import java.util.Scanner;
public class IT24103982Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter the price of 1kg of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        // Enter the number of kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();
        // Calculate the total amount to pay
        double totalAmount = pricePerKg * quantity;
        // Output the result
        System.out.printf("The total amount to pay is: %.2f%n", totalAmount);
        scanner.close();
    }
}