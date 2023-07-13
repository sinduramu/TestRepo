package week1.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestWithQP {
	@Test
	public static void GetRequestWithQP()
	{
		//Endpoint
		RestAssured.baseURI = "https://dev107075.service-now.com/api/now/table/incident";
		
		//Authentication
		RestAssured.authentication = RestAssured.basic("admin", "tA@21BDm!Fwi");
		
		//Adding the Query Parameter in the input using given
		Response response = RestAssured.given().queryParam("category", "software").get();
		
		//Validate the response
		response.prettyPrint();
		System.out.println(response.statusCode());

		
	}

}
