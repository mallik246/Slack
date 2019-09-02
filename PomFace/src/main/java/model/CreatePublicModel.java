package model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatePublicModel extends ModelBase {

	public CreatePublicModel(WebDriver e) {
		super(e);
		
	}
	
	public WebElement getName(){
		WebElement name=driver.findElement(By.xpath("//input[@role='combobox'][1]"));
		return name;
	}
	public WebElement getPurpose() throws InterruptedException{
		Thread.sleep(5000);
		
		WebElement purr=driver.findElement(By.xpath("//*[@id='channel_create_modal_purpose']/p"));
		return purr;
	}
	public WebElement sendInvite() throws InterruptedException{
		Thread.sleep(4000);
		WebElement in=driver.findElement(By.xpath("//input[@id='invite_users_input_invites']"));
		in.sendKeys();
		return in;
	}
	
	public WebElement getCreate(){
		WebElement creat=driver.findElement(By.xpath("//button[@data-qa='create_action']"));
		return creat;	
	}
	public List<WebElement> getChannelList() throws InterruptedException{
	Thread.sleep(4000);
	List <WebElement> creat=driver.findElements(By.xpath("//*[@data-qa-channel-sidebar-channel-type='channel']"));
		return creat;	
	}
	
//	list of channels
	//*[@data-qa-channel-sidebar-channel-type='channel']
}
