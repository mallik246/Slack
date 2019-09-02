package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.DeleteFinalModel;

public class DeleteFinalPage extends DeleteFinalModel {

	public DeleteFinalPage(WebDriver e) {
		super(e);
		
	}
	public void clickCheck() throws InterruptedException{
		WebElement ch=getCheck();
		ch.click();
	}
	public void clickDelete(){
		WebElement ch=getDelete();
		ch.click();
	}
	
	
	

}
