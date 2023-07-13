package week1.day3;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AssertThatTest {
	
	@Test
	public static void assertOne()
	{
		
		RestAssured.baseURI = "https://dev107075.service-now.com/api/now/table/incident";
				
		RestAssured.authentication = RestAssured.basic("admin", "tA@21BDm!Fwi");
		
		Map<String,String> allParam = new HashMap<String,String>();
		allParam.put("category", "software");
		allParam.put("sysparm_fields", "sys_id,category,number");
		
		
		Response response = RestAssured.given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.queryParams(allParam)
		.when()
		.get();
		
		response.prettyPrint();
		
		
		//response.then().assertThat().body("result[0].number", Matchers.containsString("INC")); //Know the exact index and know the partial value 
		//response.then().assertThat().body("result.number", Matchers.hasItem("INC0010073")); //Know the exact value but dont know the index
		response.then().assertThat().body("result[3].number", Matchers.equalTo("INC0000019")); //know the value and the index
		
		
	}

}
