import java.util.Scanner;

public class IT24103982Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the price of 1kg of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Prompt user to enter the number of kilograms they want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();

        // Calculate the total amount to pay before discount
        double totalAmount = pricePerKg * quantity;

        // Calculate the discount (10% of the total amount)
        double discount = totalAmount * 0.10;

        // Calculate the final amount after applying the discount
        double finalAmount = totalAmount - discount;

        // Display the result
        System.out.printf("The total amount to pay after a 10%% discount is: %.2f%n", finalAmount);

        scanner.close();
    }
}
