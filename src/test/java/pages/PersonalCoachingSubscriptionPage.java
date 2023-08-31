package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalCoachingSubscriptionPage extends BasePage{
	@FindBy(css= ".component-needs-validation.form-personal-data div:nth-child(1) input")	
	private WebElement nameFild;
	@FindBy(css= ".component-needs-validation.form-personal-data div:nth-child(2) input")	
	private WebElement lastnameFild;
	@FindBy(css= ".component-needs-validation.form-personal-data div:nth-child(3) input")	
	private WebElement emailFild;
	@FindBy(css= ".c-checkbox-container.content-item.is-snappable:nth-child(3) input")	
	private WebElement subscribeBtn;
	
	@FindBy(css= ".content-item > div > div.e-subheadline > div > span")	
	private WebElement reachtheheightMsg;

	public PersonalCoachingSubscriptionPage(WebDriver driver) {
		super(driver);
		
	}
	public void fillform(String name,String lastname,String email) {
		waiting(1000);
		fillText(nameFild, name);
		waiting(1000);
		fillText(lastnameFild, lastname);
		waiting(1000);
		fillText(emailFild, email);	
	}
	public void subscribe() {
		waiting(1000);
		click(subscribeBtn);
	}
	public String reachtheheightMsg() {
		waitForElementToBeInVisible(reachtheheightMsg);
		return getText(reachtheheightMsg);
	}

}
