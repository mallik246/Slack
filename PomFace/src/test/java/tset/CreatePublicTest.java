package tset;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatePublicTest extends TestBase {

	@Test
	public void mallik() throws InterruptedException {
		String channelName = "dada";
		getLandingPage();
		landingpage.clickonsignin();

		getSignInPage();
		signin.sendEmail("mallikgroup");
		signin.clickNext();
		getSignInMallikP();
		signmallik.sendEm("pmallik246@gmail.com");
		signmallik.sendPa("Shetup246$");
		signmallik.clickN();
		clickChan();
		clickChannelp.clickChannel();
		cpPage();
		pPage.inputName(channelName);
		pPage.inputPurpose("work");
		pPage.inputInvite("Parthib246");
		pPage.clickCreate();

		Assert.assertTrue(pPage.isChannelPresent(channelName));

	}
}
