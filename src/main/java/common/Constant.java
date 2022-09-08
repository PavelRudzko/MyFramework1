package common;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Constant {
    private Constant() throws ParseException {
        String jsonSource = getClass().getResource("settings.json").toString();
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonSource);
        implicitWait = (int) jsonObject.get("implicitWait");
    }
    private static int implicitWait = 10;
    public static  int getImplicitWait(){
        return implicitWait;
    }
    private static int getExplicitWait(){
        return explicitWait;
    }
    public static final int explicitWait = 5;
    public static final String URL_ALERT_BTN = "//button[@id='alertButton']";
    public static final String URL_ELEMENTS_BTN= "//*[contains(text(),'Frame')]//parent::div//parent::div//parent::div[contains(@class,'top-card')]))";
    public static final String URL_WIDGET_BTN = "//*[contains(text(),'Widgets')]//parent::div//parent::div//parent::div[contains(@class,'top-card')]))";
    //public static final String URL_
    public static class Urls {
        public static final String webAddress = "https://demoqa.com/";
    }
}
