package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextModel extends ModelBase {

	public TextModel(WebDriver e) {
		super(e);
		
	}
	public WebElement getText(){
		WebElement xp2=driver.findElement(By.xpath("//div[@data-team-id='TMLQ2PYEA']"));
		
		return xp2;
		
	}
	
	public WebElement getTime(String text){
		
		WebElement time = driver.findElement(By.xpath("//span[text()='"+text+"']/preceding-sibling::*/a/span"));
		return time;
	}
	
	
	
		

}
