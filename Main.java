import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        double amount;
        String fromCurrency, toCurrency;

        // Exchange rates (present date)
        double usdToEur = 0.93;
        double usdToGbp = 0.81;
        double usdToInr = 82.61;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        amount = scanner.nextDouble();

        System.out.print("Enter the currency to convert from (USD, EUR, GBP, INR): ");
        fromCurrency = scanner.next();

        System.out.print("Enter the currency to convert to (USD, EUR, GBP, INR): ");
        toCurrency = scanner.next();

        double convertedAmount;

        if (fromCurrency.equalsIgnoreCase("USD")) {
            switch (toCurrency.toUpperCase()) {
                case "EUR" -> {
                    convertedAmount = amount * usdToEur;
                    System.out.printf("%.2f USD is equal to %.2f EUR%n", amount, convertedAmount);
                }
                case "GBP" -> {
                    convertedAmount = amount * usdToGbp;
                    System.out.printf("%.2f USD is equal to %.2f GBP%n", amount, convertedAmount);
                }
                case "INR" -> {
                    convertedAmount = amount * usdToInr;
                    System.out.printf("%.2f USD is equal to %.2f INR%n", amount, convertedAmount);
                }
                default -> System.out.println("Invalid currency to convert to.");
            }
        } else {
            System.out.println("Invalid currency to convert from.");
        }

        scanner.close();
    }
}
