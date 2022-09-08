package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static common.Config.platform;

public class SingletonDriver {
    private static WebDriver instance = null;

    private static WebDriver createDriver() {

        WebDriver driver;
        switch (platform) {
            case "mozilla" -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            default -> {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constant.getImplicitWait()));
        return driver;
    }

    public static WebDriver getInstance() {
        if (instance == null) {

            instance = createDriver();
        }
        return instance;
    }
}
