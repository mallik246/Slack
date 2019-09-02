package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.SignInModel;

public class SignInPage extends SignInModel {

	public SignInPage(WebDriver e) {
		super(e);
		
	}
	
	public void sendEmail(String em) throws InterruptedException{
		WebElement e=	getEmail();
		e.sendKeys(em);
		}
	
	public void clickNext(){
		WebElement n=	getContinue();
		n.click();
		}
	

}
