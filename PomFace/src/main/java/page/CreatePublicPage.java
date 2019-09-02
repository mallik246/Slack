package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import model.CreatePublicModel;

public class CreatePublicPage extends CreatePublicModel {

	public CreatePublicPage(WebDriver e) {
		super(e);
	}

	public void inputName(String na) {
		WebElement inp = getName();
		inp.sendKeys(na);
	}

	public void inputPurpose(String pur) throws InterruptedException {

		WebElement ele = getPurpose();
		Actions act = new Actions(driver);

		act.moveToElement(ele);
		act.click();
		act.sendKeys(pur);
		act.perform();

	}

	public void inputInvite(String invite) throws InterruptedException {
		WebElement invit = sendInvite();
		invit.sendKeys(invite);
	}

	public void clickCreate() {
		WebElement element = getCreate();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}


	public boolean isChannelPresent(String channelName) throws InterruptedException {
		boolean result = false;
		//getting list of channel after creating new channel.
		List<WebElement> ele = getChannelList();
		for (WebElement el : ele) {
			//System.out.println(el.getText());
			if (el.getText().equals(channelName)) {
				result = true;
			
				break;
			}
		}

		return result;
	}

}
