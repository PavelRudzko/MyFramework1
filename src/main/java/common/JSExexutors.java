package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JSExexutors {
    private WebDriver driver;
    private JavascriptExecutor js;

    public JSExexutors(WebDriver driver){
        this.driver = driver;
        js = (JavascriptExecutor) driver;
    }

    public void killPromo() {
        js.executeScript("document.getElementById('fixedban').remove()");
    }

    public void scrollDocToDown() {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollToElement() {
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("")));
    }

    public void killPromoFooter() {
        js.executeScript(("document.getElementsByTagName('footer')[0].remove()"));

    }
    public void killBanners(){
        js.executeScript("document.getElementById('Ad.Plus-').remove()");
    }


public void printTextInfo(){js.executeScript("browserstack_executor: {'action': 'fileExists'}");}
}

