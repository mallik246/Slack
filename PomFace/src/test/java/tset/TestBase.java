package tset;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import page.AdditionalPage;
import page.AwayPage;
import page.ChannelPage;
import page.CreatePublicPage;
import page.DeleteFinalPage;
import page.DeletePublic1Page;
import page.HomePage;
import page.LandingPage;
import page.RenamePage;
import page.SetTestingPage;
import page.SignInMallikPage;
import page.SignInPage;
import page.TextPage;

public class TestBase {
	WebDriver driver;
	static LandingPage landingpage;
	static SignInPage signin;
	static SignInMallikPage signmallik;
	static ChannelPage clickChannelp;
	static CreatePublicPage pPage;
	static DeletePublic1Page deletePage;
	static RenamePage renamePa;
	static AdditionalPage additionalP;
	static DeleteFinalPage deleteFinalP;
	static HomePage homepage;
	static TextPage textPage;
	static AwayPage awayPage;
	static SetTestingPage settestingpage;
	
	@BeforeSuite
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://slack.com");
		}
		public LandingPage getLandingPage(){
		
		landingpage = new LandingPage(driver);
		return landingpage;
		}
public SignInPage getSignInPage(){
		
		signin=new SignInPage(driver);
		return signin;
}
public SignInMallikPage getSignInMallikP(){
	signmallik=new SignInMallikPage(driver);
	return signmallik;
	
	
}
public HomePage getHomePage(){
	homepage=new HomePage(driver);
	return homepage;
}


public ChannelPage clickChan(){
	clickChannelp =new ChannelPage(driver);
	
	return clickChannelp;
	
}
public CreatePublicPage cpPage(){
 pPage=new CreatePublicPage(driver);
 return pPage;
}
public DeletePublic1Page deletePage(){
	
	deletePage=new DeletePublic1Page(driver);
	return deletePage;
}
public RenamePage renamePage(){
	renamePa=new RenamePage(driver);
	return renamePa;
	}
public AdditionalPage addionalPage(){
	additionalP=new AdditionalPage(driver);
	return additionalP;
	}
public DeleteFinalPage DeleteFinal(){
	deleteFinalP=new DeleteFinalPage(driver);
	return deleteFinalP;
}
public TextPage clickText (){
	textPage=new TextPage(driver);
	return textPage;
}
public AwayPage clickAway(){
	awayPage=new AwayPage(driver);
	return awayPage;
}
public SetTestingPage setTest(){
	settestingpage =new SetTestingPage(driver);
	return settestingpage;
	
}

}
