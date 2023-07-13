package week1.day3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteRequest {
	
	@Test
	public static void deleteMethod()
	{
		
		RestAssured.baseURI = "https://dev107075.service-now.com/api/now/table/incident";
		
		RestAssured.authentication = RestAssured.basic("admin", "tA@21BDm!Fwi");
		
		Response response = RestAssured.when().delete("3497b3c097ffa1106f7e7666f053af24");
		
		System.out.println(response.statusCode());
		
		response.prettyPrint();
	}

}
