package practice;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class jsonParser {

    public static void main(String[] args) {
        String jsonObject = "{\n" +
                "      \"DisplayName\": \"AppNexus\",\n" +
                "      \"ParamDetails\": \"publisherId | numeric | 0\",\n" +
                "      \"TCF2\": \"1\",\n" +
                "      \"CCPA\": \"1\",\n" +
                "      \"GDPR\": \"1\"\n" +
                "    }";

        JsonArray a = new JsonArray();
        a.add(jsonObject);
        System.out.println(a);
        String jsonObject2 = "{\n" +
                "      \"DisplayName\": \"brupad\",\n" +
                "      \"ParamDetails\": \"publisherId | numeric | 0\",\n" +
                "      \"TCF2\": \"1\",\n" +
                "      \"CCPA\": \"1\",\n" +
                "      \"GDPR\": \"1\"\n" +
                "    }";
        a.add(jsonObject2);
JsonObject jsonOb = new JsonObject();
        System.out.println(a);

        jsonOb.add("newElement",a);

        System.out.println(jsonOb);

    }
}
