package elements;

import org.openqa.selenium.By;

public class TextBox extends BaseElement {



    public TextBox(By locator, String name) {
        super(locator, name);
    }

    void sendKey(String value){};

    void clear(){};

}
