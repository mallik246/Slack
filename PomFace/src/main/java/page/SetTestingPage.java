package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.SetTestingModel;

public class SetTestingPage extends SetTestingModel {

	public SetTestingPage(WebDriver e) {
		super(e);
	}
	public void clickTesting() throws InterruptedException{
		WebElement el=getTesting();
		el.click();
	}
	public void cliclKeys(String ke) throws InterruptedException{
		WebElement al=getKeys();
		al.sendKeys(ke);
	}
	
	public void clickSave(){
		WebElement sa=getSave();
		sa.click();
	}

	public boolean checkStatusV(String away) throws InterruptedException{
		boolean result=false;
		List<WebElement> ele2 = getCustomizeStatus();
		for (WebElement ell : ele2) {
			//System.out.println(el.getText());
			if (ell.getText().contains(away)) {
				ell.click();
				result=true;
				break;
			}
		}
		return result;
	}
	
	

}
