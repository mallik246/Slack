package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdditionalModel extends ModelBase {

	public AdditionalModel(WebDriver e) {
		super(e);
		
	}
	
	public WebElement getAdditional(){
		WebElement el7=driver.findElement(By.xpath("//button[@data-action='delete']"));
		return el7;
	}

}
