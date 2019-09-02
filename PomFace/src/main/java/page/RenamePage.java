package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.RenameModel;

public class RenamePage extends RenameModel {

	public RenamePage(WebDriver e) {
		super(e);
	
	}
	public void clickRename() throws InterruptedException{
		WebElement cr=getRename();
		cr.click();
	}

}
