package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import model.DeletePublic1Model;

public class DeletePublic1Page extends DeletePublic1Model {

	public DeletePublic1Page(WebDriver e) {
		super(e);
		
	}
	public void clickPublic1() throws InterruptedException{
		
	WebElement el=getPublic1();
	el.click();
	}
	public void clickHide(){
	
	WebElement el1= getHide();
	el1.click();
	}
	
  public void clickName() throws InterruptedException{
	  Actions act=new Actions(driver);
	  WebElement cn=getName();
	  act.moveToElement(cn);
	  act.click();
	  act.perform();
  }
	
	
	public void clickEdit(){
		Actions act2=new Actions(driver);
		WebElement el2=getEdit();
		act2.moveToElement(el2);
		act2.click();
		act2.perform();
	}
	
	

}
