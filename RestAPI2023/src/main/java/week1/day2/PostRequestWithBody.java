package week1.day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestWithBody {

	@Test
	public static void postRequest()
	{
		
		RestAssured.baseURI = "https://dev107075.service-now.com/api/now/table/incident";
		
		RestAssured.authentication = RestAssured.basic("admin", "tA@21BDm!Fwi");
		
		Response response = RestAssured.given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.queryParam("sysparm_fields", "sys_id,number,category,description,short_description")
		.body("{\"description\":\"My Application not working\",\"category\":\"software\",\"short_description\":\"InvalidURL\"}")
		.when()
		.post();
		
		response.prettyPrint();
		
		System.out.println(response.statusCode());
		
		
		
		
		
	}
}
