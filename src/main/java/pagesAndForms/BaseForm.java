package pagesAndForms;

import common.SingletonDriver;
import org.openqa.selenium.WebDriver;

public abstract class BaseForm {
    public BaseForm() throws InterruptedException {
        WebDriver driver = SingletonDriver.getInstance();
        driver.get(getTargetUrl());
    }

    protected abstract String getTargetUrl();
}
