package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingModel extends ModelBase {

	public LandingModel(WebDriver e) {
		super(e);
	}
	
	public WebElement getSignin(){
		WebElement el=driver.findElement(By.xpath("//*[@id='main']/section[1]/div/header/div/form/p/a"));
		return el;
	}

}
