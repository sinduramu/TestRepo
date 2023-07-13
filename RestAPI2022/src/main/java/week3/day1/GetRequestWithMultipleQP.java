package week3.day1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequestWithMultipleQP {

	@Test
	public void sendRequestWithMultipleQP()
	{

		RestAssured.baseURI="https://dev54326.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "vQr+I6yd@4YS");

		Map<String,String> allQueryParams = new HashMap<String, String>();
		allQueryParams.put("category", "Software");
		allQueryParams.put("sysparm_fields", "number, sys_id, category");
		//Adding multiple query parameters in the input using given()



		Response response = RestAssured.given()
				.queryParams(allQueryParams)
				// .accept(ContentType.JSON)
				.accept(ContentType.XML)
				.when()
				.get();


		//Validate Response
		response.prettyPrint();
		System.out.println("Status Code "+response.statusCode());
		
		

		//List<String> allSysID = response.jsonPath().getList("result.number");
		List<String> allSysID = response.xmlPath().getList("response.result.number");
		System.out.println(allSysID.size());
		
		for(String sysID:allSysID)
		{
			System.out.println(sysID);
		}
		


	}	



}
