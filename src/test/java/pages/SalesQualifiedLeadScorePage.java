package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesQualifiedLeadScorePage extends BasePage{
	@FindBy(css= ".component-needs-validation.form-personal-data label input")	
	private WebElement emailFild;
	@FindBy(css= ".rating-item:nth-child(4")	
	private WebElement salesfunnelBtn;
	@FindBy(css= ".rating-item:nth-child(2)")	
	private WebElement salesprocessBtn;
	@FindBy(css= ".rating-item:nth-child(5)")	
	private WebElement processisautomatedBtn;
	@FindBy(css= ".rating-item:nth-child(4)")	
	private WebElement definedandstandardizedBtn;
	@FindBy(css= ".rating-item:nth-child(6)")	
	private WebElement basedontheirneedsBtn;
	@FindBy(css= ".rating-item:nth-child(2)")	
	private WebElement objectivesBtn;
	@FindBy(css= ".rating-item:nth-child(3)")	
	private WebElement evaluationmeetingsBtn;
	@FindBy(css= ".rating-item:nth-child(6)")	
	private WebElement memberisonboardedBtn;
	@FindBy(css= ".c-headline-container.content-item h1 span")	
	private WebElement salesMsg;

	public SalesQualifiedLeadScorePage(WebDriver driver) {
		super(driver);
		
	}
	public void fillemail(String email) {
		waiting(1000);
		fillText(emailFild, email);
	}
	public void salesfunnel() {
		waiting(1000);
		click(salesfunnelBtn);
	}
	public void salesprocess() {
		waiting(1000);
		click(salesprocessBtn);
	}
	public void processisautomated() {
		waiting(1000);
		click(processisautomatedBtn);
	}
	public void definedandstandardized() {
		waiting(1000);
		click(definedandstandardizedBtn);
	}
	public void basedontheirneeds() {
		waiting(1000);
		click(basedontheirneedsBtn);
	}
	public void objectives() {
		waiting(1000);
		click(objectivesBtn);
	}
	public void evaluationmeetings() {
		waiting(1000);
		click(evaluationmeetingsBtn);
	}
	public void memberisonboarded() {
		waiting(1000);
		click( memberisonboardedBtn);
	}
	public String salesMsg() {
		waiting(1000);
		return getText(salesMsg);
	}
}
