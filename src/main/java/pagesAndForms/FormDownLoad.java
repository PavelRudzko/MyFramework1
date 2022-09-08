package pagesAndForms;

import elements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormDownLoad extends BaseForm {

    Button upAndDownloadButton ;
    Button download ;
    public FormDownLoad() throws InterruptedException {
        super();
    }

    @Override
    protected String getTargetUrl() {
        return null;
    }





    public Button getDownload() {
        return download;
    }

    public Button getUpAndDownloadButton() {
        return upAndDownloadButton;
    }


}


