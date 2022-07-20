package browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Singleton {

    public class DriverSingleton {

        private static WebDriver webDriver;

        private DriverSingleton(){}

        public static WebDriver getDriver() {

            if (null == webDriver) {
                if ("firefox".equals(System.getProperty("browser"))) {
                    WebDriverManager.firefoxdriver().setup();
                    webDriver = new FirefoxDriver();
                }
                webDriver = new ChromeDriver();
            }


            return webDriver;
        }
        public static void closeDriver (){
            webDriver.quit();
            webDriver =null;
        }



    }


}
