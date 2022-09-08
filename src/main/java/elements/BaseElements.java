package elements;

import common.SingletonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class BaseElements {
    protected WebDriver driver;
    protected WebElement element;

    public BaseElements(String xPathLocator) {
        if (xPathLocator == null) throw new NullPointerException();

        driver = SingletonDriver.getInstance();
        element = driver.findElement(By.xpath(xPathLocator));
    }

    public void click() {
        showMe();
        new Actions(driver)
                .moveToElement(element)
                .pause(Duration.ofSeconds(1))
                .click()
                .perform();
    }

    public String getInnerText() {
        return element.getText();
    }

    public void showMe() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
