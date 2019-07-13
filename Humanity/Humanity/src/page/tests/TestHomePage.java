package page.tests;

import org.openqa.selenium.WebDriver;
import page.objects.HomePage;

public class TestHomePage {
	
	//Open Browser on Home Page Humanity and Test Actual and Expected URL 
			public static void openHomePage(WebDriver dr) throws Exception {
				Thread.sleep(2000);
				HomePage.openHomePage(dr);
				
			//Initializing actual and expected URL
				String actualURL=dr.getCurrentUrl();
				String expectedURL=HomePage.HOMEPAGE;
				
			//Test if we are on the right URL
				if (actualURL.equals(expectedURL))
					
				//We can click LogIn Button
					HomePage.clickLogIn(dr);
				
			}
			
}
