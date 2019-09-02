package tset;
import org.testng.annotations.Test;

public class SignInTest extends LandingPageTest {
		
	@Test
	public void signn() throws InterruptedException{
		
		getLandingPage();
		getSignInPage();
		signin.sendEmail("mallikgroup");
		signin.clickNext();
		
		}	
	
	
	}
	


