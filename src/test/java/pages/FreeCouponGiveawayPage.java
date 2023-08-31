package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCouponGiveawayPage extends BasePage{
	@FindBy(css= ".c-answers-container.v-grid-1:nth-child(3) div:nth-child(2)>button")	
	private WebElement newesttechnologyBtn;
	@FindBy(css= ".c-rating-container.content-item div:nth-child(4) path")	
	private WebElement rateyourshoppingexperienceBtn;
	@FindBy(css= ".c-free-txt-answer-container.content-item.is-snappable div:nth-child(3)>textarea")	
	private WebElement notesforusFild;		
	@FindBy(css= ".component-needs-validation.form-personal-data div:nth-child(1) input")	
	private WebElement nameFild;	
	@FindBy(css= ".component-needs-validation.form-personal-data div:nth-child(2) input")	
	private WebElement lastnameFild;
	@FindBy(css= ".component-needs-validation.form-personal-data div:nth-child(3) input")	
	private WebElement emailFild;	
	@FindBy(css= ".component-needs-validation.form-checkbox.form-group:nth-child(1) input")	
	private WebElement SubscribeBtn;	
	@FindBy(css= ".c-headline-container.content-item h1>span")	
	private WebElement thankyouMsg;
	
	public FreeCouponGiveawayPage(WebDriver driver) {
		super(driver);
		
	}
	public void whatdoyouusuallybuyonline() {
		waiting(1000);
		click(newesttechnologyBtn);
	}
	public void rateyourshoppingexperience() {
		waitForElementToBeClickable(rateyourshoppingexperienceBtn);
		click(rateyourshoppingexperienceBtn);
	}
	public void  notesforus(String text) {
		waitForElementToBeVisible(notesforusFild);
		fillText(notesforusFild, text);
	}
	public void fiilform(String name,String lastname,String email) {
		waiting(1000);
		fillText(nameFild, name);
		waiting(1000);
		fillText(lastnameFild, lastname);
		waiting(1000);
		fillText(emailFild, email);
	}
	public void subscribetonewsletter() {
		waiting(1000);
		click(SubscribeBtn);
	}
	public String Msg() {
		waiting(1000);
		return getText(thankyouMsg);
	}
}
