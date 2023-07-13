package week1.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SimpleRequest {
	@Test
	 public static void getRequest()
	 {
		 //1. End point
		 RestAssured.baseURI = "https://dev107075.service-now.com/api/now/table/incident";
		 
		 // Authentication
		 RestAssured.authentication = RestAssured.basic("admin","tA@21BDm!Fwi");
		 
		 //Send request
		 
 		 Response response = RestAssured.get();
 		 
 		 //validate the response
 		 
 		 response.prettyPrint();
 		System.out.println(response.statusCode());
		 
	 }

}
