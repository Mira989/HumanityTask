package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOut {
	public static final String LOGOUT_PAGE = "https://mira3.humanity.com/app/";
	
	private static final String PROFILE_OPTIONS = "//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";
	private static final String LOGOUT = "//a[contains(text(),'Sign Out')]";

	// Click On Arrow For Profile Options
	public static WebElement getArrow(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(PROFILE_OPTIONS));
		return wb;
	}

	public static void clickArrow(WebDriver dr) {
		getArrow(dr).click();
	}
	
	// Log Out
	public static WebElement getSignOut(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LOGOUT));
		return wb;
	}

	public static void clickSignOut(WebDriver dr) {
		getSignOut(dr).click();
	}
	
	//Loging Out
	public static void logOut(WebDriver dr) throws Exception {
		LogOut.clickArrow(dr);
		LogOut.clickSignOut(dr);
	}
}
