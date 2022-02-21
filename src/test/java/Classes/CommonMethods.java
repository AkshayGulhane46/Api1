package Classes;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class CommonMethods {
    public static RequestSpecification request;
    public static Response response;
    public static String baseURL = "http://dummy.restapiexample.com";
    public static void fetchTheEndpoint(String httpMethod, String basePath, String queryParameters) throws IOException, ParseException, IOException, ParseException {
        if (httpMethod.equalsIgnoreCase(String.valueOf(HttpMethods.GET))) {
            if (!queryParameters.isEmpty()) {
                RestAssured.baseURI = "https://hub.dummyapis.com" + basePath;
                request = RestAssured.given();
                request.queryParam(queryParameters);
                request.header("Content-Type", "application/json");
                response = request.get();
            }

        } else if (httpMethod.equalsIgnoreCase(String.valueOf(HttpMethods.POST))) {
            RestAssured.baseURI = "http://dummy.restapiexample.com";
            request = RestAssured.given();
            request.header("Content-Type", "application/json; charset=utf-8");
            String payload = JsonHandler.readJson();
            response = request.body(payload).post(basePath);
        }
    }
}
