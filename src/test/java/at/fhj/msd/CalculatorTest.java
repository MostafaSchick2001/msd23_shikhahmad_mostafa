package at.fhj.msd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculatorTest {
    private Calculator calculator;
    private static final Logger logger = LogManager.getLogger(CalculatorTest.class);
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        logger.debug("Testing add method");
        assertEquals(8, calculator.add(5, 3), "5 + 3 should equal 8");
        assertEquals(0, calculator.add(-2, 2), "-2 + 2 should equal 0");
        assertEquals(-5, calculator.add(-3, -2), "-3 + -2 should equal -5");
    }

    @Test
    public void testMinus() {
        logger.debug("Testing minus method");
        assertEquals(2, calculator.minus(5, 3), "5 - 3 should equal 2");
        assertEquals(-4, calculator.minus(-2, 2), "-2 - 2 should equal -4");
        assertEquals(1, calculator.minus(-1, -2), "-1 - -2 should equal 1");
    }

    @Test
    public void testDivide() {
        logger.debug("Testing divide method");

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
        logger.debug("Testing multiply method");
        assertEquals(15, calculator.multiply(5, 3), "5 * 3 should equal 15");
        assertEquals(-4, calculator.multiply(-2, 2), "-2 * 2 should equal -4");
        assertEquals(6, calculator.multiply(-3, -2), "-3 * -2 should equal 6");
    }


    @Test
    public void testFactorial() {
        logger.debug("Testing factorial method");
        assertEquals(1, calculator.factorial(0), "0! should equal 1");

        assertEquals(1, calculator.factorial(1), "1! should equal 1");

        assertEquals(120, calculator.factorial(5), "5! should equal 120");

        assertEquals(0, calculator.factorial(-5), "-5! should equal 0");
    }


}
