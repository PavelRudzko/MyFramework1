package pagesAndForms;

import elements.Button;
import org.openqa.selenium.By;

public class PageBrowserWindows extends BaseForm{

    Button newTab;
    Button newWindows;
    Button newWindowMessage;

    public PageBrowserWindows(By locForm, String valForm, Button newTab, Button newWindows, Button newWindowMessage) {
        super(locForm, valForm);
        this.newTab = newTab;
        this.newWindows = newWindows;
        this.newWindowMessage = newWindowMessage;
    }
}
