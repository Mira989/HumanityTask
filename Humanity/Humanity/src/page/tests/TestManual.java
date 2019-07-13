package page.tests;

import org.openqa.selenium.WebDriver;
import page.objects.Staff;

public class TestManual {

	// Test adding form that you have filled manually
		public static void manualAdd(WebDriver dr) throws Exception {
			Thread.sleep(2000);
			if (dr.getCurrentUrl().contains(Staff.NEW_EMPLOYEE_ADDED)) {
				System.out.println("Successful adding.");
			} else
				System.out.println("Unsuccessful adding.");
		}
}
