package day1;

import java.util.Scanner;

public class ProblemSet1 {

    public static void basicPatternPrinting() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Print the pattern
        for (int i=1; i<=numRows; i++) {
            System.out.println("*".repeat(i));
        }
    }

    public static void calcuator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;

        // Perform the calculation based on the operator

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        }

        System.out.println("Result: " + result);
    }

    public static void primeNumberChecker() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        // Check if the number is prime

        for (int i=2; i<=number/2; i++) {
            if (number % i == 0 || number == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

}
