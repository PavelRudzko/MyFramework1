package pagesAndForms;


import elements.Button;
import org.openqa.selenium.By;

public class MainPage extends BaseForm{
    public MainPage() throws InterruptedException {
        super();
    }
   public Button elementsBtn;
    Button formsBtn;
    public Button getAlertFrameWinBtn (){
        return new Button("//*[contains(text(),'Elements')]//parent::div//parent::div//parent::div[contains(@class, 'top-card')]");
    };
    Button widgetBtn;


    @Override
    protected String getTargetUrl() {
        return "https://demoqa.com/";
    }
}


