package model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeletePublic1Model extends ModelBase {

	public DeletePublic1Model(WebDriver e) {
		super(e);
	
	}
	
	public WebElement getPublic1 () throws InterruptedException{
		
		WebElement xp=driver.findElement(By.xpath("//*[@ data-drag-id='CMG7VH3S5']"));
		return xp;
		
	}
	public WebElement getHide() {
		WebElement hd=driver.findElement(By.xpath(" //i[@type='info-circle']"));
		return hd;
	}
	
	public WebElement getName() throws InterruptedException {
		Thread.sleep(4000);
		WebElement nam=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[5]/div/div/div[2]/div[1]/div/div[1]/div/div[1]/div/h4[1]"));
		return nam;
	}
	
	
	
	public WebElement getEdit() {
		WebElement ed=driver.findElements(By.xpath("//*[contains(text(),'edit')]")).get(1);
		return ed;
		
	}
//	public void clickOnChannel(String channelName) throws InterruptedException {
//		
//		List<WebElement> ele = getChannelListt();
//		for (WebElement el : ele) {
//			if (el.getText().equals(channelName)) {
//				el.click();
//				break;
//			}
//		}
//
//	}

}
