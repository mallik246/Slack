package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChannelModel extends ModelBase {

	public ChannelModel(WebDriver e) {
		super(e);
		
	}
	
	public WebElement getChannel(){
		WebElement ch=driver.findElement(By.xpath("//button[contains(@aria-label,'Create a channel')]"));
		return ch;
	}

}
