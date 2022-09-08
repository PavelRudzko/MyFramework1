package pagesAndForms;

import elements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormElements extends BaseForm {

    public FormElements() throws InterruptedException {
        super();
    }

    @Override
    protected String getTargetUrl() {
        return "https://demoqa.com/elements";
    }

    public Button getElementsButton(){
        return new Button("URL_ELEMENTS_BTN");
    }


//    Button elementBtn = (Button) driver.findElement(By.xpath("//*[@class='Elements']"));
//    TextBox textBox = (TextBox) driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
//    CheckBox checkBox = (CheckBox) driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
//    Label radioBox = (Label) driver.findElement(By.xpath("//*[@id=\"item-2\"]/span"));
//    Label webTab = (Label) driver.findElement(By.xpath("//*[@id=\"item-3\"]/span"));
//    TextBox buttons = (TextBox) driver.findElement(By.xpath("//*[@id=\"item-4\"]/span"));
//    TextBox links = (TextBox) driver.findElement(By.xpath("//*[@id=\"item-5\"]/span"));
//    TextBox broKenLinks = (TextBox) driver.findElement(By.xpath("//*[@id=\"item-6\"]/span"));
//    TextBox textDownload = (TextBox) driver.findElement(By.xpath("//*[@id=\"item-7\"]/span"));
//    TextBox Properties = (TextBox) driver.findElement(By.xpath("//*[@id=\"item-8\"]/span"));

}

