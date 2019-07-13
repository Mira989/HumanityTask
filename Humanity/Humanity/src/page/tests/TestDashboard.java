package page.tests;

import org.openqa.selenium.WebDriver;
import page.objects.Dashboard;

public class TestDashboard {
	
	//OPEN BROWSER ON HUMANITY DASHBOARD AND TEST ACTUAL AND EXPECTED URL 
	public static void openDashboard(WebDriver dr) throws Exception {
		Thread.sleep(2000);
	//We have tested HomePage and LogIn, and now we should be on Dashboard
		Dashboard.openDashboard(dr);
		
	//Initializing actual and expected URL
		String actualURL=dr.getCurrentUrl();
		String expectedURL=Dashboard.DASHBOARD;
		
	//Test if we are on the right URL
		if (actualURL.equals(expectedURL)) {
			System.out.println("OK!");
		}
				
	}
}
