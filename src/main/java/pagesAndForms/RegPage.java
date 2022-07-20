package pagesAndForms;

import elements.TextBox;
import org.openqa.selenium.By;

public class RegPage extends BaseForm{

    TextBox login;
    TextBox password;

    public RegPage(By locForm, String valForm) {
        super(locForm, valForm);
    }

    void RegPage(){}
}
