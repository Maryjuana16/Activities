/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operator (1. For Addition "
                + "2. For Subtraction "
                + "3. For Multiplication "
                + "4. For Division ):");
        String operator = scanner.next();

        switch (operator) {
            case "1":
                addition(scanner);
                break;
            case "2":
                subtraction(scanner);
                break;
            case "3":
                multiplication(scanner);
                break;
            case "4":
                division(scanner);
                break;
            default:
                System.out.println("Invalid operator. Please choose +, -, *, or /.");
        }

        scanner.close();
    }

    private static void addition(Scanner scanner) {
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    private static void subtraction(Scanner scanner) {
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    private static void multiplication(Scanner scanner) {
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    private static void division(Scanner scanner) {
        System.out.println("Enter the dividend:");
        double dividend = scanner.nextDouble();
        System.out.println("Enter the divisor (non-zero):");
        double divisor = scanner.nextDouble();

        if (divisor != 0) {
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
