package pagesAndForms;

import elements.Button;
import elements.Label;
import org.openqa.selenium.WebDriver;

public class FormProgressBar extends BaseForm{


    //Label progressbar = //span[@class = "text"][text()='Progress Bar']
   // Label progressbarElement = //div[@class = 'progress']
    //Button startStopBtn = //button[@id='startStopButton']
    public FormProgressBar() throws InterruptedException {
        super();
    }

    @Override
    protected String getTargetUrl() {
        return "https://demoqa.com/progress-bar";
    }


}
