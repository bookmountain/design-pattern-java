package behavioural.strategy;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class NameSelector {
    private static Random random = new Random();

    public static String exec(String gender) throws IOException, ParseException, Exception {
        // 讀取 JSON Array，內容是字串陣列
        JSONParser parser = new JSONParser();
        Object obj = null;

        if (gender.equals("m")) {
            obj = parser.parse(new FileReader("names.json"));
        } else if (gender.equals("f")) {
            obj = parser.parse(new FileReader("names.json"));
        } else {
            throw new Exception("性別代號錯誤！\n輸入的性別參數是： " + gender);
        }

        JSONArray jsonArray = (JSONArray) obj;

        int option = random.nextInt(20000);
        return (String) jsonArray.get(option);
    }
}