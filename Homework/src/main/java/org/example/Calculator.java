package org.example;

public class Calculator {
    public double divide(double dividend, double divisor) {
        double result;
        if (divisor == 0) throw new IllegalArgumentException("Divide by zero exception.");
        result = dividend / divisor;
        return result;
    }
}
