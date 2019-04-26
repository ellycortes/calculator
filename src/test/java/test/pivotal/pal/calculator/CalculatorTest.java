package test.pivotal.pal.calculator;

import io.pivotal.pal.calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        int expected = 3;
        Calculator calculator = new Calculator(1, 2);
        int actual = calculator.add();
        assertEquals(expected, actual);
    }

    @Test
    public void testSub() {
        int expected = 1;
        Calculator calculator = new Calculator(2, 1);
        int actual = calculator.sub();
        assertEquals(expected, actual);
    }

    @Test
    public void testMul() {
        int expected = 64;
        Calculator calculator = new Calculator(8, 8);
        int actual = calculator.mul();
        assertEquals(expected, actual);
    }

    @Test
    public void testDiv() {
        int expected = 8;
        Calculator calculator = new Calculator(64, 8);
        int actual = calculator.div();
        assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        Calculator calculator = new Calculator(64, 0);
        int actual = calculator.div();
    }
}
