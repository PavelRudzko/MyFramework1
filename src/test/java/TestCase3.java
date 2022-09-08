import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest {

    public TestCase3() {
        super();
    }


    @Test

    public void openPage() {
        driver.get("https://demoqa.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }

    @Test
    public void openWebTablesForm() {

    }

    public void openRegistrationForm() {
        driver.get("");
        WebElement add = driver.findElement(By.xpath("//*[contains(text(), 'Frame')]//parent::div//parent::div//parent::div[contains(@class, 'top-card')]"));
        add.click();
    }

    public void closedRegistrationForm() {
        WebElement submit = driver.findElement(By.xpath(""));
        submit.click();
    }

    public void checkNewCustomer() {

    }
//    public void checkDeleteNewCustomer (){
//        WebElement deleteBtn = driver.findElement(By.xpath("");
//        deleteBtn.click();
//        Assert.assertEquals(null, null);
//
//}
}
