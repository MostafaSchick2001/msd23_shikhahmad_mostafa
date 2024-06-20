package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Calculator c = new Calculator();
        String vorname = "Mostafa";
        String nachname = "Shikh Ahmad";


        logger.info("Info log message");
        logger.error("Error log message");

        System.out.println(vorname + " " + nachname);
        System.out.println(c.add(1,2));
        System.out.println(c.minus(2,1));
        System.out.println(c.divide(3,2));
        System.out.println(c.multiply(2,1));
    }
}
