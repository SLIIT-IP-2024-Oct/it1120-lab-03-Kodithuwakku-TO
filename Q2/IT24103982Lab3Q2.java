import java.util.Scanner;
public class IT24103982Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter the monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();
        // Enter the number of OT hours
        System.out.print("Enter the number of OT hours: ");
        int otHours = scanner.nextInt();
        // Enter the OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();
        // Calculate the OT amount
        double otAmount = otHours * otHourlyRate;
        // Calculate the total salary
        double totalSalary = monthlySalary + otAmount;
        // Display the result
        System.out.printf("The total salary, including OT amount, is: %.2f%n", totalSalary);
        scanner.close();
    }
}