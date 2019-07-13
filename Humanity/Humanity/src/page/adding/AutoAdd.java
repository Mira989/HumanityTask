package page.adding;

import org.openqa.selenium.WebDriver;
import page.objects.Staff;
import page.tests.TestAuto;
import utility.Constant;
import utility.ExcelUtils;

public class AutoAdd {
	
	// ADD EMPLOYEE FORM
	
			public static void addEmployee(WebDriver dr, int i) throws Exception {
				String data;
				ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET1);
	
	// First Name
				Staff.clickFirstName(dr);
				data = ExcelUtils.getCellData(i, 0);
				Staff.sendKeysFirstName(dr, data);

	// Last Name
				Staff.clickLastName(dr);
				data = ExcelUtils.getCellData(i, 1);
				Staff.sendKeysLastName(dr, data);
				
	// Email
				Staff.clickEmail(dr);
				data = ExcelUtils.getCellData(i, 2);
				Staff.sendKeysEmail(dr, data);

	// Save Employee
				Staff.clickSaveEmployee(dr);
			
	//Test
				TestAuto.autoAdd(dr, i);
				
	
				}
			
	//Add All Employees 
			public static void allDataAdd(WebDriver dr) throws Exception {
				ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET1);
				for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
					addEmployee(dr, i);
					Staff.clickAddEmployee(dr);
					
				}
			}
}
