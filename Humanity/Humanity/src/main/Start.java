package main;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.adding.AutoAdd;
import page.adding.ManualAdd;
import page.objects.Dashboard;
import page.tests.TestStaff;
import page.tests.TestTimeClock;

public class Start {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		Thread.sleep(2000);

		Dashboard.openDashboard(dr);
		TestStaff.clickAddEmployee(dr);
			
		try {
			
			Scanner sc = new Scanner(System.in);
		//Add Employees - Choose between manually and automation
			System.out.println("Choose your way to add employees: Manually=1 or Auto=2");
			int add = sc.nextInt();
		
		//Test Adding Employees
			if (add==1)ManualAdd.addEmployee(dr);
			else if (add==2)AutoAdd.allDataAdd(dr);
			else System.out.println("You have choosen the wrong number.");
			
		//Test TimeClock
			TestTimeClock.clockOut(dr);
			TestTimeClock.clockOutWithNavigate(dr);
			TestTimeClock.clockOutWithLogOut(dr);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			dr.quit();
		}

	}

}
