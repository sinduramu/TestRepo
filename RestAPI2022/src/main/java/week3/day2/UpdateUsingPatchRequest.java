package week3.day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateUsingPatchRequest {
	
	
	@Test
	public void patchRequest()
	{
		RestAssured.baseURI = "https://dev54326.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "vQr+I6yd@4YS");
		
		
		
		Response patch = RestAssured
		.given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.queryParam("sysparm_fields", "number, sys_id, short_description, description, category")
		.body("{\"short_description\":\"Update the details using POST record\",\"category\":\"inquiry\"}")
		.when()
		.patch("7c3692712f274110caa343e72799b635");
		
		System.out.println("Status code is "+patch.statusCode());
		patch.prettyPrint();
	}

}
