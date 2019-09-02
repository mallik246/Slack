package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.SignInMallikModel;

public class SignInMallikPage extends SignInMallikModel {

	public SignInMallikPage(WebDriver e) {
		super(e);
		
	}
	public void sendEm(String em) throws InterruptedException{
		WebElement e=	getEmail();    //getSignin
		e.sendKeys(em);
		}
	
	public void sendPa(String pas){
		WebElement pa= getPasword();
		pa.sendKeys(pas);
		}
	
	public void clickN(){
		WebElement n=	getclick();
		n.click();
		}
	
	
	

}
