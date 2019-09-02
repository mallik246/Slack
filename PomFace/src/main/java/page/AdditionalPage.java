package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.AdditionalModel;

public class AdditionalPage extends AdditionalModel {

	public AdditionalPage(WebDriver e) {
		super(e);
		
	}
	
	public void clickAdditional(){
		WebElement ee=getAdditional();
		ee.click();
		
	}
	

}
