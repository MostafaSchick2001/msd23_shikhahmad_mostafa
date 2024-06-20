package at.fhj.msd;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
public class Main {
    // Creating a logger
    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Calculator c = new Calculator();
        String vorname = "Mostafa";
        String nachname = "Shikh Ahmad";

        logger.info("here is info");
    }
}
