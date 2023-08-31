package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppableGymShoePage extends BasePage{
	@FindBy(css= ".answer-radio.image-answer.is-single:nth-child(2)")	
	private WebElement gymBtn  ;
	@FindBy(css= ".content-item.is-snappable > div > div.c-answers-container.v-grid-1 > div:nth-child(2) > button")	
	private WebElement runBtn  ;
	@FindBy(css= ".c-image-answer.answer-behaviour:nth-child(2)")	
	private WebElement fitnessBtn  ;
	@FindBy(css= ".answer-radio.image-answer.is-single:nth-child(2)")	
	private WebElement feelthegroundBtn  ;
	@FindBy(css= ".answer-radio.image-answer.is-single:nth-child(2)")	
	private WebElement fastBtn  ;
	@FindBy(css= ".c-image-answer.answer-behaviour:nth-child(2)")	
	private WebElement mensBtn  ;
	@FindBy(css= ".e-subheadline:nth-child(2) span:nth-child(1)")	
	private WebElement resultsMsg  ;

	public ShoppableGymShoePage(WebDriver driver) {
		super(driver);
		
	}
	public void gym() {
		waiting(1000);;
		click(gymBtn);
	}
	public void runmiles() {
		waitForElementToBeClickable(runBtn);;
		click(runBtn);
	}
	public void fitness() {
		waitForElementToBeClickable(fitnessBtn);
		click(fitnessBtn);
	}
	public void feeltheground() {
		waiting(1000);
		click(feelthegroundBtn);
	}
	public void fast() {
		waiting(1000);;
		click(fastBtn);
	}
	public void mens() {
		waiting(1000);;
		click(mensBtn);
	}
	public String  resultsMsg() {
		waitForElementToBeVisible(resultsMsg);
		return getText(resultsMsg);
	}
		
}
