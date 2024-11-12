import java.util.Scanner;

public class IT24103982Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Check if the number is exactly five digits
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid five-digit number.");
        } else {
            // Separate and print each digit
            int digit1 = number / 10000;         // First digit
            int digit2 = (number / 1000) % 10;   // Second digit
            int digit3 = (number / 100) % 10;    // Third digit
            int digit4 = (number / 10) % 10;     // Fourth digit
            int digit5 = number % 10;            // Fifth digit

            System.out.printf("%d %d %d %d %d%n", digit1, digit2, digit3, digit4, digit5);
        }

        scanner.close();
    }
}
