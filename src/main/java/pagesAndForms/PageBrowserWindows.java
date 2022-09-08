package pagesAndForms;

import elements.Button;
import org.openqa.selenium.WebDriver;

public class PageBrowserWindows extends BaseForm{
    public PageBrowserWindows() throws InterruptedException {
        super();
    }
    @Override
    protected String getTargetUrl() {
        return "https://demoqa.com/browser-windows";
    }
    public Button getNewTabButton(){
        return new Button("//button[@ id = 'tabButton']");
    }
    public Button getBrowserWindowsButton(){
        return new Button("//span[@class='text'][text()=\"Browser Windows\"]");
    }


}
