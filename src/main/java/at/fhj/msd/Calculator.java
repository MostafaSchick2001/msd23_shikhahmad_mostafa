package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public double add(double number1, double number2){
        logger.debug("add called with parameters: number1 = {}, number2 = {}", number1, number2);
        return  number1 + number2;
    }
    public double minus(double number1, double number2){
        logger.debug("minus called with parameters: number1 = {},number2= {}", number1,number2);
        return  number1 - number2;
    }
    public double divide(double number1, double number2){
        logger.debug("divide called with parameters: number1 = {}, number2 = {}", number1, number2);
        if (number2 == 0)
        {
            logger.error("Division by zero error with parameters: number1 = {},number2 = {}", number1,number2);
            throw new ArithmeticException("Cannot divide by zero");
        }
        return number1 / number2;
    }
    public double multiply(double number1, double number2){
        logger.debug("multiply called with parameters: a = {}, b = {}", number1,number2);
        return number1 * number2;
    }

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
