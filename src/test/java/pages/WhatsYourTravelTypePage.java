package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatsYourTravelTypePage extends BasePage{
	@FindBy(css= ".c-image-answer.answer-behaviour.square:nth-child(2)")	
	private WebElement destinationBtn;
	@FindBy(css= ".c-image-answer.answer-behaviour.square:nth-child(4)")	
	private WebElement placetosleepBtn;
	@FindBy(css= ".c-image-answer.answer-behaviour.square:nth-child(2)")	
	private WebElement travelessentialBtn;
	@FindBy(css= ".c-headline-container.content-item h1>span")	
	private WebElement travelerMsg ;

	public WhatsYourTravelTypePage(WebDriver driver) {
		super(driver);
		
	}
	public void Philippines() {
		waiting(1000);
		click(destinationBtn);
	}
	public void hammock() {
		waiting(1000);;
		click(placetosleepBtn);
	}
	public void snorkelandmask() {
		waiting(1000);
		click(travelessentialBtn);
	}
	public String travelerMsg() {
		waitForElementToBeVisible(travelerMsg);
		return getText(travelerMsg);
	}
	

}
