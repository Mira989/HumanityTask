package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TimeClock {
	
	public static final String TIME_CLOCK = "https://mira3.humanity.com/app/timeclock/";

	private static final String CLOCK_IN = "//a[@id='tc_tl_ci']";
	private static final String CLOCK_OUT = "//span[@class='clockOut_help_tag']";
	
	// Navigate To Time Clock
		public static void navigateToTimeClock(WebDriver dr) {
			dr.navigate().to(TimeClock.TIME_CLOCK);
		}
	
	// Clock In
		public static WebElement getClockIn(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(CLOCK_IN));
				return wb;
		}

		public static void clickClockIn(WebDriver dr) {
				getClockIn(dr).click();
		}
					
	// Clock Out
		public static WebElement getClockOut(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(CLOCK_OUT));
				return wb;
		}

		public static void clickClockOut(WebDriver dr) {
				getClockOut(dr).click();
		}
}
