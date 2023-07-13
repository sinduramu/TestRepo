package week1.day1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequestAcceptXML {
	

	@Test
	public static void AcceptXML() {
		// Endpoint
		RestAssured.baseURI = "https://dev107075.service-now.com/api/now/table/incident";

		// Authentication
		RestAssured.authentication = RestAssured.basic("admin", "tA@21BDm!Fwi");

		// Passing QueryParam and Headers
		Map<String, String> allParam = new HashMap<String, String>();
		allParam.put("category", "software");
		allParam.put("sysparm_fields", "sys_id, number, category");

		Response response = RestAssured
				.given()
				.queryParams(allParam)
				.accept(ContentType.JSON)
				//.accept(ContentType.XML)
				.when()
				.get();

		// validate Response
		response.prettyPrint();
		System.out.println(response.statusCode());

		// Travel through the response and print only sys_id when json format

		List<Object> allList = response.jsonPath().getList("result.sys_id");
		for (int i = 0; i < allList.size(); i++) {
			System.out.println("Sys ID " + i + " " + allList.get(i));
		}

		// Travel through the response and print only sys_id when XML format
		/*
		 * List<Object> list = response.xmlPath().getList("response.result.sys_id"); for
		 * (Object object : list) { System.out.println("Sys ID :" +object); }
		 */

	}

}
