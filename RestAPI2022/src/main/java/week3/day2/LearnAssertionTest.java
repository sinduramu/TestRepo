package week3.day2;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LearnAssertionTest {
	
	@Test
	public void learnAssertion()
	{
	RestAssured.baseURI="https://dev54326.service-now.com/api/now/table/incident";
	RestAssured.authentication = RestAssured.basic("admin", "vQr+I6yd@4YS");

	Map<String,String> allQueryParams = new HashMap<String, String>();
	allQueryParams.put("category", "Software");
	allQueryParams.put("sysparm_fields", "number, sys_id, category");


	Response response = RestAssured.given()
			.queryParams(allQueryParams)
			.accept(ContentType.JSON)
			.when()
			.get();

	response.prettyPrint();
	System.out.println("Status Code "+response.statusCode());
	
	//to know value but not index
	
	// response.then().assertThat().body("result.number", Matchers.hasItem("INC0010123"));
	
	//to know index but not value
	
	//response.then().assertThat().body("result[0].number", Matchers.containsString("INC"));
	
	//To know both index and value 
	response.then().assertThat().body("result[0].number", Matchers.equalTo("INC0000006"));
	
	}

}
