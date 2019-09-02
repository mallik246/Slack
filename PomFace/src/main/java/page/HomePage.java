package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.HomeModel;

public class HomePage extends HomeModel {

	public HomePage(WebDriver e) {
		super(e);

		
	}
	
	public void clickGeneral() throws InterruptedException{
		WebElement cg=getGeneral();
		cg.click();
	}
	
	public void clickMallik() throws InterruptedException {
		WebElement cg=getMallik();
		cg.click();
	}
	
	public void sendText(String t) throws InterruptedException{
		WebElement st=getText();
		st.sendKeys(t);
	}
	
	
	

	
	
	public void clickOnChannel(String channelName)  {
		//getting list of channel after creating new channel.
		List<WebElement> ele = getChannelList();
		for (WebElement el : ele) {
			//System.out.println(el.getText());
			if (el.getText().equals(channelName)) {
				el.click();
				break;
			}
		}

	}
	
	
	
}
