package pagesAndForms;

import elements.Label;
import org.openqa.selenium.By;

public class BaseForm {

    By locForm;
    String valForm;
    Label pageLabel;

    public BaseForm(By locForm, String valForm) {
        this.locForm = locForm;
        this.valForm = valForm;
    }

    public By getLocForm() {
        return locForm;
    }

    public String getValForm() {
        return valForm;
    }
    public Label getPageLabel(){
        return pageLabel;
    };

    void isPageOpen(){};



}
