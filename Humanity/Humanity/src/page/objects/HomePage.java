package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static final String HOMEPAGE = "https://www.humanity.com/";
		
	private static final String LOGIN = "//p[contains(text(),'LOGIN')]";
	

	//Open Browser on Home Page "Humanity"
			public static void openHomePage(WebDriver dr) {
				dr.get(HOMEPAGE);
			}
			
	//Click LogIn
			public static WebElement getLogIn(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(LOGIN));
				return wb;
			}

			public static void clickLogIn(WebDriver dr) {
				getLogIn(dr).click();
			}
}


