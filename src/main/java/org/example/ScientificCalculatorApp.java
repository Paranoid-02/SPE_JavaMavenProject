package org.example;
import java.util.Scanner;

public class ScientificCalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double x = scanner.nextDouble();
                    System.out.println("Square Root: " + calculator.squareRoot(x));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int n = scanner.nextInt();
                    System.out.println("Factorial: " + calculator.factorial(n));
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double y = scanner.nextDouble();
                    System.out.println("Natural Logarithm: " + calculator.naturalLog(y));
                    break;
                case 4:
                    System.out.print("Enter base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent (b): ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Power: " + calculator.power(base, exponent));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}