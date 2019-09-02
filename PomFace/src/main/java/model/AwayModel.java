package model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AwayModel extends TextModel {

	public AwayModel(WebDriver e) {
		super(e);
		
	}
	public WebElement getAway() throws InterruptedException{
		Thread.sleep(5000);
		WebElement el8=driver.findElement(By.xpath("//div[contains(text(),'Set yourself to')]"));
		return el8;
		
	}
	
	public List<WebElement> verifyAway() throws InterruptedException{
		Thread.sleep(4000);
		
	List<WebElement> sm=driver.findElements(By.xpath("//*[@data-qa='menu_item_button']"));
		return sm;
	
	}
	
	public WebElement getActive() throws InterruptedException{
		Thread.sleep(5000);
		WebElement el9=driver.findElement(By.xpath("//div[contains(text(),'Set yourself to')]"));
		return el9;
		
	}
	public List<WebElement> verifyActive() throws InterruptedException{
		Thread.sleep(4000);
		
		List<WebElement> st=driver.findElements(By.xpath("//*[@data-qa='menu_item_button']"));
			return st;
		
		}

}
