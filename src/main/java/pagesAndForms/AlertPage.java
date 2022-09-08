package pagesAndForms;

import elements.Button;
import elements.Label;
import common.Constant;

public class AlertPage extends BaseForm{

    public AlertPage() throws InterruptedException {
        super();
    }

    public Button getAlertButtonOnSidebar(){
        return new Button("//span[@class=\"text\"][text()=\"Alerts\"]");
    }

    public Button getAlertButton(){
        return new Button("//button[@id ='alertButton']");
    }
    public Label getConfirmresult(){
        return new Label("//span[@id ='confirmResult']");
    }
    public Button alertButton (){
        return new Button("//button[@id ='alertButton']");
    }
    public Button confirmButton (){
        return new Button("//button[@id ='confirmButton']");
    }
public Button getpromtButton (){return new Button("//button[@id ='promtButton']");}
    public Label getPromtResult(){
        return new Label("//span[@id ='promptResult']");
    }


    @Override
    protected String getTargetUrl() {
        return "https://demoqa.com/alerts";
    }


}
