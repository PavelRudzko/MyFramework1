package pagesAndForms;

import elements.Button;
import elements.Label;
import elements.TextBox;
import org.openqa.selenium.By;

public class MainPage extends BaseForm{

    Label labelMainpage;
    TextBox textBox;
    Button button;

    public MainPage(By locForm, String valForm) {
        super(locForm, valForm);
    }

    void mainPage(){};

}
