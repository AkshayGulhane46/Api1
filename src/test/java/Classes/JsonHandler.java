package Classes;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
public class JsonHandler {

        public static String readJson() throws IOException, ParseException {
            JSONParser jsonParser=new JSONParser();
            JSONObject jsonObject=(JSONObject)jsonParser.parse(new FileReader("./src/test/resources/post.json"));
            String name=(String)  jsonObject.put("name","yashvi");
            String salary=(String)  jsonObject.get("salary");
            String age=(String)  jsonObject.get("age");
            System.out.println(name);
            System.out.println(salary);
            System.out.println(age);
            return jsonObject.toJSONString();
        }

    }

