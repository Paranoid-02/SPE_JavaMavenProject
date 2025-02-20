package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a / b;
    }

    public double squareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number!");
        }
        return Math.sqrt(x);
    }

    public int factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot calculate factorial of a negative number!");
        }
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Cannot calculate natural logarithm of a non-positive number!");
        }
        return Math.log(x);
    }

    public double power(double x, double b) {
        return Math.pow(x, b);
    }

}