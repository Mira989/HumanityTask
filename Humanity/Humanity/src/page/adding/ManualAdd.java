package page.adding;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;

import page.objects.Staff;
import page.tests.TestManual;
import page.tests.TestStaff;

public class ManualAdd {
	
	// ADD EMPLOYEE FORM
			public static void addEmployee(WebDriver dr) throws Exception {

				Scanner sc = new Scanner(System.in);
				
		//Add New Employee
				TestStaff.clickAddEmployee(dr);
				
		// First Name
				System.out.println("Enter First Name: ");
				String firstname = sc.nextLine();
				Staff.clickFirstName(dr);
				Staff.sendKeysFirstName(dr, firstname);

		// Last Name
				System.out.println("Enter Last Name: ");
				String lastname = sc.nextLine();
				Staff.clickLastName(dr);
				Staff.sendKeysLastName(dr, lastname);
				
		// Email
				System.out.println("Enter Email: ");
				String email = sc.nextLine();
				Staff.clickEmail(dr);
				Staff.sendKeysEmail(dr, email);

		// Save Employee
				Staff.clickSaveEmployee(dr);
			
		//Test
				TestManual.manualAdd(dr);
			}
}
