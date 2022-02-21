package MySteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.basePath;

public class StepDefinitions {

public static String baseURL = "http://dmmy.stapxampl.com";
    @Given("^I send \"(.*?)\" request to Dummy endPoints for positive status codes with base path as \"(.*?)\",queryParameters as \"(.*?)\" and \"(.*?)\"$")
    public void i_send_request_to_Dummy_endPoints_for_positive_status_codes_with_base_path_as_queryParameters_as_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        RestAssured.baseURI =baseURL + basePath;
        RequestSpecification request = RestAssured.given();
        //request.queryParam(queryParameters);
        request.header("Content-type","application/json");
        Response response = request.get();
        System.out.println(response.getBody().prettyPrint());
        //getbody mens we are returning body of the api with preety response


    }

    @Then("^Verify the response status code with expected status code \"(.*?)\"$")
    public void verify_the_response_status_code_with_expected_status_code(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

}
