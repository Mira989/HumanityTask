package page.tests;

import org.openqa.selenium.WebDriver;

import page.objects.LogOut;

	public class TestLogOut {
		public static void logOut(WebDriver dr) throws Exception {
			Thread.sleep(2000);

			LogOut.logOut(dr);
	//Initializing actual and expected URL
			String actualURL=dr.getCurrentUrl();
			String expectedURL=LogOut.LOGOUT_PAGE;

	//Test if we are on the right URL
			if (actualURL.equals(expectedURL)) {
				System.out.println("OK!");
			}
}
}