import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import common.JSExexutors;

import javax.accessibility.Accessible;
import javax.swing.*;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class TestCase7 extends BaseTest {
    //	Перейти на главную страницу	Главная страница открыта
    //2	Кликнуть на кнопку Elements.
    //На открывшейся странице в левом меню кликнуть пункт Upload and Download	Открыта страница с формой Upload and Download
    //3	Нажать на кнопку Download, дождаться загрузки файла	Файл успешно скачался
    //4	Загрузить на страницу файл, скачанный на шаге 3	В форме появился путь, содержащий в себе название файла?//

    @Test
    public void openMainPage(){}

    @Test
    public void openDownLoadPage() throws InterruptedException {

        driver.get(" https://demoqa.com/upload-download");
        Button uploadDownload = new Button("//span[@class='text'][text()='Upload and Download']");
        uploadDownload.click();
        new Button("//a[@id='downloadButton']").click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("browserstack_executor: {'action': 'fileExists'}");
         System.out.println(js.executeScript("browserstack_executor: {'action': 'fileExists'}"));


    }
    @Test
    public void isFileUpload(){}

    @Test
    public void checkPathForFile(){}

//    public boolean isFileDownloaded() throws Exception {
//        final int SLEEP_TIME_MILLIS = 1000;
//        String fileName = null;
//        String downloadPath = System.getSystemDownloadPath();
//        File file = new File("");
//        final int timeout = 60* SLEEP_TIME_MILLIS;
//        int timeElapsed = 0;
//        while (timeElapsed<timeout){
//            if (file.exists()) {
//                System.out.println(fileName + " is present");
//                return true;
//            } else {
//                timeElapsed +=SLEEP_TIME_MILLIS;
//                Thread.sleep(SLEEP_TIME_MILLIS);
//            }
//        }
//        return false;
//    }
}



