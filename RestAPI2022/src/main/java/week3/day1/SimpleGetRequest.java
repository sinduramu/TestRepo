package week3.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SimpleGetRequest {
	
	@Test
	public  void sendGetRequest() {
		// TODO Auto-generated method stub
		
		//Endpoint
		RestAssured.baseURI="https://dev54326.service-now.com/api/now/table/incident";
		
		//Add Request
		RestAssured.authentication = RestAssured.basic("admin", "vQr+I6yd@4YS");
		
		//Send Request
		Response response = RestAssured.get();
		
		//Validate Response
		
		
		response.prettyPrint();
		System.out.println("Status Code "+response.statusCode());
		

	}

}
