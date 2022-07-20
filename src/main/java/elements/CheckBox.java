package elements;

import org.openqa.selenium.By;

public class CheckBox extends BaseElement{


    public CheckBox(By locator, String name) {
        super(locator, name);
    }



    void check(){};
    void unCheked(){};
    void isChecked(){};

}
