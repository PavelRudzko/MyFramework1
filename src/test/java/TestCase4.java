import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesAndForms.FormLink;
import pagesAndForms.MainPage;
import pagesAndForms.PageBrowserWindows;

import java.util.Iterator;
import java.util.Set;

public class TestCase4 extends BaseTest {


    @Test

    public void openMainPage() throws InterruptedException {
        // MainPage page = new MainPage();
        //getExecutor().killPromo();
        // getExecutor().killPromoFooter();
        //page.getAlertFrameWinBtn().click();
        // driver.wait(5000);
        PageBrowserWindows pageBrowserWindows = new PageBrowserWindows();
        getExecutor().killPromo();
        getExecutor().killPromoFooter();
        //driver.wait(3000);
        pageBrowserWindows.getBrowserWindowsButton().click();
        Thread.sleep(3000);
        pageBrowserWindows.getNewTabButton().click();
        //driver.wait(5000);
        driver.quit();


//
//        driver.get("https://demoqa.com/");
//        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
//        WebElement but = driver.findElement(By.xpath("//*[contains(text(), 'Frame')]//parent::div//parent::div//parent::div[contains(@class, 'top-card')]"));
//        but.click();
//
//        //Assert.assertEquals(driver.getCurrentUrl());
    }

    @Test
    public void openBrowserWindowsForm() throws InterruptedException {
//        PageBrowserWindows page = new PageBrowserWindows();
//        page.getNewTabButton().click();
//        waiter.until(ExpectedConditions.alertIsPresent());
//        page.().click();
//        //  waiter.until(ExpectedConditions.alertIsPresent());
//        Thread.sleep(3000);

//        driver.get("https://demoqa.com/alertsWindows");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("document.getElementById('fixedban').remove()");
//        WebElement BrWinBtn = driver.findElement(By.xpath("//span[@class='text'][text()='Browser Windows']"));
//        Thread.sleep(3000);
//        BrWinBtn.click();
//        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/browser-windows");
    }

    @Test
    public void backToFirstWindowsTest() throws InterruptedException {


        FormLink formLink = new FormLink();
        getExecutor().killPromo();
        getExecutor().killPromoFooter();
        getExecutor().killBanners();
        formLink.links().click();
        Thread.sleep(5000);
        String firstWindow = driver.getWindowHandle();

        formLink.homeLink().click();
        Thread.sleep(3000);
        driver.switchTo().window(firstWindow);
        String oldWindows = driver.getWindowHandle();
        var someThing = driver.getWindowHandle();
        Assert.assertEquals(driver.getWindowHandle(), firstWindow);

    }

    @Test
    public void checkLinkToHomePage() {
        WebElement homeLinkBtn = driver.findElement(By.id("//a[@id='simpleLink']"));
        homeLinkBtn.click();
        driver.getCurrentUrl();
        String mainWindow = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        while (i1.hasNext()) {
            String childWindow = i1.next();
            System.out.println(s1 + "" + childWindow);
            if (!mainWindow.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);
                driver.findElement(By.id(""))
                        .sendKeys("jhgjhfgf");
                driver.close();


            }
        }
        driver.switchTo().window(mainWindow);
    }

    public void checkLinkOpenAgain() {

        // public void closeWindows(driver.getWindowHandle().){}
    }

}
