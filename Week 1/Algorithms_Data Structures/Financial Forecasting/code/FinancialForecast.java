import java.util.Scanner;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValue(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        } else {
            return futureValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter initial investment amount: ");
        double initialAmount = scanner.nextDouble();

        System.out.print("Enter annual growth rate (in %): ");
        double growthRatePercent = scanner.nextDouble();
        double growthRate = growthRatePercent / 100.0;

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        // Calculate future value
        double result = futureValue(initialAmount, growthRate, years);

        // Display result
        System.out.printf("Future value after %d years: %.2f\n", years, result);

        scanner.close();
    }
}
