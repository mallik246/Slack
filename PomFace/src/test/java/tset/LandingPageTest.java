package tset;

import org.testng.annotations.Test;

public class LandingPageTest extends TestBase {
	@Test
	public void signInTest(){
	getLandingPage();
	landingpage.clickonsignin();
	
	}

}
