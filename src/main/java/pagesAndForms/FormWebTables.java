package pagesAndForms;

import elements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FormWebTables extends BaseForm{
    public FormWebTables(String url) throws InterruptedException {
        super();
    }
    protected String getTargetUrl() {
        return "https://demoqa.com/webtables";
    }
}








