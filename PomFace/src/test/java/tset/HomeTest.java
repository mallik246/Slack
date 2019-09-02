package tset;

import org.testng.annotations.Test;

public class HomeTest extends TestBase {
	
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
		homepage.clickGeneral();
		//homepage.sendText("Hello");
		
		
		
		
		
	}


}
