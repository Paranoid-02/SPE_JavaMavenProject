package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(6, 0);
        });
        assertEquals("Cannot divide by zero!", exception.getMessage());
    }

    @Test
    void testSquareRoot() {
        assertEquals(2.0, calculator.squareRoot(4.0));
        assertEquals(3.0, calculator.squareRoot(9.0));
    }

    @Test
    void testSquareRootNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(-4.0);
        });
        assertEquals("Cannot calculate square root of a negative number!", exception.getMessage());
    }

    @Test
    void testFactorial() {
        assertEquals(120, calculator.factorial(5));
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void testFactorialNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-5);
        });
        assertEquals("Cannot calculate factorial of a negative number!", exception.getMessage());
    }

    @Test
    void testNaturalLog() {
        assertEquals(1.0, calculator.naturalLog(Math.E), 0.0001);
    }

    @Test
    void testNaturalLogNonPositive() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.naturalLog(0);
        });
        assertEquals("Cannot calculate natural logarithm of a non-positive number!", exception.getMessage());
    }

    @Test
    void testPower() {
        assertEquals(8.0, calculator.power(2.0, 3.0));
        assertEquals(1.0, calculator.power(5.0, 0.0));
    }
}