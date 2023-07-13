package week3.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestWithQP {

	@Test
	public void sendRequestWithQP()
	{

		//Endpoint
		RestAssured.baseURI="https://dev54326.service-now.com/api/now/table/incident";

		//Add Request
		RestAssured.authentication = RestAssured.basic("admin", "vQr+I6yd@4YS");
		
		//Adding query parameters in the input using given()
		
		Response response = RestAssured.given().queryParam("category", "Software").get();
		

		//Validate Response
		response.prettyPrint();
		System.out.println("Status Code "+response.statusCode());
	}	

}
