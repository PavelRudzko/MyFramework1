
import common.JSExexutors;
import elements.Button;
import elements.TextBox;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesAndForms.AlertPage;

import java.time.Duration;
import java.util.Scanner;


public class TestCase1 extends BaseTest {


    public TestCase1() {
        super();
    }

    @Test
    public void openMainPage_v2() throws InterruptedException {
        Logger logger = LoggerFactory.getLogger(TestCase1.class);
        driver.get("https://demoqa.com/");
        new WebDriverWait(driver, Duration.ofSeconds(3));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
        logger.info("Main page is open*****************************************************************");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.getElementById('fixedban').remove()");
        logger.info(" promo killed*****************************************************");
        Button alertFrameWinButton = new Button("//*[contains(text(), 'Frame')]//parent::div//parent::div//parent::div[contains(@class, 'top-card')]");
        alertFrameWinButton.click();
        new Button("//span[@class=\"text\"][text()=\"Alerts\"]")
                .click();
        logger.info("Alert is  open");
    }

    @Test
    public void openMainPage() throws InterruptedException {
        Logger logger = LoggerFactory.getLogger(TestCase1.class);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://demoqa.com/");
        new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
        WebElement alertFrameWinButton = driver.findElement
                (By.xpath(
                        "//*[contains(text(), " +
                                "'Frame')]//parent::div//parent::div//" +
                                "parent::div[contains(@class, 'top-card')]"));
        getExecutor().killPromo();
//        new JSExexutors(driver).killPromo();
        new Actions(driver)
                .moveToElement(alertFrameWinButton)
                .click()
                .perform();
        logger.info(" Logger works first time");

        WebElement alertButton = driver.findElement(By.xpath("//span[@class=\"text\"][text()=\"Alerts\"]"));

        js.executeScript("arguments[0].scrollIntoView();", alertButton);
        new Actions(driver)
                .moveToElement(alertButton)
                .pause(Duration.ofSeconds(5))
                .click().perform();
        logger.info(" Logger works ");

        //Assert.assertEquals(driver.getCurrentUrl());
    }

    @Test

    public void isAlertClose() {
        Assert.assertEquals(driver.getCurrentUrl(), "Alert is close");

    }

    @Test
    public void isYouClickedButton() throws InterruptedException {


        AlertPage page = new AlertPage();
        page.getAlertButtonOnSidebar().click();
        page.getAlertButton().click();
        waiter.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        new WebDriverWait(driver, Duration.ofSeconds(5));
        alert.toString();
        alert.accept();
        //driver.close();
        System.out.println(alert.getText());
        Assert.assertEquals(alert.getText(), "You clicked a button" );
    }


    @Test
    public void isButtonConfirmClick() throws InterruptedException {

        AlertPage page = new AlertPage();
        page.getAlertButtonOnSidebar().click();
        page.getAlertButton().click();
        waiter.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();

       // alert.dismiss();
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        String confirmText = driver.switchTo().alert().getText();
        Thread.sleep(3000);
        System.out.println(text);
        System.out.println(confirmText);
        Assert.assertEquals(confirmText, "Do you confirm action?");

    }

    @Test

    public void isAlertCloseWithSign() throws InterruptedException {

        AlertPage page = new AlertPage();
        page.getAlertButtonOnSidebar().click();
       // waiter.until(ExpectedConditions.alertIsPresent());
        page.confirmButton().click();
        waiter.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Assert.assertEquals(page.getConfirmresult().getInnerText(), "You selected Ok");

    }

    @Test

    public void isButtonPromtClick() throws InterruptedException {
        AlertPage page = new AlertPage();
        page.getAlertButtonOnSidebar().click();
        page.getpromtButton().click();
        waiter.until(ExpectedConditions.alertIsPresent());

        Alert alert= driver.switchTo().alert();
        waiter.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("12345");
        alert.accept();
        Assert.assertEquals(page.getPromtResult().getInnerText(),"You entered 12345");

    }
}





