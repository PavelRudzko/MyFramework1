//package utils;
//
//import org.json.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.FileReader;
//import java.io.IOException;
//
//public class FrameworkUtils {
//
//
//    public class Log4jExample {
//
//        private static Logger logger = LoggerFactory.getLogger(Log4jExample.class);
//
//        public static void main(String[] args) {
//            logger.debug("Debug log message");
//            logger.info("Info log message");
//            logger.error("Error log message");
//        }
//
//       // private void jSonmethod;{
//            try {
//                JSONParser parser = new JSONParser();
//                //Use JSONObject for simple JSON and JSONArray for array of JSON.
//                JSONObject data = (JSONObject) parser.parse(
//                        new FileReader("/resources/config.json"));//path to the JSON file.
//
//                // String json = data.toJSONString();
//            } catch (IOException | ParseException e) {
//                e.printStackTrace();
//            }
//        }
//        //static Use JSONObject for simple JSON like {"id":"1","name":"ankur"} and JSONArray for array of JSON like [{"id":"1","name":"ankur"},{"id":"2","name":"mahajan"}].
//
//
//
//
//
//    }
//
////    Action (){};
////    Wait(){}
//
//}
