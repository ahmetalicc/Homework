package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "70, 5, 14",
            "24, 6, 4",
            "14, 2, 7",
            "40, 2.5, 16",
            "56, 7, 8"
    })
    void testDivision(double dividend, double divisor, double expectedQuotient) {
        Calculator calculator = new Calculator();
        double result = calculator.divide(dividend, divisor);
        Assertions.assertEquals(expectedQuotient, result);
    }

    @Test
    void testDivisionByZero() {
        Calculator calculator = new Calculator();
        Exception exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(22, 0),
                "IllegalArgumentException expected."
        );
    }
}