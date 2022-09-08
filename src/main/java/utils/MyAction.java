package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MyAction {
    WebDriver driver;

    public void myAction() {
        WebElement clickable = driver.findElement(By.id("clickable"));
        new Actions(driver)
                .moveToElement(clickable)
                .pause(Duration.ofSeconds(1))
                .clickAndHold()
                .pause(Duration.ofSeconds(1))
                .sendKeys("abc")
                .perform();

    }

    public void standardActionByID() {

        WebElement needElement = driver.findElement(By.id("needElement"));
        new Actions(driver)
                .pause(Duration.ofSeconds(5))
                .moveToElement(needElement)
                .pause(Duration.ofSeconds(5))
                .click();


    }

    public void standardActionByXpath() {

        WebElement needElementByXpath= driver.findElement(By.id("needElement"));
        new Actions(driver)
                .pause(Duration.ofSeconds(5))
                .moveToElement(needElementByXpath)
                .pause(Duration.ofSeconds(5))
                .click();


    }
//    public void buttonClick(WebElement element)
//    {
//        new Actions(driver)
//                .pause(Duration.ofSeconds(5))
//                .moveToElement(element)
//                .pause(Duration.ofSeconds(5))
//                .click();
//    }


}
