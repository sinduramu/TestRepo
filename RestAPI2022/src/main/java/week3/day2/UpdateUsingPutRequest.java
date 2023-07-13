package week3.day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateUsingPutRequest {
	
	
	@Test
	public void putRequest()
	{
		
		RestAssured.baseURI="https://dev54326.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "vQr+I6yd@4YS");
		
		Response put = RestAssured
		.given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.queryParam("sysparm_fields","number,sys_id,description,short_description, category")
		.body("{\"category\":\"software\",\"short_description\":\"update the record via PUT request\"}")
		.put("7c3692712f274110caa343e72799b635");
		
		System.out.println("Status Response Code " +put.statusCode());
		put.prettyPrint();
		
		
		
	}

}
