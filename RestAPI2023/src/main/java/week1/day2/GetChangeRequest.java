package week1.day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetChangeRequest {
	
	@Test
	public static void getChangeReq()
	{
		
		RestAssured.baseURI = "https://dev107075.service-now.com/api/now/table/change_request";
		RestAssured.authentication=RestAssured.basic("admin", "tA@21BDm!Fwi");
		Response response = RestAssured
							.given()
							.accept(ContentType.XML)
							.when()
							.get();
		
		response.prettyPrint();
		
		
		
		
	}

}
