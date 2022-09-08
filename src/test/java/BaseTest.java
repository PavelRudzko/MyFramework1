import common.JSExexutors;
import common.SingletonDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait waiter;
    protected JavascriptExecutor jsExecutor;
    private JSExexutors executor;

    public BaseTest() {
        this.driver = SingletonDriver.getInstance();
        waiter = new WebDriverWait(this.driver, 3);
        jsExecutor = (JavascriptExecutor) driver;
        executor = new JSExexutors(driver);
    }

    public JSExexutors getExecutor(){
        return executor;
    }
    protected void executeJS(String script) {
        jsExecutor.executeScript(script);
    }

    protected void executeJS(String script, Object object) {
        jsExecutor.executeScript(script, object);
    }
}