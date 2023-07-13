package week1.day3;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class AssertThatTwo {
	
	@Test
	public static void assertTwo()
	{
		
		RestAssured.baseURI = "https://dev107075.service-now.com/api/now/table/incident";
		
		RestAssured.authentication = RestAssured.basic("admin", "tA@21BDm!Fwi");
		
		File schema = new File("C:\\Users\\kanna\\Downloads\\API Testing\\Schema.json");
		
		Response response = RestAssured.given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.post();
		
		
		//response.prettyPrint();
		response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(schema));
		
		
	}

}
