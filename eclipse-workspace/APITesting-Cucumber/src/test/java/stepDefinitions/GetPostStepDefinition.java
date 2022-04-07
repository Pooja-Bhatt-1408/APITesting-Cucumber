package stepDefinitions;

import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetPostStepDefinition {
	   
    public static HashMap map=new HashMap(); 
	
	@Given("^I Set POST employee service api endpoint$")
    public void setPostEndpoint(){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1"; 
        RequestSpecification request = RestAssured.given();
        System.out.println("Add URL :"+request);
        request.header("Content-Type", "application/json");
        }
	

	@When ("^Send a POST HTTP request$")
	public void sendPostRequest(){
    
		map.put("id","101011");
		map.put("employee_name","PoojaB1");
		map.put("employee_salary","1000001");
		map.put("employee_age","301");
		map.put("profile_image","");
	
    //POST Method to Add New Employee
    	Response response = request.post("/create");
	}

	@Then ("^I receive valid Response$")
	public void verifyPostResponse(){
		
    // Write response to file
		responseBody = response.getBody().toString();
		System.out.println("responseBody is" + responseBody);
    
    // Check if the added Employee is present in the response body.
		assertThat().responseBody("id",equalTo(101011));
    
    // Check if response status is success
		assertThat().response("status",equalTo("success"));
     
    // Check if the status code is 429 - Negative scenario
		assertThat().response.getStatusCode(429);
   }
	
}


