package week1.day3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutRequest {
	
	@Test
	public static void putMethod()
	{
		
		RestAssured.baseURI = "https://dev107075.service-now.com/api/now/table/incident";
		
		RestAssured.authentication = RestAssured.basic("admin", "tA@21BDm!Fwi");
		
		Response response = RestAssured.given()
		.contentType(ContentType.JSON)
		.contentType(ContentType.JSON)
		.queryParams("sysparm_fields","sys_id, category, number, description, short_description")
		.body("{\"description\":\"Update Application not working\",\"category\":\"hardware\"}")
		.when()
		.put("8954fbcc97bfa1106f7e7666f053af49"); //we can pass this sys_id via baseURI. But that is not best practise. This is the good way to use
		
		response.prettyPrint();
		System.out.println(response.statusCode());
	}

}
