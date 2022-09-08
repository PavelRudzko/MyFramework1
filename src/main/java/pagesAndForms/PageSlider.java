package pagesAndForms;

import elements.BaseElements;
import elements.Button;
import elements.Label;
import org.openqa.selenium.WebDriver;

public class PageSlider extends BaseForm {


    public PageSlider() throws InterruptedException {
        super();

    }

    @Override
    protected String getTargetUrl() {
        return "https://demoqa.com/slider";
    }

    public Label getSliderLabel() {
        return new Label("//span[@class= 'range-slider__wrap']");
    }

    public Label getInputSlider() {
        return new Label("//*[@id=\"sliderContainer\"]/div[1]/span/input");
    }

    public Label getArrowLabel() {
        return new Label("//*[@id=\"sliderContainer\"]/div[1]/span/div/div[2]");
    }

    public Label getLabel() {
        return new Label("//*[@id=\"sliderContainer\"]/div[1]/span/div/div[1]");
    }

    public Label getInputSliderValue() {
        return new Label("//input[@id= 'sliderValue']");
    }

}