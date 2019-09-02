package model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SetTestingModel extends ModelBase {

	public SetTestingModel(WebDriver e) {
		super(e);
	}

	public WebElement getTesting() throws InterruptedException {
		Thread.sleep(4000);
		WebElement el8 = driver.findElement(By.xpath("//div[contains(text(),'Set a status')]"));
		return el8;

	}

	public WebElement getKeys() throws InterruptedException {
		Thread.sleep(3000);
		WebElement el9 = driver.findElement(By.xpath("//div[@id='custom_status_input_for_team_menu']"));
		return el9;
	}

	public WebElement getSave() {
		WebElement sv = driver.findElement(By.xpath("//button[@data-qa='custom_status_input_go']"));
		return sv;
	}

	public List<WebElement> getCustomizeStatus() throws InterruptedException {
		Thread.sleep(4000);

		List<WebElement> st = driver.findElements(By.xpath("//*[@data-qa='menu_item_button']"));
		return st;

	}
}
