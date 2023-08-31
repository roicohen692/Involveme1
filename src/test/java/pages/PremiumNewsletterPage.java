package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PremiumNewsletterPage extends BasePage{
	@FindBy(css= ".component-needs-validation.form-personal-data div:nth-child(1) input ")	
	private WebElement nameFild;
	
	@FindBy(css= ".component-needs-validation.form-personal-data div:nth-child(2) input ")	
	private WebElement lastnameFild;
	
	@FindBy(css= ".component-needs-validation.form-personal-data div:nth-child(3) input ")	
	private WebElement emailFild;
	
	@FindBy(css= ".component-needs-validation.form-personal-data div:nth-child(4) input ")	
	private WebElement country;
	
	@FindBy(css= "#vs1__option-104")	
	private WebElement countryselect;
	
	@FindBy(css= ".component-needs-validation.form-checkbox.form-group input")	
	private WebElement IagreeBtn;
	
	@FindBy(css= ".c-answer.answer-behaviour.btn.btn-secondary.shadow-custom:nth-child(1) ")	
	private WebElement annuallyBtn;

	public PremiumNewsletterPage(WebDriver driver) {
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
	public void country() {
		waiting(1000);
		click(country);
	}
	public void israel() {
		waiting(1000);
		click(countryselect);
	}
	public void Iagree() {
		waiting(1000);
		click(IagreeBtn);
	}
	public void membershipcosts() {
		waiting(1000);
		click(annuallyBtn);
	}
}
