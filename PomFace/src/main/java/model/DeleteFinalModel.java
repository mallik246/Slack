package model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteFinalModel extends ModelBase {

	public DeleteFinalModel(WebDriver e) {
		super(e);
		
	}
	public WebElement getCheck() throws InterruptedException{
		Thread.sleep(5000);
		WebElement el9=driver.findElement(By.xpath("//input[@id='delete_channel_cb']"));
		return el9;
		
	}
	
	public WebElement getDelete(){
		WebElement el10=driver.findElement(By.xpath("//button[@data-qa='create_action']"));
		return el10;
	}
	
		
	
}
