package stepdefinition;

import java.io.File;

import org.hamcrest.Matchers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentSteps {
	
	RequestSpecification inputRequest = null;
	Response response = null;
	

	@Given("Set the end point for Service now Incident Management")
	public void set_the_end_point_for_service_now_incident_management() {
	    RestAssured.baseURI = "https://dev54326.service-now.com/api/now/table/incident";
	   
	}

	@Given("Set the authentication for Service now application")
	public void set_the_authentication_for_service_now_application() {
		   RestAssured.authentication = RestAssured.basic("admin", "vQr+I6yd@4YS");
	}

	@Given("Set the Queryparam for Create Incident request")
	public void set_the_queryparam_for_create_incident_request() {
		inputRequest = RestAssured.given().log().all();
		inputRequest.given().queryParam("sysparam_fields", "sys_id, number, short_description, description");
		
	}

	@Given("Set the Content type in the create Incident request")
	public void set_the_content_type_in_the_create_incident_request() {
		   System.out.println("four");
	   
	}

	@Given("Set the accept in the create Incident request")
	public void set_the_accept_in_the_create_incident_request() {
	    
		   inputRequest.contentType(ContentType.JSON);
	}

	@Given("Set the request body in create Incident request")
	public void set_the_request_body_in_create_incident_request() {
	    
		   File jsonInputFile = new File("./src/main/resources/CreateRequest.json");
		   inputRequest.body(jsonInputFile);
	}

	@When("Send the POST request to Service now Incident Management")
	public void send_the_post_request_to_service_now_incident_management() {
	    
		   response = inputRequest.when().post();
	}

	@Then("Validate the status code")
	public void validate_the_status_code() {
	    
		   response.then().assertThat().statusCode(201);
	}

	@Then("Validate the response that has number starts with INC")
	public void validate_the_response_that_has_number_starts_with_inc() {
		   System.out.println("nine");
	   response.then().assertThat().body("result.number", Matchers.containsString("INC"));
	}


	

	

}
