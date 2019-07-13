package page.tests;

import org.openqa.selenium.WebDriver;
import page.objects.LogIn;

public class TestLogIn {
	//TEST LOGING IN
		public static void logIn(WebDriver dr) throws Exception {
			Thread.sleep(2000);
	//We are testing if we are on the Home Page and clicking LogIn Button
			TestHomePage.openHomePage(dr);
		
	//Initializing actual and expected URL
			String actualURL=dr.getCurrentUrl();
			String expectedURL=LogIn.LOGIN_PAGE;
	
	//Test if we are on the right URL
			if (actualURL.equals(expectedURL)) {
	//Enter data and LogIn 
			LogIn.logIn(dr);
		}
		
	}
}
