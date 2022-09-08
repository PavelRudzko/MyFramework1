package pagesAndForms;

import elements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormDatePicker extends BaseForm{
    public FormDatePicker() throws InterruptedException {
        super();
    }
    @Override
    protected String getTargetUrl() {
        return "https://demoqa.com/alerts";
    }


    Button widgets;
    Button dataPicker;
   // TextBox dateMothYearTextBox =  driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));
  //  TextBox dateAndTimeTextBox = (TextBox) driver.findElement(By.xpath("//input[@id='dateAndTimePickerInput']"));


    public Button getDataPickerLabel() {
        return dataPicker;
    }

    public Button getWidgets() {
        return widgets;
    }

  //  public TextBox getDateMothYearTextBox() {
   //     return dateMothYearTextBox;
 //   }



    //public TextBox getDateAndTimeTextBox() {
       // return dateAndTimeTextBox;
   // }



}

