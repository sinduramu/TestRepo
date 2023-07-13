package week3.day2;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class ResponseMatchesSchema {


	@Test
	public void postRequestWithSchemaValidation()
	{
		File jsonFile = new File("./src/main/resources/CreateResponseSchema.json");
		RestAssured.baseURI = "https://dev54326.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "vQr+I6yd@4YS");
		
		Response post = RestAssured
		.given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.post();
		
		post.prettyPrint();
		System.out.println("Status code "+post.statusCode());
		
		//response schema matches with the File or Not
		post.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonFile));
	}
	

}
