package utils;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.FileReader;
import java.io.IOException;


public class FrameworkUtils {
    WebDriver driver;


    private void jSonmethod() {
        try {
            JSONParser parser = new JSONParser();

            JSONObject data = (JSONObject) parser.parse(
                    new FileReader("/resources/config.json"));//path to the JSON file.


        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

    }


    public class Log4jExample {

        private static Logger logger = LoggerFactory.getLogger(Log4jExample.class);

        public static void main(String[] args) {
            logger.debug("Debug log message");
            logger.info("Info log message");
            logger.error("Error log message");
        }


    }


}