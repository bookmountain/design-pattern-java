package structural.proxy;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Random;


public class NameSelector {
    private static final Random random = new Random();

    public static String exec() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("names.json"));
        JSONArray jsonArray = (JSONArray) obj;

        // 0 - 149
        int option = random.nextInt(20000);
        return (String) jsonArray.get(option);
    }
}

