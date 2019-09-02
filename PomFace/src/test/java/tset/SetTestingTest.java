package tset;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SetTestingTest extends TestBase {
	
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
		setTest();
		settestingpage.clickTesting();
		settestingpage.cliclKeys("Testing");
		settestingpage.clickSave();
		getHomePage();
		homepage.clickMallik();
		clickAway();
		boolean c=awayPage.checkStatusV("Clear status");
		Assert.assertTrue(c);
		

}
}
