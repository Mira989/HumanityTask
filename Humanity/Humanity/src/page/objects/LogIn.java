package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

	public static final String LOGIN_PAGE = "https://www.humanity.com/app/";
	
	private static final String USER_NAME = "//input[@id='email']";
	private static final String PASSWORD = "//input[@id='password']";
	private static final String LOGIN_BUTTON = "//button[contains(text(),'Log in')]";
	
	// UserName
				public static WebElement getUserName(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(USER_NAME));
					return wb;
				}

				public static void clickUserName(WebDriver dr) {
					getUserName(dr).click();
				}

				public static void sendKeysUserName(WebDriver dr) {
					getUserName(dr).sendKeys("mirjana.pavkovic989@gmail.com");
				}
				
	// Password
				public static WebElement getPassword(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(PASSWORD));
					return wb;
				}

				public static void clickPassword(WebDriver dr) {
					getPassword(dr).click();
				}

				public static void sendKeysPassword(WebDriver dr) {
					getPassword(dr).sendKeys("11335577mp");
				}
				
	// LogIn Button
				public static WebElement getLogIn(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(LOGIN_BUTTON));
					return wb;
				}

				public static void clickLogIn(WebDriver dr) {
					getLogIn(dr).click();
				}
				
	// Loging In	
				public static void logIn(WebDriver dr) throws Exception {
					Thread.sleep(20000);
					LogIn.clickUserName(dr);
					LogIn.sendKeysUserName(dr);
					LogIn.clickPassword(dr);
					LogIn.sendKeysPassword(dr);
					LogIn.clickLogIn(dr);
				}
}
