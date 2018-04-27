package rest.api.test.SPA_MotionANGEL;

import org.json.JSONObject;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import rest.api.test.SPA_MotionANGEL.requestpojo.Registration;
import rest.api.test.SPA_MotionANGEL.utility.ServiceURL;

public class Service 
{
	public Response RegistrationAPI(String name, String countrycode,String phoneno,String timezone, String address,String latitude, String longitude )
	{
		Registration registration=new Registration();
		
		registration.setName(name);
		registration.setCountrycode(countrycode);
		registration.setPhoneno(phoneno);
		registration.setTimezone(timezone);
		registration.setAddress(address);
		registration.setLatitude(latitude);
		registration.setLongitude(longitude);
		
		JSONObject jsonObj=new JSONObject(registration);
		System.out.println("Request payload..");
		System.out.println(jsonObj.toString()+"\n");
		
		RequestSpecification request=RestAssured.given();
		request.contentType("application/json");
		request.accept("application/json");
		request.body(jsonObj.toString());
		Response response=request.post(ServiceURL.registrationUrl);
		
		return response;
		
	}
	
	

	//Simple codes without POJO implementation
/*	@Test
	public void registrationAPI()
	{
		RestAssured.baseURI="http://138.197.26.8/secure/index.php/api/signup";
		RequestSpecification request=RestAssured.given();
		
		JSONObject jsonObj=new JSONObject();
		
		jsonObj.put("name", "test lekha");
		jsonObj.put("countrycode", "+91");
		jsonObj.put("phoneno", "9891498448");
		jsonObj.put("timezone", "Asia/Delhi");
		jsonObj.put("address", "hahahahaha");
		jsonObj.put("latitude", "0000000000");
		jsonObj.put("longitude", "7898787897");
		
		request.contentType("application/json");
		request.accept("application/json");
		
		request.body(jsonObj.toString());
		Response response=request.post();
		
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
	}*/

}
