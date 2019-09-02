package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.AwayModel;

public class AwayPage extends AwayModel {

	public AwayPage(WebDriver e) {
		super(e);
	}
	
	public void clickAway() throws InterruptedException{
		WebElement ca= getAway();
		ca.click();
	}
	public void clickActive() throws InterruptedException{
		WebElement ct= getActive();
		ct.click();
	}
	
	public boolean checkStatus(String active) throws InterruptedException{
		boolean result=false;
		List<WebElement> ele2 = verifyAway();
		for (WebElement ell : ele2) {
			//System.out.println(el.getText());
			if (ell.getText().contains(active)) {
				ell.click();
				result=true;
				break;
			}
		}
		return result;
	}
	public boolean checkStatusV(String away) throws InterruptedException{
		boolean result=false;
		List<WebElement> ele2 = verifyActive();
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
