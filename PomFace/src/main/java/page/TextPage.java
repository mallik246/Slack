package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.TextModel;

public class TextPage extends TextModel {

	public TextPage(WebDriver e) {
		super(e);
	}
	public void sendText(String sms){
		WebElement st=getText();
		st.sendKeys(Keys.chord(sms),Keys.ENTER);
	}
	
	public String getTextTime(String text){
		String time;
		WebElement t = getTime(text);
		time = t.getAttribute("data-stringify-text");
		return time;
	}

}
