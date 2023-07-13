package week3.day1;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestWithBody {

	@Test
	public void sendPostRequestWithBody()
	{
		File jsonInputFile = new File("./src/main/resources/CreateRequest.json");
		RestAssured.baseURI = "https://dev54326.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "vQr+I6yd@4YS");
		
		Response postResponse = RestAssured.given()
				.log()
				.all()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.queryParam("sysparm_fields", "number, sys_id, category, description, short_description")
		.body(jsonInputFile)
		.when()
		.post();
		
		System.out.println(postResponse.statusCode());
		postResponse.prettyPrint();
		
		String result = postResponse.jsonPath().get("result.number");
		System.out.println("Incident Number "+result);
		
		
		
	}

}
