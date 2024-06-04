package at.fhj.msd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(8, calculator.add(5, 3), "5 + 3 should equal 8");
        assertEquals(0, calculator.add(-2, 2), "-2 + 2 should equal 0");
        assertEquals(-5, calculator.add(-3, -2), "-3 + -2 should equal -5");
    }

    @Test
    public void testMinus() {
        assertEquals(2, calculator.minus(5, 3), "5 - 3 should equal 2");
        assertEquals(-4, calculator.minus(-2, 2), "-2 - 2 should equal -4");
        assertEquals(1, calculator.minus(-1, -2), "-1 - -2 should equal 1");
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should equal 2");
        assertEquals(-1, calculator.divide(-2, 2), "-2 / 2 should equal -1");
        assertEquals(2, calculator.divide(4, 2), "4 / 2 should equal 2");

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(1, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3), "5 * 3 should equal 15");
        assertEquals(-4, calculator.multiply(-2, 2), "-2 * 2 should equal -4");
        assertEquals(6, calculator.multiply(-3, -2), "-3 * -2 should equal 6");
    }
}
