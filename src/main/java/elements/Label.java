package elements;

import org.openqa.selenium.By;

public class Label {

    By locLabel;
    String nameOfLablel;

    public Label(By locLabel, String nameOfLablel) {
        this.locLabel = locLabel;
        this.nameOfLablel = nameOfLablel;
    }
}
