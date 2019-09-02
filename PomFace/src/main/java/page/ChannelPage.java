package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.ChannelModel;

public class ChannelPage extends ChannelModel {

	public ChannelPage(WebDriver e) {
		super(e);
		
	}
	
	public void clickChannel(){
		WebElement cha= getChannel();
		cha.click();
	}

}
