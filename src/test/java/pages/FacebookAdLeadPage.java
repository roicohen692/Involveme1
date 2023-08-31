package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookAdLeadPage extends BasePage{
	@FindBy(css = ".component-needs-validation.form-personal-data input:nth-child(1)")
	private WebElement nameFild;	
	@FindBy(css = ".component-needs-validation.form-personal-data div:nth-child(2) input")
	private WebElement lastnameFild;
	@FindBy(css = ".component-needs-validation.form-personal-data div:nth-child(3) input")
	private WebElement eamilFild;
	@FindBy(css = ".component-needs-validation.form-checkbox.form-group:nth-child(1) input:nth-child(1)")
	private WebElement getweeklyindustryupdatesBtn;	
	@FindBy(css = ".c-headline-container.content-item h1>span")
	private WebElement welcomeonboardMsg;

	public FacebookAdLeadPage(WebDriver driver) {
		super(driver);
		
	}
	public void fiilform(String name, String lastname, String email) {
		waitForElementToBeVisible(nameFild);
		fillText(nameFild, name);
		waiting(1000);
		fillText(lastnameFild, lastname);
		waiting(1000);
		fillText(eamilFild, email);
					
	}
	public void getweeklyindustryupdates() {
		waiting(1000);
		click(getweeklyindustryupdatesBtn);
	}
	public String welcomeonboardMsg() {
		waiting(1000);
		return getText(welcomeonboardMsg);
	}
}
