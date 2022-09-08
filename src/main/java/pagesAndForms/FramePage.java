package pagesAndForms;

import elements.Button;
import elements.Label;
import org.openqa.selenium.By;

public class FramePage extends BaseForm {

    public FramePage() throws InterruptedException {
        super();
    }

    private Label parentForm;
    private Label nestedForm;
// public Label  getAlertButtonOnSidebar(){
//  return new Label("//span[@class=\"text\"][text()=\"Alerts\"]");
// }
//
// public Button getAlertButton(){
//  return new Button("//button[@id=\"alertButton\"]");
// }
    @Override
protected String getTargetUrl() {
        return "https://demoqa.com/frames";
}


}
