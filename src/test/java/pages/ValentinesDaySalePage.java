package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValentinesDaySalePage extends BasePage{	
	@FindBy(css = ".c-image-answer.answer-behaviour.circle:nth-child(1)")
	private WebElement donutsBtn ;	
	@FindBy(css = ".input-label.email-label input")
	private WebElement emailFild ;	
	@FindBy(css = ".component-needs-validation.form-checkbox.form-group input")
	private WebElement  iagreeBtn;	
	@FindBy(css = ".c-social-links-container.content-item a:nth-child(1)")
	private WebElement  facebookBtn;	
	@FindBy(css = ".c-social-links-container.content-item a:nth-child(2)")
	private WebElement twitterBtn;	
	@FindBy(css =".c-social-links-container.content-item a:nth-child(3)")
	private WebElement instagramBtn;	
	@FindBy(css =".c-headline-container.content-item h1>span")
	private WebElement discountMsg;
		
	public ValentinesDaySalePage(WebDriver driver) {
		super(driver);		
	}
	public void donuts() {
		waiting(1000);
		click(donutsBtn);
	}
	public void email(String email) {
		waitForElementToBeVisible(emailFild);
		fillText(emailFild, email);
	}
	public void iagree() {
		waiting(1000);
		click(iagreeBtn);
	}
	public void socialmedia() {
		waiting(1000);
		click(facebookBtn);			
		waiting(1000);
		click(twitterBtn);
		waiting(1000);
		click(instagramBtn);
	}
	public String discountMsg() {
		waiting(1000);
		return getText(discountMsg);
	}
	
}
