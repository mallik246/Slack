package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RenameModel extends ModelBase {

	public RenameModel(WebDriver e) {
		super(e);
		
	}
	
	public WebElement getRename() throws InterruptedException{
		Thread.sleep(4000);
		WebElement el7=driver.findElement(By.xpath("//i[@type='arrow_large_left']"));
		return el7;
	}

}
