package page.tests;

import org.openqa.selenium.WebDriver;

import page.objects.Staff;
import utility.ExcelUtils;

public class TestAuto {

	// Test adding form that you have filled automatically
		public static void autoAdd(WebDriver dr, int i) throws Exception {
			Thread.sleep(2000);
			ExcelUtils.setCellData("Add", 0, 3);

			if (dr.getCurrentUrl().contains(Staff.NEW_EMPLOYEE_ADDED)) {
				ExcelUtils.setCellData("Pass", i, 3);
			} else {
				ExcelUtils.setCellData("Fail", i, 3);
				Staff.navigateToStaff(dr);
			}

		}
}
