package week3.day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LearnAssertions {
	
	@Test
	public  void sendGetRequest() {
		// TODO Auto-generated method stub
				
		RestAssured.baseURI="https://dev54326.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "vQr+I6yd@4YS");
		Response response = RestAssured.get();
		response.then().assertThat().statusCode(200);

	}

}
