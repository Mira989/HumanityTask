package page.tests;

import org.openqa.selenium.WebDriver;
import page.objects.Staff;

public class TestStaff {
	
	//NAVIGATE TO STAFF AND TEST ACTUAL AND EXPECTED URL 
		public static void navigateToStaff(WebDriver dr) throws Exception {
			Thread.sleep(2000);
			
	//Navigate to Staff
			Staff.navigateToStaff(dr);
			
	//Initializing actual and expected URL
			String actualURL=dr.getCurrentUrl();
			String expectedURL=Staff.STAFF;
	
	//Test if we are on the right URL
			if (actualURL.equals(expectedURL)) {
				
	//And click Add Employee Button 
					Staff.clickAddEmployee(dr);
					}
		}
		
	//CLICK ADD EMPLOYEE BUTTON AND TEST ACTUAL AND EXPECTED URL 
			public static void clickAddEmployee(WebDriver dr) throws Exception {
				Thread.sleep(2000);
	//Here comes to the Staff module and Clicks on New Employee Button
					navigateToStaff(dr);
					
	//Initializing actual and expected URL
					String actualURL=dr.getCurrentUrl();
					String expectedURL=Staff.ADDEMPLOYEES;
			
	//Test if we are on the right URL
					if (actualURL.equals(expectedURL))
						
						System.out.println("Start adding employees.");
					
				}
}
