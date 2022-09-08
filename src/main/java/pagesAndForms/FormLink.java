package pagesAndForms;

import elements.Button;
import elements.Label;
import org.openqa.selenium.WebDriver;

public class FormLink extends BaseForm {
    public FormLink() throws InterruptedException {
        super();
    }

    @Override
    protected String getTargetUrl() {
        return "https://demoqa.com/links";
    }
    public Button links(){
        return new Button("//span[@class='text'][text()='Links']");
    }
    public Label homeLink (){
        return new Label("//a[@id =\"simpleLink\"]");
    }


}
