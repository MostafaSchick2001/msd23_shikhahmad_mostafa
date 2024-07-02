package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Calculator class provides basic arithmetic operations
 * such as addition, subtraction, multiplication, division, and
 * calculation of factorials.
 */
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    /**
     * Adds two numbers.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the sum of number1 and number2
     */
    public double add(double number1, double number2){
        logger.debug("add called with parameters: number1 = {}, number2 = {}", number1, number2);
        return  number1 + number2;
    }
    /**
     * Subtracts the second number from the first number.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the difference between number1 and number2
     */
    public double minus(double number1, double number2){
        logger.debug("minus called with parameters: number1 = {},number2= {}", number1,number2);
        return  number1 - number2;
    }
    /**
     * Divides the first number by the second number.
     *
     * @param number1 the numerator
     * @param number2 the denominator
     * @return the quotient of number1 divided by number2
     * @throws ArithmeticException if number2 is zero
     */
    public double divide(double number1, double number2){
        logger.debug("divide called with parameters: number1 = {}, number2 = {}", number1, number2);
        if (number2 == 0)
        {
            logger.error("Division by zero error with parameters: number1 = {},number2 = {}", number1,number2);
            throw new ArithmeticException("Cannot divide by zero");
        }
        return number1 / number2;
    }
    /**
     * Multiplies two numbers.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the product of number1 and number2
     */
    public double multiply(double number1, double number2){
        logger.debug("multiply called with parameters: a = {}, b = {}", number1,number2);
        return number1 * number2;
    }

    /**
     * Calculates the factorial of a non-negative integer.
     *
     * @param n the number to calculate the factorial of
     * @return the factorial of the number, or 0 if the number is negative
     */
    public int factorial(int n) {
        if (n < 0) {
           return 0;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
