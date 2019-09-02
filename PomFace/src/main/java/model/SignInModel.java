package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInModel extends LandingModel {

	public SignInModel(WebDriver e) {
		super(e);
		
	}
	
	public WebElement getEmail() throws InterruptedException{
	WebElement el2=driver.findElement(By.xpath("//*[@id='domain']"));
	return el2;
	}
	
	public WebElement getContinue(){
		WebElement el3=driver.findElement(By.xpath("//*[@id='submit_team_domain']"));
		return el3;
		
		
		
	}

}
