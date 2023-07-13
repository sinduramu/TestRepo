package week1.day1;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestWithMultipleQP {
	
	@Test
	public static void multipleQP()
	{
		
		//Endpoint 
		RestAssured.baseURI = "https://dev107075.service-now.com/api/now/table/incident";
		
		//Authentication
		RestAssured.authentication=RestAssured.basic("admin", "tA@21BDm!Fwi");
		
		//Passing Query Parameters
		Map<String, String> allParam = new HashMap<String, String>();
		allParam.put("category", "software");
		allParam.put("sysparm_fields", "sys_id,number,category");
		Response response = RestAssured.given().queryParams(allParam).get();
		
		//Validate the response
		response.prettyPrint();
		System.out.println(response.statusCode());
		
		
	}

}
