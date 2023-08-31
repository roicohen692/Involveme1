package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeadphoneSalesAssistantPage extends BasePage{
	@FindBy(css= ".c-answer-container.v-horizontal.v-grid-3 div:nth-child(2)")	
	private WebElement inearBtn;	
	@FindBy(css= ".c-answer-container.v-horizontal.v-grid-2 div:nth-child(2)")	
	private WebElement noisecancellingBtn ;	
	@FindBy(css= ".c-image-answer.answer-behaviour:nth-child(3)")	
	private WebElement mysterboomplugsBtn;	
	@FindBy(css= ".c-headline-container.content-item h1 span")	
	private WebElement  thankyouMsg;
		
	public HeadphoneSalesAssistantPage(WebDriver driver) {
		super(driver);		
	}
	public void headphones() {
		waiting(1000);
		click(inearBtn);
	}
	public void absollutelynot() {
		waiting(1000);
		click(noisecancellingBtn);
	}
	public void recommendation() {
		waitForElementToBeClickable(mysterboomplugsBtn);
		click(mysterboomplugsBtn);
	}
	public String thankyouMsg() {
		waitForElementToBeInVisible(thankyouMsg);
		return getText(thankyouMsg);
	}
}
