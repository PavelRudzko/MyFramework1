package elements;

import org.openqa.selenium.By;

public class BaseElement {
    By locator;
    String name;

    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public By getLocator() {
        return locator;
    }

    public String getName() {
        return name;
    }

    void click(){};

    void getText(){};

    void waitForDisplayed(){};

}
