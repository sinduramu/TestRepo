package week3.day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteRecord {
	
	@Test
	public void deleteRequest()
	{
		RestAssured.baseURI="https://dev54326.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "vQr+I6yd@4YS");
		
		Response delete = RestAssured
		.when()
		.delete("46b9490da9fe1981003c938dab89bda3");
		
		System.out.println("Status code is "+delete.statusCode());
		delete.prettyPrint();
		
	}

}
