package pagesAndForms;

import elements.Button;
import org.openqa.selenium.By;


public class PageAlert extends BaseForm{

    public PageAlert(By locForm, String valForm) {
        super(locForm, valForm);
    }
    Button alert;
}
