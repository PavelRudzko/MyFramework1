import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {

    public class TestConditions {
        protected WebDriver webDriver;

        @BeforeClass
        public void beforeClassTest() {

          //  webDriver = DriverSingleton.getDriver();
            webDriver.manage().window().maximize();
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--lang=en-US");
            options.addArguments("--incognito");


        }

        @AfterClass(alwaysRun = true)
        public void afterClass() {
           // DriverSingleton.closeDriver();

        }

    }





}
