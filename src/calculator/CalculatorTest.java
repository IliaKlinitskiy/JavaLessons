package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void sum() {
        Calculator calculator = new Calculator();
        int expected = 15;
        int result = calculator.sum(10, 5);
        assertEquals(expected, result);
        int expected1 = 105;
        int result1 = calculator.sum(100, 5);
        assertEquals(expected1, result1);
    }

    @Test
    public void multiplication() {
        Calculator calculator = new Calculator();
        double expected = 15;
        double result = calculator.multiplication(5, 3);
        assertEquals(expected, result, 0.0001);
        double expected1 = 9;
        double result1 = calculator.multiplication(3, 3);
        assertEquals(expected1, result1, 0.00001);
    }

    @Test
    public void divide() {
        Calculator calculator = new Calculator();
        double expected = 15;
        double result = calculator.divide(150, 10);
        assertEquals(expected, result, 0.00001);
        double expected1 = 3;
        double result1 = calculator.divide(9, 3);
        assertEquals(expected1, result1, 0.0001);
    }

    @Test
    public void squareNumber() {
        Calculator calculator = new Calculator();
        double expected = 25;
        double result = calculator.squareNumber(5);
        assertEquals(expected, result, 0.0001);
        double expected1 = 225;
        double result1 = calculator.squareNumber(15);
        assertEquals(expected1, result1, 0.0001);
    }


}