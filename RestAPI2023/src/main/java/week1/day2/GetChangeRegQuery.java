package week1.day2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetChangeRegQuery {
	
	@Test
	public static void ChangeRequestQuery()
	{
		RestAssured.baseURI = "https://dev107075.service-now.com/api/now/table/change_request";
		
		RestAssured.authentication = RestAssured.basic("admin", "tA@21BDm!Fwi");
		
		Map<String,String> allParam=new HashMap<String,String>();
		allParam.put("category", "software");
		allParam.put("sysparm_fields", "sys_id, category,number");
		
		Response response = RestAssured
		.given()
		.queryParams(allParam)
		.when()
		.get();
		
		
		System.out.println(response.statusCode());
		List<Object> list = response.jsonPath().getList("result.sys_id");
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Sys_ID "+list.get(i));
		}
		
		System.out.println(list.size());
	}

}
