package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Staff {

	public static final String STAFF = "https://mira3.humanity.com/app/staff/list/load/true/";
	//URL of the list of where to add new employees
	public static final String ADDEMPLOYEES = "https://mira3.humanity.com/app/staff/add/";
	//URL when Successfully added employee
	public static final String NEW_EMPLOYEE_ADDED = "https://mira3.humanity.com/app/staff/assignstaff&new";
	
	private static final String ADD_BUTTON = "//button[@id='act_primary']";
	private static final String FIRST_NAME = "//input[@id='_asf1']";
	private static final String LAST_NAME = "//input[@id='_asl1']";
	private static final String EMAIL = "//input[@id='_ase1']";
	private static final String SAVE_BUTTON = "//button[@id='_as_save_multiple']";

	// Navigate To Staff
		public static void navigateToStaff(WebDriver dr) {
			dr.navigate().to(Staff.STAFF);
		}
		
	// Go to add new employee by clicking Add Employee Button
		public static WebElement getAddEmployee(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(ADD_BUTTON));
			return wb;
		}

		public static void clickAddEmployee(WebDriver dr) {
			getAddEmployee(dr).click();
		}
	
	// FirstName
			public static WebElement getFirstName(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(FIRST_NAME));
				return wb;
			}

			public static void clickFirstName(WebDriver dr) {
				getFirstName(dr).click();
			}

			public static void sendKeysFirstName(WebDriver dr, String str) {
				getFirstName(dr).clear();
				getFirstName(dr).sendKeys(str);
			}
	
	// LastName
			public static WebElement getLastName(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(LAST_NAME));
				return wb;
			}

			public static void clickLastName(WebDriver dr) {
				getLastName(dr).click();
			}

			public static void sendKeysLastName(WebDriver dr, String str) {
				getLastName(dr).clear();
				getLastName(dr).sendKeys(str);
			}
	
	// Email
			public static WebElement getEmail(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(EMAIL));
				return wb;
			}

			public static void clickEmail(WebDriver dr) {
				getEmail(dr).click();
			}

			public static void sendKeysEmail(WebDriver dr, String str) {
				getEmail(dr).clear();
				getEmail(dr).sendKeys(str);
			}
			
	// Save Employee
			public static WebElement getSaveEmployee(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(SAVE_BUTTON));
				return wb;
			}

			public static void clickSaveEmployee(WebDriver dr) {
				getSaveEmployee(dr).click();
			}
}
