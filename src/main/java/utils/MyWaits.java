package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public abstract class MyWaits {
    protected WebDriver driver;
    WebElement element;

    public void loadingPage() {
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }

    public void waitInVisibility() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.invisibilityOf(element));


    }

    public void waitVisibility() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public void waitAlertOpen() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.alertIsPresent());


    }

    public void waitListElements() {

        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("//")));
    }

    private static WebElement waitForElementLocatedBy(WebDriver driver, By by) {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(by));

    }

    public void myFluentWaitforList() {
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Ups");


    }


}

