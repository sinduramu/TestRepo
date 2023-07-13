package week3.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SimplePostRequest {
	
	
	@Test
	public  void PostRequest() {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://dev54326.service-now.com/api/now/table/incident";
		
		RestAssured.authentication = RestAssured.basic("admin", "vQr+I6yd@4YS");
		
		//contentType is mandatory for POST and PUT
		
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				//.queryParam("sysparm_fields", "number, sys_id, category")
				.when()
				.post();
		
		
		response.prettyPrint();
		System.out.println("Status Code "+response.statusCode());
		String result = response.jsonPath().get("result.number");
		System.out.println("Incident Number :"+result);
		

	}

}
