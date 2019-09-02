package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInMallikModel extends SignInModel{

	public SignInMallikModel(WebDriver e) {
		super(e);
	
	}
	public WebElement getEmail() throws InterruptedException{
		Thread.sleep(5000);
		WebElement el4=driver.findElement(By.xpath("//*[@id='email']"));
		return el4;
	}
	
	public WebElement getPasword(){
		WebElement el5=driver.findElement(By.xpath("//*[@id='password']"));
		return el5;
	}
	public WebElement getclick(){
		
		WebElement el6=driver.findElement(By.xpath("//*[@id='signin_btn']"));
		return el6;
	}
	
	

}
