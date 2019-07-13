package page.objects;

import org.openqa.selenium.WebDriver;
import page.tests.TestLogIn;

public class Dashboard {

	public static final String DASHBOARD = "https://mira3.humanity.com/app/dashboard/";
	
	//Open Browser on Dashboard "Humanity"
	public static void openDashboard(WebDriver dr) throws Exception {
		
	//We have tested HomePage and LogIn, and now we should be on Dashboard 
		TestLogIn.logIn(dr);
	}

}
