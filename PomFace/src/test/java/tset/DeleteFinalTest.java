package tset;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteFinalTest extends TestBase {
	
	@Test
	public void mallik() throws InterruptedException {
		getLandingPage();
		landingpage.clickonsignin();

		getSignInPage();
		signin.sendEmail("mallikgroup");
		signin.clickNext();
		getSignInMallikP();
		signmallik.sendEm("pmallik246@gmail.com");
		signmallik.sendPa("Shetup246$");
		signmallik.clickN();
		
		
		String channelName = "firefox";
		getHomePage();
		homepage.clickOnChannel(channelName);
		
		deletePage();
		//deletePage.clickPublic1();
		deletePage.clickHide();
		deletePage.clickName();
		deletePage.clickEdit();
		renamePage();
		renamePa.clickRename();
		addionalPage();
		additionalP.clickAdditional();
		DeleteFinal();
		deleteFinalP.clickCheck();
		deleteFinalP.clickDelete();
		cpPage();
//		String channelName = "public1";
		Assert.assertFalse(pPage.isChannelPresent(channelName));
	}

}
