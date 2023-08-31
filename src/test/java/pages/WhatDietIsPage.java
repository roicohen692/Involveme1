package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatDietIsPage extends BasePage{
	
	@FindBy(css= ".c-answers-container.v-grid-1 > div:nth-child(2) > button")	
	private WebElement livelonglifeBtn;
	@FindBy(css= ".c-answers-container.v-grid-1 > div:nth-child(1) > button")	
	private WebElement unprocessedBtn;
	@FindBy(css= ".c-answers-container.v-grid-1 > div:nth-child(2) > button")	
	private WebElement nomeatBtn;
	@FindBy(css= ".form-item:nth-child(1) input")	
	private WebElement formnameFild;
	@FindBy(css= ".input-label.lastName-label>input")	
	private WebElement formlastnameFild;
	@FindBy(css= ".input-label.email-label>input")	
	private WebElement formemailFild;
	@FindBy(css= ".component-needs-validation.form-checkbox.form-group:nth-child(1)")	
	private WebElement newsletterBtn;
	@FindBy(css= ".e-headline.is-shrinkable:nth-child(1) h1>span:nth-child(1)")	
	private WebElement fooddietMsg;

	public WhatDietIsPage(WebDriver driver) {
		super(driver);		
	}
	public void livelonglife() {
		waiting(500);
		click(livelonglifeBtn);
	}
	public void unprocessed() {
		waiting(1000);
		click(unprocessedBtn);
	}
	public void nomeat() {
		waiting(1000);
		click(nomeatBtn);
	}
	public void fiilform(String name, String lastname, String email) {
		waitForElementToBeInVisible(formemailFild);
		fillText(formnameFild, name);
		fillText(formlastnameFild, lastname);
		fillText(formemailFild, email);
	}
	public void newsletter() {
		waiting(500);
		click(newsletterBtn);
	}
	public String fooddietMsg() {
		waiting(1000);
		return getText(fooddietMsg);
	}
}
