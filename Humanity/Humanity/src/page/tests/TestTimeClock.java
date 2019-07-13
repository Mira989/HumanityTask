package page.tests;

import org.openqa.selenium.WebDriver;

import page.objects.Dashboard;
import page.objects.Staff;
import page.objects.TimeClock;

public class TestTimeClock {
	
	//ClockIn 
			public static void clockIn(WebDriver dr) throws Exception {
				Thread.sleep(2000);
				
		//Initializing actual and expected URL
				String actualURL=dr.getCurrentUrl();
				String expectedURL=TimeClock.TIME_CLOCK;
		
		//Test if we are on the right URL
				if (actualURL.equals(expectedURL))
					TimeClock.clickClockIn(dr);
				else {
					TimeClock.navigateToTimeClock(dr);
					TimeClock.clickClockIn(dr);
				}
				
		}
			
	//ClockOut Right Away
			public static void clockOut(WebDriver dr) throws Exception {
				Thread.sleep(2000);
				
		//Navigate to TimeClock
				clockIn(dr);
				TimeClock.clickClockOut(dr);
			}
			
	//CLOCK OUT AFTER GOING TO ANOTHER MODULE AND COME BACK
			public static void clockOutWithNavigate(WebDriver dr) throws Exception {
				Thread.sleep(2000);
				
		//Click Clock In
				clockIn(dr);
		//Go to Staff Module
				Staff.navigateToStaff(dr);
		//Go Back To TimeClock Module
				TimeClock.navigateToTimeClock(dr);
		//ClockOut
				TimeClock.clickClockOut(dr);
			}
			
	//CLOCK OUT AFTER LOGGING OUT AND COME BACK
			public static void clockOutWithLogOut(WebDriver dr) throws Exception {
				
		//Clock In
				clockIn(dr);
		//Log Out
				TestLogOut.logOut(dr);
		//Logging In Again
				Dashboard.openDashboard(dr);
				Thread.sleep(6000);
		//Go To TimeClock Module
				TimeClock.navigateToTimeClock(dr);
		//Clock Out
				TimeClock.clickClockOut(dr);
			}
}
