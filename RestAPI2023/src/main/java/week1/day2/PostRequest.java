package week1.day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest {
	
	@Test
	public static void postRequest() {
		

		RestAssured.baseURI = "https://dev107075.service-now.com/api/now/table/incident";
		
		RestAssured.authentication = RestAssured.basic("admin", "tA@21BDm!Fwi");
		
		Response response = RestAssured.given()
		.contentType(ContentType.XML)
		.accept(ContentType.XML)
		.queryParam("sysparm_fields", "sys_id,number,category,description,short_description")
		.body("<request><entry><description>My Application not working</description><category>software</category><short_description>InvalidURL</short_description></entry></request>")
		.when()
		.post();
		
		response.prettyPrint();
		System.out.println(response.statusCode());
		
		String SysID = response.xmlPath().get("response.result.sys_id");
		System.out.println(SysID);
		
	}
	
	
	
	

}
