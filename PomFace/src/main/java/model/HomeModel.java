package model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends ModelBase {

	public HomeModel(WebDriver e) {
		super(e);
		
	}

		public WebElement getGeneral() throws InterruptedException{
			Thread.sleep(3000);
			
			WebElement gt=driver.findElement(By.xpath("//a[@data-drag-id='CM75J0XM1']"));
			return gt ;
			
			
		}
public WebElement getText() throws InterruptedException{
	Thread.sleep(3000);
			
			WebElement ge=driver.findElement(By.xpath("//div[@data-team-id='TMLQ2PYEA']"));
			return ge;
}
public WebElement getMallik() throws InterruptedException{
	Thread.sleep(6000);
			
			WebElement gm=driver.findElement(By.xpath("//i[@type='chevron-down']"));
			return gm;
}
	

	
	public List<WebElement> getChannelList(){
		
		List <WebElement> create=driver.findElements(By.xpath("//*[@data-qa-channel-sidebar-channel-type='channel']"));
			return create;	
		}

}
