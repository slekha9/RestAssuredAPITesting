package rest.api.test.SPA_MotionANGEL;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;


public class VerifyRegistrationAPI
{
	
	@Test
	public void verifyRegistrationAPI()
	{
		Service service=new Service();
		Response response=service.RegistrationAPI("test sumana", "+91", "9686288755","Asia/Kolkata","dwqdqwdq","2222222222", "33333333");
		
		
		System.out.println("Response status: "+response.getStatusCode());
		System.out.println("Response output: "+response.asString());

	}
	

}
