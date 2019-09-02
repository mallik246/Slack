package tset;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AwayTest extends TestBase {
	@Test
	public void mallik() throws InterruptedException{
		
		getLandingPage();
		landingpage.clickonsignin();
		
		getSignInPage();
		signin.sendEmail("mallikgroup");
		signin.clickNext();
		getSignInMallikP();
		signmallik.sendEm("pmallik246@gmail.com");
		signmallik.sendPa("Shetup246$");
		signmallik.clickN();
		
		getHomePage();
		homepage.clickMallik();
		clickAway();
		awayPage.clickAway();
		homepage.clickMallik();
		boolean b =awayPage.checkStatus("Away");
		Assert.assertTrue(b);
		
		getHomePage();
		homepage.clickMallik();
		clickAway();
		awayPage.clickActive();
		homepage.clickMallik();
		boolean c=awayPage.checkStatusV("Active");
		Assert.assertTrue(c);
		
}
}
