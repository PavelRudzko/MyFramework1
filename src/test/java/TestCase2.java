import elements.Button;
import elements.Frame;
import elements.Label;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCase2 extends BaseTest {
    @Test
    public void parentChildeTest() throws InterruptedException {
        driver.get("https://demoqa.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('fixedban').remove()");

        WebElement but = driver.findElement(By.xpath("//*[contains(text(), 'Frame')]//parent::div//parent::div//parent::div[contains(@class, 'top-card')]"));
        new Actions(driver)
                .moveToElement(but)
                .pause(Duration.ofSeconds(1))
                .click()
                .perform();
        Integer size = driver.findElements(By.tagName("iframe")).size();

        System.out.println(size + "Iframe");
        new Button("//span[@class='text'][text()='Nested Frames']")
                .click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/nestedframes");
        new Frame("//div[@id ='fixedban']").click();
        driver.switchTo().frame(1).getTitle();
        Frame iParentFrame = (Frame) driver.findElement(By.xpath("/html/body/text()=''"));
        Frame iChildFrame = (Frame) driver.findElement(By.xpath(""));

    }


    @Test

    public void openFrame() {

        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame(0);
        WebElement frame1Heading = driver.findElement(By.id("sampleHeading"));
        String frame1Text = frame1Heading.getText();
        WebElement frame2Heading = driver.findElement(By.id("sampleHeading"));
        String frame2Text = frame1Heading.getText();
        System.out.println(frame1Text);
        System.out.println(frame2Text);
        Assert.assertEquals(frame1Text, frame1Text);


    }


}

