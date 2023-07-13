package week1.day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SimplePostRequest {
	
	@Test
	public static void postRequest()
	{

		RestAssured.baseURI = "https://dev107075.service-now.com/api/now/table/incident";
		RestAssured.authentication=RestAssured.basic("admin", "tA@21BDm!Fwi");
		Response response = RestAssured
				.given()
				.contentType(ContentType.JSON)//mandate for POST request
				.accept(ContentType.JSON)//not mandate for Post request but nice to have
				.queryParam("sysparm_fields", "sys_id,category,number")
				.when()
				.post();
		
		response.prettyPrint();
		System.out.println(response.statusCode());
		String systemId = response.jsonPath().get("result.sys_id");
		System.out.println(systemId);
		

			
	}

}
