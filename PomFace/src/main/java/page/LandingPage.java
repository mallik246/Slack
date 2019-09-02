package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.LandingModel;

public class LandingPage extends LandingModel {

	public LandingPage(WebDriver e) {
		super(e);
		
	}
	
	public void clickonsignin(){
		WebElement e=	getSignin();
		e.click();
		}
	

}
