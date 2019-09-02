package tset;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ReadExcel;

public class SignInMallikTest extends TestBase {
	
	@Test(dataProvider="login")
	public void mallik(String user, String pass) throws InterruptedException{
		
		getLandingPage();
		landingpage.clickonsignin();
		
		getSignInPage();
		signin.sendEmail("mallikgroup");
		signin.clickNext();
		getSignInMallikP();
		signmallik.sendEm(user);
		signmallik.sendPa(pass);
		signmallik.clickN();	
		
	}
	
	@DataProvider(name="login")
	public Object[][] datafeeder() throws IOException{
		
		Object[][]tab = ReadExcel.dataprovider("data/Slack.xlsx","Sheet1");
		return tab;
	}

}
