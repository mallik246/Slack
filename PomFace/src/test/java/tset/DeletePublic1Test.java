package tset;
import org.testng.annotations.Test;

public class DeletePublic1Test extends TestBase {
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
		
		deletePage();
		deletePage.clickPublic1();
		deletePage.clickHide();
		deletePage.clickName();
		deletePage.clickEdit();

	}

}
